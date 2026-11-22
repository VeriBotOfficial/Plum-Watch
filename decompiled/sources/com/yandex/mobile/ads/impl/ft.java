package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ft implements h82 {

    /* renamed from: a, reason: collision with root package name */
    private final kt f15525a;
    private final mu b;
    private final zn0 c;
    private final ul0 d;
    private final nb2 e;
    private final am0 f;
    private final lm0 g;
    private final po0 h;
    private final to0 i;

    public final void a(t70 instreamAdView, List<xb2> friendlyOverlays) {
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
        ft a2 = this.d.a(instreamAdView);
        if (!Intrinsics.areEqual(this, a2)) {
            if (a2 != null && a2.d.a(a2)) {
                a2.i.d();
            }
            if (this.d.a(this)) {
                this.i.d();
            }
            this.d.a(instreamAdView, this);
        }
        this.g.a(this.f15525a);
        this.h.a(this.b);
        this.i.a(instreamAdView, friendlyOverlays);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ft(android.content.Context r13, com.yandex.mobile.ads.impl.bv1 r14, com.yandex.mobile.ads.impl.et r15, com.yandex.mobile.ads.impl.kt r16, com.yandex.mobile.ads.impl.mu r17) {
        /*
            r12 = this;
            com.yandex.mobile.ads.impl.nm0 r6 = new com.yandex.mobile.ads.impl.nm0
            r6.<init>()
            com.yandex.mobile.ads.impl.qo0 r7 = new com.yandex.mobile.ads.impl.qo0
            r7.<init>()
            com.yandex.mobile.ads.impl.zn0 r8 = new com.yandex.mobile.ads.impl.zn0
            r8.<init>()
            int r0 = com.yandex.mobile.ads.impl.ul0.d
            com.yandex.mobile.ads.impl.ul0 r9 = com.yandex.mobile.ads.impl.ul0.a.a()
            com.yandex.mobile.ads.impl.nb2 r10 = new com.yandex.mobile.ads.impl.nb2
            r10.<init>()
            com.yandex.mobile.ads.impl.am0 r11 = new com.yandex.mobile.ads.impl.am0
            r11.<init>()
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ft.<init>(android.content.Context, com.yandex.mobile.ads.impl.bv1, com.yandex.mobile.ads.impl.et, com.yandex.mobile.ads.impl.kt, com.yandex.mobile.ads.impl.mu):void");
    }

    public final void c() {
        this.f.b();
    }

    public final void d() {
        this.f.c();
    }

    public final void e() {
        if (this.d.a(this)) {
            this.i.d();
        }
    }

    public ft(Context context, bv1 sdkEnvironmentModule, et instreamAd, kt instreamAdPlayer, mu videoPlayer, nm0 instreamAdPlayerReuseControllerFactory, qo0 instreamVideoPlayerReuseControllerFactory, zn0 playbackEventListener, ul0 bindingManager, nb2 playbackProxyListener, am0 customUiElementsHolder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(instreamAd, "instreamAd");
        Intrinsics.checkNotNullParameter(instreamAdPlayer, "instreamAdPlayer");
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        Intrinsics.checkNotNullParameter(instreamAdPlayerReuseControllerFactory, "instreamAdPlayerReuseControllerFactory");
        Intrinsics.checkNotNullParameter(instreamVideoPlayerReuseControllerFactory, "instreamVideoPlayerReuseControllerFactory");
        Intrinsics.checkNotNullParameter(playbackEventListener, "playbackEventListener");
        Intrinsics.checkNotNullParameter(bindingManager, "bindingManager");
        Intrinsics.checkNotNullParameter(playbackProxyListener, "playbackProxyListener");
        Intrinsics.checkNotNullParameter(customUiElementsHolder, "customUiElementsHolder");
        this.f15525a = instreamAdPlayer;
        this.b = videoPlayer;
        this.c = playbackEventListener;
        this.d = bindingManager;
        this.e = playbackProxyListener;
        this.f = customUiElementsHolder;
        instreamAdPlayerReuseControllerFactory.getClass();
        this.g = nm0.a(this);
        instreamVideoPlayerReuseControllerFactory.getClass();
        this.h = qo0.a(this);
        to0 to0Var = new to0(context, sdkEnvironmentModule, instreamAd, new jm0(instreamAdPlayer), new gf2(videoPlayer), customUiElementsHolder);
        this.i = to0Var;
        to0Var.a(playbackEventListener);
        to0Var.a(playbackProxyListener);
    }

    @Override // com.yandex.mobile.ads.impl.h82
    public final void invalidateAdPlayer() {
        this.g.b(this.f15525a);
        this.i.a();
    }

    public final void a() {
        this.h.b(this.b);
        this.i.b();
    }

    public final void b() {
        this.i.c();
    }

    public final void a(lo0 lo0Var) {
        this.e.a(lo0Var);
    }

    public final void a(fm2 fm2Var) {
        this.c.a(fm2Var);
    }
}
