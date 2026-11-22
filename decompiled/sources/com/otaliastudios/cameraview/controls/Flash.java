package com.otaliastudios.cameraview.controls;

/* loaded from: classes17.dex */
public enum Flash implements Control {
    OFF(0),
    ON(1),
    AUTO(2),
    TORCH(3);

    private int value;
    static final Flash DEFAULT = OFF;

    Flash(int i) {
        this.value = i;
    }

    int value() {
        return this.value;
    }

    static Flash fromValue(int i) {
        for (Flash flash : values()) {
            if (flash.value() == i) {
                return flash;
            }
        }
        return DEFAULT;
    }
}
