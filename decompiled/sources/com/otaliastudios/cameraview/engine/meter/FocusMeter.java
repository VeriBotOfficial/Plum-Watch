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
public class FocusMeter extends BaseMeter {
    private static final String TAG = "FocusMeter";
    private static final CameraLogger LOG = CameraLogger.create(TAG);

    public FocusMeter(List<MeteringRectangle> list, boolean z) {
        super(list, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r4.intValue() != 2) goto L13;
     */
    @Override // com.otaliastudios.cameraview.engine.meter.BaseMeter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean checkIsSupported(com.otaliastudios.cameraview.engine.action.ActionHolder r4) {
        /*
            r3 = this;
            android.hardware.camera2.CaptureRequest$Builder r4 = r4.getBuilder(r3)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            java.lang.Object r4 = r4.get(r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L2b
            int r0 = r4.intValue()
            r1 = 1
            if (r0 == r1) goto L2c
            int r0 = r4.intValue()
            r2 = 4
            if (r0 == r2) goto L2c
            int r0 = r4.intValue()
            r2 = 3
            if (r0 == r2) goto L2c
            int r4 = r4.intValue()
            r0 = 2
            if (r4 != r0) goto L2b
            goto L2c
        L2b:
            r1 = 0
        L2c:
            com.otaliastudios.cameraview.CameraLogger r4 = com.otaliastudios.cameraview.engine.meter.FocusMeter.LOG
            java.lang.String r0 = "checkIsSupported:"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            r4.i(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.otaliastudios.cameraview.engine.meter.FocusMeter.checkIsSupported(com.otaliastudios.cameraview.engine.action.ActionHolder):boolean");
    }

    @Override // com.otaliastudios.cameraview.engine.meter.BaseMeter
    protected boolean checkShouldSkip(ActionHolder actionHolder) {
        TotalCaptureResult lastResult = actionHolder.getLastResult(this);
        boolean z = false;
        if (lastResult != null) {
            Integer num = (Integer) lastResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num != null && (num.intValue() == 4 || num.intValue() == 2)) {
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
        actionHolder.getBuilder(this).set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        int intValue = ((Integer) readCharacteristic(CameraCharacteristics.CONTROL_MAX_REGIONS_AF, 0)).intValue();
        if (!list.isEmpty() && intValue > 0) {
            actionHolder.getBuilder(this).set(CaptureRequest.CONTROL_AF_REGIONS, (MeteringRectangle[]) list.subList(0, Math.min(intValue, list.size())).toArray(new MeteringRectangle[0]));
        }
        actionHolder.applyBuilder(this);
    }

    @Override // com.otaliastudios.cameraview.engine.action.BaseAction
    protected void onCompleted(ActionHolder actionHolder) {
        super.onCompleted(actionHolder);
        actionHolder.getBuilder(this).set(CaptureRequest.CONTROL_AF_TRIGGER, null);
    }

    @Override // com.otaliastudios.cameraview.engine.action.BaseAction, com.otaliastudios.cameraview.engine.action.Action
    public void onCaptureCompleted(ActionHolder actionHolder, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.onCaptureCompleted(actionHolder, captureRequest, totalCaptureResult);
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        LOG.i("onCaptureCompleted:", "afState:", num);
        if (num == null) {
            return;
        }
        int intValue = num.intValue();
        if (intValue == 4) {
            setSuccessful(true);
            setState(Integer.MAX_VALUE);
        } else {
            if (intValue != 5) {
                return;
            }
            setSuccessful(false);
            setState(Integer.MAX_VALUE);
        }
    }
}
