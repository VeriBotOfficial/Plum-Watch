package io.livekit.android.room.track;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: LocalAudioTrackOptions.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lio/livekit/android/room/track/LocalAudioTrackOptions;", "", "noiseSuppression", "", "echoCancellation", "autoGainControl", "highPassFilter", "typingNoiseDetection", "(ZZZZZ)V", "getAutoGainControl", "()Z", "getEchoCancellation", "getHighPassFilter", "getNoiseSuppression", "getTypingNoiseDetection", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class LocalAudioTrackOptions {
    private final boolean autoGainControl;
    private final boolean echoCancellation;
    private final boolean highPassFilter;
    private final boolean noiseSuppression;
    private final boolean typingNoiseDetection;

    public LocalAudioTrackOptions() {
        this(false, false, false, false, false, 31, null);
    }

    public static /* synthetic */ LocalAudioTrackOptions copy$default(LocalAudioTrackOptions localAudioTrackOptions, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = localAudioTrackOptions.noiseSuppression;
        }
        if ((i & 2) != 0) {
            z2 = localAudioTrackOptions.echoCancellation;
        }
        if ((i & 4) != 0) {
            z3 = localAudioTrackOptions.autoGainControl;
        }
        if ((i & 8) != 0) {
            z4 = localAudioTrackOptions.highPassFilter;
        }
        if ((i & 16) != 0) {
            z5 = localAudioTrackOptions.typingNoiseDetection;
        }
        boolean z6 = z5;
        boolean z7 = z3;
        return localAudioTrackOptions.copy(z, z2, z7, z4, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getNoiseSuppression() {
        return this.noiseSuppression;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEchoCancellation() {
        return this.echoCancellation;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getAutoGainControl() {
        return this.autoGainControl;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHighPassFilter() {
        return this.highPassFilter;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getTypingNoiseDetection() {
        return this.typingNoiseDetection;
    }

    public final LocalAudioTrackOptions copy(boolean noiseSuppression, boolean echoCancellation, boolean autoGainControl, boolean highPassFilter, boolean typingNoiseDetection) {
        return new LocalAudioTrackOptions(noiseSuppression, echoCancellation, autoGainControl, highPassFilter, typingNoiseDetection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalAudioTrackOptions)) {
            return false;
        }
        LocalAudioTrackOptions localAudioTrackOptions = (LocalAudioTrackOptions) other;
        return this.noiseSuppression == localAudioTrackOptions.noiseSuppression && this.echoCancellation == localAudioTrackOptions.echoCancellation && this.autoGainControl == localAudioTrackOptions.autoGainControl && this.highPassFilter == localAudioTrackOptions.highPassFilter && this.typingNoiseDetection == localAudioTrackOptions.typingNoiseDetection;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.noiseSuppression) * 31) + Boolean.hashCode(this.echoCancellation)) * 31) + Boolean.hashCode(this.autoGainControl)) * 31) + Boolean.hashCode(this.highPassFilter)) * 31) + Boolean.hashCode(this.typingNoiseDetection);
    }

    public String toString() {
        return "LocalAudioTrackOptions(noiseSuppression=" + this.noiseSuppression + ", echoCancellation=" + this.echoCancellation + ", autoGainControl=" + this.autoGainControl + ", highPassFilter=" + this.highPassFilter + ", typingNoiseDetection=" + this.typingNoiseDetection + ')';
    }

    public LocalAudioTrackOptions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.noiseSuppression = z;
        this.echoCancellation = z2;
        this.autoGainControl = z3;
        this.highPassFilter = z4;
        this.typingNoiseDetection = z5;
    }

    public /* synthetic */ LocalAudioTrackOptions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? true : z4, (i & 16) != 0 ? true : z5);
    }

    public final boolean getNoiseSuppression() {
        return this.noiseSuppression;
    }

    public final boolean getEchoCancellation() {
        return this.echoCancellation;
    }

    public final boolean getAutoGainControl() {
        return this.autoGainControl;
    }

    public final boolean getHighPassFilter() {
        return this.highPassFilter;
    }

    public final boolean getTypingNoiseDetection() {
        return this.typingNoiseDetection;
    }
}
