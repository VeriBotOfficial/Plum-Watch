package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ga implements r81 {

    /* renamed from: a, reason: collision with root package name */
    private final gc0 f15569a;

    public ga(gc0 noticeForceClickController) {
        Intrinsics.checkNotNullParameter(noticeForceClickController, "noticeForceClickController");
        this.f15569a = noticeForceClickController;
    }

    @Override // com.yandex.mobile.ads.impl.r81
    public final void a(pk0 eventsObservable) {
        Intrinsics.checkNotNullParameter(eventsObservable, "eventsObservable");
        this.f15569a.a(eventsObservable);
    }
}
