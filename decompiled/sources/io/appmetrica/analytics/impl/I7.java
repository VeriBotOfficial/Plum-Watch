package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;

/* loaded from: classes6.dex */
public final class I7 implements AskForPermissionStrategyModuleProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Od f17901a = new Od();

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    public final PermissionStrategy getAskForPermissionStrategy() {
        return this.f17901a;
    }
}
