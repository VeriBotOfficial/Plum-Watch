package io.appmetrica.analytics.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3607v extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3557t f18542a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3607v(C3557t c3557t) {
        super(1);
        this.f18542a = c3557t;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f18542a.h = (byte[]) obj;
        return Unit.INSTANCE;
    }
}
