package com.baidu.ar.arplay.core.pixel;

/* JADX INFO: loaded from: classes16.dex */
public enum PixelRotation {
    NoRotation(0),
    RotateLeft(1),
    RotateRight(2),
    FlipVertical(3),
    FlipHorizontal(4),
    RotateRightFlipVertical(5),
    RotateRightFlipHorizontal(6),
    Rotate180(7);

    private final int value;

    PixelRotation(int r3) {
        this.value = r3;
    }

    public int getValue() {
        return this.value;
    }
}
