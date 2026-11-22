package com.baidu.mapapi.map;

/* loaded from: classes13.dex */
public enum ThinAndSmoothAlgorithm {
    ALGORITHM_NONR(1),
    DOUGLAS_PEUCKER(2),
    BEZIER_SMOOTH(32);

    private final int b;

    ThinAndSmoothAlgorithm(int i) {
        this.b = i;
    }

    public int getValue() {
        return this.b;
    }
}
