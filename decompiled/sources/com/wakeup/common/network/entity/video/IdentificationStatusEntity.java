package com.wakeup.common.network.entity.video;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdentificationStatusEntity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/network/entity/video/IdentificationStatusEntity;", "", "userId", "", "idStatus", "", "failReason", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getUserId", "()I", "setUserId", "(I)V", "getIdStatus", "()Ljava/lang/String;", "setIdStatus", "(Ljava/lang/String;)V", "getFailReason", "setFailReason", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class IdentificationStatusEntity {
    private String failReason;
    private String idStatus;
    private int userId;

    public static /* synthetic */ IdentificationStatusEntity copy$default(IdentificationStatusEntity identificationStatusEntity, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = identificationStatusEntity.userId;
        }
        if ((i2 & 2) != 0) {
            str = identificationStatusEntity.idStatus;
        }
        if ((i2 & 4) != 0) {
            str2 = identificationStatusEntity.failReason;
        }
        return identificationStatusEntity.copy(i, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getUserId() {
        return this.userId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIdStatus() {
        return this.idStatus;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFailReason() {
        return this.failReason;
    }

    public final IdentificationStatusEntity copy(int userId, String idStatus, String failReason) {
        Intrinsics.checkNotNullParameter(idStatus, "idStatus");
        Intrinsics.checkNotNullParameter(failReason, "failReason");
        return new IdentificationStatusEntity(userId, idStatus, failReason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdentificationStatusEntity)) {
            return false;
        }
        IdentificationStatusEntity identificationStatusEntity = (IdentificationStatusEntity) other;
        return this.userId == identificationStatusEntity.userId && Intrinsics.areEqual(this.idStatus, identificationStatusEntity.idStatus) && Intrinsics.areEqual(this.failReason, identificationStatusEntity.failReason);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.userId) * 31) + this.idStatus.hashCode()) * 31) + this.failReason.hashCode();
    }

    public String toString() {
        return "IdentificationStatusEntity(userId=" + this.userId + ", idStatus=" + this.idStatus + ", failReason=" + this.failReason + Separators.RPAREN;
    }

    public IdentificationStatusEntity(int i, String idStatus, String failReason) {
        Intrinsics.checkNotNullParameter(idStatus, "idStatus");
        Intrinsics.checkNotNullParameter(failReason, "failReason");
        this.userId = i;
        this.idStatus = idStatus;
        this.failReason = failReason;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final void setUserId(int i) {
        this.userId = i;
    }

    public final String getIdStatus() {
        return this.idStatus;
    }

    public final void setIdStatus(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idStatus = str;
    }

    public final String getFailReason() {
        return this.failReason;
    }

    public final void setFailReason(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.failReason = str;
    }
}
