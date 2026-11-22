package com.wakeup.feature.plans.model;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import androidx.compose.ui.layout.LayoutKt;
import com.iflytek.cloud.SpeechConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlansModels.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B£\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0010HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¥\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u0010HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016¨\u0006;"}, d2 = {"Lcom/wakeup/feature/plans/model/TaskMeta;", "", "taskId", "", "templateId", "title", "icon", "displayEmoji", "frequency", "timeOfDay", SDPKeywords.PROMPT, "city", SpeechConstant.ISE_CATEGORY, "status", "nextRunAt", "runCount", "", "createdAt", "updatedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getTaskId", "()Ljava/lang/String;", "getTemplateId", "getTitle", "getIcon", "getDisplayEmoji", "getFrequency", "getTimeOfDay", "getPrompt", "getCity", "getCategory", "getStatus", "getNextRunAt", "getRunCount", "()I", "getCreatedAt", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "", "other", "hashCode", "toString", "feature-plans_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TaskMeta {
    private final String category;
    private final String city;
    private final String createdAt;
    private final String displayEmoji;
    private final String frequency;
    private final String icon;
    private final String nextRunAt;
    private final String prompt;
    private final int runCount;
    private final String status;
    private final String taskId;
    private final String templateId;
    private final String timeOfDay;
    private final String title;
    private final String updatedAt;

    public TaskMeta() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, LayoutKt.LargeDimension, null);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* renamed from: component11, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component12, reason: from getter */
    public final String getNextRunAt() {
        return this.nextRunAt;
    }

    /* renamed from: component13, reason: from getter */
    public final int getRunCount() {
        return this.runCount;
    }

    /* renamed from: component14, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component15, reason: from getter */
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
    public final String getPrompt() {
        return this.prompt;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    public final TaskMeta copy(String taskId, String templateId, String title, String icon, String displayEmoji, String frequency, String timeOfDay, String prompt, String city, String category, String status, String nextRunAt, int runCount, String createdAt, String updatedAt) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(displayEmoji, "displayEmoji");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(timeOfDay, "timeOfDay");
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(status, "status");
        return new TaskMeta(taskId, templateId, title, icon, displayEmoji, frequency, timeOfDay, prompt, city, category, status, nextRunAt, runCount, createdAt, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaskMeta)) {
            return false;
        }
        TaskMeta taskMeta = (TaskMeta) other;
        return Intrinsics.areEqual(this.taskId, taskMeta.taskId) && Intrinsics.areEqual(this.templateId, taskMeta.templateId) && Intrinsics.areEqual(this.title, taskMeta.title) && Intrinsics.areEqual(this.icon, taskMeta.icon) && Intrinsics.areEqual(this.displayEmoji, taskMeta.displayEmoji) && Intrinsics.areEqual(this.frequency, taskMeta.frequency) && Intrinsics.areEqual(this.timeOfDay, taskMeta.timeOfDay) && Intrinsics.areEqual(this.prompt, taskMeta.prompt) && Intrinsics.areEqual(this.city, taskMeta.city) && Intrinsics.areEqual(this.category, taskMeta.category) && Intrinsics.areEqual(this.status, taskMeta.status) && Intrinsics.areEqual(this.nextRunAt, taskMeta.nextRunAt) && this.runCount == taskMeta.runCount && Intrinsics.areEqual(this.createdAt, taskMeta.createdAt) && Intrinsics.areEqual(this.updatedAt, taskMeta.updatedAt);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((this.taskId.hashCode() * 31) + this.templateId.hashCode()) * 31) + this.title.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.displayEmoji.hashCode()) * 31) + this.frequency.hashCode()) * 31) + this.timeOfDay.hashCode()) * 31) + this.prompt.hashCode()) * 31) + this.city.hashCode()) * 31) + this.category.hashCode()) * 31) + this.status.hashCode()) * 31;
        String str = this.nextRunAt;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.runCount)) * 31;
        String str2 = this.createdAt;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.updatedAt;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "TaskMeta(taskId=" + this.taskId + ", templateId=" + this.templateId + ", title=" + this.title + ", icon=" + this.icon + ", displayEmoji=" + this.displayEmoji + ", frequency=" + this.frequency + ", timeOfDay=" + this.timeOfDay + ", prompt=" + this.prompt + ", city=" + this.city + ", category=" + this.category + ", status=" + this.status + ", nextRunAt=" + this.nextRunAt + ", runCount=" + this.runCount + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + Separators.RPAREN;
    }

    public TaskMeta(String taskId, String templateId, String title, String icon, String displayEmoji, String frequency, String timeOfDay, String prompt, String city, String category, String status, String str, int i, String str2, String str3) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(displayEmoji, "displayEmoji");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(timeOfDay, "timeOfDay");
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(status, "status");
        this.taskId = taskId;
        this.templateId = templateId;
        this.title = title;
        this.icon = icon;
        this.displayEmoji = displayEmoji;
        this.frequency = frequency;
        this.timeOfDay = timeOfDay;
        this.prompt = prompt;
        this.city = city;
        this.category = category;
        this.status = status;
        this.nextRunAt = str;
        this.runCount = i;
        this.createdAt = str2;
        this.updatedAt = str3;
    }

    public /* synthetic */ TaskMeta(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, String str13, String str14, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? "" : str9, (i2 & 512) != 0 ? "" : str10, (i2 & 1024) == 0 ? str11 : "", (i2 & 2048) != 0 ? null : str12, (i2 & 4096) != 0 ? 0 : i, (i2 & 8192) != 0 ? null : str13, (i2 & 16384) != 0 ? null : str14);
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

    public final String getPrompt() {
        return this.prompt;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getNextRunAt() {
        return this.nextRunAt;
    }

    public final int getRunCount() {
        return this.runCount;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }
}
