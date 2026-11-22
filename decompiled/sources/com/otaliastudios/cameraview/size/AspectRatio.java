package com.otaliastudios.cameraview.size;

import java.util.HashMap;

/* loaded from: classes17.dex */
public class AspectRatio implements Comparable<AspectRatio> {
    static final HashMap<String, AspectRatio> sCache = new HashMap<>(16);
    private final int mX;
    private final int mY;

    public static AspectRatio of(Size size) {
        return of(size.getWidth(), size.getHeight());
    }

    public static AspectRatio of(int i, int i2) {
        int gcd = gcd(i, i2);
        if (gcd > 0) {
            i /= gcd;
        }
        if (gcd > 0) {
            i2 /= gcd;
        }
        String str = i + ":" + i2;
        HashMap<String, AspectRatio> hashMap = sCache;
        AspectRatio aspectRatio = hashMap.get(str);
        if (aspectRatio != null) {
            return aspectRatio;
        }
        AspectRatio aspectRatio2 = new AspectRatio(i, i2);
        hashMap.put(str, aspectRatio2);
        return aspectRatio2;
    }

    public static AspectRatio parse(String str) {
        String[] split = str.split(":");
        if (split.length != 2) {
            throw new NumberFormatException("Illegal AspectRatio string. Must be x:y");
        }
        return of(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
    }

    private AspectRatio(int i, int i2) {
        this.mX = i;
        this.mY = i2;
    }

    public int getX() {
        return this.mX;
    }

    public int getY() {
        return this.mY;
    }

    public boolean matches(Size size) {
        return equals(of(size));
    }

    public boolean matches(Size size, float f) {
        return Math.abs(toFloat() - of(size).toFloat()) <= f;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof AspectRatio) && toFloat() == ((AspectRatio) obj).toFloat();
    }

    public String toString() {
        return this.mX + ":" + this.mY;
    }

    public float toFloat() {
        return this.mX / this.mY;
    }

    public int hashCode() {
        return Float.floatToIntBits(toFloat());
    }

    @Override // java.lang.Comparable
    public int compareTo(AspectRatio aspectRatio) {
        return Float.compare(toFloat(), aspectRatio.toFloat());
    }

    public AspectRatio flip() {
        return of(this.mY, this.mX);
    }

    private static int gcd(int i, int i2) {
        while (true) {
            int i3 = i2;
            int i4 = i;
            i = i3;
            if (i == 0) {
                return i4;
            }
            i2 = i4 % i;
        }
    }
}
