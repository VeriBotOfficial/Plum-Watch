package io.livekit.android.room;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PeerConnectionTransport.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lio/livekit/android/room/TrackBitrateInfo;", "", "codec", "", "maxBitrate", "", "(Ljava/lang/String;J)V", "getCodec", "()Ljava/lang/String;", "getMaxBitrate", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TrackBitrateInfo {
    private final String codec;
    private final long maxBitrate;

    public static /* synthetic */ TrackBitrateInfo copy$default(TrackBitrateInfo trackBitrateInfo, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trackBitrateInfo.codec;
        }
        if ((i & 2) != 0) {
            j = trackBitrateInfo.maxBitrate;
        }
        return trackBitrateInfo.copy(str, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCodec() {
        return this.codec;
    }

    /* renamed from: component2, reason: from getter */
    public final long getMaxBitrate() {
        return this.maxBitrate;
    }

    public final TrackBitrateInfo copy(String codec, long maxBitrate) {
        Intrinsics.checkNotNullParameter(codec, "codec");
        return new TrackBitrateInfo(codec, maxBitrate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackBitrateInfo)) {
            return false;
        }
        TrackBitrateInfo trackBitrateInfo = (TrackBitrateInfo) other;
        return Intrinsics.areEqual(this.codec, trackBitrateInfo.codec) && this.maxBitrate == trackBitrateInfo.maxBitrate;
    }

    public int hashCode() {
        return (this.codec.hashCode() * 31) + Long.hashCode(this.maxBitrate);
    }

    public String toString() {
        return "TrackBitrateInfo(codec=" + this.codec + ", maxBitrate=" + this.maxBitrate + ')';
    }

    public TrackBitrateInfo(String codec, long j) {
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.codec = codec;
        this.maxBitrate = j;
    }

    public final String getCodec() {
        return this.codec;
    }

    public final long getMaxBitrate() {
        return this.maxBitrate;
    }
}
