package com.anythink.expressad.foundation.g.f.d;

import com.anythink.expressad.foundation.g.f.j;
import com.anythink.expressad.foundation.g.f.l;
import com.facebook.cache.disk.DefaultDiskStorage;
import java.io.File;

/* loaded from: classes12.dex */
public class a extends j<Void> {
    private static final String c = "a";
    private File d;
    private File e;

    @Override // com.anythink.expressad.foundation.g.f.j
    public final int j() {
        return 1;
    }

    public a(File file, String str) {
        super(str);
        this.d = file;
        this.e = new File(file + DefaultDiskStorage.FileType.TEMP);
    }

    @Override // com.anythink.expressad.foundation.g.f.j
    protected final l<Void> a(com.anythink.expressad.foundation.g.f.f.c cVar) {
        if (!f()) {
            if (this.e.canRead() && this.e.length() > 0) {
                if (this.e.renameTo(this.d)) {
                    return l.a(null, cVar);
                }
                return l.a(new com.anythink.expressad.foundation.g.f.a.a(4, cVar));
            }
            return l.a(new com.anythink.expressad.foundation.g.f.a.a(4, cVar));
        }
        return l.a(new com.anythink.expressad.foundation.g.f.a.a(-2, cVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        r12.b(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.anythink.expressad.foundation.g.f.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] a(com.anythink.expressad.foundation.g.f.f.b r11, com.anythink.expressad.foundation.g.f.c r12) {
        /*
            r10 = this;
            java.util.List r0 = r11.b()
            java.lang.String r1 = "Content-Length"
            java.lang.String r0 = com.anythink.expressad.foundation.g.f.g.d.a(r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 != 0) goto L1c
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r0 = r0.longValue()
            r6 = r0
            goto L1d
        L1c:
            r6 = r2
        L1d:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r1 = 0
            if (r0 <= 0) goto L3a
            java.io.File r0 = r10.d
            long r4 = r0.length()
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L3a
            java.io.File r11 = r10.d
            java.io.File r0 = r10.e
            r11.renameTo(r0)
            r8 = r6
            r5 = r10
            r4 = r12
            r4.a(r5, r6, r8)
            return r1
        L3a:
            r5 = r10
            r4 = r12
            java.io.RandomAccessFile r12 = new java.io.RandomAccessFile
            java.io.File r0 = r5.e
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.String r8 = "rw"
            r12.<init>(r0, r8)
            r12.setLength(r2)
            java.io.InputStream r8 = r11.c()     // Catch: java.lang.Throwable -> L9b
            java.util.List r11 = r11.b()     // Catch: java.lang.Throwable -> L97
            boolean r11 = com.anythink.expressad.foundation.g.f.g.d.b(r11)     // Catch: java.lang.Throwable -> L97
            if (r11 == 0) goto L64
            boolean r11 = r8 instanceof java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L97
            if (r11 != 0) goto L64
            java.util.zip.GZIPInputStream r11 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L97
            r11.<init>(r8)     // Catch: java.lang.Throwable -> L97
            goto L65
        L64:
            r11 = r8
        L65:
            r0 = 6144(0x1800, float:8.61E-42)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L94
        L69:
            int r8 = r11.read(r0)     // Catch: java.lang.Throwable -> L94
            r9 = -1
            if (r8 == r9) goto L85
            r9 = 0
            r12.write(r0, r9, r8)     // Catch: java.lang.Throwable -> L94
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L94
            long r8 = r8 + r2
            r4.a(r5, r6, r8)     // Catch: java.lang.Throwable -> L94
            boolean r2 = r10.f()     // Catch: java.lang.Throwable -> L94
            if (r2 == 0) goto L83
            r4.b(r10)     // Catch: java.lang.Throwable -> L94
            goto L85
        L83:
            r2 = r8
            goto L69
        L85:
            if (r11 == 0) goto L90
            r11.close()     // Catch: java.lang.Exception -> L8b
            goto L90
        L8b:
            r0 = move-exception
            r11 = r0
            r11.getMessage()
        L90:
            r12.close()
            return r1
        L94:
            r0 = move-exception
            r1 = r11
            goto L9c
        L97:
            r0 = move-exception
            r11 = r0
            r1 = r8
            goto L9d
        L9b:
            r0 = move-exception
        L9c:
            r11 = r0
        L9d:
            if (r1 == 0) goto La7
            r1.close()     // Catch: java.lang.Exception -> La3
            goto La7
        La3:
            r0 = move-exception
            r0.getMessage()
        La7:
            r12.close()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.g.f.d.a.a(com.anythink.expressad.foundation.g.f.f.b, com.anythink.expressad.foundation.g.f.c):byte[]");
    }
}
