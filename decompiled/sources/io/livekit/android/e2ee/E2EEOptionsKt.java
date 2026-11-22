package io.livekit.android.e2ee;

import kotlin.Metadata;
import livekit.org.webrtc.FrameCryptorKeyDerivationAlgorithm;

/* compiled from: E2EEOptions.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u000e\u0010\b\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"defaultDiscardFrameWhenCryptorNotReady", "", "defaultFailureTolerance", "", "defaultKeyDerivationAlgorithm", "Llivekit/org/webrtc/FrameCryptorKeyDerivationAlgorithm;", "getDefaultKeyDerivationAlgorithm", "()Llivekit/org/webrtc/FrameCryptorKeyDerivationAlgorithm;", "defaultKeyRingSize", "defaultMagicBytes", "", "defaultRatchetSalt", "defaultRatchetWindowSize", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class E2EEOptionsKt {
    public static final boolean defaultDiscardFrameWhenCryptorNotReady = false;
    public static final int defaultFailureTolerance = -1;
    private static final FrameCryptorKeyDerivationAlgorithm defaultKeyDerivationAlgorithm = FrameCryptorKeyDerivationAlgorithm.PBKDF2;
    public static final int defaultKeyRingSize = 16;
    public static final String defaultMagicBytes = "LK-ROCKS";
    public static final String defaultRatchetSalt = "LKFrameEncryptionKey";
    public static final int defaultRatchetWindowSize = 16;

    public static final FrameCryptorKeyDerivationAlgorithm getDefaultKeyDerivationAlgorithm() {
        return defaultKeyDerivationAlgorithm;
    }
}
