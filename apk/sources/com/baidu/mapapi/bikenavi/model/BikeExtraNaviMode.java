package com.baidu.mapapi.bikenavi.model;

/* JADX INFO: loaded from: classes15.dex */
public enum BikeExtraNaviMode {
    NORMAL(0),
    LIGHT_NAV(3);

    private int b;

    BikeExtraNaviMode(int r3) {
        this.b = r3;
    }

    public int getValue() {
        return this.b;
    }

    public void setValue(int r1) {
        this.b = r1;
    }
}
