package com.baidu.mapapi.map;

import android.graphics.Color;
import java.util.HashMap;

/* loaded from: classes13.dex */
public class Gradient {

    /* renamed from: a, reason: collision with root package name */
    private final int f7908a;
    private final int[] b;
    private final float[] c;
    float[] d;

    private class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f7909a;
        private final int b;
        private final float c;

        private b(int i, int i2, float f) {
            this.f7909a = i;
            this.b = i2;
            this.c = f;
        }
    }

    public Gradient(int[] iArr, float[] fArr) {
        this(iArr, fArr, 1000);
    }

    private HashMap<Integer, b> a() {
        HashMap<Integer, b> hashMap = new HashMap<>();
        if (this.c[0] != 0.0f) {
            hashMap.put(0, new b(Color.argb(0, Color.red(this.b[0]), Color.green(this.b[0]), Color.blue(this.b[0])), this.b[0], this.f7908a * this.c[0]));
        }
        for (int i = 1; i < this.b.length; i++) {
            int i2 = i - 1;
            Integer valueOf = Integer.valueOf((int) (this.f7908a * this.c[i2]));
            int[] iArr = this.b;
            int i3 = iArr[i2];
            int i4 = iArr[i];
            float f = this.f7908a;
            float[] fArr = this.c;
            hashMap.put(valueOf, new b(i3, i4, f * (fArr[i] - fArr[i2])));
        }
        float[] fArr2 = this.c;
        if (fArr2[fArr2.length - 1] != 1.0f) {
            int length = fArr2.length - 1;
            Integer valueOf2 = Integer.valueOf((int) (this.f7908a * fArr2[length]));
            int i5 = this.b[length];
            hashMap.put(valueOf2, new b(i5, i5, this.f7908a * (1.0f - this.c[length])));
        }
        return hashMap;
    }

    float[] b() {
        float[] fArr = this.d;
        if (fArr != null) {
            return fArr;
        }
        this.d = new float[this.f7908a];
        int i = 0;
        while (i < this.f7908a) {
            int i2 = i + 1;
            this.d[i] = i2 * 0.001f;
            i = i2;
        }
        return this.d;
    }

    public int[] getColors() {
        return this.b;
    }

    public float[] getStartPoints() {
        return this.c;
    }

    private Gradient(int[] iArr, float[] fArr, int i) {
        int[] a2 = com.baidu.platform.comapi.util.d.a(iArr);
        if (a2 == null || fArr == null) {
            throw new IllegalArgumentException("BDMapSDKException: colors and startPoints should not be null");
        }
        if (a2.length != fArr.length) {
            throw new IllegalArgumentException("BDMapSDKException: colors and startPoints should be same length");
        }
        if (a2.length == 0) {
            throw new IllegalArgumentException("BDMapSDKException: No colors have been defined");
        }
        for (int i2 = 1; i2 < fArr.length; i2++) {
            if (fArr[i2] <= fArr[i2 - 1]) {
                throw new IllegalArgumentException("BDMapSDKException: startPoints should be in increasing order");
            }
        }
        this.f7908a = i;
        int[] iArr2 = new int[a2.length];
        this.b = iArr2;
        float[] fArr2 = new float[fArr.length];
        this.c = fArr2;
        System.arraycopy(a2, 0, iArr2, 0, a2.length);
        System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
    }

    int[] a(double d) {
        HashMap<Integer, b> a2 = a();
        int[] iArr = new int[this.f7908a];
        b bVar = a2.get(0);
        int i = 0;
        for (int i2 = 0; i2 < this.f7908a; i2++) {
            if (a2.containsKey(Integer.valueOf(i2))) {
                bVar = a2.get(Integer.valueOf(i2));
                i = i2;
            }
            iArr[i2] = a(bVar.f7909a, bVar.b, (i2 - i) / bVar.c);
        }
        if (d != 1.0d) {
            for (int i3 = 0; i3 < this.f7908a; i3++) {
                int i4 = iArr[i3];
                iArr[i3] = Color.argb((int) (Color.alpha(i4) * d), Color.red(i4), Color.green(i4), Color.blue(i4));
            }
        }
        return iArr;
    }

    private static int a(int i, int i2, float f) {
        int alpha = (int) (((Color.alpha(i2) - Color.alpha(i)) * f) + Color.alpha(i));
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i), Color.green(i), Color.blue(i), fArr);
        float[] fArr2 = new float[3];
        Color.RGBToHSV(Color.red(i2), Color.green(i2), Color.blue(i2), fArr2);
        float f2 = fArr[0];
        float f3 = fArr2[0];
        if (f2 - f3 > 180.0f) {
            fArr2[0] = f3 + 360.0f;
        } else if (f3 - f2 > 180.0f) {
            fArr[0] = f2 + 360.0f;
        }
        float[] fArr3 = new float[3];
        for (int i3 = 0; i3 < 3; i3++) {
            float f4 = fArr2[i3];
            float f5 = fArr[i3];
            fArr3[i3] = ((f4 - f5) * f) + f5;
        }
        return Color.HSVToColor(alpha, fArr3);
    }
}
