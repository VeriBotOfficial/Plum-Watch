package livekit.org.webrtc;

/* loaded from: classes8.dex */
public class FrameCryptorFactory {
    private static native FrameCryptor nativeCreateFrameCryptorForRtpReceiver(long factory, long rtpReceiver, String participantId, int algorithm, long nativeFrameCryptorKeyProvider);

    private static native FrameCryptor nativeCreateFrameCryptorForRtpSender(long factory, long rtpSender, String participantId, int algorithm, long nativeFrameCryptorKeyProvider);

    private static native FrameCryptorKeyProvider nativeCreateFrameCryptorKeyProvider(boolean sharedKey, byte[] ratchetSalt, int ratchetWindowSize, byte[] uncryptedMagicBytes, int failureTolerance, int keyRingSize, boolean discardFrameWhenCryptorNotReady, int keyDerivationAlgorithm);

    public static FrameCryptorKeyProvider createFrameCryptorKeyProvider(boolean sharedKey, byte[] ratchetSalt, int ratchetWindowSize, byte[] uncryptedMagicBytes, int failureTolerance, int keyRingSize, boolean discardFrameWhenCryptorNotReady, FrameCryptorKeyDerivationAlgorithm keyDerivationAlgorithm) {
        return nativeCreateFrameCryptorKeyProvider(sharedKey, ratchetSalt, ratchetWindowSize, uncryptedMagicBytes, failureTolerance, keyRingSize, discardFrameWhenCryptorNotReady, keyDerivationAlgorithm.getValue());
    }

    public static FrameCryptor createFrameCryptorForRtpSender(PeerConnectionFactory factory, RtpSender rtpSender, String participantId, FrameCryptorAlgorithm algorithm, FrameCryptorKeyProvider keyProvider) {
        return nativeCreateFrameCryptorForRtpSender(factory.getNativeOwnedFactoryAndThreads(), rtpSender.getNativeRtpSender(), participantId, algorithm.getValue(), keyProvider.getNativeKeyProvider());
    }

    public static FrameCryptor createFrameCryptorForRtpReceiver(PeerConnectionFactory factory, RtpReceiver rtpReceiver, String participantId, FrameCryptorAlgorithm algorithm, FrameCryptorKeyProvider keyProvider) {
        return nativeCreateFrameCryptorForRtpReceiver(factory.getNativeOwnedFactoryAndThreads(), rtpReceiver.getNativeRtpReceiver(), participantId, algorithm.getValue(), keyProvider.getNativeKeyProvider());
    }
}
