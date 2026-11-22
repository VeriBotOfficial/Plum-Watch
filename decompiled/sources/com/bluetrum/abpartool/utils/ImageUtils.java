package com.bluetrum.abpartool.utils;

import android.graphics.Bitmap;

/* loaded from: classes13.dex */
public class ImageUtils {
    public static byte[] getRawImageData(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i * 4];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            int i4 = i2 * 4;
            bArr[i4] = (byte) ((i3 >> 24) & 255);
            bArr[i4 + 1] = (byte) ((i3 >> 16) & 255);
            bArr[i4 + 2] = (byte) ((i3 >> 8) & 255);
            bArr[i4 + 3] = (byte) (i3 & 255);
        }
        return bArr;
    }
}
