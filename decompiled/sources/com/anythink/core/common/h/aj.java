package com.anythink.core.common.h;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes12.dex */
public final class aj {

    /* renamed from: a, reason: collision with root package name */
    private String f3844a;
    private int b;
    private long c;
    private long d;

    private aj() {
    }

    public static aj a(String str, int i) {
        aj ajVar = new aj();
        ajVar.f3844a = str;
        ajVar.b = i;
        return ajVar;
    }

    public final void a(long j) {
        this.c = j;
        if (j > 0) {
            this.d = System.currentTimeMillis() + j;
        }
    }

    public final long a() {
        return this.d;
    }

    public final long b() {
        return this.c;
    }

    public final String c() {
        String str = this.f3844a;
        return str == null ? "" : str;
    }

    public final int d() {
        return this.b;
    }

    public final String toString() {
        return "DynWFAdSourceFilterEntity{adSourceId='" + this.f3844a + "', filterReason=" + this.b + ", reqLimitIntervalTime=" + this.c + ", reqLimitEndTime=" + this.d + AbstractJsonLexerKt.END_OBJ;
    }
}
