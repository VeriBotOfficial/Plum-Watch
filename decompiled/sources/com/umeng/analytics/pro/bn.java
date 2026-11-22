package com.umeng.analytics.pro;

import android.gov.nist.core.Separators;

/* compiled from: TField.java */
/* loaded from: classes2.dex */
public class bn {

    /* renamed from: a, reason: collision with root package name */
    public final String f13816a;
    public final byte b;
    public final short c;

    public bn() {
        this("", (byte) 0, (short) 0);
    }

    public bn(String str, byte b, short s) {
        this.f13816a = str;
        this.b = b;
        this.c = s;
    }

    public String toString() {
        return "<TField name:'" + this.f13816a + "' type:" + ((int) this.b) + " field-id:" + ((int) this.c) + Separators.GREATER_THAN;
    }

    public boolean a(bn bnVar) {
        return this.b == bnVar.b && this.c == bnVar.c;
    }
}
