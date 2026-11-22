package io.agora.base.internal.video;

import io.agora.base.internal.video.VideoEncoder;

/* loaded from: classes6.dex */
class H264Encoder extends WrappedNativeVideoEncoder {
    static native long nativeCreateEncoder();

    static native boolean nativeIsSupported();

    @Override // io.agora.base.internal.video.VideoEncoder
    public VideoEncoder.VideoHWCodecSpec getVideoHWCodecSpec() {
        return null;
    }

    @Override // io.agora.base.internal.video.WrappedNativeVideoEncoder, io.agora.base.internal.video.VideoEncoder
    public boolean isHardwareEncoder() {
        return false;
    }

    H264Encoder() {
    }

    @Override // io.agora.base.internal.video.WrappedNativeVideoEncoder, io.agora.base.internal.video.VideoEncoder
    public long createNativeVideoEncoder() {
        return nativeCreateEncoder();
    }
}
