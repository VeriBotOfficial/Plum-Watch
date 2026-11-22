package com.hispark.crashdump;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferArbiter.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/hispark/crashdump/TransferSnapshot;", "", "leaseId", "", "kind", "Lcom/hispark/crashdump/TransferKind;", "label", "<init>", "(Ljava/lang/String;Lcom/hispark/crashdump/TransferKind;Ljava/lang/String;)V", "getLeaseId", "()Ljava/lang/String;", "getKind", "()Lcom/hispark/crashdump/TransferKind;", "getLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TransferSnapshot {
    private final TransferKind kind;
    private final String label;
    private final String leaseId;

    public static /* synthetic */ TransferSnapshot copy$default(TransferSnapshot transferSnapshot, String str, TransferKind transferKind, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transferSnapshot.leaseId;
        }
        if ((i & 2) != 0) {
            transferKind = transferSnapshot.kind;
        }
        if ((i & 4) != 0) {
            str2 = transferSnapshot.label;
        }
        return transferSnapshot.copy(str, transferKind, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLeaseId() {
        return this.leaseId;
    }

    /* renamed from: component2, reason: from getter */
    public final TransferKind getKind() {
        return this.kind;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final TransferSnapshot copy(String leaseId, TransferKind kind, String label) {
        Intrinsics.checkNotNullParameter(leaseId, "leaseId");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(label, "label");
        return new TransferSnapshot(leaseId, kind, label);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferSnapshot)) {
            return false;
        }
        TransferSnapshot transferSnapshot = (TransferSnapshot) other;
        return Intrinsics.areEqual(this.leaseId, transferSnapshot.leaseId) && this.kind == transferSnapshot.kind && Intrinsics.areEqual(this.label, transferSnapshot.label);
    }

    public int hashCode() {
        return (((this.leaseId.hashCode() * 31) + this.kind.hashCode()) * 31) + this.label.hashCode();
    }

    public String toString() {
        return "TransferSnapshot(leaseId=" + this.leaseId + ", kind=" + this.kind + ", label=" + this.label + ')';
    }

    public TransferSnapshot(String leaseId, TransferKind kind, String label) {
        Intrinsics.checkNotNullParameter(leaseId, "leaseId");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(label, "label");
        this.leaseId = leaseId;
        this.kind = kind;
        this.label = label;
    }

    public final String getLeaseId() {
        return this.leaseId;
    }

    public final TransferKind getKind() {
        return this.kind;
    }

    public final String getLabel() {
        return this.label;
    }
}
