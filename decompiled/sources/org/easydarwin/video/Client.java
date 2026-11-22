package org.easydarwin.video;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashSet;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class Client implements Closeable {
    public static final int EASY_SDK_AUDIO_FRAME_FLAG = 2;
    public static final int EASY_SDK_EVENT_CODEC_ERROR = 1667592818;
    public static final int EASY_SDK_EVENT_CODEC_EXIT = 1702390132;
    public static final int EASY_SDK_EVENT_FRAME_FLAG = 4;
    public static final int EASY_SDK_MEDIA_INFO_FLAG = 32;
    public static final int EASY_SDK_RTP_FRAME_FLAG = 8;
    public static final int EASY_SDK_SDP_FRAME_FLAG = 16;
    public static final int EASY_SDK_SEI_FRAME_FLAG = 256;
    public static final int EASY_SDK_VIDEO_FRAME_FLAG = 1;
    public static final int TRANSTYPE_TCP = 1;
    public static final int TRANSTYPE_UDP = 2;
    private static Context mContext;
    private static final SparseArray<SourceCallBack> sCallbacks;
    private static int sKey;
    private int _channel;
    private int _mediaType;
    private String _pwd;
    private int _sendOption;
    private int _type;
    private String _url;
    private String _user;
    private long mCtx;
    private static final Handler h = new Handler(Looper.getMainLooper());
    private static Set<Integer> _channelPause = new HashSet();
    private static final String TAG = "Client";
    private volatile int paused = 0;
    private final Runnable closeTask = new Runnable() { // from class: org.easydarwin.video.Client.1
        @Override // java.lang.Runnable
        public void run() {
            if (Client.this.paused > 0) {
                Log.i(Client.TAG, "realPause! close stream");
                Client.this.closeStream();
                Client.this.paused = 2;
            }
        }
    };

    public static final class FrameInfo {
        public boolean audio;
        public float bitrate;
        public int bits_per_sample;
        public byte[] buffer;
        public int channels;
        public int codec;
        public byte fps;
        public short height;
        public int length;
        public float losspacket;
        public int offset = 0;
        public int reserved1;
        public int reserved2;
        public int sample_rate;
        public long stamp;
        public long timestamp_sec;
        public long timestamp_usec;
        public int type;
        public short width;
    }

    public interface SourceCallBack {
        void onEvent(int i, int i2, int i3);

        void onMediaInfoCallBack(int i, MediaInfo mediaInfo);

        void onSourceCallBack(int i, int i2, int i3, FrameInfo frameInfo);

        void sendSeiData(byte[] bArr);
    }

    private native void closeStream(long j);

    private native int deInit(long j);

    private static native int getErrorCode(long j);

    private native long init(Context context, String str);

    private native int openStream(long j, int i, String str, int i2, int i3, String str2, String str3, int i4, int i5, int i6);

    static {
        System.loadLibrary("EasyRTSPClient");
        sCallbacks = new SparseArray<>();
    }

    public static final class MediaInfo {
        int audioCodec;
        int bitPerSample;
        int channel;
        int fps;
        byte[] pps;
        int ppsLen;
        int sample;
        byte[] sps;
        int spsLen;
        int videoCodec;

        public String toString() {
            return "MediaInfo{videoCodec=" + this.videoCodec + ", fps=" + this.fps + ", audioCodec=" + this.audioCodec + ", sample=" + this.sample + ", channel=" + this.channel + ", bitPerSample=" + this.bitPerSample + ", spsLen=" + this.spsLen + ", ppsLen=" + this.ppsLen + AbstractJsonLexerKt.END_OBJ;
        }
    }

    Client(Context context) {
        context.getClass();
        this.mCtx = init(context, "");
        mContext = context.getApplicationContext();
    }

    int registerCallback(SourceCallBack sourceCallBack) {
        int i;
        SparseArray<SourceCallBack> sparseArray = sCallbacks;
        synchronized (sparseArray) {
            int i2 = sKey + 1;
            sKey = i2;
            sparseArray.put(i2, sourceCallBack);
            i = sKey;
        }
        return i;
    }

    void unrigisterCallback(SourceCallBack sourceCallBack) {
        SparseArray<SourceCallBack> sparseArray = sCallbacks;
        synchronized (sparseArray) {
            int indexOfValue = sparseArray.indexOfValue(sourceCallBack);
            if (indexOfValue != -1) {
                sparseArray.removeAt(indexOfValue);
            }
        }
    }

    public int getLastErrorCode() {
        return getErrorCode(this.mCtx);
    }

    public int openStream(int i, String str, int i2, int i3, int i4, String str2, String str3) {
        this._channel = i;
        this._url = str;
        this._type = i2;
        this._mediaType = i4;
        this._user = str2;
        this._pwd = str3;
        this._sendOption = i3;
        return openStream();
    }

    public void closeStream() {
        h.removeCallbacks(this.closeTask);
        long j = this.mCtx;
        if (j != 0) {
            closeStream(j);
        }
    }

    private int openStream() {
        String str = this._url;
        if (str == null) {
            throw null;
        }
        long j = this.mCtx;
        if (j == 0) {
            throw new IllegalStateException("初始化失败，KEY不合法");
        }
        return openStream(j, this._channel, str, this._type, this._mediaType, this._user, this._pwd, 1000, 0, this._sendOption);
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

    private static void onSourceCallBack(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        SourceCallBack sourceCallBack;
        boolean contains;
        SparseArray<SourceCallBack> sparseArray = sCallbacks;
        synchronized (sparseArray) {
            sourceCallBack = sparseArray.get(i);
        }
        if (i3 == 256) {
            sourceCallBack.sendSeiData(bArr);
            return;
        }
        if (i3 == 0) {
            if (sourceCallBack != null) {
                sourceCallBack.onSourceCallBack(i, i2, i3, null);
                return;
            }
            return;
        }
        if (i3 == 32) {
            if (sourceCallBack != null) {
                MediaInfo mediaInfo = new MediaInfo();
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                mediaInfo.videoCodec = wrap.getInt();
                mediaInfo.fps = wrap.getInt();
                mediaInfo.audioCodec = wrap.getInt();
                mediaInfo.sample = wrap.getInt();
                mediaInfo.channel = wrap.getInt();
                mediaInfo.bitPerSample = wrap.getInt();
                mediaInfo.spsLen = wrap.getInt();
                mediaInfo.ppsLen = wrap.getInt();
                mediaInfo.sps = new byte[128];
                mediaInfo.pps = new byte[36];
                wrap.get(mediaInfo.sps);
                wrap.get(mediaInfo.pps);
                sourceCallBack.onMediaInfoCallBack(i, mediaInfo);
                return;
            }
            return;
        }
        ByteBuffer wrap2 = ByteBuffer.wrap(bArr2);
        wrap2.order(ByteOrder.LITTLE_ENDIAN);
        FrameInfo frameInfo = new FrameInfo();
        frameInfo.codec = wrap2.getInt();
        frameInfo.type = wrap2.getInt();
        frameInfo.fps = wrap2.get();
        wrap2.get();
        frameInfo.width = wrap2.getShort();
        frameInfo.height = wrap2.getShort();
        wrap2.getInt();
        wrap2.getInt();
        wrap2.getShort();
        frameInfo.sample_rate = wrap2.getInt();
        frameInfo.channels = wrap2.getInt();
        frameInfo.bits_per_sample = wrap2.getInt();
        frameInfo.length = wrap2.getInt();
        frameInfo.timestamp_usec = wrap2.getInt();
        frameInfo.timestamp_sec = wrap2.getInt();
        int i4 = (frameInfo.timestamp_sec > 0L ? 1 : (frameInfo.timestamp_sec == 0L ? 0 : -1));
        long j = frameInfo.timestamp_sec;
        int i5 = (frameInfo.timestamp_usec > 0L ? 1 : (frameInfo.timestamp_usec == 0L ? 0 : -1));
        frameInfo.stamp = (j * 1000000) + frameInfo.timestamp_usec;
        frameInfo.buffer = bArr;
        synchronized (_channelPause) {
            contains = _channelPause.contains(Integer.valueOf(i));
        }
        if (sourceCallBack != null) {
            if (contains) {
                Log.i(TAG, "channel_" + i + " is paused!");
            }
            sourceCallBack.onSourceCallBack(i, i2, i3, frameInfo);
        }
    }

    private static void onEvent(int i, int i2, int i3) {
        Log.e(TAG, String.format("__RTSPClientCallBack onEvent: err=%d, state=%d", Integer.valueOf(i2), Integer.valueOf(i3)));
        SparseArray<SourceCallBack> sparseArray = sCallbacks;
        synchronized (sparseArray) {
            SourceCallBack sourceCallBack = sparseArray.get(i);
            if (sourceCallBack != null) {
                sourceCallBack.onEvent(i, i2, i3);
            }
        }
    }

    public void pause() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalThreadStateException("please call pause in Main thread!");
        }
        synchronized (_channelPause) {
            _channelPause.add(Integer.valueOf(this._channel));
        }
        this.paused = 1;
        Log.i(TAG, "pause:=1");
        h.postDelayed(this.closeTask, 10000L);
    }

    public void resume() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalThreadStateException("call resume in Main thread!");
        }
        synchronized (_channelPause) {
            _channelPause.remove(Integer.valueOf(this._channel));
        }
        h.removeCallbacks(this.closeTask);
        if (this.paused == 2) {
            Log.i(TAG, "resume:=0");
            openStream();
        }
        Log.i(TAG, "resume:=0");
        this.paused = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        h.removeCallbacks(this.closeTask);
        _channelPause.remove(Integer.valueOf(this._channel));
        long j = this.mCtx;
        if (j == 0) {
            throw new IOException("not opened or already closed");
        }
        deInit(j);
        this.mCtx = 0L;
    }
}
