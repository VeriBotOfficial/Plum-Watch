package io.appmetrica.analytics.impl;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class Of extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Rf f17999a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Of(Rf rf) {
        super(0);
        this.f17999a = rf;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Nf(this.f17999a);
    }
}
