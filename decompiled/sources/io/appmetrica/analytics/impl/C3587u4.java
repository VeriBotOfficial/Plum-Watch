package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;

/* renamed from: io.appmetrica.analytics.impl.u4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3587u4 implements ClientStorageProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Wk f18524a;

    public C3587u4(Wk wk) {
        this.f18524a = wk;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider
    public final ModulePreferences modulePreferences(String str) {
        return new C3148cd(str, this.f18524a);
    }
}
