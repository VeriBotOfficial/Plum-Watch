package com.wakeup.common.network.entity.ai;

import android.gov.nist.core.Separators;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.qumeng.overseas.advlib.trdparty.unionset.common.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FileToTextBean.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J[\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\t\u0010)\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015¨\u0006*"}, d2 = {"Lcom/wakeup/common/network/entity/ai/FileToTextResultBean;", "", "result", "Lcom/wakeup/common/network/entity/ai/TextResult;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "statusText", "", "taskId", "bizDuration", "solveTime", "requestTime", "", h.A, "<init>", "(Lcom/wakeup/common/network/entity/ai/TextResult;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;)V", "getResult", "()Lcom/wakeup/common/network/entity/ai/TextResult;", "getStatusCode", "()I", "getStatusText", "()Ljava/lang/String;", "getTaskId", "getBizDuration", "getSolveTime", "getRequestTime", "()J", "getRequestId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FileToTextResultBean {
    private final int bizDuration;
    private final String requestId;
    private final long requestTime;
    private final TextResult result;
    private final String solveTime;
    private final int statusCode;
    private final String statusText;
    private final String taskId;

    public static /* synthetic */ FileToTextResultBean copy$default(FileToTextResultBean fileToTextResultBean, TextResult textResult, int i, String str, String str2, int i2, String str3, long j, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            textResult = fileToTextResultBean.result;
        }
        if ((i3 & 2) != 0) {
            i = fileToTextResultBean.statusCode;
        }
        if ((i3 & 4) != 0) {
            str = fileToTextResultBean.statusText;
        }
        if ((i3 & 8) != 0) {
            str2 = fileToTextResultBean.taskId;
        }
        if ((i3 & 16) != 0) {
            i2 = fileToTextResultBean.bizDuration;
        }
        if ((i3 & 32) != 0) {
            str3 = fileToTextResultBean.solveTime;
        }
        if ((i3 & 64) != 0) {
            j = fileToTextResultBean.requestTime;
        }
        if ((i3 & 128) != 0) {
            str4 = fileToTextResultBean.requestId;
        }
        String str5 = str4;
        long j2 = j;
        int i4 = i2;
        String str6 = str3;
        return fileToTextResultBean.copy(textResult, i, str, str2, i4, str6, j2, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final TextResult getResult() {
        return this.result;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStatusText() {
        return this.statusText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }

    /* renamed from: component5, reason: from getter */
    public final int getBizDuration() {
        return this.bizDuration;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSolveTime() {
        return this.solveTime;
    }

    /* renamed from: component7, reason: from getter */
    public final long getRequestTime() {
        return this.requestTime;
    }

    /* renamed from: component8, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    public final FileToTextResultBean copy(TextResult result, int statusCode, String statusText, String taskId, int bizDuration, String solveTime, long requestTime, String requestId) {
        Intrinsics.checkNotNullParameter(statusText, "statusText");
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(solveTime, "solveTime");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        return new FileToTextResultBean(result, statusCode, statusText, taskId, bizDuration, solveTime, requestTime, requestId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileToTextResultBean)) {
            return false;
        }
        FileToTextResultBean fileToTextResultBean = (FileToTextResultBean) other;
        return Intrinsics.areEqual(this.result, fileToTextResultBean.result) && this.statusCode == fileToTextResultBean.statusCode && Intrinsics.areEqual(this.statusText, fileToTextResultBean.statusText) && Intrinsics.areEqual(this.taskId, fileToTextResultBean.taskId) && this.bizDuration == fileToTextResultBean.bizDuration && Intrinsics.areEqual(this.solveTime, fileToTextResultBean.solveTime) && this.requestTime == fileToTextResultBean.requestTime && Intrinsics.areEqual(this.requestId, fileToTextResultBean.requestId);
    }

    public int hashCode() {
        TextResult textResult = this.result;
        return ((((((((((((((textResult == null ? 0 : textResult.hashCode()) * 31) + Integer.hashCode(this.statusCode)) * 31) + this.statusText.hashCode()) * 31) + this.taskId.hashCode()) * 31) + Integer.hashCode(this.bizDuration)) * 31) + this.solveTime.hashCode()) * 31) + Long.hashCode(this.requestTime)) * 31) + this.requestId.hashCode();
    }

    public String toString() {
        return "FileToTextResultBean(result=" + this.result + ", statusCode=" + this.statusCode + ", statusText=" + this.statusText + ", taskId=" + this.taskId + ", bizDuration=" + this.bizDuration + ", solveTime=" + this.solveTime + ", requestTime=" + this.requestTime + ", requestId=" + this.requestId + Separators.RPAREN;
    }

    public FileToTextResultBean(TextResult textResult, int i, String statusText, String taskId, int i2, String solveTime, long j, String requestId) {
        Intrinsics.checkNotNullParameter(statusText, "statusText");
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(solveTime, "solveTime");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.result = textResult;
        this.statusCode = i;
        this.statusText = statusText;
        this.taskId = taskId;
        this.bizDuration = i2;
        this.solveTime = solveTime;
        this.requestTime = j;
        this.requestId = requestId;
    }

    public final TextResult getResult() {
        return this.result;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusText() {
        return this.statusText;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final int getBizDuration() {
        return this.bizDuration;
    }

    public final String getSolveTime() {
        return this.solveTime;
    }

    public final long getRequestTime() {
        return this.requestTime;
    }

    public final String getRequestId() {
        return this.requestId;
    }
}
