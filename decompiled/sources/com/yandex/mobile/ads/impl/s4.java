package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.r4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s4 {

    /* renamed from: a, reason: collision with root package name */
    private final q4 f16828a;
    private final r4 b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s4(q4 q4Var) {
        this(q4Var, r4.a.a());
        int i = r4.e;
    }

    public s4(q4 adIdProvider, r4 adIdStorage) {
        Intrinsics.checkNotNullParameter(adIdProvider, "adIdProvider");
        Intrinsics.checkNotNullParameter(adIdStorage, "adIdStorage");
        this.f16828a = adIdProvider;
        this.b = adIdStorage;
    }

    public final void a() {
        String a2 = this.f16828a.a();
        if (a2 == null || a2.length() == 0) {
            return;
        }
        this.b.a(a2);
    }

    public final void b() {
        String a2 = this.f16828a.a();
        if (a2 == null || a2.length() == 0) {
            return;
        }
        this.b.b(a2);
    }
}
