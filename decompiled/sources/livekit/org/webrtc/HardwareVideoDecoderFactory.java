package livekit.org.webrtc;

import android.media.MediaCodecInfo;
import livekit.org.webrtc.EglBase;

/* loaded from: classes8.dex */
public class HardwareVideoDecoderFactory extends MediaCodecVideoDecoderFactory {
    private static final Predicate<MediaCodecInfo> defaultAllowedPredicate = new Predicate<MediaCodecInfo>() { // from class: livekit.org.webrtc.HardwareVideoDecoderFactory.1
        @Override // livekit.org.webrtc.Predicate
        public boolean test(MediaCodecInfo arg) {
            return MediaCodecUtils.isHardwareAccelerated(arg);
        }
    };

    @Override // livekit.org.webrtc.MediaCodecVideoDecoderFactory, livekit.org.webrtc.VideoDecoderFactory
    public /* bridge */ /* synthetic */ VideoDecoder createDecoder(VideoCodecInfo codecType) {
        return super.createDecoder(codecType);
    }

    @Override // livekit.org.webrtc.MediaCodecVideoDecoderFactory, livekit.org.webrtc.VideoDecoderFactory
    public /* bridge */ /* synthetic */ VideoCodecInfo[] getSupportedCodecs() {
        return super.getSupportedCodecs();
    }

    @Deprecated
    public HardwareVideoDecoderFactory() {
        this(null);
    }

    public HardwareVideoDecoderFactory(EglBase.Context sharedContext) {
        this(sharedContext, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HardwareVideoDecoderFactory(livekit.org.webrtc.EglBase.Context r2, livekit.org.webrtc.Predicate<android.media.MediaCodecInfo> r3) {
        /*
            r1 = this;
            if (r3 != 0) goto L5
            livekit.org.webrtc.Predicate<android.media.MediaCodecInfo> r3 = livekit.org.webrtc.HardwareVideoDecoderFactory.defaultAllowedPredicate
            goto Lb
        L5:
            livekit.org.webrtc.Predicate<android.media.MediaCodecInfo> r0 = livekit.org.webrtc.HardwareVideoDecoderFactory.defaultAllowedPredicate
            livekit.org.webrtc.Predicate r3 = r3.and(r0)
        Lb:
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: livekit.org.webrtc.HardwareVideoDecoderFactory.<init>(livekit.org.webrtc.EglBase$Context, livekit.org.webrtc.Predicate):void");
    }
}
