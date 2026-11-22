package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.cd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3148cd extends N2 {
    public final String b;

    public C3148cd(String str, Wk wk) {
        super(wk);
        this.b = str;
    }

    @Override // io.appmetrica.analytics.impl.N2
    public final String a(String str) {
        return str + '-' + this.b;
    }
}
