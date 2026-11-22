package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.ti2;
import com.yandex.mobile.ads.impl.tm;
import com.yandex.mobile.ads.impl.xq1;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class up1<T> implements Comparable<up1<T>> {
    private final ti2.a b;
    private final int c;
    private final String d;
    private final int e;
    private final Object f;
    private xq1.a g;
    private Integer h;
    private iq1 i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private nr1 o;
    private tm.a p;

    /* renamed from: q, reason: collision with root package name */
    private Object f17078q;
    private b r;

    interface b {
    }

    protected abstract xq1<T> a(xc1 xc1Var);

    protected abstract void a(T t);

    protected si2 b(si2 si2Var) {
        return si2Var;
    }

    public byte[] b() throws ai {
        return null;
    }

    public Map<String, String> e() throws ai {
        return Collections.emptyMap();
    }

    public int g() {
        return 2;
    }

    public final int j() {
        return this.o.a();
    }

    public final void q() {
        this.j = false;
    }

    public final void r() {
        this.n = true;
    }

    public final void s() {
        this.m = true;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        up1 up1Var = (up1) obj;
        int g = g();
        int g2 = up1Var.g();
        return g == g2 ? this.h.intValue() - up1Var.h.intValue() : f9.a(g2) - f9.a(g);
    }

    public up1(int i, String str, xq1.a aVar) {
        this.b = ti2.a.c ? new ti2.a() : null;
        this.f = new Object();
        this.j = true;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.p = null;
        this.c = i;
        this.d = str;
        this.g = aVar;
        a(new m00());
        this.e = b(str);
    }

    public final int f() {
        return this.c;
    }

    public final Object i() {
        return this.f17078q;
    }

    public final int k() {
        return this.e;
    }

    private static int b(String str) {
        Uri parse;
        String host;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public final void b(int i) {
        this.h = Integer.valueOf(i);
    }

    public final void b(Object obj) {
        this.f17078q = obj;
    }

    final void c(String str) {
        iq1 iq1Var = this.i;
        if (iq1Var != null) {
            iq1Var.b(this);
        }
        if (ti2.a.c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new a(str, id2));
            } else {
                this.b.a(str, id2);
                this.b.a(toString());
            }
        }
    }

    final class a implements Runnable {
        final /* synthetic */ String b;
        final /* synthetic */ long c;

        a(String str, long j) {
            this.b = str;
            this.c = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            up1.this.b.a(this.b, this.c);
            up1 up1Var = up1.this;
            up1Var.b.a(up1Var.toString());
        }
    }

    public String l() {
        return this.d;
    }

    public final String d() {
        String l = l();
        int i = this.c;
        return (i == 0 || i == -1) ? l : Integer.toString(i) + '-' + l;
    }

    public void a() {
        synchronized (this.f) {
            this.k = true;
            this.g = null;
        }
    }

    public final boolean n() {
        boolean z;
        synchronized (this.f) {
            z = this.k;
        }
        return z;
    }

    public final boolean t() {
        return this.j;
    }

    public final boolean v() {
        return this.m;
    }

    public final boolean u() {
        return this.n;
    }

    public final tm.a c() {
        return this.p;
    }

    public final nr1 h() {
        return this.o;
    }

    public final void o() {
        synchronized (this.f) {
            this.l = true;
        }
    }

    public final boolean m() {
        boolean z;
        synchronized (this.f) {
            z = this.l;
        }
        return z;
    }

    final void p() {
        b bVar;
        synchronized (this.f) {
            bVar = this.r;
        }
        if (bVar != null) {
            ((hj2) bVar).b(this);
        }
    }

    public final String toString() {
        return (n() ? "[X] " : "[ ] ") + l() + " " + ("0x" + Integer.toHexString(this.e)) + " " + wp1.a(g()) + " " + this.h;
    }

    public final void a(si2 si2Var) {
        xq1.a aVar;
        synchronized (this.f) {
            aVar = this.g;
        }
        if (aVar != null) {
            aVar.a(si2Var);
        }
    }

    final void a(xq1<?> xq1Var) {
        b bVar;
        synchronized (this.f) {
            bVar = this.r;
        }
        if (bVar != null) {
            ((hj2) bVar).a(this, xq1Var);
        }
    }

    final void a(int i) {
        iq1 iq1Var = this.i;
        if (iq1Var != null) {
            iq1Var.a(this, i);
        }
    }

    public final void a(tm.a aVar) {
        this.p = aVar;
    }

    final void a(b bVar) {
        synchronized (this.f) {
            this.r = bVar;
        }
    }

    public final void a(iq1 iq1Var) {
        this.i = iq1Var;
    }

    public final void a(m00 m00Var) {
        this.o = m00Var;
    }

    public final void a(String str) {
        if (ti2.a.c) {
            this.b.a(str, Thread.currentThread().getId());
        }
    }
}
