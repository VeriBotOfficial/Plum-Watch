package com.baidu.ar.arplay.core.renderer;

/* JADX INFO: loaded from: classes16.dex */
public enum OutputFillMode {
    StretchToFill(0),
    KeepRatioFill(1),
    KeepRatioCrop(2);

    private final int value;

    OutputFillMode(int r3) {
        this.value = r3;
    }

    public int getValue() {
        return this.value;
    }
}
