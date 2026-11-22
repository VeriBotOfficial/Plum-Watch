package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.mf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3399mf extends C3668xa {
    public C3399mf(int i) {
        super(i);
    }

    @Override // io.appmetrica.analytics.impl.C3668xa
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int b(V v) {
        if (v == null) {
            return 0;
        }
        return StringUtils.getUtf8BytesLength(v.b) + 12;
    }
}
