package livekit.org.webrtc;

import livekit.org.webrtc.VideoEncoder;

/* loaded from: classes8.dex */
public abstract class WrappedNativeVideoEncoder implements VideoEncoder {
    @Override // livekit.org.webrtc.VideoEncoder
    public abstract long createNative(long webrtcEnvRef);

    @Override // livekit.org.webrtc.VideoEncoder
    public abstract boolean isHardwareEncoder();

    @Override // livekit.org.webrtc.VideoEncoder
    public final VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback encodeCallback) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final VideoCodecStatus release() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final VideoCodecStatus encode(VideoFrame frame, VideoEncoder.EncodeInfo info) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final VideoCodecStatus setRateAllocation(VideoEncoder.BitrateAllocation allocation, int framerate) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final VideoEncoder.ScalingSettings getScalingSettings() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final String getImplementationName() {
        throw new UnsupportedOperationException("Not implemented.");
    }
}
