package com.otaliastudios.cameraview.engine.meter;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.engine.action.ActionHolder;

/* loaded from: classes17.dex */
public class ExposureReset extends BaseReset {
    private static final int STATE_WAITING_LOCK = 0;
    private static final String TAG = "ExposureReset";
    private static final CameraLogger LOG = CameraLogger.create(TAG);

    public ExposureReset() {
        super(true);
    }

    @Override // com.otaliastudios.cameraview.engine.meter.BaseReset
    protected void onStarted(ActionHolder actionHolder, MeteringRectangle meteringRectangle) {
        int intValue = ((Integer) readCharacteristic(CameraCharacteristics.CONTROL_MAX_REGIONS_AE, 0)).intValue();
        if (meteringRectangle != null && intValue > 0) {
            actionHolder.getBuilder(this).set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{meteringRectangle});
        }
        TotalCaptureResult lastResult = actionHolder.getLastResult(this);
        Integer num = lastResult == null ? null : (Integer) lastResult.get(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
        CameraLogger cameraLogger = LOG;
        cameraLogger.i("onStarted:", "last precapture trigger is", num);
        if (num != null && num.intValue() == 1) {
            cameraLogger.i("onStarted:", "canceling precapture.");
            actionHolder.getBuilder(this).set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        }
        actionHolder.getBuilder(this).set(CaptureRequest.CONTROL_AE_LOCK, true);
        actionHolder.applyBuilder(this);
        setState(0);
    }

    @Override // com.otaliastudios.cameraview.engine.action.BaseAction, com.otaliastudios.cameraview.engine.action.Action
    public void onCaptureCompleted(ActionHolder actionHolder, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.onCaptureCompleted(actionHolder, captureRequest, totalCaptureResult);
        if (getState() == 0) {
            actionHolder.getBuilder(this).set(CaptureRequest.CONTROL_AE_LOCK, false);
            actionHolder.applyBuilder(this);
            setState(Integer.MAX_VALUE);
        }
    }
}
