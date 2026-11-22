package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.a0;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: RouteDatabase.java */
/* loaded from: classes17.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Set<a0> f12173a = new LinkedHashSet();

    public synchronized void a(a0 a0Var) {
        this.f12173a.remove(a0Var);
    }

    public synchronized void b(a0 a0Var) {
        this.f12173a.add(a0Var);
    }

    public synchronized boolean c(a0 a0Var) {
        return this.f12173a.contains(a0Var);
    }
}
