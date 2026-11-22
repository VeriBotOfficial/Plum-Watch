package livekit.org.webrtc;

/* loaded from: classes8.dex */
public class VideoDecoderFallback extends WrappedNativeVideoDecoder {
    private final VideoDecoder fallback;
    private final VideoDecoder primary;

    private static native long nativeCreate(long webrtcEnvRef, VideoDecoder fallback, VideoDecoder primary);

    public VideoDecoderFallback(VideoDecoder fallback, VideoDecoder primary) {
        this.fallback = fallback;
        this.primary = primary;
    }

    @Override // livekit.org.webrtc.WrappedNativeVideoDecoder, livekit.org.webrtc.VideoDecoder
    public long createNative(long webrtcEnvRef) {
        return nativeCreate(webrtcEnvRef, this.fallback, this.primary);
    }
}
