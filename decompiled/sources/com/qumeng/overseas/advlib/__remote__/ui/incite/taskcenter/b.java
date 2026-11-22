package com.qumeng.overseas.advlib.__remote__.ui.incite.taskcenter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.s;

/* loaded from: classes17.dex */
public class b extends LinearLayout {
    private float t;

    public b(Context context) {
        super(context);
        this.t = 10.0f;
    }

    private Path a() {
        float a2 = s.a(getContext(), this.t);
        if (a2 <= 0.0f) {
            return null;
        }
        Path path = new Path();
        path.addRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), a2, a2, Path.Direction.CW);
        return path;
    }

    public void setmRadius(float f) {
        this.t = f;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        Path a2 = a();
        if (a2 != null) {
            canvas.save();
            canvas.clipPath(a2);
        }
        return super.drawChild(canvas, view, j);
    }
}
