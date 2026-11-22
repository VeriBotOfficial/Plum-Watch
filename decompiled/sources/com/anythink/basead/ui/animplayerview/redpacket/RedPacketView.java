package com.anythink.basead.ui.animplayerview.redpacket;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: classes11.dex */
public class RedPacketView extends View {
    public static final String TAG = "RedPacketView";
    private static final int e = 400;

    /* renamed from: a, reason: collision with root package name */
    protected double f3182a;
    protected double b;
    protected final List<a> c;
    Random d;
    private final Matrix f;
    private final Map<Integer, Float> g;
    private List<Integer> h;
    private Paint i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private Bitmap o;
    private boolean p;

    public RedPacketView(Context context) {
        this(context, null);
    }

    public RedPacketView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RedPacketView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3182a = 0.15d;
        this.b = 0.2d;
        this.f = new Matrix();
        this.c = new ArrayList();
        this.g = new HashMap();
        Paint paint = new Paint();
        this.i = paint;
        paint.setFilterBitmap(true);
        this.i.setDither(true);
        this.i.setAntiAlias(true);
        setLayerType(2, null);
        this.d = new Random(System.currentTimeMillis());
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.m = getMeasuredWidth();
        this.n = getMeasuredHeight();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        a next;
        Bitmap c;
        super.onDraw(canvas);
        Iterator<a> it = this.c.iterator();
        while (it.hasNext() && (c = (next = it.next()).c()) != null) {
            this.f.setTranslate((-next.b()) >> 1, (-next.a()) >> 1);
            this.f.postRotate(next.e());
            this.f.postTranslate((next.b() >> 1) + next.f3183a, (next.a() >> 1) + next.b);
            canvas.drawBitmap(c, this.f, this.i);
        }
    }

    public void release() {
        this.p = false;
        try {
            Bitmap bitmap = this.o;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.o.recycle();
            }
            Iterator<a> it = this.c.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            this.c.clear();
            Map<Integer, Float> map = this.g;
            if (map != null) {
                map.clear();
            }
            List<Integer> list = this.h;
            if (list != null) {
                list.clear();
            }
        } catch (Exception e2) {
            Log.e(TAG, "release failed: " + e2.getMessage());
        }
    }

    private void a() {
        Paint paint = new Paint();
        this.i = paint;
        paint.setFilterBitmap(true);
        this.i.setDither(true);
        this.i.setAntiAlias(true);
        setLayerType(2, null);
        this.d = new Random(System.currentTimeMillis());
    }

    private void a(Canvas canvas) {
        a next;
        Bitmap c;
        Iterator<a> it = this.c.iterator();
        while (it.hasNext() && (c = (next = it.next()).c()) != null) {
            this.f.setTranslate((-next.b()) >> 1, (-next.a()) >> 1);
            this.f.postRotate(next.e());
            this.f.postTranslate((next.b() >> 1) + next.f3183a, (next.a() >> 1) + next.b);
            canvas.drawBitmap(c, this.f, this.i);
        }
    }

    public void initRedPacketList(Bitmap bitmap) {
        Float f;
        this.o = bitmap;
        if (this.p) {
            return;
        }
        this.p = true;
        if (bitmap == null) {
            try {
                this.o = BitmapFactory.decodeResource(getResources(), q.a(getContext(), "myoffer_icon_red_packet", k.c));
            } catch (Exception e2) {
                Log.e(TAG, "initRedPacketList failed: " + e2.getMessage());
            }
        }
        if (this.o == null) {
            Log.e(TAG, "redPacketBitmap is null, decodeResource failed.");
            return;
        }
        int height = (int) (this.n / (((this.m * this.b) * r13.getHeight()) / r13.getWidth()));
        this.l = height;
        this.k = 3;
        int i = (height * 12) / 9;
        this.j = i;
        if (i <= 0 || height <= 0) {
            return;
        }
        this.c.clear();
        for (int i2 = 0; i2 < this.j; i2++) {
            a aVar = new a(getContext(), this.o, this.f3182a, this.b, this.m);
            if (aVar.b() > 0 && aVar.a() > 0) {
                int i3 = i2 % 4;
                if (i3 == 0) {
                    i3 = (i2 / 4) * 9;
                } else if (i3 == 1) {
                    i3 = ((i2 / 4) * 9) + 2;
                } else if (i3 == 2) {
                    i3 = ((i2 / 4) * 9) + 4;
                } else if (i3 == 3) {
                    i3 = ((i2 / 4) * 9) + 8;
                }
                int i4 = this.k;
                int i5 = i3 / i4;
                int i6 = i3 % i4;
                int i7 = this.m / i4;
                int i8 = this.n / this.l;
                int b = aVar.b();
                int a2 = aVar.a();
                aVar.f3183a = (i6 * i7) + ((i7 - b) >> 1);
                int nextInt = this.d.nextInt(21) - 10;
                int nextInt2 = this.d.nextInt(a2 / 3) + (a2 / 3);
                if (i5 > 0 && (f = this.g.get(Integer.valueOf(i3 - this.k))) != null) {
                    aVar.b = f.floatValue() + nextInt2 + nextInt;
                    if ((this.n - aVar.b) - b() < a2) {
                        if (this.h == null) {
                            this.h = new ArrayList();
                        }
                        this.h.add(Integer.valueOf(i2));
                    }
                }
                if (aVar.b == 0.0f) {
                    aVar.b = (i5 * i8) + nextInt2 + nextInt;
                }
                float f2 = a2;
                if (aVar.b + f2 > this.n) {
                    aVar.b = (r7 - a2) - b();
                }
                if (aVar.b < 0.0f) {
                    aVar.b = a2 >> 1;
                }
                this.g.put(Integer.valueOf(i3), Float.valueOf(aVar.b + f2));
            }
            this.c.add(aVar);
        }
        List<Integer> list = this.h;
        if (list != null && list.size() > 0) {
            Iterator<Integer> it = this.h.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (intValue >= 0 && intValue < this.c.size()) {
                    a aVar2 = this.c.get(intValue);
                    if (aVar2 != null) {
                        aVar2.d();
                    }
                    this.c.remove(intValue);
                }
            }
        }
        invalidate();
    }

    private void a(Bitmap bitmap) {
        int height = (int) (this.n / (((this.m * this.b) * bitmap.getHeight()) / bitmap.getWidth()));
        this.l = height;
        this.k = 3;
        this.j = (height * 12) / 9;
    }

    private a b(Bitmap bitmap) {
        return new a(getContext(), bitmap, this.f3182a, this.b, this.m);
    }

    private static int a(int i) {
        int i2 = i % 4;
        if (i2 == 0) {
            return (i / 4) * 9;
        }
        if (i2 == 1) {
            return ((i / 4) * 9) + 2;
        }
        if (i2 == 2) {
            return ((i / 4) * 9) + 4;
        }
        return i2 == 3 ? ((i / 4) * 9) + 8 : i2;
    }

    private void a(a aVar, int i) {
        Float f;
        if (aVar.b() <= 0 || aVar.a() <= 0) {
            return;
        }
        int i2 = i % 4;
        if (i2 == 0) {
            i2 = (i / 4) * 9;
        } else if (i2 == 1) {
            i2 = ((i / 4) * 9) + 2;
        } else if (i2 == 2) {
            i2 = ((i / 4) * 9) + 4;
        } else if (i2 == 3) {
            i2 = ((i / 4) * 9) + 8;
        }
        int i3 = this.k;
        int i4 = i2 / i3;
        int i5 = i2 % i3;
        int i6 = this.m / i3;
        int i7 = this.n / this.l;
        int b = aVar.b();
        int a2 = aVar.a();
        aVar.f3183a = (i5 * i6) + ((i6 - b) >> 1);
        int nextInt = this.d.nextInt(21) - 10;
        int i8 = a2 / 3;
        int nextInt2 = this.d.nextInt(i8) + i8;
        if (i4 > 0 && (f = this.g.get(Integer.valueOf(i2 - this.k))) != null) {
            aVar.b = f.floatValue() + nextInt2 + nextInt;
            if ((this.n - aVar.b) - b() < a2) {
                if (this.h == null) {
                    this.h = new ArrayList();
                }
                this.h.add(Integer.valueOf(i));
            }
        }
        if (aVar.b == 0.0f) {
            aVar.b = (i4 * i7) + nextInt2 + nextInt;
        }
        float f2 = a2;
        if (aVar.b + f2 > this.n) {
            aVar.b = (r3 - a2) - b();
        }
        if (aVar.b < 0.0f) {
            aVar.b = a2 >> 1;
        }
        this.g.put(Integer.valueOf(i2), Float.valueOf(aVar.b + f2));
    }

    private int b() {
        return q.a(getContext(), 5.0f);
    }
}
