package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ou0 {

    /* renamed from: a, reason: collision with root package name */
    private final ps0 f16487a;
    private final Object b;
    private String c;

    public ou0(ps0 localStorage) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        this.f16487a = localStorage;
        this.b = new Object();
    }

    public final String a() {
        String str;
        synchronized (this.b) {
            if (this.c == null) {
                this.c = this.f16487a.d("YmadMauid");
            }
            str = this.c;
        }
        return str;
    }

    public final void a(String mauid) {
        Intrinsics.checkNotNullParameter(mauid, "mauid");
        synchronized (this.b) {
            this.c = mauid;
            this.f16487a.a("YmadMauid", mauid);
            Unit unit = Unit.INSTANCE;
        }
    }
}
