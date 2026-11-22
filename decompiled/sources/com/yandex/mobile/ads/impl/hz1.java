package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hz1 {

    /* renamed from: a, reason: collision with root package name */
    private gz1 f15754a;

    public final gz1 a() {
        return this.f15754a;
    }

    public final void a(gz1 gz1Var) {
        if (gz1Var == null) {
            hp0.c("Ad size can't be null or empty.", new Object[0]);
            return;
        }
        gz1 gz1Var2 = this.f15754a;
        if (gz1Var2 != null && !Intrinsics.areEqual(gz1Var2, gz1Var)) {
            hp0.c("Ad size can't be set twice.", new Object[0]);
        } else {
            this.f15754a = gz1Var;
        }
    }
}
