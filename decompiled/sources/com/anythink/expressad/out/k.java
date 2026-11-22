package com.anythink.expressad.out;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.io.Serializable;

/* loaded from: classes12.dex */
public class k implements com.anythink.expressad.foundation.g.d.c, com.anythink.expressad.g.b, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final long f5017a = 1;
    public static final int dg = 1;
    public static final int dh = 2;
    public static final int di = 3;
    public String dj;
    private double j;
    private Object l;
    private String n;
    private Drawable o;
    private Drawable p;

    /* renamed from: q, reason: collision with root package name */
    private r f5018q;
    private String b = "";
    private String c = "";
    private String d = "";
    private String e = "";
    private String f = "";
    private String g = "";
    private String h = "";
    private long i = 0;
    private int k = 33333;
    private int m = 1;
    private int r = 0;
    private int s = 0;
    private int t = 0;

    @Override // com.anythink.expressad.foundation.g.d.c
    public final void a(String str, String str2) {
    }

    private Drawable a() {
        return this.o;
    }

    private Drawable b() {
        return this.p;
    }

    private void a(r rVar) {
        this.f5018q = rVar;
        if (TextUtils.isEmpty(this.g)) {
            return;
        }
        com.anythink.expressad.foundation.g.d.b.a(com.anythink.core.common.d.t.b().g()).a(this.g, this);
    }

    private void b(r rVar) {
        this.f5018q = rVar;
        if (TextUtils.isEmpty(this.h)) {
            return;
        }
        com.anythink.expressad.foundation.g.d.b.a(com.anythink.core.common.d.t.b().g()).a(this.h, this);
    }

    private void c(r rVar) {
        this.f5018q = rVar;
    }

    public final double bf() {
        return this.j;
    }

    public final void a(double d) {
        this.j = d;
    }

    public final int bg() {
        return this.k;
    }

    public final void r(int i) {
        if (i > 0) {
            this.k = i;
        }
    }

    private Object c() {
        return this.l;
    }

    private void a(Object obj) {
        this.l = obj;
    }

    private String d() {
        return this.dj;
    }

    public void o(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.dj = str;
    }

    public final String bh() {
        return this.b;
    }

    public final void w(String str) {
        this.b = str;
    }

    public final String bi() {
        return this.c;
    }

    public final void x(String str) {
        this.c = str;
    }

    public final String bj() {
        return this.d;
    }

    public final void y(String str) {
        this.d = str;
    }

    public final String bk() {
        return this.e;
    }

    public final void z(String str) {
        this.e = str;
    }

    public final String bl() {
        return this.g;
    }

    public final void A(String str) {
        this.g = str;
    }

    public final String bm() {
        return this.h;
    }

    public final void B(String str) {
        this.h = str;
    }

    public final int bn() {
        return this.m;
    }

    public final void s(int i) {
        this.m = i;
    }

    public final long bo() {
        return this.i;
    }

    public final void a(long j) {
        this.i = j;
    }

    public final String bp() {
        return this.f;
    }

    public final void C(String str) {
        this.f = str;
    }

    private int e() {
        return this.r;
    }

    private void a(int i) {
        this.r = i;
    }

    private int f() {
        return this.s;
    }

    private void b(int i) {
        this.s = i;
    }

    private String g() {
        return this.n;
    }

    private void a(String str) {
        this.n = str;
    }

    private static Drawable a(Bitmap bitmap) {
        return new BitmapDrawable(bitmap);
    }

    private void a(Drawable drawable) {
        this.o = drawable;
    }

    private void b(Drawable drawable) {
        this.p = drawable;
    }

    public final void t(int i) {
        this.t = i;
    }

    public final int bq() {
        return this.t;
    }

    @Override // com.anythink.expressad.foundation.g.d.c
    public final void a(Bitmap bitmap, String str) {
        String str2;
        if (!TextUtils.isEmpty(this.h) && this.h.equals(str) && bitmap != null) {
            this.p = a(bitmap);
            if (this.f5018q != null) {
                a(bitmap);
            }
        }
        if (TextUtils.isEmpty(this.g) || (str2 = this.g) == null || !str2.equals(str) || bitmap == null) {
            return;
        }
        this.o = a(bitmap);
        if (this.f5018q != null) {
            a(bitmap);
        }
    }
}
