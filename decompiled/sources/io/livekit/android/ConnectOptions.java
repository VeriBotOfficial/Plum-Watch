package io.livekit.android;

import io.livekit.android.room.ProtocolVersion;
import io.livekit.android.room.SignalClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import livekit.org.webrtc.PeerConnection;

/* compiled from: ConnectOptions.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003JO\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010)\u001a\u00020\u00032\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u000f¨\u0006."}, d2 = {"Lio/livekit/android/ConnectOptions;", "", "autoSubscribe", "", "iceServers", "", "Llivekit/org/webrtc/PeerConnection$IceServer;", "rtcConfig", "Llivekit/org/webrtc/PeerConnection$RTCConfiguration;", "audio", "video", "protocolVersion", "Lio/livekit/android/room/ProtocolVersion;", "(ZLjava/util/List;Llivekit/org/webrtc/PeerConnection$RTCConfiguration;ZZLio/livekit/android/room/ProtocolVersion;)V", "getAudio", "()Z", "getAutoSubscribe", "getIceServers", "()Ljava/util/List;", "participantSid", "", "getParticipantSid$livekit_android_sdk_release", "()Ljava/lang/String;", "setParticipantSid$livekit_android_sdk_release", "(Ljava/lang/String;)V", "getProtocolVersion", "()Lio/livekit/android/room/ProtocolVersion;", SignalClient.CONNECT_QUERY_RECONNECT, "getReconnect$livekit_android_sdk_release", "setReconnect$livekit_android_sdk_release", "(Z)V", "getRtcConfig", "()Llivekit/org/webrtc/PeerConnection$RTCConfiguration;", "getVideo", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ConnectOptions {
    private final boolean audio;
    private final boolean autoSubscribe;
    private final List<PeerConnection.IceServer> iceServers;
    private String participantSid;
    private final ProtocolVersion protocolVersion;
    private boolean reconnect;
    private final PeerConnection.RTCConfiguration rtcConfig;
    private final boolean video;

    public ConnectOptions() {
        this(false, null, null, false, false, null, 63, null);
    }

    public static /* synthetic */ ConnectOptions copy$default(ConnectOptions connectOptions, boolean z, List list, PeerConnection.RTCConfiguration rTCConfiguration, boolean z2, boolean z3, ProtocolVersion protocolVersion, int i, Object obj) {
        if ((i & 1) != 0) {
            z = connectOptions.autoSubscribe;
        }
        if ((i & 2) != 0) {
            list = connectOptions.iceServers;
        }
        if ((i & 4) != 0) {
            rTCConfiguration = connectOptions.rtcConfig;
        }
        if ((i & 8) != 0) {
            z2 = connectOptions.audio;
        }
        if ((i & 16) != 0) {
            z3 = connectOptions.video;
        }
        if ((i & 32) != 0) {
            protocolVersion = connectOptions.protocolVersion;
        }
        boolean z4 = z3;
        ProtocolVersion protocolVersion2 = protocolVersion;
        return connectOptions.copy(z, list, rTCConfiguration, z2, z4, protocolVersion2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAutoSubscribe() {
        return this.autoSubscribe;
    }

    public final List<PeerConnection.IceServer> component2() {
        return this.iceServers;
    }

    /* renamed from: component3, reason: from getter */
    public final PeerConnection.RTCConfiguration getRtcConfig() {
        return this.rtcConfig;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getAudio() {
        return this.audio;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getVideo() {
        return this.video;
    }

    /* renamed from: component6, reason: from getter */
    public final ProtocolVersion getProtocolVersion() {
        return this.protocolVersion;
    }

    public final ConnectOptions copy(boolean autoSubscribe, List<? extends PeerConnection.IceServer> iceServers, PeerConnection.RTCConfiguration rtcConfig, boolean audio, boolean video, ProtocolVersion protocolVersion) {
        Intrinsics.checkNotNullParameter(protocolVersion, "protocolVersion");
        return new ConnectOptions(autoSubscribe, iceServers, rtcConfig, audio, video, protocolVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectOptions)) {
            return false;
        }
        ConnectOptions connectOptions = (ConnectOptions) other;
        return this.autoSubscribe == connectOptions.autoSubscribe && Intrinsics.areEqual(this.iceServers, connectOptions.iceServers) && Intrinsics.areEqual(this.rtcConfig, connectOptions.rtcConfig) && this.audio == connectOptions.audio && this.video == connectOptions.video && this.protocolVersion == connectOptions.protocolVersion;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.autoSubscribe) * 31;
        List<PeerConnection.IceServer> list = this.iceServers;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        PeerConnection.RTCConfiguration rTCConfiguration = this.rtcConfig;
        return ((((((hashCode2 + (rTCConfiguration != null ? rTCConfiguration.hashCode() : 0)) * 31) + Boolean.hashCode(this.audio)) * 31) + Boolean.hashCode(this.video)) * 31) + this.protocolVersion.hashCode();
    }

    public String toString() {
        return "ConnectOptions(autoSubscribe=" + this.autoSubscribe + ", iceServers=" + this.iceServers + ", rtcConfig=" + this.rtcConfig + ", audio=" + this.audio + ", video=" + this.video + ", protocolVersion=" + this.protocolVersion + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConnectOptions(boolean z, List<? extends PeerConnection.IceServer> list, PeerConnection.RTCConfiguration rTCConfiguration, boolean z2, boolean z3, ProtocolVersion protocolVersion) {
        Intrinsics.checkNotNullParameter(protocolVersion, "protocolVersion");
        this.autoSubscribe = z;
        this.iceServers = list;
        this.rtcConfig = rTCConfiguration;
        this.audio = z2;
        this.video = z3;
        this.protocolVersion = protocolVersion;
    }

    public final boolean getAutoSubscribe() {
        return this.autoSubscribe;
    }

    public final List<PeerConnection.IceServer> getIceServers() {
        return this.iceServers;
    }

    public final PeerConnection.RTCConfiguration getRtcConfig() {
        return this.rtcConfig;
    }

    public final boolean getAudio() {
        return this.audio;
    }

    public final boolean getVideo() {
        return this.video;
    }

    public /* synthetic */ ConnectOptions(boolean z, List list, PeerConnection.RTCConfiguration rTCConfiguration, boolean z2, boolean z3, ProtocolVersion protocolVersion, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : rTCConfiguration, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? ProtocolVersion.v13 : protocolVersion);
    }

    public final ProtocolVersion getProtocolVersion() {
        return this.protocolVersion;
    }

    /* renamed from: getReconnect$livekit_android_sdk_release, reason: from getter */
    public final boolean getReconnect() {
        return this.reconnect;
    }

    public final void setReconnect$livekit_android_sdk_release(boolean z) {
        this.reconnect = z;
    }

    /* renamed from: getParticipantSid$livekit_android_sdk_release, reason: from getter */
    public final String getParticipantSid() {
        return this.participantSid;
    }

    public final void setParticipantSid$livekit_android_sdk_release(String str) {
        this.participantSid = str;
    }
}
