package com.anythink.core.common.h;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes16.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3910a;
    private int b;
    private int c;
    private String d;
    private long e;
    private long f;
    private int g;
    private int h = 2;
    private int i;

    public final void a(String str, int r2, int r3) {
        this.f3910a = str;
        this.b = r2;
        this.c = r3;
    }

    public final String a() {
        return this.f3910a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final void a(String str) {
        this.d = str;
    }

    public final long e() {
        return this.e;
    }

    public final void a(long j) {
        this.e = j;
    }

    public final long f() {
        return this.f;
    }

    public final void b(long j) {
        this.f = j;
    }

    public final int g() {
        return this.g;
    }

    public final void a(int r1) {
        this.g = r1;
    }

    public final int h() {
        return this.h;
    }

    public final void a(boolean z) {
        if (z) {
            this.h = 1;
        } else {
            this.h = 2;
        }
    }

    public final int i() {
        return this.i;
    }

    public final void b(int r1) {
        this.i = r1;
    }

    public final String toString() {
        return "AdCallExtraInfo{realPlacementId='" + this.f3910a + "', realGroupId=" + this.b + ", realTrafficGroupId=" + this.c + ", realRequestId='" + this.d + "', realPLSharedPLReqTimeGap=" + this.e + ", sharedPLFailReqReqTime=" + this.f + ", sharedPLFailRetryReqCount=" + this.g + ", appStrategyType=" + this.h + ", isReadyResultType=" + this.i + AbstractJsonLexerKt.END_OBJ;
    }
}
