package com.pgl.ssdk;

import java.io.BufferedInputStream;

/* loaded from: classes17.dex */
public class af {
    private static void a(byte[] bArr, int i, byte[] bArr2) {
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2 % bArr2.length]);
        }
    }

    private static String a(BufferedInputStream bufferedInputStream) {
        int read;
        if (bufferedInputStream == null) {
            return "";
        }
        byte[] bArr = new byte[4096];
        StringBuilder sb = new StringBuilder();
        do {
            try {
                read = bufferedInputStream.read(bArr);
                if (read > 0) {
                    sb.append(new String(bArr, 0, read));
                }
            } catch (Exception unused) {
            }
        } while (read >= 4096);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if (r1 == null) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(java.lang.String r5) {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L5b
            java.lang.String r2 = "sh"
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L5b
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L5c
            java.io.OutputStream r3 = r1.getOutputStream()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L5c
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L5c
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L44
            java.io.InputStream r4 = r1.getInputStream()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L44
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L44
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L5e
            r2.write(r5)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L5e
            r5 = 10
            r2.write(r5)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L5e
            r2.flush()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L5e
            r2.close()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L5e
            r1.waitFor()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L5e
            java.lang.String r5 = a(r3)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L5e
            r2.close()     // Catch: java.io.IOException -> L39
        L39:
            r3.close()     // Catch: java.io.IOException -> L3c
        L3c:
            r0 = r5
            goto L6b
        L3e:
            r5 = move-exception
            goto L42
        L40:
            r5 = move-exception
            r3 = r0
        L42:
            r0 = r2
            goto L4b
        L44:
            r3 = r0
            goto L5e
        L46:
            r5 = move-exception
            goto L4a
        L48:
            r5 = move-exception
            r1 = r0
        L4a:
            r3 = r0
        L4b:
            if (r0 == 0) goto L50
            r0.close()     // Catch: java.io.IOException -> L50
        L50:
            if (r3 == 0) goto L55
            r3.close()     // Catch: java.io.IOException -> L55
        L55:
            if (r1 == 0) goto L5a
            r1.destroy()
        L5a:
            throw r5
        L5b:
            r1 = r0
        L5c:
            r2 = r0
            r3 = r2
        L5e:
            if (r2 == 0) goto L63
            r2.close()     // Catch: java.io.IOException -> L63
        L63:
            if (r3 == 0) goto L68
            r3.close()     // Catch: java.io.IOException -> L68
        L68:
            if (r1 != 0) goto L6b
            goto L6e
        L6b:
            r1.destroy()
        L6e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.af.a(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00dd, code lost:
    
        if (r9.length() == 0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.String a(android.content.Context r9) {
        /*
            java.lang.Class<com.pgl.ssdk.af> r0 = com.pgl.ssdk.af.class
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld5
            r1.<init>()     // Catch: java.lang.Throwable -> Ld5
            java.io.File r2 = r9.getFilesDir()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> Ld5
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r2 = "/dic"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Ld5
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> Ld5
            r2.<init>(r1)     // Catch: java.lang.Throwable -> Ld5
            boolean r2 = r2.exists()     // Catch: java.lang.Throwable -> Ld5
            if (r2 == 0) goto L51
            java.lang.String r2 = "chmod 777 "
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Throwable -> Ld5
            a(r2)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r2 = a(r1)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r3 = "chmod 600 "
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Throwable -> Ld5
            a(r3)     // Catch: java.lang.Throwable -> Ld5
            if (r2 == 0) goto L51
            int r3 = r2.length()     // Catch: java.lang.Throwable -> Ld5
            if (r3 <= 0) goto L51
            monitor-exit(r0)
            return r2
        L51:
            android.content.res.Resources r9 = r9.getResources()     // Catch: java.lang.Throwable -> Ld5
            android.content.res.AssetManager r9 = r9.getAssets()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r2 = "dic"
            java.io.InputStream r9 = r9.open(r2)     // Catch: java.lang.Throwable -> Ld5
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> Ld5
            r2.<init>()     // Catch: java.lang.Throwable -> Ld5
            r3 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r3]     // Catch: java.lang.Throwable -> Ld5
        L68:
            r5 = 0
            int r6 = r9.read(r4, r5, r3)     // Catch: java.lang.Throwable -> Ld5
            r7 = -1
            if (r6 == r7) goto L83
            java.lang.String r7 = "dic"
            java.lang.String r8 = "UTF-8"
            java.nio.charset.Charset r8 = java.nio.charset.Charset.forName(r8)     // Catch: java.lang.Throwable -> Ld5
            byte[] r7 = r7.getBytes(r8)     // Catch: java.lang.Throwable -> Ld5
            a(r4, r6, r7)     // Catch: java.lang.Throwable -> Ld5
            r2.write(r4, r5, r6)     // Catch: java.lang.Throwable -> Ld5
            goto L68
        L83:
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Ld5
            r9.<init>(r1)     // Catch: java.lang.Throwable -> Ld5
            byte[] r2 = r2.toByteArray()     // Catch: java.lang.Throwable -> Ld5
            r9.write(r2)     // Catch: java.lang.Throwable -> Ld5
            r9.close()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r9 = "chmod 777 "
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r9 = r9.concat(r2)     // Catch: java.lang.Throwable -> Ld5
            a(r9)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r9 = a(r1)     // Catch: java.lang.Throwable -> Ld5
            if (r9 == 0) goto Lab
            int r2 = r9.length()     // Catch: java.lang.Throwable -> Ld5
            if (r2 != 0) goto Lc7
        Lab:
            java.io.RandomAccessFile r9 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r2 = "rw"
            r9.<init>(r1, r2)     // Catch: java.lang.Throwable -> Ld5
            r2 = 1
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> Ld5
            r3 = 2
            r2[r5] = r3     // Catch: java.lang.Throwable -> Ld5
            r3 = 16
            r9.seek(r3)     // Catch: java.lang.Throwable -> Ld5
            r9.write(r2)     // Catch: java.lang.Throwable -> Ld5
            r9.close()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r9 = a(r1)     // Catch: java.lang.Throwable -> Ld5
        Lc7:
            java.lang.String r2 = "chmod 600 "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Throwable -> Ld5
            a(r1)     // Catch: java.lang.Throwable -> Ld5
            goto Ld7
        Ld5:
            java.lang.String r9 = "0[<!>]EXCEPTION[<!>]"
        Ld7:
            if (r9 == 0) goto Ldf
            int r1 = r9.length()     // Catch: java.lang.Throwable -> Le3
            if (r1 != 0) goto Le1
        Ldf:
            java.lang.String r9 = "0[<!>]ERROR[<!>]"
        Le1:
            monitor-exit(r0)
            return r9
        Le3:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le3
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.af.a(android.content.Context):java.lang.String");
    }
}
