package com.amap.api.col.p0003sl;

import java.io.Closeable;

/* compiled from: FileStorageModel.java */
/* loaded from: classes11.dex */
public final class x9 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1971a = m9.b("SYmFja3Vwcw");
    public static final String b = m9.b("SLmFkaXU");
    public static final String c = m9.b("JIw");

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001c A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001e A[Catch: all -> 0x00b3, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:5:0x0004, B:7:0x000a, B:9:0x0010, B:10:0x0016, B:15:0x001e, B:39:0x008c, B:32:0x008f, B:33:0x0092, B:54:0x00a4, B:50:0x00a9, B:46:0x00ac), top: B:4:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void a(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.Class<com.amap.api.col.3sl.x9> r0 = com.amap.api.col.p0003sl.x9.class
            monitor-enter(r0)
            r1 = 0
            java.io.File r2 = r4.getExternalCacheDir()     // Catch: java.lang.Exception -> L15 java.lang.Throwable -> Lb3
            if (r2 != 0) goto Le
            java.io.File r2 = r4.getCacheDir()     // Catch: java.lang.Exception -> L15 java.lang.Throwable -> Lb3
        Le:
            if (r2 == 0) goto L15
            java.lang.String r4 = r2.getAbsolutePath()     // Catch: java.lang.Exception -> L15 java.lang.Throwable -> Lb3
            goto L16
        L15:
            r4 = r1
        L16:
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Lb3
            if (r2 == 0) goto L1e
            monitor-exit(r0)
            return
        L1e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb3
            r2.<init>()     // Catch: java.lang.Throwable -> Lb3
            java.lang.StringBuilder r5 = r2.append(r5)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r2 = com.amap.api.col.p0003sl.x9.c     // Catch: java.lang.Throwable -> Lb3
            java.lang.StringBuilder r5 = r5.append(r2)     // Catch: java.lang.Throwable -> Lb3
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lb3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb3
            r6.<init>()     // Catch: java.lang.Throwable -> Lb3
            java.lang.StringBuilder r4 = r6.append(r4)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r6 = java.io.File.separator     // Catch: java.lang.Throwable -> Lb3
            java.lang.StringBuilder r4 = r4.append(r6)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r6 = com.amap.api.col.p0003sl.x9.f1971a     // Catch: java.lang.Throwable -> Lb3
            java.lang.StringBuilder r4 = r4.append(r6)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lb3
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> Lb3
            r6.<init>(r4)     // Catch: java.lang.Throwable -> Lb3
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r2 = com.amap.api.col.p0003sl.x9.b     // Catch: java.lang.Throwable -> Lb3
            r4.<init>(r6, r2)     // Catch: java.lang.Throwable -> Lb3
            boolean r2 = r6.exists()     // Catch: java.lang.Throwable -> La0
            if (r2 == 0) goto L66
            boolean r2 = r6.isDirectory()     // Catch: java.lang.Throwable -> La0
            if (r2 == 0) goto L69
        L66:
            r6.mkdirs()     // Catch: java.lang.Throwable -> La0
        L69:
            r4.createNewFile()     // Catch: java.lang.Throwable -> La0
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> La0
            java.lang.String r2 = "rws"
            r6.<init>(r4, r2)     // Catch: java.lang.Throwable -> La0
            java.nio.channels.FileChannel r4 = r6.getChannel()     // Catch: java.lang.Throwable -> L9b
            java.nio.channels.FileLock r1 = r4.tryLock()     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto L8a
            java.lang.String r2 = "UTF-8"
            byte[] r5 = r5.getBytes(r2)     // Catch: java.lang.Throwable -> L97
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)     // Catch: java.lang.Throwable -> L97
            r4.write(r5)     // Catch: java.lang.Throwable -> L97
        L8a:
            if (r1 == 0) goto L8f
            r1.release()     // Catch: java.io.IOException -> L8f java.lang.Throwable -> Lb3
        L8f:
            r4.close()     // Catch: java.io.IOException -> L92 java.lang.Throwable -> Lb3
        L92:
            a(r6)     // Catch: java.lang.Throwable -> Lb3
            monitor-exit(r0)
            return
        L97:
            r3 = r1
            r1 = r4
            r4 = r3
            goto L9c
        L9b:
            r4 = r1
        L9c:
            r3 = r1
            r1 = r4
            r4 = r3
            goto La2
        La0:
            r4 = r1
            r6 = r4
        La2:
            if (r1 == 0) goto La7
            r1.release()     // Catch: java.io.IOException -> La7 java.lang.Throwable -> Lb3
        La7:
            if (r4 == 0) goto Lac
            r4.close()     // Catch: java.io.IOException -> Lac java.lang.Throwable -> Lb3
        Lac:
            a(r6)     // Catch: java.lang.Throwable -> Lb3
            monitor-exit(r0)
            return
        Lb1:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb3
            throw r4
        Lb3:
            r4 = move-exception
            goto Lb1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.x9.a(android.content.Context, java.lang.String, java.lang.String):void");
    }
}
