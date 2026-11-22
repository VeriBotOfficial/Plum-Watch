package com.wakeup.common.utils;

import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BleExtend.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00012\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"splitMtu", "", "mtu", "", "buildByteArray", "action", "Lkotlin/Function1;", "Ljava/io/ByteArrayOutputStream;", "", "Lkotlin/ExtensionFunctionType;", "common_overseasRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BleExtendKt {
    public static final byte[] splitMtu(byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length <= i || i <= 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        byte[] plus = ArraysKt.plus(new byte[0], bArr2);
        int length = bArr.length - i;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i, bArr3, 0, bArr.length - i);
        int i2 = i - 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = length - i3;
            if (i5 >= i2) {
                i5 = i2;
            }
            int i6 = i5 + 1;
            byte[] bArr4 = new byte[i6];
            int i7 = 0;
            while (i7 < i6) {
                bArr4[i7] = i7 == 0 ? (byte) i4 : bArr3[(i3 + i7) - 1];
                i7++;
            }
            plus = ArraysKt.plus(plus, bArr4);
            i3 += i2;
            i4++;
        }
        return plus;
    }

    public static final byte[] buildByteArray(Function1<? super ByteArrayOutputStream, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        action.invoke(byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
