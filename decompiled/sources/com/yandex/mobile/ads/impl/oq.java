package com.yandex.mobile.ads.impl;

import android.gov.nist.javax.sip.parser.TokenNames;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import java.util.Locale;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes5.dex */
public final class oq {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f16477a = {0, 0, 0, 1};
    private static final String[] b = {"", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", TokenNames.C};

    public static String a(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = {b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : Matrix.MATRIX_TYPE_RANDOM_LT), Integer.valueOf(i4)};
        int i5 = f92.f15466a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i6 = 0; i6 < length; i6++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i6])));
        }
        return sb.toString();
    }

    public static byte[] a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2 + 4];
        System.arraycopy(f16477a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }

    public static boolean a(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }
}
