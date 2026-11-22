package com.phancy.mini.utils;

import com.phancy.mini.api.file.FileSystemManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* compiled from: HexString.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007¨\u0006\t"}, d2 = {"Lcom/phancy/mini/utils/HexString;", "", "()V", "fromByteArray", "", "data", "", "toByteArray", FileSystemManager.ENCODING_HEX, "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HexString {
    public static final HexString INSTANCE = new HexString();

    private HexString() {
    }

    @JvmStatic
    public static final String fromByteArray(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        StringBuilder sb = new StringBuilder();
        for (byte b : data) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
        return sb2;
    }

    @JvmStatic
    public static final byte[] toByteArray(String hex) {
        Intrinsics.checkNotNullParameter(hex, "hex");
        if (hex.length() % 2 != 0) {
            return new byte[0];
        }
        int length = hex.length() / 2;
        byte[] bArr = new byte[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = (byte) Integer.parseInt(new StringBuilder().append(hex.charAt(i)).append(hex.charAt(i + 1)).toString(), CharsKt.checkRadix(16));
            i += 2;
        }
        return bArr;
    }
}
