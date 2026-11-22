package com.amap.api.maps.model;

import android.graphics.Color;
import android.util.Log;
import com.amap.api.maps.AMapException;
import com.autonavi.aps.amapapi.config.Const;
import java.util.HashMap;

/* loaded from: classes11.dex */
public class Gradient {
    private static final int DEFAULT_COLOR_MAP_SIZE = 1000;
    private boolean isAvailable;
    private int mColorMapSize;
    private int[] mColors;
    private float[] mStartPoints;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f2046a;
        private final int b;
        private final float c;

        private b(int i, int i2, float f) {
            this.f2046a = i;
            this.b = i2;
            this.c = f;
        }
    }

    public Gradient(int[] iArr, float[] fArr) {
        this(iArr, fArr, 1000);
    }

    protected int[] generateColorMap(double d) {
        HashMap hashMap = new HashMap(32);
        int i = 0;
        if (this.mStartPoints[0] != 0.0f) {
            hashMap.put(0, new b(Color.argb(0, Color.red(this.mColors[0]), Color.green(this.mColors[0]), Color.blue(this.mColors[0])), this.mColors[0], this.mColorMapSize * this.mStartPoints[0]));
        }
        for (int i2 = 1; i2 < this.mColors.length; i2++) {
            int i3 = i2 - 1;
            Integer valueOf = Integer.valueOf((int) (this.mColorMapSize * this.mStartPoints[i3]));
            int[] iArr = this.mColors;
            int i4 = iArr[i3];
            int i5 = iArr[i2];
            float f = this.mColorMapSize;
            float[] fArr = this.mStartPoints;
            hashMap.put(valueOf, new b(i4, i5, f * (fArr[i2] - fArr[i3])));
        }
        float[] fArr2 = this.mStartPoints;
        if (fArr2[fArr2.length - 1] != 1.0f) {
            int length = fArr2.length - 1;
            Integer valueOf2 = Integer.valueOf((int) (this.mColorMapSize * fArr2[length]));
            int i6 = this.mColors[length];
            hashMap.put(valueOf2, new b(i6, i6, this.mColorMapSize * (1.0f - this.mStartPoints[length])));
        }
        int[] iArr2 = new int[this.mColorMapSize];
        b bVar = (b) hashMap.get(0);
        int i7 = 0;
        int i8 = 0;
        while (i7 < this.mColorMapSize) {
            if (hashMap.containsKey(Integer.valueOf(i7))) {
                bVar = (b) hashMap.get(Integer.valueOf(i7));
                i8 = i7;
            }
            float f2 = (i7 - i8) / bVar.c;
            int i9 = bVar.f2046a;
            int i10 = bVar.b;
            int alpha = (int) (((Color.alpha(i10) - Color.alpha(i9)) * f2) + Color.alpha(i9));
            float[] fArr3 = new float[3];
            Color.RGBToHSV(Color.red(i9), Color.green(i9), Color.blue(i9), fArr3);
            float[] fArr4 = new float[3];
            Color.RGBToHSV(Color.red(i10), Color.green(i10), Color.blue(i10), fArr4);
            float f3 = fArr3[i];
            float f4 = fArr4[i];
            float f5 = 180;
            int i11 = i;
            if (f3 - f4 > f5) {
                fArr4[i11] = f4 + 360;
            } else if (f4 - f3 > f5) {
                fArr3[i11] = f3 + 360;
            }
            float[] fArr5 = new float[3];
            for (int i12 = i11; i12 < 3; i12++) {
                float f6 = fArr4[i12];
                float f7 = fArr3[i12];
                fArr5[i12] = ((f6 - f7) * f2) + f7;
            }
            iArr2[i7] = Color.HSVToColor(alpha, fArr5);
            i7++;
            i = i11;
        }
        int i13 = i;
        if (d != 1.0d) {
            for (int i14 = i13; i14 < this.mColorMapSize; i14++) {
                int i15 = iArr2[i14];
                iArr2[i14] = Color.argb((int) (Color.alpha(i15) * d), Color.red(i15), Color.green(i15), Color.blue(i15));
            }
        }
        return iArr2;
    }

    public int[] getColors() {
        return this.mColors;
    }

    public float[] getStartPoints() {
        return this.mStartPoints;
    }

    protected boolean isAvailable() {
        return this.isAvailable;
    }

    private Gradient(int[] iArr, float[] fArr, int i) {
        this.isAvailable = true;
        try {
            if (iArr == null || fArr == null) {
                throw new AMapException("colors and startPoints should not be null");
            }
            if (iArr.length != fArr.length) {
                throw new AMapException("colors and startPoints should be same length");
            }
            if (iArr.length == 0) {
                throw new AMapException("No colors have been defined");
            }
            for (int i2 = 1; i2 < fArr.length; i2++) {
                if (fArr[i2] < fArr[i2 - 1]) {
                    throw new AMapException("startPoints should be in increasing order");
                }
            }
            this.mColorMapSize = i;
            int[] iArr2 = new int[iArr.length];
            this.mColors = iArr2;
            this.mStartPoints = new float[fArr.length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            System.arraycopy(fArr, 0, this.mStartPoints, 0, fArr.length);
            this.isAvailable = true;
        } catch (AMapException e) {
            this.isAvailable = false;
            Log.e(Const.STR_PUBLIC_TAG, e.getErrorMessage());
            e.printStackTrace();
        }
    }
}
