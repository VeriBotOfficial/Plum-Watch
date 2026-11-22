package com.wakeup.feature.health.bodyindex.net;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthIndexModels.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/wakeup/feature/health/bodyindex/net/BatchItem;", "", "dayNo", "", "indexType", "", "inputs", "Lcom/wakeup/feature/health/bodyindex/net/SleepInputs;", "<init>", "(ILjava/lang/String;Lcom/wakeup/feature/health/bodyindex/net/SleepInputs;)V", "getDayNo", "()I", "getIndexType", "()Ljava/lang/String;", "getInputs", "()Lcom/wakeup/feature/health/bodyindex/net/SleepInputs;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BatchItem {
    public static final int $stable = 0;
    private final int dayNo;
    private final String indexType;
    private final SleepInputs inputs;

    public static /* synthetic */ BatchItem copy$default(BatchItem batchItem, int i, String str, SleepInputs sleepInputs, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = batchItem.dayNo;
        }
        if ((i2 & 2) != 0) {
            str = batchItem.indexType;
        }
        if ((i2 & 4) != 0) {
            sleepInputs = batchItem.inputs;
        }
        return batchItem.copy(i, str, sleepInputs);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDayNo() {
        return this.dayNo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIndexType() {
        return this.indexType;
    }

    /* renamed from: component3, reason: from getter */
    public final SleepInputs getInputs() {
        return this.inputs;
    }

    public final BatchItem copy(int dayNo, String indexType, SleepInputs inputs) {
        Intrinsics.checkNotNullParameter(indexType, "indexType");
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        return new BatchItem(dayNo, indexType, inputs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BatchItem)) {
            return false;
        }
        BatchItem batchItem = (BatchItem) other;
        return this.dayNo == batchItem.dayNo && Intrinsics.areEqual(this.indexType, batchItem.indexType) && Intrinsics.areEqual(this.inputs, batchItem.inputs);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.dayNo) * 31) + this.indexType.hashCode()) * 31) + this.inputs.hashCode();
    }

    public String toString() {
        return "BatchItem(dayNo=" + this.dayNo + ", indexType=" + this.indexType + ", inputs=" + this.inputs + Separators.RPAREN;
    }

    public BatchItem(int i, String indexType, SleepInputs inputs) {
        Intrinsics.checkNotNullParameter(indexType, "indexType");
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        this.dayNo = i;
        this.indexType = indexType;
        this.inputs = inputs;
    }

    public final int getDayNo() {
        return this.dayNo;
    }

    public final String getIndexType() {
        return this.indexType;
    }

    public final SleepInputs getInputs() {
        return this.inputs;
    }
}
