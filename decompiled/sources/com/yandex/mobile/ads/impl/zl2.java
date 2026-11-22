package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.InitializationListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class zl2 implements dt {

    /* renamed from: a, reason: collision with root package name */
    private final InitializationListener f17538a;

    static final class a extends Lambda implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            zl2.this.f17538a.onInitializationCompleted();
            return Unit.INSTANCE;
        }
    }

    public zl2(InitializationListener initializationListener) {
        Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
        this.f17538a = initializationListener;
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void onInitializationCompleted() {
        new CallbackStackTraceMarker(new a());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zl2) && Intrinsics.areEqual(((zl2) obj).f17538a, this.f17538a);
    }

    public final int hashCode() {
        return this.f17538a.hashCode();
    }
}
