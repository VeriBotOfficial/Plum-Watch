package com.compress.utils;

/* JADX INFO: loaded from: classes11.dex */
public class DecompressRet2 {
    private byte[] alphaChannel;
    private byte[] blueChannel;
    private int format;
    private byte[] greenChannel;
    private int height;
    private byte[] redChannel;
    private int width;

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

    public int getFormat() {
        return this.format;
    }

    public void setFormat(int r1) {
        this.format = r1;
    }
}
