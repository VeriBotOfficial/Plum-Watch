package livekit.org.webrtc;

/* loaded from: classes8.dex */
public interface VideoEncoderFactory {

    public interface VideoEncoderSelector {
        VideoCodecInfo onAvailableBitrate(int kbps);

        void onCurrentEncoder(VideoCodecInfo info);

        VideoCodecInfo onEncoderBroken();

        default VideoCodecInfo onResolutionChange(int widht, int height) {
            return null;
        }
    }

    VideoEncoder createEncoder(VideoCodecInfo info);

    default VideoEncoderSelector getEncoderSelector() {
        return null;
    }

    VideoCodecInfo[] getSupportedCodecs();

    default VideoCodecInfo[] getImplementations() {
        return getSupportedCodecs();
    }
}
