package com.bytedance.sdk.openadsdk.api.nativeAd;

/* loaded from: classes14.dex */
public class PAGImageItem {
    private final int fxn;
    private final String gff;
    private float hm;
    private final int kg;

    public PAGImageItem(int i, int i2, String str, float f) {
        this.fxn = i;
        this.kg = i2;
        this.gff = str;
        this.hm = f;
    }

    public PAGImageItem(int i, int i2, String str) {
        this(i, i2, str, 0.0f);
    }

    public int getHeight() {
        return this.fxn;
    }

    public int getWidth() {
        return this.kg;
    }

    public String getImageUrl() {
        return this.gff;
    }

    public float getDuration() {
        return this.hm;
    }
}
