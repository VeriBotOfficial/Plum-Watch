package io.agora.meta;

import android.content.Context;

/* loaded from: classes6.dex */
public class MetaSceneConfig {
    public int mSyncMode = 1;
    public Context mActivityContext = null;
    public boolean mEnableFaceCapture = false;
    public String mFaceCaptureAppId = "";
    public String mFaceCaptureCertificate = "";

    public static class StateSyncMode {
        public static final int STATE_SYNC_MODE_NONE = 0;
        public static final int STATE_SYNC_MODE_NORMAL = 1;

        private StateSyncMode() {
        }
    }

    public Context getActivityContext() {
        return this.mActivityContext;
    }

    public String getFaceCaptureAppId() {
        return this.mFaceCaptureAppId;
    }

    public String getFaceCaptureCertificate() {
        return this.mFaceCaptureCertificate;
    }

    public int getSyncMode() {
        return this.mSyncMode;
    }

    public boolean isEnableFaceCapture() {
        return this.mEnableFaceCapture;
    }

    public String toString() {
        return "MetaSceneConfig{mSyncMode=" + this.mSyncMode + ", mActivityContext=" + this.mActivityContext + ", mEnableFaceCapture=" + this.mEnableFaceCapture + ", mFaceCaptureAppId='" + this.mFaceCaptureAppId + "', mFaceCaptureCertificate='" + this.mFaceCaptureCertificate + "'}";
    }
}
