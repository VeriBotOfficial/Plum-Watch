package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.overrideview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.g;

/* loaded from: classes17.dex */
public class CloseView extends View {
    Paint paint;
    float strokeWidthDp;

    public CloseView(Context context) {
        super(context);
        this.strokeWidthDp = 2.0f;
        init();
    }

    private void init() {
        Paint paint = new Paint();
        this.paint = paint;
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        this.paint.setColor(Color.parseColor("#e8e8e8"));
        this.paint.setAntiAlias(true);
        this.paint.setDither(true);
        int a2 = (int) g.a(getContext(), this.strokeWidthDp);
        if (a2 > 7) {
            a2 = 7;
        }
        this.paint.setStrokeWidth(a2);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingLeft(), getHeight() - getPaddingBottom(), this.paint);
        canvas.drawLine(getPaddingLeft(), getHeight() - getPaddingBottom(), getWidth() - getPaddingRight(), getPaddingTop(), this.paint);
    }

    public CloseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.strokeWidthDp = 2.0f;
        init();
    }
}
