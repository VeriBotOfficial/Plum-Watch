package com.compress.api;

/* JADX INFO: loaded from: classes11.dex */
public class CompressParam {
    private byte[] alphaChannel;
    private byte[] blueChannel;
    private int cmpMode;
    private byte[] greenChannel;
    private int height;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f9588id;
    private int modeAlpha;
    private int modeRgb;
    private int pixelFormat;
    private byte[] redChannel;
    private int stride;
    private int tileWidth;
    private int width;

    public int getId() {
        return this.f9588id;
    }

    public void setId(int r1) {
        this.f9588id = r1;
    }

    public int getCmpMode() {
        return this.cmpMode;
    }

    public void setCmpMode(int r1) {
        this.cmpMode = r1;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int r1) {
        this.width = r1;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int r1) {
        this.height = r1;
    }

    public int getStride() {
        return this.stride;
    }

    public void setStride(int r1) {
        this.stride = r1;
    }

    public int getPixelFormat() {
        return this.pixelFormat;
    }

    public void setPixelFormat(int r1) {
        this.pixelFormat = r1;
    }

    public int getTileWidth() {
        return this.tileWidth;
    }

    public void setTileWidth(int r1) {
        this.tileWidth = r1;
    }

    public int getModeAlpha() {
        return this.modeAlpha;
    }

    public void setModeAlpha(int r1) {
        this.modeAlpha = r1;
    }

    public int getModeRgb() {
        return this.modeRgb;
    }

    public void setModeRgb(int r1) {
        this.modeRgb = r1;
    }

    public byte[] getRedChannel() {
        return this.redChannel;
    }

    public void setRedChannel(byte[] bArr) {
        this.redChannel = bArr;
    }

    public byte[] getGreenChannel() {
        return this.greenChannel;
    }

    public void setGreenChannel(byte[] bArr) {
        this.greenChannel = bArr;
    }

    public byte[] getBlueChannel() {
        return this.blueChannel;
    }

    public void setBlueChannel(byte[] bArr) {
        this.blueChannel = bArr;
    }

    public byte[] getAlphaChannel() {
        return this.alphaChannel;
    }

    public void setAlphaChannel(byte[] bArr) {
        this.alphaChannel = bArr;
    }
}
