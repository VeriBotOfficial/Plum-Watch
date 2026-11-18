package com.bytedance.sdk.component.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes15.dex */
public class hm {
    public static Bitmap fxn(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static byte[] fxn(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bitmap.getByteCount());
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Bitmap fxn(Bitmap bitmap, int r9, int r10) {
        if (bitmap == null) {
            return null;
        }
        if (r9 <= 0 || r10 <= 0) {
            return bitmap;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (r9 < width && r10 < height) {
                Matrix matrix = new Matrix();
                matrix.postScale(r9 / width, r10 / height);
                return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
            }
            return bitmap;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }
}
