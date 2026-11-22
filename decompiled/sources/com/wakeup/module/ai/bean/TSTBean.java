package com.wakeup.module.ai.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TSTBean.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010$J\u0084\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0003HÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$¨\u00068"}, d2 = {"Lcom/wakeup/module/ai/bean/TSTBean;", "", "dataType", "", "from_lang", "", "to_lang", "from_lang_id", "to_lang_id", "sentence_seq", "translate_area_id", "asr_results", "Lcom/wakeup/module/ai/bean/ASRResult;", "trans_results", "Lcom/wakeup/module/ai/bean/TransResult;", "tts_results", "Lcom/wakeup/module/ai/bean/TtsResult;", "code", "<init>", "(ILjava/lang/String;Ljava/lang/String;IIIILcom/wakeup/module/ai/bean/ASRResult;Lcom/wakeup/module/ai/bean/TransResult;Lcom/wakeup/module/ai/bean/TtsResult;Ljava/lang/Integer;)V", "getDataType", "()I", "getFrom_lang", "()Ljava/lang/String;", "getTo_lang", "getFrom_lang_id", "getTo_lang_id", "getSentence_seq", "getTranslate_area_id", "getAsr_results", "()Lcom/wakeup/module/ai/bean/ASRResult;", "getTrans_results", "()Lcom/wakeup/module/ai/bean/TransResult;", "getTts_results", "()Lcom/wakeup/module/ai/bean/TtsResult;", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(ILjava/lang/String;Ljava/lang/String;IIIILcom/wakeup/module/ai/bean/ASRResult;Lcom/wakeup/module/ai/bean/TransResult;Lcom/wakeup/module/ai/bean/TtsResult;Ljava/lang/Integer;)Lcom/wakeup/module/ai/bean/TSTBean;", "equals", "", "other", "hashCode", "toString", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TSTBean {
    private final ASRResult asr_results;
    private final Integer code;
    private final int dataType;
    private final String from_lang;
    private final int from_lang_id;
    private final int sentence_seq;
    private final String to_lang;
    private final int to_lang_id;
    private final TransResult trans_results;
    private final int translate_area_id;
    private final TtsResult tts_results;

    public static /* synthetic */ TSTBean copy$default(TSTBean tSTBean, int i, String str, String str2, int i2, int i3, int i4, int i5, ASRResult aSRResult, TransResult transResult, TtsResult ttsResult, Integer num, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = tSTBean.dataType;
        }
        if ((i6 & 2) != 0) {
            str = tSTBean.from_lang;
        }
        if ((i6 & 4) != 0) {
            str2 = tSTBean.to_lang;
        }
        if ((i6 & 8) != 0) {
            i2 = tSTBean.from_lang_id;
        }
        if ((i6 & 16) != 0) {
            i3 = tSTBean.to_lang_id;
        }
        if ((i6 & 32) != 0) {
            i4 = tSTBean.sentence_seq;
        }
        if ((i6 & 64) != 0) {
            i5 = tSTBean.translate_area_id;
        }
        if ((i6 & 128) != 0) {
            aSRResult = tSTBean.asr_results;
        }
        if ((i6 & 256) != 0) {
            transResult = tSTBean.trans_results;
        }
        if ((i6 & 512) != 0) {
            ttsResult = tSTBean.tts_results;
        }
        if ((i6 & 1024) != 0) {
            num = tSTBean.code;
        }
        TtsResult ttsResult2 = ttsResult;
        Integer num2 = num;
        ASRResult aSRResult2 = aSRResult;
        TransResult transResult2 = transResult;
        int i7 = i4;
        int i8 = i5;
        int i9 = i3;
        String str3 = str2;
        return tSTBean.copy(i, str, str3, i2, i9, i7, i8, aSRResult2, transResult2, ttsResult2, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    /* renamed from: component10, reason: from getter */
    public final TtsResult getTts_results() {
        return this.tts_results;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFrom_lang() {
        return this.from_lang;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTo_lang() {
        return this.to_lang;
    }

    /* renamed from: component4, reason: from getter */
    public final int getFrom_lang_id() {
        return this.from_lang_id;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTo_lang_id() {
        return this.to_lang_id;
    }

    /* renamed from: component6, reason: from getter */
    public final int getSentence_seq() {
        return this.sentence_seq;
    }

    /* renamed from: component7, reason: from getter */
    public final int getTranslate_area_id() {
        return this.translate_area_id;
    }

    /* renamed from: component8, reason: from getter */
    public final ASRResult getAsr_results() {
        return this.asr_results;
    }

    /* renamed from: component9, reason: from getter */
    public final TransResult getTrans_results() {
        return this.trans_results;
    }

    public final TSTBean copy(int dataType, String from_lang, String to_lang, int from_lang_id, int to_lang_id, int sentence_seq, int translate_area_id, ASRResult asr_results, TransResult trans_results, TtsResult tts_results, Integer code) {
        Intrinsics.checkNotNullParameter(from_lang, "from_lang");
        Intrinsics.checkNotNullParameter(to_lang, "to_lang");
        return new TSTBean(dataType, from_lang, to_lang, from_lang_id, to_lang_id, sentence_seq, translate_area_id, asr_results, trans_results, tts_results, code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TSTBean)) {
            return false;
        }
        TSTBean tSTBean = (TSTBean) other;
        return this.dataType == tSTBean.dataType && Intrinsics.areEqual(this.from_lang, tSTBean.from_lang) && Intrinsics.areEqual(this.to_lang, tSTBean.to_lang) && this.from_lang_id == tSTBean.from_lang_id && this.to_lang_id == tSTBean.to_lang_id && this.sentence_seq == tSTBean.sentence_seq && this.translate_area_id == tSTBean.translate_area_id && Intrinsics.areEqual(this.asr_results, tSTBean.asr_results) && Intrinsics.areEqual(this.trans_results, tSTBean.trans_results) && Intrinsics.areEqual(this.tts_results, tSTBean.tts_results) && Intrinsics.areEqual(this.code, tSTBean.code);
    }

    public int hashCode() {
        int hashCode = ((((((((((((Integer.hashCode(this.dataType) * 31) + this.from_lang.hashCode()) * 31) + this.to_lang.hashCode()) * 31) + Integer.hashCode(this.from_lang_id)) * 31) + Integer.hashCode(this.to_lang_id)) * 31) + Integer.hashCode(this.sentence_seq)) * 31) + Integer.hashCode(this.translate_area_id)) * 31;
        ASRResult aSRResult = this.asr_results;
        int hashCode2 = (hashCode + (aSRResult == null ? 0 : aSRResult.hashCode())) * 31;
        TransResult transResult = this.trans_results;
        int hashCode3 = (hashCode2 + (transResult == null ? 0 : transResult.hashCode())) * 31;
        TtsResult ttsResult = this.tts_results;
        int hashCode4 = (hashCode3 + (ttsResult == null ? 0 : ttsResult.hashCode())) * 31;
        Integer num = this.code;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "TSTBean(dataType=" + this.dataType + ", from_lang=" + this.from_lang + ", to_lang=" + this.to_lang + ", from_lang_id=" + this.from_lang_id + ", to_lang_id=" + this.to_lang_id + ", sentence_seq=" + this.sentence_seq + ", translate_area_id=" + this.translate_area_id + ", asr_results=" + this.asr_results + ", trans_results=" + this.trans_results + ", tts_results=" + this.tts_results + ", code=" + this.code + Separators.RPAREN;
    }

    public TSTBean(int i, String from_lang, String to_lang, int i2, int i3, int i4, int i5, ASRResult aSRResult, TransResult transResult, TtsResult ttsResult, Integer num) {
        Intrinsics.checkNotNullParameter(from_lang, "from_lang");
        Intrinsics.checkNotNullParameter(to_lang, "to_lang");
        this.dataType = i;
        this.from_lang = from_lang;
        this.to_lang = to_lang;
        this.from_lang_id = i2;
        this.to_lang_id = i3;
        this.sentence_seq = i4;
        this.translate_area_id = i5;
        this.asr_results = aSRResult;
        this.trans_results = transResult;
        this.tts_results = ttsResult;
        this.code = num;
    }

    public final int getDataType() {
        return this.dataType;
    }

    public final String getFrom_lang() {
        return this.from_lang;
    }

    public final String getTo_lang() {
        return this.to_lang;
    }

    public final int getFrom_lang_id() {
        return this.from_lang_id;
    }

    public final int getTo_lang_id() {
        return this.to_lang_id;
    }

    public final int getSentence_seq() {
        return this.sentence_seq;
    }

    public final int getTranslate_area_id() {
        return this.translate_area_id;
    }

    public final ASRResult getAsr_results() {
        return this.asr_results;
    }

    public final TransResult getTrans_results() {
        return this.trans_results;
    }

    public final TtsResult getTts_results() {
        return this.tts_results;
    }

    public final Integer getCode() {
        return this.code;
    }
}
