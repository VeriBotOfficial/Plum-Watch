package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.vb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3619vb implements Pn {
    @Override // io.appmetrica.analytics.impl.Pn
    public final Nn a(String str) {
        if (str == null) {
            return new Nn(this, false, "key is null");
        }
        if (str.startsWith("appmetrica")) {
            return new Nn(this, false, "key starts with appmetrica");
        }
        if (str.length() > 200) {
            return new Nn(this, false, "key length more then 200 characters");
        }
        return new Nn(this, true, "");
    }
}
