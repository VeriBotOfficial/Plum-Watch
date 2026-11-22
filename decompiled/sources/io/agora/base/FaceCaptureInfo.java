package io.agora.base;

/* loaded from: classes6.dex */
public final class FaceCaptureInfo implements IMetaInfo {
    public static final String TAG = "FaceCaptureInfo";
    private String mInfoStr;

    @Override // io.agora.base.IMetaInfo
    public int getId() {
        return 0;
    }

    public FaceCaptureInfo(String str) {
        this.mInfoStr = str;
    }

    @Override // io.agora.base.IMetaInfo
    public String getTag() {
        return TAG;
    }

    public String getInfoStr() {
        return this.mInfoStr;
    }

    public String toString() {
        return this.mInfoStr;
    }

    public static void addFaceCapInfoToFrame(FaceCaptureInfo faceCaptureInfo, VideoFrame videoFrame) {
        videoFrame.getMetaInfo().setCustomMetaInfo(new IMetaInfo[]{faceCaptureInfo});
    }

    public static FaceCaptureInfo extractFaceCaptureInfoFromVideoFrame(VideoFrame videoFrame, int i) {
        return (FaceCaptureInfo) videoFrame.getMetaInfo().getCustomMetaInfoAt(TAG, i);
    }
}
