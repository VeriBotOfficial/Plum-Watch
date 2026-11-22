package io.appmetrica.analytics.billingv6.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class m extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f17660a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ p c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(LinkedHashMap linkedHashMap, Map map, p pVar) {
        super(0);
        this.f17660a = linkedHashMap;
        this.b = map;
        this.c = pVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Map map = this.f17660a;
        Map map2 = this.b;
        p pVar = this.c;
        t.a(map, map2, pVar.d, pVar.c.getBillingInfoManager());
        return Unit.INSTANCE;
    }
}
