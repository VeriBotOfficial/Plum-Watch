package com.wakeup.module.ai.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TSTBean.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\nHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/wakeup/module/ai/bean/ASRResult;", "", "start_time", "", "end_time", "text", "", "final_result", "", "sentence_seq", "", "<init>", "(DDLjava/lang/String;ZI)V", "getStart_time", "()D", "getEnd_time", "getText", "()Ljava/lang/String;", "getFinal_result", "()Z", "getSentence_seq", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ASRResult {
    private final double end_time;
    private final boolean final_result;
    private final int sentence_seq;
    private final double start_time;
    private final String text;

    public static /* synthetic */ ASRResult copy$default(ASRResult aSRResult, double d, double d2, String str, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d = aSRResult.start_time;
        }
        double d3 = d;
        if ((i2 & 2) != 0) {
            d2 = aSRResult.end_time;
        }
        double d4 = d2;
        if ((i2 & 4) != 0) {
            str = aSRResult.text;
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            z = aSRResult.final_result;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            i = aSRResult.sentence_seq;
        }
        return aSRResult.copy(d3, d4, str2, z2, i);
    }

    /* renamed from: component1, reason: from getter */
    public final double getStart_time() {
        return this.start_time;
    }

    /* renamed from: component2, reason: from getter */
    public final double getEnd_time() {
        return this.end_time;
    }

    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getFinal_result() {
        return this.final_result;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSentence_seq() {
        return this.sentence_seq;
    }

    public final ASRResult copy(double start_time, double end_time, String text, boolean final_result, int sentence_seq) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new ASRResult(start_time, end_time, text, final_result, sentence_seq);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ASRResult)) {
            return false;
        }
        ASRResult aSRResult = (ASRResult) other;
        return Double.compare(this.start_time, aSRResult.start_time) == 0 && Double.compare(this.end_time, aSRResult.end_time) == 0 && Intrinsics.areEqual(this.text, aSRResult.text) && this.final_result == aSRResult.final_result && this.sentence_seq == aSRResult.sentence_seq;
    }

    public int hashCode() {
        return (((((((Double.hashCode(this.start_time) * 31) + Double.hashCode(this.end_time)) * 31) + this.text.hashCode()) * 31) + Boolean.hashCode(this.final_result)) * 31) + Integer.hashCode(this.sentence_seq);
    }

    public String toString() {
        return "ASRResult(start_time=" + this.start_time + ", end_time=" + this.end_time + ", text=" + this.text + ", final_result=" + this.final_result + ", sentence_seq=" + this.sentence_seq + Separators.RPAREN;
    }

    public ASRResult(double d, double d2, String text, boolean z, int i) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.start_time = d;
        this.end_time = d2;
        this.text = text;
        this.final_result = z;
        this.sentence_seq = i;
    }

    public final double getStart_time() {
        return this.start_time;
    }

    public final double getEnd_time() {
        return this.end_time;
    }

    public final String getText() {
        return this.text;
    }

    public final boolean getFinal_result() {
        return this.final_result;
    }

    public final int getSentence_seq() {
        return this.sentence_seq;
    }
}
