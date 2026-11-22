package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pk0 implements hc0, ue2, uk0, r11, cp1 {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f16576a = new LinkedHashSet();
    private final LinkedHashSet b = new LinkedHashSet();
    private final LinkedHashSet c = new LinkedHashSet();
    private final LinkedHashSet d = new LinkedHashSet();
    private final LinkedHashSet e = new LinkedHashSet();

    public final void a(hc0 forceImpressionTrackingListener) {
        Intrinsics.checkNotNullParameter(forceImpressionTrackingListener, "forceImpressionTrackingListener");
        this.f16576a.add(forceImpressionTrackingListener);
    }

    public final void b(qk0 impressionTrackingListener) {
        Intrinsics.checkNotNullParameter(impressionTrackingListener, "impressionTrackingListener");
        this.c.add(impressionTrackingListener);
    }

    public final void c(qk0 videoImpressionTrackingListener) {
        Intrinsics.checkNotNullParameter(videoImpressionTrackingListener, "videoImpressionTrackingListener");
        this.b.add(videoImpressionTrackingListener);
    }

    public final void a(r11 mobileAdsSchemeImpressionListener) {
        Intrinsics.checkNotNullParameter(mobileAdsSchemeImpressionListener, "mobileAdsSchemeImpressionListener");
        this.e.add(mobileAdsSchemeImpressionListener);
    }

    @Override // com.yandex.mobile.ads.impl.cp1
    public final void f() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((cp1) it.next()).f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.uk0
    public final void c() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((uk0) it.next()).c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.uk0
    public final void g() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((uk0) it.next()).g();
        }
    }

    public final void a(qk0 impressionTrackingListener) {
        Intrinsics.checkNotNullParameter(impressionTrackingListener, "impressionTrackingListener");
        this.d.add(impressionTrackingListener);
    }

    @Override // com.yandex.mobile.ads.impl.ue2
    public final void d() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ue2) it.next()).d();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ue2
    public final void h() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ue2) it.next()).h();
        }
    }

    @Override // com.yandex.mobile.ads.impl.r11
    public final void e() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((r11) it.next()).e();
        }
    }

    @Override // com.yandex.mobile.ads.impl.r11
    public final void b() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((r11) it.next()).b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final void a() {
        Iterator it = this.f16576a.iterator();
        while (it.hasNext()) {
            ((hc0) it.next()).a();
        }
    }
}
