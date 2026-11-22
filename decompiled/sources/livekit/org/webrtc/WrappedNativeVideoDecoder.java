package livekit.org.webrtc;

import livekit.org.webrtc.VideoDecoder;

/* loaded from: classes8.dex */
public abstract class WrappedNativeVideoDecoder implements VideoDecoder {
    @Override // livekit.org.webrtc.VideoDecoder
    public abstract long createNative(long webrtcEnvRef);

    @Override // livekit.org.webrtc.VideoDecoder
    public final VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback decodeCallback) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // livekit.org.webrtc.VideoDecoder
    public final VideoCodecStatus release() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // livekit.org.webrtc.VideoDecoder
    public final VideoCodecStatus decode(EncodedImage frame, VideoDecoder.DecodeInfo info) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // livekit.org.webrtc.VideoDecoder
    public final String getImplementationName() {
        throw new UnsupportedOperationException("Not implemented.");
    }
}
