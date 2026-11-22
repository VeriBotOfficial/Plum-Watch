package com.hispark.clouddiag.callback;

import com.alipay.sdk.m.y.k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceSender.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/hispark/clouddiag/callback/DeviceWriteStartResult;", "", "status", "Lcom/hispark/clouddiag/callback/DeviceWriteStartStatus;", "errorMessage", "", "<init>", "(Lcom/hispark/clouddiag/callback/DeviceWriteStartStatus;Ljava/lang/String;)V", "getStatus", "()Lcom/hispark/clouddiag/callback/DeviceWriteStartStatus;", "getErrorMessage", "()Ljava/lang/String;", "accepted", "", "getAccepted", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DeviceWriteStartResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String errorMessage;
    private final DeviceWriteStartStatus status;

    public static /* synthetic */ DeviceWriteStartResult copy$default(DeviceWriteStartResult deviceWriteStartResult, DeviceWriteStartStatus deviceWriteStartStatus, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            deviceWriteStartStatus = deviceWriteStartResult.status;
        }
        if ((i & 2) != 0) {
            str = deviceWriteStartResult.errorMessage;
        }
        return deviceWriteStartResult.copy(deviceWriteStartStatus, str);
    }

    /* renamed from: component1, reason: from getter */
    public final DeviceWriteStartStatus getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final DeviceWriteStartResult copy(DeviceWriteStartStatus status, String errorMessage) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new DeviceWriteStartResult(status, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceWriteStartResult)) {
            return false;
        }
        DeviceWriteStartResult deviceWriteStartResult = (DeviceWriteStartResult) other;
        return this.status == deviceWriteStartResult.status && Intrinsics.areEqual(this.errorMessage, deviceWriteStartResult.errorMessage);
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        String str = this.errorMessage;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "DeviceWriteStartResult(status=" + this.status + ", errorMessage=" + this.errorMessage + ')';
    }

    public DeviceWriteStartResult(DeviceWriteStartStatus status, String str) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.errorMessage = str;
    }

    public /* synthetic */ DeviceWriteStartResult(DeviceWriteStartStatus deviceWriteStartStatus, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceWriteStartStatus, (i & 2) != 0 ? null : str);
    }

    public final DeviceWriteStartStatus getStatus() {
        return this.status;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean getAccepted() {
        return this.status == DeviceWriteStartStatus.ACCEPTED;
    }

    /* compiled from: DeviceSender.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b¨\u0006\u000b"}, d2 = {"Lcom/hispark/clouddiag/callback/DeviceWriteStartResult$Companion;", "", "<init>", "()V", "accepted", "Lcom/hispark/clouddiag/callback/DeviceWriteStartResult;", "busy", "message", "", "unsupported", k.j, "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final DeviceWriteStartResult accepted() {
            return new DeviceWriteStartResult(DeviceWriteStartStatus.ACCEPTED, null, 2, 0 == true ? 1 : 0);
        }

        public final DeviceWriteStartResult busy(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new DeviceWriteStartResult(DeviceWriteStartStatus.BUSY, message);
        }

        public final DeviceWriteStartResult unsupported(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new DeviceWriteStartResult(DeviceWriteStartStatus.UNSUPPORTED, message);
        }

        public final DeviceWriteStartResult failed(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new DeviceWriteStartResult(DeviceWriteStartStatus.FAILED, message);
        }
    }
}
