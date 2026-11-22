package com.otaliastudios.cameraview.picture;

import com.otaliastudios.cameraview.PictureResult;

/* loaded from: classes17.dex */
public abstract class PictureRecorder {
    protected Exception mError;
    PictureResultListener mListener;
    PictureResult.Stub mResult;

    public interface PictureResultListener {
        void onPictureResult(PictureResult.Stub stub, Exception exc);

        void onPictureShutter(boolean z);
    }

    public abstract void take();

    public PictureRecorder(PictureResult.Stub stub, PictureResultListener pictureResultListener) {
        this.mResult = stub;
        this.mListener = pictureResultListener;
    }

    protected void dispatchOnShutter(boolean z) {
        PictureResultListener pictureResultListener = this.mListener;
        if (pictureResultListener != null) {
            pictureResultListener.onPictureShutter(z);
        }
    }

    protected void dispatchResult() {
        PictureResultListener pictureResultListener = this.mListener;
        if (pictureResultListener != null) {
            pictureResultListener.onPictureResult(this.mResult, this.mError);
            this.mListener = null;
            this.mResult = null;
        }
    }
}
