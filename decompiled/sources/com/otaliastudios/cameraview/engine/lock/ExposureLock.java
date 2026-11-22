package com.otaliastudios.cameraview.engine.lock;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.engine.action.ActionHolder;

/* loaded from: classes17.dex */
public class ExposureLock extends BaseLock {
    private static final String TAG = "ExposureLock";
    private static final CameraLogger LOG = CameraLogger.create(TAG);

    @Override // com.otaliastudios.cameraview.engine.lock.BaseLock
    protected boolean checkIsSupported(ActionHolder actionHolder) {
        boolean z = false;
        boolean z2 = ((Integer) readCharacteristic(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL, -1)).intValue() != 2;
        Integer num = (Integer) actionHolder.getBuilder(this).get(CaptureRequest.CONTROL_AE_MODE);
        boolean z3 = num != null && (num.intValue() == 1 || num.intValue() == 3 || num.intValue() == 2 || num.intValue() == 4 || num.intValue() == 5);
        if (z2 && z3) {
            z = true;
        }
        LOG.i("checkIsSupported:", Boolean.valueOf(z));
        return z;
    }

    @Override // com.otaliastudios.cameraview.engine.lock.BaseLock
    protected boolean checkShouldSkip(ActionHolder actionHolder) {
        TotalCaptureResult lastResult = actionHolder.getLastResult(this);
        boolean z = false;
        if (lastResult != null) {
            Integer num = (Integer) lastResult.get(CaptureResult.CONTROL_AE_STATE);
            if (num != null && num.intValue() == 3) {
                z = true;
            }
            LOG.i("checkShouldSkip:", Boolean.valueOf(z));
            return z;
        }
        LOG.i("checkShouldSkip: false - lastResult is null.");
        return false;
    }

    @Override // com.otaliastudios.cameraview.engine.lock.BaseLock
    protected void onStarted(ActionHolder actionHolder) {
        actionHolder.getBuilder(this).set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        actionHolder.getBuilder(this).set(CaptureRequest.CONTROL_AE_LOCK, true);
        actionHolder.applyBuilder(this);
    }

    @Override // com.otaliastudios.cameraview.engine.action.BaseAction, com.otaliastudios.cameraview.engine.action.Action
    public void onCaptureCompleted(ActionHolder actionHolder, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.onCaptureCompleted(actionHolder, captureRequest, totalCaptureResult);
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
        LOG.i("processCapture:", "aeState:", num);
        if (num != null && num.intValue() == 3) {
            setState(Integer.MAX_VALUE);
        }
    }
}
