package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class se0 {
    private static final Object b = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final ps0 f16855a;

    public se0(ps0 localStorage) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        this.f16855a = localStorage;
    }

    public final boolean a(lc lcVar) {
        String a2;
        boolean z = false;
        if (lcVar == null || (a2 = lcVar.a()) == null) {
            return false;
        }
        synchronized (b) {
            String d = this.f16855a.d("google_advertising_id_key");
            if (d != null) {
                if (!Intrinsics.areEqual(a2, d)) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final void b(lc lcVar) {
        String d = this.f16855a.d("google_advertising_id_key");
        String a2 = lcVar != null ? lcVar.a() : null;
        if (d != null || a2 == null) {
            return;
        }
        this.f16855a.a("google_advertising_id_key", a2);
    }
}
