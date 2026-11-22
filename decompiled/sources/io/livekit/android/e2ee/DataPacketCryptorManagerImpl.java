package io.livekit.android.e2ee;

import com.wakeup.common.burypoint.BuryPointPageId;
import io.livekit.android.e2ee.DataPacketCryptorManager;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import livekit.org.webrtc.DataPacketCryptor;
import livekit.org.webrtc.DataPacketCryptorFactory;
import livekit.org.webrtc.FrameCryptorAlgorithm;

/* compiled from: DataPacketCryptorManager.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0016J,\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Lio/livekit/android/e2ee/DataPacketCryptorManagerImpl;", "Lio/livekit/android/e2ee/DataPacketCryptorManager;", "keyProvider", "Lio/livekit/android/e2ee/KeyProvider;", "(Lio/livekit/android/e2ee/KeyProvider;)V", "dataPacketCryptor", "Llivekit/org/webrtc/DataPacketCryptor;", "isDisposed", "", "()Z", "setDisposed", "(Z)V", "decrypt", "", "participantId", "Lio/livekit/android/room/participant/Participant$Identity;", "packet", "Lio/livekit/android/e2ee/EncryptedPacket;", "decrypt-tq5M0Po", "(Ljava/lang/String;Lio/livekit/android/e2ee/EncryptedPacket;)[B", "dispose", "", "encrypt", "keyIndex", "", "payload", "encrypt-bi5aZsc", "(Ljava/lang/String;I[B)Lio/livekit/android/e2ee/EncryptedPacket;", "Factory", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DataPacketCryptorManagerImpl implements DataPacketCryptorManager {
    private final DataPacketCryptor dataPacketCryptor;
    private boolean isDisposed;

    public DataPacketCryptorManagerImpl(KeyProvider keyProvider) {
        Intrinsics.checkNotNullParameter(keyProvider, "keyProvider");
        DataPacketCryptor createDataPacketCryptor = DataPacketCryptorFactory.createDataPacketCryptor(FrameCryptorAlgorithm.AES_GCM, keyProvider.getRtcKeyProvider());
        Intrinsics.checkNotNullExpressionValue(createDataPacketCryptor, "createDataPacketCryptor(...)");
        this.dataPacketCryptor = createDataPacketCryptor;
    }

    /* renamed from: isDisposed, reason: from getter */
    public final boolean getIsDisposed() {
        return this.isDisposed;
    }

    public final void setDisposed(boolean z) {
        this.isDisposed = z;
    }

    @Override // io.livekit.android.e2ee.DataPacketCryptorManager
    /* renamed from: encrypt-bi5aZsc */
    public synchronized EncryptedPacket mo13839encryptbi5aZsc(String participantId, int keyIndex, byte[] payload) {
        LKLog.Logger logger;
        LKLog.Logger logger2;
        LKLog.Logger logger3;
        Intrinsics.checkNotNullParameter(participantId, "participantId");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (this.isDisposed) {
            return null;
        }
        DataPacketCryptor.EncryptedPacket encrypt = this.dataPacketCryptor.encrypt(participantId, keyIndex, payload);
        if (encrypt == null) {
            LKLog.Companion companion = LKLog.INSTANCE;
            LoggingLevel loggingLevel = LoggingLevel.INFO;
            if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && (logger3 = companion.getLogger()) != null) {
                logger3.log(loggingLevel, null, "Error encrypting packet: null packet");
            }
            return null;
        }
        byte[] bArr = encrypt.payload;
        byte[] bArr2 = encrypt.iv;
        int i = encrypt.keyIndex;
        if (bArr == null) {
            LKLog.Companion companion2 = LKLog.INSTANCE;
            LoggingLevel loggingLevel2 = LoggingLevel.WARN;
            if (loggingLevel2.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && (logger2 = companion2.getLogger()) != null) {
                logger2.log(loggingLevel2, null, "Error encrypting packet: null payload");
            }
            return null;
        }
        if (bArr2 == null) {
            LKLog.Companion companion3 = LKLog.INSTANCE;
            LoggingLevel loggingLevel3 = LoggingLevel.INFO;
            if (loggingLevel3.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && (logger = companion3.getLogger()) != null) {
                logger.log(loggingLevel3, null, "Error encrypting packet: null iv returned");
            }
            return null;
        }
        return new EncryptedPacket(bArr, bArr2, i);
    }

    @Override // io.livekit.android.e2ee.DataPacketCryptorManager
    /* renamed from: decrypt-tq5M0Po */
    public synchronized byte[] mo13838decrypttq5M0Po(String participantId, EncryptedPacket packet) {
        Intrinsics.checkNotNullParameter(participantId, "participantId");
        Intrinsics.checkNotNullParameter(packet, "packet");
        if (this.isDisposed) {
            return null;
        }
        return this.dataPacketCryptor.decrypt(participantId, new DataPacketCryptor.EncryptedPacket(packet.getPayload(), packet.getIv(), packet.getKeyIndex()));
    }

    @Override // io.livekit.android.e2ee.DataPacketCryptorManager
    public synchronized void dispose() {
        if (this.isDisposed) {
            return;
        }
        this.isDisposed = true;
        this.dataPacketCryptor.dispose();
    }

    /* compiled from: DataPacketCryptorManager.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lio/livekit/android/e2ee/DataPacketCryptorManagerImpl$Factory;", "Lio/livekit/android/e2ee/DataPacketCryptorManager$Factory;", "()V", BuryPointPageId.PAGE_ID_PLAN_CREATE, "Lio/livekit/android/e2ee/DataPacketCryptorManager;", "keyProvider", "Lio/livekit/android/e2ee/KeyProvider;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Factory implements DataPacketCryptorManager.Factory {
        public static final Factory INSTANCE = new Factory();

        private Factory() {
        }

        @Override // io.livekit.android.e2ee.DataPacketCryptorManager.Factory
        public DataPacketCryptorManager create(KeyProvider keyProvider) {
            Intrinsics.checkNotNullParameter(keyProvider, "keyProvider");
            return new DataPacketCryptorManagerImpl(keyProvider);
        }
    }
}
