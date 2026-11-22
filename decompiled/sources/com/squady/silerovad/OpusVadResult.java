package com.squady.silerovad;

import kotlin.Metadata;

/* compiled from: OpusVadResult.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/squady/silerovad/OpusVadResult;", "", "hasSpeech", "", "maxProbability", "", "frameCount", "", "speechFrameCount", "durationMs", "(ZFJJJ)V", "getDurationMs", "()J", "getFrameCount", "getHasSpeech", "()Z", "getMaxProbability", "()F", "getSpeechFrameCount", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "silero-vad_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OpusVadResult {
    private final long durationMs;
    private final long frameCount;
    private final boolean hasSpeech;
    private final float maxProbability;
    private final long speechFrameCount;

    public static /* synthetic */ OpusVadResult copy$default(OpusVadResult opusVadResult, boolean z, float f, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = opusVadResult.hasSpeech;
        }
        if ((i & 2) != 0) {
            f = opusVadResult.maxProbability;
        }
        if ((i & 4) != 0) {
            j = opusVadResult.frameCount;
        }
        if ((i & 8) != 0) {
            j2 = opusVadResult.speechFrameCount;
        }
        if ((i & 16) != 0) {
            j3 = opusVadResult.durationMs;
        }
        long j4 = j3;
        long j5 = j2;
        return opusVadResult.copy(z, f, j, j5, j4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasSpeech() {
        return this.hasSpeech;
    }

    /* renamed from: component2, reason: from getter */
    public final float getMaxProbability() {
        return this.maxProbability;
    }

    /* renamed from: component3, reason: from getter */
    public final long getFrameCount() {
        return this.frameCount;
    }

    /* renamed from: component4, reason: from getter */
    public final long getSpeechFrameCount() {
        return this.speechFrameCount;
    }

    /* renamed from: component5, reason: from getter */
    public final long getDurationMs() {
        return this.durationMs;
    }

    public final OpusVadResult copy(boolean hasSpeech, float maxProbability, long frameCount, long speechFrameCount, long durationMs) {
        return new OpusVadResult(hasSpeech, maxProbability, frameCount, speechFrameCount, durationMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpusVadResult)) {
            return false;
        }
        OpusVadResult opusVadResult = (OpusVadResult) other;
        return this.hasSpeech == opusVadResult.hasSpeech && Float.compare(this.maxProbability, opusVadResult.maxProbability) == 0 && this.frameCount == opusVadResult.frameCount && this.speechFrameCount == opusVadResult.speechFrameCount && this.durationMs == opusVadResult.durationMs;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.hasSpeech) * 31) + Float.hashCode(this.maxProbability)) * 31) + Long.hashCode(this.frameCount)) * 31) + Long.hashCode(this.speechFrameCount)) * 31) + Long.hashCode(this.durationMs);
    }

    public String toString() {
        return "OpusVadResult(hasSpeech=" + this.hasSpeech + ", maxProbability=" + this.maxProbability + ", frameCount=" + this.frameCount + ", speechFrameCount=" + this.speechFrameCount + ", durationMs=" + this.durationMs + ')';
    }

    public OpusVadResult(boolean z, float f, long j, long j2, long j3) {
        this.hasSpeech = z;
        this.maxProbability = f;
        this.frameCount = j;
        this.speechFrameCount = j2;
        this.durationMs = j3;
    }

    public final boolean getHasSpeech() {
        return this.hasSpeech;
    }

    public final float getMaxProbability() {
        return this.maxProbability;
    }

    public final long getFrameCount() {
        return this.frameCount;
    }

    public final long getSpeechFrameCount() {
        return this.speechFrameCount;
    }

    public final long getDurationMs() {
        return this.durationMs;
    }
}
