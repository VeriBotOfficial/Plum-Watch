package com.compress.view;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes14.dex */
public class Point {
    public short x;
    public short y;

    public static int getSize() {
        return 4;
    }

    public Point() {
        this.x = (short) 0;
        this.y = (short) 0;
    }

    public Point(short s, short s2) {
        this.x = s;
        this.y = s2;
    }

    public int getX() {
        return this.x;
    }

    public void setX(short s) {
        this.x = s;
    }

    public int getY() {
        return this.y;
    }

    public void setY(short s) {
        this.y = s;
    }

    public byte[] getBytes() {
        ByteBuffer order = ByteBuffer.allocate(getSize()).order(ByteOrder.LITTLE_ENDIAN);
        order.putShort(this.x);
        order.putShort(this.y);
        return order.array();
    }
}
