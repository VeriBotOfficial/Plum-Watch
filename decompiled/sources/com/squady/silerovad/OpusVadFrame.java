package com.squady.silerovad;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpusVadFrame.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J&\u0010!\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ=\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\"\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\tHÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019¨\u0006("}, d2 = {"Lcom/squady/silerovad/OpusVadFrame;", "", "probability", "", "isSpeech", "", "startSample", "", "sampleCount", "", "pcm16LeMono16k", "", "(FZJI[B)V", "durationMs", "", "getDurationMs", "()D", "()Z", "getPcm16LeMono16k", "()[B", "getProbability", "()F", "getSampleCount", "()I", "getStartSample", "()J", "startTimeMs", "getStartTimeMs", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "silero-vad_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OpusVadFrame {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isSpeech;
    private final byte[] pcm16LeMono16k;
    private final float probability;
    private final int sampleCount;
    private final long startSample;

    public OpusVadFrame(float f, boolean z, long j, int i) {
        this(f, z, j, i, null, 16, null);
    }

    public static /* synthetic */ OpusVadFrame copy$default(OpusVadFrame opusVadFrame, float f, boolean z, long j, int i, byte[] bArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = opusVadFrame.probability;
        }
        if ((i2 & 2) != 0) {
            z = opusVadFrame.isSpeech;
        }
        if ((i2 & 4) != 0) {
            j = opusVadFrame.startSample;
        }
        if ((i2 & 8) != 0) {
            i = opusVadFrame.sampleCount;
        }
        if ((i2 & 16) != 0) {
            bArr = opusVadFrame.pcm16LeMono16k;
        }
        long j2 = j;
        return opusVadFrame.copy(f, z, j2, i, bArr);
    }

    /* renamed from: component1, reason: from getter */
    public final float getProbability() {
        return this.probability;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSpeech() {
        return this.isSpeech;
    }

    /* renamed from: component3, reason: from getter */
    public final long getStartSample() {
        return this.startSample;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSampleCount() {
        return this.sampleCount;
    }

    /* renamed from: component5, reason: from getter */
    public final byte[] getPcm16LeMono16k() {
        return this.pcm16LeMono16k;
    }

    public final OpusVadFrame copy(float probability, boolean isSpeech, long startSample, int sampleCount, byte[] pcm16LeMono16k) {
        return new OpusVadFrame(probability, isSpeech, startSample, sampleCount, pcm16LeMono16k);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpusVadFrame)) {
            return false;
        }
        OpusVadFrame opusVadFrame = (OpusVadFrame) other;
        return Float.compare(this.probability, opusVadFrame.probability) == 0 && this.isSpeech == opusVadFrame.isSpeech && this.startSample == opusVadFrame.startSample && this.sampleCount == opusVadFrame.sampleCount && Intrinsics.areEqual(this.pcm16LeMono16k, opusVadFrame.pcm16LeMono16k);
    }

    public int hashCode() {
        int hashCode = ((((((Float.hashCode(this.probability) * 31) + Boolean.hashCode(this.isSpeech)) * 31) + Long.hashCode(this.startSample)) * 31) + Integer.hashCode(this.sampleCount)) * 31;
        byte[] bArr = this.pcm16LeMono16k;
        return hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr));
    }

    public String toString() {
        return "OpusVadFrame(probability=" + this.probability + ", isSpeech=" + this.isSpeech + ", startSample=" + this.startSample + ", sampleCount=" + this.sampleCount + ", pcm16LeMono16k=" + Arrays.toString(this.pcm16LeMono16k) + ')';
    }

    public OpusVadFrame(float f, boolean z, long j, int i, byte[] bArr) {
        this.probability = f;
        this.isSpeech = z;
        this.startSample = j;
        this.sampleCount = i;
        this.pcm16LeMono16k = bArr;
    }

    public /* synthetic */ OpusVadFrame(float f, boolean z, long j, int i, byte[] bArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, z, j, i, (i2 & 16) != 0 ? null : bArr);
    }

    public final float getProbability() {
        return this.probability;
    }

    public final boolean isSpeech() {
        return this.isSpeech;
    }

    public final long getStartSample() {
        return this.startSample;
    }

    public final int getSampleCount() {
        return this.sampleCount;
    }

    public final byte[] getPcm16LeMono16k() {
        return this.pcm16LeMono16k;
    }

    public final long getStartTimeMs() {
        return (this.startSample * 1000) / 16000;
    }

    public final double getDurationMs() {
        return this.sampleCount / 16.0d;
    }

    public final OpusVadFrame copy(float probability, boolean isSpeech, long startSample, int sampleCount) {
        return copy(probability, isSpeech, startSample, sampleCount, this.pcm16LeMono16k);
    }

    /* compiled from: OpusVadFrame.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JB\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0007¨\u0006\u0010"}, d2 = {"Lcom/squady/silerovad/OpusVadFrame$Companion;", "", "()V", "copy$default", "Lcom/squady/silerovad/OpusVadFrame;", "frame", "probability", "", "isSpeech", "", "startSample", "", "sampleCount", "", "mask", "unused", "silero-vad_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final /* synthetic */ OpusVadFrame copy$default(OpusVadFrame frame, float probability, boolean isSpeech, long startSample, int sampleCount, int mask, Object unused) {
            Intrinsics.checkNotNullParameter(frame, "frame");
            if ((mask & 1) != 0) {
                probability = frame.getProbability();
            }
            float f = probability;
            if ((mask & 2) != 0) {
                isSpeech = frame.isSpeech();
            }
            boolean z = isSpeech;
            if ((mask & 4) != 0) {
                startSample = frame.getStartSample();
            }
            long j = startSample;
            if ((mask & 8) != 0) {
                sampleCount = frame.getSampleCount();
            }
            return frame.copy(f, z, j, sampleCount, frame.getPcm16LeMono16k());
        }
    }
}
