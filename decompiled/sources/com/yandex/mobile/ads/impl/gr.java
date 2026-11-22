package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.mg2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gr implements mg2 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f15623a = new ArrayList();

    public final void a(mg2 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f15623a.add(tracker);
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void a(View view, List<xb2> friendlyOverlays) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
        Iterator it = this.f15623a.iterator();
        while (it.hasNext()) {
            ((mg2) it.next()).a(view, friendlyOverlays);
        }
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void i() {
        Iterator it = this.f15623a.iterator();
        while (it.hasNext()) {
            ((mg2) it.next()).i();
        }
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void h() {
        Iterator it = this.f15623a.iterator();
        while (it.hasNext()) {
            ((mg2) it.next()).h();
        }
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void n() {
        Iterator it = this.f15623a.iterator();
        while (it.hasNext()) {
            ((mg2) it.next()).n();
        }
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void m() {
        Iterator it = this.f15623a.iterator();
        while (it.hasNext()) {
            ((mg2) it.next()).m();
        }
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void f() {
        Iterator it = this.f15623a.iterator();
        while (it.hasNext()) {
            ((mg2) it.next()).f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void j() {
        Iterator it = this.f15623a.iterator();
        while (it.hasNext()) {
            ((mg2) it.next()).j();
        }
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void d() {
        Iterator it = this.f15623a.iterator();
        while (it.hasNext()) {
            ((mg2) it.next()).d();
        }
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void c() {
        Iterator it = this.f15623a.iterator();
        while (it.hasNext()) {
            ((mg2) it.next()).c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void b() {
        Iterator it = this.f15623a.iterator();
        while (it.hasNext()) {
            ((mg2) it.next()).b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void g() {
        Iterator it = this.f15623a.iterator();
        while (it.hasNext()) {
            ((mg2) it.next()).g();
        }
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void e() {
        Iterator it = this.f15623a.iterator();
        while (it.hasNext()) {
            ((mg2) it.next()).e();
        }
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void l() {
        Iterator it = this.f15623a.iterator();
        while (it.hasNext()) {
            ((mg2) it.next()).l();
        }
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void k() {
        Iterator it = this.f15623a.iterator();
        while (it.hasNext()) {
            ((mg2) it.next()).k();
        }
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void a(String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Iterator it = this.f15623a.iterator();
        while (it.hasNext()) {
            ((mg2) it.next()).a(assetName);
        }
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void a(xc2 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Iterator it = this.f15623a.iterator();
        while (it.hasNext()) {
            ((mg2) it.next()).a(error);
        }
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void a(mg2.a quartile) {
        Intrinsics.checkNotNullParameter(quartile, "quartile");
        Iterator it = this.f15623a.iterator();
        while (it.hasNext()) {
            ((mg2) it.next()).a(quartile);
        }
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void a(float f, long j) {
        Iterator it = this.f15623a.iterator();
        while (it.hasNext()) {
            ((mg2) it.next()).a(f, j);
        }
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void a() {
        Iterator it = this.f15623a.iterator();
        while (it.hasNext()) {
            ((mg2) it.next()).a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.mg2
    public final void a(float f) {
        Iterator it = this.f15623a.iterator();
        while (it.hasNext()) {
            ((mg2) it.next()).a(f);
        }
    }
}
