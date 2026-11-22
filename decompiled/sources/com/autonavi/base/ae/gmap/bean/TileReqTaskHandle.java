package com.autonavi.base.ae.gmap.bean;

import com.amap.api.maps.model.Tile;

/* loaded from: classes12.dex */
public class TileReqTaskHandle {
    long nativeObj;
    int status;
    Tile tile;

    public void finish(Tile tile) {
        this.tile = tile;
    }
}
