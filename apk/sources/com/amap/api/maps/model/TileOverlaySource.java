package com.amap.api.maps.model;

/* JADX INFO: loaded from: classes7.dex */
public class TileOverlaySource {
    public static int TILESOURCE_TYPE_FBO_TEXTURE = 4;
    public static int TILESOURCE_TYPE_IMAGE = 1;
    public static int TILESOURCE_TYPE_IMAGE_DEM = 3;
    public static int TILESOURCE_TYPE_VECTOR = 2;
    private String attribute;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f2057id;
    private final int type;
    private final String url;
    private int minZoom = 3;
    private int maxZoom = 20;
    private boolean cacheEnabled = true;

    public TileOverlaySource(int r2, int r3, String str) {
        this.url = str;
        this.type = r3;
        this.f2057id = r2;
    }

    public int getId() {
        return this.f2057id;
    }

    public int getMaxZoom() {
        return this.maxZoom;
    }

    public int getMinZoom() {
        return this.minZoom;
    }

    public int getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isCacheEnabled() {
        return this.cacheEnabled;
    }

    public void setCacheEnabled(boolean z) {
        this.cacheEnabled = z;
    }

    public void setMaxZoom(int r1) {
        this.maxZoom = r1;
    }

    public void setMinZoom(int r1) {
        this.minZoom = r1;
    }
}
