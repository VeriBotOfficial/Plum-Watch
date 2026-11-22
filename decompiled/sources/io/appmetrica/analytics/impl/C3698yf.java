package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;

/* renamed from: io.appmetrica.analytics.impl.yf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3698yf implements Qn, D8 {
    @Override // io.appmetrica.analytics.impl.D8
    public final int a(M8 m8) {
        return 2;
    }

    @Override // io.appmetrica.analytics.impl.Qn
    public final byte[] a(R8 r8, C3152ch c3152ch) {
        return TextUtils.isEmpty(r8.b) ? new byte[0] : Base64.decode(r8.b, 0);
    }
}
