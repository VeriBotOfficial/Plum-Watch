package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.sl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fp1 implements sl.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gp1 f15516a;
    final /* synthetic */ yb1 b;
    final /* synthetic */ hp1 c;

    fp1(gp1 gp1Var, yb1 yb1Var, hp1 hp1Var) {
        this.f15516a = gp1Var;
        this.b = yb1Var;
        this.c = hp1Var;
    }

    @Override // com.yandex.mobile.ads.impl.sl.b
    public final void a(Bitmap bitmap) {
        ep1 ep1Var;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ep1Var = this.f15516a.d;
        yb1 yb1Var = this.b;
        hp1 hp1Var = this.c;
        ep1Var.getClass();
        ep1.a(yb1Var, hp1Var, bitmap);
    }
}
