package io.livekit.android.e2ee;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DataPacketCryptorManager.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lio/livekit/android/e2ee/EncryptedPacket;", "", "payload", "", "iv", "keyIndex", "", "([B[BI)V", "getIv", "()[B", "getKeyIndex", "()I", "getPayload", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EncryptedPacket {
    private final byte[] iv;
    private final int keyIndex;
    private final byte[] payload;

    public EncryptedPacket(byte[] payload, byte[] iv, int i) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(iv, "iv");
        this.payload = payload;
        this.iv = iv;
        this.keyIndex = i;
    }

    public final byte[] getPayload() {
        return this.payload;
    }

    public final byte[] getIv() {
        return this.iv;
    }

    public final int getKeyIndex() {
        return this.keyIndex;
    }
}
