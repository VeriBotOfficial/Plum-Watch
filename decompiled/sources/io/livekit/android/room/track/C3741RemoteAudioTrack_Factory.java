package io.livekit.android.room.track;

import io.livekit.android.webrtc.peerconnection.RTCThreadToken;
import javax.inject.Provider;
import livekit.org.webrtc.RtpReceiver;

/* renamed from: io.livekit.android.room.track.RemoteAudioTrack_Factory, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3741RemoteAudioTrack_Factory {
    private final Provider<RTCThreadToken> rtcThreadTokenProvider;

    public C3741RemoteAudioTrack_Factory(Provider<RTCThreadToken> provider) {
        this.rtcThreadTokenProvider = provider;
    }

    public RemoteAudioTrack get(String str, livekit.org.webrtc.AudioTrack audioTrack, RtpReceiver rtpReceiver) {
        return newInstance(str, audioTrack, rtpReceiver, this.rtcThreadTokenProvider.get());
    }

    public static C3741RemoteAudioTrack_Factory create(Provider<RTCThreadToken> provider) {
        return new C3741RemoteAudioTrack_Factory(provider);
    }

    public static RemoteAudioTrack newInstance(String str, livekit.org.webrtc.AudioTrack audioTrack, RtpReceiver rtpReceiver, RTCThreadToken rTCThreadToken) {
        return new RemoteAudioTrack(str, audioTrack, rtpReceiver, rTCThreadToken);
    }
}
