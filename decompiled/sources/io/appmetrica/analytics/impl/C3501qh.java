package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.qh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3501qh extends Yg {
    public C3501qh(L6 l6) {
        super(l6);
    }

    @Override // io.appmetrica.analytics.impl.Yg, io.appmetrica.analytics.impl.Zg
    public final boolean a(Boolean bool) {
        return !this.f18156a.isRestrictedForReporter() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
