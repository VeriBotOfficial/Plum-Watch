package com.hispark.clouddiag.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConnectionState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/hispark/clouddiag/model/SendResult;", "", "<init>", "()V", "Success", "Failed", "Lcom/hispark/clouddiag/model/SendResult$Failed;", "Lcom/hispark/clouddiag/model/SendResult$Success;", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class SendResult {
    public /* synthetic */ SendResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SendResult() {
    }

    /* compiled from: ConnectionState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/hispark/clouddiag/model/SendResult$Success;", "Lcom/hispark/clouddiag/model/SendResult;", "messageId", "", "<init>", "(Ljava/lang/String;)V", "getMessageId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends SendResult {
        private final String messageId;

        public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.messageId;
            }
            return success.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        public final Success copy(String messageId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            return new Success(messageId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.messageId, ((Success) other).messageId);
        }

        public int hashCode() {
            return this.messageId.hashCode();
        }

        public String toString() {
            return "Success(messageId=" + this.messageId + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(String messageId) {
            super(null);
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            this.messageId = messageId;
        }

        public final String getMessageId() {
            return this.messageId;
        }
    }

    /* compiled from: ConnectionState.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/hispark/clouddiag/model/SendResult$Failed;", "Lcom/hispark/clouddiag/model/SendResult;", "messageId", "", "error", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getMessageId", "()Ljava/lang/String;", "getError", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Failed extends SendResult {
        private final Throwable error;
        private final String messageId;

        public static /* synthetic */ Failed copy$default(Failed failed, String str, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failed.messageId;
            }
            if ((i & 2) != 0) {
                th = failed.error;
            }
            return failed.copy(str, th);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        /* renamed from: component2, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final Failed copy(String messageId, Throwable error) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(error, "error");
            return new Failed(messageId, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) other;
            return Intrinsics.areEqual(this.messageId, failed.messageId) && Intrinsics.areEqual(this.error, failed.error);
        }

        public int hashCode() {
            return (this.messageId.hashCode() * 31) + this.error.hashCode();
        }

        public String toString() {
            return "Failed(messageId=" + this.messageId + ", error=" + this.error + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(String messageId, Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(error, "error");
            this.messageId = messageId;
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }

        public final String getMessageId() {
            return this.messageId;
        }
    }
}
