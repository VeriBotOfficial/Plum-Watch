package com.otaliastudios.cameraview.controls;

import android.content.Context;
import com.otaliastudios.cameraview.CameraUtils;

/* loaded from: classes17.dex */
public enum Facing implements Control {
    BACK(0),
    FRONT(1);

    private int value;

    static Facing DEFAULT(Context context) {
        if (context == null) {
            return BACK;
        }
        Facing facing = BACK;
        if (!CameraUtils.hasCameraFacing(context, facing)) {
            Facing facing2 = FRONT;
            if (CameraUtils.hasCameraFacing(context, facing2)) {
                return facing2;
            }
        }
        return facing;
    }

    Facing(int i) {
        this.value = i;
    }

    int value() {
        return this.value;
    }

    static Facing fromValue(int i) {
        for (Facing facing : values()) {
            if (facing.value() == i) {
                return facing;
            }
        }
        return null;
    }
}
