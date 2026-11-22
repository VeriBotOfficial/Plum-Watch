package io.appmetrica.analytics.impl;

import android.util.Pair;

/* renamed from: io.appmetrica.analytics.impl.d0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3160d0 {

    /* renamed from: a, reason: collision with root package name */
    public Lc f18225a;
    public long b;
    public boolean c;
    public final Tk d;

    public C3160d0(String str, long j, Tk tk) {
        this.b = j;
        try {
            this.f18225a = new Lc(str);
        } catch (Throwable unused) {
            this.f18225a = new Lc();
        }
        this.d = tk;
    }

    public final synchronized void a(Pair pair) {
        if (this.d.b(this.f18225a, (String) pair.first, (String) pair.second)) {
            this.c = true;
        }
    }

    public final synchronized String toString() {
        return "Map size " + this.f18225a.size() + ". Is changed " + this.c + ". Current revision " + this.b;
    }

    public final synchronized C3135c0 a() {
        if (this.c) {
            this.b++;
            this.c = false;
        }
        return new C3135c0(AbstractC3395mb.b(this.f18225a), this.b);
    }
}
