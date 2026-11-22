package livekit.org.webrtc;

/* loaded from: classes8.dex */
public enum FrameCryptorAlgorithm {
    AES_GCM(0);

    private final int value;

    FrameCryptorAlgorithm(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
