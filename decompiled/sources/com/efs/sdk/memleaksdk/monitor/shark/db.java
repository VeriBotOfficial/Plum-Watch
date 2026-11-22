package com.efs.sdk.memleaksdk.monitor.shark;

import android.gov.nist.core.Separators;
import com.autonavi.aps.amapapi.AMapLocationStaticsEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u000e\u0010\r\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/internal/hppc/LongObjectPair;", "B", "", AMapLocationStaticsEntity.FIRST_LOCATE, "", "second", "(JLjava/lang/Object;)V", "getFirst", "()J", "getSecond", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(JLjava/lang/Object;)Lcom/efs/sdk/memleaksdk/monitor/shark/internal/hppc/LongObjectPair;", "equals", "", "other", "hashCode", "", "toString", "", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes14.dex */
public final /* data */ class db<B> {

    /* renamed from: a, reason: collision with root package name */
    public final long f9905a;
    public final B b;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof db)) {
            return false;
        }
        db dbVar = (db) other;
        return this.f9905a == dbVar.f9905a && Intrinsics.areEqual(this.b, dbVar.b);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.f9905a) * 31;
        B b = this.b;
        return hashCode + (b != null ? b.hashCode() : 0);
    }

    public String toString() {
        return "LongObjectPair(first=" + this.f9905a + ", second=" + this.b + Separators.RPAREN;
    }

    public db(long j, B b) {
        this.f9905a = j;
        this.b = b;
    }
}
