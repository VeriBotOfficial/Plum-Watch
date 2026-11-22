package com.hispark.crashdump;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferArbiter.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/hispark/crashdump/TransferLease;", "", "id", "", "kind", "Lcom/hispark/crashdump/TransferKind;", "label", "<init>", "(Ljava/lang/String;Lcom/hispark/crashdump/TransferKind;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getKind", "()Lcom/hispark/crashdump/TransferKind;", "getLabel", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TransferLease {
    private final String id;
    private final TransferKind kind;
    private final String label;

    public TransferLease(String id2, TransferKind kind, String label) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(label, "label");
        this.id = id2;
        this.kind = kind;
        this.label = label;
    }

    public final String getId() {
        return this.id;
    }

    public final TransferKind getKind() {
        return this.kind;
    }

    public final String getLabel() {
        return this.label;
    }
}
