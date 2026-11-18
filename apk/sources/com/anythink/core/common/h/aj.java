package com.anythink.core.common.h;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes16.dex */
public final class aj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3846a;
    private int b;
    private long c;
    private long d;

    private aj() {
    }

    public static aj a(String str, int r2) {
        aj ajVar = new aj();
        ajVar.f3846a = str;
        ajVar.b = r2;
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
        String str = this.f3846a;
        return str == null ? "" : str;
    }

    public final int d() {
        return this.b;
    }

    public final String toString() {
        return "DynWFAdSourceFilterEntity{adSourceId='" + this.f3846a + "', filterReason=" + this.b + ", reqLimitIntervalTime=" + this.c + ", reqLimitEndTime=" + this.d + AbstractJsonLexerKt.END_OBJ;
    }
}
