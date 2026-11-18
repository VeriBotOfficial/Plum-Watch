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

/* JADX INFO: loaded from: classes16.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f4922a = 2048;

    private static Bitmap a(String str, int r4) {
        if (r4 <= 0) {
            r4 = 10;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new URL(str).openStream(), f4922a);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream, f4922a);
            a(bufferedInputStream, bufferedOutputStream);
            bufferedOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            return b(Bitmap.createScaledBitmap(bitmapDecodeByteArray, bitmapDecodeByteArray.getWidth() / r4, bitmapDecodeByteArray.getHeight() / r4, false));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[f4922a];
        while (true) {
            int r1 = inputStream.read(bArr);
            if (r1 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, r1);
            }
        }
    }

    public static Bitmap a(Bitmap bitmap) {
        return b(Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() / 10, bitmap.getHeight() / 10, false));
    }

    private static Bitmap b(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int r10 = width * height;
        int[] r11 = new int[r10];
        bitmap.getPixels(r11, 0, width, 0, 0, width, height);
        int r0 = width - 1;
        int r1 = height - 1;
        int[] r2 = new int[r10];
        int[] r3 = new int[r10];
        int[] r4 = new int[r10];
        int[] r5 = new int[Math.max(width, height)];
        int[] r7 = new int[20736];
        int r12 = 0;
        for (int r13 = 0; r13 < 20736; r13++) {
            r7[r13] = r13 / 81;
        }
        int[][] r14 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 17, 3);
        int r16 = 0;
        int r17 = 0;
        for (int r15 = 0; r15 < height; r15++) {
            int r21 = 0;
            int r22 = 0;
            int r23 = 0;
            int r24 = 0;
            int r25 = 0;
            int r26 = 0;
            int r27 = 0;
            int r28 = 0;
            int r18 = 0;
            for (int r6 = -8; r6 <= 8; r6++) {
                int r19 = r11[r16 + Math.min(r0, Math.max(r6, 0))];
                int[] r32 = r14[r6 + 8];
                r32[0] = (r19 & 16711680) >> 16;
                r32[1] = (r19 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                r32[2] = r19 & 255;
                int r110 = 9 - Math.abs(r6);
                int r29 = r32[0];
                r18 += r29 * r110;
                int r33 = r32[1];
                r21 += r33 * r110;
                int r30 = r32[2];
                r22 += r110 * r30;
                if (r6 > 0) {
                    r26 += r29;
                    r27 += r33;
                    r28 += r30;
                } else {
                    r23 += r29;
                    r24 += r33;
                    r25 += r30;
                }
            }
            int r111 = 8;
            for (int r8 = 0; r8 < width; r8++) {
                r2[r16] = r7[r18];
                r3[r16] = r7[r21];
                r4[r16] = r7[r22];
                int r112 = r18 - r23;
                int r210 = r21 - r24;
                int r211 = r22 - r25;
                int[] r34 = r14[(r111 + 9) % 17];
                int r212 = r23 - r34[0];
                int r213 = r24 - r34[1];
                int r214 = r25 - r34[2];
                if (r15 == 0) {
                    r5[r8] = Math.min(r8 + 9, r0);
                }
                int r113 = r11[r17 + r5[r8]];
                int r35 = (r113 & 16711680) >> 16;
                r34[0] = r35;
                int r36 = (r113 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                r34[1] = r36;
                int r114 = r113 & 255;
                r34[2] = r114;
                int r215 = r26 + r35;
                int r216 = r27 + r36;
                int r217 = r28 + r114;
                r18 = r112 + r215;
                r21 = r210 + r216;
                r22 = r211 + r217;
                r111 = (r111 + 1) % 17;
                int[] r115 = r14[r111 % 17];
                int r37 = r115[0];
                r23 = r212 + r37;
                int r38 = r115[1];
                r24 = r213 + r38;
                int r116 = r115[2];
                r25 = r214 + r116;
                r26 = r215 - r37;
                r27 = r216 - r38;
                r28 = r217 - r116;
                r16++;
            }
            r17 += width;
        }
        int r9 = 0;
        while (r9 < width) {
            int r20 = width * (-8);
            int[] r218 = r5;
            int r117 = r12;
            int r118 = r117;
            int r119 = r118;
            int r120 = r119;
            int r219 = r120;
            int r220 = r219;
            int r221 = r220;
            int r222 = r221;
            int r223 = r222;
            for (int r121 = -8; r121 <= 8; r121++) {
                int r31 = Math.max(r12, r20) + r9;
                int[] r224 = r14[r121 + 8];
                r224[r12] = r2[r31];
                r224[1] = r3[r31];
                r224[2] = r4[r31];
                int r225 = 9 - Math.abs(r121);
                r117 += r2[r31] * r225;
                r118 += r3[r31] * r225;
                r119 += r4[r31] * r225;
                if (r121 > 0) {
                    r221 += r224[r12];
                    r222 += r224[1];
                    r223 += r224[2];
                } else {
                    r120 += r224[r12];
                    r219 += r224[1];
                    r220 += r224[2];
                }
                if (r121 < r1) {
                    r20 += width;
                }
            }
            int r122 = r9;
            int r39 = r12;
            int r40 = 8;
            while (r39 < height) {
                r11[r122] = (r11[r122] & (-16777216)) | (r7[r117] << 16) | (r7[r118] << 8) | r7[r119];
                int r123 = r117 - r120;
                int r124 = r118 - r219;
                int r125 = r119 - r220;
                int[] r226 = r14[(r40 + 9) % 17];
                int r126 = r120 - r226[r12];
                int r227 = r219 - r226[1];
                int r228 = r220 - r226[2];
                if (r9 == 0) {
                    r218[r39] = Math.min(r39 + 9, r1) * width;
                }
                int r127 = r218[r39] + r9;
                int r310 = r2[r127];
                r226[0] = r310;
                int r311 = r3[r127];
                r226[1] = r311;
                int r128 = r4[r127];
                r226[2] = r128;
                int r229 = r221 + r310;
                int r230 = r222 + r311;
                int r231 = r223 + r128;
                r117 = r123 + r229;
                r118 = r124 + r230;
                r119 = r125 + r231;
                r40 = (r40 + 1) % 17;
                int[] r129 = r14[r40];
                int r232 = r129[0];
                r120 = r126 + r232;
                int r312 = r129[1];
                r219 = r227 + r312;
                int r130 = r129[2];
                r220 = r228 + r130;
                r221 = r229 - r232;
                r222 = r230 - r312;
                r223 = r231 - r130;
                r122 += width;
                r39++;
                r12 = 0;
            }
            r9++;
            r5 = r218;
            r12 = r12;
        }
        bitmap.setPixels(r11, 0, width, 0, 0, width, height);
        return bitmap;
    }
}
