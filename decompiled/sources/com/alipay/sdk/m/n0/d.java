package com.alipay.sdk.m.n0;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes11.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public String f1422a;
    public int b;
    public long c = System.currentTimeMillis() + 86400000;

    public d(String str, int i) {
        this.f1422a = str;
        this.b = i;
    }

    public String toString() {
        return "ValueData{value='" + this.f1422a + "', code=" + this.b + ", expired=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }
}
