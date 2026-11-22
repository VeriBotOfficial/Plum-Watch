package com.compress.view;

import java.nio.ByteBuffer;

/* loaded from: classes14.dex */
public class ColorStop {
    private int color;
    private float stop;

    public ColorStop() {
        this.stop = 0.0f;
        this.color = 0;
    }

    public ColorStop(float f, int i) {
        this.stop = f;
        this.color = i;
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

    public void setColor(int i) {
        this.color = i;
    }

    public byte[] toByteArray() {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putFloat(this.stop);
        allocate.putInt(this.color);
        return allocate.array();
    }
}
