package com.wakeup.feature.health.bodyindex.net;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthIndexModels.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/wakeup/feature/health/bodyindex/net/BatchData;", "", "saved", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/wakeup/feature/health/bodyindex/net/ScoreItem;", "<init>", "(ILjava/util/List;)V", "getSaved", "()I", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BatchData {
    public static final int $stable = 8;
    private final List<ScoreItem> items;
    private final int saved;

    /* JADX WARN: Multi-variable type inference failed */
    public BatchData() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BatchData copy$default(BatchData batchData, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = batchData.saved;
        }
        if ((i2 & 2) != 0) {
            list = batchData.items;
        }
        return batchData.copy(i, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSaved() {
        return this.saved;
    }

    public final List<ScoreItem> component2() {
        return this.items;
    }

    public final BatchData copy(int saved, List<ScoreItem> items) {
        return new BatchData(saved, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BatchData)) {
            return false;
        }
        BatchData batchData = (BatchData) other;
        return this.saved == batchData.saved && Intrinsics.areEqual(this.items, batchData.items);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.saved) * 31;
        List<ScoreItem> list = this.items;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "BatchData(saved=" + this.saved + ", items=" + this.items + Separators.RPAREN;
    }

    public BatchData(int i, List<ScoreItem> list) {
        this.saved = i;
        this.items = list;
    }

    public /* synthetic */ BatchData(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : list);
    }

    public final int getSaved() {
        return this.saved;
    }

    public final List<ScoreItem> getItems() {
        return this.items;
    }
}
