package com.wakeup.common.network.entity.ai;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OneTransResult.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003JK\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0006HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lcom/wakeup/common/network/entity/ai/OneTransResult;", "", "fromLang", "", "toLang", "sentenceSeq", "", "asrResults", "Lcom/wakeup/common/network/entity/ai/AsrResults;", "transResults", "Lcom/wakeup/common/network/entity/ai/TransResults;", "ttsResults", "Lcom/wakeup/common/network/entity/ai/TtsResults;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcom/wakeup/common/network/entity/ai/AsrResults;Lcom/wakeup/common/network/entity/ai/TransResults;Lcom/wakeup/common/network/entity/ai/TtsResults;)V", "getFromLang", "()Ljava/lang/String;", "getToLang", "getSentenceSeq", "()I", "getAsrResults", "()Lcom/wakeup/common/network/entity/ai/AsrResults;", "getTransResults", "()Lcom/wakeup/common/network/entity/ai/TransResults;", "getTtsResults", "()Lcom/wakeup/common/network/entity/ai/TtsResults;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OneTransResult {
    private final AsrResults asrResults;
    private final String fromLang;
    private final int sentenceSeq;
    private final String toLang;
    private final TransResults transResults;
    private final TtsResults ttsResults;

    public static /* synthetic */ OneTransResult copy$default(OneTransResult oneTransResult, String str, String str2, int i, AsrResults asrResults, TransResults transResults, TtsResults ttsResults, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = oneTransResult.fromLang;
        }
        if ((i2 & 2) != 0) {
            str2 = oneTransResult.toLang;
        }
        if ((i2 & 4) != 0) {
            i = oneTransResult.sentenceSeq;
        }
        if ((i2 & 8) != 0) {
            asrResults = oneTransResult.asrResults;
        }
        if ((i2 & 16) != 0) {
            transResults = oneTransResult.transResults;
        }
        if ((i2 & 32) != 0) {
            ttsResults = oneTransResult.ttsResults;
        }
        TransResults transResults2 = transResults;
        TtsResults ttsResults2 = ttsResults;
        return oneTransResult.copy(str, str2, i, asrResults, transResults2, ttsResults2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFromLang() {
        return this.fromLang;
    }

    /* renamed from: component2, reason: from getter */
    public final String getToLang() {
        return this.toLang;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSentenceSeq() {
        return this.sentenceSeq;
    }

    /* renamed from: component4, reason: from getter */
    public final AsrResults getAsrResults() {
        return this.asrResults;
    }

    /* renamed from: component5, reason: from getter */
    public final TransResults getTransResults() {
        return this.transResults;
    }

    /* renamed from: component6, reason: from getter */
    public final TtsResults getTtsResults() {
        return this.ttsResults;
    }

    public final OneTransResult copy(String fromLang, String toLang, int sentenceSeq, AsrResults asrResults, TransResults transResults, TtsResults ttsResults) {
        Intrinsics.checkNotNullParameter(fromLang, "fromLang");
        Intrinsics.checkNotNullParameter(toLang, "toLang");
        return new OneTransResult(fromLang, toLang, sentenceSeq, asrResults, transResults, ttsResults);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneTransResult)) {
            return false;
        }
        OneTransResult oneTransResult = (OneTransResult) other;
        return Intrinsics.areEqual(this.fromLang, oneTransResult.fromLang) && Intrinsics.areEqual(this.toLang, oneTransResult.toLang) && this.sentenceSeq == oneTransResult.sentenceSeq && Intrinsics.areEqual(this.asrResults, oneTransResult.asrResults) && Intrinsics.areEqual(this.transResults, oneTransResult.transResults) && Intrinsics.areEqual(this.ttsResults, oneTransResult.ttsResults);
    }

    public int hashCode() {
        int hashCode = ((((this.fromLang.hashCode() * 31) + this.toLang.hashCode()) * 31) + Integer.hashCode(this.sentenceSeq)) * 31;
        AsrResults asrResults = this.asrResults;
        int hashCode2 = (hashCode + (asrResults == null ? 0 : asrResults.hashCode())) * 31;
        TransResults transResults = this.transResults;
        int hashCode3 = (hashCode2 + (transResults == null ? 0 : transResults.hashCode())) * 31;
        TtsResults ttsResults = this.ttsResults;
        return hashCode3 + (ttsResults != null ? ttsResults.hashCode() : 0);
    }

    public String toString() {
        return "OneTransResult(fromLang=" + this.fromLang + ", toLang=" + this.toLang + ", sentenceSeq=" + this.sentenceSeq + ", asrResults=" + this.asrResults + ", transResults=" + this.transResults + ", ttsResults=" + this.ttsResults + Separators.RPAREN;
    }

    public OneTransResult(String fromLang, String toLang, int i, AsrResults asrResults, TransResults transResults, TtsResults ttsResults) {
        Intrinsics.checkNotNullParameter(fromLang, "fromLang");
        Intrinsics.checkNotNullParameter(toLang, "toLang");
        this.fromLang = fromLang;
        this.toLang = toLang;
        this.sentenceSeq = i;
        this.asrResults = asrResults;
        this.transResults = transResults;
        this.ttsResults = ttsResults;
    }

    public final String getFromLang() {
        return this.fromLang;
    }

    public final String getToLang() {
        return this.toLang;
    }

    public final int getSentenceSeq() {
        return this.sentenceSeq;
    }

    public final AsrResults getAsrResults() {
        return this.asrResults;
    }

    public final TransResults getTransResults() {
        return this.transResults;
    }

    public final TtsResults getTtsResults() {
        return this.ttsResults;
    }
}
