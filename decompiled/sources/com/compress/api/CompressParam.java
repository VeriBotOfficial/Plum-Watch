package com.compress.api;

/* loaded from: classes14.dex */
public class CompressParam {
    private byte[] alphaChannel;
    private byte[] blueChannel;
    private int cmpMode;
    private byte[] greenChannel;
    private int height;

    /* renamed from: id, reason: collision with root package name */
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

    public void setId(int i) {
        this.f9588id = i;
    }

    public int getCmpMode() {
        return this.cmpMode;
    }

    public void setCmpMode(int i) {
        this.cmpMode = i;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public int getStride() {
        return this.stride;
    }

    public void setStride(int i) {
        this.stride = i;
    }

    public int getPixelFormat() {
        return this.pixelFormat;
    }

    public void setPixelFormat(int i) {
        this.pixelFormat = i;
    }

    public int getTileWidth() {
        return this.tileWidth;
    }

    public void setTileWidth(int i) {
        this.tileWidth = i;
    }

    public int getModeAlpha() {
        return this.modeAlpha;
    }

    public void setModeAlpha(int i) {
        this.modeAlpha = i;
    }

    public int getModeRgb() {
        return this.modeRgb;
    }

    public void setModeRgb(int i) {
        this.modeRgb = i;
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
