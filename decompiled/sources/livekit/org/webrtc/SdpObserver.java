package livekit.org.webrtc;

/* loaded from: classes8.dex */
public interface SdpObserver {
    void onCreateFailure(String error);

    void onCreateSuccess(SessionDescription sdp);

    void onSetFailure(String error);

    void onSetSuccess();
}
