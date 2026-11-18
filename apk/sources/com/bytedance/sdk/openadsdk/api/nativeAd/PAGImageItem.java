package com.bytedance.sdk.openadsdk.api.nativeAd;

/* JADX INFO: loaded from: classes11.dex */
public class PAGImageItem {
    private final int fxn;
    private final String gff;
    private float hm;
    private final int kg;

    public PAGImageItem(int r1, int r2, String str, float f) {
        this.fxn = r1;
        this.kg = r2;
        this.gff = str;
        this.hm = f;
    }

    public PAGImageItem(int r2, int r3, String str) {
        this(r2, r3, str, 0.0f);
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
