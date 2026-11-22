package com.wakeup.module.ai.utils;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VadSilenceDetector.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/wakeup/module/ai/utils/VadDecision;", "", "judgment", "Lcom/wakeup/module/ai/utils/VadJudgment;", "speechFrames", "", "silenceFrames", "<init>", "(Lcom/wakeup/module/ai/utils/VadJudgment;II)V", "getJudgment", "()Lcom/wakeup/module/ai/utils/VadJudgment;", "getSpeechFrames", "()I", "getSilenceFrames", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class VadDecision {
    private final VadJudgment judgment;
    private final int silenceFrames;
    private final int speechFrames;

    public static /* synthetic */ VadDecision copy$default(VadDecision vadDecision, VadJudgment vadJudgment, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            vadJudgment = vadDecision.judgment;
        }
        if ((i3 & 2) != 0) {
            i = vadDecision.speechFrames;
        }
        if ((i3 & 4) != 0) {
            i2 = vadDecision.silenceFrames;
        }
        return vadDecision.copy(vadJudgment, i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final VadJudgment getJudgment() {
        return this.judgment;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSpeechFrames() {
        return this.speechFrames;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSilenceFrames() {
        return this.silenceFrames;
    }

    public final VadDecision copy(VadJudgment judgment, int speechFrames, int silenceFrames) {
        Intrinsics.checkNotNullParameter(judgment, "judgment");
        return new VadDecision(judgment, speechFrames, silenceFrames);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VadDecision)) {
            return false;
        }
        VadDecision vadDecision = (VadDecision) other;
        return this.judgment == vadDecision.judgment && this.speechFrames == vadDecision.speechFrames && this.silenceFrames == vadDecision.silenceFrames;
    }

    public int hashCode() {
        return (((this.judgment.hashCode() * 31) + Integer.hashCode(this.speechFrames)) * 31) + Integer.hashCode(this.silenceFrames);
    }

    public String toString() {
        return "VadDecision(judgment=" + this.judgment + ", speechFrames=" + this.speechFrames + ", silenceFrames=" + this.silenceFrames + Separators.RPAREN;
    }

    public VadDecision(VadJudgment judgment, int i, int i2) {
        Intrinsics.checkNotNullParameter(judgment, "judgment");
        this.judgment = judgment;
        this.speechFrames = i;
        this.silenceFrames = i2;
    }

    public final VadJudgment getJudgment() {
        return this.judgment;
    }

    public final int getSpeechFrames() {
        return this.speechFrames;
    }

    public final int getSilenceFrames() {
        return this.silenceFrames;
    }
}
