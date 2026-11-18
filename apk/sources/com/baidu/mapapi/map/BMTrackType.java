package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes15.dex */
public enum BMTrackType {
    Surface(3),
    Default3D(4),
    Track(5),
    TrackGradient(6);

    private int b;

    BMTrackType(int r3) {
        this.b = r3;
    }

    public int getType() {
        return this.b;
    }
}
