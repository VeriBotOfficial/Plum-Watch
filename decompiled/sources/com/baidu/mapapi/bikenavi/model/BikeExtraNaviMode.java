package com.baidu.mapapi.bikenavi.model;

/* loaded from: classes13.dex */
public enum BikeExtraNaviMode {
    NORMAL(0),
    LIGHT_NAV(3);

    private int b;

    BikeExtraNaviMode(int i) {
        this.b = i;
    }

    public int getValue() {
        return this.b;
    }

    public void setValue(int i) {
        this.b = i;
    }
}
