package com.eclipsesource.v8.debug;

/* JADX INFO: loaded from: classes11.dex */
public enum StepAction {
    STEP_OUT(0),
    STEP_NEXT(1),
    STEP_IN(2),
    STEP_FRAME(3);

    int index;

    StepAction(int r3) {
        this.index = r3;
    }
}
