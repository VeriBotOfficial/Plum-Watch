package com.anythink.core.common.h;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f3918a = 10;
    private int b;
    private int c;
    private int d;
    private long e;
    private int f;
    private int g;
    private long h;

    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f3919a = 1;
        public static final int b = 2;
        public static final int c = 3;
    }

    private l() {
    }

    public static l a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return null;
        }
        long jOptLong = jSONObject.optLong("req_pacing");
        if (jOptLong <= 0) {
            return null;
        }
        l lVar = new l();
        int r6 = jSONObject.optInt("id");
        if (r6 == 1) {
            lVar.c = jSONObject.optInt("req_no_fill_nc");
        } else if (r6 == 2) {
            lVar.d = jSONObject.optInt("req_no_fill_s");
            lVar.e = jSONObject.optLong("req_no_fill_sgt");
        } else {
            if (r6 != 3) {
                return null;
            }
            lVar.f = jSONObject.optInt("req_no_fill_sr");
            lVar.e = jSONObject.optLong("req_no_fill_sgt");
            lVar.g = jSONObject.optInt(com.anythink.core.common.e.a.C0280a.n, 10);
        }
        lVar.b = r6;
        lVar.h = jOptLong;
        if (lVar.c > 0 || lVar.d > 0 || lVar.e > 0 || lVar.f > 0 || jOptLong > 0) {
            return lVar;
        }
        return null;
    }

    public final int a() {
        return this.b;
    }

    private void a(int r1) {
        this.b = r1;
    }

    public final int b() {
        return this.c;
    }

    private void b(int r1) {
        this.c = r1;
    }

    public final int c() {
        return this.d;
    }

    private void c(int r1) {
        this.d = r1;
    }

    public final long d() {
        return this.e;
    }

    private void a(long j) {
        this.e = j;
    }

    public final int e() {
        return this.f;
    }

    private void d(int r1) {
        this.f = r1;
    }

    public final long f() {
        return this.h;
    }

    private void b(long j) {
        this.h = j;
    }

    public final int g() {
        return this.g;
    }

    private void e(int r1) {
        this.g = r1;
    }

    public final String toString() {
        return "AdSourceFltRuleEntity{id=" + this.b + ", reqNoFillNc=" + this.c + ", reqNoFillS=" + this.d + ", reqNoFillSgtTime=" + this.e + ", reqNoFillSr=" + this.f + ", reqPacingTime=" + this.h + AbstractJsonLexerKt.END_OBJ;
    }
}
