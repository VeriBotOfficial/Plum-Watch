package livekit.org.webrtc;

import java.io.IOException;

/* loaded from: classes8.dex */
interface MediaCodecWrapperFactory {
    MediaCodecWrapper createByCodecName(String name) throws IOException;
}
