package com.otaliastudios.cameraview.size;

/* JADX INFO: loaded from: classes2.dex */
public class Size implements Comparable<Size> {
    private final int mHeight;
    private final int mWidth;

    public Size(int r1, int r2) {
        this.mWidth = r1;
        this.mHeight = r2;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public Size flip() {
        return new Size(this.mHeight, this.mWidth);
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

    public String toString() {
        return this.mWidth + "x" + this.mHeight;
    }

    public int hashCode() {
        int r0 = this.mHeight;
        int r1 = this.mWidth;
        return r0 ^ ((r1 >>> 16) | (r1 << 16));
    }

    @Override // java.lang.Comparable
    public int compareTo(Size size) {
        return (this.mWidth * this.mHeight) - (size.mWidth * size.mHeight);
    }
}
