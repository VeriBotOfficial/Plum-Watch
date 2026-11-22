package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u8 implements y8 {

    /* renamed from: a, reason: collision with root package name */
    private final x8 f17027a;
    private final a9 b;
    private final nb2 c;
    private y8 d;

    public u8(x8 adSectionPlaybackController, a9 adSectionStatusController, nb2 adCreativePlaybackProxyListener) {
        Intrinsics.checkNotNullParameter(adSectionPlaybackController, "adSectionPlaybackController");
        Intrinsics.checkNotNullParameter(adSectionStatusController, "adSectionStatusController");
        Intrinsics.checkNotNullParameter(adCreativePlaybackProxyListener, "adCreativePlaybackProxyListener");
        this.f17027a = adSectionPlaybackController;
        this.b = adSectionStatusController;
        this.c = adCreativePlaybackProxyListener;
        adSectionPlaybackController.a(this);
        adSectionPlaybackController.a(adCreativePlaybackProxyListener);
    }

    public final void f() {
        y8 y8Var;
        int ordinal = this.b.a().ordinal();
        if (ordinal == 0) {
            this.f17027a.prepare();
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 4 && (y8Var = this.d) != null) {
                y8Var.a();
                return;
            }
            return;
        }
        y8 y8Var2 = this.d;
        if (y8Var2 != null) {
            y8Var2.b();
        }
    }

    public final void h() {
        y8 y8Var;
        int ordinal = this.b.a().ordinal();
        if (ordinal == 0) {
            this.f17027a.prepare();
            return;
        }
        if (ordinal == 1) {
            this.b.a(z8.d);
            this.f17027a.start();
            return;
        }
        if (ordinal == 2) {
            this.f17027a.resume();
            return;
        }
        if (ordinal != 3) {
            if (ordinal == 4 && (y8Var = this.d) != null) {
                y8Var.a();
                return;
            }
            return;
        }
        y8 y8Var2 = this.d;
        if (y8Var2 != null) {
            y8Var2.c();
        }
    }

    public final void e() {
        int ordinal = this.b.a().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            this.f17027a.f();
        }
    }

    public final void d() {
        int ordinal = this.b.a().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            this.f17027a.c();
        }
    }

    public final void g() {
        y8 y8Var;
        int ordinal = this.b.a().ordinal();
        if (ordinal == 0) {
            this.f17027a.prepare();
            return;
        }
        if (ordinal == 2) {
            this.f17027a.resume();
            return;
        }
        if (ordinal != 3) {
            if (ordinal == 4 && (y8Var = this.d) != null) {
                y8Var.a();
                return;
            }
            return;
        }
        y8 y8Var2 = this.d;
        if (y8Var2 != null) {
            y8Var2.c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.y8
    public final void b() {
        this.b.a(z8.c);
        y8 y8Var = this.d;
        if (y8Var != null) {
            y8Var.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.y8
    public final void c() {
        this.b.a(z8.e);
        y8 y8Var = this.d;
        if (y8Var != null) {
            y8Var.c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.y8
    public final void a() {
        this.b.a(z8.f);
        y8 y8Var = this.d;
        if (y8Var != null) {
            y8Var.a();
        }
    }

    public final void a(lo0 lo0Var) {
        this.c.a(lo0Var);
    }

    public final void a(y8 y8Var) {
        this.d = y8Var;
    }
}
