package livekit.org.webrtc;

import livekit.org.webrtc.VideoDecoder;

/* loaded from: classes8.dex */
class VideoDecoderWrapper {
    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnDecodedFrame(long nativeVideoDecoderWrapper, VideoFrame frame, Integer decodeTimeMs, Integer qp);

    VideoDecoderWrapper() {
    }

    static VideoDecoder.Callback createDecoderCallback(final long nativeDecoder) {
        return new VideoDecoder.Callback() { // from class: livekit.org.webrtc.VideoDecoderWrapper$$ExternalSyntheticLambda0
            @Override // livekit.org.webrtc.VideoDecoder.Callback
            public final void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2) {
                VideoDecoderWrapper.nativeOnDecodedFrame(nativeDecoder, videoFrame, num, num2);
            }
        };
    }
}
