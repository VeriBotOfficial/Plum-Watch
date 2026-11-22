package io.appmetrica.analytics.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3582u extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3557t f18521a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3582u(C3557t c3557t) {
        super(1);
        this.f18521a = c3557t;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f18521a.e = (byte[]) obj;
        return Unit.INSTANCE;
    }
}
