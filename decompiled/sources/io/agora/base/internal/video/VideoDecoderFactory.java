package io.agora.base.internal.video;

/* loaded from: classes6.dex */
public interface VideoDecoderFactory {
    VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo);

    VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo, boolean z);

    @Deprecated
    VideoDecoder createDecoder(String str);

    VideoCodecInfo[] getSupportedCodecs();
}
