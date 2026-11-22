package com.qumeng.overseas.advlib.__remote__.framework.imageloader;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* loaded from: classes17.dex */
public class t implements b<Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private int f12981a;
    private int b;

    public t(int i, int i2) {
        this.f12981a = i;
        this.b = i2;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.imageloader.b
    public Bitmap a(Bitmap bitmap, int i, int i2) {
        float f;
        int height;
        if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            return null;
        }
        if (bitmap.getWidth() > bitmap.getHeight()) {
            f = this.f12981a;
            height = bitmap.getWidth();
        } else {
            f = this.b;
            height = bitmap.getHeight();
        }
        float f2 = f / height;
        Matrix matrix = new Matrix();
        matrix.postScale(f2, f2);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }
}
