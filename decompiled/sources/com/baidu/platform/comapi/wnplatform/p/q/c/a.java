package com.baidu.platform.comapi.wnplatform.p.q.c;

import android.content.Context;
import android.util.DisplayMetrics;

/* compiled from: DpiInfo.java */
/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private int f8964a = -1;
    private int b = -1;
    private float c = -1.0f;
    private int d = -1;
    private int e = -1;
    private int f = -1;
    private double g = -1.0d;

    public void a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f8964a = displayMetrics.widthPixels;
        this.b = displayMetrics.heightPixels;
        this.c = displayMetrics.density;
        this.d = (int) displayMetrics.xdpi;
        this.e = (int) displayMetrics.ydpi;
        double sqrt = Math.sqrt((r1 * r1) + (r0 * r0));
        double d = displayMetrics.widthPixels / displayMetrics.xdpi;
        double d2 = displayMetrics.heightPixels / displayMetrics.ydpi;
        int ceil = (int) Math.ceil(sqrt / Math.sqrt((d * d) + (d2 * d2)));
        this.f = ceil;
        if (ceil < 240) {
            this.f = displayMetrics.densityDpi;
        }
        if (this.f == 0) {
            this.f = 160;
        }
        this.g = this.f / 240.0d;
    }

    public int b() {
        if (this.b == -1) {
            a(com.baidu.platform.comapi.wnplatform.p.q.a.a());
        }
        return this.b;
    }

    public int c() {
        if (this.f8964a == -1) {
            a(com.baidu.platform.comapi.wnplatform.p.q.a.a());
        }
        return this.f8964a;
    }

    public float a() {
        if (this.c == -1.0f) {
            a(com.baidu.platform.comapi.wnplatform.p.q.a.a());
        }
        return this.c;
    }
}
