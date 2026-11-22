package com.wakeup.common.network.entity.ab;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExperimentResult.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/wakeup/common/network/entity/ab/ExperimentResult;", "", "data", "Lcom/wakeup/common/network/entity/ab/ExperimentEntity;", "<init>", "(Lcom/wakeup/common/network/entity/ab/ExperimentEntity;)V", "getData", "()Lcom/wakeup/common/network/entity/ab/ExperimentEntity;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ExperimentResult {
    private final ExperimentEntity data;

    public static /* synthetic */ ExperimentResult copy$default(ExperimentResult experimentResult, ExperimentEntity experimentEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            experimentEntity = experimentResult.data;
        }
        return experimentResult.copy(experimentEntity);
    }

    /* renamed from: component1, reason: from getter */
    public final ExperimentEntity getData() {
        return this.data;
    }

    public final ExperimentResult copy(ExperimentEntity data) {
        return new ExperimentResult(data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ExperimentResult) && Intrinsics.areEqual(this.data, ((ExperimentResult) other).data);
    }

    public int hashCode() {
        ExperimentEntity experimentEntity = this.data;
        if (experimentEntity == null) {
            return 0;
        }
        return experimentEntity.hashCode();
    }

    public String toString() {
        return "ExperimentResult(data=" + this.data + Separators.RPAREN;
    }

    public ExperimentResult(ExperimentEntity experimentEntity) {
        this.data = experimentEntity;
    }

    public final ExperimentEntity getData() {
        return this.data;
    }
}
