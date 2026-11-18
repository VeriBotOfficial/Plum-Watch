package com.anythink.core.common.h;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes16.dex */
public class ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3905a;
    public String b;
    public int c;
    private final String d;
    private final double e;

    public ca(int r1, String str, String str2, double d, String str3) {
        this.c = r1;
        this.f3905a = str;
        this.b = str3;
        this.e = d;
        this.d = str2;
    }

    private String c() {
        return this.f3905a;
    }

    private String d() {
        return this.b;
    }

    public final double a() {
        return this.e;
    }

    public final String b() {
        return this.d;
    }

    private int e() {
        return this.c;
    }

    public String toString() {
        return "{channelId='" + this.f3905a + "', bidType='" + this.d + "', price=" + this.e + ", adnPlacementId='" + this.b + "', filterType=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }
}
