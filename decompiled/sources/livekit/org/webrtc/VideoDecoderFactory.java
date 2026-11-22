package livekit.org.webrtc;

/* loaded from: classes8.dex */
public interface VideoDecoderFactory {
    VideoDecoder createDecoder(VideoCodecInfo info);

    default VideoCodecInfo[] getSupportedCodecs() {
        return new VideoCodecInfo[0];
    }
}
