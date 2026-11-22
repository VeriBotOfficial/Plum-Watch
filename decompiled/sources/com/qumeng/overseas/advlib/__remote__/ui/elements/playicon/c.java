package com.qumeng.overseas.advlib.__remote__.ui.elements.playicon;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.f;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.s;

/* loaded from: classes17.dex */
public class c extends View implements a {
    private final int t;
    private final int u;
    private CharSequence v;
    private Paint w;
    private Paint x;

    public c(Context context) {
        super(context);
        int a2 = s.a(getContext(), 64.0f);
        this.t = a2;
        this.u = a2 / 3;
        this.v = null;
        this.w = new Paint();
        this.x = new Paint();
        this.w.setStyle(Paint.Style.FILL);
        this.w.setStrokeCap(Paint.Cap.ROUND);
        this.w.setStrokeWidth(12.0f);
        this.w.setColor(-1);
        this.x.setColor(-1);
        this.x.setTextSize(28.0f);
        this.x.setAntiAlias(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(64.0f);
        gradientDrawable.setColor(Color.argb(187, 0, 0, 0));
        setBackground(gradientDrawable);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.scale(0.7f, 0.7f, getWidth() / 2, getHeight() / 4);
        Path path = new Path();
        int i = this.u;
        int i2 = i / 3;
        path.moveTo(i, i - i2);
        int i3 = this.u;
        path.lineTo((i3 * 2) + i2, i3 + (i3 / 2));
        path.lineTo(this.u, (r1 * 2) + i2);
        path.lineTo(this.u, r1 - i2);
        canvas.drawPath(path, this.w);
        canvas.restore();
        if (TextUtils.isEmpty(this.v)) {
            return;
        }
        canvas.drawText(this.v.toString(), (getWidth() - this.x.measureText(this.v.toString())) / 2.0f, (float) (getHeight() - (this.u / 2.5d)), this.x);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = this.t;
        setMeasuredDimension(i3, i3);
    }

    public void setText(CharSequence charSequence) {
        this.v = charSequence;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.ui.elements.playicon.a
    public void setTime(int i) {
        if (i > 0) {
            setText(f.a(i));
        } else {
            setText("");
        }
    }
}
