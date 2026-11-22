package com.baidu.bbalbscesium.k.c;

import java.math.BigInteger;

/* loaded from: classes12.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static byte[] f7428a;
    private static byte[] b;

    public static byte[] a() {
        byte[] bArr = b;
        if (bArr != null) {
            return bArr;
        }
        byte[] byteArray = new BigInteger(a.c).modPow(new BigInteger(a.d), new BigInteger(a.e)).toByteArray();
        b = byteArray;
        return byteArray;
    }

    public static byte[] b() {
        byte[] bArr = f7428a;
        if (bArr != null) {
            return bArr;
        }
        byte[] byteArray = new BigInteger(a.f7427a).modPow(new BigInteger(a.b), new BigInteger(a.e)).toByteArray();
        f7428a = byteArray;
        return byteArray;
    }
}
