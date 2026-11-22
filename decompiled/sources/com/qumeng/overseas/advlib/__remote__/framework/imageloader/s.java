package com.qumeng.overseas.advlib.__remote__.framework.imageloader;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes17.dex */
public class s implements b<Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private float f12980a;

    public s(float f) {
        this.f12980a = f;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.imageloader.b
    public Bitmap a(Bitmap bitmap, int i, int i2) {
        if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        paint.setAntiAlias(true);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        float f = this.f12980a;
        canvas.drawRoundRect(rectF, f, f, paint);
        return createBitmap;
    }
}
