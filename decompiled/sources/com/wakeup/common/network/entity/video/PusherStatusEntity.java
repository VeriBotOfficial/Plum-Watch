package com.wakeup.common.network.entity.video;

import android.gov.nist.core.Separators;
import kotlin.Metadata;

/* compiled from: PusherStatusEntity.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006 "}, d2 = {"Lcom/wakeup/common/network/entity/video/PusherStatusEntity;", "", "attentionStatus", "", "attentionNumber", "", "storeNumber", "likeNumber", "<init>", "(ZIII)V", "getAttentionStatus", "()Z", "setAttentionStatus", "(Z)V", "getAttentionNumber", "()I", "setAttentionNumber", "(I)V", "getStoreNumber", "setStoreNumber", "getLikeNumber", "setLikeNumber", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PusherStatusEntity {
    private int attentionNumber;
    private boolean attentionStatus;
    private int likeNumber;
    private int storeNumber;

    public static /* synthetic */ PusherStatusEntity copy$default(PusherStatusEntity pusherStatusEntity, boolean z, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = pusherStatusEntity.attentionStatus;
        }
        if ((i4 & 2) != 0) {
            i = pusherStatusEntity.attentionNumber;
        }
        if ((i4 & 4) != 0) {
            i2 = pusherStatusEntity.storeNumber;
        }
        if ((i4 & 8) != 0) {
            i3 = pusherStatusEntity.likeNumber;
        }
        return pusherStatusEntity.copy(z, i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAttentionStatus() {
        return this.attentionStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAttentionNumber() {
        return this.attentionNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final int getStoreNumber() {
        return this.storeNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final int getLikeNumber() {
        return this.likeNumber;
    }

    public final PusherStatusEntity copy(boolean attentionStatus, int attentionNumber, int storeNumber, int likeNumber) {
        return new PusherStatusEntity(attentionStatus, attentionNumber, storeNumber, likeNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PusherStatusEntity)) {
            return false;
        }
        PusherStatusEntity pusherStatusEntity = (PusherStatusEntity) other;
        return this.attentionStatus == pusherStatusEntity.attentionStatus && this.attentionNumber == pusherStatusEntity.attentionNumber && this.storeNumber == pusherStatusEntity.storeNumber && this.likeNumber == pusherStatusEntity.likeNumber;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.attentionStatus) * 31) + Integer.hashCode(this.attentionNumber)) * 31) + Integer.hashCode(this.storeNumber)) * 31) + Integer.hashCode(this.likeNumber);
    }

    public String toString() {
        return "PusherStatusEntity(attentionStatus=" + this.attentionStatus + ", attentionNumber=" + this.attentionNumber + ", storeNumber=" + this.storeNumber + ", likeNumber=" + this.likeNumber + Separators.RPAREN;
    }

    public PusherStatusEntity(boolean z, int i, int i2, int i3) {
        this.attentionStatus = z;
        this.attentionNumber = i;
        this.storeNumber = i2;
        this.likeNumber = i3;
    }

    public final boolean getAttentionStatus() {
        return this.attentionStatus;
    }

    public final void setAttentionStatus(boolean z) {
        this.attentionStatus = z;
    }

    public final int getAttentionNumber() {
        return this.attentionNumber;
    }

    public final void setAttentionNumber(int i) {
        this.attentionNumber = i;
    }

    public final int getStoreNumber() {
        return this.storeNumber;
    }

    public final void setStoreNumber(int i) {
        this.storeNumber = i;
    }

    public final int getLikeNumber() {
        return this.likeNumber;
    }

    public final void setLikeNumber(int i) {
        this.likeNumber = i;
    }
}
