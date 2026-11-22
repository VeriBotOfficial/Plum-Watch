package com.otaliastudios.cameraview.engine.action;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes17.dex */
class TogetherAction extends BaseAction {
    private final List<BaseAction> actions;
    private final List<BaseAction> runningActions;

    TogetherAction(List<BaseAction> list) {
        this.actions = new ArrayList(list);
        this.runningActions = new ArrayList(list);
        Iterator<BaseAction> it = list.iterator();
        while (it.hasNext()) {
            it.next().addCallback(new ActionCallback() { // from class: com.otaliastudios.cameraview.engine.action.TogetherAction.1
                @Override // com.otaliastudios.cameraview.engine.action.ActionCallback
                public void onActionStateChanged(Action action, int i) {
                    if (i == Integer.MAX_VALUE) {
                        TogetherAction.this.runningActions.remove(action);
                    }
                    if (TogetherAction.this.runningActions.isEmpty()) {
                        TogetherAction.this.setState(Integer.MAX_VALUE);
                    }
                }
            });
        }
    }

    @Override // com.otaliastudios.cameraview.engine.action.BaseAction
    protected void onStart(ActionHolder actionHolder) {
        super.onStart(actionHolder);
        for (BaseAction baseAction : this.actions) {
            if (!baseAction.isCompleted()) {
                baseAction.onStart(actionHolder);
            }
        }
    }

    @Override // com.otaliastudios.cameraview.engine.action.BaseAction
    protected void onAbort(ActionHolder actionHolder) {
        super.onAbort(actionHolder);
        for (BaseAction baseAction : this.actions) {
            if (!baseAction.isCompleted()) {
                baseAction.onAbort(actionHolder);
            }
        }
    }

    @Override // com.otaliastudios.cameraview.engine.action.BaseAction, com.otaliastudios.cameraview.engine.action.Action
    public void onCaptureStarted(ActionHolder actionHolder, CaptureRequest captureRequest) {
        super.onCaptureStarted(actionHolder, captureRequest);
        for (BaseAction baseAction : this.actions) {
            if (!baseAction.isCompleted()) {
                baseAction.onCaptureStarted(actionHolder, captureRequest);
            }
        }
    }

    @Override // com.otaliastudios.cameraview.engine.action.BaseAction, com.otaliastudios.cameraview.engine.action.Action
    public void onCaptureProgressed(ActionHolder actionHolder, CaptureRequest captureRequest, CaptureResult captureResult) {
        super.onCaptureProgressed(actionHolder, captureRequest, captureResult);
        for (BaseAction baseAction : this.actions) {
            if (!baseAction.isCompleted()) {
                baseAction.onCaptureProgressed(actionHolder, captureRequest, captureResult);
            }
        }
    }

    @Override // com.otaliastudios.cameraview.engine.action.BaseAction, com.otaliastudios.cameraview.engine.action.Action
    public void onCaptureCompleted(ActionHolder actionHolder, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.onCaptureCompleted(actionHolder, captureRequest, totalCaptureResult);
        for (BaseAction baseAction : this.actions) {
            if (!baseAction.isCompleted()) {
                baseAction.onCaptureCompleted(actionHolder, captureRequest, totalCaptureResult);
            }
        }
    }
}
