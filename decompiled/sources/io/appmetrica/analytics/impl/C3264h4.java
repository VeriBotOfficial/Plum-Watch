package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: io.appmetrica.analytics.impl.h4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3264h4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f18302a;
    public final String b;
    public final Integer c;
    public final String d;
    public final CounterConfigurationReporterType e;

    public C3264h4(String str, String str2, Integer num, String str3, CounterConfigurationReporterType counterConfigurationReporterType) {
        this.f18302a = str;
        this.b = str2;
        this.c = num;
        this.d = str3;
        this.e = counterConfigurationReporterType;
    }

    public static C3264h4 a(C3114b4 c3114b4) {
        return new C3264h4(c3114b4.b.getApiKey(), c3114b4.f18194a.f18454a.getAsString("PROCESS_CFG_PACKAGE_NAME"), c3114b4.f18194a.f18454a.getAsInteger("PROCESS_CFG_PROCESS_ID"), c3114b4.f18194a.f18454a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), c3114b4.b.getReporterType());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3264h4.class == obj.getClass()) {
            C3264h4 c3264h4 = (C3264h4) obj;
            String str = this.f18302a;
            if (str == null ? c3264h4.f18302a != null : !str.equals(c3264h4.f18302a)) {
                return false;
            }
            if (!this.b.equals(c3264h4.b)) {
                return false;
            }
            Integer num = this.c;
            if (num == null ? c3264h4.c != null : !num.equals(c3264h4.c)) {
                return false;
            }
            String str2 = this.d;
            if (str2 == null ? c3264h4.d != null : !str2.equals(c3264h4.d)) {
                return false;
            }
            if (this.e == c3264h4.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f18302a;
        int hashCode = (this.b.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        Integer num = this.c;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ClientDescription{mApiKey='" + this.f18302a + "', mPackageName='" + this.b + "', mProcessID=" + this.c + ", mProcessSessionID='" + this.d + "', mReporterType=" + this.e + AbstractJsonLexerKt.END_OBJ;
    }
}
