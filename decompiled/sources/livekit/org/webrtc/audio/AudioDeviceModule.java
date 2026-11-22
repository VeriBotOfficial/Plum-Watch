package livekit.org.webrtc.audio;

/* loaded from: classes8.dex */
public interface AudioDeviceModule {
    long getNative(long webrtcEnvRef);

    void release();

    void setMicrophoneMute(boolean mute);

    default boolean setNoiseSuppressorEnabled(boolean enabled) {
        return false;
    }

    default boolean setPreferredMicrophoneFieldDimension(float dimension) {
        return false;
    }

    void setSpeakerMute(boolean mute);
}
