package com.wakeup.feature.health.bodyindex.net;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthIndexModels.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/wakeup/feature/health/bodyindex/net/BatchRequest;", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/wakeup/feature/health/bodyindex/net/BatchItem;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BatchRequest {
    public static final int $stable = 8;
    private final List<BatchItem> items;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BatchRequest copy$default(BatchRequest batchRequest, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = batchRequest.items;
        }
        return batchRequest.copy(list);
    }

    public final List<BatchItem> component1() {
        return this.items;
    }

    public final BatchRequest copy(List<BatchItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new BatchRequest(items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BatchRequest) && Intrinsics.areEqual(this.items, ((BatchRequest) other).items);
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    public String toString() {
        return "BatchRequest(items=" + this.items + Separators.RPAREN;
    }

    public BatchRequest(List<BatchItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
    }

    public final List<BatchItem> getItems() {
        return this.items;
    }
}
