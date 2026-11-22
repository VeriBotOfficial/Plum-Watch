package com.bluetrum.abpartool;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bluetrum.abpartool.utils.ImageUtils;

/* loaded from: classes13.dex */
public class ParTool {
    public static native byte[] rawToPar(byte[] bArr, int i, int i2, boolean z, boolean z2, boolean z3);

    public static native byte[] rawToParv3(byte[] bArr, int i, int i2, boolean z, boolean z2);

    public static native byte[] rawToRle(byte[] bArr, int i, int i2, int i3);

    static {
        System.loadLibrary("abpartool");
    }

    public static byte[] bitmapToPar(Bitmap bitmap, boolean z, boolean z2, boolean z3) {
        return rawToPar(ImageUtils.getRawImageData(bitmap), bitmap.getWidth(), bitmap.getHeight(), z, z2, z3);
    }

    public static byte[] imageDataToPar(byte[] bArr, boolean z, boolean z2, boolean z3) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        if (decodeByteArray != null) {
            return bitmapToPar(decodeByteArray, z, z2, z3);
        }
        return null;
    }

    public static byte[] bitmapToRle(Bitmap bitmap, int i) {
        return rawToRle(ImageUtils.getRawImageData(bitmap), bitmap.getWidth(), bitmap.getHeight(), i);
    }

    public static byte[] imageDataToRle(byte[] bArr, int i) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        if (decodeByteArray != null) {
            return bitmapToRle(decodeByteArray, i);
        }
        return null;
    }

    public static byte[] bitmapToParv3(Bitmap bitmap, boolean z, boolean z2) {
        return rawToParv3(ImageUtils.getRawImageData(bitmap), bitmap.getWidth(), bitmap.getHeight(), z, z2);
    }

    public static byte[] imageDataToParv3(byte[] bArr, boolean z, boolean z2) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        if (decodeByteArray != null) {
            return bitmapToParv3(decodeByteArray, z, z2);
        }
        return null;
    }
}
