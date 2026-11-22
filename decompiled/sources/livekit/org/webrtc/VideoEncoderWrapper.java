package livekit.org.webrtc;

import livekit.org.webrtc.VideoEncoder;

/* loaded from: classes8.dex */
class VideoEncoderWrapper {
    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnEncodedFrame(long nativeVideoEncoderWrapper, EncodedImage frame);

    VideoEncoderWrapper() {
    }

    static boolean getScalingSettingsOn(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.on;
    }

    static Integer getScalingSettingsLow(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.low;
    }

    static Integer getScalingSettingsHigh(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.high;
    }

    static VideoEncoder.Callback createEncoderCallback(final long nativeEncoder) {
        return new VideoEncoder.Callback() { // from class: livekit.org.webrtc.VideoEncoderWrapper$$ExternalSyntheticLambda0
            @Override // livekit.org.webrtc.VideoEncoder.Callback
            public final void onEncodedFrame(EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
                VideoEncoderWrapper.nativeOnEncodedFrame(nativeEncoder, encodedImage);
            }
        };
    }
}
