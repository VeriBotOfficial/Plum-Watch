package livekit.org.webrtc;

/* loaded from: classes8.dex */
public class SimulcastVideoEncoder extends WrappedNativeVideoEncoder {
    VideoEncoderFactory fallback;
    VideoCodecInfo info;
    VideoEncoderFactory primary;

    static native long nativeCreateEncoder(long webrtcEnvRef, VideoEncoderFactory primary, VideoEncoderFactory fallback, VideoCodecInfo info);

    @Override // livekit.org.webrtc.WrappedNativeVideoEncoder, livekit.org.webrtc.VideoEncoder
    public boolean isHardwareEncoder() {
        return false;
    }

    public SimulcastVideoEncoder(VideoEncoderFactory primary, VideoEncoderFactory fallback, VideoCodecInfo info) {
        this.primary = primary;
        this.fallback = fallback;
        this.info = info;
    }

    @Override // livekit.org.webrtc.WrappedNativeVideoEncoder, livekit.org.webrtc.VideoEncoder
    public long createNative(long webrtcEnvRef) {
        return nativeCreateEncoder(webrtcEnvRef, this.primary, this.fallback, this.info);
    }
}
