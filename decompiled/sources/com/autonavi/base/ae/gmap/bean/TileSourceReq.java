package com.autonavi.base.ae.gmap.bean;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes12.dex */
public class TileSourceReq {
    public int sourceType;
    public int x;
    public int y;
    public int zoom;

    public String toString() {
        return "TileSourceReq{x=" + this.x + ", y=" + this.y + ", zoom=" + this.zoom + ", sourceId=" + this.sourceType + AbstractJsonLexerKt.END_OBJ;
    }
}
