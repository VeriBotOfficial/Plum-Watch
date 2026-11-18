package com.baidu.ar.algo;

/* JADX INFO: loaded from: classes16.dex */
public enum FrameType {
    TYPE_YUV(0),
    TYPE_RGB(1),
    TYPE_BGR(2),
    TYPE_RGBA(3),
    TYPE_GRAY(4);

    private int value;

    FrameType(int r3) {
        this.value = r3;
    }

    public int getValue() {
        return this.value;
    }
}
