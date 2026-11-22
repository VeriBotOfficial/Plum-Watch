package com.hispark.clouddiag.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CoredumpCommand.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/hispark/clouddiag/model/CoredumpCommand;", "", "originalObjectDeviceId", "", "normalizedDeviceId", "taskId", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOriginalObjectDeviceId", "()Ljava/lang/String;", "getNormalizedDeviceId", "getTaskId", "getValue", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CoredumpCommand {
    private final String normalizedDeviceId;
    private final String originalObjectDeviceId;
    private final String taskId;
    private final String value;

    public static /* synthetic */ CoredumpCommand copy$default(CoredumpCommand coredumpCommand, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = coredumpCommand.originalObjectDeviceId;
        }
        if ((i & 2) != 0) {
            str2 = coredumpCommand.normalizedDeviceId;
        }
        if ((i & 4) != 0) {
            str3 = coredumpCommand.taskId;
        }
        if ((i & 8) != 0) {
            str4 = coredumpCommand.value;
        }
        return coredumpCommand.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOriginalObjectDeviceId() {
        return this.originalObjectDeviceId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNormalizedDeviceId() {
        return this.normalizedDeviceId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final CoredumpCommand copy(String originalObjectDeviceId, String normalizedDeviceId, String taskId, String value) {
        Intrinsics.checkNotNullParameter(originalObjectDeviceId, "originalObjectDeviceId");
        Intrinsics.checkNotNullParameter(normalizedDeviceId, "normalizedDeviceId");
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(value, "value");
        return new CoredumpCommand(originalObjectDeviceId, normalizedDeviceId, taskId, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoredumpCommand)) {
            return false;
        }
        CoredumpCommand coredumpCommand = (CoredumpCommand) other;
        return Intrinsics.areEqual(this.originalObjectDeviceId, coredumpCommand.originalObjectDeviceId) && Intrinsics.areEqual(this.normalizedDeviceId, coredumpCommand.normalizedDeviceId) && Intrinsics.areEqual(this.taskId, coredumpCommand.taskId) && Intrinsics.areEqual(this.value, coredumpCommand.value);
    }

    public int hashCode() {
        return (((((this.originalObjectDeviceId.hashCode() * 31) + this.normalizedDeviceId.hashCode()) * 31) + this.taskId.hashCode()) * 31) + this.value.hashCode();
    }

    public String toString() {
        return "CoredumpCommand(originalObjectDeviceId=" + this.originalObjectDeviceId + ", normalizedDeviceId=" + this.normalizedDeviceId + ", taskId=" + this.taskId + ", value=" + this.value + ')';
    }

    public CoredumpCommand(String originalObjectDeviceId, String normalizedDeviceId, String taskId, String value) {
        Intrinsics.checkNotNullParameter(originalObjectDeviceId, "originalObjectDeviceId");
        Intrinsics.checkNotNullParameter(normalizedDeviceId, "normalizedDeviceId");
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(value, "value");
        this.originalObjectDeviceId = originalObjectDeviceId;
        this.normalizedDeviceId = normalizedDeviceId;
        this.taskId = taskId;
        this.value = value;
    }

    public final String getOriginalObjectDeviceId() {
        return this.originalObjectDeviceId;
    }

    public final String getNormalizedDeviceId() {
        return this.normalizedDeviceId;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public /* synthetic */ CoredumpCommand(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "" : str4);
    }

    public final String getValue() {
        return this.value;
    }
}
