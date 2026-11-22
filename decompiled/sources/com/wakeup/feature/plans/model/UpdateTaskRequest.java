package com.wakeup.feature.plans.model;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import com.iflytek.cloud.SpeechConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlansModels.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/wakeup/feature/plans/model/UpdateTaskRequest;", "", "title", "", "timeOfDay", "frequency", SDPKeywords.PROMPT, "city", SpeechConstant.ISE_CATEGORY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getTimeOfDay", "getFrequency", "getPrompt", "getCity", "getCategory", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-plans_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UpdateTaskRequest {
    private final String category;
    private final String city;
    private final String frequency;
    private final String prompt;
    private final String timeOfDay;
    private final String title;

    public UpdateTaskRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ UpdateTaskRequest copy$default(UpdateTaskRequest updateTaskRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateTaskRequest.title;
        }
        if ((i & 2) != 0) {
            str2 = updateTaskRequest.timeOfDay;
        }
        if ((i & 4) != 0) {
            str3 = updateTaskRequest.frequency;
        }
        if ((i & 8) != 0) {
            str4 = updateTaskRequest.prompt;
        }
        if ((i & 16) != 0) {
            str5 = updateTaskRequest.city;
        }
        if ((i & 32) != 0) {
            str6 = updateTaskRequest.category;
        }
        String str7 = str5;
        String str8 = str6;
        return updateTaskRequest.copy(str, str2, str3, str4, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTimeOfDay() {
        return this.timeOfDay;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFrequency() {
        return this.frequency;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPrompt() {
        return this.prompt;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    public final UpdateTaskRequest copy(String title, String timeOfDay, String frequency, String prompt, String city, String category) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(timeOfDay, "timeOfDay");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(category, "category");
        return new UpdateTaskRequest(title, timeOfDay, frequency, prompt, city, category);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateTaskRequest)) {
            return false;
        }
        UpdateTaskRequest updateTaskRequest = (UpdateTaskRequest) other;
        return Intrinsics.areEqual(this.title, updateTaskRequest.title) && Intrinsics.areEqual(this.timeOfDay, updateTaskRequest.timeOfDay) && Intrinsics.areEqual(this.frequency, updateTaskRequest.frequency) && Intrinsics.areEqual(this.prompt, updateTaskRequest.prompt) && Intrinsics.areEqual(this.city, updateTaskRequest.city) && Intrinsics.areEqual(this.category, updateTaskRequest.category);
    }

    public int hashCode() {
        return (((((((((this.title.hashCode() * 31) + this.timeOfDay.hashCode()) * 31) + this.frequency.hashCode()) * 31) + this.prompt.hashCode()) * 31) + this.city.hashCode()) * 31) + this.category.hashCode();
    }

    public String toString() {
        return "UpdateTaskRequest(title=" + this.title + ", timeOfDay=" + this.timeOfDay + ", frequency=" + this.frequency + ", prompt=" + this.prompt + ", city=" + this.city + ", category=" + this.category + Separators.RPAREN;
    }

    public UpdateTaskRequest(String title, String timeOfDay, String frequency, String prompt, String city, String category) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(timeOfDay, "timeOfDay");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(category, "category");
        this.title = title;
        this.timeOfDay = timeOfDay;
        this.frequency = frequency;
        this.prompt = prompt;
        this.city = city;
        this.category = category;
    }

    public /* synthetic */ UpdateTaskRequest(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTimeOfDay() {
        return this.timeOfDay;
    }

    public final String getFrequency() {
        return this.frequency;
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
}
