package livekit.org.webrtc;

/* loaded from: classes8.dex */
public class DataPacketCryptorFactory {
    private static native DataPacketCryptor nativeCreateDataPacketCryptor(int value, long keyProvider);

    public static DataPacketCryptor createDataPacketCryptor(FrameCryptorAlgorithm algorithm, FrameCryptorKeyProvider keyProvider) {
        return nativeCreateDataPacketCryptor(algorithm.getValue(), keyProvider.getNativeKeyProvider());
    }
}
