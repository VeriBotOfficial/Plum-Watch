package io.agora.rtc2.video;

/* loaded from: classes6.dex */
public interface IVideoCaptureCamera extends IVideoCapture {
    float getMaxZoom();

    boolean isAutoFaceFocusSupported();

    boolean isCameraExposureSupported();

    boolean isExposureSupported();

    boolean isFaceDetectSupported();

    boolean isFocusSupported();

    boolean isTorchSupported();

    boolean isZoomSupported();

    boolean needFallback();

    int setAntiBandingMode(int i);

    int setAutoFaceFocus(boolean z);

    int setEdgeEnhanceMode(int i);

    int setExposure(float f, float f2);

    int setExposureCompensation(int i);

    int setFaceDetection(boolean z);

    int setFocus(float f, float f2);

    int setNoiseReductionMode(int i);

    void setPreviewInfo(Object obj, boolean z, int i);

    int setTorchMode(boolean z);

    int setVideoEdgeMode(int i);

    int setVideoStabilityMode(int i);

    int setZoom(float f);
}
