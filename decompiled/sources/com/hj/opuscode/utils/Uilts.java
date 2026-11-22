package com.hj.opuscode.utils;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Uilts.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lcom/hj/opuscode/utils/Uilts;", "", "()V", "byteArrayToShortArray", "", "byteArray", "", "shortArrayToByteArray", "shortArray", "opusCode_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Uilts {
    public static final Uilts INSTANCE = new Uilts();

    private Uilts() {
    }

    public final short[] byteArrayToShortArray(byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        short[] sArr = new short[byteArray.length / 2];
        ByteBuffer.wrap(byteArray).order(ByteOrder.nativeOrder()).asShortBuffer().get(sArr);
        return sArr;
    }

    public final byte[] shortArrayToByteArray(short[] shortArray) {
        Intrinsics.checkNotNullParameter(shortArray, "shortArray");
        int length = shortArray.length;
        byte[] bArr = new byte[length << 1];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i2] = (byte) shortArray[i];
            bArr[i2 + 1] = (byte) (r4 >> 8);
        }
        return bArr;
    }
}
