package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;

/* loaded from: classes6.dex */
public abstract class N2 implements ModulePreferences {

    /* renamed from: a, reason: collision with root package name */
    public final Wk f17979a;

    public N2(Wk wk) {
        this.f17979a = wk;
    }

    public abstract String a(String str);

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final boolean getBoolean(String str, boolean z) {
        return ((AbstractC3671xd) this.f17979a).c(str, z);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final int getInt(String str, int i) {
        return ((AbstractC3671xd) this.f17979a).c(str, i);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final long getLong(String str, long j) {
        return ((AbstractC3671xd) this.f17979a).c(a(str), j);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final String getString(String str, String str2) {
        return ((AbstractC3671xd) this.f17979a).c(a(str), str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putBoolean(String str, boolean z) {
        AbstractC3671xd abstractC3671xd = (AbstractC3671xd) this.f17979a;
        ((Me) ((Wk) abstractC3671xd.b(abstractC3671xd.f(a(str)), z))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putInt(String str, int i) {
        AbstractC3671xd abstractC3671xd = (AbstractC3671xd) this.f17979a;
        ((Me) ((Wk) abstractC3671xd.b(abstractC3671xd.f(str), i))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putLong(String str, long j) {
        AbstractC3671xd abstractC3671xd = (AbstractC3671xd) this.f17979a;
        ((Me) ((Wk) abstractC3671xd.b(abstractC3671xd.f(a(str)), j))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putString(String str, String str2) {
        AbstractC3671xd abstractC3671xd = (AbstractC3671xd) this.f17979a;
        ((Me) ((Wk) abstractC3671xd.b(abstractC3671xd.f(a(str)), str2))).b();
    }
}
