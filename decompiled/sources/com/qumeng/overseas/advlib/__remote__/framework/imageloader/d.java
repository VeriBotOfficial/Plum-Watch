package com.qumeng.overseas.advlib.__remote__.framework.imageloader;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: classes17.dex */
public class d implements b<Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private Integer[] f12936a;
    private int b;
    private int c;
    private int d;
    private int e;
    private boolean f = false;

    public d(Integer[] numArr) {
        this.f12936a = numArr;
        a(numArr);
    }

    private void a(Integer[] numArr) {
        try {
            this.b = numArr[0].intValue();
            this.c = numArr[1].intValue();
            this.d = numArr[2].intValue();
            this.e = numArr[3].intValue();
            this.f = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public d(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.imageloader.b
    public Bitmap a(Bitmap bitmap, int i, int i2) {
        if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            return null;
        }
        if (!this.f) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(this.b, this.c, this.d, this.e);
        Rect rect2 = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-1118482);
        canvas.drawBitmap(bitmap, rect, rect2, paint);
        return createBitmap;
    }
}
