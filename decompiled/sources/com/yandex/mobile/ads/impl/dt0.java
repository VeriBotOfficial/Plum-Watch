package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class dt0 {

    /* renamed from: a, reason: collision with root package name */
    private final bt0 f15308a;
    private final tg1 b;
    private ct0 c;

    public /* synthetic */ dt0(Context context, String str) {
        this(context, str, new bt0(context, str), new tg1(context), null);
    }

    public dt0(Context context, String locationServicesClassName, bt0 locationServices, tg1 permissionExtractor, ct0 ct0Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(locationServicesClassName, "locationServicesClassName");
        Intrinsics.checkNotNullParameter(locationServices, "locationServices");
        Intrinsics.checkNotNullParameter(permissionExtractor, "permissionExtractor");
        this.f15308a = locationServices;
        this.b = permissionExtractor;
        this.c = ct0Var;
    }

    private final ct0 a() {
        he0 a2 = this.f15308a.a();
        if (a2 == null) {
            return null;
        }
        boolean a3 = this.b.a();
        boolean b = this.b.b();
        if (a3 || b) {
            return a2.a();
        }
        return null;
    }

    public final ct0 b() {
        ct0 ct0Var = this.c;
        return ct0Var != null ? ct0Var : a();
    }

    public final void c() {
        this.c = a();
        this.c = a();
    }
}
