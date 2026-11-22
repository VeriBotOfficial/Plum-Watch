package com.baidu.mapapi.map.bmsdk.ui;

/* loaded from: classes13.dex */
public enum UIGravity {
    LEFT(1),
    TOP(2),
    RIGHT(4),
    BOTTOM(8),
    CENTER_HORIZONTAL(16),
    CENTER_VERTICAL(32),
    CENTER(48);

    private int b;

    UIGravity(int i) {
        this.b = i;
    }

    public int getNumber() {
        return this.b;
    }
}
