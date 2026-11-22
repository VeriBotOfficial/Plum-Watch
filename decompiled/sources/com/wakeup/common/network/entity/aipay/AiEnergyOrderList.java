package com.wakeup.common.network.entity.aipay;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiPayBeans.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/wakeup/common/network/entity/aipay/AiEnergyOrderList;", "", "records", "", "Lcom/wakeup/common/network/entity/aipay/AiEnergyOrder;", "<init>", "(Ljava/util/List;)V", "getRecords", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AiEnergyOrderList {
    private final List<AiEnergyOrder> records;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AiEnergyOrderList copy$default(AiEnergyOrderList aiEnergyOrderList, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = aiEnergyOrderList.records;
        }
        return aiEnergyOrderList.copy(list);
    }

    public final List<AiEnergyOrder> component1() {
        return this.records;
    }

    public final AiEnergyOrderList copy(List<AiEnergyOrder> records) {
        Intrinsics.checkNotNullParameter(records, "records");
        return new AiEnergyOrderList(records);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AiEnergyOrderList) && Intrinsics.areEqual(this.records, ((AiEnergyOrderList) other).records);
    }

    public int hashCode() {
        return this.records.hashCode();
    }

    public String toString() {
        return "AiEnergyOrderList(records=" + this.records + Separators.RPAREN;
    }

    public AiEnergyOrderList(List<AiEnergyOrder> records) {
        Intrinsics.checkNotNullParameter(records, "records");
        this.records = records;
    }

    public final List<AiEnergyOrder> getRecords() {
        return this.records;
    }
}
