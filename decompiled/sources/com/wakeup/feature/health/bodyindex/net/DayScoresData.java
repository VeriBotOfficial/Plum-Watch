package com.wakeup.feature.health.bodyindex.net;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthIndexModels.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J8\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/wakeup/feature/health/bodyindex/net/DayScoresData;", "", "mac", "", "syncAtMs", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/wakeup/feature/health/bodyindex/net/ScoreItem;", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)V", "getMac", "()Ljava/lang/String;", "getSyncAtMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)Lcom/wakeup/feature/health/bodyindex/net/DayScoresData;", "equals", "", "other", "hashCode", "", "toString", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DayScoresData {
    public static final int $stable = 8;
    private final List<ScoreItem> items;
    private final String mac;
    private final Long syncAtMs;

    public DayScoresData() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DayScoresData copy$default(DayScoresData dayScoresData, String str, Long l, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dayScoresData.mac;
        }
        if ((i & 2) != 0) {
            l = dayScoresData.syncAtMs;
        }
        if ((i & 4) != 0) {
            list = dayScoresData.items;
        }
        return dayScoresData.copy(str, l, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getSyncAtMs() {
        return this.syncAtMs;
    }

    public final List<ScoreItem> component3() {
        return this.items;
    }

    public final DayScoresData copy(String mac, Long syncAtMs, List<ScoreItem> items) {
        return new DayScoresData(mac, syncAtMs, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DayScoresData)) {
            return false;
        }
        DayScoresData dayScoresData = (DayScoresData) other;
        return Intrinsics.areEqual(this.mac, dayScoresData.mac) && Intrinsics.areEqual(this.syncAtMs, dayScoresData.syncAtMs) && Intrinsics.areEqual(this.items, dayScoresData.items);
    }

    public int hashCode() {
        String str = this.mac;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.syncAtMs;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        List<ScoreItem> list = this.items;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "DayScoresData(mac=" + this.mac + ", syncAtMs=" + this.syncAtMs + ", items=" + this.items + Separators.RPAREN;
    }

    public DayScoresData(String str, Long l, List<ScoreItem> list) {
        this.mac = str;
        this.syncAtMs = l;
        this.items = list;
    }

    public /* synthetic */ DayScoresData(String str, Long l, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : list);
    }

    public final String getMac() {
        return this.mac;
    }

    public final Long getSyncAtMs() {
        return this.syncAtMs;
    }

    public final List<ScoreItem> getItems() {
        return this.items;
    }
}
