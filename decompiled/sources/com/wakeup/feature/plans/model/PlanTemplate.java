package com.wakeup.feature.plans.model;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlansModels.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\fHÆ\u0003J\t\u0010'\u001a\u00020\u000eHÆ\u0003Js\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u000eHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, d2 = {"Lcom/wakeup/feature/plans/model/PlanTemplate;", "", "templateId", "", "title", "icon", "displayEmoji", "summary", "defaultTime", "defaultFrequency", "defaultPromptHint", "supportedFrequencies", "", "sortOrder", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V", "getTemplateId", "()Ljava/lang/String;", "getTitle", "getIcon", "getDisplayEmoji", "getSummary", "getDefaultTime", "getDefaultFrequency", "getDefaultPromptHint", "getSupportedFrequencies", "()Ljava/util/List;", "getSortOrder", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "feature-plans_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PlanTemplate {
    private final String defaultFrequency;
    private final String defaultPromptHint;
    private final String defaultTime;
    private final String displayEmoji;
    private final String icon;
    private final int sortOrder;
    private final String summary;
    private final List<String> supportedFrequencies;
    private final String templateId;
    private final String title;

    public PlanTemplate() {
        this(null, null, null, null, null, null, null, null, null, 0, 1023, null);
    }

    public static /* synthetic */ PlanTemplate copy$default(PlanTemplate planTemplate, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = planTemplate.templateId;
        }
        if ((i2 & 2) != 0) {
            str2 = planTemplate.title;
        }
        if ((i2 & 4) != 0) {
            str3 = planTemplate.icon;
        }
        if ((i2 & 8) != 0) {
            str4 = planTemplate.displayEmoji;
        }
        if ((i2 & 16) != 0) {
            str5 = planTemplate.summary;
        }
        if ((i2 & 32) != 0) {
            str6 = planTemplate.defaultTime;
        }
        if ((i2 & 64) != 0) {
            str7 = planTemplate.defaultFrequency;
        }
        if ((i2 & 128) != 0) {
            str8 = planTemplate.defaultPromptHint;
        }
        if ((i2 & 256) != 0) {
            list = planTemplate.supportedFrequencies;
        }
        if ((i2 & 512) != 0) {
            i = planTemplate.sortOrder;
        }
        List list2 = list;
        int i3 = i;
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return planTemplate.copy(str, str2, str3, str4, str11, str12, str9, str10, list2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTemplateId() {
        return this.templateId;
    }

    /* renamed from: component10, reason: from getter */
    public final int getSortOrder() {
        return this.sortOrder;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDisplayEmoji() {
        return this.displayEmoji;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDefaultTime() {
        return this.defaultTime;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDefaultFrequency() {
        return this.defaultFrequency;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDefaultPromptHint() {
        return this.defaultPromptHint;
    }

    public final List<String> component9() {
        return this.supportedFrequencies;
    }

    public final PlanTemplate copy(String templateId, String title, String icon, String displayEmoji, String summary, String defaultTime, String defaultFrequency, String defaultPromptHint, List<String> supportedFrequencies, int sortOrder) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(displayEmoji, "displayEmoji");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(defaultTime, "defaultTime");
        Intrinsics.checkNotNullParameter(defaultFrequency, "defaultFrequency");
        Intrinsics.checkNotNullParameter(defaultPromptHint, "defaultPromptHint");
        Intrinsics.checkNotNullParameter(supportedFrequencies, "supportedFrequencies");
        return new PlanTemplate(templateId, title, icon, displayEmoji, summary, defaultTime, defaultFrequency, defaultPromptHint, supportedFrequencies, sortOrder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlanTemplate)) {
            return false;
        }
        PlanTemplate planTemplate = (PlanTemplate) other;
        return Intrinsics.areEqual(this.templateId, planTemplate.templateId) && Intrinsics.areEqual(this.title, planTemplate.title) && Intrinsics.areEqual(this.icon, planTemplate.icon) && Intrinsics.areEqual(this.displayEmoji, planTemplate.displayEmoji) && Intrinsics.areEqual(this.summary, planTemplate.summary) && Intrinsics.areEqual(this.defaultTime, planTemplate.defaultTime) && Intrinsics.areEqual(this.defaultFrequency, planTemplate.defaultFrequency) && Intrinsics.areEqual(this.defaultPromptHint, planTemplate.defaultPromptHint) && Intrinsics.areEqual(this.supportedFrequencies, planTemplate.supportedFrequencies) && this.sortOrder == planTemplate.sortOrder;
    }

    public int hashCode() {
        return (((((((((((((((((this.templateId.hashCode() * 31) + this.title.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.displayEmoji.hashCode()) * 31) + this.summary.hashCode()) * 31) + this.defaultTime.hashCode()) * 31) + this.defaultFrequency.hashCode()) * 31) + this.defaultPromptHint.hashCode()) * 31) + this.supportedFrequencies.hashCode()) * 31) + Integer.hashCode(this.sortOrder);
    }

    public String toString() {
        return "PlanTemplate(templateId=" + this.templateId + ", title=" + this.title + ", icon=" + this.icon + ", displayEmoji=" + this.displayEmoji + ", summary=" + this.summary + ", defaultTime=" + this.defaultTime + ", defaultFrequency=" + this.defaultFrequency + ", defaultPromptHint=" + this.defaultPromptHint + ", supportedFrequencies=" + this.supportedFrequencies + ", sortOrder=" + this.sortOrder + Separators.RPAREN;
    }

    public PlanTemplate(String templateId, String title, String icon, String displayEmoji, String summary, String defaultTime, String defaultFrequency, String defaultPromptHint, List<String> supportedFrequencies, int i) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(displayEmoji, "displayEmoji");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(defaultTime, "defaultTime");
        Intrinsics.checkNotNullParameter(defaultFrequency, "defaultFrequency");
        Intrinsics.checkNotNullParameter(defaultPromptHint, "defaultPromptHint");
        Intrinsics.checkNotNullParameter(supportedFrequencies, "supportedFrequencies");
        this.templateId = templateId;
        this.title = title;
        this.icon = icon;
        this.displayEmoji = displayEmoji;
        this.summary = summary;
        this.defaultTime = defaultTime;
        this.defaultFrequency = defaultFrequency;
        this.defaultPromptHint = defaultPromptHint;
        this.supportedFrequencies = supportedFrequencies;
        this.sortOrder = i;
    }

    public /* synthetic */ PlanTemplate(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? CollectionsKt.emptyList() : list, (i2 & 512) != 0 ? 0 : i);
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

    public final String getSummary() {
        return this.summary;
    }

    public final String getDefaultTime() {
        return this.defaultTime;
    }

    public final String getDefaultFrequency() {
        return this.defaultFrequency;
    }

    public final String getDefaultPromptHint() {
        return this.defaultPromptHint;
    }

    public final List<String> getSupportedFrequencies() {
        return this.supportedFrequencies;
    }

    public final int getSortOrder() {
        return this.sortOrder;
    }
}
