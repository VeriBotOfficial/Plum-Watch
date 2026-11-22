package io.livekit.android.audio;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AudioProcessorOptions.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lio/livekit/android/audio/AudioProcessorOptions;", "", "capturePostProcessor", "Lio/livekit/android/audio/AudioProcessorInterface;", "capturePostBypass", "", "renderPreProcessor", "renderPreBypass", "(Lio/livekit/android/audio/AudioProcessorInterface;ZLio/livekit/android/audio/AudioProcessorInterface;Z)V", "getCapturePostBypass", "()Z", "getCapturePostProcessor", "()Lio/livekit/android/audio/AudioProcessorInterface;", "getRenderPreBypass", "getRenderPreProcessor", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AudioProcessorOptions {
    private final boolean capturePostBypass;
    private final AudioProcessorInterface capturePostProcessor;
    private final boolean renderPreBypass;
    private final AudioProcessorInterface renderPreProcessor;

    public AudioProcessorOptions() {
        this(null, false, null, false, 15, null);
    }

    public static /* synthetic */ AudioProcessorOptions copy$default(AudioProcessorOptions audioProcessorOptions, AudioProcessorInterface audioProcessorInterface, boolean z, AudioProcessorInterface audioProcessorInterface2, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            audioProcessorInterface = audioProcessorOptions.capturePostProcessor;
        }
        if ((i & 2) != 0) {
            z = audioProcessorOptions.capturePostBypass;
        }
        if ((i & 4) != 0) {
            audioProcessorInterface2 = audioProcessorOptions.renderPreProcessor;
        }
        if ((i & 8) != 0) {
            z2 = audioProcessorOptions.renderPreBypass;
        }
        return audioProcessorOptions.copy(audioProcessorInterface, z, audioProcessorInterface2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final AudioProcessorInterface getCapturePostProcessor() {
        return this.capturePostProcessor;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCapturePostBypass() {
        return this.capturePostBypass;
    }

    /* renamed from: component3, reason: from getter */
    public final AudioProcessorInterface getRenderPreProcessor() {
        return this.renderPreProcessor;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getRenderPreBypass() {
        return this.renderPreBypass;
    }

    public final AudioProcessorOptions copy(AudioProcessorInterface capturePostProcessor, boolean capturePostBypass, AudioProcessorInterface renderPreProcessor, boolean renderPreBypass) {
        return new AudioProcessorOptions(capturePostProcessor, capturePostBypass, renderPreProcessor, renderPreBypass);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioProcessorOptions)) {
            return false;
        }
        AudioProcessorOptions audioProcessorOptions = (AudioProcessorOptions) other;
        return Intrinsics.areEqual(this.capturePostProcessor, audioProcessorOptions.capturePostProcessor) && this.capturePostBypass == audioProcessorOptions.capturePostBypass && Intrinsics.areEqual(this.renderPreProcessor, audioProcessorOptions.renderPreProcessor) && this.renderPreBypass == audioProcessorOptions.renderPreBypass;
    }

    public int hashCode() {
        AudioProcessorInterface audioProcessorInterface = this.capturePostProcessor;
        int hashCode = (((audioProcessorInterface == null ? 0 : audioProcessorInterface.hashCode()) * 31) + Boolean.hashCode(this.capturePostBypass)) * 31;
        AudioProcessorInterface audioProcessorInterface2 = this.renderPreProcessor;
        return ((hashCode + (audioProcessorInterface2 != null ? audioProcessorInterface2.hashCode() : 0)) * 31) + Boolean.hashCode(this.renderPreBypass);
    }

    public String toString() {
        return "AudioProcessorOptions(capturePostProcessor=" + this.capturePostProcessor + ", capturePostBypass=" + this.capturePostBypass + ", renderPreProcessor=" + this.renderPreProcessor + ", renderPreBypass=" + this.renderPreBypass + ')';
    }

    public AudioProcessorOptions(AudioProcessorInterface audioProcessorInterface, boolean z, AudioProcessorInterface audioProcessorInterface2, boolean z2) {
        this.capturePostProcessor = audioProcessorInterface;
        this.capturePostBypass = z;
        this.renderPreProcessor = audioProcessorInterface2;
        this.renderPreBypass = z2;
    }

    public /* synthetic */ AudioProcessorOptions(AudioProcessorInterface audioProcessorInterface, boolean z, AudioProcessorInterface audioProcessorInterface2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : audioProcessorInterface, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : audioProcessorInterface2, (i & 8) != 0 ? false : z2);
    }

    public final AudioProcessorInterface getCapturePostProcessor() {
        return this.capturePostProcessor;
    }

    public final boolean getCapturePostBypass() {
        return this.capturePostBypass;
    }

    public final AudioProcessorInterface getRenderPreProcessor() {
        return this.renderPreProcessor;
    }

    public final boolean getRenderPreBypass() {
        return this.renderPreBypass;
    }
}
