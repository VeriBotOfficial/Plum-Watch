package com.baidu.ar.marker;

/* JADX INFO: loaded from: classes16.dex */
public enum ReturnType {
    RETURN_LONGTITUDE_LATITUDE(0),
    RETURN_6DOF_POSE(1),
    RETURN_LONGTITUDE_LATITUDE_6DOF_POSE(2);

    private int value;

    ReturnType(int r3) {
        this.value = r3;
    }

    public int getValue() {
        return this.value;
    }
}
