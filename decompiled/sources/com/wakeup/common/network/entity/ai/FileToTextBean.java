package com.wakeup.common.network.entity.ai;

import android.gov.nist.core.Separators;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.qumeng.overseas.advlib.trdparty.unionset.common.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FileToTextBean.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/network/entity/ai/FileToTextBean;", "", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "taskId", "", "statusText", h.A, "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStatusCode", "()I", "getTaskId", "()Ljava/lang/String;", "getStatusText", "getRequestId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FileToTextBean {
    private final String requestId;
    private final int statusCode;
    private final String statusText;
    private final String taskId;

    public static /* synthetic */ FileToTextBean copy$default(FileToTextBean fileToTextBean, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fileToTextBean.statusCode;
        }
        if ((i2 & 2) != 0) {
            str = fileToTextBean.taskId;
        }
        if ((i2 & 4) != 0) {
            str2 = fileToTextBean.statusText;
        }
        if ((i2 & 8) != 0) {
            str3 = fileToTextBean.requestId;
        }
        return fileToTextBean.copy(i, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStatusText() {
        return this.statusText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    public final FileToTextBean copy(int statusCode, String taskId, String statusText, String requestId) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(statusText, "statusText");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        return new FileToTextBean(statusCode, taskId, statusText, requestId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileToTextBean)) {
            return false;
        }
        FileToTextBean fileToTextBean = (FileToTextBean) other;
        return this.statusCode == fileToTextBean.statusCode && Intrinsics.areEqual(this.taskId, fileToTextBean.taskId) && Intrinsics.areEqual(this.statusText, fileToTextBean.statusText) && Intrinsics.areEqual(this.requestId, fileToTextBean.requestId);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.statusCode) * 31) + this.taskId.hashCode()) * 31) + this.statusText.hashCode()) * 31) + this.requestId.hashCode();
    }

    public String toString() {
        return "FileToTextBean(statusCode=" + this.statusCode + ", taskId=" + this.taskId + ", statusText=" + this.statusText + ", requestId=" + this.requestId + Separators.RPAREN;
    }

    public FileToTextBean(int i, String taskId, String statusText, String requestId) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(statusText, "statusText");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.statusCode = i;
        this.taskId = taskId;
        this.statusText = statusText;
        this.requestId = requestId;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final String getStatusText() {
        return this.statusText;
    }

    public final String getRequestId() {
        return this.requestId;
    }
}
