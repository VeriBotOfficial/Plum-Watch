package com.sifli.watchfacesdk.manager;

/* loaded from: classes17.dex */
public class SFPreviewVideoConfiguration {
    private boolean isMirroredHorizontally;
    private float jpegQuality;
    private int rotation = 90;
    private int watchScreenHeight;
    private int watchScreenWidth;

    public int getWatchScreenWidth() {
        return this.watchScreenWidth;
    }

    public void setWatchScreenWidth(int i) {
        this.watchScreenWidth = i;
    }

    public int getWatchScreenHeight() {
        return this.watchScreenHeight;
    }

    public void setWatchScreenHeight(int i) {
        this.watchScreenHeight = i;
    }

    public float getJpegQuality() {
        return this.jpegQuality;
    }

    public void setJpegQuality(float f) {
        this.jpegQuality = f;
    }

    public int getRotation() {
        return this.rotation;
    }

    public void setRotation(int i) {
        this.rotation = i;
    }

    public boolean isMirroredHorizontally() {
        return this.isMirroredHorizontally;
    }

    public void setMirroredHorizontally(boolean z) {
        this.isMirroredHorizontally = z;
    }
}
