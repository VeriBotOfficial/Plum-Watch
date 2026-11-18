package com.mbridge.msdk.thrid.okio;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes2.dex */
final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f12264a = Charset.forName("UTF-8");

    public static int a(int r2) {
        return ((r2 & 255) << 24) | (((-16777216) & r2) >>> 24) | ((16711680 & r2) >>> 8) | ((65280 & r2) << 8);
    }

    public static short a(short s) {
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    public static void a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    private static <T extends Throwable> void b(Throwable th) throws Throwable {
        throw th;
    }

    public static void a(Throwable th) throws Throwable {
        b(th);
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
