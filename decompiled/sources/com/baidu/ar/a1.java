package com.baidu.ar;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class a1 {
    public static int a(byte[] bArr) {
        return ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getInt();
    }

    public static short b(byte[] bArr) {
        return ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getShort();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x016d A[Catch: IOException -> 0x0169, TRY_LEAVE, TryCatch #0 {IOException -> 0x0169, blocks: (B:38:0x0165, B:31:0x016d), top: B:37:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.baidu.ar.re c(byte[] r7) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.ar.a1.c(byte[]):com.baidu.ar.re");
    }

    public static byte[] d(byte[] bArr) {
        return bArr != null ? Arrays.copyOfRange(bArr, 44, bArr.length) : new byte[0];
    }
}
