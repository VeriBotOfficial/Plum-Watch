package com.qumeng.overseas.advlib.__remote__.ui.elements;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.view.View;
import java.text.DecimalFormat;

/* loaded from: classes17.dex */
public class m extends View {
    private Paint t;
    private float u;
    private String v;
    private String w;
    private int x;
    private int y;

    public m(Context context) {
        super(context);
        this.u = 0.0f;
        this.v = "#FFE24A";
        this.w = "#FFA613";
        this.x = -3355444;
        a();
    }

    private void a() {
        Paint paint = new Paint();
        this.t = paint;
        paint.setStyle(Paint.Style.FILL);
        this.t.setAntiAlias(true);
        this.y = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(getContext(), 6.0f);
    }

    public void b() {
        this.v = "#40CC69";
        this.w = "#00000000";
        this.x = 0;
        this.y = 0;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        Path path = new Path();
        float f = (height * 2) / 3;
        path.moveTo(0.0f, f);
        float f2 = height;
        path.quadTo(0.0f, f2, this.y, f2);
        path.lineTo(width - this.y, f2);
        float f3 = width;
        path.quadTo(f3, f2, f3, f);
        path.close();
        this.t.setColor(this.x);
        canvas.drawPath(path, this.t);
        int i = (int) (this.u * f3);
        int i2 = this.y;
        if (i < i2) {
            i = i2;
        } else if (i > width - i2) {
            i = width;
        }
        Path path2 = new Path();
        path2.moveTo(0.0f, f);
        path2.quadTo(0.0f, f2, this.y, f2);
        if (i == width) {
            path2.lineTo(i - this.y, f2);
            path2.quadTo(f3, f2, f3, f);
        } else {
            float f4 = i;
            path2.lineTo(f4, f2);
            path2.lineTo(f4, f);
        }
        path2.close();
        this.t.setColor(Color.parseColor(this.v));
        if (this.y == 0) {
            this.t.setShader(new LinearGradient(0.0f, f, f3, f, Color.parseColor("#00C781"), Color.parseColor("#40CC69"), Shader.TileMode.MIRROR));
        }
        canvas.drawPath(path2, this.t);
        this.t.setTextSize(com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(getContext(), 10.0f));
        this.t.setColor(Color.parseColor(this.w));
        String format = new DecimalFormat("##%").format(this.u);
        int i3 = width - (this.y * 4);
        if (i > i3) {
            i = i3;
        }
        canvas.drawText(format, i, height / 2, this.t);
    }

    public void setProgress(float f) {
        this.u = f;
        postInvalidate();
    }
}
