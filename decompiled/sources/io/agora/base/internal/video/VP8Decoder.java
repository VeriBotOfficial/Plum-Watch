package io.agora.base.internal.video;

/* loaded from: classes6.dex */
class VP8Decoder extends WrappedNativeVideoDecoder {
    static native long nativeCreateDecoder();

    VP8Decoder() {
    }

    @Override // io.agora.base.internal.video.WrappedNativeVideoDecoder, io.agora.base.internal.video.VideoDecoder
    public long createNativeVideoDecoder() {
        return nativeCreateDecoder();
    }
}
