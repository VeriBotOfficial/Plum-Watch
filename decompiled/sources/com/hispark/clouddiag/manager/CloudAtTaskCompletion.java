package com.hispark.clouddiag.manager;

import com.heytap.mcssdk.constant.b;
import com.iflytek.cloud.SpeechUtility;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CloudAtTaskCoordinator.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006 "}, d2 = {"Lcom/hispark/clouddiag/manager/CloudAtTaskCompletion;", "", b.y, "Lcom/hispark/clouddiag/manager/CloudAtCommand;", "success", "", SpeechUtility.TAG_RESOURCE_RET, "", "errorCode", "errorMsg", "<init>", "(Lcom/hispark/clouddiag/manager/CloudAtCommand;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCommand", "()Lcom/hispark/clouddiag/manager/CloudAtCommand;", "getSuccess", "()Z", "getRet", "()Ljava/lang/String;", "getErrorCode", "getErrorMsg", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CloudAtTaskCompletion {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final CloudAtCommand command;
    private final String errorCode;
    private final String errorMsg;
    private final String ret;
    private final boolean success;

    public static /* synthetic */ CloudAtTaskCompletion copy$default(CloudAtTaskCompletion cloudAtTaskCompletion, CloudAtCommand cloudAtCommand, boolean z, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            cloudAtCommand = cloudAtTaskCompletion.command;
        }
        if ((i & 2) != 0) {
            z = cloudAtTaskCompletion.success;
        }
        if ((i & 4) != 0) {
            str = cloudAtTaskCompletion.ret;
        }
        if ((i & 8) != 0) {
            str2 = cloudAtTaskCompletion.errorCode;
        }
        if ((i & 16) != 0) {
            str3 = cloudAtTaskCompletion.errorMsg;
        }
        String str4 = str3;
        String str5 = str;
        return cloudAtTaskCompletion.copy(cloudAtCommand, z, str5, str2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final CloudAtCommand getCommand() {
        return this.command;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRet() {
        return this.ret;
    }

    /* renamed from: component4, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: component5, reason: from getter */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final CloudAtTaskCompletion copy(CloudAtCommand command, boolean success, String ret, String errorCode, String errorMsg) {
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(ret, "ret");
        return new CloudAtTaskCompletion(command, success, ret, errorCode, errorMsg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudAtTaskCompletion)) {
            return false;
        }
        CloudAtTaskCompletion cloudAtTaskCompletion = (CloudAtTaskCompletion) other;
        return Intrinsics.areEqual(this.command, cloudAtTaskCompletion.command) && this.success == cloudAtTaskCompletion.success && Intrinsics.areEqual(this.ret, cloudAtTaskCompletion.ret) && Intrinsics.areEqual(this.errorCode, cloudAtTaskCompletion.errorCode) && Intrinsics.areEqual(this.errorMsg, cloudAtTaskCompletion.errorMsg);
    }

    public int hashCode() {
        int hashCode = ((((this.command.hashCode() * 31) + Boolean.hashCode(this.success)) * 31) + this.ret.hashCode()) * 31;
        String str = this.errorCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorMsg;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CloudAtTaskCompletion(command=" + this.command + ", success=" + this.success + ", ret=" + this.ret + ", errorCode=" + this.errorCode + ", errorMsg=" + this.errorMsg + ')';
    }

    public CloudAtTaskCompletion(CloudAtCommand command, boolean z, String ret, String str, String str2) {
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(ret, "ret");
        this.command = command;
        this.success = z;
        this.ret = ret;
        this.errorCode = str;
        this.errorMsg = str2;
    }

    public /* synthetic */ CloudAtTaskCompletion(CloudAtCommand cloudAtCommand, boolean z, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cloudAtCommand, z, str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }

    public final CloudAtCommand getCommand() {
        return this.command;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final String getRet() {
        return this.ret;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    /* compiled from: CloudAtTaskCoordinator.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t¨\u0006\f"}, d2 = {"Lcom/hispark/clouddiag/manager/CloudAtTaskCompletion$Companion;", "", "<init>", "()V", "failure", "Lcom/hispark/clouddiag/manager/CloudAtTaskCompletion;", b.y, "Lcom/hispark/clouddiag/manager/CloudAtCommand;", "errorCode", "", "errorMsg", SpeechUtility.TAG_RESOURCE_RET, "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ CloudAtTaskCompletion failure$default(Companion companion, CloudAtCommand cloudAtCommand, String str, String str2, String str3, int i, Object obj) {
            if ((i & 8) != 0) {
                str3 = "";
            }
            return companion.failure(cloudAtCommand, str, str2, str3);
        }

        public final CloudAtTaskCompletion failure(CloudAtCommand command, String errorCode, String errorMsg, String ret) {
            Intrinsics.checkNotNullParameter(command, "command");
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
            Intrinsics.checkNotNullParameter(ret, "ret");
            return new CloudAtTaskCompletion(command, false, ret, errorCode, errorMsg);
        }
    }
}
