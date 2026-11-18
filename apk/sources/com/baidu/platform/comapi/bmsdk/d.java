package com.baidu.platform.comapi.bmsdk;

/* JADX INFO: compiled from: BmScaleMode.java */
/* JADX INFO: loaded from: classes15.dex */
public enum d {
    NO_SCALE_DPI(0),
    SCALE_DPI(1),
    AUTO_SCALE(2);

    private final int e;

    d(int r3) {
        this.e = r3;
    }

    public int a() {
        return this.e;
    }
}
