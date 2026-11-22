package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.View;
import com.amap.api.maps.MapsInitializer;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.wakeup.common.burypoint.BuryPointPageId;
import java.io.File;

/* compiled from: WaterMarkerView.java */
/* loaded from: classes11.dex */
public class j5 extends View {

    /* renamed from: a, reason: collision with root package name */
    private Bitmap f1698a;
    private Bitmap b;
    private Bitmap c;
    private Bitmap d;
    private Bitmap e;
    private Bitmap f;
    private Paint g;
    private boolean h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f1699q;
    private boolean r;
    private Context s;
    private boolean t;
    private float u;
    private float v;
    private boolean w;
    private boolean x;

    public j5(Context context) {
        super(context);
        this.g = new Paint();
        this.h = false;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 10;
        this.m = 0;
        this.n = 0;
        this.o = 10;
        this.p = 8;
        this.f1699q = false;
        this.r = false;
        this.t = true;
        this.u = 0.0f;
        this.v = 0.0f;
        this.w = true;
        this.x = false;
        try {
            this.s = context.getApplicationContext();
            if (MapsInitializer.getRegionLanguageType() != 0) {
                this.e = m4.b(context, "ap_en.data");
            } else {
                this.e = m4.b(context, "ap.data");
            }
            this.f1698a = t4.a(this.e, v0.b);
            if (MapsInitializer.getRegionLanguageType() != 0) {
                this.f = m4.b(context, "ap1_en.data");
            } else {
                this.f = m4.b(context, "ap1.data");
            }
            Bitmap a2 = t4.a(this.f, v0.b);
            this.b = a2;
            this.j = a2.getWidth();
            this.i = this.b.getHeight();
            this.g.setAntiAlias(true);
            this.g.setColor(-16777216);
            this.g.setStyle(Paint.Style.STROKE);
            AMapEngineUtils.LOGO_CUSTOM_ICON_DAY_NAME = context.getFilesDir() + "/icon_web_day.data";
            AMapEngineUtils.LOGO_CUSTOM_ICON_NIGHT_NAME = context.getFilesDir() + "/icon_web_night.data";
            s4.b().a(new i5(this));
        } catch (Throwable th) {
            ja.a(th, "WaterMarkerView", BuryPointPageId.PAGE_ID_PLAN_CREATE);
        }
    }

    public void d(int i) {
        this.n = 0;
        this.k = i;
        e();
    }

    public void e() {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        a();
        postInvalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmap;
        try {
            if (this.t && getWidth() != 0 && getHeight() != 0 && this.b != null) {
                if (!this.f1699q) {
                    a();
                    this.f1699q = true;
                }
                if (this.h) {
                    if (!this.r || (bitmap = this.d) == null) {
                        bitmap = this.b;
                    }
                } else if (!this.r || (bitmap = this.c) == null) {
                    bitmap = this.f1698a;
                }
                canvas.drawBitmap(bitmap, this.l, this.m, this.g);
            }
        } catch (Throwable th) {
            ja.a(th, "WaterMarkerView", "onDraw");
            th.printStackTrace();
        }
    }

    public void a(boolean z) {
        if (this.t) {
            try {
                this.h = z;
                if (z) {
                    this.g.setColor(-1);
                } else {
                    this.g.setColor(-16777216);
                }
            } catch (Throwable th) {
                ja.a(th, "WaterMarkerView", "changeBitmap");
                th.printStackTrace();
            }
        }
    }

    public void b() {
        try {
            Bitmap bitmap = this.f1698a;
            if (bitmap != null) {
                t4.a(bitmap);
                this.f1698a = null;
            }
            Bitmap bitmap2 = this.b;
            if (bitmap2 != null) {
                t4.a(bitmap2);
                this.b = null;
            }
            this.f1698a = null;
            this.b = null;
            Bitmap bitmap3 = this.e;
            if (bitmap3 != null) {
                t4.a(bitmap3);
                this.e = null;
            }
            Bitmap bitmap4 = this.f;
            if (bitmap4 != null) {
                t4.a(bitmap4);
                this.f = null;
            }
            Bitmap bitmap5 = this.c;
            if (bitmap5 != null) {
                t4.a(bitmap5);
            }
            this.c = null;
            Bitmap bitmap6 = this.d;
            if (bitmap6 != null) {
                t4.a(bitmap6);
            }
            this.d = null;
            this.g = null;
        } catch (Throwable th) {
            ja.a(th, "WaterMarkerView", "destory");
            th.printStackTrace();
        }
    }

