package com.huawei.hms.scankit.drawable;

import android.view.animation.Interpolator;
import com.autonavi.aps.amapapi.config.Const;
import java.math.BigDecimal;

/* JADX INFO: compiled from: CubicBezierInterpolator.java */
/* JADX INFO: loaded from: classes11.dex */
public class a implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final BigDecimal f10534a;
    private static final BigDecimal b;
    private static final float c;
    private float d;
    private float e;
    private float f;
    private float g;

    static {
        BigDecimal bigDecimal = new BigDecimal(Float.toString(1.0f));
        f10534a = bigDecimal;
        BigDecimal bigDecimal2 = new BigDecimal(Long.toString(Const.L_SAME_TOAST));
        b = bigDecimal2;
        c = bigDecimal.divide(bigDecimal2, 20, 4).floatValue();
    }

    public a(float f, float f2, float f3, float f4) {
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
    }

    private long a(float f) {
        long j = 0;
        long j2 = Const.L_SAME_TOAST;
        while (j <= j2) {
            long j3 = (j + j2) >>> 1;
            float fB = b(c * j3);
            if (fB < f) {
                j = j3 + 1;
            } else {
                if (fB <= f) {
                    return j3;
                }
                j2 = j3 - 1;
            }
        }
        return j;
    }

    private float b(float f) {
        float f2 = 1.0f - f;
        float f3 = 3.0f * f2;
        return (f2 * f3 * f * this.d) + (f3 * f * f * this.f) + (f * f * f);
    }

    private float c(float f) {
        float f2 = 1.0f - f;
        float f3 = 3.0f * f2;
        return (f2 * f3 * f * this.e) + (f3 * f * f * this.g) + (f * f * f);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return c(c * a(f));
    }

    public String toString() {
        return a();
    }

    private String a() {
        StringBuilder sb = new StringBuilder("CubicBezierInterpolator  mControlPoint1x = ");
        sb.append(this.d);
        sb.append(", mControlPoint1y = ").append(this.e);
        sb.append(", mControlPoint2x = ").append(this.f);
        sb.append(", mControlPoint2y = ").append(this.g);
        return sb.toString();
    }
}
