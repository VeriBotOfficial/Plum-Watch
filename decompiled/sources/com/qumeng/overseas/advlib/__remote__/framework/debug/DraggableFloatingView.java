package com.qumeng.overseas.advlib.__remote__.framework.debug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.appcompat.widget.AppCompatTextView;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.s;

/* loaded from: classes17.dex */
public class DraggableFloatingView extends AppCompatTextView {
    private boolean A;
    private int B;
    private Paint C;
    private Paint D;
    private WindowManager t;
    private WindowManager.LayoutParams u;
    private Context v;
    private float w;
    private float x;
    private boolean y;
    private int z;

    public DraggableFloatingView(Context context, WindowManager windowManager) {
        super(context);
        this.t = windowManager;
        this.v = context;
        b();
    }

    private void b() {
        this.z = this.t.getDefaultDisplay().getWidth();
        int height = this.t.getDefaultDisplay().getHeight();
        Paint paint = new Paint(1);
        this.C = paint;
        paint.setColor(Color.parseColor("#00b44e"));
        Paint paint2 = new Paint(1);
        this.D = paint2;
        paint2.setColor(Color.parseColor("#FFFFFF"));
        this.D.setTextSize(s.a(getContext(), 16.0f));
        this.D.setTextAlign(Paint.Align.CENTER);
        try {
            a(height);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void d() {
        int width = this.u.x + (getWidth() / 2);
        int i = this.z;
        if (width < i / 2) {
            this.u.x = 0;
        } else {
            this.u.x = i - getWidth();
        }
        this.t.updateViewLayout(this, this.u);
    }

    public boolean c() {
        return this.A;
    }

    public void e() {
        if (c()) {
            return;
        }
        this.A = true;
        WindowManager.LayoutParams layoutParams = this.u;
        layoutParams.alpha = 1.0f;
        layoutParams.flags = 8;
        this.t.updateViewLayout(this, layoutParams);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.B;
        canvas.drawCircle(f, f, f, this.C);
        canvas.drawText("Q", this.B, r0 - ((this.D.getFontMetricsInt().descent + this.D.getFontMetricsInt().ascent) / 2), this.D);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.y = false;
            this.w = motionEvent.getRawX();
            this.x = motionEvent.getRawY();
        } else if (action == 1) {
            if (this.y) {
                d();
            } else {
                performClick();
            }
            this.y = false;
        } else if (action == 2) {
            int round = Math.round(motionEvent.getRawX() - this.w);
            int round2 = Math.round(motionEvent.getRawY() - this.x);
            if (Math.abs(round) > 10 || Math.abs(round2) > 10) {
                this.y = true;
                this.w = motionEvent.getRawX();
                this.x = motionEvent.getRawY();
                WindowManager.LayoutParams layoutParams = this.u;
                layoutParams.x += round;
                layoutParams.y += round2;
                this.t.updateViewLayout(this, layoutParams);
            }
        }
        return true;
    }

    public void setOnBtnClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    private void a(int i) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(2038);
        this.u = layoutParams;
        layoutParams.width = s.a(this.v, 60.0f);
        this.u.height = s.a(this.v, 60.0f);
        WindowManager.LayoutParams layoutParams2 = this.u;
        layoutParams2.format = 1;
        layoutParams2.gravity = 8388659;
        int i2 = this.z;
        int i3 = layoutParams2.width;
        layoutParams2.x = i2 - i3;
        layoutParams2.y = (int) (i * 0.7f);
        layoutParams2.flags = 8;
        layoutParams2.alpha = 1.0f;
        this.A = true;
        this.B = i3 / 2;
        this.t.addView(this, layoutParams2);
    }

    public void a() {
        if (c()) {
            this.A = false;
            WindowManager.LayoutParams layoutParams = this.u;
            layoutParams.alpha = 0.0f;
            layoutParams.flags = 24;
            this.t.updateViewLayout(this, layoutParams);
        }
    }
}
