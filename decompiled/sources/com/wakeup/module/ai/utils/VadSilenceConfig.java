package com.wakeup.module.ai.utils;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* compiled from: VadSilenceDetector.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/wakeup/module/ai/utils/VadSilenceConfig;", "", "speechThreshold", "", "speechFramesRequired", "", "silenceFramesRequired", "<init>", "(FII)V", "getSpeechThreshold", "()F", "getSpeechFramesRequired", "()I", "getSilenceFramesRequired", "silenceThreshold", "getSilenceThreshold", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class VadSilenceConfig {
    public static final int DEFAULT_SILENCE_FRAMES_REQUIRED = 8;
    public static final int DEFAULT_SPEECH_FRAMES_REQUIRED = 3;
    public static final float DEFAULT_SPEECH_THRESHOLD = 0.6f;
    public static final float MAX_SPEECH_THRESHOLD = 0.95f;
    public static final float MIN_SILENCE_THRESHOLD = 0.05f;
    public static final float MIN_SPEECH_THRESHOLD = 0.1f;
    public static final float SILENCE_THRESHOLD_GAP = 0.25f;
    private final int silenceFramesRequired;
    private final float silenceThreshold;
    private final int speechFramesRequired;
    private final float speechThreshold;

    public VadSilenceConfig() {
        this(0.0f, 0, 0, 7, null);
    }

    public static /* synthetic */ VadSilenceConfig copy$default(VadSilenceConfig vadSilenceConfig, float f, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            f = vadSilenceConfig.speechThreshold;
        }
        if ((i3 & 2) != 0) {
            i = vadSilenceConfig.speechFramesRequired;
        }
        if ((i3 & 4) != 0) {
            i2 = vadSilenceConfig.silenceFramesRequired;
        }
        return vadSilenceConfig.copy(f, i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final float getSpeechThreshold() {
        return this.speechThreshold;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSpeechFramesRequired() {
        return this.speechFramesRequired;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSilenceFramesRequired() {
        return this.silenceFramesRequired;
    }

    public final VadSilenceConfig copy(float speechThreshold, int speechFramesRequired, int silenceFramesRequired) {
        return new VadSilenceConfig(speechThreshold, speechFramesRequired, silenceFramesRequired);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VadSilenceConfig)) {
            return false;
        }
        VadSilenceConfig vadSilenceConfig = (VadSilenceConfig) other;
        return Float.compare(this.speechThreshold, vadSilenceConfig.speechThreshold) == 0 && this.speechFramesRequired == vadSilenceConfig.speechFramesRequired && this.silenceFramesRequired == vadSilenceConfig.silenceFramesRequired;
    }

    public int hashCode() {
        return (((Float.hashCode(this.speechThreshold) * 31) + Integer.hashCode(this.speechFramesRequired)) * 31) + Integer.hashCode(this.silenceFramesRequired);
    }

    public String toString() {
        return "VadSilenceConfig(speechThreshold=" + this.speechThreshold + ", speechFramesRequired=" + this.speechFramesRequired + ", silenceFramesRequired=" + this.silenceFramesRequired + Separators.RPAREN;
    }

    public VadSilenceConfig(float f, int i, int i2) {
        this.speechThreshold = f;
        this.speechFramesRequired = i;
        this.silenceFramesRequired = i2;
        this.silenceThreshold = RangesKt.coerceAtLeast(f - 0.25f, 0.05f);
        if (0.1f > f || f > 0.95f) {
            throw new IllegalArgumentException("speechThreshold must be between 0.1 and 0.95".toString());
        }
        if (i <= 0) {
            throw new IllegalArgumentException("speechFramesRequired must be > 0".toString());
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("silenceFramesRequired must be > 0".toString());
        }
    }

    public /* synthetic */ VadSilenceConfig(float f, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0.6f : f, (i3 & 2) != 0 ? 3 : i, (i3 & 4) != 0 ? 8 : i2);
    }

    public final float getSpeechThreshold() {
        return this.speechThreshold;
    }

    public final int getSpeechFramesRequired() {
        return this.speechFramesRequired;
    }

    public final int getSilenceFramesRequired() {
        return this.silenceFramesRequired;
    }

    public final float getSilenceThreshold() {
        return this.silenceThreshold;
    }
}