    public Point c() {
        return new Point(this.l, this.m - 2);
    }

    public void c(int i) {
        this.n = 1;
        this.o = i;
        e();
    }

    public void d(boolean z) {
        this.t = z;
    }

    public boolean d() {
        return this.h;
    }

    public void c(boolean z) {
        if (this.t && this.r != z) {
            this.r = z;
            if (z) {
                if (this.h) {
                    Bitmap bitmap = this.d;
                    if (bitmap != null) {
                        this.j = bitmap.getWidth();
                        this.i = this.d.getHeight();
                        return;
                    }
                    return;
                }
                Bitmap bitmap2 = this.c;
                if (bitmap2 != null) {
                    this.j = bitmap2.getWidth();
                    this.i = this.c.getHeight();
                    return;
                }
                return;
            }
            this.j = this.f1698a.getWidth();
            this.i = this.f1698a.getHeight();
        }
    }

    public float a(int i) {
        float f;
        if (!this.t) {
            return 0.0f;
        }
        if (i == 0) {
            return this.u;
        }
        if (i == 1) {
            f = this.u;
        } else {
            if (i != 2) {
                return 0.0f;
            }
            f = this.v;
        }
        return 1.0f - f;
    }

    public void a(int i, float f) {
        if (this.t) {
            this.n = 2;
            float max = Math.max(0.0f, Math.min(f, 1.0f));
            if (i == 0) {
                this.u = max;
                this.w = true;
            } else if (i == 1) {
                this.u = 1.0f - max;
                this.w = false;
            } else if (i == 2) {
                this.v = 1.0f - max;
            }
            e();
        }
    }

    public void b(int i) {
        this.n = 1;
        this.p = i;
        e();
    }

    public void b(boolean z) {
        if (this.t) {
            this.x = z;
            if (z) {
                return;
            }
            this.j = this.f1698a.getWidth();
            this.i = this.f1698a.getHeight();
        }
    }

    private void a() {
        int i = this.n;
        if (i == 0) {
            int i2 = this.k;
            if (i2 == 1) {
                this.o = (getWidth() - this.j) / 2;
            } else if (i2 == 2) {
                this.o = (getWidth() - this.j) - 10;
            } else {
                this.o = 10;
            }
            this.p = 8;
        } else if (i == 2) {
            if (this.w) {
                this.o = (int) (getWidth() * this.u);
            } else {
                this.o = (int) ((getWidth() * this.u) - this.j);
            }
            this.p = (int) (getHeight() * this.v);
        }
        this.l = this.o;
        int height = (getHeight() - this.p) - this.i;
        this.m = height;
        if (this.l < 0) {
            this.l = 0;
        }
        if (height < 0) {
            this.m = 0;
        }
    }

    public void a(String str, int i) {
        try {
            if (this.t && new File(str).exists()) {
                if (i == 0) {
                    Bitmap bitmap = this.c;
                    Bitmap decodeFile = BitmapFactory.decodeFile(str);
                    this.e = decodeFile;
                    this.c = t4.a(decodeFile, v0.b);
                    if (bitmap == null || bitmap.isRecycled()) {
                        return;
                    }
                    t4.a(bitmap);
                    return;
                }
                if (i == 1) {
                    Bitmap bitmap2 = this.d;
                    Bitmap decodeFile2 = BitmapFactory.decodeFile(str);
                    this.e = decodeFile2;
                    this.d = t4.a(decodeFile2, v0.b);
                    if (bitmap2 == null || bitmap2.isRecycled()) {
                        return;
                    }
                    t4.a(bitmap2);
                }
            }
        } catch (Throwable th) {
            ja.a(th, "WaterMarkerView", BuryPointPageId.PAGE_ID_PLAN_CREATE);
            th.printStackTrace();
        }
    }
}
