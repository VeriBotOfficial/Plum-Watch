package org.easydarwin.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Bundle;
import android.os.Process;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.facebook.react.uimanager.ViewProps;
import com.wakeup.common.base.BaseCallback;
import com.wakeup.common.log.LogUtils;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.easydarwin.audio.EasyAACMuxer;
import org.easydarwin.sw.JNIUtil;
import org.easydarwin.util.CodecSpecificDataUtil;
import org.easydarwin.util.TextureLifecycler;
import org.easydarwin.video.Client;

/* loaded from: classes6.dex */
public class EasyPlayerClient implements Client.SourceCallBack {
    public static final int EASY_SDK_AUDIO_CODEC_AAC = 86018;
    public static final int EASY_SDK_AUDIO_CODEC_G711A = 65543;
    public static final int EASY_SDK_AUDIO_CODEC_G711U = 65542;
    public static final int EASY_SDK_AUDIO_CODEC_G726 = 69643;
    public static final int EASY_SDK_VIDEO_CODEC_H264 = 28;
    public static final int EASY_SDK_VIDEO_CODEC_H265 = 174;
    public static final int EASY_SDK_VIDEO_CODEC_MJPEG = 8;
    public static final int EASY_SDK_VIDEO_CODEC_MPEG4 = 13;
    public static final String EXTRA_VIDEO_HEIGHT = "extra-video-height";
    public static final String EXTRA_VIDEO_WIDTH = "extra-video-width";
    public static final String KEY_VIDEO_DECODE_TYPE = "video-decode-type";
    private static final long LEAST_FRAME_INTERVAL = 10000;
    private static final int NAL_PPS = 34;
    private static final int NAL_SPS = 33;
    private static final int NAL_VPS = 32;
    public static final int RESULT_EVENT = 4;
    public static final int RESULT_FRAME_RECVED = 9;
    public static final int RESULT_RECORD_BEGIN = 7;
    public static final int RESULT_RECORD_END = 8;
    public static final int RESULT_TIMEOUT = 3;
    public static final int RESULT_UNSUPPORTED_AUDIO = 6;
    public static final int RESULT_UNSUPPORTED_VIDEO = 5;
    public static final int RESULT_VIDEO_DISPLAYED = 1;
    public static final int RESULT_VIDEO_SIZE = 2;
    private static final String TAG = "EasyPlayerClient";
    private static boolean isScreenshotting = false;
    private final I420DataCallback i420callback;
    private final TextureLifecycler lifecycler;
    private boolean mAudioEnable;
    private volatile Thread mAudioThread;
    private AudioTrack mAudioTrack;
    private ByteBuffer mCSD0;
    private ByteBuffer mCSD1;
    private Client mClient;
    private final Context mContext;
    private short mHeight;
    private Client.MediaInfo mMediaInfo;
    private long mMuxerCuttingMillis;
    private boolean mMuxerWaitingKeyVideo;
    private volatile long mNewestStample;
    private boolean mNotSupportedAudioCB;
    private boolean mNotSupportedVideoCB;
    private EasyAACMuxer mObject;
    private BaseCallback<Integer> mPlayerStateCallback;
    private FrameInfoQueue mQueue;
    private final ResultReceiver mRR;
    private volatile long mReceivedDataLength;
    private String mRecordingPath;
    private int mRecordingStatus;
    private SEIDataCallback mSEIDataCallback;
    private Surface mSurface;
    private volatile Thread mThread;
    private boolean mTimeout;
    private boolean mWaitingKeyFrame;
    short mWidth;
    private EasyMuxer2 muxer2;
    private long muxerPausedMillis;

    public interface I420DataCallback {
        void onI420Data(ByteBuffer byteBuffer);
    }

    public interface SEIDataCallback {
        void onSEIData(byte[] bArr);
    }

    public boolean isRecording() {
        return !TextUtils.isEmpty(this.mRecordingPath);
    }

    private static class FrameInfoQueue extends PriorityQueue<Client.FrameInfo> {
        public static final int CAPACITY = 500;
        public static final int INITIAL_CAPACITY = 300;
        final ReentrantLock lock;
        final Condition notAudio;
        final Condition notFull;
        final Condition notVideo;

        public FrameInfoQueue() {
            super(300, new Comparator<Client.FrameInfo>() { // from class: org.easydarwin.video.EasyPlayerClient.FrameInfoQueue.1
                @Override // java.util.Comparator
                public int compare(Client.FrameInfo frameInfo, Client.FrameInfo frameInfo2) {
                    return (int) (frameInfo.stamp - frameInfo2.stamp);
                }
            });
            ReentrantLock reentrantLock = new ReentrantLock();
            this.lock = reentrantLock;
            this.notFull = reentrantLock.newCondition();
            this.notVideo = reentrantLock.newCondition();
            this.notAudio = reentrantLock.newCondition();
        }

        @Override // java.util.PriorityQueue, java.util.AbstractCollection, java.util.Collection
        public int size() {
            this.lock.lock();
            try {
                return super.size();
            } finally {
                this.lock.unlock();
            }
        }

        @Override // java.util.PriorityQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.lock.lock();
            try {
                super.clear();
                for (int size = super.size(); size > 0; size--) {
                    if (!this.lock.hasWaiters(this.notFull)) {
                        break;
                    }
                    this.notFull.signal();
                }
            } finally {
                this.lock.unlock();
            }
        }

        public void put(Client.FrameInfo frameInfo) throws InterruptedException {
            this.lock.lockInterruptibly();
            while (super.size() == 500) {
                try {
                    LogUtils.i(EasyPlayerClient.TAG, "queue full:500");
                    this.notFull.await();
                } finally {
                    this.lock.unlock();
                }
            }
            offer(frameInfo);
            if (frameInfo.audio) {
                this.notAudio.signal();
            } else {
                this.notVideo.signal();
            }
        }

