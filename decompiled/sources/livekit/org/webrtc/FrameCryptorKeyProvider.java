package livekit.org.webrtc;

/* loaded from: classes8.dex */
public class FrameCryptorKeyProvider {
    private long nativeKeyProvider;

    private static native byte[] nativeExportKey(long keyProviderPointer, String participantId, int index);

    private static native byte[] nativeExportSharedKey(long keyProviderPointer, int index);

    private static native byte[] nativeRatchetKey(long keyProviderPointer, String participantId, int index);

    private static native byte[] nativeRatchetSharedKey(long keyProviderPointer, int index);

    private static native boolean nativeSetKey(long keyProviderPointer, String participantId, int index, byte[] key);

    private static native boolean nativeSetSharedKey(long keyProviderPointer, int index, byte[] key);

    private static native void nativeSetSifTrailer(long keyProviderPointer, byte[] sifTrailer);

    public FrameCryptorKeyProvider(long nativeKeyProvider) {
        this.nativeKeyProvider = nativeKeyProvider;
    }

    public long getNativeKeyProvider() {
        return this.nativeKeyProvider;
    }

    public boolean setSharedKey(int index, byte[] key) {
        checkKeyProviderExists();
        return nativeSetSharedKey(this.nativeKeyProvider, index, key);
    }

    public byte[] ratchetSharedKey(int index) {
        checkKeyProviderExists();
        return nativeRatchetSharedKey(this.nativeKeyProvider, index);
    }

    public byte[] exportSharedKey(int index) {
        checkKeyProviderExists();
        return nativeExportSharedKey(this.nativeKeyProvider, index);
    }

    public boolean setKey(String participantId, int index, byte[] key) {
        checkKeyProviderExists();
        return nativeSetKey(this.nativeKeyProvider, participantId, index, key);
    }

    public byte[] ratchetKey(String participantId, int index) {
        checkKeyProviderExists();
        return nativeRatchetKey(this.nativeKeyProvider, participantId, index);
    }

    public byte[] exportKey(String participantId, int index) {
        checkKeyProviderExists();
        return nativeExportKey(this.nativeKeyProvider, participantId, index);
    }

    public void setSifTrailer(byte[] sifTrailer) {
        checkKeyProviderExists();
        nativeSetSifTrailer(this.nativeKeyProvider, sifTrailer);
    }

    public void dispose() {
        checkKeyProviderExists();
        JniCommon.nativeReleaseRef(this.nativeKeyProvider);
        this.nativeKeyProvider = 0L;
    }

    private void checkKeyProviderExists() {
        if (this.nativeKeyProvider == 0) {
            throw new IllegalStateException("FrameCryptorKeyProvider has been disposed.");
        }
    }
}
