package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class yn1 {

    /* renamed from: a, reason: collision with root package name */
    private final ot1 f17442a;
    private final z2 b;

    public yn1(ot1 schedulePlaylistItemsProvider, z2 adBreakStatusController) {
        Intrinsics.checkNotNullParameter(schedulePlaylistItemsProvider, "schedulePlaylistItemsProvider");
        Intrinsics.checkNotNullParameter(adBreakStatusController, "adBreakStatusController");
        this.f17442a = schedulePlaylistItemsProvider;
        this.b = adBreakStatusController;
    }

    public final gt a(long j) {
        boolean z;
        ArrayList a2 = this.f17442a.a();
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            gt a3 = ((ej1) a2.get(i)).a();
            if (i <= 0 ? j >= 0 : j > ((ej1) a2.get(i - 1)).b()) {
                if (j <= ((ej1) a2.get(i)).b()) {
                    z = false;
                    y2 a4 = this.b.a(a3);
                    if (z && y2.b == a4) {
                        return a3;
                    }
                }
            }
            z = true;
            y2 a42 = this.b.a(a3);
            if (z) {
            }
        }
        return null;
    }
}
