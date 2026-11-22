package com.baidu.mapapi.walknavi.model;

/* loaded from: classes13.dex */
public enum WalkExtraNaviMode {
    NORMAL(0),
    LIGHT_NAV(3);

    private int b;

    WalkExtraNaviMode(int i) {
        this.b = i;
    }

    public int getValue() {
        return this.b;
    }

    public void setValue(int i) {
        this.b = i;
    }
}
