package com.wakeup.common.network.entity.ai;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import com.wakeup.common.burypoint.BuryPointPageId;
import io.nats.client.support.ApiConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AIMusicBean.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\rHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J³\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00105\u001a\u00020\r2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0016R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016¨\u0006:"}, d2 = {"Lcom/wakeup/common/network/entity/ai/AIMusicMetaData;", "", "tags", "", SDPKeywords.PROMPT, "gptDescriptionPrompt", "audioPromptId", BuryPointPageId.PAGE_ID_HISTORY, "concatHistory", "type", "duration", "refundCredits", ApiConstants.STREAM, "", "infill", "hasVocal", "isAudioUploadTosAccepted", "errorType", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTags", "()Ljava/lang/String;", "getPrompt", "getGptDescriptionPrompt", "getAudioPromptId", "getHistory", "getConcatHistory", "getType", "getDuration", "getRefundCredits", "getStream", "()Z", "getInfill", "getHasVocal", "getErrorType", "getErrorMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AIMusicMetaData {
    private final String audioPromptId;
    private final String concatHistory;
    private final String duration;
    private final String errorMessage;
    private final String errorType;
    private final String gptDescriptionPrompt;
    private final String hasVocal;
    private final String history;
    private final String infill;
    private final String isAudioUploadTosAccepted;
    private final String prompt;
    private final String refundCredits;
    private final boolean stream;
    private final String tags;
    private final String type;

    /* renamed from: component1, reason: from getter */
    public final String getTags() {
        return this.tags;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getStream() {
        return this.stream;
    }

    /* renamed from: component11, reason: from getter */
    public final String getInfill() {
        return this.infill;
    }

    /* renamed from: component12, reason: from getter */
    public final String getHasVocal() {
        return this.hasVocal;
    }

    /* renamed from: component13, reason: from getter */
    public final String getIsAudioUploadTosAccepted() {
        return this.isAudioUploadTosAccepted;
    }

    /* renamed from: component14, reason: from getter */
    public final String getErrorType() {
        return this.errorType;
    }

    /* renamed from: component15, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPrompt() {
        return this.prompt;
    }

    /* renamed from: component3, reason: from getter */
    public final String getGptDescriptionPrompt() {
        return this.gptDescriptionPrompt;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAudioPromptId() {
        return this.audioPromptId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getHistory() {
        return this.history;
    }

    /* renamed from: component6, reason: from getter */
    public final String getConcatHistory() {
        return this.concatHistory;
    }

    /* renamed from: component7, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* renamed from: component9, reason: from getter */
    public final String getRefundCredits() {
        return this.refundCredits;
    }

    public final AIMusicMetaData copy(String tags, String prompt, String gptDescriptionPrompt, String audioPromptId, String history, String concatHistory, String type, String duration, String refundCredits, boolean stream, String infill, String hasVocal, String isAudioUploadTosAccepted, String errorType, String errorMessage) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        Intrinsics.checkNotNullParameter(gptDescriptionPrompt, "gptDescriptionPrompt");
        Intrinsics.checkNotNullParameter(type, "type");
        return new AIMusicMetaData(tags, prompt, gptDescriptionPrompt, audioPromptId, history, concatHistory, type, duration, refundCredits, stream, infill, hasVocal, isAudioUploadTosAccepted, errorType, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AIMusicMetaData)) {
            return false;
        }
        AIMusicMetaData aIMusicMetaData = (AIMusicMetaData) other;
        return Intrinsics.areEqual(this.tags, aIMusicMetaData.tags) && Intrinsics.areEqual(this.prompt, aIMusicMetaData.prompt) && Intrinsics.areEqual(this.gptDescriptionPrompt, aIMusicMetaData.gptDescriptionPrompt) && Intrinsics.areEqual(this.audioPromptId, aIMusicMetaData.audioPromptId) && Intrinsics.areEqual(this.history, aIMusicMetaData.history) && Intrinsics.areEqual(this.concatHistory, aIMusicMetaData.concatHistory) && Intrinsics.areEqual(this.type, aIMusicMetaData.type) && Intrinsics.areEqual(this.duration, aIMusicMetaData.duration) && Intrinsics.areEqual(this.refundCredits, aIMusicMetaData.refundCredits) && this.stream == aIMusicMetaData.stream && Intrinsics.areEqual(this.infill, aIMusicMetaData.infill) && Intrinsics.areEqual(this.hasVocal, aIMusicMetaData.hasVocal) && Intrinsics.areEqual(this.isAudioUploadTosAccepted, aIMusicMetaData.isAudioUploadTosAccepted) && Intrinsics.areEqual(this.errorType, aIMusicMetaData.errorType) && Intrinsics.areEqual(this.errorMessage, aIMusicMetaData.errorMessage);
    }

    public int hashCode() {
        int hashCode = ((((this.tags.hashCode() * 31) + this.prompt.hashCode()) * 31) + this.gptDescriptionPrompt.hashCode()) * 31;
        String str = this.audioPromptId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.history;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.concatHistory;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.type.hashCode()) * 31;
        String str4 = this.duration;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.refundCredits;
        int hashCode6 = (((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + Boolean.hashCode(this.stream)) * 31;
        String str6 = this.infill;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.hasVocal;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.isAudioUploadTosAccepted;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.errorType;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.errorMessage;
        return hashCode10 + (str10 != null ? str10.hashCode() : 0);
    }

    public String toString() {
        return "AIMusicMetaData(tags=" + this.tags + ", prompt=" + this.prompt + ", gptDescriptionPrompt=" + this.gptDescriptionPrompt + ", audioPromptId=" + this.audioPromptId + ", history=" + this.history + ", concatHistory=" + this.concatHistory + ", type=" + this.type + ", duration=" + this.duration + ", refundCredits=" + this.refundCredits + ", stream=" + this.stream + ", infill=" + this.infill + ", hasVocal=" + this.hasVocal + ", isAudioUploadTosAccepted=" + this.isAudioUploadTosAccepted + ", errorType=" + this.errorType + ", errorMessage=" + this.errorMessage + Separators.RPAREN;
    }

    public AIMusicMetaData(String tags, String prompt, String gptDescriptionPrompt, String str, String str2, String str3, String type, String str4, String str5, boolean z, String str6, String str7, String str8, String str9, String str10) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        Intrinsics.checkNotNullParameter(gptDescriptionPrompt, "gptDescriptionPrompt");
        Intrinsics.checkNotNullParameter(type, "type");
        this.tags = tags;
        this.prompt = prompt;
        this.gptDescriptionPrompt = gptDescriptionPrompt;
        this.audioPromptId = str;
        this.history = str2;
        this.concatHistory = str3;
        this.type = type;
        this.duration = str4;
        this.refundCredits = str5;
        this.stream = z;
        this.infill = str6;
        this.hasVocal = str7;
        this.isAudioUploadTosAccepted = str8;
        this.errorType = str9;
        this.errorMessage = str10;
    }

    public final String getTags() {
        return this.tags;
    }

    public final String getPrompt() {
        return this.prompt;
    }

    public final String getGptDescriptionPrompt() {
        return this.gptDescriptionPrompt;
    }

    public final String getAudioPromptId() {
        return this.audioPromptId;
    }

    public final String getHistory() {
        return this.history;
    }

    public final String getConcatHistory() {
        return this.concatHistory;
    }

    public final String getType() {
        return this.type;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getRefundCredits() {
        return this.refundCredits;
    }

    public final boolean getStream() {
        return this.stream;
    }

    public final String getInfill() {
        return this.infill;
    }

    public final String getHasVocal() {
        return this.hasVocal;
    }

    public final String isAudioUploadTosAccepted() {
        return this.isAudioUploadTosAccepted;
    }

    public final String getErrorType() {
        return this.errorType;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }
}
