package com.wakeup.common.network.entity.meeting;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MeetingBean.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/network/entity/meeting/CreateMeetingSummaryBean;", "", "content", "", "ruleContentType", "", "chargeTotal", "languageId", "<init>", "(Ljava/lang/String;III)V", "getContent", "()Ljava/lang/String;", "getRuleContentType", "()I", "getChargeTotal", "getLanguageId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CreateMeetingSummaryBean {
    private final int chargeTotal;
    private final String content;
    private final int languageId;
    private final int ruleContentType;

    public static /* synthetic */ CreateMeetingSummaryBean copy$default(CreateMeetingSummaryBean createMeetingSummaryBean, String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = createMeetingSummaryBean.content;
        }
        if ((i4 & 2) != 0) {
            i = createMeetingSummaryBean.ruleContentType;
        }
        if ((i4 & 4) != 0) {
            i2 = createMeetingSummaryBean.chargeTotal;
        }
        if ((i4 & 8) != 0) {
            i3 = createMeetingSummaryBean.languageId;
        }
        return createMeetingSummaryBean.copy(str, i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRuleContentType() {
        return this.ruleContentType;
    }

    /* renamed from: component3, reason: from getter */
    public final int getChargeTotal() {
        return this.chargeTotal;
    }

    /* renamed from: component4, reason: from getter */
    public final int getLanguageId() {
        return this.languageId;
    }

    public final CreateMeetingSummaryBean copy(String content, int ruleContentType, int chargeTotal, int languageId) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new CreateMeetingSummaryBean(content, ruleContentType, chargeTotal, languageId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateMeetingSummaryBean)) {
            return false;
        }
        CreateMeetingSummaryBean createMeetingSummaryBean = (CreateMeetingSummaryBean) other;
        return Intrinsics.areEqual(this.content, createMeetingSummaryBean.content) && this.ruleContentType == createMeetingSummaryBean.ruleContentType && this.chargeTotal == createMeetingSummaryBean.chargeTotal && this.languageId == createMeetingSummaryBean.languageId;
    }

    public int hashCode() {
        return (((((this.content.hashCode() * 31) + Integer.hashCode(this.ruleContentType)) * 31) + Integer.hashCode(this.chargeTotal)) * 31) + Integer.hashCode(this.languageId);
    }

    public String toString() {
        return "CreateMeetingSummaryBean(content=" + this.content + ", ruleContentType=" + this.ruleContentType + ", chargeTotal=" + this.chargeTotal + ", languageId=" + this.languageId + Separators.RPAREN;
    }

    public CreateMeetingSummaryBean(String content, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
        this.ruleContentType = i;
        this.chargeTotal = i2;
        this.languageId = i3;
    }

    public /* synthetic */ CreateMeetingSummaryBean(String str, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? 1 : i, (i4 & 4) != 0 ? 1 : i2, i3);
    }

    public final String getContent() {
        return this.content;
    }

    public final int getRuleContentType() {
        return this.ruleContentType;
    }

    public final int getChargeTotal() {
        return this.chargeTotal;
    }

    public final int getLanguageId() {
        return this.languageId;
    }
}
