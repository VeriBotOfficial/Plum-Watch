package com.wakeup.feature.plans.model;

import android.gov.nist.core.Separators;
import com.facebook.react.uimanager.ViewProps;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlansModels.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J]\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016¨\u0006%"}, d2 = {"Lcom/wakeup/feature/plans/model/PlanMessage;", "", "messageId", "", ViewProps.ROLE, "text", "recordTitle", "recordTag", "source", "createdAt", "isNew", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getMessageId", "()Ljava/lang/String;", "getRole", "getText", "getRecordTitle", "getRecordTag", "getSource", "getCreatedAt", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-plans_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PlanMessage {
    private final String createdAt;

    @SerializedName("isNew")
    private final boolean isNew;
    private final String messageId;
    private final String recordTag;
    private final String recordTitle;
    private final String role;
    private final String source;
    private final String text;

    public PlanMessage() {
        this(null, null, null, null, null, null, null, false, 255, null);
    }

    public static /* synthetic */ PlanMessage copy$default(PlanMessage planMessage, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = planMessage.messageId;
        }
        if ((i & 2) != 0) {
            str2 = planMessage.role;
        }
        if ((i & 4) != 0) {
            str3 = planMessage.text;
        }
        if ((i & 8) != 0) {
            str4 = planMessage.recordTitle;
        }
        if ((i & 16) != 0) {
            str5 = planMessage.recordTag;
        }
        if ((i & 32) != 0) {
            str6 = planMessage.source;
        }
        if ((i & 64) != 0) {
            str7 = planMessage.createdAt;
        }
        if ((i & 128) != 0) {
            z = planMessage.isNew;
        }
        String str8 = str7;
        boolean z2 = z;
        String str9 = str5;
        String str10 = str6;
        return planMessage.copy(str, str2, str3, str4, str9, str10, str8, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRecordTitle() {
        return this.recordTitle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRecordTag() {
        return this.recordTag;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsNew() {
        return this.isNew;
    }

    public final PlanMessage copy(String messageId, String role, String text, String recordTitle, String recordTag, String source, String createdAt, boolean isNew) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(recordTitle, "recordTitle");
        Intrinsics.checkNotNullParameter(recordTag, "recordTag");
        return new PlanMessage(messageId, role, text, recordTitle, recordTag, source, createdAt, isNew);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlanMessage)) {
            return false;
        }
        PlanMessage planMessage = (PlanMessage) other;
        return Intrinsics.areEqual(this.messageId, planMessage.messageId) && Intrinsics.areEqual(this.role, planMessage.role) && Intrinsics.areEqual(this.text, planMessage.text) && Intrinsics.areEqual(this.recordTitle, planMessage.recordTitle) && Intrinsics.areEqual(this.recordTag, planMessage.recordTag) && Intrinsics.areEqual(this.source, planMessage.source) && Intrinsics.areEqual(this.createdAt, planMessage.createdAt) && this.isNew == planMessage.isNew;
    }

    public int hashCode() {
        int hashCode = ((((((((this.messageId.hashCode() * 31) + this.role.hashCode()) * 31) + this.text.hashCode()) * 31) + this.recordTitle.hashCode()) * 31) + this.recordTag.hashCode()) * 31;
        String str = this.source;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.createdAt;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isNew);
    }

    public String toString() {
        return "PlanMessage(messageId=" + this.messageId + ", role=" + this.role + ", text=" + this.text + ", recordTitle=" + this.recordTitle + ", recordTag=" + this.recordTag + ", source=" + this.source + ", createdAt=" + this.createdAt + ", isNew=" + this.isNew + Separators.RPAREN;
    }

    public PlanMessage(String messageId, String role, String text, String recordTitle, String recordTag, String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(recordTitle, "recordTitle");
        Intrinsics.checkNotNullParameter(recordTag, "recordTag");
        this.messageId = messageId;
        this.role = role;
        this.text = text;
        this.recordTitle = recordTitle;
        this.recordTag = recordTag;
        this.source = str;
        this.createdAt = str2;
        this.isNew = z;
    }

    public /* synthetic */ PlanMessage(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? false : z);
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getRole() {
        return this.role;
    }

    public final String getText() {
        return this.text;
    }

    public final String getRecordTitle() {
        return this.recordTitle;
    }

    public final String getRecordTag() {
        return this.recordTag;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final boolean isNew() {
        return this.isNew;
    }
}
