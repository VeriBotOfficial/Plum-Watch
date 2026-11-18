package com.efs.sdk.memleaksdk.monitor.shark;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes11.dex */
final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f9924a = Charset.forName("UTF-8");

    public static void a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    public static boolean a(byte[] bArr, int r5, byte[] bArr2, int r7, int r8) {
        for (int r1 = 0; r1 < r8; r1++) {
            if (bArr[r1 + r5] != bArr2[r1 + r7]) {
                return false;
            }
        }
        return true;
    }
}
