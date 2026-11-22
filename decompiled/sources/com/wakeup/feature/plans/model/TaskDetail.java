package com.wakeup.feature.plans.model;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import com.iflytek.cloud.SpeechConstant;
import io.nats.client.support.ApiConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlansModels.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B³\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0010HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003Jµ\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0001J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\u0010HÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006A"}, d2 = {"Lcom/wakeup/feature/plans/model/TaskDetail;", "", "taskId", "", "templateId", "title", "icon", "displayEmoji", "frequency", "timeOfDay", SDPKeywords.PROMPT, "city", SpeechConstant.ISE_CATEGORY, "status", "nextRunAt", "runCount", "", "createdAt", "updatedAt", ApiConstants.MESSAGES, "", "Lcom/wakeup/feature/plans/model/PlanMessage;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTaskId", "()Ljava/lang/String;", "getTemplateId", "getTitle", "getIcon", "getDisplayEmoji", "getFrequency", "getTimeOfDay", "getPrompt", "getCity", "getCategory", "getStatus", "getNextRunAt", "getRunCount", "()I", "getCreatedAt", "getUpdatedAt", "getMessages", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "", "other", "hashCode", "toString", "feature-plans_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TaskDetail {
    private final String category;
    private final String city;
    private final String createdAt;
    private final String displayEmoji;
    private final String frequency;
    private final String icon;
    private final List<PlanMessage> messages;
    private final String nextRunAt;
    private final String prompt;
    private final int runCount;
    private final String status;
    private final String taskId;
    private final String templateId;
    private final String timeOfDay;
    private final String title;
    private final String updatedAt;

    public TaskDetail() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, 65535, null);
    }

    public static /* synthetic */ TaskDetail copy$default(TaskDetail taskDetail, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, String str13, String str14, List list, int i2, Object obj) {
        String str15 = (i2 & 1) != 0 ? taskDetail.taskId : str;
        return taskDetail.copy(str15, (i2 & 2) != 0 ? taskDetail.templateId : str2, (i2 & 4) != 0 ? taskDetail.title : str3, (i2 & 8) != 0 ? taskDetail.icon : str4, (i2 & 16) != 0 ? taskDetail.displayEmoji : str5, (i2 & 32) != 0 ? taskDetail.frequency : str6, (i2 & 64) != 0 ? taskDetail.timeOfDay : str7, (i2 & 128) != 0 ? taskDetail.prompt : str8, (i2 & 256) != 0 ? taskDetail.city : str9, (i2 & 512) != 0 ? taskDetail.category : str10, (i2 & 1024) != 0 ? taskDetail.status : str11, (i2 & 2048) != 0 ? taskDetail.nextRunAt : str12, (i2 & 4096) != 0 ? taskDetail.runCount : i, (i2 & 8192) != 0 ? taskDetail.createdAt : str13, (i2 & 16384) != 0 ? taskDetail.updatedAt : str14, (i2 & 32768) != 0 ? taskDetail.messages : list);
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

    public final List<PlanMessage> component16() {
        return this.messages;
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

    public final TaskDetail copy(String taskId, String templateId, String title, String icon, String displayEmoji, String frequency, String timeOfDay, String prompt, String city, String category, String status, String nextRunAt, int runCount, String createdAt, String updatedAt, List<PlanMessage> messages) {
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
        Intrinsics.checkNotNullParameter(messages, "messages");
        return new TaskDetail(taskId, templateId, title, icon, displayEmoji, frequency, timeOfDay, prompt, city, category, status, nextRunAt, runCount, createdAt, updatedAt, messages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaskDetail)) {
            return false;
        }
        TaskDetail taskDetail = (TaskDetail) other;
        return Intrinsics.areEqual(this.taskId, taskDetail.taskId) && Intrinsics.areEqual(this.templateId, taskDetail.templateId) && Intrinsics.areEqual(this.title, taskDetail.title) && Intrinsics.areEqual(this.icon, taskDetail.icon) && Intrinsics.areEqual(this.displayEmoji, taskDetail.displayEmoji) && Intrinsics.areEqual(this.frequency, taskDetail.frequency) && Intrinsics.areEqual(this.timeOfDay, taskDetail.timeOfDay) && Intrinsics.areEqual(this.prompt, taskDetail.prompt) && Intrinsics.areEqual(this.city, taskDetail.city) && Intrinsics.areEqual(this.category, taskDetail.category) && Intrinsics.areEqual(this.status, taskDetail.status) && Intrinsics.areEqual(this.nextRunAt, taskDetail.nextRunAt) && this.runCount == taskDetail.runCount && Intrinsics.areEqual(this.createdAt, taskDetail.createdAt) && Intrinsics.areEqual(this.updatedAt, taskDetail.updatedAt) && Intrinsics.areEqual(this.messages, taskDetail.messages);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((this.taskId.hashCode() * 31) + this.templateId.hashCode()) * 31) + this.title.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.displayEmoji.hashCode()) * 31) + this.frequency.hashCode()) * 31) + this.timeOfDay.hashCode()) * 31) + this.prompt.hashCode()) * 31) + this.city.hashCode()) * 31) + this.category.hashCode()) * 31) + this.status.hashCode()) * 31;
        String str = this.nextRunAt;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.runCount)) * 31;
        String str2 = this.createdAt;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.updatedAt;
        return ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.messages.hashCode();
    }

    public String toString() {
        return "TaskDetail(taskId=" + this.taskId + ", templateId=" + this.templateId + ", title=" + this.title + ", icon=" + this.icon + ", displayEmoji=" + this.displayEmoji + ", frequency=" + this.frequency + ", timeOfDay=" + this.timeOfDay + ", prompt=" + this.prompt + ", city=" + this.city + ", category=" + this.category + ", status=" + this.status + ", nextRunAt=" + this.nextRunAt + ", runCount=" + this.runCount + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", messages=" + this.messages + Separators.RPAREN;
    }

    public TaskDetail(String taskId, String templateId, String title, String icon, String displayEmoji, String frequency, String timeOfDay, String prompt, String city, String category, String status, String str, int i, String str2, String str3, List<PlanMessage> messages) {
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
        Intrinsics.checkNotNullParameter(messages, "messages");
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
        this.messages = messages;
    }

    public /* synthetic */ TaskDetail(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, String str13, String str14, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? "" : str9, (i2 & 512) != 0 ? "" : str10, (i2 & 1024) == 0 ? str11 : "", (i2 & 2048) != 0 ? null : str12, (i2 & 4096) != 0 ? 0 : i, (i2 & 8192) != 0 ? null : str13, (i2 & 16384) != 0 ? null : str14, (i2 & 32768) != 0 ? CollectionsKt.emptyList() : list);
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

    public final List<PlanMessage> getMessages() {
        return this.messages;
    }
}
