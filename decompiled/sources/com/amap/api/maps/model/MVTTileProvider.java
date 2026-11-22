package com.amap.api.maps.model;

import com.amap.api.col.p0003sl.c4;

/* loaded from: classes11.dex */
public final class MVTTileProvider implements TileProvider {

    /* renamed from: id, reason: collision with root package name */
    private String f2048id;
    private String key;
    private int tileSize = 256;
    private String url;

    private class a extends c4 {
        String o;

        public a(MVTTileProvider mVTTileProvider, String str) {
            this.isPostFlag = false;
            this.o = str;
        }

        @Override // com.amap.api.col.p0003sl.ob
        public String getURL() {
            return this.o;
        }
    }

    public MVTTileProvider(String str, String str2, String str3) {
        this.url = str;
        this.key = str2;
        this.f2048id = str3;
    }

    public String getId() {
        return this.f2048id;
    }

    public String getKey() {
        return this.key;
    }

    @Override // com.amap.api.maps.model.TileProvider
    public Tile getTile(int i, int i2, int i3) {
        byte[] bArr;
        try {
            bArr = new a(this, String.format(this.url + "?z=%d&x=%d&y=%d&size=%d&key=" + this.key + "&id=" + this.f2048id, Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.tileSize))).makeHttpRequestWithInterrupted();
        } catch (Exception unused) {
            bArr = null;
        }
        if (bArr == null) {
            return TileProvider.NO_TILE;
        }
        int i4 = this.tileSize;
        return new Tile(i4, i4, bArr, false);
    }

    @Override // com.amap.api.maps.model.TileProvider
    public int getTileHeight() {
        return this.tileSize;
    }

    @Override // com.amap.api.maps.model.TileProvider
    public int getTileWidth() {
        return this.tileSize;
    }

    public String getUrl() {
        return this.url;
    }
}
