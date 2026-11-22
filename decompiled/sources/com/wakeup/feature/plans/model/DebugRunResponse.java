package com.wakeup.feature.plans.model;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlansModels.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006$"}, d2 = {"Lcom/wakeup/feature/plans/model/DebugRunResponse;", "", "text", "", "latencyMs", "", "templateId", "title", "frequency", "timeOfDay", SDPKeywords.PROMPT, "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getLatencyMs", "()J", "getTemplateId", "getTitle", "getFrequency", "getTimeOfDay", "getPrompt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-plans_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DebugRunResponse {
    private final String frequency;
    private final long latencyMs;
    private final String prompt;
    private final String templateId;
    private final String text;
    private final String timeOfDay;
    private final String title;

    public DebugRunResponse() {
        this(null, 0L, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ DebugRunResponse copy$default(DebugRunResponse debugRunResponse, String str, long j, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = debugRunResponse.text;
        }
        if ((i & 2) != 0) {
            j = debugRunResponse.latencyMs;
        }
        if ((i & 4) != 0) {
            str2 = debugRunResponse.templateId;
        }
        if ((i & 8) != 0) {
            str3 = debugRunResponse.title;
        }
        if ((i & 16) != 0) {
            str4 = debugRunResponse.frequency;
        }
        if ((i & 32) != 0) {
            str5 = debugRunResponse.timeOfDay;
        }
        if ((i & 64) != 0) {
            str6 = debugRunResponse.prompt;
        }
        String str7 = str6;
        String str8 = str4;
        String str9 = str2;
        return debugRunResponse.copy(str, j, str9, str3, str8, str5, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final long getLatencyMs() {
        return this.latencyMs;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTemplateId() {
        return this.templateId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFrequency() {
        return this.frequency;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTimeOfDay() {
        return this.timeOfDay;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPrompt() {
        return this.prompt;
    }

    public final DebugRunResponse copy(String text, long latencyMs, String templateId, String title, String frequency, String timeOfDay, String prompt) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(timeOfDay, "timeOfDay");
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        return new DebugRunResponse(text, latencyMs, templateId, title, frequency, timeOfDay, prompt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DebugRunResponse)) {
            return false;
        }
        DebugRunResponse debugRunResponse = (DebugRunResponse) other;
        return Intrinsics.areEqual(this.text, debugRunResponse.text) && this.latencyMs == debugRunResponse.latencyMs && Intrinsics.areEqual(this.templateId, debugRunResponse.templateId) && Intrinsics.areEqual(this.title, debugRunResponse.title) && Intrinsics.areEqual(this.frequency, debugRunResponse.frequency) && Intrinsics.areEqual(this.timeOfDay, debugRunResponse.timeOfDay) && Intrinsics.areEqual(this.prompt, debugRunResponse.prompt);
    }

    public int hashCode() {
        return (((((((((((this.text.hashCode() * 31) + Long.hashCode(this.latencyMs)) * 31) + this.templateId.hashCode()) * 31) + this.title.hashCode()) * 31) + this.frequency.hashCode()) * 31) + this.timeOfDay.hashCode()) * 31) + this.prompt.hashCode();
    }

    public String toString() {
        return "DebugRunResponse(text=" + this.text + ", latencyMs=" + this.latencyMs + ", templateId=" + this.templateId + ", title=" + this.title + ", frequency=" + this.frequency + ", timeOfDay=" + this.timeOfDay + ", prompt=" + this.prompt + Separators.RPAREN;
    }

    public DebugRunResponse(String text, long j, String templateId, String title, String frequency, String timeOfDay, String prompt) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(timeOfDay, "timeOfDay");
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        this.text = text;
        this.latencyMs = j;
        this.templateId = templateId;
        this.title = title;
        this.frequency = frequency;
        this.timeOfDay = timeOfDay;
        this.prompt = prompt;
    }

    public /* synthetic */ DebugRunResponse(String str, long j, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6);
    }

    public final String getText() {
        return this.text;
    }

    public final long getLatencyMs() {
        return this.latencyMs;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public final String getTitle() {
        return this.title;
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
}
