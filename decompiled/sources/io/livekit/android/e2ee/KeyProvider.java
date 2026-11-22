package io.livekit.android.e2ee;

import kotlin.Metadata;
import livekit.org.webrtc.FrameCryptorKeyProvider;

/* compiled from: KeyProvider.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J!\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH&J!\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0002\u0010\u0012J\u0019\u0010\u0017\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0002\u0010\u0014J+\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0002\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\rH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006 "}, d2 = {"Lio/livekit/android/e2ee/KeyProvider;", "", "enableSharedKey", "", "getEnableSharedKey", "()Z", "setEnableSharedKey", "(Z)V", "rtcKeyProvider", "Llivekit/org/webrtc/FrameCryptorKeyProvider;", "getRtcKeyProvider", "()Llivekit/org/webrtc/FrameCryptorKeyProvider;", "exportKey", "", "participantId", "", "keyIndex", "", "(Ljava/lang/String;Ljava/lang/Integer;)[B", "exportSharedKey", "(Ljava/lang/Integer;)[B", "getLatestKeyIndex", "ratchetKey", "ratchetSharedKey", "setKey", "", "key", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "setSharedKey", "(Ljava/lang/String;Ljava/lang/Integer;)Z", "setSifTrailer", "trailer", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface KeyProvider {
    byte[] exportKey(String participantId, Integer keyIndex);

    byte[] exportSharedKey(Integer keyIndex);

    boolean getEnableSharedKey();

    int getLatestKeyIndex(String participantId);

    FrameCryptorKeyProvider getRtcKeyProvider();

    byte[] ratchetKey(String participantId, Integer keyIndex);

    byte[] ratchetSharedKey(Integer keyIndex);

    void setEnableSharedKey(boolean z);

    void setKey(String key, String participantId, Integer keyIndex);

    boolean setSharedKey(String key, Integer keyIndex);

    void setSifTrailer(byte[] trailer);

    /* compiled from: KeyProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ boolean setSharedKey$default(KeyProvider keyProvider, String str, Integer num, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSharedKey");
            }
            if ((i & 2) != 0) {
                num = 0;
            }
            return keyProvider.setSharedKey(str, num);
        }

        public static /* synthetic */ byte[] ratchetSharedKey$default(KeyProvider keyProvider, Integer num, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ratchetSharedKey");
            }
            if ((i & 1) != 0) {
                num = 0;
            }
            return keyProvider.ratchetSharedKey(num);
        }

        public static /* synthetic */ byte[] exportSharedKey$default(KeyProvider keyProvider, Integer num, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exportSharedKey");
            }
            if ((i & 1) != 0) {
                num = 0;
            }
            return keyProvider.exportSharedKey(num);
        }

        public static /* synthetic */ void setKey$default(KeyProvider keyProvider, String str, String str2, Integer num, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setKey");
            }
            if ((i & 4) != 0) {
                num = 0;
            }
            keyProvider.setKey(str, str2, num);
        }

        public static /* synthetic */ byte[] ratchetKey$default(KeyProvider keyProvider, String str, Integer num, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ratchetKey");
            }
            if ((i & 2) != 0) {
                num = 0;
            }
            return keyProvider.ratchetKey(str, num);
        }

        public static /* synthetic */ byte[] exportKey$default(KeyProvider keyProvider, String str, Integer num, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exportKey");
            }
            if ((i & 2) != 0) {
                num = 0;
            }
            return keyProvider.exportKey(str, num);
        }
    }
}
