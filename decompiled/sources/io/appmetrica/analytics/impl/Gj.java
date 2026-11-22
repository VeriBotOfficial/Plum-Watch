package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes6.dex */
public final class Gj extends Yg {
    public Gj(L6 l6) {
        super(l6);
    }

    @Override // io.appmetrica.analytics.impl.Yg, io.appmetrica.analytics.impl.Zg
    public final boolean a(Boolean bool) {
        return !this.f18156a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
