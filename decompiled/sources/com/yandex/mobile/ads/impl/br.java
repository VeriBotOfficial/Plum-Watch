package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class br implements c10 {

    /* renamed from: a, reason: collision with root package name */
    private final c10[] f15133a;

    public br(c10... designConstraints) {
        Intrinsics.checkNotNullParameter(designConstraints, "designConstraints");
        this.f15133a = designConstraints;
    }

    @Override // com.yandex.mobile.ads.impl.c10
    public final boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        for (c10 c10Var : this.f15133a) {
            if (!c10Var.a(context)) {
                return false;
            }
        }
        return true;
    }
}
