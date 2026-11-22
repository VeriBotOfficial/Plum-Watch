package io.agora.base.internal.video;

import io.agora.base.VideoFrame;

/* loaded from: classes6.dex */
public interface VideoDecoder {

    public interface Callback {
        void onDecodeBufferPrepared(long j);

        void onDecodeReset();

        void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2, int i, int i2, int i3, CodecSpecificInfo codecSpecificInfo, FrameExtraInfo frameExtraInfo);
    }

    VideoCodecStatus attachProxyThread();

    long createNativeVideoDecoder();

    VideoCodecStatus decode(EncodedImage encodedImage, DecodeInfo decodeInfo, CodecSpecificInfo codecSpecificInfo, FrameExtraInfo frameExtraInfo);

    VideoCodecStatus detachProxyThread();

    String getImplementationName();

    boolean getPrefersLateDecoding();

    VideoCodecStatus initDecode(Settings settings, Callback callback);

    boolean isHardwareDecoder();

    VideoCodecStatus release();

    public static class Settings {
        public int codecProfile;
        public int height;
        public int lumaBitDepth;
        public int numberOfCores;
        public int width;

        public Settings(int i, int i2, int i3, int i4, int i5) {
            this.numberOfCores = i;
            this.width = i2;
            this.height = i3;
            this.lumaBitDepth = i4;
            this.codecProfile = i5;
        }
    }

    public static class DecodeInfo {
        public final boolean isMissingFrames;
        public final long renderTimeMs;

        public DecodeInfo(boolean z, long j) {
            this.isMissingFrames = z;
            this.renderTimeMs = j;
        }
    }
}
