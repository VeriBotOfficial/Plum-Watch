package com.baidu.platform.comapi.resource;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: IOUtils.java */
/* JADX INFO: loaded from: classes15.dex */
public class a {
    public static void a(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        if (inputStream == null || outputStream == null || bArr == null) {
            throw new IOException("copyStream : outputStream or inputStream is null");
        }
        try {
            if (!(inputStream instanceof BufferedInputStream)) {
                inputStream = new BufferedInputStream(inputStream);
            }
            if (!(outputStream instanceof BufferedOutputStream)) {
                outputStream = new BufferedOutputStream(outputStream);
            }
            while (true) {
                int r0 = inputStream.read(bArr);
                if (r0 == -1) {
                    outputStream.flush();
                    return;
                }
                outputStream.write(bArr, 0, r0);
            }
        } finally {
            a(inputStream);
            a(outputStream);
        }
    }

    public static void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception unused) {
        }
    }
}
