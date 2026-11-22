package io.livekit.android.room.participant;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LocalParticipant.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J8\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, d2 = {"Lio/livekit/android/room/participant/AudioTrackPublishDefaults;", "Lio/livekit/android/room/participant/BaseAudioTrackPublishOptions;", "audioBitrate", "", "dtx", "", "red", "preconnect", "(Ljava/lang/Integer;ZZZ)V", "getAudioBitrate", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDtx", "()Z", "getPreconnect", "getRed", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;ZZZ)Lio/livekit/android/room/participant/AudioTrackPublishDefaults;", "equals", "other", "", "hashCode", "toString", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AudioTrackPublishDefaults extends BaseAudioTrackPublishOptions {
    private final Integer audioBitrate;
    private final boolean dtx;
    private final boolean preconnect;
    private final boolean red;

    public AudioTrackPublishDefaults() {
        this(null, false, false, false, 15, null);
    }

    public static /* synthetic */ AudioTrackPublishDefaults copy$default(AudioTrackPublishDefaults audioTrackPublishDefaults, Integer num, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = audioTrackPublishDefaults.audioBitrate;
        }
        if ((i & 2) != 0) {
            z = audioTrackPublishDefaults.dtx;
        }
        if ((i & 4) != 0) {
            z2 = audioTrackPublishDefaults.red;
        }
        if ((i & 8) != 0) {
            z3 = audioTrackPublishDefaults.preconnect;
        }
        return audioTrackPublishDefaults.copy(num, z, z2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getAudioBitrate() {
        return this.audioBitrate;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getDtx() {
        return this.dtx;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getRed() {
        return this.red;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getPreconnect() {
        return this.preconnect;
    }

    public final AudioTrackPublishDefaults copy(Integer audioBitrate, boolean dtx, boolean red, boolean preconnect) {
        return new AudioTrackPublishDefaults(audioBitrate, dtx, red, preconnect);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioTrackPublishDefaults)) {
            return false;
        }
        AudioTrackPublishDefaults audioTrackPublishDefaults = (AudioTrackPublishDefaults) other;
        return Intrinsics.areEqual(this.audioBitrate, audioTrackPublishDefaults.audioBitrate) && this.dtx == audioTrackPublishDefaults.dtx && this.red == audioTrackPublishDefaults.red && this.preconnect == audioTrackPublishDefaults.preconnect;
    }

    public int hashCode() {
        Integer num = this.audioBitrate;
        return ((((((num == null ? 0 : num.hashCode()) * 31) + Boolean.hashCode(this.dtx)) * 31) + Boolean.hashCode(this.red)) * 31) + Boolean.hashCode(this.preconnect);
    }

    public String toString() {
        return "AudioTrackPublishDefaults(audioBitrate=" + this.audioBitrate + ", dtx=" + this.dtx + ", red=" + this.red + ", preconnect=" + this.preconnect + ')';
    }

    public /* synthetic */ AudioTrackPublishDefaults(Integer num, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Integer.valueOf(AudioPresets.MUSIC.getMaxBitrate()) : num, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? false : z3);
    }

    @Override // io.livekit.android.room.participant.BaseAudioTrackPublishOptions
    public Integer getAudioBitrate() {
        return this.audioBitrate;
    }

    @Override // io.livekit.android.room.participant.BaseAudioTrackPublishOptions
    public boolean getDtx() {
        return this.dtx;
    }

    @Override // io.livekit.android.room.participant.BaseAudioTrackPublishOptions
    public boolean getRed() {
        return this.red;
    }

    @Override // io.livekit.android.room.participant.BaseAudioTrackPublishOptions
    public boolean getPreconnect() {
        return this.preconnect;
    }

    public AudioTrackPublishDefaults(Integer num, boolean z, boolean z2, boolean z3) {
        this.audioBitrate = num;
        this.dtx = z;
        this.red = z2;
        this.preconnect = z3;
    }
}
