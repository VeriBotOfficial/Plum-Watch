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
public class ExposureMeter extends BaseMeter {
    private static final int STATE_WAITING_PRECAPTURE = 0;
    private static final int STATE_WAITING_PRECAPTURE_END = 1;
    private boolean mSupportsAreas;
    private boolean mSupportsTrigger;
    private static final String TAG = "ExposureMeter";
    private static final CameraLogger LOG = CameraLogger.create(TAG);

    public ExposureMeter(List<MeteringRectangle> list, boolean z) {
        super(list, z);
        this.mSupportsAreas = false;
        this.mSupportsTrigger = false;
    }

    @Override // com.otaliastudios.cameraview.engine.meter.BaseMeter
    protected boolean checkIsSupported(ActionHolder actionHolder) {
        boolean z = false;
        boolean z2 = ((Integer) readCharacteristic(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL, -1)).intValue() == 2;
        Integer num = (Integer) actionHolder.getBuilder(this).get(CaptureRequest.CONTROL_AE_MODE);
        boolean z3 = num != null && (num.intValue() == 1 || num.intValue() == 3 || num.intValue() == 2 || num.intValue() == 4 || num.intValue() == 5);
        this.mSupportsTrigger = !z2;
        boolean z4 = ((Integer) readCharacteristic(CameraCharacteristics.CONTROL_MAX_REGIONS_AE, 0)).intValue() > 0;
        this.mSupportsAreas = z4;
        if (z3 && (this.mSupportsTrigger || z4)) {
            z = true;
        }
        LOG.i("checkIsSupported:", Boolean.valueOf(z), "trigger:", Boolean.valueOf(this.mSupportsTrigger), "areas:", Boolean.valueOf(this.mSupportsAreas));
        return z;
    }

    @Override // com.otaliastudios.cameraview.engine.meter.BaseMeter
    protected boolean checkShouldSkip(ActionHolder actionHolder) {
        TotalCaptureResult lastResult = actionHolder.getLastResult(this);
        boolean z = false;
        if (lastResult != null) {
            Integer num = (Integer) lastResult.get(CaptureResult.CONTROL_AE_STATE);
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
        if (this.mSupportsAreas && !list.isEmpty()) {
            actionHolder.getBuilder(this).set(CaptureRequest.CONTROL_AE_REGIONS, (MeteringRectangle[]) list.subList(0, Math.min(((Integer) readCharacteristic(CameraCharacteristics.CONTROL_MAX_REGIONS_AE, 0)).intValue(), list.size())).toArray(new MeteringRectangle[0]));
        }
        if (this.mSupportsTrigger) {
            actionHolder.getBuilder(this).set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        }
        actionHolder.applyBuilder(this);
        if (this.mSupportsTrigger) {
            setState(0);
        } else {
            setState(1);
        }
    }

    @Override // com.otaliastudios.cameraview.engine.action.BaseAction
    protected void onCompleted(ActionHolder actionHolder) {
        super.onCompleted(actionHolder);
        actionHolder.getBuilder(this).set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, null);
    }

    @Override // com.otaliastudios.cameraview.engine.action.BaseAction, com.otaliastudios.cameraview.engine.action.Action
    public void onCaptureCompleted(ActionHolder actionHolder, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.onCaptureCompleted(actionHolder, captureRequest, totalCaptureResult);
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
        Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
        LOG.i("onCaptureCompleted:", "aeState:", num, "aeTriggerState:", num2);
        if (num == null) {
            return;
        }
        if (getState() == 0) {
            int intValue = num.intValue();
            if (intValue != 2) {
                if (intValue == 3) {
                    setSuccessful(false);
                    setState(Integer.MAX_VALUE);
                } else if (intValue != 4) {
                    if (intValue == 5) {
                        setState(1);
                    }
                }
            }
            if (num2 != null && num2.intValue() == 1) {
                setSuccessful(true);
                setState(Integer.MAX_VALUE);
            }
        }
        if (getState() == 1) {
            int intValue2 = num.intValue();
            if (intValue2 != 2) {
                if (intValue2 == 3) {
                    setSuccessful(false);
                    setState(Integer.MAX_VALUE);
                    return;
                } else if (intValue2 != 4) {
                    return;
                }
            }
            setSuccessful(true);
            setState(Integer.MAX_VALUE);
        }
    }
}
