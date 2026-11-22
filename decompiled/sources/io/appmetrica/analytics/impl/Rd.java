package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* loaded from: classes6.dex */
public final class Rd implements Pn {

    /* renamed from: a, reason: collision with root package name */
    public final String f18047a;

    public Rd(String str) {
        this.f18047a = str;
    }

    @Override // io.appmetrica.analytics.impl.Pn
    public final Nn a(String str) {
        return TextUtils.isEmpty(str) ? new Nn(this, false, this.f18047a + " is empty.") : new Nn(this, true, "");
    }
}
