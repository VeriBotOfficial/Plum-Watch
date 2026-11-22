package com.wakeup.feature.health.bodyindex.net;

import android.gov.nist.core.Separators;
import com.wakeup.common.burypoint.BuryPointPageId;
import com.wakeup.commponent.module.data.HealthData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthIndexModels.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eHÆ\u0003Jp\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\tHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, d2 = {"Lcom/wakeup/feature/health/bodyindex/net/TrendData;", "", "mac", "", "syncAtMs", "", "listType", "indexType", "beginDay", "", "endDay", HealthData.STATISTICS_AVERAGE, "Lcom/wakeup/feature/health/bodyindex/net/TrendBucket;", BuryPointPageId.PAGE_ID_PLAN_DETAIL, "", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;IILcom/wakeup/feature/health/bodyindex/net/TrendBucket;Ljava/util/List;)V", "getMac", "()Ljava/lang/String;", "getSyncAtMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getListType", "getIndexType", "getBeginDay", "()I", "getEndDay", "getAverage", "()Lcom/wakeup/feature/health/bodyindex/net/TrendBucket;", "getDetail", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;IILcom/wakeup/feature/health/bodyindex/net/TrendBucket;Ljava/util/List;)Lcom/wakeup/feature/health/bodyindex/net/TrendData;", "equals", "", "other", "hashCode", "toString", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TrendData {
    public static final int $stable = 8;
    private final TrendBucket average;
    private final int beginDay;
    private final List<TrendBucket> detail;
    private final int endDay;
    private final String indexType;
    private final String listType;
    private final String mac;
    private final Long syncAtMs;

    public TrendData() {
        this(null, null, null, null, 0, 0, null, null, 255, null);
    }

    public static /* synthetic */ TrendData copy$default(TrendData trendData, String str, Long l, String str2, String str3, int i, int i2, TrendBucket trendBucket, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = trendData.mac;
        }
        if ((i3 & 2) != 0) {
            l = trendData.syncAtMs;
        }
        if ((i3 & 4) != 0) {
            str2 = trendData.listType;
        }
        if ((i3 & 8) != 0) {
            str3 = trendData.indexType;
        }
        if ((i3 & 16) != 0) {
            i = trendData.beginDay;
        }
        if ((i3 & 32) != 0) {
            i2 = trendData.endDay;
        }
        if ((i3 & 64) != 0) {
            trendBucket = trendData.average;
        }
        if ((i3 & 128) != 0) {
            list = trendData.detail;
        }
        TrendBucket trendBucket2 = trendBucket;
        List list2 = list;
        int i4 = i;
        int i5 = i2;
        return trendData.copy(str, l, str2, str3, i4, i5, trendBucket2, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getSyncAtMs() {
        return this.syncAtMs;
    }

    /* renamed from: component3, reason: from getter */
    public final String getListType() {
        return this.listType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIndexType() {
        return this.indexType;
    }

    /* renamed from: component5, reason: from getter */
    public final int getBeginDay() {
        return this.beginDay;
    }

    /* renamed from: component6, reason: from getter */
    public final int getEndDay() {
        return this.endDay;
    }

    /* renamed from: component7, reason: from getter */
    public final TrendBucket getAverage() {
        return this.average;
    }

    public final List<TrendBucket> component8() {
        return this.detail;
    }

    public final TrendData copy(String mac, Long syncAtMs, String listType, String indexType, int beginDay, int endDay, TrendBucket average, List<TrendBucket> detail) {
        return new TrendData(mac, syncAtMs, listType, indexType, beginDay, endDay, average, detail);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrendData)) {
            return false;
        }
        TrendData trendData = (TrendData) other;
        return Intrinsics.areEqual(this.mac, trendData.mac) && Intrinsics.areEqual(this.syncAtMs, trendData.syncAtMs) && Intrinsics.areEqual(this.listType, trendData.listType) && Intrinsics.areEqual(this.indexType, trendData.indexType) && this.beginDay == trendData.beginDay && this.endDay == trendData.endDay && Intrinsics.areEqual(this.average, trendData.average) && Intrinsics.areEqual(this.detail, trendData.detail);
    }

    public int hashCode() {
        String str = this.mac;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.syncAtMs;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.listType;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.indexType;
        int hashCode4 = (((((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.beginDay)) * 31) + Integer.hashCode(this.endDay)) * 31;
        TrendBucket trendBucket = this.average;
        int hashCode5 = (hashCode4 + (trendBucket == null ? 0 : trendBucket.hashCode())) * 31;
        List<TrendBucket> list = this.detail;
        return hashCode5 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "TrendData(mac=" + this.mac + ", syncAtMs=" + this.syncAtMs + ", listType=" + this.listType + ", indexType=" + this.indexType + ", beginDay=" + this.beginDay + ", endDay=" + this.endDay + ", average=" + this.average + ", detail=" + this.detail + Separators.RPAREN;
    }

    public TrendData(String str, Long l, String str2, String str3, int i, int i2, TrendBucket trendBucket, List<TrendBucket> list) {
        this.mac = str;
        this.syncAtMs = l;
        this.listType = str2;
        this.indexType = str3;
        this.beginDay = i;
        this.endDay = i2;
        this.average = trendBucket;
        this.detail = list;
    }

    public /* synthetic */ TrendData(String str, Long l, String str2, String str3, int i, int i2, TrendBucket trendBucket, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : l, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? null : trendBucket, (i3 & 128) != 0 ? null : list);
    }

    public final String getMac() {
        return this.mac;
    }

    public final Long getSyncAtMs() {
        return this.syncAtMs;
    }

    public final String getListType() {
        return this.listType;
    }

    public final String getIndexType() {
        return this.indexType;
    }

    public final int getBeginDay() {
        return this.beginDay;
    }

    public final int getEndDay() {
        return this.endDay;
    }

    public final TrendBucket getAverage() {
        return this.average;
    }

    public final List<TrendBucket> getDetail() {
        return this.detail;
    }
}
