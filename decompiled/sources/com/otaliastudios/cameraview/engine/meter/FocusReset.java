package com.otaliastudios.cameraview.engine.meter;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.engine.action.ActionHolder;

/* loaded from: classes17.dex */
public class FocusReset extends BaseReset {
    private static final String TAG = "FocusReset";
    private static final CameraLogger LOG = CameraLogger.create(TAG);

    public FocusReset() {
        super(true);
    }

    @Override // com.otaliastudios.cameraview.engine.meter.BaseReset
    protected void onStarted(ActionHolder actionHolder, MeteringRectangle meteringRectangle) {
        boolean z = false;
        int intValue = ((Integer) readCharacteristic(CameraCharacteristics.CONTROL_MAX_REGIONS_AF, 0)).intValue();
        boolean z2 = true;
        if (meteringRectangle != null && intValue > 0) {
            actionHolder.getBuilder(this).set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{meteringRectangle});
            z = true;
        }
        TotalCaptureResult lastResult = actionHolder.getLastResult(this);
        Integer num = lastResult == null ? null : (Integer) lastResult.get(CaptureResult.CONTROL_AF_TRIGGER);
        LOG.w("onStarted:", "last focus trigger is", num);
        if (num == null || num.intValue() != 1) {
            z2 = z;
        } else {
            actionHolder.getBuilder(this).set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        }
        if (z2) {
            actionHolder.applyBuilder(this);
        }
        setState(Integer.MAX_VALUE);
    }
}
