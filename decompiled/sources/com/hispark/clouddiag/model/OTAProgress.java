package com.hispark.clouddiag.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OTAMessage.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/hispark/clouddiag/model/OTAProgress;", "", "taskId", "", "deviceId", "progress", "", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getTaskId", "()Ljava/lang/String;", "getDeviceId", "getProgress", "()I", "getStatus", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OTAProgress {
    private final String deviceId;
    private final int progress;
    private final String status;
    private final String taskId;

    public static /* synthetic */ OTAProgress copy$default(OTAProgress oTAProgress, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = oTAProgress.taskId;
        }
        if ((i2 & 2) != 0) {
            str2 = oTAProgress.deviceId;
        }
        if ((i2 & 4) != 0) {
            i = oTAProgress.progress;
        }
        if ((i2 & 8) != 0) {
            str3 = oTAProgress.status;
        }
        return oTAProgress.copy(str, str2, i, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final OTAProgress copy(String taskId, String deviceId, int progress, String status) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(status, "status");
        return new OTAProgress(taskId, deviceId, progress, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OTAProgress)) {
            return false;
        }
        OTAProgress oTAProgress = (OTAProgress) other;
        return Intrinsics.areEqual(this.taskId, oTAProgress.taskId) && Intrinsics.areEqual(this.deviceId, oTAProgress.deviceId) && this.progress == oTAProgress.progress && Intrinsics.areEqual(this.status, oTAProgress.status);
    }

    public int hashCode() {
        return (((((this.taskId.hashCode() * 31) + this.deviceId.hashCode()) * 31) + Integer.hashCode(this.progress)) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "OTAProgress(taskId=" + this.taskId + ", deviceId=" + this.deviceId + ", progress=" + this.progress + ", status=" + this.status + ')';
    }

    public OTAProgress(String taskId, String deviceId, int i, String status) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(status, "status");
        this.taskId = taskId;
        this.deviceId = deviceId;
        this.progress = i;
        this.status = status;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final String getStatus() {
        return this.status;
    }
}
