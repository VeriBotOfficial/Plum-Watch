package com.otaliastudios.cameraview.engine.lock;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.engine.action.ActionHolder;

/* loaded from: classes17.dex */
public class WhiteBalanceLock extends BaseLock {
    private static final String TAG = "WhiteBalanceLock";
    private static final CameraLogger LOG = CameraLogger.create(TAG);

    @Override // com.otaliastudios.cameraview.engine.lock.BaseLock
    protected boolean checkIsSupported(ActionHolder actionHolder) {
        boolean z = false;
        boolean z2 = ((Integer) readCharacteristic(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL, -1)).intValue() != 2;
        Integer num = (Integer) actionHolder.getBuilder(this).get(CaptureRequest.CONTROL_AWB_MODE);
        if (z2 && num != null && num.intValue() == 1) {
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
            Integer num = (Integer) lastResult.get(CaptureResult.CONTROL_AWB_STATE);
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
        actionHolder.getBuilder(this).set(CaptureRequest.CONTROL_AWB_LOCK, true);
        actionHolder.applyBuilder(this);
    }

    @Override // com.otaliastudios.cameraview.engine.action.BaseAction, com.otaliastudios.cameraview.engine.action.Action
    public void onCaptureCompleted(ActionHolder actionHolder, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.onCaptureCompleted(actionHolder, captureRequest, totalCaptureResult);
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AWB_STATE);
        LOG.i("processCapture:", "awbState:", num);
        if (num != null && num.intValue() == 3) {
            setState(Integer.MAX_VALUE);
        }
    }
}
