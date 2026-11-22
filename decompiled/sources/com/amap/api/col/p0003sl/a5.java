package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/* compiled from: BlankView.java */
/* loaded from: classes11.dex */
public class a5 extends View {
    public static final int b = Color.argb(255, 235, 235, 235);
    public static final int c = Color.argb(255, 21, 21, 21);

    /* renamed from: a, reason: collision with root package name */
    private Paint f1512a;

    public a5(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f1512a = paint;
        paint.setAntiAlias(true);
        this.f1512a.setColor(b);
    }

    public void a(int i) {
        Paint paint = this.f1512a;
        if (paint != null) {
            paint.setColor(i);
            try {
                postInvalidate();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f1512a);
    }
}
