package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes15.dex */
public enum ThinAndSmoothAlgorithm {
    ALGORITHM_NONR(1),
    DOUGLAS_PEUCKER(2),
    BEZIER_SMOOTH(32);

    private final int b;

    ThinAndSmoothAlgorithm(int r3) {
        this.b = r3;
    }

    public int getValue() {
        return this.b;
    }
}
