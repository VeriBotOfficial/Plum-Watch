package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n21 implements r11, s11, ze1 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f16300a = new ArrayList();
    private final ArrayList b = new ArrayList();
    private final ArrayList c = new ArrayList();

    public final void a(r11 mobileAdsSchemeImpressionListener) {
        Intrinsics.checkNotNullParameter(mobileAdsSchemeImpressionListener, "mobileAdsSchemeImpressionListener");
        this.f16300a.add(mobileAdsSchemeImpressionListener);
    }

    public final void a(s11 mobileAdsSchemeRewardListener) {
        Intrinsics.checkNotNullParameter(mobileAdsSchemeRewardListener, "mobileAdsSchemeRewardListener");
        this.b.add(mobileAdsSchemeRewardListener);
    }

    @Override // com.yandex.mobile.ads.impl.r11
    public final void e() {
        Iterator it = this.f16300a.iterator();
        while (it.hasNext()) {
            ((r11) it.next()).e();
        }
    }

    @Override // com.yandex.mobile.ads.impl.r11
    public final void b() {
        Iterator it = this.f16300a.iterator();
        while (it.hasNext()) {
            ((r11) it.next()).b();
        }
    }

    public final void a(ze1 onCloseButtonListener) {
        Intrinsics.checkNotNullParameter(onCloseButtonListener, "onCloseButtonListener");
        this.c.add(onCloseButtonListener);
    }

    @Override // com.yandex.mobile.ads.impl.ze1
    public final void c() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((ze1) it.next()).c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.s11
    public final void a() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((s11) it.next()).a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ze1
    public final void a(boolean z) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((ze1) it.next()).a(z);
        }
    }
}
