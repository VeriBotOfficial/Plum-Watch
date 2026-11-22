package livekit.org.webrtc;

/* loaded from: classes8.dex */
public class FrameCryptor {
    private long nativeFrameCryptor;
    private long observerPtr = 0;

    public interface Observer {
        void onFrameCryptionStateChanged(String participantId, FrameCryptionState newState);
    }

    private static native int nativeGetKeyIndex(long frameCryptorPointer);

    private static native boolean nativeIsEnabled(long frameCryptorPointer);

    private static native void nativeSetEnabled(long frameCryptorPointer, boolean enabled);

    private static native void nativeSetKeyIndex(long frameCryptorPointer, int index);

    private static native long nativeSetObserver(long frameCryptorPointer, Observer observer);

    private static native void nativeUnSetObserver(long frameCryptorPointer);

    public enum FrameCryptionState {
        NEW,
        OK,
        ENCRYPTIONFAILED,
        DECRYPTIONFAILED,
        MISSINGKEY,
        KEYRATCHETED,
        INTERNALERROR;

        static FrameCryptionState fromNativeIndex(int nativeIndex) {
            return values()[nativeIndex];
        }
    }

    public long getNativeFrameCryptor() {
        return this.nativeFrameCryptor;
    }

    public FrameCryptor(long nativeFrameCryptor) {
        this.nativeFrameCryptor = nativeFrameCryptor;
    }

    public void setEnabled(boolean enabled) {
        checkFrameCryptorExists();
        nativeSetEnabled(this.nativeFrameCryptor, enabled);
    }

    public boolean isEnabled() {
        checkFrameCryptorExists();
        return nativeIsEnabled(this.nativeFrameCryptor);
    }

    public int getKeyIndex() {
        checkFrameCryptorExists();
        return nativeGetKeyIndex(this.nativeFrameCryptor);
    }

    public void setKeyIndex(int index) {
        checkFrameCryptorExists();
        nativeSetKeyIndex(this.nativeFrameCryptor, index);
    }

    public void dispose() {
        checkFrameCryptorExists();
        nativeUnSetObserver(this.nativeFrameCryptor);
        JniCommon.nativeReleaseRef(this.nativeFrameCryptor);
        this.nativeFrameCryptor = 0L;
        long j = this.observerPtr;
        if (j != 0) {
            JniCommon.nativeReleaseRef(j);
            this.observerPtr = 0L;
        }
    }

    public void setObserver(Observer observer) {
        checkFrameCryptorExists();
        nativeSetObserver(this.nativeFrameCryptor, observer);
        long j = this.observerPtr;
        if (j != 0) {
            JniCommon.nativeReleaseRef(j);
            this.observerPtr = 0L;
        }
    }

    private void checkFrameCryptorExists() {
        if (this.nativeFrameCryptor == 0) {
            throw new IllegalStateException("FrameCryptor has been disposed.");
        }
    }
}
