package com.baidu.mapapi.map;

/* loaded from: classes13.dex */
public enum BMTrackType {
    Surface(3),
    Default3D(4),
    Track(5),
    TrackGradient(6);

    private int b;

    BMTrackType(int i) {
        this.b = i;
    }

    public int getType() {
        return this.b;
    }
}
