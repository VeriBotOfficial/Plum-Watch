package com.wakeup.common.network.entity.meeting;

import android.gov.nist.core.Separators;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MeetingBean.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/wakeup/common/network/entity/meeting/SummaryTextReq;", "", "textLanguageId", "", "text", "", "summaryLanguageId", "cacheTraceId", "version", "firmwareFlag", "", "<init>", "(ILjava/lang/String;ILjava/lang/String;IZ)V", "getTextLanguageId", "()I", "getText", "()Ljava/lang/String;", "getSummaryLanguageId", "getCacheTraceId", MobileAdsBridge.versionMethodName, "getFirmwareFlag", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SummaryTextReq {
    private final String cacheTraceId;
    private final boolean firmwareFlag;
    private final int summaryLanguageId;
    private final String text;
    private final int textLanguageId;
    private final int version;

    public static /* synthetic */ SummaryTextReq copy$default(SummaryTextReq summaryTextReq, int i, String str, int i2, String str2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = summaryTextReq.textLanguageId;
        }
        if ((i4 & 2) != 0) {
            str = summaryTextReq.text;
        }
        if ((i4 & 4) != 0) {
            i2 = summaryTextReq.summaryLanguageId;
        }
        if ((i4 & 8) != 0) {
            str2 = summaryTextReq.cacheTraceId;
        }
        if ((i4 & 16) != 0) {
            i3 = summaryTextReq.version;
        }
        if ((i4 & 32) != 0) {
            z = summaryTextReq.firmwareFlag;
        }
        int i5 = i3;
        boolean z2 = z;
        return summaryTextReq.copy(i, str, i2, str2, i5, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTextLanguageId() {
        return this.textLanguageId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSummaryLanguageId() {
        return this.summaryLanguageId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCacheTraceId() {
        return this.cacheTraceId;
    }

    /* renamed from: component5, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getFirmwareFlag() {
        return this.firmwareFlag;
    }

    public final SummaryTextReq copy(int textLanguageId, String text, int summaryLanguageId, String cacheTraceId, int version, boolean firmwareFlag) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new SummaryTextReq(textLanguageId, text, summaryLanguageId, cacheTraceId, version, firmwareFlag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SummaryTextReq)) {
            return false;
        }
        SummaryTextReq summaryTextReq = (SummaryTextReq) other;
        return this.textLanguageId == summaryTextReq.textLanguageId && Intrinsics.areEqual(this.text, summaryTextReq.text) && this.summaryLanguageId == summaryTextReq.summaryLanguageId && Intrinsics.areEqual(this.cacheTraceId, summaryTextReq.cacheTraceId) && this.version == summaryTextReq.version && this.firmwareFlag == summaryTextReq.firmwareFlag;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.textLanguageId) * 31) + this.text.hashCode()) * 31) + Integer.hashCode(this.summaryLanguageId)) * 31;
        String str = this.cacheTraceId;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.version)) * 31) + Boolean.hashCode(this.firmwareFlag);
    }

    public String toString() {
        return "SummaryTextReq(textLanguageId=" + this.textLanguageId + ", text=" + this.text + ", summaryLanguageId=" + this.summaryLanguageId + ", cacheTraceId=" + this.cacheTraceId + ", version=" + this.version + ", firmwareFlag=" + this.firmwareFlag + Separators.RPAREN;
    }

    public SummaryTextReq(int i, String text, int i2, String str, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.textLanguageId = i;
        this.text = text;
        this.summaryLanguageId = i2;
        this.cacheTraceId = str;
        this.version = i3;
        this.firmwareFlag = z;
    }

    public /* synthetic */ SummaryTextReq(int i, String str, int i2, String str2, int i3, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, i2, (i4 & 8) != 0 ? null : str2, (i4 & 16) != 0 ? 2 : i3, (i4 & 32) != 0 ? false : z);
    }

    public final int getTextLanguageId() {
        return this.textLanguageId;
    }

    public final String getText() {
        return this.text;
    }

    public final int getSummaryLanguageId() {
        return this.summaryLanguageId;
    }

    public final String getCacheTraceId() {
        return this.cacheTraceId;
    }

    public final int getVersion() {
        return this.version;
    }

    public final boolean getFirmwareFlag() {
        return this.firmwareFlag;
    }
}
