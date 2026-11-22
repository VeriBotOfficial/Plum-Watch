package com.newtype.sdkcore.vad;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VADTypes.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006%"}, d2 = {"Lcom/newtype/sdkcore/vad/VADOptions;", "", "sampleRate", "", "positiveSpeechThreshold", "", "negativeSpeechThreshold", "minSpeechFramesMs", "minSilenceFramesMs", "speechPadMs", "speechPreRollMs", "<init>", "(IFFIIII)V", "getSampleRate", "()I", "getPositiveSpeechThreshold", "()F", "getNegativeSpeechThreshold", "getMinSpeechFramesMs", "getMinSilenceFramesMs", "getSpeechPadMs", "getSpeechPreRollMs", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "newtypesdkcore_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VADOptions {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int minSilenceFramesMs;
    private final int minSpeechFramesMs;
    private final float negativeSpeechThreshold;
    private final float positiveSpeechThreshold;
    private final int sampleRate;
    private final int speechPadMs;
    private final int speechPreRollMs;

    public VADOptions() {
        this(0, 0.0f, 0.0f, 0, 0, 0, 0, 127, null);
    }

    public static /* synthetic */ VADOptions copy$default(VADOptions vADOptions, int i, float f, float f2, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = vADOptions.sampleRate;
        }
        if ((i6 & 2) != 0) {
            f = vADOptions.positiveSpeechThreshold;
        }
        if ((i6 & 4) != 0) {
            f2 = vADOptions.negativeSpeechThreshold;
        }
        if ((i6 & 8) != 0) {
            i2 = vADOptions.minSpeechFramesMs;
        }
        if ((i6 & 16) != 0) {
            i3 = vADOptions.minSilenceFramesMs;
        }
        if ((i6 & 32) != 0) {
            i4 = vADOptions.speechPadMs;
        }
        if ((i6 & 64) != 0) {
            i5 = vADOptions.speechPreRollMs;
        }
        int i7 = i4;
        int i8 = i5;
        int i9 = i3;
        float f3 = f2;
        return vADOptions.copy(i, f, f3, i2, i9, i7, i8);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSampleRate() {
        return this.sampleRate;
    }

    /* renamed from: component2, reason: from getter */
    public final float getPositiveSpeechThreshold() {
        return this.positiveSpeechThreshold;
    }

    /* renamed from: component3, reason: from getter */
    public final float getNegativeSpeechThreshold() {
        return this.negativeSpeechThreshold;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMinSpeechFramesMs() {
        return this.minSpeechFramesMs;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMinSilenceFramesMs() {
        return this.minSilenceFramesMs;
    }

    /* renamed from: component6, reason: from getter */
    public final int getSpeechPadMs() {
        return this.speechPadMs;
    }

    /* renamed from: component7, reason: from getter */
    public final int getSpeechPreRollMs() {
        return this.speechPreRollMs;
    }

    public final VADOptions copy(int sampleRate, float positiveSpeechThreshold, float negativeSpeechThreshold, int minSpeechFramesMs, int minSilenceFramesMs, int speechPadMs, int speechPreRollMs) {
        return new VADOptions(sampleRate, positiveSpeechThreshold, negativeSpeechThreshold, minSpeechFramesMs, minSilenceFramesMs, speechPadMs, speechPreRollMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VADOptions)) {
            return false;
        }
        VADOptions vADOptions = (VADOptions) other;
        return this.sampleRate == vADOptions.sampleRate && Float.compare(this.positiveSpeechThreshold, vADOptions.positiveSpeechThreshold) == 0 && Float.compare(this.negativeSpeechThreshold, vADOptions.negativeSpeechThreshold) == 0 && this.minSpeechFramesMs == vADOptions.minSpeechFramesMs && this.minSilenceFramesMs == vADOptions.minSilenceFramesMs && this.speechPadMs == vADOptions.speechPadMs && this.speechPreRollMs == vADOptions.speechPreRollMs;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.sampleRate) * 31) + Float.hashCode(this.positiveSpeechThreshold)) * 31) + Float.hashCode(this.negativeSpeechThreshold)) * 31) + Integer.hashCode(this.minSpeechFramesMs)) * 31) + Integer.hashCode(this.minSilenceFramesMs)) * 31) + Integer.hashCode(this.speechPadMs)) * 31) + Integer.hashCode(this.speechPreRollMs);
    }

    public String toString() {
        return "VADOptions(sampleRate=" + this.sampleRate + ", positiveSpeechThreshold=" + this.positiveSpeechThreshold + ", negativeSpeechThreshold=" + this.negativeSpeechThreshold + ", minSpeechFramesMs=" + this.minSpeechFramesMs + ", minSilenceFramesMs=" + this.minSilenceFramesMs + ", speechPadMs=" + this.speechPadMs + ", speechPreRollMs=" + this.speechPreRollMs + Separators.RPAREN;
    }

    public VADOptions(int i, float f, float f2, int i2, int i3, int i4, int i5) {
        this.sampleRate = i;
        this.positiveSpeechThreshold = f;
        this.negativeSpeechThreshold = f2;
        this.minSpeechFramesMs = i2;
        this.minSilenceFramesMs = i3;
        this.speechPadMs = i4;
        this.speechPreRollMs = i5;
    }

    public /* synthetic */ VADOptions(int i, float f, float f2, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 16000 : i, (i6 & 2) != 0 ? 0.5f : f, (i6 & 4) != 0 ? 0.35f : f2, (i6 & 8) != 0 ? 100 : i2, (i6 & 16) != 0 ? 500 : i3, (i6 & 32) != 0 ? 100 : i4, (i6 & 64) != 0 ? 400 : i5);
    }

    public final int getSampleRate() {
        return this.sampleRate;
    }

    public final float getPositiveSpeechThreshold() {
        return this.positiveSpeechThreshold;
    }

    public final float getNegativeSpeechThreshold() {
        return this.negativeSpeechThreshold;
    }

    public final int getMinSpeechFramesMs() {
        return this.minSpeechFramesMs;
    }

    public final int getMinSilenceFramesMs() {
        return this.minSilenceFramesMs;
    }

    public final int getSpeechPadMs() {
        return this.speechPadMs;
    }

    public final int getSpeechPreRollMs() {
        return this.speechPreRollMs;
    }

    /* compiled from: VADTypes.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/newtype/sdkcore/vad/VADOptions$Companion;", "", "<init>", "()V", "preset", "Lcom/newtype/sdkcore/vad/VADOptions;", "Lcom/newtype/sdkcore/vad/VADPreset;", "newtypesdkcore_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: VADTypes.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VADPreset.values().length];
                try {
                    iArr[VADPreset.SENSITIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[VADPreset.NATURAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[VADPreset.CHILD.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final VADOptions preset(VADPreset preset) {
            Intrinsics.checkNotNullParameter(preset, "preset");
            int i = WhenMappings.$EnumSwitchMapping$0[preset.ordinal()];
            if (i == 1) {
                return new VADOptions(16000, 0.45f, 0.3f, 80, 320, 120, 450);
            }
            if (i == 2) {
                return new VADOptions(16000, 0.5f, 0.35f, 100, 500, 100, 400);
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return new VADOptions(16000, 0.48f, 0.28f, 120, 850, 160, 520);
        }
    }
}
