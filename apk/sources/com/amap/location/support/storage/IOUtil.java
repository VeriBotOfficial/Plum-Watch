package com.amap.location.support.storage;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/* JADX INFO: loaded from: classes7.dex */
public class IOUtil {
    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int r1 = inputStream.read(bArr);
            if (r1 < 0) {
                outputStream.flush();
                return;
            }
            outputStream.write(bArr, 0, r1);
        }
    }

    public static byte[] readBytes(InputStream inputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int r2 = inputStream.read(bArr);
                    if (r2 == -1) {
                        closeQuietly(byteArrayOutputStream);
                        return byteArrayOutputStream.toByteArray();
                    }
                    byteArrayOutputStream.write(bArr, 0, r2);
                }
            } catch (Throwable th) {
                th = th;
                closeQuietly(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = null;
        }
    }

    public static String readString(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
        StringBuilder sb = new StringBuilder();
        char[] cArr = new char[1024];
        while (true) {
            int r2 = inputStreamReader.read(cArr);
            if (r2 < 0) {
                return sb.toString();
            }
            sb.append(cArr, 0, r2);
        }
    }

    public static void writeString(OutputStream outputStream, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "utf-8");
        outputStreamWriter.write(str);
        outputStreamWriter.flush();
    }
}
