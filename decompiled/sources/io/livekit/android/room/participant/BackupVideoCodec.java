package io.livekit.android.room.participant;

import io.livekit.android.room.track.VideoEncoding;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LocalParticipant.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lio/livekit/android/room/participant/BackupVideoCodec;", "", "codec", "", "encoding", "Lio/livekit/android/room/track/VideoEncoding;", "simulcast", "", "(Ljava/lang/String;Lio/livekit/android/room/track/VideoEncoding;Z)V", "getCodec", "()Ljava/lang/String;", "getEncoding", "()Lio/livekit/android/room/track/VideoEncoding;", "getSimulcast", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BackupVideoCodec {
    private final String codec;
    private final VideoEncoding encoding;
    private final boolean simulcast;

    public BackupVideoCodec() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ BackupVideoCodec copy$default(BackupVideoCodec backupVideoCodec, String str, VideoEncoding videoEncoding, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = backupVideoCodec.codec;
        }
        if ((i & 2) != 0) {
            videoEncoding = backupVideoCodec.encoding;
        }
        if ((i & 4) != 0) {
            z = backupVideoCodec.simulcast;
        }
        return backupVideoCodec.copy(str, videoEncoding, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCodec() {
        return this.codec;
    }

    /* renamed from: component2, reason: from getter */
    public final VideoEncoding getEncoding() {
        return this.encoding;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSimulcast() {
        return this.simulcast;
    }

    public final BackupVideoCodec copy(String codec, VideoEncoding encoding, boolean simulcast) {
        Intrinsics.checkNotNullParameter(codec, "codec");
        return new BackupVideoCodec(codec, encoding, simulcast);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BackupVideoCodec)) {
            return false;
        }
        BackupVideoCodec backupVideoCodec = (BackupVideoCodec) other;
        return Intrinsics.areEqual(this.codec, backupVideoCodec.codec) && Intrinsics.areEqual(this.encoding, backupVideoCodec.encoding) && this.simulcast == backupVideoCodec.simulcast;
    }

    public int hashCode() {
        int hashCode = this.codec.hashCode() * 31;
        VideoEncoding videoEncoding = this.encoding;
        return ((hashCode + (videoEncoding == null ? 0 : videoEncoding.hashCode())) * 31) + Boolean.hashCode(this.simulcast);
    }

    public String toString() {
        return "BackupVideoCodec(codec=" + this.codec + ", encoding=" + this.encoding + ", simulcast=" + this.simulcast + ')';
    }

    public BackupVideoCodec(String codec, VideoEncoding videoEncoding, boolean z) {
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.codec = codec;
        this.encoding = videoEncoding;
        this.simulcast = z;
    }

    public /* synthetic */ BackupVideoCodec(String str, VideoEncoding videoEncoding, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "vp8" : str, (i & 2) != 0 ? null : videoEncoding, (i & 4) != 0 ? true : z);
    }

    public final String getCodec() {
        return this.codec;
    }

    public final VideoEncoding getEncoding() {
        return this.encoding;
    }

    public final boolean getSimulcast() {
        return this.simulcast;
    }
}
