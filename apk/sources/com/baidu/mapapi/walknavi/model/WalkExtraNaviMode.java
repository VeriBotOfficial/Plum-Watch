package com.baidu.mapapi.walknavi.model;

/* JADX INFO: loaded from: classes15.dex */
public enum WalkExtraNaviMode {
    NORMAL(0),
    LIGHT_NAV(3);

    private int b;

    WalkExtraNaviMode(int r3) {
        this.b = r3;
    }

    public int getValue() {
        return this.b;
    }

    public void setValue(int r1) {
        this.b = r1;
    }
}
