package com.autonavi.base.ae.gmap.gloverlay;

/* JADX INFO: loaded from: classes16.dex */
public class GLOverlayTexture {
    public int mAnchor;
    public float mAnchorXRatio;
    public float mAnchorYRatio;
    public int mHeight;
    public int mResHeight;
    public int mResId;
    public int mResWidth;
    public int mWidth;

    public GLOverlayTexture(int r1, int r2, int r3, int r4) {
        this.mResId = r1;
        this.mWidth = r3;
        this.mHeight = r4;
        this.mResWidth = r3;
        this.mResHeight = r4;
        this.mAnchor = r2;
    }

    public GLOverlayTexture(int r1, int r2, float f, float f2, int r5, int r6) {
        this.mResId = r1;
        this.mWidth = r5;
        this.mHeight = r6;
        this.mResWidth = r5;
        this.mResHeight = r6;
        this.mAnchor = r2;
        this.mAnchorXRatio = f;
        this.mAnchorYRatio = f2;
    }
}
