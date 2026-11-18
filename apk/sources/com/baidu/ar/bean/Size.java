package com.baidu.ar.bean;

/* JADX INFO: loaded from: classes16.dex */
public class Size {
    private int mHeight;
    private int mWidth;

    public Size() {
    }

    public Size(int r1, int r2) {
        this.mWidth = r1;
        this.mHeight = r2;
    }

    public static Size parseSize(String str) {
        int r0 = str.indexOf(42);
        if (r0 < 0) {
            r0 = str.indexOf(120);
        }
        if (r0 < 0) {
            return null;
        }
        try {
            return new Size(Integer.parseInt(str.substring(0, r0)), Integer.parseInt(str.substring(r0 + 1)));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return this.mWidth == size.mWidth && this.mHeight == size.mHeight;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int hashCode() {
        int r0 = this.mHeight;
        int r1 = this.mWidth;
        return r0 ^ ((r1 >>> 16) | (r1 << 16));
    }

    public void setHeight(int r1) {
        this.mHeight = r1;
    }

    public void setWidth(int r1) {
        this.mWidth = r1;
    }

    public String toString() {
        return this.mWidth + "x" + this.mHeight;
    }
}
