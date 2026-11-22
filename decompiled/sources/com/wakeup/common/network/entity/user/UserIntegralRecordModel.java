package com.wakeup.common.network.entity.user;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserIntegralRecordModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/wakeup/common/network/entity/user/UserIntegralRecordModel;", "", "appTime", "", "taskId", "", "taskName", "", "taskScore", "<init>", "(JILjava/lang/String;I)V", "getAppTime", "()J", "setAppTime", "(J)V", "getTaskId", "()I", "getTaskName", "()Ljava/lang/String;", "getTaskScore", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserIntegralRecordModel {
    private long appTime;
    private final int taskId;
    private final String taskName;
    private final int taskScore;

    public UserIntegralRecordModel() {
        this(0L, 0, null, 0, 15, null);
    }

    public static /* synthetic */ UserIntegralRecordModel copy$default(UserIntegralRecordModel userIntegralRecordModel, long j, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = userIntegralRecordModel.appTime;
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            i = userIntegralRecordModel.taskId;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            str = userIntegralRecordModel.taskName;
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            i2 = userIntegralRecordModel.taskScore;
        }
        return userIntegralRecordModel.copy(j2, i4, str2, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getAppTime() {
        return this.appTime;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTaskId() {
        return this.taskId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTaskName() {
        return this.taskName;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTaskScore() {
        return this.taskScore;
    }

    public final UserIntegralRecordModel copy(long appTime, int taskId, String taskName, int taskScore) {
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        return new UserIntegralRecordModel(appTime, taskId, taskName, taskScore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserIntegralRecordModel)) {
            return false;
        }
        UserIntegralRecordModel userIntegralRecordModel = (UserIntegralRecordModel) other;
        return this.appTime == userIntegralRecordModel.appTime && this.taskId == userIntegralRecordModel.taskId && Intrinsics.areEqual(this.taskName, userIntegralRecordModel.taskName) && this.taskScore == userIntegralRecordModel.taskScore;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.appTime) * 31) + Integer.hashCode(this.taskId)) * 31) + this.taskName.hashCode()) * 31) + Integer.hashCode(this.taskScore);
    }

    public String toString() {
        return "UserIntegralRecordModel(appTime=" + this.appTime + ", taskId=" + this.taskId + ", taskName=" + this.taskName + ", taskScore=" + this.taskScore + Separators.RPAREN;
    }

    public UserIntegralRecordModel(long j, int i, String taskName, int i2) {
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        this.appTime = j;
        this.taskId = i;
        this.taskName = taskName;
        this.taskScore = i2;
    }

    public final long getAppTime() {
        return this.appTime;
    }

    public final void setAppTime(long j) {
        this.appTime = j;
    }

    public final int getTaskId() {
        return this.taskId;
    }

    public /* synthetic */ UserIntegralRecordModel(long j, int i, String str, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? 0 : i2);
    }

    public final String getTaskName() {
        return this.taskName;
    }

    public final int getTaskScore() {
        return this.taskScore;
    }
}
