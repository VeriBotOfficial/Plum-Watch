package io.livekit.android.room.participant;

import io.livekit.android.room.track.VideoCodec;
import io.livekit.android.room.track.VideoEncoding;
import io.livekit.android.room.track.VideoPreset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import livekit.org.webrtc.RtpParameters;

/* compiled from: LocalParticipant.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J_\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lio/livekit/android/room/participant/VideoTrackPublishDefaults;", "Lio/livekit/android/room/participant/BaseVideoTrackPublishOptions;", "videoEncoding", "Lio/livekit/android/room/track/VideoEncoding;", "simulcast", "", "videoCodec", "", "scalabilityMode", "backupCodec", "Lio/livekit/android/room/participant/BackupVideoCodec;", "degradationPreference", "Llivekit/org/webrtc/RtpParameters$DegradationPreference;", "simulcastLayers", "", "Lio/livekit/android/room/track/VideoPreset;", "(Lio/livekit/android/room/track/VideoEncoding;ZLjava/lang/String;Ljava/lang/String;Lio/livekit/android/room/participant/BackupVideoCodec;Llivekit/org/webrtc/RtpParameters$DegradationPreference;Ljava/util/List;)V", "getBackupCodec", "()Lio/livekit/android/room/participant/BackupVideoCodec;", "getDegradationPreference", "()Llivekit/org/webrtc/RtpParameters$DegradationPreference;", "getScalabilityMode", "()Ljava/lang/String;", "getSimulcast", "()Z", "getSimulcastLayers", "()Ljava/util/List;", "getVideoCodec", "getVideoEncoding", "()Lio/livekit/android/room/track/VideoEncoding;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class VideoTrackPublishDefaults extends BaseVideoTrackPublishOptions {
    private final BackupVideoCodec backupCodec;
    private final RtpParameters.DegradationPreference degradationPreference;
    private final String scalabilityMode;
    private final boolean simulcast;
    private final List<VideoPreset> simulcastLayers;
    private final String videoCodec;
    private final VideoEncoding videoEncoding;

    public VideoTrackPublishDefaults() {
        this(null, false, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ VideoTrackPublishDefaults copy$default(VideoTrackPublishDefaults videoTrackPublishDefaults, VideoEncoding videoEncoding, boolean z, String str, String str2, BackupVideoCodec backupVideoCodec, RtpParameters.DegradationPreference degradationPreference, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            videoEncoding = videoTrackPublishDefaults.videoEncoding;
        }
        if ((i & 2) != 0) {
            z = videoTrackPublishDefaults.simulcast;
        }
        if ((i & 4) != 0) {
            str = videoTrackPublishDefaults.videoCodec;
        }
        if ((i & 8) != 0) {
            str2 = videoTrackPublishDefaults.scalabilityMode;
        }
        if ((i & 16) != 0) {
            backupVideoCodec = videoTrackPublishDefaults.backupCodec;
        }
        if ((i & 32) != 0) {
            degradationPreference = videoTrackPublishDefaults.degradationPreference;
        }
        if ((i & 64) != 0) {
            list = videoTrackPublishDefaults.simulcastLayers;
        }
        RtpParameters.DegradationPreference degradationPreference2 = degradationPreference;
        List list2 = list;
        BackupVideoCodec backupVideoCodec2 = backupVideoCodec;
        String str3 = str;
        return videoTrackPublishDefaults.copy(videoEncoding, z, str3, str2, backupVideoCodec2, degradationPreference2, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final VideoEncoding getVideoEncoding() {
        return this.videoEncoding;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSimulcast() {
        return this.simulcast;
    }

    /* renamed from: component3, reason: from getter */
    public final String getVideoCodec() {
        return this.videoCodec;
    }

    /* renamed from: component4, reason: from getter */
    public final String getScalabilityMode() {
        return this.scalabilityMode;
    }

    /* renamed from: component5, reason: from getter */
    public final BackupVideoCodec getBackupCodec() {
        return this.backupCodec;
    }

    /* renamed from: component6, reason: from getter */
    public final RtpParameters.DegradationPreference getDegradationPreference() {
        return this.degradationPreference;
    }

    public final List<VideoPreset> component7() {
        return this.simulcastLayers;
    }

    public final VideoTrackPublishDefaults copy(VideoEncoding videoEncoding, boolean simulcast, String videoCodec, String scalabilityMode, BackupVideoCodec backupCodec, RtpParameters.DegradationPreference degradationPreference, List<? extends VideoPreset> simulcastLayers) {
        Intrinsics.checkNotNullParameter(videoCodec, "videoCodec");
        return new VideoTrackPublishDefaults(videoEncoding, simulcast, videoCodec, scalabilityMode, backupCodec, degradationPreference, simulcastLayers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoTrackPublishDefaults)) {
            return false;
        }
        VideoTrackPublishDefaults videoTrackPublishDefaults = (VideoTrackPublishDefaults) other;
        return Intrinsics.areEqual(this.videoEncoding, videoTrackPublishDefaults.videoEncoding) && this.simulcast == videoTrackPublishDefaults.simulcast && Intrinsics.areEqual(this.videoCodec, videoTrackPublishDefaults.videoCodec) && Intrinsics.areEqual(this.scalabilityMode, videoTrackPublishDefaults.scalabilityMode) && Intrinsics.areEqual(this.backupCodec, videoTrackPublishDefaults.backupCodec) && this.degradationPreference == videoTrackPublishDefaults.degradationPreference && Intrinsics.areEqual(this.simulcastLayers, videoTrackPublishDefaults.simulcastLayers);
    }

    public int hashCode() {
        VideoEncoding videoEncoding = this.videoEncoding;
        int hashCode = (((((videoEncoding == null ? 0 : videoEncoding.hashCode()) * 31) + Boolean.hashCode(this.simulcast)) * 31) + this.videoCodec.hashCode()) * 31;
        String str = this.scalabilityMode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BackupVideoCodec backupVideoCodec = this.backupCodec;
        int hashCode3 = (hashCode2 + (backupVideoCodec == null ? 0 : backupVideoCodec.hashCode())) * 31;
        RtpParameters.DegradationPreference degradationPreference = this.degradationPreference;
        int hashCode4 = (hashCode3 + (degradationPreference == null ? 0 : degradationPreference.hashCode())) * 31;
        List<VideoPreset> list = this.simulcastLayers;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "VideoTrackPublishDefaults(videoEncoding=" + this.videoEncoding + ", simulcast=" + this.simulcast + ", videoCodec=" + this.videoCodec + ", scalabilityMode=" + this.scalabilityMode + ", backupCodec=" + this.backupCodec + ", degradationPreference=" + this.degradationPreference + ", simulcastLayers=" + this.simulcastLayers + ')';
    }

    @Override // io.livekit.android.room.participant.BaseVideoTrackPublishOptions
    public VideoEncoding getVideoEncoding() {
        return this.videoEncoding;
    }

    @Override // io.livekit.android.room.participant.BaseVideoTrackPublishOptions
    public boolean getSimulcast() {
        return this.simulcast;
    }

    public /* synthetic */ VideoTrackPublishDefaults(VideoEncoding videoEncoding, boolean z, String str, String str2, BackupVideoCodec backupVideoCodec, RtpParameters.DegradationPreference degradationPreference, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : videoEncoding, (i & 2) != 0 ? true : z, (i & 4) != 0 ? VideoCodec.VP8.getCodecName() : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : backupVideoCodec, (i & 32) != 0 ? null : degradationPreference, (i & 64) != 0 ? null : list);
    }

    @Override // io.livekit.android.room.participant.BaseVideoTrackPublishOptions
    public String getVideoCodec() {
        return this.videoCodec;
    }

    @Override // io.livekit.android.room.participant.BaseVideoTrackPublishOptions
    public String getScalabilityMode() {
        return this.scalabilityMode;
    }

    @Override // io.livekit.android.room.participant.BaseVideoTrackPublishOptions
    public BackupVideoCodec getBackupCodec() {
        return this.backupCodec;
    }

    @Override // io.livekit.android.room.participant.BaseVideoTrackPublishOptions
    public RtpParameters.DegradationPreference getDegradationPreference() {
        return this.degradationPreference;
    }

    @Override // io.livekit.android.room.participant.BaseVideoTrackPublishOptions
    public List<VideoPreset> getSimulcastLayers() {
        return this.simulcastLayers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoTrackPublishDefaults(VideoEncoding videoEncoding, boolean z, String videoCodec, String str, BackupVideoCodec backupVideoCodec, RtpParameters.DegradationPreference degradationPreference, List<? extends VideoPreset> list) {
        Intrinsics.checkNotNullParameter(videoCodec, "videoCodec");
        this.videoEncoding = videoEncoding;
        this.simulcast = z;
        this.videoCodec = videoCodec;
        this.scalabilityMode = str;
        this.backupCodec = backupVideoCodec;
        this.degradationPreference = degradationPreference;
        this.simulcastLayers = list;
    }
}
