package com.hispark.clouddiag.callback;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceSender.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/hispark/clouddiag/callback/DeviceWriteCompletion;", "", "success", "", "errorMessage", "", "<init>", "(ZLjava/lang/String;)V", "getSuccess", "()Z", "getErrorMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DeviceWriteCompletion {
    private final String errorMessage;
    private final boolean success;

    public static /* synthetic */ DeviceWriteCompletion copy$default(DeviceWriteCompletion deviceWriteCompletion, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = deviceWriteCompletion.success;
        }
        if ((i & 2) != 0) {
            str = deviceWriteCompletion.errorMessage;
        }
        return deviceWriteCompletion.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* renamed from: component2, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final DeviceWriteCompletion copy(boolean success, String errorMessage) {
        return new DeviceWriteCompletion(success, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceWriteCompletion)) {
            return false;
        }
        DeviceWriteCompletion deviceWriteCompletion = (DeviceWriteCompletion) other;
        return this.success == deviceWriteCompletion.success && Intrinsics.areEqual(this.errorMessage, deviceWriteCompletion.errorMessage);
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.success) * 31;
        String str = this.errorMessage;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "DeviceWriteCompletion(success=" + this.success + ", errorMessage=" + this.errorMessage + ')';
    }

    public DeviceWriteCompletion(boolean z, String str) {
        this.success = z;
        this.errorMessage = str;
    }

    public /* synthetic */ DeviceWriteCompletion(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str);
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }
}
