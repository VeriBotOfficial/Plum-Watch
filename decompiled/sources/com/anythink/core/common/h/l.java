package com.anythink.core.common.h;

import com.anythink.core.common.e.a;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static final int f3918a = 10;
    private int b;
    private int c;
    private int d;
    private long e;
    private int f;
    private int g;
    private long h;

    public interface a {

        /* renamed from: a, reason: collision with root package name */
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
        long optLong = jSONObject.optLong("req_pacing");
        if (optLong <= 0) {
            return null;
        }
        l lVar = new l();
        int optInt = jSONObject.optInt("id");
        if (optInt == 1) {
            lVar.c = jSONObject.optInt("req_no_fill_nc");
        } else if (optInt == 2) {
            lVar.d = jSONObject.optInt("req_no_fill_s");
            lVar.e = jSONObject.optLong("req_no_fill_sgt");
        } else {
            if (optInt != 3) {
                return null;
            }
            lVar.f = jSONObject.optInt("req_no_fill_sr");
            lVar.e = jSONObject.optLong("req_no_fill_sgt");
            lVar.g = jSONObject.optInt(a.C0193a.n, 10);
        }
        lVar.b = optInt;
        lVar.h = optLong;
        if (lVar.c > 0 || lVar.d > 0 || lVar.e > 0 || lVar.f > 0 || optLong > 0) {
            return lVar;
        }
        return null;
    }

    public final int a() {
        return this.b;
    }

    private void a(int i) {
        this.b = i;
    }

    public final int b() {
        return this.c;
    }

    private void b(int i) {
        this.c = i;
    }

    public final int c() {
        return this.d;
    }

    private void c(int i) {
        this.d = i;
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

    private void d(int i) {
        this.f = i;
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

    private void e(int i) {
        this.g = i;
    }

    public final String toString() {
        return "AdSourceFltRuleEntity{id=" + this.b + ", reqNoFillNc=" + this.c + ", reqNoFillS=" + this.d + ", reqNoFillSgtTime=" + this.e + ", reqNoFillSr=" + this.f + ", reqPacingTime=" + this.h + AbstractJsonLexerKt.END_OBJ;
    }
}
