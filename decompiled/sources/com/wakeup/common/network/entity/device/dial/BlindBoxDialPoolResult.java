package com.wakeup.common.network.entity.device.dial;

import android.gov.nist.core.Separators;
import com.wakeup.common.network.entity.device.DialModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BlindBoxDialPoolResult.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JP\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0006HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/wakeup/common/network/entity/device/dial/BlindBoxDialPoolResult;", "", "sortBy", "", "poolMode", "equipmentId", "", "candidateCount", "dials", "", "Lcom/wakeup/common/network/entity/device/DialModel;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getSortBy", "()Ljava/lang/String;", "getPoolMode", "getEquipmentId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCandidateCount", "getDials", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/wakeup/common/network/entity/device/dial/BlindBoxDialPoolResult;", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlindBoxDialPoolResult {
    private final Integer candidateCount;
    private final List<DialModel> dials;
    private final Integer equipmentId;
    private final String poolMode;
    private final String sortBy;

    public BlindBoxDialPoolResult() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ BlindBoxDialPoolResult copy$default(BlindBoxDialPoolResult blindBoxDialPoolResult, String str, String str2, Integer num, Integer num2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blindBoxDialPoolResult.sortBy;
        }
        if ((i & 2) != 0) {
            str2 = blindBoxDialPoolResult.poolMode;
        }
        if ((i & 4) != 0) {
            num = blindBoxDialPoolResult.equipmentId;
        }
        if ((i & 8) != 0) {
            num2 = blindBoxDialPoolResult.candidateCount;
        }
        if ((i & 16) != 0) {
            list = blindBoxDialPoolResult.dials;
        }
        List list2 = list;
        Integer num3 = num;
        return blindBoxDialPoolResult.copy(str, str2, num3, num2, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSortBy() {
        return this.sortBy;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPoolMode() {
        return this.poolMode;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getEquipmentId() {
        return this.equipmentId;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getCandidateCount() {
        return this.candidateCount;
    }

    public final List<DialModel> component5() {
        return this.dials;
    }

    public final BlindBoxDialPoolResult copy(String sortBy, String poolMode, Integer equipmentId, Integer candidateCount, List<? extends DialModel> dials) {
        return new BlindBoxDialPoolResult(sortBy, poolMode, equipmentId, candidateCount, dials);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlindBoxDialPoolResult)) {
            return false;
        }
        BlindBoxDialPoolResult blindBoxDialPoolResult = (BlindBoxDialPoolResult) other;
        return Intrinsics.areEqual(this.sortBy, blindBoxDialPoolResult.sortBy) && Intrinsics.areEqual(this.poolMode, blindBoxDialPoolResult.poolMode) && Intrinsics.areEqual(this.equipmentId, blindBoxDialPoolResult.equipmentId) && Intrinsics.areEqual(this.candidateCount, blindBoxDialPoolResult.candidateCount) && Intrinsics.areEqual(this.dials, blindBoxDialPoolResult.dials);
    }

    public int hashCode() {
        String str = this.sortBy;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.poolMode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.equipmentId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.candidateCount;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<DialModel> list = this.dials;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "BlindBoxDialPoolResult(sortBy=" + this.sortBy + ", poolMode=" + this.poolMode + ", equipmentId=" + this.equipmentId + ", candidateCount=" + this.candidateCount + ", dials=" + this.dials + Separators.RPAREN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BlindBoxDialPoolResult(String str, String str2, Integer num, Integer num2, List<? extends DialModel> list) {
        this.sortBy = str;
        this.poolMode = str2;
        this.equipmentId = num;
        this.candidateCount = num2;
        this.dials = list;
    }

    public /* synthetic */ BlindBoxDialPoolResult(String str, String str2, Integer num, Integer num2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : list);
    }

    public final String getSortBy() {
        return this.sortBy;
    }

    public final String getPoolMode() {
        return this.poolMode;
    }

    public final Integer getEquipmentId() {
        return this.equipmentId;
    }

    public final Integer getCandidateCount() {
        return this.candidateCount;
    }

    public final List<DialModel> getDials() {
        return this.dials;
    }
}
