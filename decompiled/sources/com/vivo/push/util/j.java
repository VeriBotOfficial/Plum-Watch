package com.vivo.push.util;

/* compiled from: CryptographicTool.java */
/* loaded from: classes2.dex */
public final class j {
    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) (bArr[i] ^ 16);
        }
        return new String(cArr);
    }
}
