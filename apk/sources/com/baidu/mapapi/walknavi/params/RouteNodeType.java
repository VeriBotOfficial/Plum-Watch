package com.baidu.mapapi.walknavi.params;

/* JADX INFO: loaded from: classes15.dex */
public enum RouteNodeType {
    LOCATION(1),
    KEYWORD(2);

    private int b;

    RouteNodeType(int r3) {
        this.b = r3;
    }

    public int getNativeType() {
        return this.b;
    }
}