        public Client.FrameInfo takeVideoFrame() throws InterruptedException {
            this.lock.lockInterruptibly();
            while (true) {
                try {
                    Client.FrameInfo peek = peek();
                    if (peek == null) {
                        this.notVideo.await();
                    } else {
                        if (!peek.audio) {
                            remove();
                            this.notFull.signal();
                            this.notAudio.signal();
                            return peek;
                        }
                        this.notVideo.await();
                    }
                } finally {
                    this.lock.unlock();
                }
            }
        }

        public Client.FrameInfo takeVideoFrame(long j) throws InterruptedException {
            this.lock.lockInterruptibly();
            while (true) {
                try {
                    Client.FrameInfo peek = peek();
                    if (peek == null) {
                        if (!this.notVideo.await(j, TimeUnit.MILLISECONDS)) {
                            this.lock.unlock();
                            return null;
                        }
                    } else {
                        if (!peek.audio) {
                            remove();
                            this.notFull.signal();
                            this.notAudio.signal();
                            return peek;
                        }
                        this.notVideo.await();
                    }
                } finally {
                    this.lock.unlock();
                }
            }
        }

        public Client.FrameInfo takeAudioFrame() throws InterruptedException {
            this.lock.lockInterruptibly();
            while (true) {
                try {
                    Client.FrameInfo peek = peek();
                    if (peek == null) {
                        this.notAudio.await();
                    } else {
                        if (peek.audio) {
                            remove();
                            this.notFull.signal();
                            this.notVideo.signal();
                            return peek;
                        }
                        this.notAudio.await();
                    }
                } finally {
                    this.lock.unlock();
                }
            }
        }
    }

    public EasyPlayerClient(Context context, Surface surface, ResultReceiver resultReceiver) {
        this(context, surface, resultReceiver, null);
    }

    public EasyPlayerClient(Context context, Surface surface, ResultReceiver resultReceiver, I420DataCallback i420DataCallback) {
        this.mAudioEnable = true;
        this.mHeight = (short) 0;
        this.mWidth = (short) 0;
        this.muxerPausedMillis = 0L;
        this.mMuxerCuttingMillis = 0L;
        this.mQueue = new FrameInfoQueue();
        this.mSurface = surface;
        this.mContext = context;
        this.mRR = resultReceiver;
        this.i420callback = i420DataCallback;
        this.lifecycler = null;
        this.mSEIDataCallback = null;
    }

    public EasyPlayerClient(Context context, Surface surface, ResultReceiver resultReceiver, I420DataCallback i420DataCallback, SEIDataCallback sEIDataCallback) {
        this.mAudioEnable = true;
        this.mHeight = (short) 0;
        this.mWidth = (short) 0;
        this.muxerPausedMillis = 0L;
        this.mMuxerCuttingMillis = 0L;
        this.mQueue = new FrameInfoQueue();
        this.mSurface = surface;
        this.mContext = context;
        this.mRR = resultReceiver;
        this.i420callback = i420DataCallback;
        this.lifecycler = null;
        this.mSEIDataCallback = sEIDataCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EasyPlayerClient(Context context, final TextureView textureView, ResultReceiver resultReceiver, I420DataCallback i420DataCallback, SEIDataCallback sEIDataCallback) {
        this.mAudioEnable = true;
        this.mHeight = (short) 0;
        this.mWidth = (short) 0;
        this.muxerPausedMillis = 0L;
        this.mMuxerCuttingMillis = 0L;
        this.mQueue = new FrameInfoQueue();
        TextureLifecycler textureLifecycler = new TextureLifecycler(textureView);
        this.lifecycler = textureLifecycler;
        this.mContext = context;
        this.mRR = resultReceiver;
        this.i420callback = i420DataCallback;
        this.mSEIDataCallback = sEIDataCallback;
        textureLifecycler.getLifecycle().addObserver(new LifecycleObserver() { // from class: org.easydarwin.video.EasyPlayerClient.1
            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public void destory() {
                EasyPlayerClient.this.stop();
                EasyPlayerClient.this.mSurface.release();
                EasyPlayerClient.this.mSurface = null;
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
            private void create() {
                EasyPlayerClient.this.mSurface = new Surface(textureView.getSurfaceTexture());
            }
        });
        if (context instanceof LifecycleOwner) {
            ((LifecycleOwner) context).getLifecycle().addObserver(new LifecycleObserver() { // from class: org.easydarwin.video.EasyPlayerClient.2
                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                public void destory() {
                    EasyPlayerClient.this.stop();
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
                private void pause() {
                    EasyPlayerClient.this.pause();
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
                private void resume() {
                    EasyPlayerClient.this.resume();
                }
            });
        }
    }

    public void play(final String str) {
        if (this.lifecycler.getLifecycle().getState().isAtLeast(Lifecycle.State.CREATED)) {
            start(str, 1, 1, 3, "", "", null);
        } else {
            this.lifecycler.getLifecycle().addObserver(new LifecycleObserver() { // from class: org.easydarwin.video.EasyPlayerClient.3
                @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
                void create() {
                    EasyPlayerClient.this.start(str, 1, 1, 3, "", "", null);
                }
            });
        }
    }

    public int start(String str, int i, int i2, int i3, String str2, String str3) {
        return start(str, i, i2, i3, str2, str3, null);
    }

    public int start(String str, int i, int i2, int i3, String str2, String str3, String str4) {
        if (str == null) {
            throw new NullPointerException("url is null");
        }
        int i4 = i == 0 ? 1 : i;
        this.mNewestStample = 0L;
        this.mWaitingKeyFrame = PreferenceManager.getDefaultSharedPreferences(this.mContext).getBoolean("waiting_i_frame", true);
        this.mHeight = (short) 0;
        this.mWidth = (short) 0;
        this.mQueue.clear();
        startCodec();
        startAudio();
        this.mTimeout = false;
        this.mNotSupportedAudioCB = false;
        this.mNotSupportedVideoCB = false;
        this.mReceivedDataLength = 0L;
        Client client = new Client(this.mContext);
        this.mClient = client;
        int registerCallback = client.registerCallback(this);
        this.mRecordingPath = str4;
        LogUtils.i(TAG, String.format("playing url:\n%s\n", str));
        BaseCallback<Integer> baseCallback = this.mPlayerStateCallback;
        if (baseCallback != null) {
            baseCallback.callback(0, 0);
        }
        return this.mClient.openStream(registerCallback, str, i4, i2, i3, str2, str3);
    }

    public boolean isAudioEnable() {
        return this.mAudioEnable;
    }

    public void setAudioEnable(boolean z) {
        this.mAudioEnable = z;
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            LogUtils.i(TAG, String.format("audio will be %s", z ? ViewProps.ENABLED : "disabled"));
            synchronized (audioTrack) {
                if (!z) {
                    audioTrack.pause();
                    audioTrack.flush();
                } else {
                    audioTrack.flush();
                    audioTrack.play();
                }
            }
        }
    }

    public void setPlayerStateCallback(BaseCallback<Integer> baseCallback) {
        this.mPlayerStateCallback = baseCallback;
    }

    public void pause() {
        this.mQueue.clear();
        Client client = this.mClient;
        if (client != null) {
            client.pause();
        }
        this.mQueue.clear();
    }

    public void resume() {
        Client client = this.mClient;
        if (client != null) {
            client.resume();
        }
    }

    public void stop() {
        Thread thread = this.mThread;
        this.mThread = null;
        if (thread != null) {
            thread.interrupt();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Thread thread2 = this.mAudioThread;
        this.mAudioThread = null;
        if (thread2 != null) {
            thread2.interrupt();
            try {
                thread2.join();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
        stopRecord();
        this.mQueue.clear();
        Client client = this.mClient;
        if (client != null) {
            client.unrigisterCallback(this);
            this.mClient.closeStream();
            try {
                this.mClient.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
        this.mQueue.clear();
        this.mClient = null;
        this.mNewestStample = 0L;
    }

    public long receivedDataLength() {
        return this.mReceivedDataLength;
    }

    private void startAudio() {
        this.mAudioThread = new Thread("AUDIO_CONSUMER") { // from class: org.easydarwin.video.EasyPlayerClient.4
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(-16);
                while (EasyPlayerClient.this.mAudioThread != null) {
                    try {
                        EasyPlayerClient.this.mQueue.takeAudioFrame();
                    } catch (InterruptedException unused) {
                        return;
                    }
                }
            }
        };
        this.mAudioThread.start();
    }

    private void startAudio_disabled() {
        this.mAudioThread = new Thread("AUDIO_CONSUMER") { // from class: org.easydarwin.video.EasyPlayerClient.5
            /* JADX WARN: Removed duplicated region for block: B:64:0x00c7  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x00d2  */
            @Override // java.lang.Thread, java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 225
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: org.easydarwin.video.EasyPlayerClient.AnonymousClass5.run():void");
            }
        };
        this.mAudioThread.start();
    }

    private static void save2path(byte[] bArr, int i, int i2, String str, boolean z) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(str, z);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (FileNotFoundException e) {
                e = e;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        try {
            fileOutputStream.write(bArr, i, i2);
            fileOutputStream.close();
        } catch (FileNotFoundException e4) {
            e = e4;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
        } catch (IOException e5) {
            e = e5;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            throw th;
        }
    }

    private static int getXPS(byte[] bArr, int i, int i2, byte[] bArr2, int[] iArr, int i3) {
        int i4;
        int min = Math.min(i2, bArr.length);
        while (true) {
            i4 = min - 4;
            if (i >= i4) {
                i = -1;
                break;
            }
            if (bArr[i] == 0 && bArr[i + 1] == 0 && 1 == bArr[i + 2] && i3 == (bArr[i + 3] & 15)) {
                break;
            }
            i++;
        }
        if (-1 == i) {
            return -1;
        }
        if (i > 0) {
            int i5 = i - 1;
            if (bArr[i5] == 0) {
                i = i5;
            }
        }
        int i6 = i + 4;
        while (true) {
            if (i6 >= i4) {
                i6 = -1;
                break;
            }
            if (bArr[i6] == 0 && bArr[i6 + 1] == 0 && 1 == bArr[i6 + 2]) {
                break;
            }
            i6++;
        }
        if (-1 == i6 || i6 == 0) {
            return -2;
        }
        if (bArr[i6 - 1] == 0) {
            i6--;
        }
        int i7 = i6 - i;
        if (i7 > iArr[0]) {
            return -3;
        }
        bArr2[0] = 0;
        System.arraycopy(bArr, i, bArr2, 0, i7);
        iArr[0] = i7;
        return i6;
    }

    private static byte[] getvps_sps_pps(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, bArr.length);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        while (true) {
            if (i3 == -1) {
                int i6 = i;
                while (true) {
                    if (i6 >= min - 4) {
                        break;
                    }
                    if (bArr[i6] == 0 && bArr[i6 + 1] == 0 && 1 == bArr[i6 + 2] && ((bArr[i6 + 3] >> 1) & 63) == 32) {
                        i3 = i6 - 1;
                        if (bArr[i3] != 0) {
                            i3 = i6;
                        }
                    } else {
                        i6++;
                    }
                }
            }
            if (i4 == -1) {
                int i7 = i3;
                while (true) {
                    if (i7 >= min - 4) {
                        break;
                    }
                    if (bArr[i7] == 0 && bArr[i7 + 1] == 0 && 1 == bArr[i7 + 2] && ((bArr[i7 + 3] >> 1) & 63) == 33) {
                        i4 = i7 - 1;
                        if (bArr[i4] != 0) {
                            i4 = i7;
                        }
                    } else {
                        i7++;
                    }
                }
            }
            if (i5 == -1) {
                int i8 = i4;
                while (true) {
                    if (i8 >= min - 4) {
                        break;
                    }
                    if (bArr[i8] == 0 && bArr[i8 + 1] == 0 && 1 == bArr[i8 + 2] && ((bArr[i8 + 3] >> 1) & 63) == 34) {
                        i5 = i8 - 1;
                        if (bArr[i5] != 0) {
                            i5 = i8;
                        }
                    } else {
                        i8++;
                    }
                }
            }
            if (i3 != -1 && i4 != -1 && i5 != -1) {
                break;
            }
        }
        if (i3 == -1 || i4 == -1 || i5 == -1) {
            return null;
        }
        int i9 = i5 + 4;
        while (true) {
            if (i9 >= min - 4) {
                i9 = -1;
                break;
            }
            if (bArr[i9] == 0 && bArr[i9 + 1] == 0 && 1 == bArr[i9 + 2]) {
                int i10 = i9 - 1;
                if (bArr[i10] == 0) {
                    i9 = i10;
                }
            } else {
                i9++;
            }
        }
        if (i9 == -1 || i9 < i3) {
            return null;
        }
        int i11 = i9 - i3;
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i3, bArr2, 0, i11);
        return bArr2;
    }

    private static boolean codecMatch(String str, MediaCodecInfo mediaCodecInfo) {
        for (String str2 : mediaCodecInfo.getSupportedTypes()) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    private static String codecName() {
        ArrayList arrayList = new ArrayList();
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder() && codecMatch("video/avc", codecInfoAt)) {
                String name = codecInfoAt.getName();
                LogUtils.d("DECODER", String.format("decoder:%s", name));
                arrayList.add(name);
            }
        }
        if (arrayList.isEmpty()) {
            return "";
        }
        return (String) arrayList.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaCodecInfo selectCodec(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }

    private void startCodec() {
        this.mThread = new Thread("VIDEO_CONSUMER") { // from class: org.easydarwin.video.EasyPlayerClient.6
            /* JADX WARN: Code restructure failed: missing block: B:350:0x0363, code lost:
            
                if (r0 == null) goto L179;
             */
            /* JADX WARN: Code restructure failed: missing block: B:351:0x0460, code lost:
            
                r41 = r14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:352:0x0462, code lost:
            
                r12 = r18;
                r13 = r19;
                r15 = r27;
                r18 = r41;
                r19 = r10;
                r10 = r17;
                r27 = r20;
                r20 = r7;
                r17 = r8;
                r7 = r30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:354:0x0365, code lost:
            
                r32 = android.os.SystemClock.elapsedRealtime();
                r9 = r14.decodeFrameYUV(r0, new int[2]);
             */
            /* JADX WARN: Code restructure failed: missing block: B:355:0x0375, code lost:
            
                if (r51.this$0.i420callback == null) goto L142;
             */
            /* JADX WARN: Code restructure failed: missing block: B:356:0x0377, code lost:
            
                if (r9 == null) goto L142;
             */
            /* JADX WARN: Code restructure failed: missing block: B:358:0x0379, code lost:
            
                r51.this$0.i420callback.onI420Data(r9);
             */
            /* JADX WARN: Code restructure failed: missing block: B:360:0x039b, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:361:0x039c, code lost:
            
                r9 = r8;
                r41 = r14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:362:0x0395, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:363:0x0396, code lost:
            
                r9 = r8;
                r41 = r14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:364:0x0382, code lost:
            
                if (r9 == null) goto L149;
             */
            /* JADX WARN: Code restructure failed: missing block: B:365:0x0384, code lost:
            
                r14.releaseBuffer(r9);
                com.wakeup.common.log.LogUtils.i(org.easydarwin.video.EasyPlayerClient.TAG, "AAAA 1022 releaseBuffer ");
             */
            /* JADX WARN: Code restructure failed: missing block: B:366:0x03a1, code lost:
            
                r34 = android.os.SystemClock.elapsedRealtime() - r32;
                r9 = (r21 > 0 ? 1 : (r21 == 0 ? 0 : -1));
             */
            /* JADX WARN: Code restructure failed: missing block: B:367:0x03a9, code lost:
            
                if (r9 != 0) goto L156;
             */
            /* JADX WARN: Code restructure failed: missing block: B:369:0x03af, code lost:
            
                r28 = r9;
                r41 = r14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:371:0x03b4, code lost:
            
                com.wakeup.common.log.LogUtils.i(org.easydarwin.video.EasyPlayerClient.TAG, java.lang.String.format("POST VIDEO_DISPLAYED!!!", new java.lang.Object[0]));
                r9 = r51.this$0.mRR;
             */
            /* JADX WARN: Code restructure failed: missing block: B:372:0x03c7, code lost:
            
                if (r9 == null) goto L157;
             */
            /* JADX WARN: Code restructure failed: missing block: B:373:0x03c9, code lost:
            
                r12 = new android.os.Bundle();
                r12.putInt(org.easydarwin.video.EasyPlayerClient.KEY_VIDEO_DECODE_TYPE, 0);
                r9.send(1, r12);
             */
            /* JADX WARN: Code restructure failed: missing block: B:374:0x03dd, code lost:
            
                if (r28 == 0) goto L167;
             */
            /* JADX WARN: Code restructure failed: missing block: B:375:0x03df, code lost:
            
                r14 = (r0.stamp - r21) - (r34 * 1000);
             */
            /* JADX WARN: Code restructure failed: missing block: B:376:0x03eb, code lost:
            
                if (r14 <= androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) goto L161;
             */
            /* JADX WARN: Code restructure failed: missing block: B:377:0x03ed, code lost:
            
                com.wakeup.common.log.LogUtils.w(org.easydarwin.video.EasyPlayerClient.TAG, "sleep time.too long:" + r14);
                r14 = 100000;
             */
            /* JADX WARN: Code restructure failed: missing block: B:379:0x040d, code lost:
            
                if (r14 <= 0) goto L167;
             */
            /* JADX WARN: Code restructure failed: missing block: B:380:0x040f, code lost:
            
                r32 = r14 % androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
                r34 = r51.this$0.mNewestStample - r0.stamp;
                r12 = org.easydarwin.video.EasyPlayerClient.fixSleepTime(r32, r34, com.unity3d.services.core.di.ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT);
             */
            /* JADX WARN: Code restructure failed: missing block: B:381:0x0426, code lost:
            
                if (r12 <= 0) goto L166;
             */
            /* JADX WARN: Code restructure failed: missing block: B:382:0x0428, code lost:
            
                java.lang.Thread.sleep(r12 / 1000);
             */
            /* JADX WARN: Code restructure failed: missing block: B:383:0x042d, code lost:
            
                com.wakeup.common.log.LogUtils.d(org.easydarwin.video.EasyPlayerClient.TAG, "cache:" + r34);
             */
            /* JADX WARN: Code restructure failed: missing block: B:385:0x044d, code lost:
            
                r21 = r0.stamp;
             */
            /* JADX WARN: Code restructure failed: missing block: B:387:0x0452, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:388:0x045d, code lost:
            
                r9 = r8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:389:0x0450, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:390:0x0457, code lost:
            
                r9 = r8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:391:0x03d9, code lost:
            
                r28 = r9;
                r41 = r14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:393:0x045a, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:394:0x045b, code lost:
            
                r41 = r14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:395:0x0454, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:396:0x0455, code lost:
            
                r41 = r14;
             */
            /* JADX WARN: Removed duplicated region for block: B:111:0x0524  */
            /* JADX WARN: Removed duplicated region for block: B:160:0x07a2  */
            /* JADX WARN: Removed duplicated region for block: B:169:0x07c1 A[ADDED_TO_REGION, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:181:0x080e A[Catch: all -> 0x0861, Exception -> 0x0864, TRY_LEAVE, TryCatch #46 {Exception -> 0x0864, all -> 0x0861, blocks: (B:179:0x07f0, B:181:0x080e, B:272:0x0735, B:274:0x073b, B:277:0x0743, B:281:0x0754, B:283:0x075a, B:313:0x0791), top: B:178:0x07f0 }] */
            /* JADX WARN: Removed duplicated region for block: B:183:0x0813 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:191:0x08c5  */
            /* JADX WARN: Removed duplicated region for block: B:193:0x08ca  */
            /* JADX WARN: Removed duplicated region for block: B:195:0x08da  */
            /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:201:0x08ec  */
            /* JADX WARN: Removed duplicated region for block: B:203:0x08f1  */
            /* JADX WARN: Removed duplicated region for block: B:205:0x0901  */
            /* JADX WARN: Removed duplicated region for block: B:212:0x083d  */
            /* JADX WARN: Removed duplicated region for block: B:215:0x0840  */
            /* JADX WARN: Removed duplicated region for block: B:283:0x075a A[Catch: IllegalStateException -> 0x0769, all -> 0x0861, Exception -> 0x0864, TRY_LEAVE, TryCatch #42 {IllegalStateException -> 0x0769, blocks: (B:281:0x0754, B:283:0x075a), top: B:280:0x0754 }] */
            /* JADX WARN: Removed duplicated region for block: B:285:0x0763  */
            /* JADX WARN: Removed duplicated region for block: B:312:0x0780  */
            /* JADX WARN: Removed duplicated region for block: B:349:0x0363 A[EDGE_INSN: B:349:0x0363->B:350:0x0363 BREAK  A[LOOP:1: B:89:0x0355->B:214:0x0844], SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:412:0x0347 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:418:0x0248 A[Catch: all -> 0x0867, Exception -> 0x0869, TRY_ENTER, TRY_LEAVE, TryCatch #53 {Exception -> 0x0869, all -> 0x0867, blocks: (B:74:0x02d1, B:77:0x030b, B:79:0x030f, B:81:0x0313, B:83:0x0317, B:397:0x031b, B:400:0x0326, B:86:0x0339, B:418:0x0248, B:467:0x02bf), top: B:73:0x02d1 }] */
            /* JADX WARN: Removed duplicated region for block: B:423:0x0299  */
            /* JADX WARN: Removed duplicated region for block: B:426:0x029b  */
            /* JADX WARN: Removed duplicated region for block: B:432:0x024d A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:73:0x02d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:91:0x047a  */
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // java.lang.Thread, java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 2320
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: org.easydarwin.video.EasyPlayerClient.AnonymousClass6.run():void");
            }
        };
        this.mThread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long fixSleepTime(long j, long j2, long j3) {
        if (j2 < 0) {
            LogUtils.w(TAG, String.format("totalTimestampDifferUs is:%d, this should not be happen.", Long.valueOf(j2)));
            j2 = 0;
        }
        double exp = (j * Math.exp((j3 - j2) / 1000000.0d)) + 0.5d;
        LogUtils.i(TAG, String.format("%d,%d,%d->%d", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf((int) exp)));
        return (long) exp;
    }

    public synchronized void startRecord(String str) {
        if (this.mMediaInfo != null && this.mWidth != 0 && this.mHeight != 0 && this.mCSD0 != null) {
            this.mRecordingPath = str;
            EasyMuxer2 easyMuxer2 = new EasyMuxer2();
            this.mMuxerCuttingMillis = 0L;
            this.mRecordingStatus = 0;
            this.muxerPausedMillis = 0L;
            ByteBuffer byteBuffer = this.mCSD1;
            if (byteBuffer == null) {
                byteBuffer = ByteBuffer.allocate(0);
            }
            byte[] bArr = new byte[this.mCSD0.capacity() + byteBuffer.capacity()];
            this.mCSD0.clear();
            byteBuffer.clear();
            ByteBuffer byteBuffer2 = this.mCSD0;
            byteBuffer2.get(bArr, 0, byteBuffer2.capacity());
            byteBuffer.get(bArr, this.mCSD0.capacity(), byteBuffer.capacity());
            int create = easyMuxer2.create(str, this.mMediaInfo.videoCodec == 174 ? 1 : 0, this.mWidth, this.mHeight, bArr, this.mMediaInfo.sample, this.mMediaInfo.channel);
            if (create != 0) {
                LogUtils.w(TAG, "create muxer2:" + create);
                return;
            }
            this.mMuxerWaitingKeyVideo = true;
            this.muxer2 = easyMuxer2;
            ResultReceiver resultReceiver = this.mRR;
            if (resultReceiver != null) {
                resultReceiver.send(7, null);
            }
        }
    }

    public synchronized void pauseRecord() {
        if (this.mRecordingStatus != -1) {
            this.mRecordingStatus = -1;
            this.muxerPausedMillis = SystemClock.elapsedRealtime();
        }
    }

    public synchronized void resumeRecord() {
        if (this.mRecordingStatus == -1) {
            this.mMuxerWaitingKeyVideo = true;
            this.mRecordingStatus = 1;
        }
    }

    private static int getSampleIndex(int i) {
        for (int i2 = 0; i2 < CodecSpecificDataUtil.AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE.length; i2++) {
            if (i == CodecSpecificDataUtil.AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE[i2]) {
                return i2;
            }
        }
        return -1;
    }

    private void pumpAACSample(Client.FrameInfo frameInfo) {
        EasyAACMuxer easyAACMuxer = this.mObject;
        if (easyAACMuxer == null) {
            return;
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.offset = frameInfo.offset;
        bufferInfo.size = frameInfo.length;
        ByteBuffer wrap = ByteBuffer.wrap(frameInfo.buffer, bufferInfo.offset, bufferInfo.size);
        bufferInfo.presentationTimeUs = frameInfo.stamp;
        try {
            if (!frameInfo.audio) {
                throw new IllegalArgumentException("frame should be audio!");
            }
            if (frameInfo.codec != 86018) {
                throw new IllegalArgumentException("audio codec should be aac!");
            }
            bufferInfo.offset += 7;
            bufferInfo.size -= 7;
            easyAACMuxer.pumpStream(wrap, bufferInfo, false);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void pumpPCMSample(byte[] bArr, int i, long j) {
        EasyMuxer2 easyMuxer2 = this.muxer2;
        if (easyMuxer2 == null) {
            return;
        }
        if (this.mRecordingStatus < 0) {
            return;
        }
        if (this.mMuxerWaitingKeyVideo) {
            LogUtils.i(TAG, "writeFrame ignore due to no key frame!");
        } else {
            LogUtils.i(TAG, "writeFrame audio ret:" + easyMuxer2.writeFrame(1, bArr, 0, i, Math.max(0L, (j / 1000) - this.mMuxerCuttingMillis)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void pumpVideoSample(Client.FrameInfo frameInfo) {
        EasyMuxer2 easyMuxer2 = this.muxer2;
        if (easyMuxer2 == null) {
            return;
        }
        if (this.mRecordingStatus < 0) {
            return;
        }
        if (this.mMuxerWaitingKeyVideo && frameInfo.type == 1) {
            this.mMuxerWaitingKeyVideo = false;
            if (this.mRecordingStatus == 1) {
                this.mMuxerCuttingMillis += SystemClock.elapsedRealtime() - this.muxerPausedMillis;
                this.mRecordingStatus = 0;
            }
        }
        if (this.mMuxerWaitingKeyVideo) {
            LogUtils.i(TAG, "writeFrame ignore due to no key frame!");
            return;
        }
        int i = frameInfo.type;
        LogUtils.i(TAG, "writeFrame video ret:" + easyMuxer2.writeFrame(0, frameInfo.buffer, frameInfo.offset, frameInfo.length, Math.max(0L, (frameInfo.stamp / 1000) - this.mMuxerCuttingMillis)));
    }

    public synchronized void stopRecord() {
        this.mRecordingPath = null;
        this.mMuxerCuttingMillis = 0L;
        this.mRecordingStatus = 0;
        this.muxerPausedMillis = 0L;
        EasyMuxer2 easyMuxer2 = this.muxer2;
        if (easyMuxer2 == null) {
            return;
        }
        this.muxer2 = null;
        easyMuxer2.close();
        this.mObject = null;
        ResultReceiver resultReceiver = this.mRR;
        if (resultReceiver != null) {
            resultReceiver.send(8, null);
        }
    }

    @Override // org.easydarwin.video.Client.SourceCallBack
    public void onSourceCallBack(int i, int i2, int i3, Client.FrameInfo frameInfo) {
        try {
            onRTSPSourceCallBack1(i, i2, i3, frameInfo);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onRTSPSourceCallBack1(int i, int i2, int i3, Client.FrameInfo frameInfo) {
        Thread.currentThread().setName("PRODUCER_THREAD");
        if (frameInfo != null) {
            this.mReceivedDataLength += frameInfo.length;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 0) {
                    if (this.mTimeout) {
                        return;
                    }
                    this.mTimeout = true;
                    ResultReceiver resultReceiver = this.mRR;
                    if (resultReceiver != null) {
                        resultReceiver.send(3, null);
                        return;
                    }
                    return;
                }
                if (i3 == 4) {
                    ResultReceiver resultReceiver2 = this.mRR;
                    new Bundle().putString("event-msg", new String(frameInfo.buffer));
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(4, null);
                        return;
                    }
                    return;
                }
                return;
            }
            this.mNewestStample = frameInfo.stamp;
            frameInfo.audio = true;
            if (frameInfo.codec != 86018 && frameInfo.codec != 65543 && frameInfo.codec != 65542 && frameInfo.codec != 69643) {
                ResultReceiver resultReceiver3 = this.mRR;
                if (this.mNotSupportedAudioCB || resultReceiver3 == null) {
                    return;
                }
                this.mNotSupportedAudioCB = true;
                if (resultReceiver3 != null) {
                    resultReceiver3.send(6, null);
                    return;
                }
                return;
            }
            LogUtils.d(TAG, String.format("queue size :%d", Integer.valueOf(this.mQueue.size())));
            try {
                this.mQueue.put(frameInfo);
                return;
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }
        if (frameInfo.codec != 28 && frameInfo.codec != 174) {
            ResultReceiver resultReceiver4 = this.mRR;
            if (this.mNotSupportedVideoCB || resultReceiver4 == null) {
                return;
            }
            this.mNotSupportedVideoCB = true;
            resultReceiver4.send(5, null);
            return;
        }
        if (frameInfo.width == 0 || frameInfo.height == 0) {
            return;
        }
        if (frameInfo.length >= 4 && frameInfo.buffer[0] == 0 && frameInfo.buffer[1] == 0 && frameInfo.buffer[2] == 0 && frameInfo.buffer[3] == 1 && frameInfo.length >= 8 && frameInfo.buffer[4] == 0 && frameInfo.buffer[5] == 0 && frameInfo.buffer[6] == 0 && frameInfo.buffer[7] == 1) {
            frameInfo.offset += 4;
            frameInfo.length -= 4;
        }
        if (frameInfo.type == 1) {
            LogUtils.i(TAG, String.format("recv I frame", new Object[0]));
            BaseCallback<Integer> baseCallback = this.mPlayerStateCallback;
            if (baseCallback != null) {
                baseCallback.callback(0, 1);
            }
        }
        this.mNewestStample = frameInfo.stamp;
        frameInfo.audio = false;
        if (this.mWaitingKeyFrame) {
            ResultReceiver resultReceiver5 = this.mRR;
            Bundle bundle = new Bundle();
            bundle.putInt(EXTRA_VIDEO_WIDTH, frameInfo.width);
            bundle.putInt(EXTRA_VIDEO_HEIGHT, frameInfo.height);
            this.mWidth = frameInfo.width;
            this.mHeight = frameInfo.height;
            String str = TAG;
            LogUtils.i(str, String.format("RESULT_VIDEO_SIZE:%d*%d", Short.valueOf(frameInfo.width), Short.valueOf(frameInfo.height)));
            if (resultReceiver5 != null) {
                resultReceiver5.send(2, bundle);
            }
            LogUtils.i(str, String.format("width:%d,height:%d", Short.valueOf(this.mWidth), Short.valueOf(this.mHeight)));
            if (frameInfo.codec == 28) {
                byte[] bArr = new byte[128];
                int[] iArr = {128};
                if (getXPS(frameInfo.buffer, 0, 256, bArr, iArr, 7) >= 0) {
                    ByteBuffer allocate = ByteBuffer.allocate(iArr[0]);
                    allocate.put(bArr, 0, iArr[0]);
                    allocate.clear();
                    this.mCSD0 = allocate;
                    LogUtils.i(str, String.format("CSD-0 searched", new Object[0]));
                }
                iArr[0] = 128;
                if (getXPS(frameInfo.buffer, 0, 256, bArr, iArr, 8) >= 0) {
                    ByteBuffer allocate2 = ByteBuffer.allocate(iArr[0]);
                    allocate2.put(bArr, 0, iArr[0]);
                    allocate2.clear();
                    this.mCSD1 = allocate2;
                    LogUtils.i(str, String.format("CSD-1 searched", new Object[0]));
                }
            } else {
                byte[] bArr2 = getvps_sps_pps(frameInfo.buffer, 0, 256);
                if (bArr2 != null) {
                    this.mCSD0 = ByteBuffer.wrap(bArr2);
                }
            }
            if (frameInfo.type != 1) {
                LogUtils.w(str, String.format("discard p frame.", new Object[0]));
                return;
            }
            this.mWaitingKeyFrame = false;
            synchronized (this) {
                if (!TextUtils.isEmpty(this.mRecordingPath) && this.mObject == null) {
                    startRecord(this.mRecordingPath);
                }
            }
        } else {
            short s = frameInfo.width;
            short s2 = frameInfo.height;
            if (s != 0 && s2 != 0 && (s != this.mWidth || s2 != this.mHeight)) {
                ResultReceiver resultReceiver6 = this.mRR;
                Bundle bundle2 = new Bundle();
                bundle2.putInt(EXTRA_VIDEO_WIDTH, frameInfo.width);
                bundle2.putInt(EXTRA_VIDEO_HEIGHT, frameInfo.height);
                this.mWidth = frameInfo.width;
                this.mHeight = frameInfo.height;
                LogUtils.i(TAG, String.format("RESULT_VIDEO_SIZE:%d*%d", Short.valueOf(frameInfo.width), Short.valueOf(frameInfo.height)));
                if (resultReceiver6 != null) {
                    resultReceiver6.send(2, bundle2);
                }
            }
        }
        try {
            this.mQueue.put(frameInfo);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    @Override // org.easydarwin.video.Client.SourceCallBack
    public void onMediaInfoCallBack(int i, Client.MediaInfo mediaInfo) {
        this.mMediaInfo = mediaInfo;
        LogUtils.i(TAG, String.format("MediaInfo fetchd\n%s", mediaInfo));
        BaseCallback<Integer> baseCallback = this.mPlayerStateCallback;
        if (baseCallback != null) {
            baseCallback.callback(0, 1);
        }
    }

    @Override // org.easydarwin.video.Client.SourceCallBack
    public void onEvent(int i, int i2, int i3) {
        ResultReceiver resultReceiver = this.mRR;
        Bundle bundle = new Bundle();
        if (i3 == 1) {
            bundle.putString("event-msg", "连接中...");
            BaseCallback<Integer> baseCallback = this.mPlayerStateCallback;
            if (baseCallback != null) {
                baseCallback.callback(0, 2);
            }
        } else if (i3 == 2) {
            bundle.putInt("errorcode", i2);
            bundle.putString("event-msg", String.format("错误：%d", Integer.valueOf(i2)));
            BaseCallback<Integer> baseCallback2 = this.mPlayerStateCallback;
            if (baseCallback2 != null) {
                baseCallback2.callback(0, -1);
            }
        } else if (i3 == 3) {
            bundle.putInt("errorcode", i2);
            bundle.putString("event-msg", String.format("线程退出。%d", Integer.valueOf(i2)));
            BaseCallback<Integer> baseCallback3 = this.mPlayerStateCallback;
            if (baseCallback3 != null) {
                baseCallback3.callback(0, -2);
            }
        }
        if (resultReceiver != null) {
            resultReceiver.send(4, bundle);
        }
    }

    @Override // org.easydarwin.video.Client.SourceCallBack
    public void sendSeiData(byte[] bArr) {
        SEIDataCallback sEIDataCallback = this.mSEIDataCallback;
        if (sEIDataCallback == null) {
            return;
        }
        sEIDataCallback.onSEIData(bArr);
    }

    private static void yuvRotate(byte[] bArr, int i, int i2, int i3, int i4) {
        if (i != 0) {
            if (i == 1) {
                JNIUtil.rotateMatrix(bArr, 0, i2, i3, i4);
                JNIUtil.rotateShortMatrix(bArr, i2 * i3, i2 / 2, i3 / 2, i4);
                return;
            }
            return;
        }
        JNIUtil.rotateMatrix(bArr, 0, i2, i3, i4);
        int i5 = i2 * i3;
        int i6 = i2 / 2;
        int i7 = i3 / 2;
        JNIUtil.rotateMatrix(bArr, i5, i6, i7, i4);
        JNIUtil.rotateMatrix(bArr, i5 + (i5 / 4), i6, i7, i4);
    }

    public static void captureScreenshot(TextureView textureView, BaseCallback<Bitmap> baseCallback) {
        if (isScreenshotting) {
            LogUtils.w(TAG, "Screenshot is in progress, please wait");
            baseCallback.callback(-1, null);
            return;
        }
        if (!textureView.isAvailable()) {
            LogUtils.e(TAG, "TextureView is not available");
            baseCallback.callback(-1, null);
            return;
        }
        isScreenshotting = true;
        try {
            Bitmap bitmap = textureView.getBitmap();
            if (bitmap == null) {
                LogUtils.e(TAG, "Failed to capture bitmap from TextureView");
                baseCallback.callback(-1, null);
                isScreenshotting = false;
            } else {
                LogUtils.i(TAG, "Screenshot captured: " + bitmap.getWidth() + "x" + bitmap.getHeight());
                baseCallback.callback(0, bitmap);
                isScreenshotting = false;
            }
        } catch (Exception e) {
            LogUtils.e(TAG, "Screenshot error", e);
            baseCallback.callback(-1, null);
            isScreenshotting = false;
        }
    }

    public static Bitmap captureScreenshot(TextureView textureView) {
        if (isScreenshotting) {
            LogUtils.w(TAG, "Screenshot is in progress, please wait");
            return null;
        }
        if (!textureView.isAvailable()) {
            LogUtils.e(TAG, "TextureView is not available");
            return null;
        }
        isScreenshotting = true;
        try {
            Bitmap bitmap = textureView.getBitmap();
            if (bitmap == null) {
                LogUtils.e(TAG, "Failed to capture bitmap from TextureView");
                isScreenshotting = false;
                return null;
            }
            LogUtils.i(TAG, "Screenshot captured: " + bitmap.getWidth() + "x" + bitmap.getHeight());
            isScreenshotting = false;
            return bitmap;
        } catch (Exception e) {
            LogUtils.e(TAG, "Screenshot error", e);
            isScreenshotting = false;
            return null;
        }
    }
}
