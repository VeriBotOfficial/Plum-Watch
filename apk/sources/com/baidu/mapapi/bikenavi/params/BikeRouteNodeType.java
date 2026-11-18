package com.baidu.mapapi.bikenavi.params;

/* JADX INFO: loaded from: classes15.dex */
public enum BikeRouteNodeType {
    LOCATION(1),
    KEYWORD(2);

    private int nativeType;

    BikeRouteNodeType(int r3) {
        this.nativeType = r3;
    }

    public int getNativeType() {
        return this.nativeType;
    }
}
