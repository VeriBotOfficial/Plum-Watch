package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.z0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3708z0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f18602a;
    public final String b;
    public final CounterConfigurationReporterType c;
    public final int d;
    public final String e;
    public final String f;

    public C3708z0(String str, String str2, CounterConfigurationReporterType counterConfigurationReporterType, int i, String str3, String str4) {
        this.f18602a = str;
        this.b = str2;
        this.c = counterConfigurationReporterType;
        this.d = i;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3708z0)) {
            return false;
        }
        C3708z0 c3708z0 = (C3708z0) obj;
        return Intrinsics.areEqual(this.f18602a, c3708z0.f18602a) && Intrinsics.areEqual(this.b, c3708z0.b) && this.c == c3708z0.c && this.d == c3708z0.d && Intrinsics.areEqual(this.e, c3708z0.e) && Intrinsics.areEqual(this.f, c3708z0.f);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((Integer.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.f18602a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AppMetricaNativeCrashMetadata(apiKey=" + this.f18602a + ", packageName=" + this.b + ", reporterType=" + this.c + ", processID=" + this.d + ", processSessionID=" + this.e + ", errorEnvironment=" + this.f + ')';
    }
}
