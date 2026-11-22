package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModuleDummy;

/* loaded from: classes6.dex */
public final class Ad {

    /* renamed from: a, reason: collision with root package name */
    public final C3474pf f17766a;
    public final NativeCrashClientModule b;
    public final A0 c;
    public C3708z0 d;

    public Ad(C3474pf c3474pf) {
        this.f17766a = c3474pf;
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        NativeCrashClientModule nativeCrashClientModule = (NativeCrashClientModule) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.ndkcrashes.NativeCrashClientModuleImpl", NativeCrashClientModule.class);
        this.b = nativeCrashClientModule == null ? new NativeCrashClientModuleDummy() : nativeCrashClientModule;
        this.c = new A0();
    }
}
