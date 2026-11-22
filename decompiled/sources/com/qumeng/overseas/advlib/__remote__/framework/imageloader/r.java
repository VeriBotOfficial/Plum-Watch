package com.qumeng.overseas.advlib.__remote__.framework.imageloader;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes17.dex */
public class r implements b<Bitmap> {
    public static final int d = -1;
    public static final int e = 0;
    public static final int f = 2;
    public static final int g = 1;
    public static final int h = 3;

    /* renamed from: a, reason: collision with root package name */
    private float f12979a;
    private int b;
    private float c;

    public r(float f2) {
        this.b = -1;
        this.c = f2;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.imageloader.b
    public Bitmap a(Bitmap bitmap, int i, int i2) {
        Rect rect;
        int i3;
        int i4;
        int i5;
        float a2 = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a(), this.f12979a);
        float a3 = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a(), this.c);
        if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            return null;
        }
        int i6 = this.b;
        float f2 = i6 == 0 ? a3 : 0.0f;
        float f3 = i6 == 1 ? a3 : 0.0f;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        if (i2 != i || i2 == 0) {
            rect = new Rect((int) (0.0f - f2), 0, (int) (bitmap.getWidth() + f3), bitmap.getHeight());
        } else {
            int width = (bitmap.getWidth() - bitmap.getHeight()) / 2;
            int height = bitmap.getHeight() + width;
            int height2 = bitmap.getHeight();
            if (bitmap.getHeight() > bitmap.getWidth()) {
                int height3 = (bitmap.getHeight() - bitmap.getWidth()) / 2;
                int width2 = bitmap.getWidth();
                i3 = bitmap.getWidth() + height3;
                i4 = width2;
                i5 = height3;
                width = 0;
            } else {
                i3 = height2;
                i4 = height;
                i5 = 0;
            }
            rect = new Rect(width, i5, i4, i3);
        }
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-1118482);
        canvas.drawRoundRect(rectF, a3, a3, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        if (a2 > 0.0f) {
            Paint paint2 = new Paint(1);
            paint2.setColor(-7829368);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(a2);
            canvas.drawRoundRect(rectF, a3, a3, paint2);
        }
        return createBitmap;
    }

    public r(float f2, float f3) {
        this.b = -1;
        this.c = f2;
        this.f12979a = f3;
    }

    public r(float f2, float f3, int i) {
        this.c = f2;
        this.f12979a = f3;
        this.b = i;
    }
}
