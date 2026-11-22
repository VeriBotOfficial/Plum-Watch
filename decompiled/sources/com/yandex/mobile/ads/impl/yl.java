package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import androidx.core.view.MotionEventCompat;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* loaded from: classes5.dex */
public final class yl {
    public static Bitmap a(Bitmap originalBitmap, double d) {
        Intrinsics.checkNotNullParameter(originalBitmap, "originalBitmap");
        try {
            return b(originalBitmap, d);
        } catch (Throwable unused) {
            return originalBitmap;
        }
    }

    private static Bitmap b(Bitmap bitmap, double d) {
        int i;
        int i2;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, MathKt.roundToInt(bitmap.getWidth() * d), MathKt.roundToInt(bitmap.getHeight() * d), false);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
        int i3 = 1;
        Bitmap copy = createScaledBitmap.copy(createScaledBitmap.getConfig(), true);
        int width = copy.getWidth();
        int height = copy.getHeight();
        int i4 = width * height;
        int[] iArr = new int[i4];
        copy.getPixels(iArr, 0, width, 0, 0, width, height);
        int i5 = width - 1;
        int i6 = height - 1;
        int[] iArr2 = new int[i4];
        int[] iArr3 = new int[i4];
        int[] iArr4 = new int[i4];
        int[] iArr5 = new int[RangesKt.coerceAtLeast(width, height)];
        int[] iArr6 = new int[1024];
        for (int i7 = 0; i7 < 1024; i7++) {
            iArr6[i7] = i7 / 4;
        }
        char c = 3;
        int[][] iArr7 = new int[3][];
        for (int i8 = 0; i8 < 3; i8++) {
            iArr7[i8] = new int[3];
        }
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < height) {
            char c2 = c;
            int i12 = -1;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i12 <= i3) {
                int[] iArr8 = iArr4;
                int i22 = i3;
                int i23 = iArr[RangesKt.coerceAtMost(i5, RangesKt.coerceAtLeast(i12, 0)) + i10];
                int i24 = i12 + 1;
                int[] iArr9 = iArr7[i24];
                iArr9[0] = (i23 & 16711680) >> 16;
                iArr9[i22] = (i23 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr9[2] = i23 & 255;
                int abs = 2 - StrictMath.abs(i12);
                int i25 = iArr9[0];
                i13 = (i25 * abs) + i13;
                int i26 = iArr9[i22];
                i14 = (i26 * abs) + i14;
                int i27 = iArr9[2];
                i15 = (abs * i27) + i15;
                if (i12 > 0) {
                    i21 += i25;
                    i20 += i26;
                    i19 += i27;
                } else {
                    i18 += i25;
                    i17 += i26;
                    i16 += i27;
                }
                i3 = i22;
                iArr4 = iArr8;
                i12 = i24;
            }
            int[] iArr10 = iArr4;
            int i28 = i3;
            int i29 = 0;
            while (i29 < width) {
                iArr2[i10] = iArr6[i13];
                iArr3[i10] = iArr6[i14];
                iArr10[i10] = iArr6[i15];
                int i30 = i13 - i18;
                int i31 = i14 - i17;
                int i32 = i15 - i16;
                int[] iArr11 = iArr7[(i3 + 2) % 3];
                int i33 = i18 - iArr11[0];
                int i34 = i17 - iArr11[i28];
                int i35 = i16 - iArr11[2];
                if (i9 == 0) {
                    i2 = i29;
                    iArr5[i2] = Math.min(i2 + 2, i5);
                } else {
                    i2 = i29;
                }
                int i36 = iArr[i11 + iArr5[i2]];
                int i37 = (i36 & 16711680) >> 16;
                iArr11[0] = i37;
                int i38 = (i36 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr11[i28] = i38;
                int i39 = i36 & 255;
                iArr11[2] = i39;
                int i40 = i21 + i37;
                int i41 = i20 + i38;
                int i42 = i19 + i39;
                i13 = i30 + i40;
                i14 = i31 + i41;
                i15 = i32 + i42;
                i3 = (i3 + 1) % 3;
                int[] iArr12 = iArr7[i3 % 3];
                int i43 = iArr12[0];
                i18 = i33 + i43;
                int i44 = iArr12[i28];
                i17 = i34 + i44;
                int i45 = iArr12[2];
                i16 = i35 + i45;
                i21 = i40 - i43;
                i20 = i41 - i44;
                i19 = i42 - i45;
                i10++;
                i29 = i2 + 1;
            }
            i11 += width;
            i9++;
            c = c2;
            i3 = i28;
            iArr4 = iArr10;
        }
        int[] iArr13 = iArr4;
        int i46 = i3;
        int i47 = 0;
        while (i47 < width) {
            int i48 = width * (-1);
            int i49 = -1;
            int i50 = 0;
            int i51 = 0;
            int i52 = 0;
            int i53 = 0;
            int i54 = 0;
            int i55 = 0;
            int i56 = 0;
            int i57 = 0;
            int i58 = 0;
            for (int i59 = i46; i49 <= i59; i59 = 1) {
                int max = Math.max(0, i48) + i47;
                int i60 = i49 + 1;
                int[] iArr14 = iArr7[i60];
                iArr14[0] = iArr2[max];
                iArr14[i59] = iArr3[max];
                iArr14[2] = iArr13[max];
                int abs2 = 2 - StrictMath.abs(i49);
                i56 = (iArr2[max] * abs2) + i56;
                i57 = (iArr3[max] * abs2) + i57;
                i58 = (iArr13[max] * abs2) + i58;
                if (i49 > 0) {
                    i55 += iArr14[0];
                    i54 += iArr14[1];
                    i53 += iArr14[2];
                } else {
                    i52 += iArr14[0];
                    i51 += iArr14[1];
                    i50 += iArr14[2];
                }
                if (i49 < i6) {
                    i48 += width;
                }
                i49 = i60;
            }
            int i61 = i56;
            int i62 = i57;
            int i63 = 1;
            int i64 = i47;
            int i65 = i55;
            int i66 = i54;
            int i67 = i53;
            int i68 = i52;
            int i69 = i51;
            int i70 = i50;
            for (int i71 = 0; i71 < height; i71++) {
                iArr[i64] = (iArr[i64] & (-16777216)) | (iArr6[i61] << 16) | (iArr6[i62] << 8) | iArr6[i58];
                int i72 = i61 - i68;
                int i73 = i62 - i69;
                int i74 = i58 - i70;
                int[] iArr15 = iArr7[(i63 + 2) % 3];
                int i75 = i68 - iArr15[0];
                int i76 = i69 - iArr15[1];
                int i77 = i70 - iArr15[2];
                if (i47 == 0) {
                    i = i72;
                    iArr5[i71] = Math.min(i71 + 2, i6) * width;
                } else {
                    i = i72;
                }
                int i78 = iArr5[i71] + i47;
                int i79 = iArr2[i78];
                iArr15[0] = i79;
                int i80 = iArr3[i78];
                iArr15[1] = i80;
                int i81 = iArr13[i78];
                iArr15[2] = i81;
                int i82 = i65 + i79;
                int i83 = i66 + i80;
                int i84 = i67 + i81;
                i61 = i + i82;
                i62 = i73 + i83;
                i58 = i74 + i84;
                i63 = (i63 + 1) % 3;
                int[] iArr16 = iArr7[i63];
                int i85 = iArr16[0];
                i68 = i75 + i85;
                int i86 = iArr16[1];
                i69 = i76 + i86;
                int i87 = iArr16[2];
                i70 = i77 + i87;
                i65 = i82 - i85;
                i66 = i83 - i86;
                i67 = i84 - i87;
                i64 += width;
            }
            i47++;
            i46 = 1;
        }
        copy.setPixels(iArr, 0, width, 0, 0, width, height);
        Intrinsics.checkNotNull(copy);
        return copy;
    }
}
