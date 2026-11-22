package com.umeng.analytics.pro;

import android.gov.nist.core.Separators;

/* compiled from: TMessage.java */
/* loaded from: classes2.dex */
public final class bq {

    /* renamed from: a, reason: collision with root package name */
    public final String f13819a;
    public final byte b;
    public final int c;

    public bq() {
        this("", (byte) 0, 0);
    }

    public bq(String str, byte b, int i) {
        this.f13819a = str;
        this.b = b;
        this.c = i;
    }

    public String toString() {
        return "<TMessage name:'" + this.f13819a + "' type: " + ((int) this.b) + " seqid:" + this.c + Separators.GREATER_THAN;
    }

    public boolean equals(Object obj) {
        if (obj instanceof bq) {
            return a((bq) obj);
        }
        return false;
    }

    public boolean a(bq bqVar) {
        return this.f13819a.equals(bqVar.f13819a) && this.b == bqVar.b && this.c == bqVar.c;
    }
}
