package com.qumeng.overseas.advlib.__remote__.ui.aggregate.viewpager;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes17.dex */
public class a extends LinearLayout {
    private static final int C = 5;
    private static final int D = 10;
    private static final int E = 10;
    private int A;
    private int B;
    private Context t;
    private Paint u;
    private View v;
    private int w;
    private float x;
    private int y;
    private int z;

    /* renamed from: com.qumeng.overseas.advlib.__remote__.ui.aggregate.viewpager.a$a, reason: collision with other inner class name */
    private class C0816a extends View {
        private Paint t;

        public C0816a(Context context) {
            super(context);
            Paint paint = new Paint();
            this.t = paint;
            paint.setAntiAlias(true);
            this.t.setColor(Color.argb(255, 255, 176, 93));
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawCircle(a.this.A, a.this.A, a.this.A, this.t);
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            setMeasuredDimension(a.this.A * 2, a.this.A * 2);
        }
    }

    public a(Context context) {
        this(context, null);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < this.y; i++) {
            int i2 = this.A;
            canvas.drawCircle((i2 * i * 2) + r3 + (r2 * i), i2 + this.z, i2, this.u);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.v;
        int i5 = this.z;
        float f = this.B;
        int i6 = this.w;
        float f2 = this.x;
        view.layout((int) (i5 + ((i6 + f2) * f)), i5, (int) (f * (i6 + 1 + f2)), (this.A * 2) + i5);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.z;
        int i4 = this.A * 2;
        setMeasuredDimension(((i4 + i3) * this.y) + i3, i4 + (i3 * 2));
    }

    public void setItemCount(int i) {
        this.y = i;
        requestLayout();
    }

    public void setPadding(int i) {
        this.z = i;
        this.B = (this.A * 2) + i;
        requestLayout();
    }

    public void setRadius(int i) {
        this.A = i;
        this.B = (i * 2) + this.z;
        requestLayout();
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a() {
        setOrientation(0);
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.u = paint;
        paint.setAntiAlias(true);
        this.u.setColor(-7829368);
        C0816a c0816a = new C0816a(this.t);
        this.v = c0816a;
        addView(c0816a);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.w = 0;
        this.y = 5;
        this.z = 10;
        this.A = 10;
        this.B = 30;
        this.t = context;
        a();
    }

    public void a(int i, float f) {
        this.w = i;
        this.x = f;
        requestLayout();
    }
}
