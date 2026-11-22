package com.otaliastudios.cameraview.engine.action;

/* loaded from: classes17.dex */
public abstract class CompletionCallback implements ActionCallback {
    protected abstract void onActionCompleted(Action action);

    @Override // com.otaliastudios.cameraview.engine.action.ActionCallback
    public final void onActionStateChanged(Action action, int i) {
        if (i == Integer.MAX_VALUE) {
            onActionCompleted(action);
        }
    }
}
