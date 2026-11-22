package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class Uj {

    /* renamed from: a, reason: collision with root package name */
    public final Tj f18098a;
    public volatile G9 b;
    public volatile G9 c;
    public volatile G9 d;
    public volatile G9 e;
    public volatile G9 f;
    public volatile G9 g;
    public volatile Sj h;

    public Uj() {
        this(new Tj());
    }

    public final IHandlerExecutor a() {
        if (this.g == null) {
            synchronized (this) {
                if (this.g == null) {
                    this.f18098a.getClass();
                    HandlerThreadC3296ib a2 = G9.a("IAA-SDE");
                    this.g = new G9(a2, a2.getLooper(), new Handler(a2.getLooper()));
                }
            }
        }
        return this.g;
    }

    public final IHandlerExecutor b() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.f18098a.getClass();
                    HandlerThreadC3296ib a2 = G9.a("IAA-SC");
                    this.b = new G9(a2, a2.getLooper(), new Handler(a2.getLooper()));
                }
            }
        }
        return this.b;
    }

    public final IHandlerExecutor c() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    this.f18098a.getClass();
                    HandlerThreadC3296ib a2 = G9.a("IAA-SMH-1");
                    this.d = new G9(a2, a2.getLooper(), new Handler(a2.getLooper()));
                }
            }
        }
        return this.d;
    }

    public final IHandlerExecutor d() {
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    this.f18098a.getClass();
                    HandlerThreadC3296ib a2 = G9.a("IAA-SNTPE");
                    this.e = new G9(a2, a2.getLooper(), new Handler(a2.getLooper()));
                }
            }
        }
        return this.e;
    }

    public final IHandlerExecutor e() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.f18098a.getClass();
                    HandlerThreadC3296ib a2 = G9.a("IAA-STE");
                    this.c = new G9(a2, a2.getLooper(), new Handler(a2.getLooper()));
                }
            }
        }
        return this.c;
    }

    public final Executor f() {
        if (this.h == null) {
            synchronized (this) {
                if (this.h == null) {
                    this.f18098a.getClass();
                    this.h = new Sj(new Handler(Looper.getMainLooper()));
                }
            }
        }
        return this.h;
    }

    public Uj(Tj tj) {
        new HashMap();
        this.f18098a = tj;
    }
}
