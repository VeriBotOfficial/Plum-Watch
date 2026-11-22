package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.mg2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ng2 implements mg2 {

    /* renamed from: a, reason: collision with root package name */
    private final mg2 f16339a;
    private boolean b;
    private boolean c;

    public ng2(gr videoTracker) {
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        this.f16339a = videoTracker;
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void a(View view, List<xb2> friendlyOverlays) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
        this.f16339a.a(view, friendlyOverlays);
        this.b = false;
        this.c = false;
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void c() {
        this.f16339a.c();
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void d() {
        this.f16339a.d();
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void f() {
        this.f16339a.f();
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void i() {
        this.f16339a.i();
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void j() {
        this.f16339a.j();
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void l() {
        this.f16339a.l();
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void a(String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        this.f16339a.a(assetName);
        h();
        n();
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void h() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.f16339a.h();
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void n() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.f16339a.n();
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void m() {
        this.f16339a.m();
        h();
        n();
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void b() {
        this.f16339a.b();
        k();
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void g() {
        this.f16339a.g();
        k();
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void e() {
        this.f16339a.e();
        k();
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void a(xc2 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f16339a.a(error);
        k();
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void k() {
        this.f16339a.k();
        this.b = false;
        this.c = false;
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void a(mg2.a quartile) {
        Intrinsics.checkNotNullParameter(quartile, "quartile");
        this.f16339a.a(quartile);
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void a(float f, long j) {
        this.f16339a.a(f, j);
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void a() {
        this.f16339a.a();
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void a(float f) {
        this.f16339a.a(f);
    }
}
