package livekit.org.webrtc;

import java.util.List;

/* loaded from: classes8.dex */
public class SoftwareVideoDecoderFactory implements VideoDecoderFactory {
    private static final String TAG = "SoftwareVideoDecoderFactory";
    private final long nativeFactory = nativeCreateFactory();

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeCreate(long factory, long webrtcEnvRef, VideoCodecInfo info);

    private static native long nativeCreateFactory();

    private static native List<VideoCodecInfo> nativeGetSupportedCodecs(long factory);

    private static native boolean nativeIsSupported(long factory, VideoCodecInfo info);

    @Override // livekit.org.webrtc.VideoDecoderFactory
    public VideoDecoder createDecoder(final VideoCodecInfo info) {
        if (!nativeIsSupported(this.nativeFactory, info)) {
            Logging.w(TAG, "Trying to create decoder for unsupported format. " + String.valueOf(info));
            return null;
        }
        return new WrappedNativeVideoDecoder(this) { // from class: livekit.org.webrtc.SoftwareVideoDecoderFactory.1
            final /* synthetic */ SoftwareVideoDecoderFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // livekit.org.webrtc.WrappedNativeVideoDecoder, livekit.org.webrtc.VideoDecoder
            public long createNative(long webrtcEnvRef) {
                return SoftwareVideoDecoderFactory.nativeCreate(this.this$0.nativeFactory, webrtcEnvRef, info);
            }
        };
    }

    @Override // livekit.org.webrtc.VideoDecoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        return (VideoCodecInfo[]) nativeGetSupportedCodecs(this.nativeFactory).toArray(new VideoCodecInfo[0]);
    }
}
