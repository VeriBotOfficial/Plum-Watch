package com.baidu.ar.arplay.core.pixel;

/* JADX INFO: loaded from: classes16.dex */
public class FrameSize {
    private int mHeight;
    private int mWidth;

    public FrameSize(int r1, int r2) {
        this.mWidth = r1;
        this.mHeight = r2;
    }

    public FrameSize(FrameSize frameSize) {
        this.mWidth = frameSize.getWidth();
        this.mHeight = frameSize.getHeight();
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public void setHeight(int r1) {
        this.mHeight = r1;
    }

    public void setWidth(int r1) {
        this.mWidth = r1;
    }
}
