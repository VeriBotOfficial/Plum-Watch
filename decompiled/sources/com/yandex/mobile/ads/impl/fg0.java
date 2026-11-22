package com.yandex.mobile.ads.impl;

import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fg0 implements Callable<eg0> {

    /* renamed from: a, reason: collision with root package name */
    private final String f15491a;
    private final hg0 b;

    public fg0(String checkHost, ct defaultHostAccessChecker, hg0 hostAccessCheckerProvider) {
        Intrinsics.checkNotNullParameter(checkHost, "checkHost");
        Intrinsics.checkNotNullParameter(defaultHostAccessChecker, "defaultHostAccessChecker");
        Intrinsics.checkNotNullParameter(hostAccessCheckerProvider, "hostAccessCheckerProvider");
        this.f15491a = checkHost;
        this.b = hostAccessCheckerProvider;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eg0 call() {
        boolean a2 = this.b.a().a(this.f15491a);
        String str = "Host " + this.f15491a + " reachability is " + a2;
        sp0.a(new Object[0]);
        return new eg0(a2);
    }
}
