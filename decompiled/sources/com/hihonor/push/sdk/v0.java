package com.hihonor.push.sdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* loaded from: classes11.dex */
public final class v0<TResult> {
    public boolean b;
    public TResult c;
    public Exception d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f10163a = new Object();
    public List<j0<TResult>> e = new ArrayList();

    public final v0<TResult> a(j0<TResult> j0Var) {
        synchronized (this.f10163a) {
            if (this.b) {
                j0Var.a(this);
            } else {
                this.e.add(j0Var);
            }
        }
        return this;
    }

    public final void a() {
        synchronized (this.f10163a) {
            Iterator<j0<TResult>> it = this.e.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.e = null;
        }
    }

    public final TResult b() {
        TResult tresult;
        synchronized (this.f10163a) {
            if (this.d != null) {
                throw new RuntimeException(this.d);
            }
            tresult = this.c;
        }
        return tresult;
    }

    public final boolean c() {
        boolean z;
        synchronized (this.f10163a) {
            if (this.b) {
                synchronized (this.f10163a) {
                }
                z = this.d == null;
            }
        }
        return z;
    }
}
