package com.bytedance.adsdk.kg;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes15.dex */
class xdg implements Interpolator {
    private final float[] fxn;
    private final float[] kg;

    xdg(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int r2 = (int) (length / 0.002f);
        int r3 = r2 + 1;
        this.fxn = new float[r3];
        this.kg = new float[r3];
        float[] fArr = new float[2];
        for (int r5 = 0; r5 < r3; r5++) {
            pathMeasure.getPosTan((r5 * length) / r2, fArr, null);
            this.fxn[r5] = fArr[0];
            this.kg[r5] = fArr[1];
        }
    }

    xdg(float f, float f2, float f3, float f4) {
        this(fxn(f, f2, f3, f4));
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int length = this.fxn.length - 1;
        int r3 = 0;
        while (length - r3 > 1) {
            int r4 = (r3 + length) / 2;
            if (f < this.fxn[r4]) {
                length = r4;
            } else {
                r3 = r4;
            }
        }
        float[] fArr = this.fxn;
        float f2 = fArr[length];
        float f3 = fArr[r3];
        float f4 = f2 - f3;
        if (f4 == 0.0f) {
            return this.kg[r3];
        }
        float f5 = (f - f3) / f4;
        float[] fArr2 = this.kg;
        float f6 = fArr2[r3];
        return f6 + (f5 * (fArr2[length] - f6));
    }

    private static Path fxn(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }
}
