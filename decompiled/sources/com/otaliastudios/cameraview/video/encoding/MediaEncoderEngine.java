package com.otaliastudios.cameraview.video.encoding;

import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.internal.WorkerHandler;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;

/* loaded from: classes17.dex */
public class MediaEncoderEngine {
    private static final boolean DEBUG_PERFORMANCE = true;
    public static final int END_BY_MAX_DURATION = 1;
    public static final int END_BY_MAX_SIZE = 2;
    public static final int END_BY_USER = 0;
    private final Controller mController;
    private final Object mControllerLock;
    private final WorkerHandler mControllerThread;
    private final List<MediaEncoder> mEncoders;
    private int mEndReason;
    private Listener mListener;
    private MediaMuxer mMediaMuxer;
    private boolean mMediaMuxerStarted;
    private int mPossibleEndReason;
    private int mStartedEncodersCount;
    private int mStoppedEncodersCount;
    private static final String TAG = "MediaEncoderEngine";
    private static final CameraLogger LOG = CameraLogger.create(TAG);

    public interface Listener {
        void onEncodingEnd(int i, Exception exc);

        void onEncodingStart();

        void onEncodingStop();
    }

    static /* synthetic */ int access$1004(MediaEncoderEngine mediaEncoderEngine) {
        int i = mediaEncoderEngine.mStoppedEncodersCount + 1;
        mediaEncoderEngine.mStoppedEncodersCount = i;
        return i;
    }

    static /* synthetic */ int access$404(MediaEncoderEngine mediaEncoderEngine) {
        int i = mediaEncoderEngine.mStartedEncodersCount + 1;
        mediaEncoderEngine.mStartedEncodersCount = i;
        return i;
    }

    static /* synthetic */ int access$406(MediaEncoderEngine mediaEncoderEngine) {
        int i = mediaEncoderEngine.mStartedEncodersCount - 1;
        mediaEncoderEngine.mStartedEncodersCount = i;
        return i;
    }

