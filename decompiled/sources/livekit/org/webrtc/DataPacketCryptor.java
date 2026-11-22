package livekit.org.webrtc;

/* loaded from: classes8.dex */
public class DataPacketCryptor {
    private long nativePtr;

    private static native byte[] nativeDecrypt(long dataCryptorPointer, String participantId, int keyIndex, byte[] data, byte[] iv);

    private static native EncryptedPacket nativeEncrypt(long dataCryptorPointer, String participantId, int keyIndex, byte[] data);

    public long getNativeDataPacketCryptor() {
        return this.nativePtr;
    }

    public DataPacketCryptor(long nativeFrameCryptor) {
        this.nativePtr = nativeFrameCryptor;
    }

    public EncryptedPacket encrypt(String participantId, int keyIndex, byte[] data) {
        checkDataPacketCryptorExists();
        return nativeEncrypt(this.nativePtr, participantId, keyIndex, data);
    }

    public byte[] decrypt(String participantId, EncryptedPacket packet) {
        checkDataPacketCryptorExists();
        return nativeDecrypt(this.nativePtr, participantId, packet.keyIndex, packet.payload, packet.iv);
    }

    public void dispose() {
        checkDataPacketCryptorExists();
        JniCommon.nativeReleaseRef(this.nativePtr);
        this.nativePtr = 0L;
    }

    private void checkDataPacketCryptorExists() {
        if (this.nativePtr == 0) {
            throw new IllegalStateException("DataPacketCryptor has been disposed.");
        }
    }

    public static class EncryptedPacket {
        public final byte[] iv;
        public final int keyIndex;
        public final byte[] payload;

        public EncryptedPacket(byte[] payload, byte[] iv, int keyIndex) {
            this.payload = payload;
            this.iv = iv;
            this.keyIndex = keyIndex;
        }
    }
}
