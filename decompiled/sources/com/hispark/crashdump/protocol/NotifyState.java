package com.hispark.crashdump.protocol;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BoardFileProtocol.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/hispark/crashdump/protocol/NotifyState;", "", "transmitId", "", "stateCode", "dataSize", "reason", "<init>", "(IIILjava/lang/Integer;)V", "getTransmitId", "()I", "getStateCode", "getDataSize", "getReason", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(IIILjava/lang/Integer;)Lcom/hispark/crashdump/protocol/NotifyState;", "equals", "", "other", "hashCode", "toString", "", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class NotifyState {
    private final int dataSize;
    private final Integer reason;
    private final int stateCode;
    private final int transmitId;

    public static /* synthetic */ NotifyState copy$default(NotifyState notifyState, int i, int i2, int i3, Integer num, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = notifyState.transmitId;
        }
        if ((i4 & 2) != 0) {
            i2 = notifyState.stateCode;
        }
        if ((i4 & 4) != 0) {
            i3 = notifyState.dataSize;
        }
        if ((i4 & 8) != 0) {
            num = notifyState.reason;
        }
        return notifyState.copy(i, i2, i3, num);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTransmitId() {
        return this.transmitId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStateCode() {
        return this.stateCode;
    }

    /* renamed from: component3, reason: from getter */
    public final int getDataSize() {
        return this.dataSize;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getReason() {
        return this.reason;
    }

    public final NotifyState copy(int transmitId, int stateCode, int dataSize, Integer reason) {
        return new NotifyState(transmitId, stateCode, dataSize, reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotifyState)) {
            return false;
        }
        NotifyState notifyState = (NotifyState) other;
        return this.transmitId == notifyState.transmitId && this.stateCode == notifyState.stateCode && this.dataSize == notifyState.dataSize && Intrinsics.areEqual(this.reason, notifyState.reason);
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.transmitId) * 31) + Integer.hashCode(this.stateCode)) * 31) + Integer.hashCode(this.dataSize)) * 31;
        Integer num = this.reason;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "NotifyState(transmitId=" + this.transmitId + ", stateCode=" + this.stateCode + ", dataSize=" + this.dataSize + ", reason=" + this.reason + ')';
    }

    public NotifyState(int i, int i2, int i3, Integer num) {
        this.transmitId = i;
        this.stateCode = i2;
        this.dataSize = i3;
        this.reason = num;
    }

    public final int getTransmitId() {
        return this.transmitId;
    }

    public final int getStateCode() {
        return this.stateCode;
    }

    public final int getDataSize() {
        return this.dataSize;
    }

    public final Integer getReason() {
        return this.reason;
    }
}
