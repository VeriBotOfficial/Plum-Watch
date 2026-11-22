package com.otaliastudios.cameraview.engine.lock;

import com.otaliastudios.cameraview.engine.action.ActionHolder;
import com.otaliastudios.cameraview.engine.action.BaseAction;

/* loaded from: classes17.dex */
public abstract class BaseLock extends BaseAction {
    protected abstract boolean checkIsSupported(ActionHolder actionHolder);

    protected abstract boolean checkShouldSkip(ActionHolder actionHolder);

    protected abstract void onStarted(ActionHolder actionHolder);

    @Override // com.otaliastudios.cameraview.engine.action.BaseAction
    protected final void onStart(ActionHolder actionHolder) {
        super.onStart(actionHolder);
        boolean checkShouldSkip = checkShouldSkip(actionHolder);
        if (checkIsSupported(actionHolder) && !checkShouldSkip) {
            onStarted(actionHolder);
        } else {
            setState(Integer.MAX_VALUE);
        }
    }
}
