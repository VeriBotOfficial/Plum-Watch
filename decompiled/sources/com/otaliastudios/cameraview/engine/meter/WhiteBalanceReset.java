package com.otaliastudios.cameraview.engine.meter;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.engine.action.ActionHolder;

/* loaded from: classes17.dex */
public class WhiteBalanceReset extends BaseReset {
    private static final String TAG = "WhiteBalanceReset";
    private static final CameraLogger LOG = CameraLogger.create(TAG);

    public WhiteBalanceReset() {
        super(true);
    }

    @Override // com.otaliastudios.cameraview.engine.meter.BaseReset
    protected void onStarted(ActionHolder actionHolder, MeteringRectangle meteringRectangle) {
        LOG.w("onStarted:", "with area:", meteringRectangle);
        int intValue = ((Integer) readCharacteristic(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB, 0)).intValue();
        if (meteringRectangle != null && intValue > 0) {
            actionHolder.getBuilder(this).set(CaptureRequest.CONTROL_AWB_REGIONS, new MeteringRectangle[]{meteringRectangle});
            actionHolder.applyBuilder(this);
        }
        setState(Integer.MAX_VALUE);
    }
}
