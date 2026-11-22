package com.wakeup.common.utils;

import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ByteArrayExpand.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"split", "", "subSize", "", "common_overseasRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ByteArrayExpandKt {
    public static /* synthetic */ byte[] split$default(byte[] bArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 20;
        }
        return split(bArr, i);
    }

    public static final byte[] split(byte[] bArr, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int min = Math.min(Math.max(20, i), bArr.length);
        if (bArr.length <= min || ((i2 = bArr[0] & 255) != 171 && i2 != 234 && i2 != 196)) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[min];
        System.arraycopy(bArr, 0, bArr2, 0, min);
        byteArrayOutputStream.write(bArr2);
        int length = bArr.length - min;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, min, bArr3, 0, bArr.length - min);
        int i3 = min - 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = length - i4;
            if (i6 >= i3) {
                i6 = i3;
            }
            int i7 = i6 + 1;
            byte[] bArr4 = new byte[i7];
            int i8 = 0;
            while (i8 < i7) {
                bArr4[i8] = i8 == 0 ? (byte) i5 : bArr3[(i4 + i8) - 1];
                i8++;
            }
            byteArrayOutputStream.write(bArr4);
            i4 += i3;
            i5++;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
