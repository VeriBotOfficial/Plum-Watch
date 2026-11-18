package com.baidu.ar.bean;

/* JADX INFO: loaded from: classes16.dex */
public enum RotationType {
    ROTATE_0(0),
    ROTATE_90(90),
    ROTATE_180(180),
    ROTATE_270(270);

    private final int mDegree;

    RotationType(int r3) {
        this.mDegree = r3;
    }

    public int getDegree() {
        return this.mDegree;
    }
}
