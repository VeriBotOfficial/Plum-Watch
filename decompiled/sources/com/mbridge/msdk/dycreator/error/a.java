package com.mbridge.msdk.dycreator.error;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: DyError.java */
/* loaded from: classes17.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private int f11458a;
    private String b;

    public a(b bVar) {
        if (bVar != null) {
            this.f11458a = bVar.b();
            this.b = bVar.c();
        }
    }

    public String toString() {
        return "DyError{errorCode=" + this.f11458a + AbstractJsonLexerKt.END_OBJ;
    }

    public a(int i, String str) {
        this.f11458a = i;
        this.b = str;
    }
}
