package com.baidu.mapapi.bikenavi.params;

/* loaded from: classes13.dex */
public enum BikeRouteNodeType {
    LOCATION(1),
    KEYWORD(2);

    private int nativeType;

    BikeRouteNodeType(int i) {
        this.nativeType = i;
    }

    public int getNativeType() {
        return this.nativeType;
    }
}
