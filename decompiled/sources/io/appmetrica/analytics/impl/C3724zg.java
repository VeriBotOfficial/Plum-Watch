package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;

/* renamed from: io.appmetrica.analytics.impl.zg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3724zg implements RemoteConfigMetaInfo {

    /* renamed from: a, reason: collision with root package name */
    public final long f18613a;
    public final long b;

    public C3724zg(long j, long j2) {
        this.f18613a = j;
        this.b = j2;
    }

    public final C3724zg a(long j, long j2) {
        return new C3724zg(j, j2);
    }

    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3724zg)) {
            return false;
        }
        C3724zg c3724zg = (C3724zg) obj;
        return this.f18613a == c3724zg.f18613a && this.b == c3724zg.b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getFirstSendTime() {
        return this.f18613a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getLastUpdateTime() {
        return this.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f18613a) * 31);
    }

    public final String toString() {
        return "RemoteConfigMetaInfoModel(firstSendTime=" + this.f18613a + ", lastUpdateTime=" + this.b + ')';
    }

    public final long a() {
        return this.f18613a;
    }

    public static C3724zg a(C3724zg c3724zg, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = c3724zg.f18613a;
        }
        if ((i & 2) != 0) {
            j2 = c3724zg.b;
        }
        c3724zg.getClass();
        return new C3724zg(j, j2);
    }
}
