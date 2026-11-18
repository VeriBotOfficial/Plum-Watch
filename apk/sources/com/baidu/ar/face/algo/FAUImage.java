package com.baidu.ar.face.algo;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public class FAUImage {
    public ByteBuffer data;
    public int format;
    public int height;
    public int width;
    public int rotation = 0;
    public int flip = 0;
    public float scale = 1.0f;
    public float timestamp = 0.0f;

    public FAUImage(ByteBuffer byteBuffer, int r2, int r3, int r4) {
        this.width = r2;
        this.height = r3;
        this.format = r4;
        this.data = byteBuffer;
    }

    public void setData(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
    }

    public void setFormat(int r1) {
        this.format = r1;
    }

    public void setHeight(int r1) {
        this.height = r1;
    }

    public void setScale(float f) {
        this.scale = f;
    }

    public void setWidth(int r1) {
        this.width = r1;
    }
}
