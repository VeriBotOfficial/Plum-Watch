package com.qumeng.overseas.advlib.__remote__.ui.aggregate.viewpager;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes2.dex */
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

    /* JADX INFO: renamed from: com.qumeng.overseas.advlib.__remote__.ui.aggregate.viewpager.a$a, reason: collision with other inner class name */
    private class C0910a extends View {
        private Paint t;

        public C0910a(Context context) {
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
        protected void onMeasure(int r1, int r2) {
            super.onMeasure(r1, r2);
            setMeasuredDimension(a.this.A * 2, a.this.A * 2);
        }
    }

    public a(Context context) {
        this(context, null);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int r0 = 0; r0 < this.y; r0++) {
            int r1 = this.A;
            int r2 = this.z;
            int r3 = r1 + r2;
            canvas.drawCircle((r1 * r0 * 2) + r3 + (r2 * r0), r3, r1, this.u);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int r4, int r5, int r6, int r7) {
        super.onLayout(z, r4, r5, r6, r7);
        View view = this.v;
        int r8 = this.z;
        float f = this.B;
        int r9 = this.w;
        float f2 = this.x;
        view.layout((int) (r8 + ((r9 + f2) * f)), r8, (int) (f * (r9 + 1 + f2)), (this.A * 2) + r8);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int r3, int r4) {
        super.onMeasure(r3, r4);
        int r5 = this.z;
        int r6 = this.A * 2;
        setMeasuredDimension(((r6 + r5) * this.y) + r5, r6 + (r5 * 2));
    }

    public void setItemCount(int r1) {
        this.y = r1;
        requestLayout();
    }

    public void setPadding(int r2) {
        this.z = r2;
        this.B = (this.A * 2) + r2;
        requestLayout();
    }

    public void setRadius(int r2) {
        this.A = r2;
        this.B = (r2 * 2) + this.z;
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
        C0910a c0910a = new C0910a(this.t);
        this.v = c0910a;
        addView(c0910a);
    }

    public a(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
        this.w = 0;
        this.y = 5;
        this.z = 10;
        this.A = 10;
        this.B = 30;
        this.t = context;
        a();
    }

    public void a(int r1, float f) {
        this.w = r1;
        this.x = f;
        requestLayout();
    }
}