    public MediaEncoderEngine(File file, VideoMediaEncoder videoMediaEncoder, AudioMediaEncoder audioMediaEncoder, int i, long j, Listener listener) {
        ArrayList arrayList = new ArrayList();
        this.mEncoders = arrayList;
        int i2 = 0;
        this.mStartedEncodersCount = 0;
        this.mStoppedEncodersCount = 0;
        this.mMediaMuxerStarted = false;
        this.mController = new Controller();
        this.mControllerThread = WorkerHandler.get("EncoderEngine");
        this.mControllerLock = new Object();
        this.mEndReason = 0;
        this.mListener = listener;
        arrayList.add(videoMediaEncoder);
        if (audioMediaEncoder != null) {
            arrayList.add(audioMediaEncoder);
        }
        try {
            this.mMediaMuxer = new MediaMuxer(file.toString(), 0);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                i2 += ((MediaEncoder) it.next()).getEncodedBitRate();
            }
            long j2 = (j / (i2 / 8)) * 1000000;
            long j3 = i * 1000;
            if (j > 0 && i > 0) {
                this.mPossibleEndReason = j2 < j3 ? 2 : 1;
                j2 = Math.min(j2, j3);
            } else if (j > 0) {
                this.mPossibleEndReason = 2;
            } else if (i > 0) {
                this.mPossibleEndReason = 1;
                j2 = j3;
            } else {
                j2 = Long.MAX_VALUE;
            }
            LOG.w("Computed a max duration of", Float.valueOf(j2 / 1000000.0f));
            Iterator<MediaEncoder> it2 = this.mEncoders.iterator();
            while (it2.hasNext()) {
                it2.next().prepare(this.mController, j2);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final void start() {
        LOG.i("Passing event to encoders:", "START");
        Iterator<MediaEncoder> it = this.mEncoders.iterator();
        while (it.hasNext()) {
            it.next().start();
        }
    }

    public final void notify(String str, Object obj) {
        LOG.v("Passing event to encoders:", str);
        Iterator<MediaEncoder> it = this.mEncoders.iterator();
        while (it.hasNext()) {
            it.next().notify(str, obj);
        }
    }

    public final void stop() {
        LOG.i("Passing event to encoders:", "STOP");
        Iterator<MediaEncoder> it = this.mEncoders.iterator();
        while (it.hasNext()) {
            it.next().stop();
        }
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onEncodingStop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void end() {
        LOG.i("end:", "Releasing muxer after all encoders have been released.");
        MediaMuxer mediaMuxer = this.mMediaMuxer;
        if (mediaMuxer != null) {
            try {
                mediaMuxer.stop();
                e = null;
            } catch (Exception e) {
                e = e;
            }
            try {
                this.mMediaMuxer.release();
            } catch (Exception e2) {
                if (e == null) {
                    e = e2;
                }
            }
            this.mMediaMuxer = null;
        } else {
            e = null;
        }
        CameraLogger cameraLogger = LOG;
        cameraLogger.w("end:", "Dispatching end to listener - reason:", Integer.valueOf(this.mEndReason), "error:", e);
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onEncodingEnd(this.mEndReason, e);
            this.mListener = null;
        }
        this.mEndReason = 0;
        this.mStartedEncodersCount = 0;
        this.mStoppedEncodersCount = 0;
        this.mMediaMuxerStarted = false;
        this.mControllerThread.destroy();
        cameraLogger.i("end:", "Completed.");
    }

    public VideoMediaEncoder getVideoEncoder() {
        return (VideoMediaEncoder) this.mEncoders.get(0);
    }

    public AudioMediaEncoder getAudioEncoder() {
        if (this.mEncoders.size() > 1) {
            return (AudioMediaEncoder) this.mEncoders.get(1);
        }
        return null;
    }

    public class Controller {
        private Map<Integer, Integer> mDebugCount = new HashMap();

        public Controller() {
        }

        public int notifyStarted(MediaFormat mediaFormat) {
            int addTrack;
            synchronized (MediaEncoderEngine.this.mControllerLock) {
                if (!MediaEncoderEngine.this.mMediaMuxerStarted) {
                    addTrack = MediaEncoderEngine.this.mMediaMuxer.addTrack(mediaFormat);
                    MediaEncoderEngine.LOG.w("notifyStarted:", "Assigned track", Integer.valueOf(addTrack), "to format", mediaFormat.getString(IMediaFormat.KEY_MIME));
                    if (MediaEncoderEngine.access$404(MediaEncoderEngine.this) == MediaEncoderEngine.this.mEncoders.size()) {
                        MediaEncoderEngine.LOG.w("notifyStarted:", "All encoders have started.", "Starting muxer and dispatching onEncodingStart().");
                        MediaEncoderEngine.this.mControllerThread.run(new Runnable() { // from class: com.otaliastudios.cameraview.video.encoding.MediaEncoderEngine.Controller.1
                            @Override // java.lang.Runnable
                            public void run() {
                                MediaEncoderEngine.this.mMediaMuxer.start();
                                MediaEncoderEngine.this.mMediaMuxerStarted = true;
                                if (MediaEncoderEngine.this.mListener != null) {
                                    MediaEncoderEngine.this.mListener.onEncodingStart();
                                }
                            }
                        });
                    }
                } else {
                    throw new IllegalStateException("Trying to start but muxer started already");
                }
            }
            return addTrack;
        }

        public boolean isStarted() {
            boolean z;
            synchronized (MediaEncoderEngine.this.mControllerLock) {
                z = MediaEncoderEngine.this.mMediaMuxerStarted;
            }
            return z;
        }

        public void write(OutputBufferPool outputBufferPool, OutputBuffer outputBuffer) {
            Integer num = this.mDebugCount.get(Integer.valueOf(outputBuffer.trackIndex));
            Map<Integer, Integer> map = this.mDebugCount;
            Integer valueOf = Integer.valueOf(outputBuffer.trackIndex);
            int i = 1;
            if (num != null) {
                num = Integer.valueOf(num.intValue() + 1);
                i = num.intValue();
            }
            Integer num2 = num;
            map.put(valueOf, Integer.valueOf(i));
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(outputBuffer.info.presentationTimeUs / 1000);
            MediaEncoderEngine.LOG.v("write:", "Writing into muxer -", "track:", Integer.valueOf(outputBuffer.trackIndex), "presentation:", Long.valueOf(outputBuffer.info.presentationTimeUs), "readable:", calendar.get(13) + ":" + calendar.get(14), "count:", num2);
            MediaEncoderEngine.this.mMediaMuxer.writeSampleData(outputBuffer.trackIndex, outputBuffer.data, outputBuffer.info);
            outputBufferPool.recycle(outputBuffer);
        }

        public void requestStop(int i) {
            synchronized (MediaEncoderEngine.this.mControllerLock) {
                MediaEncoderEngine.LOG.w("requestStop:", "Called for track", Integer.valueOf(i));
                if (MediaEncoderEngine.access$406(MediaEncoderEngine.this) == 0) {
                    MediaEncoderEngine.LOG.w("requestStop:", "All encoders have requested a stop.", "Stopping them.");
                    MediaEncoderEngine mediaEncoderEngine = MediaEncoderEngine.this;
                    mediaEncoderEngine.mEndReason = mediaEncoderEngine.mPossibleEndReason;
                    MediaEncoderEngine.this.mControllerThread.run(new Runnable() { // from class: com.otaliastudios.cameraview.video.encoding.MediaEncoderEngine.Controller.2
                        @Override // java.lang.Runnable
                        public void run() {
                            MediaEncoderEngine.this.stop();
                        }
                    });
                }
            }
        }

        public void notifyStopped(int i) {
            synchronized (MediaEncoderEngine.this.mControllerLock) {
                MediaEncoderEngine.LOG.w("notifyStopped:", "Called for track", Integer.valueOf(i));
                if (MediaEncoderEngine.access$1004(MediaEncoderEngine.this) == MediaEncoderEngine.this.mEncoders.size()) {
                    MediaEncoderEngine.LOG.w("requestStop:", "All encoders have been stopped.", "Stopping the muxer.");
                    MediaEncoderEngine.this.mControllerThread.run(new Runnable() { // from class: com.otaliastudios.cameraview.video.encoding.MediaEncoderEngine.Controller.3
                        @Override // java.lang.Runnable
                        public void run() {
                            MediaEncoderEngine.this.end();
                        }
                    });
                }
            }
        }
    }
}
