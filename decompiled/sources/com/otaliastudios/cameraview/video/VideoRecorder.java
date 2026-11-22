package com.otaliastudios.cameraview.video;

import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.VideoResult;

/* loaded from: classes17.dex */
public abstract class VideoRecorder {
    private static final int STATE_IDLE = 0;
    private static final int STATE_RECORDING = 1;
    private static final int STATE_STOPPING = 2;
    protected Exception mError;
    private final VideoResultListener mListener;
    VideoResult.Stub mResult;
    private static final String TAG = "VideoRecorder";
    private static final CameraLogger LOG = CameraLogger.create(TAG);
    private final Object mStateLock = new Object();
    private int mState = 0;

    public interface VideoResultListener {
        void onVideoRecordingEnd();

        void onVideoRecordingStart();

        void onVideoResult(VideoResult.Stub stub, Exception exc);
    }

    protected void onDispatchResult() {
    }

    protected abstract void onStart();

    protected abstract void onStop(boolean z);

    VideoRecorder(VideoResultListener videoResultListener) {
        this.mListener = videoResultListener;
    }

    public final void start(VideoResult.Stub stub) {
        synchronized (this.mStateLock) {
            int i = this.mState;
            if (i != 0) {
                LOG.e("start:", "called twice, or while stopping! Ignoring. state:", Integer.valueOf(i));
                return;
            }
            LOG.i("start:", "Changed state to STATE_RECORDING");
            this.mState = 1;
            this.mResult = stub;
            onStart();
        }
    }

    public final void stop(boolean z) {
        synchronized (this.mStateLock) {
            if (this.mState == 0) {
                LOG.e("stop:", "called twice, or called before start! Ignoring. isCameraShutdown:", Boolean.valueOf(z));
                return;
            }
            LOG.i("stop:", "Changed state to STATE_STOPPING");
            this.mState = 2;
            onStop(z);
        }
    }

    public boolean isRecording() {
        boolean z;
        synchronized (this.mStateLock) {
            z = this.mState != 0;
        }
        return z;
    }

    protected final void dispatchResult() {
        synchronized (this.mStateLock) {
            if (!isRecording()) {
                LOG.w("dispatchResult:", "Called, but not recording! Aborting.");
                return;
            }
            CameraLogger cameraLogger = LOG;
            cameraLogger.i("dispatchResult:", "Changed state to STATE_IDLE.");
            this.mState = 0;
            onDispatchResult();
            cameraLogger.i("dispatchResult:", "About to dispatch result:", this.mResult, this.mError);
            VideoResultListener videoResultListener = this.mListener;
            if (videoResultListener != null) {
                videoResultListener.onVideoResult(this.mResult, this.mError);
            }
            this.mResult = null;
            this.mError = null;
        }
    }

    protected void dispatchVideoRecordingStart() {
        LOG.i("dispatchVideoRecordingStart:", "About to dispatch.");
        VideoResultListener videoResultListener = this.mListener;
        if (videoResultListener != null) {
            videoResultListener.onVideoRecordingStart();
        }
    }

    protected void dispatchVideoRecordingEnd() {
        LOG.i("dispatchVideoRecordingEnd:", "About to dispatch.");
        VideoResultListener videoResultListener = this.mListener;
        if (videoResultListener != null) {
            videoResultListener.onVideoRecordingEnd();
        }
    }
}
