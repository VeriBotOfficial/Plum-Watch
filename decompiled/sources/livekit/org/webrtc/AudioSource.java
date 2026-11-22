package livekit.org.webrtc;

/* loaded from: classes8.dex */
public class AudioSource extends MediaSource {
    public AudioSource(long nativeSource) {
        super(nativeSource);
    }

    long getNativeAudioSource() {
        return getNativeMediaSource();
    }
}
