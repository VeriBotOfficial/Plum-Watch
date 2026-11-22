package io.appmetrica.analytics.impl;

import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* loaded from: classes6.dex */
public abstract class Qa {
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.io.File r9) {
        /*
            r1 = 0
            if (r9 == 0) goto L79
            boolean r0 = r9.exists()
            if (r0 != 0) goto Lb
            goto L79
        Lb:
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L6e
            java.lang.String r0 = "r"
            r2.<init>(r9, r0)     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L6e
            java.nio.channels.FileChannel r3 = r2.getChannel()     // Catch: java.lang.Throwable -> L42 java.lang.Throwable -> L45
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8 = 1
            r4 = 0
            java.nio.channels.FileLock r4 = r3.lock(r4, r6, r8)     // Catch: java.lang.Throwable -> L42 java.lang.Throwable -> L45
            long r5 = r9.length()     // Catch: java.lang.Throwable -> L40 java.lang.Throwable -> L70
            int r0 = (int) r5     // Catch: java.lang.Throwable -> L40 java.lang.Throwable -> L70
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)     // Catch: java.lang.Throwable -> L40 java.lang.Throwable -> L70
            r3.read(r0)     // Catch: java.lang.Throwable -> L40 java.lang.Throwable -> L70
            r0.flip()     // Catch: java.lang.Throwable -> L40 java.lang.Throwable -> L70
            byte[] r0 = r0.array()     // Catch: java.lang.Throwable -> L40 java.lang.Throwable -> L70
            r9.getAbsolutePath()
            a(r4)
            io.appmetrica.analytics.impl.In.a(r2)
            r9 = r0
            goto L7a
        L40:
            r0 = move-exception
            goto L4a
        L42:
            r0 = move-exception
            r4 = r1
            goto L4a
        L45:
            r4 = r1
            goto L70
        L47:
            r0 = move-exception
            r2 = r1
            r4 = r2
        L4a:
            io.appmetrica.analytics.impl.Fj r3 = io.appmetrica.analytics.impl.AbstractC3204ej.f18258a     // Catch: java.lang.Throwable -> L63
            java.lang.String r5 = "error_during_file_reading"
            r3.getClass()     // Catch: java.lang.Throwable -> L63
            io.appmetrica.analytics.impl.fj r6 = new io.appmetrica.analytics.impl.fj     // Catch: java.lang.Throwable -> L63
            r6.<init>(r5, r0)     // Catch: java.lang.Throwable -> L63
            r3.a(r6)     // Catch: java.lang.Throwable -> L63
            r9.getAbsolutePath()
            a(r4)
            io.appmetrica.analytics.impl.In.a(r2)
            goto L79
        L63:
            r0 = move-exception
            r9.getAbsolutePath()
            a(r4)
            io.appmetrica.analytics.impl.In.a(r2)
            throw r0
        L6e:
            r2 = r1
            r4 = r2
        L70:
            r9.getAbsolutePath()
            a(r4)
            io.appmetrica.analytics.impl.In.a(r2)
        L79:
            r9 = r1
        L7a:
            if (r9 == 0) goto L99
            java.lang.String r1 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L84
            java.lang.String r0 = "UTF-8"
            r1.<init>(r9, r0)     // Catch: java.io.UnsupportedEncodingException -> L84
            goto L99
        L84:
            r0 = move-exception
            java.lang.String r1 = new java.lang.String
            r1.<init>(r9)
            io.appmetrica.analytics.impl.Fj r9 = io.appmetrica.analytics.impl.AbstractC3204ej.f18258a
            r9.getClass()
            io.appmetrica.analytics.impl.fj r2 = new io.appmetrica.analytics.impl.fj
            java.lang.String r3 = "read_share_file_with_unsupported_encoding"
            r2.<init>(r3, r0)
            r9.a(r2)
        L99:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Qa.a(java.io.File):java.lang.String");
    }

    public static void a(FileLock fileLock) {
        if (fileLock == null || !fileLock.isValid()) {
            return;
        }
        try {
            fileLock.release();
        } catch (IOException unused) {
        }
    }

    public static void a(String str, FileOutputStream fileOutputStream) {
        FileLock fileLock = null;
        try {
            FileChannel channel = fileOutputStream.getChannel();
            fileLock = channel.lock();
            byte[] bytes = str.getBytes("UTF-8");
            ByteBuffer allocate = ByteBuffer.allocate(bytes.length);
            allocate.put(bytes);
            allocate.flip();
            channel.write(allocate);
            channel.force(true);
        } catch (IOException unused) {
        } finally {
            a(fileLock);
            In.a((Closeable) fileOutputStream);
        }
    }
}
