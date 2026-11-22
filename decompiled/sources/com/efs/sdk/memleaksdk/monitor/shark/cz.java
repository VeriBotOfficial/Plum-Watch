package com.efs.sdk.memleaksdk.monitor.shark;

import android.gov.nist.core.Separators;
import com.autonavi.aps.amapapi.AMapLocationStaticsEntity;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/internal/hppc/LongLongPair;", "", AMapLocationStaticsEntity.FIRST_LOCATE, "", "second", "(JJ)V", "getFirst", "()J", "getSecond", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes14.dex */
public final /* data */ class cz {

    /* renamed from: a, reason: collision with root package name */
    public final long f9900a;
    public final long b;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof cz)) {
            return false;
        }
        cz czVar = (cz) other;
        return this.f9900a == czVar.f9900a && this.b == czVar.b;
    }

    public int hashCode() {
        return (Long.hashCode(this.f9900a) * 31) + Long.hashCode(this.b);
    }

    public String toString() {
        return "LongLongPair(first=" + this.f9900a + ", second=" + this.b + Separators.RPAREN;
    }

    public cz(long j, long j2) {
        this.f9900a = j;
        this.b = j2;
    }
}
