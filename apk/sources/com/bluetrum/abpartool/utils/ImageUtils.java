package com.bluetrum.abpartool.utils;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes15.dex */
public class ImageUtils {
    public static byte[] getRawImageData(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int r8 = width * height;
        int[] r9 = new int[r8];
        bitmap.getPixels(r9, 0, width, 0, 0, width, height);
        byte[] bArr = new byte[r8 * 4];
        for (int r0 = 0; r0 < r8; r0++) {
            int r1 = r9[r0];
            int r2 = r0 * 4;
            bArr[r2] = (byte) ((r1 >> 24) & 255);
            bArr[r2 + 1] = (byte) ((r1 >> 16) & 255);
            bArr[r2 + 2] = (byte) ((r1 >> 8) & 255);
            bArr[r2 + 3] = (byte) (r1 & 255);
        }
        return bArr;
    }
}
