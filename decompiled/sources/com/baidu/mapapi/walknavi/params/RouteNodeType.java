package com.baidu.mapapi.walknavi.params;

/* loaded from: classes13.dex */
public enum RouteNodeType {
    LOCATION(1),
    KEYWORD(2);

    private int b;

    RouteNodeType(int i) {
        this.b = i;
    }

    public int getNativeType() {
        return this.b;
    }
}
