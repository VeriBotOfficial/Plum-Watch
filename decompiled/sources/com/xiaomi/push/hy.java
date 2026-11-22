package com.xiaomi.push;

import android.gov.nist.core.Separators;

/* loaded from: classes4.dex */
public class hy {

    /* renamed from: a, reason: collision with root package name */
    public final byte f14670a;

    /* renamed from: a, reason: collision with other field name */
    public final String f914a;

    /* renamed from: a, reason: collision with other field name */
    public final short f915a;

    public hy() {
        this("", (byte) 0, (short) 0);
    }

    public hy(String str, byte b, short s) {
        this.f914a = str;
        this.f14670a = b;
        this.f915a = s;
    }

    public String toString() {
        return "<TField name:'" + this.f914a + "' type:" + ((int) this.f14670a) + " field-id:" + ((int) this.f915a) + Separators.GREATER_THAN;
    }
}
