package com.compress.view;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes11.dex */
public class Rect {
    public short h;
    public short w;
    public short x;
    public short y;

    public int getSize() {
        return 8;
    }

    public Rect() {
        this.x = (short) 0;
        this.y = (short) 0;
        this.w = (short) 0;
        this.h = (short) 0;
    }

    public Rect(short s, short s2, short s3, short s4) {
        this.x = s;
        this.y = s2;
        this.w = s3;
        this.h = s4;
    }

    public short getX() {
        return this.x;
    }

    public void setX(short s) {
        this.x = s;
    }

    public short getY() {
        return this.y;
    }

    public void setY(short s) {
        this.y = s;
    }

    public short getW() {
        return this.w;
    }

    public void setW(short s) {
        this.w = s;
    }

    public short getH() {
        return this.h;
    }

    public void setH(short s) {
        this.h = s;
    }

    public byte[] getBytes() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(getSize());
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort(this.x);
        byteBufferAllocate.putShort(this.y);
        byteBufferAllocate.putShort(this.w);
        byteBufferAllocate.putShort(this.h);
        return byteBufferAllocate.array();
    }
}
