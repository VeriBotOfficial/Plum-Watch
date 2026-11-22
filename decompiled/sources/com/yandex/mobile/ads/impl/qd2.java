package com.yandex.mobile.ads.impl;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* loaded from: classes5.dex */
public final class qd2 {
    static final /* synthetic */ KProperty<Object>[] c = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(qd2.class, "status", "getStatus()Lcom/monetization/ads/instream/status/VideoAdStatus;", 0))};

    /* renamed from: a, reason: collision with root package name */
    private final Set<pd2> f16657a = SetsKt.mutableSetOf(pd2.b);
    private final a b;

    public static final class a extends ObservableProperty<pd2> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ qd2 f16658a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(com.yandex.mobile.ads.impl.qd2 r2) {
            /*
                r1 = this;
                com.yandex.mobile.ads.impl.pd2 r0 = com.yandex.mobile.ads.impl.pd2.b
                r1.f16658a = r2
                r1.<init>(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.qd2.a.<init>(com.yandex.mobile.ads.impl.qd2):void");
        }

        @Override // kotlin.properties.ObservableProperty
        protected final void afterChange(KProperty<?> property, pd2 pd2Var, pd2 pd2Var2) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f16658a.f16657a.add(pd2Var2);
        }
    }

    public qd2() {
        Delegates delegates = Delegates.INSTANCE;
        this.b = new a(this);
    }

    public final pd2 a() {
        return this.b.getValue(this, c[0]);
    }

    public final boolean a(pd2 videoAdStatus) {
        Intrinsics.checkNotNullParameter(videoAdStatus, "videoAdStatus");
        return this.f16657a.contains(videoAdStatus);
    }

    public final void b() {
        this.f16657a.clear();
        pd2 pd2Var = pd2.b;
        Intrinsics.checkNotNullParameter(pd2Var, "<set-?>");
        this.b.setValue(this, c[0], pd2Var);
    }

    public final void b(pd2 pd2Var) {
        Intrinsics.checkNotNullParameter(pd2Var, "<set-?>");
        this.b.setValue(this, c[0], pd2Var);
    }
}
