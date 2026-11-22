package com.wakeup.module.ai.subtitles;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiSubtitlesBean.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/wakeup/module/ai/subtitles/AiSubtitlesBean;", "", "asr", "", "trans", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAsr", "()Ljava/lang/String;", "setAsr", "(Ljava/lang/String;)V", "getTrans", "setTrans", "isASrEnd", "", "()Z", "setASrEnd", "(Z)V", "isTranEnd", "setTranEnd", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AiSubtitlesBean {
    private String asr;
    private boolean isASrEnd;
    private boolean isTranEnd;
    private String trans;

    public static /* synthetic */ AiSubtitlesBean copy$default(AiSubtitlesBean aiSubtitlesBean, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aiSubtitlesBean.asr;
        }
        if ((i & 2) != 0) {
            str2 = aiSubtitlesBean.trans;
        }
        return aiSubtitlesBean.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAsr() {
        return this.asr;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTrans() {
        return this.trans;
    }

    public final AiSubtitlesBean copy(String asr, String trans) {
        Intrinsics.checkNotNullParameter(asr, "asr");
        Intrinsics.checkNotNullParameter(trans, "trans");
        return new AiSubtitlesBean(asr, trans);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiSubtitlesBean)) {
            return false;
        }
        AiSubtitlesBean aiSubtitlesBean = (AiSubtitlesBean) other;
        return Intrinsics.areEqual(this.asr, aiSubtitlesBean.asr) && Intrinsics.areEqual(this.trans, aiSubtitlesBean.trans);
    }

    public int hashCode() {
        return (this.asr.hashCode() * 31) + this.trans.hashCode();
    }

    public String toString() {
        return "AiSubtitlesBean(asr=" + this.asr + ", trans=" + this.trans + Separators.RPAREN;
    }

    public AiSubtitlesBean(String asr, String trans) {
        Intrinsics.checkNotNullParameter(asr, "asr");
        Intrinsics.checkNotNullParameter(trans, "trans");
        this.asr = asr;
        this.trans = trans;
    }

    public final String getAsr() {
        return this.asr;
    }

    public final void setAsr(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.asr = str;
    }

    public final String getTrans() {
        return this.trans;
    }

    public final void setTrans(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.trans = str;
    }

    /* renamed from: isASrEnd, reason: from getter */
    public final boolean getIsASrEnd() {
        return this.isASrEnd;
    }

    public final void setASrEnd(boolean z) {
        this.isASrEnd = z;
    }

    /* renamed from: isTranEnd, reason: from getter */
    public final boolean getIsTranEnd() {
        return this.isTranEnd;
    }

    public final void setTranEnd(boolean z) {
        this.isTranEnd = z;
    }
}
