package com.beken.iot.smartsdk.callback;

import com.beken.iot.smartsdk.options.CameraFormat;
import com.beken.iot.smartsdk.options.CameraResult;
import kotlin.Metadata;

/* compiled from: OnVideoCallback.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&¨\u0006\u0012"}, d2 = {"Lcom/beken/iot/smartsdk/callback/OnVideoCallback;", "", "onError", "", "code", "", "onReceiveFrame", "cameraResult", "Lcom/beken/iot/smartsdk/options/CameraResult;", "onReceiveFrameUnpackedBadData", "frameData", "", "cameraFormat", "Lcom/beken/iot/smartsdk/options/CameraFormat;", "onReceiveFrameUnpackedData", "onVideoPreviewState", "videoPreviewOn", "", "iotsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface OnVideoCallback {
    void onError(int code);

    void onReceiveFrame(CameraResult cameraResult);

    void onReceiveFrameUnpackedBadData(byte[] frameData, CameraFormat cameraFormat);

    void onReceiveFrameUnpackedData(byte[] frameData, CameraFormat cameraFormat);

    void onVideoPreviewState(boolean videoPreviewOn);
}
