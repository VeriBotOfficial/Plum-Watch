package com.otaliastudios.cameraview.engine.action;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* loaded from: classes17.dex */
class TimeoutAction extends ActionWrapper {
    private BaseAction action;
    private long startMillis;
    private long timeoutMillis;

    TimeoutAction(long j, BaseAction baseAction) {
        this.timeoutMillis = j;
        this.action = baseAction;
    }

    @Override // com.otaliastudios.cameraview.engine.action.ActionWrapper
    public BaseAction getAction() {
        return this.action;
    }

    @Override // com.otaliastudios.cameraview.engine.action.ActionWrapper, com.otaliastudios.cameraview.engine.action.BaseAction
    protected void onStart(ActionHolder actionHolder) {
        this.startMillis = System.currentTimeMillis();
        super.onStart(actionHolder);
    }

    @Override // com.otaliastudios.cameraview.engine.action.ActionWrapper, com.otaliastudios.cameraview.engine.action.BaseAction, com.otaliastudios.cameraview.engine.action.Action
    public void onCaptureCompleted(ActionHolder actionHolder, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.onCaptureCompleted(actionHolder, captureRequest, totalCaptureResult);
        if (isCompleted() || System.currentTimeMillis() <= this.startMillis + this.timeoutMillis) {
            return;
        }
        getAction().abort(actionHolder);
    }
}
