package com.wakeup.module.ai.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TTSBean.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\bHÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006\""}, d2 = {"Lcom/wakeup/module/ai/bean/PureTTSTextRequest;", "", "sentenceIndex", "", "relatedMeetingId", "", "ttsText", "asrLanguageId", "", "translationLanguageId", "relatedBusinessFunction", "<init>", "(JLjava/lang/String;Ljava/lang/String;III)V", "getSentenceIndex", "()J", "getRelatedMeetingId", "()Ljava/lang/String;", "getTtsText", "getAsrLanguageId", "()I", "getTranslationLanguageId", "getRelatedBusinessFunction", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PureTTSTextRequest {
    private final int asrLanguageId;
    private final int relatedBusinessFunction;
    private final String relatedMeetingId;
    private final long sentenceIndex;
    private final int translationLanguageId;
    private final String ttsText;

    public static /* synthetic */ PureTTSTextRequest copy$default(PureTTSTextRequest pureTTSTextRequest, long j, String str, String str2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j = pureTTSTextRequest.sentenceIndex;
        }
        long j2 = j;
        if ((i4 & 2) != 0) {
            str = pureTTSTextRequest.relatedMeetingId;
        }
        String str3 = str;
        if ((i4 & 4) != 0) {
            str2 = pureTTSTextRequest.ttsText;
        }
        String str4 = str2;
        if ((i4 & 8) != 0) {
            i = pureTTSTextRequest.asrLanguageId;
        }
        int i5 = i;
        if ((i4 & 16) != 0) {
            i2 = pureTTSTextRequest.translationLanguageId;
        }
        int i6 = i2;
        if ((i4 & 32) != 0) {
            i3 = pureTTSTextRequest.relatedBusinessFunction;
        }
        return pureTTSTextRequest.copy(j2, str3, str4, i5, i6, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getSentenceIndex() {
        return this.sentenceIndex;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRelatedMeetingId() {
        return this.relatedMeetingId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTtsText() {
        return this.ttsText;
    }

    /* renamed from: component4, reason: from getter */
    public final int getAsrLanguageId() {
        return this.asrLanguageId;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTranslationLanguageId() {
        return this.translationLanguageId;
    }

    /* renamed from: component6, reason: from getter */
    public final int getRelatedBusinessFunction() {
        return this.relatedBusinessFunction;
    }

    public final PureTTSTextRequest copy(long sentenceIndex, String relatedMeetingId, String ttsText, int asrLanguageId, int translationLanguageId, int relatedBusinessFunction) {
        Intrinsics.checkNotNullParameter(relatedMeetingId, "relatedMeetingId");
        Intrinsics.checkNotNullParameter(ttsText, "ttsText");
        return new PureTTSTextRequest(sentenceIndex, relatedMeetingId, ttsText, asrLanguageId, translationLanguageId, relatedBusinessFunction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PureTTSTextRequest)) {
            return false;
        }
        PureTTSTextRequest pureTTSTextRequest = (PureTTSTextRequest) other;
        return this.sentenceIndex == pureTTSTextRequest.sentenceIndex && Intrinsics.areEqual(this.relatedMeetingId, pureTTSTextRequest.relatedMeetingId) && Intrinsics.areEqual(this.ttsText, pureTTSTextRequest.ttsText) && this.asrLanguageId == pureTTSTextRequest.asrLanguageId && this.translationLanguageId == pureTTSTextRequest.translationLanguageId && this.relatedBusinessFunction == pureTTSTextRequest.relatedBusinessFunction;
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.sentenceIndex) * 31) + this.relatedMeetingId.hashCode()) * 31) + this.ttsText.hashCode()) * 31) + Integer.hashCode(this.asrLanguageId)) * 31) + Integer.hashCode(this.translationLanguageId)) * 31) + Integer.hashCode(this.relatedBusinessFunction);
    }

    public String toString() {
        return "PureTTSTextRequest(sentenceIndex=" + this.sentenceIndex + ", relatedMeetingId=" + this.relatedMeetingId + ", ttsText=" + this.ttsText + ", asrLanguageId=" + this.asrLanguageId + ", translationLanguageId=" + this.translationLanguageId + ", relatedBusinessFunction=" + this.relatedBusinessFunction + Separators.RPAREN;
    }

    public PureTTSTextRequest(long j, String relatedMeetingId, String ttsText, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(relatedMeetingId, "relatedMeetingId");
        Intrinsics.checkNotNullParameter(ttsText, "ttsText");
        this.sentenceIndex = j;
        this.relatedMeetingId = relatedMeetingId;
        this.ttsText = ttsText;
        this.asrLanguageId = i;
        this.translationLanguageId = i2;
        this.relatedBusinessFunction = i3;
    }

    public final long getSentenceIndex() {
        return this.sentenceIndex;
    }

    public final String getRelatedMeetingId() {
        return this.relatedMeetingId;
    }

    public final String getTtsText() {
        return this.ttsText;
    }

    public final int getAsrLanguageId() {
        return this.asrLanguageId;
    }

    public final int getTranslationLanguageId() {
        return this.translationLanguageId;
    }

    public final int getRelatedBusinessFunction() {
        return this.relatedBusinessFunction;
    }
}
