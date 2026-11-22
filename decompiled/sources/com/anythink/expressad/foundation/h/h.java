package com.anythink.expressad.foundation.h;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.core.view.MotionEventCompat;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.net.URL;

/* loaded from: classes12.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static int f4922a = 2048;

    private static Bitmap a(String str, int i) {
        if (i <= 0) {
            i = 10;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new URL(str).openStream(), f4922a);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream, f4922a);
            a(bufferedInputStream, bufferedOutputStream);
            bufferedOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            return b(Bitmap.createScaledBitmap(decodeByteArray, decodeByteArray.getWidth() / i, decodeByteArray.getHeight() / i, false));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[f4922a];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    public static Bitmap a(Bitmap bitmap) {
        return b(Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() / 10, bitmap.getHeight() / 10, false));
    }

    private static Bitmap b(Bitmap bitmap) {
        char c;
        int i;
        int i2;
        int i3;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i4 = width * height;
        int[] iArr = new int[i4];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i5 = width - 1;
        int i6 = height - 1;
        int[] iArr2 = new int[i4];
        int[] iArr3 = new int[i4];
        int[] iArr4 = new int[i4];
        int[] iArr5 = new int[Math.max(width, height)];
        int[] iArr6 = new int[20736];
        int i7 = 0;
        for (int i8 = 0; i8 < 20736; i8++) {
            iArr6[i8] = i8 / 81;
        }
        char c2 = 2;
        boolean z = true;
        char c3 = 17;
        int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 17, 3);
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            c = c2;
            i = 8;
            if (i9 >= height) {
                break;
            }
            int i12 = i7;
            int i13 = i12;
            int i14 = i13;
            int i15 = i14;
            int i16 = i15;
            int i17 = i16;
            int i18 = i17;
            int i19 = i18;
            boolean z2 = z;
            int i20 = -8;
            int i21 = i19;
            while (i20 <= 8) {
                char c4 = c3;
                int i22 = iArr[i10 + Math.min(i5, Math.max(i20, i7))];
                int[] iArr8 = iArr7[i20 + 8];
                iArr8[i7] = (i22 & 16711680) >> 16;
                iArr8[z2 ? 1 : 0] = (i22 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr8[c] = i22 & 255;
                int abs = 9 - Math.abs(i20);
                int i23 = iArr8[i7];
                i21 += i23 * abs;
                int i24 = iArr8[z2 ? 1 : 0];
                i12 += i24 * abs;
                int i25 = iArr8[c];
                i13 += abs * i25;
                if (i20 > 0) {
                    i17 += i23;
                    i18 += i24;
                    i19 += i25;
                } else {
                    i14 += i23;
                    i15 += i24;
                    i16 += i25;
                }
                i20++;
                c3 = c4;
            }
            char c5 = c3;
            int i26 = 8;
            int i27 = i7;
            while (i27 < width) {
                iArr2[i10] = iArr6[i21];
                iArr3[i10] = iArr6[i12];
                iArr4[i10] = iArr6[i13];
                int i28 = i21 - i14;
                int i29 = i12 - i15;
                int i30 = i13 - i16;
                int[] iArr9 = iArr7[(i26 + 9) % 17];
                int i31 = i14 - iArr9[i7];
                int i32 = i15 - iArr9[z2 ? 1 : 0];
                int i33 = i16 - iArr9[c];
                if (i9 == 0) {
                    i3 = i7;
                    iArr5[i27] = Math.min(i27 + 9, i5);
                } else {
                    i3 = i7;
                }
                int i34 = iArr[i11 + iArr5[i27]];
                int i35 = (i34 & 16711680) >> 16;
                iArr9[i3] = i35;
                int i36 = (i34 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr9[z2 ? 1 : 0] = i36;
                int i37 = i34 & 255;
                iArr9[c] = i37;
                int i38 = i17 + i35;
                int i39 = i18 + i36;
                int i40 = i19 + i37;
                i21 = i28 + i38;
                i12 = i29 + i39;
                i13 = i30 + i40;
                i26 = (i26 + 1) % 17;
                int[] iArr10 = iArr7[i26 % 17];
                int i41 = iArr10[i3];
                i14 = i31 + i41;
                int i42 = iArr10[z2 ? 1 : 0];
                i15 = i32 + i42;
                int i43 = iArr10[c];
                i16 = i33 + i43;
                i17 = i38 - i41;
                i18 = i39 - i42;
                i19 = i40 - i43;
                i10++;
                i27++;
                i7 = i3;
            }
            i11 += width;
            i9++;
            c2 = c;
            z = z2 ? 1 : 0;
            c3 = c5;
        }
        int i44 = i7;
        boolean z3 = z;
        int i45 = i44;
        while (i45 < width) {
            int i46 = width * (-8);
            int i47 = i45;
            int i48 = -8;
            int i49 = i44;
            int i50 = i49;
            int i51 = i50;
            int i52 = i51;
            int i53 = i52;
            int i54 = i53;
            int i55 = i54;
            int i56 = i55;
            int i57 = i56;
            while (i48 <= i) {
                int i58 = i;
                int i59 = i44;
                int max = Math.max(i59, i46) + i47;
                int[] iArr11 = iArr7[i48 + 8];
                iArr11[i59] = iArr2[max];
                iArr11[z3 ? 1 : 0] = iArr3[max];
                iArr11[c] = iArr4[max];
                int abs2 = 9 - Math.abs(i48);
                i49 += iArr2[max] * abs2;
                i50 += iArr3[max] * abs2;
                i51 += iArr4[max] * abs2;
                if (i48 > 0) {
                    i55 += iArr11[0];
                    i56 += iArr11[z3 ? 1 : 0];
                    i57 += iArr11[c];
                } else {
                    i52 += iArr11[0];
                    i53 += iArr11[z3 ? 1 : 0];
                    i54 += iArr11[c];
                }
                if (i48 < i6) {
                    i46 += width;
                }
                i48++;
                i = i58;
                i44 = 0;
            }
            int i60 = i;
            int i61 = i47;
            int i62 = i60;
            for (int i63 = 0; i63 < height; i63++) {
                iArr[i61] = (iArr[i61] & (-16777216)) | (iArr6[i49] << 16) | (iArr6[i50] << 8) | iArr6[i51];
                int i64 = i49 - i52;
                int i65 = i50 - i53;
                int i66 = i51 - i54;
                int[] iArr12 = iArr7[(i62 + 9) % 17];
                int i67 = i52 - iArr12[0];
                int i68 = i53 - iArr12[z3 ? 1 : 0];
                int i69 = i54 - iArr12[c];
                if (i47 == 0) {
                    i2 = i61;
                    iArr5[i63] = Math.min(i63 + 9, i6) * width;
                } else {
                    i2 = i61;
                }
                int i70 = i47 + iArr5[i63];
                int i71 = iArr2[i70];
                iArr12[0] = i71;
                int i72 = iArr3[i70];
                iArr12[z3 ? 1 : 0] = i72;
                int i73 = iArr4[i70];
                iArr12[c] = i73;
                int i74 = i55 + i71;
                int i75 = i56 + i72;
                int i76 = i57 + i73;
                i49 = i64 + i74;
                i50 = i65 + i75;
                i51 = i66 + i76;
                i62 = (i62 + 1) % 17;
                int[] iArr13 = iArr7[i62];
                int i77 = iArr13[0];
                i52 = i67 + i77;
                int i78 = iArr13[z3 ? 1 : 0];
                i53 = i68 + i78;
                int i79 = iArr13[c];
                i54 = i69 + i79;
                i55 = i74 - i77;
                i56 = i75 - i78;
                i57 = i76 - i79;
                i61 = i2 + width;
            }
            i44 = 0;
            i45 = i47 + 1;
            i = i60;
        }
        bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmap;
    }
}
