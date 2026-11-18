package androidx.core.util;

import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes8.dex */
public class TypedValueCompat {
    private static final float INCHES_PER_MM = 0.03937008f;
    private static final float INCHES_PER_PT = 0.013888889f;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ComplexDimensionUnit {
    }

    public static int getUnitFromComplexDimension(int r0) {
        return r0 & 15;
    }

    private TypedValueCompat() {
    }

    public static float deriveDimension(int r2, float f, DisplayMetrics displayMetrics) {
        float f2;
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.deriveDimension(r2, f, displayMetrics);
        }
        if (r2 == 0) {
            return f;
        }
        if (r2 != 1) {
            if (r2 != 2) {
                if (r2 != 3) {
                    if (r2 != 4) {
                        if (r2 != 5) {
                            throw new IllegalArgumentException("Invalid unitToConvertTo " + r2);
                        }
                        if (displayMetrics.xdpi == 0.0f) {
                            return 0.0f;
                        }
                        f /= displayMetrics.xdpi;
                        f2 = INCHES_PER_MM;
                    } else {
                        if (displayMetrics.xdpi == 0.0f) {
                            return 0.0f;
                        }
                        f2 = displayMetrics.xdpi;
                    }
                } else {
                    if (displayMetrics.xdpi == 0.0f) {
                        return 0.0f;
                    }
                    f /= displayMetrics.xdpi;
                    f2 = INCHES_PER_PT;
                }
            } else {
                if (displayMetrics.scaledDensity == 0.0f) {
                    return 0.0f;
                }
                f2 = displayMetrics.scaledDensity;
            }
        } else {
            if (displayMetrics.density == 0.0f) {
                return 0.0f;
            }
            f2 = displayMetrics.density;
        }
        return f / f2;
    }

    public static float dpToPx(float f, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, f, displayMetrics);
    }

    public static float pxToDp(float f, DisplayMetrics displayMetrics) {
        return deriveDimension(1, f, displayMetrics);
    }

    public static float spToPx(float f, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(2, f, displayMetrics);
    }

    public static float pxToSp(float f, DisplayMetrics displayMetrics) {
        return deriveDimension(2, f, displayMetrics);
    }

    private static class Api34Impl {
        private Api34Impl() {
        }

        public static float deriveDimension(int r0, float f, DisplayMetrics displayMetrics) {
            return TypedValue.deriveDimension(r0, f, displayMetrics);
        }
    }
}
