package com.wakeup.common.network.entity.meeting;

import android.gov.nist.core.Separators;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MeetingBean.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006#"}, d2 = {"Lcom/wakeup/common/network/entity/meeting/CreateSummaryBean;", "", "summaryText", "", "originalLanguageSummaryText", "cacheTraceId", "summaryLanguageId", "", "textLanguageId", "firmwareOriginalSummaryText", "firmwareSummaryText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "getSummaryText", "()Ljava/lang/String;", "getOriginalLanguageSummaryText", "getCacheTraceId", "getSummaryLanguageId", "()I", "getTextLanguageId", "getFirmwareOriginalSummaryText", "getFirmwareSummaryText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CreateSummaryBean {
    private final String cacheTraceId;
    private final String firmwareOriginalSummaryText;
    private final String firmwareSummaryText;
    private final String originalLanguageSummaryText;
    private final int summaryLanguageId;
    private final String summaryText;

    @SerializedName(alternate = {"TextLanguageId"}, value = "textLanguageId")
    private final int textLanguageId;

    public CreateSummaryBean() {
        this(null, null, null, 0, 0, null, null, 127, null);
    }

    public static /* synthetic */ CreateSummaryBean copy$default(CreateSummaryBean createSummaryBean, String str, String str2, String str3, int i, int i2, String str4, String str5, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = createSummaryBean.summaryText;
        }
        if ((i3 & 2) != 0) {
            str2 = createSummaryBean.originalLanguageSummaryText;
        }
        if ((i3 & 4) != 0) {
            str3 = createSummaryBean.cacheTraceId;
        }
        if ((i3 & 8) != 0) {
            i = createSummaryBean.summaryLanguageId;
        }
        if ((i3 & 16) != 0) {
            i2 = createSummaryBean.textLanguageId;
        }
        if ((i3 & 32) != 0) {
            str4 = createSummaryBean.firmwareOriginalSummaryText;
        }
        if ((i3 & 64) != 0) {
            str5 = createSummaryBean.firmwareSummaryText;
        }
        String str6 = str4;
        String str7 = str5;
        int i4 = i2;
        String str8 = str3;
        return createSummaryBean.copy(str, str2, str8, i, i4, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSummaryText() {
        return this.summaryText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOriginalLanguageSummaryText() {
        return this.originalLanguageSummaryText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCacheTraceId() {
        return this.cacheTraceId;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSummaryLanguageId() {
        return this.summaryLanguageId;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTextLanguageId() {
        return this.textLanguageId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getFirmwareOriginalSummaryText() {
        return this.firmwareOriginalSummaryText;
    }

    /* renamed from: component7, reason: from getter */
    public final String getFirmwareSummaryText() {
        return this.firmwareSummaryText;
    }

    public final CreateSummaryBean copy(String summaryText, String originalLanguageSummaryText, String cacheTraceId, int summaryLanguageId, int textLanguageId, String firmwareOriginalSummaryText, String firmwareSummaryText) {
        Intrinsics.checkNotNullParameter(summaryText, "summaryText");
        Intrinsics.checkNotNullParameter(originalLanguageSummaryText, "originalLanguageSummaryText");
        Intrinsics.checkNotNullParameter(cacheTraceId, "cacheTraceId");
        Intrinsics.checkNotNullParameter(firmwareOriginalSummaryText, "firmwareOriginalSummaryText");
        Intrinsics.checkNotNullParameter(firmwareSummaryText, "firmwareSummaryText");
        return new CreateSummaryBean(summaryText, originalLanguageSummaryText, cacheTraceId, summaryLanguageId, textLanguageId, firmwareOriginalSummaryText, firmwareSummaryText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateSummaryBean)) {
            return false;
        }
        CreateSummaryBean createSummaryBean = (CreateSummaryBean) other;
        return Intrinsics.areEqual(this.summaryText, createSummaryBean.summaryText) && Intrinsics.areEqual(this.originalLanguageSummaryText, createSummaryBean.originalLanguageSummaryText) && Intrinsics.areEqual(this.cacheTraceId, createSummaryBean.cacheTraceId) && this.summaryLanguageId == createSummaryBean.summaryLanguageId && this.textLanguageId == createSummaryBean.textLanguageId && Intrinsics.areEqual(this.firmwareOriginalSummaryText, createSummaryBean.firmwareOriginalSummaryText) && Intrinsics.areEqual(this.firmwareSummaryText, createSummaryBean.firmwareSummaryText);
    }

    public int hashCode() {
        return (((((((((((this.summaryText.hashCode() * 31) + this.originalLanguageSummaryText.hashCode()) * 31) + this.cacheTraceId.hashCode()) * 31) + Integer.hashCode(this.summaryLanguageId)) * 31) + Integer.hashCode(this.textLanguageId)) * 31) + this.firmwareOriginalSummaryText.hashCode()) * 31) + this.firmwareSummaryText.hashCode();
    }

    public String toString() {
        return "CreateSummaryBean(summaryText=" + this.summaryText + ", originalLanguageSummaryText=" + this.originalLanguageSummaryText + ", cacheTraceId=" + this.cacheTraceId + ", summaryLanguageId=" + this.summaryLanguageId + ", textLanguageId=" + this.textLanguageId + ", firmwareOriginalSummaryText=" + this.firmwareOriginalSummaryText + ", firmwareSummaryText=" + this.firmwareSummaryText + Separators.RPAREN;
    }

    public CreateSummaryBean(String summaryText, String originalLanguageSummaryText, String cacheTraceId, int i, int i2, String firmwareOriginalSummaryText, String firmwareSummaryText) {
        Intrinsics.checkNotNullParameter(summaryText, "summaryText");
        Intrinsics.checkNotNullParameter(originalLanguageSummaryText, "originalLanguageSummaryText");
        Intrinsics.checkNotNullParameter(cacheTraceId, "cacheTraceId");
        Intrinsics.checkNotNullParameter(firmwareOriginalSummaryText, "firmwareOriginalSummaryText");
        Intrinsics.checkNotNullParameter(firmwareSummaryText, "firmwareSummaryText");
        this.summaryText = summaryText;
        this.originalLanguageSummaryText = originalLanguageSummaryText;
        this.cacheTraceId = cacheTraceId;
        this.summaryLanguageId = i;
        this.textLanguageId = i2;
        this.firmwareOriginalSummaryText = firmwareOriginalSummaryText;
        this.firmwareSummaryText = firmwareSummaryText;
    }

    public /* synthetic */ CreateSummaryBean(String str, String str2, String str3, int i, int i2, String str4, String str5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? "" : str5);
    }

    public final String getSummaryText() {
        return this.summaryText;
    }

    public final String getOriginalLanguageSummaryText() {
        return this.originalLanguageSummaryText;
    }

    public final String getCacheTraceId() {
        return this.cacheTraceId;
    }

    public final int getSummaryLanguageId() {
        return this.summaryLanguageId;
    }

    public final int getTextLanguageId() {
        return this.textLanguageId;
    }

    public final String getFirmwareOriginalSummaryText() {
        return this.firmwareOriginalSummaryText;
    }

    public final String getFirmwareSummaryText() {
        return this.firmwareSummaryText;
    }
}
