package io.livekit.android.e2ee;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import livekit.LivekitModels;

/* compiled from: DataPacketCryptorManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toSdkType", "Lio/livekit/android/e2ee/EncryptedPacket;", "Llivekit/LivekitModels$EncryptedPacket;", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DataPacketCryptorManagerKt {
    public static final EncryptedPacket toSdkType(LivekitModels.EncryptedPacket encryptedPacket) {
        Intrinsics.checkNotNullParameter(encryptedPacket, "<this>");
        byte[] byteArray = encryptedPacket.getEncryptedValue().toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        byte[] byteArray2 = encryptedPacket.getIv().toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray2, "toByteArray(...)");
        return new EncryptedPacket(byteArray, byteArray2, encryptedPacket.getKeyIndex());
    }
}
