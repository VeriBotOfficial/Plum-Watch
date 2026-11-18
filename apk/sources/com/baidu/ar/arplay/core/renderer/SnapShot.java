package com.baidu.ar.arplay.core.renderer;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes16.dex */
public class SnapShot {
    private static Bitmap mCaptureScreenBmp;

    public static void destroyCache() {
        Bitmap bitmap = mCaptureScreenBmp;
        if (bitmap != null) {
            bitmap.recycle();
            mCaptureScreenBmp = null;
        }
    }

    public static Bitmap getCacheBitmap(int r1, int r2) {
        Bitmap bitmap = mCaptureScreenBmp;
        if (bitmap != null && (r1 != bitmap.getWidth() || r2 != mCaptureScreenBmp.getHeight())) {
            mCaptureScreenBmp.recycle();
            mCaptureScreenBmp = null;
        }
        if (mCaptureScreenBmp == null) {
            mCaptureScreenBmp = Bitmap.createBitmap(r1, r2, Bitmap.Config.ARGB_8888);
        }
        return mCaptureScreenBmp;
    }

    public static Bitmap rotateBitmap(Bitmap bitmap, int r8) {
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f, -1.0f, bitmap.getWidth() / 2, bitmap.getHeight() / 2);
        matrix.postRotate(r8, bitmap.getWidth() / 2, bitmap.getHeight() / 2);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }
}
