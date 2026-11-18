package com.compress.view;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public class ColorStop {
    private int color;
    private float stop;

    public ColorStop() {
        this.stop = 0.0f;
        this.color = 0;
    }

    public ColorStop(float f, int r2) {
        this.stop = f;
        this.color = r2;
    }

    public float getStop() {
        return this.stop;
    }

    public void setStop(float f) {
        this.stop = f;
    }

    public int getColor() {
        return this.color;
    }

    public void setColor(int r1) {
        this.color = r1;
    }

    public byte[] toByteArray() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putFloat(this.stop);
        byteBufferAllocate.putInt(this.color);
        return byteBufferAllocate.array();
    }
}
