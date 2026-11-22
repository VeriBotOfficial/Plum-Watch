package com.wakeup.common.network.entity.ai;

import android.gov.nist.core.Separators;
import com.umeng.analytics.AnalyticsConfig;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OneTransResult.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JG\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006#"}, d2 = {"Lcom/wakeup/common/network/entity/ai/AsrResults;", "", AnalyticsConfig.RTD_START_TIME, "", "endTime", "text", "", "words", "", "finalResult", "", "sentenceSeq", "<init>", "(IILjava/lang/String;[BZI)V", "getStartTime", "()I", "getEndTime", "getText", "()Ljava/lang/String;", "getWords", "()[B", "getFinalResult", "()Z", "getSentenceSeq", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AsrResults {
    private final int endTime;
    private final boolean finalResult;
    private final int sentenceSeq;
    private final int startTime;
    private final String text;
    private final byte[] words;

    public static /* synthetic */ AsrResults copy$default(AsrResults asrResults, int i, int i2, String str, byte[] bArr, boolean z, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = asrResults.startTime;
        }
        if ((i4 & 2) != 0) {
            i2 = asrResults.endTime;
        }
        if ((i4 & 4) != 0) {
            str = asrResults.text;
        }
        if ((i4 & 8) != 0) {
            bArr = asrResults.words;
        }
        if ((i4 & 16) != 0) {
            z = asrResults.finalResult;
        }
        if ((i4 & 32) != 0) {
            i3 = asrResults.sentenceSeq;
        }
        boolean z2 = z;
        int i5 = i3;
        return asrResults.copy(i, i2, str, bArr, z2, i5);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStartTime() {
        return this.startTime;
    }

    /* renamed from: component2, reason: from getter */
    public final int getEndTime() {
        return this.endTime;
    }

    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component4, reason: from getter */
    public final byte[] getWords() {
        return this.words;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getFinalResult() {
        return this.finalResult;
    }

    /* renamed from: component6, reason: from getter */
    public final int getSentenceSeq() {
        return this.sentenceSeq;
    }

    public final AsrResults copy(int startTime, int endTime, String text, byte[] words, boolean finalResult, int sentenceSeq) {
        Intrinsics.checkNotNullParameter(words, "words");
        return new AsrResults(startTime, endTime, text, words, finalResult, sentenceSeq);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AsrResults)) {
            return false;
        }
        AsrResults asrResults = (AsrResults) other;
        return this.startTime == asrResults.startTime && this.endTime == asrResults.endTime && Intrinsics.areEqual(this.text, asrResults.text) && Intrinsics.areEqual(this.words, asrResults.words) && this.finalResult == asrResults.finalResult && this.sentenceSeq == asrResults.sentenceSeq;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.startTime) * 31) + Integer.hashCode(this.endTime)) * 31;
        String str = this.text;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Arrays.hashCode(this.words)) * 31) + Boolean.hashCode(this.finalResult)) * 31) + Integer.hashCode(this.sentenceSeq);
    }

    public String toString() {
        return "AsrResults(startTime=" + this.startTime + ", endTime=" + this.endTime + ", text=" + this.text + ", words=" + Arrays.toString(this.words) + ", finalResult=" + this.finalResult + ", sentenceSeq=" + this.sentenceSeq + Separators.RPAREN;
    }

    public AsrResults(int i, int i2, String str, byte[] words, boolean z, int i3) {
        Intrinsics.checkNotNullParameter(words, "words");
        this.startTime = i;
        this.endTime = i2;
        this.text = str;
        this.words = words;
        this.finalResult = z;
        this.sentenceSeq = i3;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final String getText() {
        return this.text;
    }

    public final byte[] getWords() {
        return this.words;
    }

    public final boolean getFinalResult() {
        return this.finalResult;
    }

    public final int getSentenceSeq() {
        return this.sentenceSeq;
    }
}
