package com.wakeup.common.utils;

/* loaded from: classes2.dex */
public class IOUtils {
    private static final String TAG = "IOUtils";

    private IOUtils() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (r8 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0024, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
    
        if (r8 == null) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String streamToString(java.io.InputStream r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L35
            java.lang.String r3 = "UTF-8"
            r2.<init>(r8, r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L35
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2d
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2d
        L12:
            java.lang.String r1 = r3.readLine()     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L6c
            if (r1 == 0) goto L1c
            r0.append(r1)     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L6c
            goto L12
        L1c:
            r2.close()     // Catch: java.io.IOException -> L1f
        L1f:
            r3.close()     // Catch: java.io.IOException -> L22
        L22:
            if (r8 == 0) goto L67
        L24:
            r8.close()     // Catch: java.io.IOException -> L67
            goto L67
        L28:
            r1 = move-exception
            goto L39
        L2a:
            r0 = move-exception
            r3 = r1
            goto L6d
        L2d:
            r3 = move-exception
            r7 = r3
            r3 = r1
            r1 = r7
            goto L39
        L32:
            r0 = move-exception
            r3 = r1
            goto L6e
        L35:
            r2 = move-exception
            r3 = r1
            r1 = r2
            r2 = r3
        L39:
            java.lang.String r4 = "IOUtils"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r5.<init>()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r6 = "streamToString IOException: "
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L6c
            java.lang.StringBuilder r1 = r5.append(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L6c
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L6c
            com.wakeup.common.log.LogUtils.e(r4, r1)     // Catch: java.lang.Throwable -> L6c
            if (r2 == 0) goto L5f
            r2.close()     // Catch: java.io.IOException -> L5f
        L5f:
            if (r3 == 0) goto L64
            r3.close()     // Catch: java.io.IOException -> L64
        L64:
            if (r8 == 0) goto L67
            goto L24
        L67:
            java.lang.String r8 = r0.toString()
            return r8
        L6c:
            r0 = move-exception
        L6d:
            r1 = r2
        L6e:
            if (r1 == 0) goto L73
            r1.close()     // Catch: java.io.IOException -> L73
        L73:
            if (r3 == 0) goto L78
            r3.close()     // Catch: java.io.IOException -> L78
        L78:
            if (r8 == 0) goto L7d
            r8.close()     // Catch: java.io.IOException -> L7d
        L7d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.utils.IOUtils.streamToString(java.io.InputStream):java.lang.String");
    }
}
