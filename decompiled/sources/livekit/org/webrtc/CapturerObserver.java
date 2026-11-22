package livekit.org.webrtc;

/* loaded from: classes8.dex */
public interface CapturerObserver {
    void onCapturerStarted(boolean success);

    void onCapturerStopped();

    void onFrameCaptured(VideoFrame frame);
}
