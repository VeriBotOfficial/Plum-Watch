package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.RelativeLayout;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.am;

/* loaded from: classes11.dex */
public abstract class BaseEndCardView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    protected String f2967a;
    protected w b;
    protected x c;
    protected y d;
    private boolean e;
    public a mListener;

    public interface a {
        void a();

        void a(int i);
    }

    public interface b extends a {
        void b();
    }

    protected abstract void a();

    protected Drawable b() {
        return null;
    }

    public BaseEndCardView(Context context, w wVar, x xVar) {
        super(context);
        this.f2967a = getClass().getSimpleName();
        super.setWillNotDraw(false);
        this.b = wVar;
        this.c = xVar;
        this.d = xVar.o;
    }

    public void setNeedArc(boolean z) {
        this.e = z;
        postInvalidate();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Canvas canvas2;
        try {
            if (this.e) {
                canvas2 = canvas;
                try {
                    int saveLayer = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
                    super.draw(canvas2);
                    int width = getWidth();
                    int height = getHeight();
                    int width2 = getWidth();
                    int i = width2 / 2;
                    float height2 = getHeight();
                    int i2 = (int) (1.0f * height2);
                    RectF rectF = new RectF();
                    rectF.left = i - i2;
                    rectF.top = r4 - (i2 * 2);
                    rectF.right = i + i2;
                    rectF.bottom = height2;
                    am.a(canvas2, width, height, rectF);
                    canvas2.restoreToCount(saveLayer);
                    return;
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
        canvas2 = canvas;
        super.draw(canvas2);
    }

    private static RectF a(int i, int i2) {
        int i3 = i / 2;
        float f = i2;
        int i4 = (int) (1.0f * f);
        RectF rectF = new RectF();
        rectF.left = i3 - i4;
        rectF.top = i2 - (i4 * 2);
        rectF.right = i3 + i4;
        rectF.bottom = f;
        return rectF;
    }
}
