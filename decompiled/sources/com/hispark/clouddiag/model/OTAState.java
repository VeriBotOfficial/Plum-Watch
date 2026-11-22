package com.hispark.clouddiag.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OTAState.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/hispark/clouddiag/model/OTAState;", "", "<init>", "()V", "Idle", "Preparing", "Downloading", "Uploading", "WaitingConfirmation", "Completed", "Failed", "Lcom/hispark/clouddiag/model/OTAState$Completed;", "Lcom/hispark/clouddiag/model/OTAState$Downloading;", "Lcom/hispark/clouddiag/model/OTAState$Failed;", "Lcom/hispark/clouddiag/model/OTAState$Idle;", "Lcom/hispark/clouddiag/model/OTAState$Preparing;", "Lcom/hispark/clouddiag/model/OTAState$Uploading;", "Lcom/hispark/clouddiag/model/OTAState$WaitingConfirmation;", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class OTAState {
    public /* synthetic */ OTAState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OTAState() {
    }

    /* compiled from: OTAState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/hispark/clouddiag/model/OTAState$Idle;", "Lcom/hispark/clouddiag/model/OTAState;", "<init>", "()V", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Idle extends OTAState {
        public static final Idle INSTANCE = new Idle();

        private Idle() {
            super(null);
        }
    }

    /* compiled from: OTAState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/hispark/clouddiag/model/OTAState$Preparing;", "Lcom/hispark/clouddiag/model/OTAState;", "taskId", "", "deviceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTaskId", "()Ljava/lang/String;", "getDeviceId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Preparing extends OTAState {
        private final String deviceId;
        private final String taskId;

        public static /* synthetic */ Preparing copy$default(Preparing preparing, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = preparing.taskId;
            }
            if ((i & 2) != 0) {
                str2 = preparing.deviceId;
            }
            return preparing.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTaskId() {
            return this.taskId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDeviceId() {
            return this.deviceId;
        }

        public final Preparing copy(String taskId, String deviceId) {
            Intrinsics.checkNotNullParameter(taskId, "taskId");
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            return new Preparing(taskId, deviceId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Preparing)) {
                return false;
            }
            Preparing preparing = (Preparing) other;
            return Intrinsics.areEqual(this.taskId, preparing.taskId) && Intrinsics.areEqual(this.deviceId, preparing.deviceId);
        }

        public int hashCode() {
            return (this.taskId.hashCode() * 31) + this.deviceId.hashCode();
        }

        public String toString() {
            return "Preparing(taskId=" + this.taskId + ", deviceId=" + this.deviceId + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Preparing(String taskId, String deviceId) {
            super(null);
            Intrinsics.checkNotNullParameter(taskId, "taskId");
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            this.taskId = taskId;
            this.deviceId = deviceId;
        }

        public final String getDeviceId() {
            return this.deviceId;
        }

        public final String getTaskId() {
            return this.taskId;
        }
    }

    /* compiled from: OTAState.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/hispark/clouddiag/model/OTAState$Downloading;", "Lcom/hispark/clouddiag/model/OTAState;", "taskId", "", "deviceId", "progress", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getTaskId", "()Ljava/lang/String;", "getDeviceId", "getProgress", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Downloading extends OTAState {
        private final String deviceId;
        private final int progress;
        private final String taskId;

        public static /* synthetic */ Downloading copy$default(Downloading downloading, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = downloading.taskId;
            }
            if ((i2 & 2) != 0) {
                str2 = downloading.deviceId;
            }
            if ((i2 & 4) != 0) {
                i = downloading.progress;
            }
            return downloading.copy(str, str2, i);
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

        public final Downloading copy(String taskId, String deviceId, int progress) {
            Intrinsics.checkNotNullParameter(taskId, "taskId");
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            return new Downloading(taskId, deviceId, progress);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Downloading)) {
                return false;
            }
            Downloading downloading = (Downloading) other;
            return Intrinsics.areEqual(this.taskId, downloading.taskId) && Intrinsics.areEqual(this.deviceId, downloading.deviceId) && this.progress == downloading.progress;
        }

        public int hashCode() {
            return (((this.taskId.hashCode() * 31) + this.deviceId.hashCode()) * 31) + Integer.hashCode(this.progress);
        }

        public String toString() {
            return "Downloading(taskId=" + this.taskId + ", deviceId=" + this.deviceId + ", progress=" + this.progress + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Downloading(String taskId, String deviceId, int i) {
            super(null);
            Intrinsics.checkNotNullParameter(taskId, "taskId");
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            this.taskId = taskId;
            this.deviceId = deviceId;
            this.progress = i;
        }

        public final String getDeviceId() {
            return this.deviceId;
        }

        public final int getProgress() {
            return this.progress;
        }

        public final String getTaskId() {
            return this.taskId;
        }
    }

    /* compiled from: OTAState.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/hispark/clouddiag/model/OTAState$Uploading;", "Lcom/hispark/clouddiag/model/OTAState;", "taskId", "", "deviceId", "progress", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getTaskId", "()Ljava/lang/String;", "getDeviceId", "getProgress", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Uploading extends OTAState {
        private final String deviceId;
        private final int progress;
        private final String taskId;

        public static /* synthetic */ Uploading copy$default(Uploading uploading, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = uploading.taskId;
            }
            if ((i2 & 2) != 0) {
                str2 = uploading.deviceId;
            }
            if ((i2 & 4) != 0) {
                i = uploading.progress;
            }
            return uploading.copy(str, str2, i);
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

        public final Uploading copy(String taskId, String deviceId, int progress) {
            Intrinsics.checkNotNullParameter(taskId, "taskId");
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            return new Uploading(taskId, deviceId, progress);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Uploading)) {
                return false;
            }
            Uploading uploading = (Uploading) other;
            return Intrinsics.areEqual(this.taskId, uploading.taskId) && Intrinsics.areEqual(this.deviceId, uploading.deviceId) && this.progress == uploading.progress;
        }

        public int hashCode() {
            return (((this.taskId.hashCode() * 31) + this.deviceId.hashCode()) * 31) + Integer.hashCode(this.progress);
        }

        public String toString() {
            return "Uploading(taskId=" + this.taskId + ", deviceId=" + this.deviceId + ", progress=" + this.progress + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Uploading(String taskId, String deviceId, int i) {
            super(null);
            Intrinsics.checkNotNullParameter(taskId, "taskId");
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            this.taskId = taskId;
            this.deviceId = deviceId;
            this.progress = i;
        }

        public final String getDeviceId() {
            return this.deviceId;
        }

        public final int getProgress() {
            return this.progress;
        }

        public final String getTaskId() {
            return this.taskId;
        }
    }

    /* compiled from: OTAState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/hispark/clouddiag/model/OTAState$WaitingConfirmation;", "Lcom/hispark/clouddiag/model/OTAState;", "taskId", "", "deviceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTaskId", "()Ljava/lang/String;", "getDeviceId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WaitingConfirmation extends OTAState {
        private final String deviceId;
        private final String taskId;

        public static /* synthetic */ WaitingConfirmation copy$default(WaitingConfirmation waitingConfirmation, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = waitingConfirmation.taskId;
            }
            if ((i & 2) != 0) {
                str2 = waitingConfirmation.deviceId;
            }
            return waitingConfirmation.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTaskId() {
            return this.taskId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDeviceId() {
            return this.deviceId;
        }

        public final WaitingConfirmation copy(String taskId, String deviceId) {
            Intrinsics.checkNotNullParameter(taskId, "taskId");
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            return new WaitingConfirmation(taskId, deviceId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WaitingConfirmation)) {
                return false;
            }
            WaitingConfirmation waitingConfirmation = (WaitingConfirmation) other;
            return Intrinsics.areEqual(this.taskId, waitingConfirmation.taskId) && Intrinsics.areEqual(this.deviceId, waitingConfirmation.deviceId);
        }

        public int hashCode() {
            return (this.taskId.hashCode() * 31) + this.deviceId.hashCode();
        }

        public String toString() {
            return "WaitingConfirmation(taskId=" + this.taskId + ", deviceId=" + this.deviceId + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WaitingConfirmation(String taskId, String deviceId) {
            super(null);
            Intrinsics.checkNotNullParameter(taskId, "taskId");
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            this.taskId = taskId;
            this.deviceId = deviceId;
        }

        public final String getDeviceId() {
            return this.deviceId;
        }

        public final String getTaskId() {
            return this.taskId;
        }
    }

    /* compiled from: OTAState.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/hispark/clouddiag/model/OTAState$Completed;", "Lcom/hispark/clouddiag/model/OTAState;", "taskId", "", "deviceId", "success", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getTaskId", "()Ljava/lang/String;", "getDeviceId", "getSuccess", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Completed extends OTAState {
        private final String deviceId;
        private final boolean success;
        private final String taskId;

        public static /* synthetic */ Completed copy$default(Completed completed, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = completed.taskId;
            }
            if ((i & 2) != 0) {
                str2 = completed.deviceId;
            }
            if ((i & 4) != 0) {
                z = completed.success;
            }
            return completed.copy(str, str2, z);
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
        public final boolean getSuccess() {
            return this.success;
        }

        public final Completed copy(String taskId, String deviceId, boolean success) {
            Intrinsics.checkNotNullParameter(taskId, "taskId");
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            return new Completed(taskId, deviceId, success);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Completed)) {
                return false;
            }
            Completed completed = (Completed) other;
            return Intrinsics.areEqual(this.taskId, completed.taskId) && Intrinsics.areEqual(this.deviceId, completed.deviceId) && this.success == completed.success;
        }

        public int hashCode() {
            return (((this.taskId.hashCode() * 31) + this.deviceId.hashCode()) * 31) + Boolean.hashCode(this.success);
        }

        public String toString() {
            return "Completed(taskId=" + this.taskId + ", deviceId=" + this.deviceId + ", success=" + this.success + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Completed(String taskId, String deviceId, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(taskId, "taskId");
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            this.taskId = taskId;
            this.deviceId = deviceId;
            this.success = z;
        }

        public final String getDeviceId() {
            return this.deviceId;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public final String getTaskId() {
            return this.taskId;
        }
    }

    /* compiled from: OTAState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/hispark/clouddiag/model/OTAState$Failed;", "Lcom/hispark/clouddiag/model/OTAState;", "taskId", "", "deviceId", "error", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTaskId", "()Ljava/lang/String;", "getDeviceId", "getError", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Failed extends OTAState {
        private final String deviceId;
        private final String error;
        private final String taskId;

        public static /* synthetic */ Failed copy$default(Failed failed, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failed.taskId;
            }
            if ((i & 2) != 0) {
                str2 = failed.deviceId;
            }
            if ((i & 4) != 0) {
                str3 = failed.error;
            }
            return failed.copy(str, str2, str3);
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
        public final String getError() {
            return this.error;
        }

        public final Failed copy(String taskId, String deviceId, String error) {
            Intrinsics.checkNotNullParameter(taskId, "taskId");
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            Intrinsics.checkNotNullParameter(error, "error");
            return new Failed(taskId, deviceId, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) other;
            return Intrinsics.areEqual(this.taskId, failed.taskId) && Intrinsics.areEqual(this.deviceId, failed.deviceId) && Intrinsics.areEqual(this.error, failed.error);
        }

        public int hashCode() {
            return (((this.taskId.hashCode() * 31) + this.deviceId.hashCode()) * 31) + this.error.hashCode();
        }

        public String toString() {
            return "Failed(taskId=" + this.taskId + ", deviceId=" + this.deviceId + ", error=" + this.error + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(String taskId, String deviceId, String error) {
            super(null);
            Intrinsics.checkNotNullParameter(taskId, "taskId");
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            Intrinsics.checkNotNullParameter(error, "error");
            this.taskId = taskId;
            this.deviceId = deviceId;
            this.error = error;
        }

        public final String getDeviceId() {
            return this.deviceId;
        }

        public final String getError() {
            return this.error;
        }

        public final String getTaskId() {
            return this.taskId;
        }
    }
}
