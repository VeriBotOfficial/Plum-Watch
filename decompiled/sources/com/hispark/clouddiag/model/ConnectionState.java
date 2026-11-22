package com.hispark.clouddiag.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConnectionState.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/hispark/clouddiag/model/ConnectionState;", "", "<init>", "()V", "Disconnected", "Connecting", "Connected", "Reconnecting", "ConnectionFailed", "Lcom/hispark/clouddiag/model/ConnectionState$Connected;", "Lcom/hispark/clouddiag/model/ConnectionState$Connecting;", "Lcom/hispark/clouddiag/model/ConnectionState$ConnectionFailed;", "Lcom/hispark/clouddiag/model/ConnectionState$Disconnected;", "Lcom/hispark/clouddiag/model/ConnectionState$Reconnecting;", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ConnectionState {
    public /* synthetic */ ConnectionState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ConnectionState() {
    }

    /* compiled from: ConnectionState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/hispark/clouddiag/model/ConnectionState$Disconnected;", "Lcom/hispark/clouddiag/model/ConnectionState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Disconnected extends ConnectionState {
        public static final Disconnected INSTANCE = new Disconnected();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Disconnected)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1028242152;
        }

        public String toString() {
            return "Disconnected";
        }

        private Disconnected() {
            super(null);
        }
    }

    /* compiled from: ConnectionState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/hispark/clouddiag/model/ConnectionState$Connecting;", "Lcom/hispark/clouddiag/model/ConnectionState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Connecting extends ConnectionState {
        public static final Connecting INSTANCE = new Connecting();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Connecting)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1251355995;
        }

        public String toString() {
            return "Connecting";
        }

        private Connecting() {
            super(null);
        }
    }

    /* compiled from: ConnectionState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/hispark/clouddiag/model/ConnectionState$Connected;", "Lcom/hispark/clouddiag/model/ConnectionState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Connected extends ConnectionState {
        public static final Connected INSTANCE = new Connected();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Connected)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -317461124;
        }

        public String toString() {
            return "Connected";
        }

        private Connected() {
            super(null);
        }
    }

    /* compiled from: ConnectionState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/hispark/clouddiag/model/ConnectionState$Reconnecting;", "Lcom/hispark/clouddiag/model/ConnectionState;", "retryCount", "", "<init>", "(I)V", "getRetryCount", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Reconnecting extends ConnectionState {
        private final int retryCount;

        public static /* synthetic */ Reconnecting copy$default(Reconnecting reconnecting, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = reconnecting.retryCount;
            }
            return reconnecting.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        public final Reconnecting copy(int retryCount) {
            return new Reconnecting(retryCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Reconnecting) && this.retryCount == ((Reconnecting) other).retryCount;
        }

        public int hashCode() {
            return Integer.hashCode(this.retryCount);
        }

        public String toString() {
            return "Reconnecting(retryCount=" + this.retryCount + ')';
        }

        public Reconnecting(int i) {
            super(null);
            this.retryCount = i;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }
    }

    /* compiled from: ConnectionState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/hispark/clouddiag/model/ConnectionState$ConnectionFailed;", "Lcom/hispark/clouddiag/model/ConnectionState;", "error", "", "<init>", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConnectionFailed extends ConnectionState {
        private final String error;

        public static /* synthetic */ ConnectionFailed copy$default(ConnectionFailed connectionFailed, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = connectionFailed.error;
            }
            return connectionFailed.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getError() {
            return this.error;
        }

        public final ConnectionFailed copy(String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new ConnectionFailed(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConnectionFailed) && Intrinsics.areEqual(this.error, ((ConnectionFailed) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "ConnectionFailed(error=" + this.error + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConnectionFailed(String error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final String getError() {
            return this.error;
        }
    }
}
