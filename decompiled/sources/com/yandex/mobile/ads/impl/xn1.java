package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xn1 {

    /* renamed from: a, reason: collision with root package name */
    private final ot1 f17354a;
    private final z2 b;

    public xn1(ot1 schedulePlaylistItemsProvider, z2 adBreakStatusController) {
        Intrinsics.checkNotNullParameter(schedulePlaylistItemsProvider, "schedulePlaylistItemsProvider");
        Intrinsics.checkNotNullParameter(adBreakStatusController, "adBreakStatusController");
        this.f17354a = schedulePlaylistItemsProvider;
        this.b = adBreakStatusController;
    }

    public final gt a(long j) {
        Iterator it = this.f17354a.a().iterator();
        while (it.hasNext()) {
            ej1 ej1Var = (ej1) it.next();
            gt a2 = ej1Var.a();
            boolean z = Math.abs(ej1Var.b() - j) < 200;
            y2 a3 = this.b.a(a2);
            if (z && y2.d == a3) {
                return a2;
            }
        }
        return null;
    }
}
