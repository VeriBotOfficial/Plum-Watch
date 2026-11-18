package com.mbridge.msdk.foundation.tools;

import android.graphics.Bitmap;
import androidx.core.view.MotionEventCompat;
import java.lang.reflect.Array;

/* JADX INFO: compiled from: FastBlurUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public class y {
    public static Bitmap a(Bitmap bitmap, int r38, boolean z) {
        int r0 = r38;
        Bitmap bitmapCopy = z ? bitmap : bitmap.copy(bitmap.getConfig(), true);
        if (r0 < 1) {
            return null;
        }
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int r13 = width * height;
        int[] r14 = new int[r13];
        bitmapCopy.getPixels(r14, 0, width, 0, 0, width, height);
        int r3 = width - 1;
        int r4 = height - 1;
        int r5 = r0 + r0;
        int r6 = r5 + 1;
        int[] r7 = new int[r13];
        int[] r8 = new int[r13];
        int[] r9 = new int[r13];
        int[] r10 = new int[Math.max(width, height)];
        int r11 = (r5 + 2) >> 1;
        int r12 = r11 * r11;
        int r15 = r12 * 256;
        int[] r1 = new int[r15];
        for (int r16 = 0; r16 < r15; r16++) {
            r1[r16] = r16 / r12;
        }
        int[][] r17 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, r6, 3);
        int r18 = r0 + 1;
        int r19 = 0;
        int r110 = 0;
        int r111 = 0;
        while (r19 < height) {
            Bitmap bitmap2 = bitmapCopy;
            int r28 = height;
            int r20 = 0;
            int r21 = 0;
            int r22 = 0;
            int r23 = 0;
            int r24 = 0;
            int r25 = 0;
            int r26 = 0;
            int r27 = 0;
            int r112 = -r0;
            int r2 = 0;
            while (r112 <= r0) {
                int r31 = r4;
                int[] r32 = r10;
                int r113 = r14[r110 + Math.min(r3, Math.max(r112, 0))];
                int[] r33 = r17[r112 + r0];
                r33[0] = (r113 & 16711680) >> 16;
                r33[1] = (r113 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                r33[2] = r113 & 255;
                int r114 = r18 - Math.abs(r112);
                int r30 = r33[0];
                r21 += r30 * r114;
                int r29 = r33[1];
                r20 += r29 * r114;
                int r34 = r33[2];
                r2 += r114 * r34;
                if (r112 > 0) {
                    r25 += r30;
                    r26 += r29;
                    r27 += r34;
                } else {
                    r24 += r30;
                    r23 += r29;
                    r22 += r34;
                }
                r112++;
                r4 = r31;
                r10 = r32;
            }
            int r35 = r4;
            int[] r36 = r10;
            int r115 = r0;
            int r37 = r2;
            int r39 = 0;
            while (r39 < width) {
                r7[r110] = r1[r21];
                r8[r110] = r1[r20];
                r9[r110] = r1[r37];
                int r210 = r21 - r24;
                int r211 = r20 - r23;
                int r40 = r37 - r22;
                int[] r116 = r17[((r115 - r0) + r6) % r6];
                int r212 = r24 - r116[0];
                int r213 = r23 - r116[1];
                int r214 = r22 - r116[2];
                if (r19 == 0) {
                    r36[r39] = Math.min(r39 + r0 + 1, r3);
                }
                int r41 = r14[r111 + r36[r39]];
                int r310 = (r41 & 16711680) >> 16;
                r116[0] = r310;
                int r311 = (r41 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                r116[1] = r311;
                int r42 = r41 & 255;
                r116[2] = r42;
                int r215 = r25 + r310;
                int r216 = r26 + r311;
                int r217 = r27 + r42;
                r21 = r210 + r215;
                r20 = r211 + r216;
                r37 = r40 + r217;
                r115 = (r115 + 1) % r6;
                int[] r43 = r17[r115 % r6];
                int r312 = r43[0];
                r24 = r212 + r312;
                int r313 = r43[1];
                r23 = r213 + r313;
                int r44 = r43[2];
                r22 = r214 + r44;
                r25 = r215 - r312;
                r26 = r216 - r313;
                r27 = r217 - r44;
                r110++;
                r39++;
                r1 = r1;
            }
            r111 += width;
            r19++;
            bitmapCopy = bitmap2;
            height = r28;
            r4 = r35;
            r10 = r36;
        }
        int[] r314 = r1;
        Bitmap bitmap3 = bitmapCopy;
        int r315 = r4;
        int[] r316 = r10;
        int r218 = height;
        int r45 = 0;
        while (r45 < width) {
            int r46 = -r0;
            int r219 = r6;
            int[] r220 = r14;
            int r47 = 0;
            int r117 = 0;
            int r118 = 0;
            int r119 = 0;
            int r120 = 0;
            int r121 = 0;
            int r221 = 0;
            int r48 = r46;
            int r122 = r46 * width;
            int r49 = 0;
            int r50 = 0;
            while (r48 <= r0) {
                int r222 = width;
                int r223 = Math.max(0, r122) + r45;
                int[] r224 = r17[r48 + r0];
                r224[0] = r7[r223];
                r224[1] = r8[r223];
                r224[2] = r9[r223];
                int r123 = r18 - Math.abs(r48);
                r47 += r7[r223] * r123;
                r50 += r8[r223] * r123;
                r49 += r9[r223] * r123;
                if (r48 > 0) {
                    r120 += r224[0];
                    r121 += r224[1];
                    r221 += r224[2];
                } else {
                    r119 += r224[0];
                    r118 += r224[1];
                    r117 += r224[2];
                }
                int r124 = r315;
                if (r48 < r124) {
                    r122 += r222;
                }
                r48++;
                r315 = r124;
                width = r222;
            }
            int r225 = width;
            int r125 = r315;
            int r226 = r0;
            int r227 = r45;
            int r126 = r218;
            int r51 = 0;
            while (r51 < r126) {
                r220[r227] = (r220[r227] & (-16777216)) | (r314[r47] << 16) | (r314[r50] << 8) | r314[r49];
                int r52 = r47 - r119;
                int r53 = r50 - r118;
                int r54 = r49 - r117;
                int[] r228 = r17[((r226 - r0) + r219) % r219];
                int r127 = r119 - r228[0];
                int r128 = r118 - r228[1];
                int r129 = r117 - r228[2];
                if (r45 == 0) {
                    r316[r51] = Math.min(r51 + r18, r125) * r225;
                }
                int r55 = r316[r51] + r45;
                int r229 = r7[r55];
                r228[0] = r229;
                int r230 = r8[r55];
                r228[1] = r230;
                int r56 = r9[r55];
                r228[2] = r56;
                int r130 = r120 + r229;
                int r131 = r121 + r230;
                int r231 = r221 + r56;
                r47 = r52 + r130;
                r50 = r53 + r131;
                r49 = r54 + r231;
                r226 = (r226 + 1) % r219;
                int[] r57 = r17[r226];
                int r232 = r57[0];
                r119 = r127 + r232;
                int r233 = r57[1];
                r118 = r128 + r233;
                int r58 = r57[2];
                r117 = r129 + r58;
                r120 = r130 - r232;
                r121 = r131 - r233;
                r221 = r231 - r58;
                r227 += r225;
                r51++;
                r0 = r38;
            }
            r45++;
            r0 = r38;
            r315 = r125;
            r218 = r126;
            r6 = r219;
            r14 = r220;
            width = r225;
        }
        int r234 = width;
        bitmap3.setPixels(r14, 0, r234, 0, 0, r234, r218);
        return bitmap3;
    }

    public static Bitmap a(Bitmap bitmap, int r3) {
        if (r3 <= 0) {
            r3 = 10;
        }
        return a(Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() / r3, bitmap.getHeight() / r3, false), 8, true);
    }
}
