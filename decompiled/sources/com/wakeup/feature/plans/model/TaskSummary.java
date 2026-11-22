package com.wakeup.feature.plans.model;

import android.gov.nist.core.Separators;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlansModels.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u000eHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jy\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010,\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u000bHÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u00060"}, d2 = {"Lcom/wakeup/feature/plans/model/TaskSummary;", "", "taskId", "", "templateId", "title", "icon", "displayEmoji", "frequency", "timeOfDay", "runCount", "", "status", "hasUnread", "", "updatedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;)V", "getTaskId", "()Ljava/lang/String;", "getTemplateId", "getTitle", "getIcon", "getDisplayEmoji", "getFrequency", "getTimeOfDay", "getRunCount", "()I", "getStatus", "getHasUnread", "()Z", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "feature-plans_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TaskSummary {
    private final String displayEmoji;
    private final String frequency;

    @SerializedName("hasUnread")
    private final boolean hasUnread;
    private final String icon;
    private final int runCount;
    private final String status;
    private final String taskId;
    private final String templateId;
    private final String timeOfDay;
    private final String title;
    private final String updatedAt;

    public TaskSummary() {
        this(null, null, null, null, null, null, null, 0, null, false, null, 2047, null);
    }

    public static /* synthetic */ TaskSummary copy$default(TaskSummary taskSummary, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, boolean z, String str9, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = taskSummary.taskId;
        }
        if ((i2 & 2) != 0) {
            str2 = taskSummary.templateId;
        }
        if ((i2 & 4) != 0) {
            str3 = taskSummary.title;
        }
        if ((i2 & 8) != 0) {
            str4 = taskSummary.icon;
        }
        if ((i2 & 16) != 0) {
            str5 = taskSummary.displayEmoji;
        }
        if ((i2 & 32) != 0) {
            str6 = taskSummary.frequency;
        }
        if ((i2 & 64) != 0) {
            str7 = taskSummary.timeOfDay;
        }
        if ((i2 & 128) != 0) {
            i = taskSummary.runCount;
        }
        if ((i2 & 256) != 0) {
            str8 = taskSummary.status;
        }
        if ((i2 & 512) != 0) {
            z = taskSummary.hasUnread;
        }
        if ((i2 & 1024) != 0) {
            str9 = taskSummary.updatedAt;
        }
        boolean z2 = z;
        String str10 = str9;
        int i3 = i;
        String str11 = str8;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return taskSummary.copy(str, str2, str15, str4, str14, str12, str13, i3, str11, z2, str10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getHasUnread() {
        return this.hasUnread;
    }

    /* renamed from: component11, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTemplateId() {
        return this.templateId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDisplayEmoji() {
        return this.displayEmoji;
    }

    /* renamed from: component6, reason: from getter */
    public final String getFrequency() {
        return this.frequency;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTimeOfDay() {
        return this.timeOfDay;
    }

    /* renamed from: component8, reason: from getter */
    public final int getRunCount() {
        return this.runCount;
    }

    /* renamed from: component9, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final TaskSummary copy(String taskId, String templateId, String title, String icon, String displayEmoji, String frequency, String timeOfDay, int runCount, String status, boolean hasUnread, String updatedAt) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(displayEmoji, "displayEmoji");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(timeOfDay, "timeOfDay");
        Intrinsics.checkNotNullParameter(status, "status");
        return new TaskSummary(taskId, templateId, title, icon, displayEmoji, frequency, timeOfDay, runCount, status, hasUnread, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaskSummary)) {
            return false;
        }
        TaskSummary taskSummary = (TaskSummary) other;
        return Intrinsics.areEqual(this.taskId, taskSummary.taskId) && Intrinsics.areEqual(this.templateId, taskSummary.templateId) && Intrinsics.areEqual(this.title, taskSummary.title) && Intrinsics.areEqual(this.icon, taskSummary.icon) && Intrinsics.areEqual(this.displayEmoji, taskSummary.displayEmoji) && Intrinsics.areEqual(this.frequency, taskSummary.frequency) && Intrinsics.areEqual(this.timeOfDay, taskSummary.timeOfDay) && this.runCount == taskSummary.runCount && Intrinsics.areEqual(this.status, taskSummary.status) && this.hasUnread == taskSummary.hasUnread && Intrinsics.areEqual(this.updatedAt, taskSummary.updatedAt);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((this.taskId.hashCode() * 31) + this.templateId.hashCode()) * 31) + this.title.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.displayEmoji.hashCode()) * 31) + this.frequency.hashCode()) * 31) + this.timeOfDay.hashCode()) * 31) + Integer.hashCode(this.runCount)) * 31) + this.status.hashCode()) * 31) + Boolean.hashCode(this.hasUnread)) * 31;
        String str = this.updatedAt;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "TaskSummary(taskId=" + this.taskId + ", templateId=" + this.templateId + ", title=" + this.title + ", icon=" + this.icon + ", displayEmoji=" + this.displayEmoji + ", frequency=" + this.frequency + ", timeOfDay=" + this.timeOfDay + ", runCount=" + this.runCount + ", status=" + this.status + ", hasUnread=" + this.hasUnread + ", updatedAt=" + this.updatedAt + Separators.RPAREN;
    }

    public TaskSummary(String taskId, String templateId, String title, String icon, String displayEmoji, String frequency, String timeOfDay, int i, String status, boolean z, String str) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(displayEmoji, "displayEmoji");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(timeOfDay, "timeOfDay");
        Intrinsics.checkNotNullParameter(status, "status");
        this.taskId = taskId;
        this.templateId = templateId;
        this.title = title;
        this.icon = icon;
        this.displayEmoji = displayEmoji;
        this.frequency = frequency;
        this.timeOfDay = timeOfDay;
        this.runCount = i;
        this.status = status;
        this.hasUnread = z;
        this.updatedAt = str;
    }

    public /* synthetic */ TaskSummary(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, boolean z, String str9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? "" : str8, (i2 & 512) != 0 ? false : z, (i2 & 1024) != 0 ? null : str9);
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getDisplayEmoji() {
        return this.displayEmoji;
    }

    public final String getFrequency() {
        return this.frequency;
    }

    public final String getTimeOfDay() {
        return this.timeOfDay;
    }

    public final int getRunCount() {
        return this.runCount;
    }

    public final String getStatus() {
        return this.status;
    }

    public final boolean getHasUnread() {
        return this.hasUnread;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }
}
