package io.appmetrica.analytics.impl;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.qd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3497qd extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3370lb f18467a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3497qd(C3370lb c3370lb) {
        super(1);
        this.f18467a = c3370lb;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C3173dd c3173dd = (C3173dd) ((Map.Entry) obj).getValue();
        return c3173dd.b.parse(this.f18467a);
    }
}
