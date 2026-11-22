package com.otaliastudios.cameraview.engine.meter;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.engine.action.ActionHolder;
import java.util.List;

/* loaded from: classes17.dex */
public class WhiteBalanceMeter extends BaseMeter {
    private static final String TAG = "WhiteBalanceMeter";
    private static final CameraLogger LOG = CameraLogger.create(TAG);

    public WhiteBalanceMeter(List<MeteringRectangle> list, boolean z) {
        super(list, z);
    }

    @Override // com.otaliastudios.cameraview.engine.meter.BaseMeter
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

    @Override // com.otaliastudios.cameraview.engine.meter.BaseMeter
    protected boolean checkShouldSkip(ActionHolder actionHolder) {
        TotalCaptureResult lastResult = actionHolder.getLastResult(this);
        boolean z = false;
        if (lastResult != null) {
            Integer num = (Integer) lastResult.get(CaptureResult.CONTROL_AWB_STATE);
            if (num != null && num.intValue() == 2) {
                z = true;
            }
            LOG.i("checkShouldSkip:", Boolean.valueOf(z));
            return z;
        }
        LOG.i("checkShouldSkip: false - lastResult is null.");
        return false;
    }

    @Override // com.otaliastudios.cameraview.engine.meter.BaseMeter
    protected void onStarted(ActionHolder actionHolder, List<MeteringRectangle> list) {
        LOG.i("onStarted:", "with areas:", list);
        int intValue = ((Integer) readCharacteristic(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB, 0)).intValue();
        if (list.isEmpty() || intValue <= 0) {
            return;
        }
        actionHolder.getBuilder(this).set(CaptureRequest.CONTROL_AWB_REGIONS, (MeteringRectangle[]) list.subList(0, Math.min(intValue, list.size())).toArray(new MeteringRectangle[0]));
        actionHolder.applyBuilder(this);
    }

    @Override // com.otaliastudios.cameraview.engine.action.BaseAction, com.otaliastudios.cameraview.engine.action.Action
    public void onCaptureCompleted(ActionHolder actionHolder, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.onCaptureCompleted(actionHolder, captureRequest, totalCaptureResult);
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AWB_STATE);
        LOG.i("onCaptureCompleted:", "awbState:", num);
        if (num == null) {
            return;
        }
        int intValue = num.intValue();
        if (intValue == 2) {
            setSuccessful(true);
            setState(Integer.MAX_VALUE);
        } else {
            if (intValue != 3) {
                return;
            }
            setSuccessful(false);
            setState(Integer.MAX_VALUE);
        }
    }
}
