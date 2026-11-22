package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* loaded from: classes5.dex */
public final class xc0 implements ze1 {
    static final /* synthetic */ KProperty<Object>[] c = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(xc0.class, "contentCloseListener", "getContentCloseListener()Lcom/monetization/ads/fullscreen/content/ContentCloseListener;", 0))};

    /* renamed from: a, reason: collision with root package name */
    private a92 f17324a;
    private final go1 b = ho1.a();

    @Override // com.yandex.mobile.ads.impl.ze1
    public final void c() {
        zr zrVar = (zr) this.b.getValue(this, c[0]);
        if (zrVar != null) {
            zrVar.f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ze1
    public final void a(boolean z) {
        a92 a92Var = this.f17324a;
        if (a92Var != null) {
            a92Var.a(z);
        }
    }

    public final void a(zr zrVar) {
        this.b.setValue(this, c[0], zrVar);
    }

    public final void a(ad0 useCustomCloseListener) {
        Intrinsics.checkNotNullParameter(useCustomCloseListener, "useCustomCloseListener");
        this.f17324a = useCustomCloseListener;
    }
}
