package com.alipay.sdk.m.n0;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1422a;
    public int b;
    public long c = System.currentTimeMillis() + 86400000;

    public d(String str, int r4) {
        this.f1422a = str;
        this.b = r4;
    }

    public String toString() {
        return "ValueData{value='" + this.f1422a + "', code=" + this.b + ", expired=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }
}
