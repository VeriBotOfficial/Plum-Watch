package com.autonavi.base.ae.gmap;

/* JADX INFO: loaded from: classes16.dex */
public class AMapAppResourceItem {
    public static final int RESOURCE_TYPE_ABSPATH = 4;
    public static final int RESOURCE_TYPE_BINARY = 3;
    public static final int RESOURCE_TYPE_IMAGE = 1;
    public static final int RESOURCE_TYPE_NONE = 0;
    public static final int RESOURCE_TYPE_SVG = 2;
    private byte[] data;
    private long size;
    private int resourceType = 0;
    private boolean preAlpha = false;
    private int imageWidth = 0;
    private int imageHeight = 0;
    private float imageScale = 1.0f;

    public byte[] getData() {
        return this.data;
    }

    public int getImageHeight() {
        return this.imageHeight;
    }

    public float getImageScale() {
        return this.imageScale;
    }

    public int getImageWidth() {
        return this.imageWidth;
    }

    public int getResourceType() {
        return this.resourceType;
    }

    public long getSize() {
        return this.size;
    }

    public boolean isPreAlpha() {
        return this.preAlpha;
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public void setImageHeight(int r1) {
        this.imageHeight = r1;
    }

    public void setImageScale(float f) {
        this.imageScale = f;
    }

    public void setImageWidth(int r1) {
        this.imageWidth = r1;
    }

    public void setPreAlpha(boolean z) {
        this.preAlpha = z;
    }

    public void setResourceType(int r1) {
        this.resourceType = r1;
    }

    public void setSize(long j) {
        this.size = j;
    }
}
