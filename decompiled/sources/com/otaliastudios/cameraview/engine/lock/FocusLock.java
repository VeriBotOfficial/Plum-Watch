package com.otaliastudios.cameraview.engine.lock;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.engine.action.ActionHolder;

/* loaded from: classes17.dex */
public class FocusLock extends BaseLock {
    private static final String TAG = "FocusLock";
    private static final CameraLogger LOG = CameraLogger.create(TAG);

    @Override // com.otaliastudios.cameraview.engine.lock.BaseLock
    protected boolean checkIsSupported(ActionHolder actionHolder) {
        for (int i : (int[]) readCharacteristic(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES, new int[0])) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // com.otaliastudios.cameraview.engine.lock.BaseLock
    protected boolean checkShouldSkip(ActionHolder actionHolder) {
        TotalCaptureResult lastResult = actionHolder.getLastResult(this);
        boolean z = false;
        if (lastResult != null) {
            Integer num = (Integer) lastResult.get(CaptureResult.CONTROL_AF_STATE);
            boolean z2 = num != null && (num.intValue() == 4 || num.intValue() == 5 || num.intValue() == 0 || num.intValue() == 2 || num.intValue() == 6);
            Integer num2 = (Integer) lastResult.get(CaptureResult.CONTROL_AF_MODE);
            boolean z3 = num2 != null && num2.intValue() == 1;
            if (z2 && z3) {
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
        actionHolder.getBuilder(this).set(CaptureRequest.CONTROL_AF_MODE, 1);
        actionHolder.getBuilder(this).set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        actionHolder.applyBuilder(this);
    }

    @Override // com.otaliastudios.cameraview.engine.action.BaseAction, com.otaliastudios.cameraview.engine.action.Action
    public void onCaptureCompleted(ActionHolder actionHolder, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.onCaptureCompleted(actionHolder, captureRequest, totalCaptureResult);
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE);
        LOG.i("onCapture:", "afState:", num, "afMode:", num2);
        if (num == null || num2 == null || num2.intValue() != 1) {
            return;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 2 || intValue == 4 || intValue == 5 || intValue == 6) {
            setState(Integer.MAX_VALUE);
        }
    }
}
