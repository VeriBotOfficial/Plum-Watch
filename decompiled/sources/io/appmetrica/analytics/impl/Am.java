package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes6.dex */
public final class Am implements Qn {
    @Override // io.appmetrica.analytics.impl.Qn
    public final byte[] a(R8 r8, C3152ch c3152ch) {
        return !TextUtils.isEmpty(r8.b) ? StringUtils.getUTF8Bytes(r8.b) : new byte[0];
    }
}
