package com.otaliastudios.cameraview.engine.action;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* loaded from: classes17.dex */
public abstract class ActionWrapper extends BaseAction {
    public abstract BaseAction getAction();

    @Override // com.otaliastudios.cameraview.engine.action.BaseAction
    protected void onStart(ActionHolder actionHolder) {
        super.onStart(actionHolder);
        getAction().addCallback(new ActionCallback() { // from class: com.otaliastudios.cameraview.engine.action.ActionWrapper.1
            @Override // com.otaliastudios.cameraview.engine.action.ActionCallback
            public void onActionStateChanged(Action action, int i) {
                ActionWrapper.this.setState(i);
                if (i == Integer.MAX_VALUE) {
                    action.removeCallback(this);
                }
            }
        });
        getAction().onStart(actionHolder);
    }

    @Override // com.otaliastudios.cameraview.engine.action.BaseAction
    protected void onAbort(ActionHolder actionHolder) {
        super.onAbort(actionHolder);
        getAction().onAbort(actionHolder);
    }

    @Override // com.otaliastudios.cameraview.engine.action.BaseAction, com.otaliastudios.cameraview.engine.action.Action
    public void onCaptureStarted(ActionHolder actionHolder, CaptureRequest captureRequest) {
        super.onCaptureStarted(actionHolder, captureRequest);
        getAction().onCaptureStarted(actionHolder, captureRequest);
    }

    @Override // com.otaliastudios.cameraview.engine.action.BaseAction, com.otaliastudios.cameraview.engine.action.Action
    public void onCaptureProgressed(ActionHolder actionHolder, CaptureRequest captureRequest, CaptureResult captureResult) {
        super.onCaptureProgressed(actionHolder, captureRequest, captureResult);
        getAction().onCaptureProgressed(actionHolder, captureRequest, captureResult);
    }

    @Override // com.otaliastudios.cameraview.engine.action.BaseAction, com.otaliastudios.cameraview.engine.action.Action
    public void onCaptureCompleted(ActionHolder actionHolder, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.onCaptureCompleted(actionHolder, captureRequest, totalCaptureResult);
        getAction().onCaptureCompleted(actionHolder, captureRequest, totalCaptureResult);
    }
}
