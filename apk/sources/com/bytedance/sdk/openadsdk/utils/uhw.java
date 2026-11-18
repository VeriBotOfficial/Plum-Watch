package com.bytedance.sdk.openadsdk.utils;

import java.security.SecureRandom;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public class uhw {
    private static final ThreadLocal<SecureRandom> fxn = new ThreadLocal<>();

    public static String fxn() {
        byte[] bArr = new byte[16];
        ThreadLocal<SecureRandom> threadLocal = fxn;
        SecureRandom secureRandom = threadLocal.get();
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
            threadLocal.set(secureRandom);
        }
        secureRandom.nextBytes(bArr);
        byte b = (byte) (bArr[6] & 15);
        bArr[6] = b;
        bArr[6] = (byte) (b | 64);
        byte b2 = (byte) (bArr[8] & 63);
        bArr[8] = b2;
        bArr[8] = (byte) (b2 | 128);
        long j = 0;
        long j2 = 0;
        for (int r5 = 0; r5 < 8; r5++) {
            j2 = (j2 << 8) | ((long) (bArr[r5] & 255));
        }
        for (int r6 = 8; r6 < 16; r6++) {
            j = (j << 8) | ((long) (bArr[r6] & 255));
        }
        return new UUID(j2, j).toString();
    }
}
