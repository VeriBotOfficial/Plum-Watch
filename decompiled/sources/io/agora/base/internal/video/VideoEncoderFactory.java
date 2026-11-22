package io.agora.base.internal.video;

/* loaded from: classes6.dex */
public interface VideoEncoderFactory {
    VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo, boolean z);

    VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo, boolean z, boolean z2);

    VideoCodecInfo[] getSupportedCodecs(boolean z);
}
