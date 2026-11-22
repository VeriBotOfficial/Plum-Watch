package com.anythink.basead.ui.guidetoclickv2.picverify;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.core.common.v.q;

/* loaded from: classes11.dex */
public class PictureVerifyView extends RoundImageView {
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 3;
    private static final int f = 4;
    private static final int g = 5;
    private static final int h = 6;
    private static final int i = 20;
    private float A;
    private float B;
    private float C;
    private int j;
    private c k;
    private c l;
    private Bitmap m;
    private Path n;
    private Paint o;
    private Paint p;

    /* renamed from: q, reason: collision with root package name */
    private Paint f3340q;
    private long r;
    private long s;
    private int t;
    private boolean u;
    private a v;
    private com.anythink.basead.ui.guidetoclickv2.picverify.a w;
    private int x;
    private int y;
    private float z;

    public interface a {
        void a();

        void b();
    }

    public PictureVerifyView(Context context) {
        this(context, null);
    }

    public PictureVerifyView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PictureVerifyView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.j = 4;
        this.t = 50;
        this.u = true;
        this.y = -1;
        b bVar = new b(context);
        this.w = bVar;
        this.p = bVar.a();
        Paint paint = new Paint();
        this.f3340q = paint;
        paint.setColor(Color.parseColor("#B5B5B5"));
        this.f3340q.setStrokeWidth(q.a(getContext(), 1.0f));
        this.f3340q.setStyle(Paint.Style.STROKE);
        this.o = this.w.b();
    }

    private void a() {
        if (getDrawable() == null || getWidth() <= 0 || getHeight() < 0) {
            return;
        }
        if (this.k == null) {
            this.k = this.w.a(getWidth(), getHeight(), this.t);
        }
        if (this.l == null) {
            this.l = this.w.b(getWidth(), getHeight(), this.t);
        }
        if (this.n == null) {
            Path a2 = this.w.a(this.t);
            this.n = a2;
            a2.offset(this.k.f3343a, this.k.b);
        }
        if (this.m == null) {
            Bitmap bitmap = null;
            if (getDrawable() != null) {
                Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                getDrawable().setBounds(0, 0, getWidth(), getHeight());
                canvas.clipPath(this.n);
                getDrawable().draw(canvas);
                this.w.a(getContext(), canvas, this.n);
                c cVar = this.k;
                if (cVar != null) {
                    int i2 = cVar.f3343a;
                    int i3 = this.k.b;
                    int i4 = this.t;
                    bitmap = Bitmap.createBitmap(createBitmap, i2, i3, i4, i4);
                    createBitmap.recycle();
                }
            }
            this.m = bitmap;
        }
    }

    public void down(int i2) {
        if (this.l != null) {
            this.r = System.currentTimeMillis();
            this.j = 1;
            this.l.f3343a = (int) (((i2 / 100.0f) * ((getWidth() - this.t) - (this.l.c * 2))) + this.l.c);
            postInvalidate();
        }
    }

    private void a(float f2, float f3) {
        c cVar = this.l;
        if (cVar != null) {
            this.j = 1;
            cVar.f3343a = (int) (f2 - (this.t / 2.0f));
            this.l.b = (int) (f3 - (this.t / 2.0f));
            this.r = System.currentTimeMillis();
            postInvalidate();
        }
    }

    public void move(int i2) {
        c cVar;
        if (this.y == i2 || (cVar = this.l) == null) {
            return;
        }
        this.y = i2;
        this.j = 2;
        cVar.f3343a = (int) (((i2 / 100.0f) * ((getWidth() - this.t) - (this.l.c * 2))) + this.l.c);
        postInvalidate();
    }

    private void b(float f2, float f3) {
        c cVar = this.l;
        if (cVar != null) {
            this.j = 2;
            cVar.f3343a = (int) (cVar.f3343a + f2);
            this.l.b = (int) (r3.b + f3);
            postInvalidate();
        }
    }

    public void loose() {
        this.j = 3;
        this.s = System.currentTimeMillis();
        c cVar = this.l;
        if (cVar != null && this.k != null && Math.abs(cVar.f3343a - this.k.f3343a) < 20 && Math.abs(this.l.b - this.k.b) < 20) {
            this.j = 5;
            postInvalidate();
            a aVar = this.v;
            if (aVar != null) {
                aVar.a();
            }
        } else {
            this.j = 6;
            postInvalidate();
        }
        postInvalidate();
    }

    private void b() {
        this.j = 4;
        this.m = null;
        this.k = null;
        this.n = null;
        postInvalidate();
    }

    private void c() {
        this.j = 6;
        postInvalidate();
    }

    private void d() {
        this.j = 5;
        postInvalidate();
    }

    public void callback(a aVar) {
        this.v = aVar;
    }

    private void a(com.anythink.basead.ui.guidetoclickv2.picverify.a aVar) {
        this.w = aVar;
    }

    public void setBlockSize(int i2) {
        this.t = i2;
        this.n = null;
        this.l = null;
        this.k = null;
        this.m = null;
        postInvalidate();
    }

    public void setBitmap(Bitmap bitmap) {
        this.n = null;
        this.l = null;
        this.k = null;
        this.m.recycle();
        this.m = null;
        setImageBitmap(bitmap);
    }

    private void a(boolean z) {
        this.u = z;
    }

    private Bitmap e() {
        if (getDrawable() == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        getDrawable().setBounds(0, 0, getWidth(), getHeight());
        canvas.clipPath(this.n);
        getDrawable().draw(canvas);
        this.w.a(getContext(), canvas, this.n);
        c cVar = this.k;
        if (cVar == null) {
            return null;
        }
        int i2 = cVar.f3343a;
        int i3 = this.k.b;
        int i4 = this.t;
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, i2, i3, i4, i4);
        createBitmap.recycle();
        return createBitmap2;
    }

    private Bitmap a(Bitmap bitmap) {
        c cVar = this.k;
        if (cVar == null) {
            return null;
        }
        int i2 = cVar.f3343a;
        int i3 = this.k.b;
        int i4 = this.t;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, i2, i3, i4, i4);
        bitmap.recycle();
        return createBitmap;
    }

    private void f() {
        c cVar = this.l;
        if (cVar != null && this.k != null && Math.abs(cVar.f3343a - this.k.f3343a) < 20 && Math.abs(this.l.b - this.k.b) < 20) {
            this.j = 5;
            postInvalidate();
            a aVar = this.v;
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        this.j = 6;
        postInvalidate();
    }

    @Override // com.anythink.core.common.ui.component.RoundImageView, com.anythink.core.common.res.image.RecycleImageView, android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Canvas canvas2;
        c cVar;
        if (getDrawable() != null && getWidth() > 0 && getHeight() >= 0) {
            if (this.k == null) {
                this.k = this.w.a(getWidth(), getHeight(), this.t);
            }
            if (this.l == null) {
                this.l = this.w.b(getWidth(), getHeight(), this.t);
            }
            if (this.n == null) {
                Path a2 = this.w.a(this.t);
                this.n = a2;
                a2.offset(this.k.f3343a, this.k.b);
            }
            if (this.m == null) {
                Bitmap bitmap = null;
                if (getDrawable() != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas3 = new Canvas(createBitmap);
                    getDrawable().setBounds(0, 0, getWidth(), getHeight());
                    canvas3.clipPath(this.n);
                    getDrawable().draw(canvas3);
                    this.w.a(getContext(), canvas3, this.n);
                    c cVar2 = this.k;
                    if (cVar2 != null) {
                        int i2 = cVar2.f3343a;
                        int i3 = this.k.b;
                        int i4 = this.t;
                        bitmap = Bitmap.createBitmap(createBitmap, i2, i3, i4, i4);
                        createBitmap.recycle();
                    }
                }
                this.m = bitmap;
            }
        }
        if (getDrawable() == null) {
            return;
        }
        if (this.j == 5 || this.k == null) {
            canvas2 = canvas;
        } else {
            canvas.drawPath(this.n, this.p);
            canvas2 = canvas;
            canvas2.drawRect(this.k.f3343a, this.k.b, this.k.f3343a + this.t, this.k.b + this.t, this.f3340q);
        }
        int i5 = this.j;
        if ((i5 == 2 || i5 == 4 || i5 == 1 || i5 == 6) && (cVar = this.l) != null) {
            canvas2.drawBitmap(this.m, cVar.f3343a, this.l.b, this.o);
        }
    }
}
