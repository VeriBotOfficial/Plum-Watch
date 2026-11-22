package io.livekit.android.e2ee;

import com.wakeup.common.burypoint.BuryPointPageId;
import kotlin.Metadata;

/* compiled from: DataPacketCryptorManager.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u0012J$\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH&J,\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H&ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Lio/livekit/android/e2ee/DataPacketCryptorManager;", "", "decrypt", "", "participantId", "Lio/livekit/android/room/participant/Participant$Identity;", "packet", "Lio/livekit/android/e2ee/EncryptedPacket;", "decrypt-tq5M0Po", "(Ljava/lang/String;Lio/livekit/android/e2ee/EncryptedPacket;)[B", "dispose", "", "encrypt", "keyIndex", "", "payload", "encrypt-bi5aZsc", "(Ljava/lang/String;I[B)Lio/livekit/android/e2ee/EncryptedPacket;", "Factory", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DataPacketCryptorManager {

    /* compiled from: DataPacketCryptorManager.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lio/livekit/android/e2ee/DataPacketCryptorManager$Factory;", "", BuryPointPageId.PAGE_ID_PLAN_CREATE, "Lio/livekit/android/e2ee/DataPacketCryptorManager;", "keyProvider", "Lio/livekit/android/e2ee/KeyProvider;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Factory {
        DataPacketCryptorManager create(KeyProvider keyProvider);
    }

    /* renamed from: decrypt-tq5M0Po, reason: not valid java name */
    byte[] mo13838decrypttq5M0Po(String participantId, EncryptedPacket packet);

    void dispose();

    /* renamed from: encrypt-bi5aZsc, reason: not valid java name */
    EncryptedPacket mo13839encryptbi5aZsc(String participantId, int keyIndex, byte[] payload);
}
