package livekit.org.webrtc;

/* loaded from: classes8.dex */
public class VideoEncoderFallback extends WrappedNativeVideoEncoder {
    private final VideoEncoder fallback;
    private final VideoEncoder primary;

    private static native long nativeCreate(long webrtcEnvRef, VideoEncoder fallback, VideoEncoder primary);

    public VideoEncoderFallback(VideoEncoder fallback, VideoEncoder primary) {
        this.fallback = fallback;
        this.primary = primary;
    }

    @Override // livekit.org.webrtc.WrappedNativeVideoEncoder, livekit.org.webrtc.VideoEncoder
    public long createNative(long webrtcEnvRef) {
        return nativeCreate(webrtcEnvRef, this.fallback, this.primary);
    }

    @Override // livekit.org.webrtc.WrappedNativeVideoEncoder, livekit.org.webrtc.VideoEncoder
    public boolean isHardwareEncoder() {
        return this.primary.isHardwareEncoder();
    }
}
