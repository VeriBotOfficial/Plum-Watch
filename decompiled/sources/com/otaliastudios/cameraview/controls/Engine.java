package com.otaliastudios.cameraview.controls;

/* loaded from: classes17.dex */
public enum Engine implements Control {
    CAMERA1(0),
    CAMERA2(1);

    private int value;
    static final Engine DEFAULT = CAMERA1;

    Engine(int i) {
        this.value = i;
    }

    int value() {
        return this.value;
    }

    static Engine fromValue(int i) {
        for (Engine engine : values()) {
            if (engine.value() == i) {
                return engine;
            }
        }
        return DEFAULT;
    }
}
