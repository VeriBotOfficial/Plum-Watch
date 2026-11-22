package com.otaliastudios.cameraview.engine.action;

import java.util.Arrays;

/* loaded from: classes17.dex */
public class Actions {
    public static BaseAction together(BaseAction... baseActionArr) {
        return new TogetherAction(Arrays.asList(baseActionArr));
    }

    public static BaseAction sequence(BaseAction... baseActionArr) {
        return new SequenceAction(Arrays.asList(baseActionArr));
    }

    public static BaseAction timeout(long j, BaseAction baseAction) {
        return new TimeoutAction(j, baseAction);
    }
}
