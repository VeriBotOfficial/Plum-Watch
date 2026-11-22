package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.q3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3487q3 extends AbstractC3551si {
    public C3487q3(Context context, String str) {
        super(context, str, "bool");
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3551si
    public final Object a(int i) {
        return Boolean.valueOf(this.f18497a.getResources().getBoolean(i));
    }

    public final Boolean b(int i) {
        return Boolean.valueOf(this.f18497a.getResources().getBoolean(i));
    }
}
