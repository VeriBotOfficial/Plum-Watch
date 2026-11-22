package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.u5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3588u5 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C3588u5 f18525a = new C3588u5();

    public C3588u5() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ModuleAdRevenueProcessor) obj).getDescription();
    }
}
