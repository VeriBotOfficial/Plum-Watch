package com.otaliastudios.cameraview.engine.action;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import java.util.List;

/* loaded from: classes17.dex */
class SequenceAction extends BaseAction {
    private final List<BaseAction> actions;
    private int runningAction = -1;

    SequenceAction(List<BaseAction> list) {
        this.actions = list;
        increaseRunningAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void increaseRunningAction() {
        int i = this.runningAction;
        boolean z = i == -1;
        if (i == this.actions.size() - 1) {
            setState(Integer.MAX_VALUE);
            return;
        }
        int i2 = this.runningAction + 1;
        this.runningAction = i2;
        this.actions.get(i2).addCallback(new ActionCallback() { // from class: com.otaliastudios.cameraview.engine.action.SequenceAction.1
            @Override // com.otaliastudios.cameraview.engine.action.ActionCallback
            public void onActionStateChanged(Action action, int i3) {
                if (i3 == Integer.MAX_VALUE) {
                    action.removeCallback(this);
                    SequenceAction.this.increaseRunningAction();
                }
            }
        });
        if (z) {
            return;
        }
        this.actions.get(this.runningAction).onStart(getHolder());
    }

    @Override // com.otaliastudios.cameraview.engine.action.BaseAction
    protected void onStart(ActionHolder actionHolder) {
        super.onStart(actionHolder);
        int i = this.runningAction;
        if (i >= 0) {
            this.actions.get(i).onStart(actionHolder);
        }
    }

    @Override // com.otaliastudios.cameraview.engine.action.BaseAction
    protected void onAbort(ActionHolder actionHolder) {
        super.onAbort(actionHolder);
        int i = this.runningAction;
        if (i >= 0) {
            this.actions.get(i).onAbort(actionHolder);
        }
    }

    @Override // com.otaliastudios.cameraview.engine.action.BaseAction, com.otaliastudios.cameraview.engine.action.Action
    public void onCaptureStarted(ActionHolder actionHolder, CaptureRequest captureRequest) {
        super.onCaptureStarted(actionHolder, captureRequest);
        int i = this.runningAction;
        if (i >= 0) {
            this.actions.get(i).onCaptureStarted(actionHolder, captureRequest);
        }
    }

    @Override // com.otaliastudios.cameraview.engine.action.BaseAction, com.otaliastudios.cameraview.engine.action.Action
    public void onCaptureProgressed(ActionHolder actionHolder, CaptureRequest captureRequest, CaptureResult captureResult) {
        super.onCaptureProgressed(actionHolder, captureRequest, captureResult);
        int i = this.runningAction;
        if (i >= 0) {
            this.actions.get(i).onCaptureProgressed(actionHolder, captureRequest, captureResult);
        }
    }

    @Override // com.otaliastudios.cameraview.engine.action.BaseAction, com.otaliastudios.cameraview.engine.action.Action
    public void onCaptureCompleted(ActionHolder actionHolder, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.onCaptureCompleted(actionHolder, captureRequest, totalCaptureResult);
        int i = this.runningAction;
        if (i >= 0) {
            this.actions.get(i).onCaptureCompleted(actionHolder, captureRequest, totalCaptureResult);
        }
    }
}
