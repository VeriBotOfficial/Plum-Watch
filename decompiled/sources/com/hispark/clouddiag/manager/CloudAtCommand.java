package com.hispark.clouddiag.manager;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CloudAtCommand.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/hispark/clouddiag/manager/CloudAtCommand;", "", "deviceId", "", "originalObjectDeviceId", "taskId", "value", "timeoutSeconds", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getDeviceId", "()Ljava/lang/String;", "getOriginalObjectDeviceId", "getTaskId", "getValue", "getTimeoutSeconds", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CloudAtCommand {
    private final String deviceId;
    private final String originalObjectDeviceId;
    private final String taskId;
    private final int timeoutSeconds;
    private final String value;

    public static /* synthetic */ CloudAtCommand copy$default(CloudAtCommand cloudAtCommand, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cloudAtCommand.deviceId;
        }
        if ((i2 & 2) != 0) {
            str2 = cloudAtCommand.originalObjectDeviceId;
        }
        if ((i2 & 4) != 0) {
            str3 = cloudAtCommand.taskId;
        }
        if ((i2 & 8) != 0) {
            str4 = cloudAtCommand.value;
        }
        if ((i2 & 16) != 0) {
            i = cloudAtCommand.timeoutSeconds;
        }
        int i3 = i;
        String str5 = str3;
        return cloudAtCommand.copy(str, str2, str5, str4, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOriginalObjectDeviceId() {
        return this.originalObjectDeviceId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public final CloudAtCommand copy(String deviceId, String originalObjectDeviceId, String taskId, String value, int timeoutSeconds) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(originalObjectDeviceId, "originalObjectDeviceId");
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(value, "value");
        return new CloudAtCommand(deviceId, originalObjectDeviceId, taskId, value, timeoutSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudAtCommand)) {
            return false;
        }
        CloudAtCommand cloudAtCommand = (CloudAtCommand) other;
        return Intrinsics.areEqual(this.deviceId, cloudAtCommand.deviceId) && Intrinsics.areEqual(this.originalObjectDeviceId, cloudAtCommand.originalObjectDeviceId) && Intrinsics.areEqual(this.taskId, cloudAtCommand.taskId) && Intrinsics.areEqual(this.value, cloudAtCommand.value) && this.timeoutSeconds == cloudAtCommand.timeoutSeconds;
    }

    public int hashCode() {
        return (((((((this.deviceId.hashCode() * 31) + this.originalObjectDeviceId.hashCode()) * 31) + this.taskId.hashCode()) * 31) + this.value.hashCode()) * 31) + Integer.hashCode(this.timeoutSeconds);
    }

    public String toString() {
        return "CloudAtCommand(deviceId=" + this.deviceId + ", originalObjectDeviceId=" + this.originalObjectDeviceId + ", taskId=" + this.taskId + ", value=" + this.value + ", timeoutSeconds=" + this.timeoutSeconds + ')';
    }

    public CloudAtCommand(String deviceId, String originalObjectDeviceId, String taskId, String value, int i) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(originalObjectDeviceId, "originalObjectDeviceId");
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(value, "value");
        this.deviceId = deviceId;
        this.originalObjectDeviceId = originalObjectDeviceId;
        this.taskId = taskId;
        this.value = value;
        this.timeoutSeconds = i;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getOriginalObjectDeviceId() {
        return this.originalObjectDeviceId;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final String getValue() {
        return this.value;
    }

    public final int getTimeoutSeconds() {
        return this.timeoutSeconds;
    }
}
