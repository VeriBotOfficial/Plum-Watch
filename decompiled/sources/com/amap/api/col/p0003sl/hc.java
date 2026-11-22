package com.amap.api.col.p0003sl;

/* compiled from: ZipUpdateDataStrategy.java */
/* loaded from: classes11.dex */
public class hc extends gc {
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        if (r4 == null) goto L32;
     */
    @Override // com.amap.api.col.p0003sl.gc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected byte[] b(byte[] r9) {
        /*
            r8 = this;
            java.lang.String r0 = "zp2"
            java.lang.String r1 = "zp1"
            java.lang.String r2 = "ut"
            int r3 = com.amap.api.col.p0003sl.m9.d
            r3 = 0
            if (r9 == 0) goto L73
            int r4 = r9.length
            if (r4 != 0) goto L10
            goto L73
        L10:
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L40
            r4.<init>()     // Catch: java.lang.Throwable -> L40
            java.util.zip.ZipOutputStream r5 = new java.util.zip.ZipOutputStream     // Catch: java.lang.Throwable -> L3d
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L3d
            java.util.zip.ZipEntry r6 = new java.util.zip.ZipEntry     // Catch: java.lang.Throwable -> L3b
            java.lang.String r7 = "log"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L3b
            r5.putNextEntry(r6)     // Catch: java.lang.Throwable -> L3b
            r5.write(r9)     // Catch: java.lang.Throwable -> L3b
            r5.closeEntry()     // Catch: java.lang.Throwable -> L3b
            r5.finish()     // Catch: java.lang.Throwable -> L3b
            byte[] r9 = r4.toByteArray()     // Catch: java.lang.Throwable -> L3b
            r5.close()     // Catch: java.lang.Throwable -> L35
            goto L39
        L35:
            r3 = move-exception
            com.amap.api.col.p0003sl.fa.a(r3, r2, r1)
        L39:
            r3 = r9
            goto L54
        L3b:
            r9 = move-exception
            goto L43
        L3d:
            r9 = move-exception
            r5 = r3
            goto L43
        L40:
            r9 = move-exception
            r4 = r3
            r5 = r4
        L43:
            java.lang.String r6 = "zp"
            com.amap.api.col.p0003sl.fa.a(r9, r2, r6)     // Catch: java.lang.Throwable -> L5d
            if (r5 == 0) goto L52
            r5.close()     // Catch: java.lang.Throwable -> L4e
            goto L52
        L4e:
            r9 = move-exception
            com.amap.api.col.p0003sl.fa.a(r9, r2, r1)
        L52:
            if (r4 == 0) goto L5c
        L54:
            r4.close()     // Catch: java.lang.Throwable -> L58
            goto L5c
        L58:
            r9 = move-exception
            com.amap.api.col.p0003sl.fa.a(r9, r2, r0)
        L5c:
            return r3
        L5d:
            r9 = move-exception
            if (r5 == 0) goto L68
            r5.close()     // Catch: java.lang.Throwable -> L64
            goto L68
        L64:
            r3 = move-exception
            com.amap.api.col.p0003sl.fa.a(r3, r2, r1)
        L68:
            if (r4 == 0) goto L72
            r4.close()     // Catch: java.lang.Throwable -> L6e
            goto L72
        L6e:
            r1 = move-exception
            com.amap.api.col.p0003sl.fa.a(r1, r2, r0)
        L72:
            throw r9
        L73:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.hc.b(byte[]):byte[]");
    }
}
