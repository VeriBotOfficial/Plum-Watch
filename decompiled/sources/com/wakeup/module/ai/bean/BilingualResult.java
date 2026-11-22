package com.wakeup.module.ai.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ASRBean.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b-\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\t\u00100\u001a\u00020\u000eHÆ\u0003J\t\u00101\u001a\u00020\nHÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010$J\t\u00103\u001a\u00020\nHÆ\u0003J\t\u00104\u001a\u00020\nHÆ\u0003J\u0092\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\u000e2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\nHÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001d¨\u0006;"}, d2 = {"Lcom/wakeup/module/ai/bean/BilingualResult;", "", "traceId", "", "serviceTimestamp", "", "sentenceIndex", "meetingId", "asrText", "asrLanguageId", "", "translationText", "translationLanguageId", "finalText", "", "dataResultType", "needExternalTts", "businessFunction", "dataType", "<init>", "(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;ILjava/lang/String;IZILjava/lang/Boolean;II)V", "getTraceId", "()Ljava/lang/String;", "getServiceTimestamp", "()J", "getSentenceIndex", "getMeetingId", "getAsrText", "getAsrLanguageId", "()I", "getTranslationText", "getTranslationLanguageId", "getFinalText", "()Z", "getDataResultType", "getNeedExternalTts", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBusinessFunction", "getDataType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;ILjava/lang/String;IZILjava/lang/Boolean;II)Lcom/wakeup/module/ai/bean/BilingualResult;", "equals", "other", "hashCode", "toString", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BilingualResult {
    private final int asrLanguageId;
    private final String asrText;
    private final int businessFunction;
    private final int dataResultType;
    private final int dataType;
    private final boolean finalText;
    private final String meetingId;
    private final Boolean needExternalTts;
    private final long sentenceIndex;
    private final long serviceTimestamp;
    private final String traceId;
    private final int translationLanguageId;
    private final String translationText;

    /* renamed from: component1, reason: from getter */
    public final String getTraceId() {
        return this.traceId;
    }

    /* renamed from: component10, reason: from getter */
    public final int getDataResultType() {
        return this.dataResultType;
    }

    /* renamed from: component11, reason: from getter */
    public final Boolean getNeedExternalTts() {
        return this.needExternalTts;
    }

    /* renamed from: component12, reason: from getter */
    public final int getBusinessFunction() {
        return this.businessFunction;
    }

    /* renamed from: component13, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    /* renamed from: component2, reason: from getter */
    public final long getServiceTimestamp() {
        return this.serviceTimestamp;
    }

    /* renamed from: component3, reason: from getter */
    public final long getSentenceIndex() {
        return this.sentenceIndex;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMeetingId() {
        return this.meetingId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAsrText() {
        return this.asrText;
    }

    /* renamed from: component6, reason: from getter */
    public final int getAsrLanguageId() {
        return this.asrLanguageId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTranslationText() {
        return this.translationText;
    }

    /* renamed from: component8, reason: from getter */
    public final int getTranslationLanguageId() {
        return this.translationLanguageId;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getFinalText() {
        return this.finalText;
    }

    public final BilingualResult copy(String traceId, long serviceTimestamp, long sentenceIndex, String meetingId, String asrText, int asrLanguageId, String translationText, int translationLanguageId, boolean finalText, int dataResultType, Boolean needExternalTts, int businessFunction, int dataType) {
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        Intrinsics.checkNotNullParameter(meetingId, "meetingId");
        Intrinsics.checkNotNullParameter(asrText, "asrText");
        Intrinsics.checkNotNullParameter(translationText, "translationText");
        return new BilingualResult(traceId, serviceTimestamp, sentenceIndex, meetingId, asrText, asrLanguageId, translationText, translationLanguageId, finalText, dataResultType, needExternalTts, businessFunction, dataType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BilingualResult)) {
            return false;
        }
        BilingualResult bilingualResult = (BilingualResult) other;
        return Intrinsics.areEqual(this.traceId, bilingualResult.traceId) && this.serviceTimestamp == bilingualResult.serviceTimestamp && this.sentenceIndex == bilingualResult.sentenceIndex && Intrinsics.areEqual(this.meetingId, bilingualResult.meetingId) && Intrinsics.areEqual(this.asrText, bilingualResult.asrText) && this.asrLanguageId == bilingualResult.asrLanguageId && Intrinsics.areEqual(this.translationText, bilingualResult.translationText) && this.translationLanguageId == bilingualResult.translationLanguageId && this.finalText == bilingualResult.finalText && this.dataResultType == bilingualResult.dataResultType && Intrinsics.areEqual(this.needExternalTts, bilingualResult.needExternalTts) && this.businessFunction == bilingualResult.businessFunction && this.dataType == bilingualResult.dataType;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((this.traceId.hashCode() * 31) + Long.hashCode(this.serviceTimestamp)) * 31) + Long.hashCode(this.sentenceIndex)) * 31) + this.meetingId.hashCode()) * 31) + this.asrText.hashCode()) * 31) + Integer.hashCode(this.asrLanguageId)) * 31) + this.translationText.hashCode()) * 31) + Integer.hashCode(this.translationLanguageId)) * 31) + Boolean.hashCode(this.finalText)) * 31) + Integer.hashCode(this.dataResultType)) * 31;
        Boolean bool = this.needExternalTts;
        return ((((hashCode + (bool == null ? 0 : bool.hashCode())) * 31) + Integer.hashCode(this.businessFunction)) * 31) + Integer.hashCode(this.dataType);
    }

    public String toString() {
        return "BilingualResult(traceId=" + this.traceId + ", serviceTimestamp=" + this.serviceTimestamp + ", sentenceIndex=" + this.sentenceIndex + ", meetingId=" + this.meetingId + ", asrText=" + this.asrText + ", asrLanguageId=" + this.asrLanguageId + ", translationText=" + this.translationText + ", translationLanguageId=" + this.translationLanguageId + ", finalText=" + this.finalText + ", dataResultType=" + this.dataResultType + ", needExternalTts=" + this.needExternalTts + ", businessFunction=" + this.businessFunction + ", dataType=" + this.dataType + Separators.RPAREN;
    }

    public BilingualResult(String traceId, long j, long j2, String meetingId, String asrText, int i, String translationText, int i2, boolean z, int i3, Boolean bool, int i4, int i5) {
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        Intrinsics.checkNotNullParameter(meetingId, "meetingId");
        Intrinsics.checkNotNullParameter(asrText, "asrText");
        Intrinsics.checkNotNullParameter(translationText, "translationText");
        this.traceId = traceId;
        this.serviceTimestamp = j;
        this.sentenceIndex = j2;
        this.meetingId = meetingId;
        this.asrText = asrText;
        this.asrLanguageId = i;
        this.translationText = translationText;
        this.translationLanguageId = i2;
        this.finalText = z;
        this.dataResultType = i3;
        this.needExternalTts = bool;
        this.businessFunction = i4;
        this.dataType = i5;
    }

    public /* synthetic */ BilingualResult(String str, long j, long j2, String str2, String str3, int i, String str4, int i2, boolean z, int i3, Boolean bool, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, j2, str2, str3, i, str4, i2, z, (i6 & 512) != 0 ? 0 : i3, bool, (i6 & 2048) != 0 ? 0 : i4, (i6 & 4096) != 0 ? 4 : i5);
    }

    public final String getTraceId() {
        return this.traceId;
    }

    public final long getServiceTimestamp() {
        return this.serviceTimestamp;
    }

    public final long getSentenceIndex() {
        return this.sentenceIndex;
    }

    public final String getMeetingId() {
        return this.meetingId;
    }

    public final String getAsrText() {
        return this.asrText;
    }

    public final int getAsrLanguageId() {
        return this.asrLanguageId;
    }

    public final String getTranslationText() {
        return this.translationText;
    }

    public final int getTranslationLanguageId() {
        return this.translationLanguageId;
    }

    public final boolean getFinalText() {
        return this.finalText;
    }

    public final int getDataResultType() {
        return this.dataResultType;
    }

    public final Boolean getNeedExternalTts() {
        return this.needExternalTts;
    }

    public final int getBusinessFunction() {
        return this.businessFunction;
    }

    public final int getDataType() {
        return this.dataType;
    }
}
