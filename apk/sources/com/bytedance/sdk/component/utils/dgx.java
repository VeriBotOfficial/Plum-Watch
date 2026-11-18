package com.bytedance.sdk.component.utils;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes15.dex */
public class dgx {
    private static final byte[] fxn = fxn("VP8X");

    private static byte[] fxn(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new byte[1];
        }
    }

    public static boolean fxn(byte[] bArr, int r4) {
        try {
            boolean zFxn = fxn(bArr, r4 + 12, fxn);
            int r5 = r4 + 20;
            if (bArr.length <= r5) {
                return false;
            }
            return zFxn && ((bArr[r5] & 2) == 2);
        } catch (Throwable th) {
            new Object[]{th};
            return false;
        }
    }

    private static boolean fxn(byte[] bArr, int r5, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + r5 > bArr.length) {
            return false;
        }
        for (int r1 = 0; r1 < bArr2.length; r1++) {
            if (bArr[r1 + r5] != bArr2[r1]) {
                return false;
            }
        }
        return true;
    }
}
