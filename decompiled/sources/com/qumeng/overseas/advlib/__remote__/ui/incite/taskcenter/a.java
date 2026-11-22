package com.qumeng.overseas.advlib.__remote__.ui.incite.taskcenter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.s;

/* loaded from: classes17.dex */
public class a extends View {
    private Paint t;
    private int u;

    public a(Context context) {
        super(context);
        this.u = s.a(getContext(), 10.0f);
        this.t = new Paint();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.t.setColor(-1);
        this.t.setStyle(Paint.Style.FILL);
        this.t.setAntiAlias(true);
        this.t.setStrokeWidth(1.0f);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.u, this.t);
    }
}
