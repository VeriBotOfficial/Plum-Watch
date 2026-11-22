package livekit.org.webrtc;

/* loaded from: classes8.dex */
public enum FrameCryptorKeyDerivationAlgorithm {
    PBKDF2(0),
    HKDF(1);

    private final int value;

    FrameCryptorKeyDerivationAlgorithm(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
