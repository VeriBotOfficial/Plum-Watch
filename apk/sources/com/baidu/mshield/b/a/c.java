package com.baidu.mshield.b.a;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: GZipUtil.java */
/* JADX INFO: loaded from: classes15.dex */
public abstract class c {
    public static byte[] a(byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(byteArrayInputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        byteArrayInputStream.close();
        return byteArray;
    }

    public static byte[] b(byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        b(byteArrayInputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        byteArrayInputStream.close();
        return byteArray;
    }

    public static void b(InputStream inputStream, OutputStream outputStream) throws IOException {
        GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream);
        byte[] bArr = new byte[2048];
        while (true) {
            int r3 = gZIPInputStream.read(bArr, 0, 2048);
            if (r3 != -1) {
                outputStream.write(bArr, 0, r3);
            } else {
                gZIPInputStream.close();
                return;
            }
        }
    }

    public static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        byte[] bArr = new byte[2048];
        while (true) {
            int r3 = inputStream.read(bArr, 0, 2048);
            if (r3 != -1) {
                gZIPOutputStream.write(bArr, 0, r3);
            } else {
                gZIPOutputStream.flush();
                gZIPOutputStream.finish();
                gZIPOutputStream.close();
                return;
            }
        }
    }
}
