package com.yandex.mobile.ads.impl;

import androidx.media3.common.Player;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ii1 {

    /* renamed from: a, reason: collision with root package name */
    private final a70 f15820a;

    public ii1(a70 playerProvider) {
        Intrinsics.checkNotNullParameter(playerProvider, "playerProvider");
        this.f15820a = playerProvider;
    }

    public final void a() {
        Player a2 = this.f15820a.a();
        if (a2 == null) {
            return;
        }
        a2.setPlayWhenReady(false);
    }

    public final void b() {
        Player a2 = this.f15820a.a();
        if (a2 == null) {
            return;
        }
        a2.setPlayWhenReady(true);
    }
}
