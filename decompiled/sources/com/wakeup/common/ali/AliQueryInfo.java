package com.wakeup.common.ali;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AliLfaRsp.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/ali/AliQueryInfo;", "", "task_id", "", "result", "status", "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getTask_id", "()Ljava/lang/String;", "getResult", "getStatus", "()I", "getMessage", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AliQueryInfo {
    private final String message;
    private final String result;
    private final int status;
    private final String task_id;

    public static /* synthetic */ AliQueryInfo copy$default(AliQueryInfo aliQueryInfo, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = aliQueryInfo.task_id;
        }
        if ((i2 & 2) != 0) {
            str2 = aliQueryInfo.result;
        }
        if ((i2 & 4) != 0) {
            i = aliQueryInfo.status;
        }
        if ((i2 & 8) != 0) {
            str3 = aliQueryInfo.message;
        }
        return aliQueryInfo.copy(str, str2, i, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTask_id() {
        return this.task_id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    /* renamed from: component3, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final AliQueryInfo copy(String task_id, String result, int status, String message) {
        Intrinsics.checkNotNullParameter(task_id, "task_id");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(message, "message");
        return new AliQueryInfo(task_id, result, status, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AliQueryInfo)) {
            return false;
        }
        AliQueryInfo aliQueryInfo = (AliQueryInfo) other;
        return Intrinsics.areEqual(this.task_id, aliQueryInfo.task_id) && Intrinsics.areEqual(this.result, aliQueryInfo.result) && this.status == aliQueryInfo.status && Intrinsics.areEqual(this.message, aliQueryInfo.message);
    }

    public int hashCode() {
        return (((((this.task_id.hashCode() * 31) + this.result.hashCode()) * 31) + Integer.hashCode(this.status)) * 31) + this.message.hashCode();
    }

    public String toString() {
        return "AliQueryInfo(task_id=" + this.task_id + ", result=" + this.result + ", status=" + this.status + ", message=" + this.message + Separators.RPAREN;
    }

    public AliQueryInfo(String task_id, String result, int i, String message) {
        Intrinsics.checkNotNullParameter(task_id, "task_id");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(message, "message");
        this.task_id = task_id;
        this.result = result;
        this.status = i;
        this.message = message;
    }

    public final String getTask_id() {
        return this.task_id;
    }

    public final String getResult() {
        return this.result;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getMessage() {
        return this.message;
    }
}
