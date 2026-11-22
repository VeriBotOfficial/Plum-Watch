package io.livekit.android.e2ee;

import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import livekit.org.webrtc.FrameCryptorFactory;
import livekit.org.webrtc.FrameCryptorKeyDerivationAlgorithm;
import livekit.org.webrtc.FrameCryptorKeyProvider;

/* compiled from: KeyProvider.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u001f\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0003H\u0016J\u001f\u0010!\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010\u001dJ\u0017\u0010\"\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010\u001fJ)\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010&J\u001f\u0010'\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010(J\u0010\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020\u001aH\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006+"}, d2 = {"Lio/livekit/android/e2ee/BaseKeyProvider;", "Lio/livekit/android/e2ee/KeyProvider;", "ratchetSalt", "", "uncryptedMagicBytes", "ratchetWindowSize", "", "enableSharedKey", "", "failureTolerance", "keyRingSize", "discardFrameWhenCryptorNotReady", "keyDerivationAlgorithm", "Llivekit/org/webrtc/FrameCryptorKeyDerivationAlgorithm;", "(Ljava/lang/String;Ljava/lang/String;IZIIZLlivekit/org/webrtc/FrameCryptorKeyDerivationAlgorithm;)V", "getEnableSharedKey", "()Z", "setEnableSharedKey", "(Z)V", "latestSetIndex", "", "rtcKeyProvider", "Llivekit/org/webrtc/FrameCryptorKeyProvider;", "getRtcKeyProvider", "()Llivekit/org/webrtc/FrameCryptorKeyProvider;", "exportKey", "", "participantId", "keyIndex", "(Ljava/lang/String;Ljava/lang/Integer;)[B", "exportSharedKey", "(Ljava/lang/Integer;)[B", "getLatestKeyIndex", "ratchetKey", "ratchetSharedKey", "setKey", "", "key", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "setSharedKey", "(Ljava/lang/String;Ljava/lang/Integer;)Z", "setSifTrailer", "trailer", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BaseKeyProvider implements KeyProvider {
    private boolean enableSharedKey;
    private final Map<String, Integer> latestSetIndex;
    private final FrameCryptorKeyProvider rtcKeyProvider;

    public BaseKeyProvider() {
        this(null, null, 0, false, 0, 0, false, null, 255, null);
    }

    public BaseKeyProvider(String ratchetSalt, String uncryptedMagicBytes, int i, boolean z, int i2, int i3, boolean z2, FrameCryptorKeyDerivationAlgorithm keyDerivationAlgorithm) {
        Intrinsics.checkNotNullParameter(ratchetSalt, "ratchetSalt");
        Intrinsics.checkNotNullParameter(uncryptedMagicBytes, "uncryptedMagicBytes");
        Intrinsics.checkNotNullParameter(keyDerivationAlgorithm, "keyDerivationAlgorithm");
        this.enableSharedKey = z;
        this.latestSetIndex = new LinkedHashMap();
        boolean enableSharedKey = getEnableSharedKey();
        byte[] bytes = ratchetSalt.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bytes2 = uncryptedMagicBytes.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
        FrameCryptorKeyProvider createFrameCryptorKeyProvider = FrameCryptorFactory.createFrameCryptorKeyProvider(enableSharedKey, bytes, i, bytes2, i2, i3, z2, keyDerivationAlgorithm);
        Intrinsics.checkNotNullExpressionValue(createFrameCryptorKeyProvider, "createFrameCryptorKeyProvider(...)");
        this.rtcKeyProvider = createFrameCryptorKeyProvider;
    }

    public /* synthetic */ BaseKeyProvider(String str, String str2, int i, boolean z, int i2, int i3, boolean z2, FrameCryptorKeyDerivationAlgorithm frameCryptorKeyDerivationAlgorithm, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? E2EEOptionsKt.defaultRatchetSalt : str, (i4 & 2) != 0 ? E2EEOptionsKt.defaultMagicBytes : str2, (i4 & 4) != 0 ? 16 : i, (i4 & 8) != 0 ? true : z, (i4 & 16) != 0 ? -1 : i2, (i4 & 32) != 0 ? 16 : i3, (i4 & 64) != 0 ? false : z2, (i4 & 128) != 0 ? E2EEOptionsKt.getDefaultKeyDerivationAlgorithm() : frameCryptorKeyDerivationAlgorithm);
    }

    @Override // io.livekit.android.e2ee.KeyProvider
    public boolean getEnableSharedKey() {
        return this.enableSharedKey;
    }

    @Override // io.livekit.android.e2ee.KeyProvider
    public void setEnableSharedKey(boolean z) {
        this.enableSharedKey = z;
    }

    @Override // io.livekit.android.e2ee.KeyProvider
    public FrameCryptorKeyProvider getRtcKeyProvider() {
        return this.rtcKeyProvider;
    }

    @Override // io.livekit.android.e2ee.KeyProvider
    public boolean setSharedKey(String key, Integer keyIndex) {
        Intrinsics.checkNotNullParameter(key, "key");
        FrameCryptorKeyProvider rtcKeyProvider = getRtcKeyProvider();
        int intValue = keyIndex != null ? keyIndex.intValue() : 0;
        byte[] bytes = key.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return rtcKeyProvider.setSharedKey(intValue, bytes);
    }

    @Override // io.livekit.android.e2ee.KeyProvider
    public byte[] ratchetSharedKey(Integer keyIndex) {
        byte[] ratchetSharedKey = getRtcKeyProvider().ratchetSharedKey(keyIndex != null ? keyIndex.intValue() : 0);
        Intrinsics.checkNotNullExpressionValue(ratchetSharedKey, "ratchetSharedKey(...)");
        return ratchetSharedKey;
    }

    @Override // io.livekit.android.e2ee.KeyProvider
    public byte[] exportSharedKey(Integer keyIndex) {
        byte[] exportSharedKey = getRtcKeyProvider().exportSharedKey(keyIndex != null ? keyIndex.intValue() : 0);
        Intrinsics.checkNotNullExpressionValue(exportSharedKey, "exportSharedKey(...)");
        return exportSharedKey;
    }

    @Override // io.livekit.android.e2ee.KeyProvider
    public void setKey(String key, String participantId, Integer keyIndex) {
        LKLog.Logger logger;
        Intrinsics.checkNotNullParameter(key, "key");
        if (getEnableSharedKey()) {
            return;
        }
        if (participantId == null) {
            LKLog.Companion companion = LKLog.INSTANCE;
            LoggingLevel loggingLevel = LoggingLevel.DEBUG;
            if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || (logger = companion.getLogger()) == null) {
                return;
            }
            logger.log(loggingLevel, null, "Please provide valid participantId for non-SharedKey mode.");
            return;
        }
        int intValue = keyIndex != null ? keyIndex.intValue() : 0;
        this.latestSetIndex.put(participantId, Integer.valueOf(intValue));
        FrameCryptorKeyProvider rtcKeyProvider = getRtcKeyProvider();
        byte[] bytes = key.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        rtcKeyProvider.setKey(participantId, intValue, bytes);
    }

    @Override // io.livekit.android.e2ee.KeyProvider
    public byte[] ratchetKey(String participantId, Integer keyIndex) {
        Intrinsics.checkNotNullParameter(participantId, "participantId");
        byte[] ratchetKey = getRtcKeyProvider().ratchetKey(participantId, keyIndex != null ? keyIndex.intValue() : 0);
        Intrinsics.checkNotNullExpressionValue(ratchetKey, "ratchetKey(...)");
        return ratchetKey;
    }

    @Override // io.livekit.android.e2ee.KeyProvider
    public byte[] exportKey(String participantId, Integer keyIndex) {
        Intrinsics.checkNotNullParameter(participantId, "participantId");
        byte[] exportKey = getRtcKeyProvider().exportKey(participantId, keyIndex != null ? keyIndex.intValue() : 0);
        Intrinsics.checkNotNullExpressionValue(exportKey, "exportKey(...)");
        return exportKey;
    }

    @Override // io.livekit.android.e2ee.KeyProvider
    public void setSifTrailer(byte[] trailer) {
        Intrinsics.checkNotNullParameter(trailer, "trailer");
        getRtcKeyProvider().setSifTrailer(trailer);
    }

    @Override // io.livekit.android.e2ee.KeyProvider
    public int getLatestKeyIndex(String participantId) {
        Intrinsics.checkNotNullParameter(participantId, "participantId");
        Integer num = this.latestSetIndex.get(participantId);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
