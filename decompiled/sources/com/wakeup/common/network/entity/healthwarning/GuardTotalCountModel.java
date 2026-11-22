package com.wakeup.common.network.entity.healthwarning;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GuardTotalCountModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/network/entity/healthwarning/GuardTotalCountModel;", "", "guardTimes", "", "guardHomes", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getGuardTimes", "()Ljava/lang/String;", "getGuardHomes", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GuardTotalCountModel {
    private final String guardHomes;
    private final String guardTimes;

    /* JADX WARN: Multi-variable type inference failed */
    public GuardTotalCountModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ GuardTotalCountModel copy$default(GuardTotalCountModel guardTotalCountModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = guardTotalCountModel.guardTimes;
        }
        if ((i & 2) != 0) {
            str2 = guardTotalCountModel.guardHomes;
        }
        return guardTotalCountModel.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getGuardTimes() {
        return this.guardTimes;
    }

    /* renamed from: component2, reason: from getter */
    public final String getGuardHomes() {
        return this.guardHomes;
    }

    public final GuardTotalCountModel copy(String guardTimes, String guardHomes) {
        Intrinsics.checkNotNullParameter(guardTimes, "guardTimes");
        Intrinsics.checkNotNullParameter(guardHomes, "guardHomes");
        return new GuardTotalCountModel(guardTimes, guardHomes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuardTotalCountModel)) {
            return false;
        }
        GuardTotalCountModel guardTotalCountModel = (GuardTotalCountModel) other;
        return Intrinsics.areEqual(this.guardTimes, guardTotalCountModel.guardTimes) && Intrinsics.areEqual(this.guardHomes, guardTotalCountModel.guardHomes);
    }

    public int hashCode() {
        return (this.guardTimes.hashCode() * 31) + this.guardHomes.hashCode();
    }

    public String toString() {
        return "GuardTotalCountModel(guardTimes=" + this.guardTimes + ", guardHomes=" + this.guardHomes + Separators.RPAREN;
    }

    public GuardTotalCountModel(String guardTimes, String guardHomes) {
        Intrinsics.checkNotNullParameter(guardTimes, "guardTimes");
        Intrinsics.checkNotNullParameter(guardHomes, "guardHomes");
        this.guardTimes = guardTimes;
        this.guardHomes = guardHomes;
    }

    public /* synthetic */ GuardTotalCountModel(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public final String getGuardTimes() {
        return this.guardTimes;
    }

    public final String getGuardHomes() {
        return this.guardHomes;
    }
}
