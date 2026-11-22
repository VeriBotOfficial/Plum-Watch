package livekit.org.webrtc;

/* loaded from: classes8.dex */
public interface VideoDecoder {

    public interface Callback {
        void onDecodedFrame(VideoFrame frame, Integer decodeTimeMs, Integer qp);
    }

    default long createNative(long webrtcEnvRef) {
        return 0L;
    }

    VideoCodecStatus decode(EncodedImage frame, DecodeInfo info);

    String getImplementationName();

    VideoCodecStatus initDecode(Settings settings, Callback decodeCallback);

    VideoCodecStatus release();

    public static class Settings {
        public final int height;
        public final int numberOfCores;
        public final int width;

        public Settings(int numberOfCores, int width, int height) {
            this.numberOfCores = numberOfCores;
            this.width = width;
            this.height = height;
        }
    }

    public static class DecodeInfo {
        public final boolean isMissingFrames;
        public final long renderTimeMs;

        public DecodeInfo(boolean isMissingFrames, long renderTimeMs) {
            this.isMissingFrames = isMissingFrames;
            this.renderTimeMs = renderTimeMs;
        }
    }
}
