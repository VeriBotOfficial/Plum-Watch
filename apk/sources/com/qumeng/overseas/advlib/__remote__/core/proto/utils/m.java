package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class m {
    public static void a(Closeable... closeableArr) {
        if (closeableArr == null) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public static long a(byte[] bArr, InputStream inputStream, OutputStream outputStream) throws IOException {
        return a(bArr, inputStream, outputStream, 0L, -1L);
    }

    public static long a(byte[] bArr, InputStream inputStream, OutputStream outputStream, long j, long j2) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("buf cannot be null!");
        }
        if (inputStream.skip(j) < j) {
            return -1L;
        }
        long j3 = 0;
        while (true) {
            int r2 = inputStream.read(bArr);
            if (r2 == -1 || (j2 != -1 && j3 > j2)) {
                break;
            }
            outputStream.write(bArr, 0, r2);
            j3 += (long) r2;
        }
        outputStream.flush();
        return j3;
    }
}
