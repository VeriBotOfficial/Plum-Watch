package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.y0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3683y0 {

    /* renamed from: a, reason: collision with root package name */
    public final NativeCrashSource f18584a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final C3708z0 f;

    public C3683y0(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j, C3708z0 c3708z0) {
        this.f18584a = nativeCrashSource;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = c3708z0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3683y0)) {
            return false;
        }
        C3683y0 c3683y0 = (C3683y0) obj;
        return this.f18584a == c3683y0.f18584a && Intrinsics.areEqual(this.b, c3683y0.b) && Intrinsics.areEqual(this.c, c3683y0.c) && Intrinsics.areEqual(this.d, c3683y0.d) && this.e == c3683y0.e && Intrinsics.areEqual(this.f, c3683y0.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((Long.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f18584a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AppMetricaNativeCrash(source=" + this.f18584a + ", handlerVersion=" + this.b + ", uuid=" + this.c + ", dumpFile=" + this.d + ", creationTime=" + this.e + ", metadata=" + this.f + ')';
    }
}
