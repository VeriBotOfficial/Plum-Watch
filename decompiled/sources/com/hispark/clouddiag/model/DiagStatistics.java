package com.hispark.clouddiag.model;

import com.hispark.clouddiag.model.ConnectionState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConnectionState.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/hispark/clouddiag/model/DiagStatistics;", "", "messagesSent", "", "sendFailures", "messagesReceived", "connectionState", "Lcom/hispark/clouddiag/model/ConnectionState;", "<init>", "(IIILcom/hispark/clouddiag/model/ConnectionState;)V", "getMessagesSent", "()I", "getSendFailures", "getMessagesReceived", "getConnectionState", "()Lcom/hispark/clouddiag/model/ConnectionState;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DiagStatistics {
    private final ConnectionState connectionState;
    private final int messagesReceived;
    private final int messagesSent;
    private final int sendFailures;

    public DiagStatistics() {
        this(0, 0, 0, null, 15, null);
    }

    public static /* synthetic */ DiagStatistics copy$default(DiagStatistics diagStatistics, int i, int i2, int i3, ConnectionState connectionState, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = diagStatistics.messagesSent;
        }
        if ((i4 & 2) != 0) {
            i2 = diagStatistics.sendFailures;
        }
        if ((i4 & 4) != 0) {
            i3 = diagStatistics.messagesReceived;
        }
        if ((i4 & 8) != 0) {
            connectionState = diagStatistics.connectionState;
        }
        return diagStatistics.copy(i, i2, i3, connectionState);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMessagesSent() {
        return this.messagesSent;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSendFailures() {
        return this.sendFailures;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMessagesReceived() {
        return this.messagesReceived;
    }

    /* renamed from: component4, reason: from getter */
    public final ConnectionState getConnectionState() {
        return this.connectionState;
    }

    public final DiagStatistics copy(int messagesSent, int sendFailures, int messagesReceived, ConnectionState connectionState) {
        Intrinsics.checkNotNullParameter(connectionState, "connectionState");
        return new DiagStatistics(messagesSent, sendFailures, messagesReceived, connectionState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiagStatistics)) {
            return false;
        }
        DiagStatistics diagStatistics = (DiagStatistics) other;
        return this.messagesSent == diagStatistics.messagesSent && this.sendFailures == diagStatistics.sendFailures && this.messagesReceived == diagStatistics.messagesReceived && Intrinsics.areEqual(this.connectionState, diagStatistics.connectionState);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.messagesSent) * 31) + Integer.hashCode(this.sendFailures)) * 31) + Integer.hashCode(this.messagesReceived)) * 31) + this.connectionState.hashCode();
    }

    public String toString() {
        return "DiagStatistics(messagesSent=" + this.messagesSent + ", sendFailures=" + this.sendFailures + ", messagesReceived=" + this.messagesReceived + ", connectionState=" + this.connectionState + ')';
    }

    public DiagStatistics(int i, int i2, int i3, ConnectionState connectionState) {
        Intrinsics.checkNotNullParameter(connectionState, "connectionState");
        this.messagesSent = i;
        this.sendFailures = i2;
        this.messagesReceived = i3;
        this.connectionState = connectionState;
    }

    public final int getMessagesSent() {
        return this.messagesSent;
    }

    public final int getSendFailures() {
        return this.sendFailures;
    }

    public final int getMessagesReceived() {
        return this.messagesReceived;
    }

    public /* synthetic */ DiagStatistics(int i, int i2, int i3, ConnectionState.Disconnected disconnected, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? ConnectionState.Disconnected.INSTANCE : disconnected);
    }

    public final ConnectionState getConnectionState() {
        return this.connectionState;
    }
}
