package com.wakeup.common.network.entity.course;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DownloadFileResult.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 (2\u00020\u0001:\u0001(BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003JH\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\u0007HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019¨\u0006)"}, d2 = {"Lcom/wakeup/common/network/entity/course/DownloadFileResult;", "", "taskId", "", "progress", "state", "errMsg", "", "filePath", "<init>", "(Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getTaskId", "()Ljava/lang/Integer;", "setTaskId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getProgress", "()I", "setProgress", "(I)V", "getState", "setState", "getErrMsg", "()Ljava/lang/String;", "setErrMsg", "(Ljava/lang/String;)V", "getFilePath", "setFilePath", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/wakeup/common/network/entity/course/DownloadFileResult;", "equals", "", "other", "hashCode", "toString", "Companion", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DownloadFileResult {
    public static final int COMPLETED = 2;
    public static final int DOWNLOADING = 1;
    public static final int ERROR = 3;
    public static final int PAUSE = 4;
    public static final int QUEUE_END = 5;
    public static final int START = 0;
    private String errMsg;
    private String filePath;
    private int progress;
    private Integer state;
    private Integer taskId;

    public DownloadFileResult() {
        this(null, 0, null, null, null, 31, null);
    }

    public static /* synthetic */ DownloadFileResult copy$default(DownloadFileResult downloadFileResult, Integer num, int i, Integer num2, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = downloadFileResult.taskId;
        }
        if ((i2 & 2) != 0) {
            i = downloadFileResult.progress;
        }
        if ((i2 & 4) != 0) {
            num2 = downloadFileResult.state;
        }
        if ((i2 & 8) != 0) {
            str = downloadFileResult.errMsg;
        }
        if ((i2 & 16) != 0) {
            str2 = downloadFileResult.filePath;
        }
        String str3 = str2;
        Integer num3 = num2;
        return downloadFileResult.copy(num, i, num3, str, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getTaskId() {
        return this.taskId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getState() {
        return this.state;
    }

    /* renamed from: component4, reason: from getter */
    public final String getErrMsg() {
        return this.errMsg;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    public final DownloadFileResult copy(Integer taskId, int progress, Integer state, String errMsg, String filePath) {
        return new DownloadFileResult(taskId, progress, state, errMsg, filePath);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadFileResult)) {
            return false;
        }
        DownloadFileResult downloadFileResult = (DownloadFileResult) other;
        return Intrinsics.areEqual(this.taskId, downloadFileResult.taskId) && this.progress == downloadFileResult.progress && Intrinsics.areEqual(this.state, downloadFileResult.state) && Intrinsics.areEqual(this.errMsg, downloadFileResult.errMsg) && Intrinsics.areEqual(this.filePath, downloadFileResult.filePath);
    }

    public int hashCode() {
        Integer num = this.taskId;
        int hashCode = (((num == null ? 0 : num.hashCode()) * 31) + Integer.hashCode(this.progress)) * 31;
        Integer num2 = this.state;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.errMsg;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.filePath;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DownloadFileResult(taskId=" + this.taskId + ", progress=" + this.progress + ", state=" + this.state + ", errMsg=" + this.errMsg + ", filePath=" + this.filePath + Separators.RPAREN;
    }

    public DownloadFileResult(Integer num, int i, Integer num2, String str, String str2) {
        this.taskId = num;
        this.progress = i;
        this.state = num2;
        this.errMsg = str;
        this.filePath = str2;
    }

    public /* synthetic */ DownloadFileResult(Integer num, int i, Integer num2, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : num2, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2);
    }

    public final Integer getTaskId() {
        return this.taskId;
    }

    public final void setTaskId(Integer num) {
        this.taskId = num;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final void setProgress(int i) {
        this.progress = i;
    }

    public final Integer getState() {
        return this.state;
    }

    public final void setState(Integer num) {
        this.state = num;
    }

    public final String getErrMsg() {
        return this.errMsg;
    }

    public final void setErrMsg(String str) {
        this.errMsg = str;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final void setFilePath(String str) {
        this.filePath = str;
    }
}
