package livekit.org.webrtc;

/* loaded from: classes8.dex */
public class LibvpxVp8Encoder extends WrappedNativeVideoEncoder {
    static native long nativeCreate(long webrtcEnvRef);

    @Override // livekit.org.webrtc.WrappedNativeVideoEncoder, livekit.org.webrtc.VideoEncoder
    public boolean isHardwareEncoder() {
        return false;
    }

    @Override // livekit.org.webrtc.WrappedNativeVideoEncoder, livekit.org.webrtc.VideoEncoder
    public long createNative(long webrtcEnvRef) {
        return nativeCreate(webrtcEnvRef);
    }
}
