package com.qumeng.overseas.advlib.__remote__.utils;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes17.dex */
public class i {
    public static byte[] a(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream, 8192);
        gZIPOutputStream.write(bArr);
        bufferedOutputStream.close();
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] b(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 8192);
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read < 0) {
                    bufferedOutputStream.close();
                    gZIPInputStream.close();
                    a(byteArrayInputStream);
                    return byteArrayOutputStream.toByteArray();
                }
                bufferedOutputStream.write(bArr2, 0, read);
            }
        } catch (Throwable th) {
            a(byteArrayInputStream);
            throw th;
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
