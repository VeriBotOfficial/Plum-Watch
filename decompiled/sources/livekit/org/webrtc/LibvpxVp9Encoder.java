package livekit.org.webrtc;

import java.util.List;

/* loaded from: classes8.dex */
public class LibvpxVp9Encoder extends WrappedNativeVideoEncoder {
    static native long nativeCreate(long webrtcEnvRef);

    static native List<String> nativeGetSupportedScalabilityModes();

    static native boolean nativeIsSupported();

    @Override // livekit.org.webrtc.WrappedNativeVideoEncoder, livekit.org.webrtc.VideoEncoder
    public boolean isHardwareEncoder() {
        return false;
    }

    @Override // livekit.org.webrtc.WrappedNativeVideoEncoder, livekit.org.webrtc.VideoEncoder
    public long createNative(long webrtcEnvRef) {
        return nativeCreate(webrtcEnvRef);
    }

    static List<String> scalabilityModes() {
        return nativeGetSupportedScalabilityModes();
    }
}
