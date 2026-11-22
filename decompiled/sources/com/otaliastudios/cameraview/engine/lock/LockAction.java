package com.otaliastudios.cameraview.engine.lock;

import com.otaliastudios.cameraview.engine.action.ActionWrapper;
import com.otaliastudios.cameraview.engine.action.Actions;
import com.otaliastudios.cameraview.engine.action.BaseAction;

/* loaded from: classes17.dex */
public class LockAction extends ActionWrapper {
    private final BaseAction action = Actions.together(new ExposureLock(), new FocusLock(), new WhiteBalanceLock());

    @Override // com.otaliastudios.cameraview.engine.action.ActionWrapper
    public BaseAction getAction() {
        return this.action;
    }
}
