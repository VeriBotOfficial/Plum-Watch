package com.anythink.basead.exoplayer.j.a;

import android.net.Uri;
import androidx.media3.datasource.cache.ContentMetadata;
import com.anythink.basead.exoplayer.j.a.a;
import com.anythink.basead.exoplayer.j.r;
import com.anythink.basead.exoplayer.j.z;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes11.dex */
public final class c implements com.anythink.basead.exoplayer.j.h {

    /* renamed from: a, reason: collision with root package name */
    public static final long f2622a = 2097152;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 4;
    public static final int e = 0;
    public static final int f = 1;
    private static final int g = -1;
    private static final long h = 102400;
    private boolean A;
    private long B;
    private long C;
    private final com.anythink.basead.exoplayer.j.a.a i;
    private final com.anythink.basead.exoplayer.j.h j;
    private final com.anythink.basead.exoplayer.j.h k;
    private final com.anythink.basead.exoplayer.j.h l;
    private final b m;
    private final boolean n;
    private final boolean o;
    private final boolean p;

    /* renamed from: q, reason: collision with root package name */
    private com.anythink.basead.exoplayer.j.h f2623q;
    private boolean r;
    private Uri s;
    private Uri t;
    private int u;
    private String v;
    private long w;
    private long x;
    private e y;
    private boolean z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public interface b {
        void a();

        void b();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.anythink.basead.exoplayer.j.a.c$c, reason: collision with other inner class name */
    public @interface InterfaceC0151c {
    }

    private static void i() {
    }

    public c(com.anythink.basead.exoplayer.j.a.a aVar, com.anythink.basead.exoplayer.j.h hVar) {
        this(aVar, hVar, 0, (byte) 0);
    }

    private c(com.anythink.basead.exoplayer.j.a.a aVar, com.anythink.basead.exoplayer.j.h hVar, int i) {
        this(aVar, hVar, i, (byte) 0);
    }

    private c(com.anythink.basead.exoplayer.j.a.a aVar, com.anythink.basead.exoplayer.j.h hVar, int i, byte b2) {
        this(aVar, hVar, new r(), new com.anythink.basead.exoplayer.j.a.b(aVar), i, null);
    }

    private c(com.anythink.basead.exoplayer.j.a.a aVar, com.anythink.basead.exoplayer.j.h hVar, com.anythink.basead.exoplayer.j.h hVar2, com.anythink.basead.exoplayer.j.g gVar, int i, b bVar) {
        this.i = aVar;
        this.j = hVar2;
        this.n = (i & 1) != 0;
        this.o = (i & 2) != 0;
        this.p = (i & 4) != 0;
        this.l = hVar;
        this.k = new z(hVar, gVar);
        this.m = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065 A[Catch: IOException -> 0x0081, TryCatch #0 {IOException -> 0x0081, blocks: (B:2:0x0000, B:7:0x0027, B:9:0x0038, B:13:0x004a, B:15:0x0052, B:18:0x0057, B:20:0x0065, B:23:0x0071, B:24:0x0076, B:26:0x007b, B:28:0x0077, B:29:0x003d, B:31:0x0041, B:35:0x001f), top: B:1:0x0000 }] */
    @Override // com.anythink.basead.exoplayer.j.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(com.anythink.basead.exoplayer.j.k r7) {
        /*
            r6 = this;
            java.lang.String r0 = com.anythink.basead.exoplayer.j.a.f.a(r7)     // Catch: java.io.IOException -> L81
            r6.v = r0     // Catch: java.io.IOException -> L81
            android.net.Uri r0 = r7.c     // Catch: java.io.IOException -> L81
            r6.s = r0     // Catch: java.io.IOException -> L81
            com.anythink.basead.exoplayer.j.a.a r1 = r6.i     // Catch: java.io.IOException -> L81
            java.lang.String r2 = r6.v     // Catch: java.io.IOException -> L81
            com.anythink.basead.exoplayer.j.a.i r1 = r1.c(r2)     // Catch: java.io.IOException -> L81
            java.lang.String r2 = "exo_redir"
            r3 = 0
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.io.IOException -> L81
            java.lang.String r1 = r1.a(r2, r3)     // Catch: java.io.IOException -> L81
            if (r1 != 0) goto L1f
            goto L23
        L1f:
            android.net.Uri r3 = android.net.Uri.parse(r1)     // Catch: java.io.IOException -> L81
        L23:
            if (r3 != 0) goto L26
            goto L27
        L26:
            r0 = r3
        L27:
            r6.t = r0     // Catch: java.io.IOException -> L81
            int r0 = r7.i     // Catch: java.io.IOException -> L81
            r6.u = r0     // Catch: java.io.IOException -> L81
            long r0 = r7.f     // Catch: java.io.IOException -> L81
            r6.w = r0     // Catch: java.io.IOException -> L81
            boolean r0 = r6.o     // Catch: java.io.IOException -> L81
            r1 = 0
            r2 = -1
            if (r0 == 0) goto L3d
            boolean r0 = r6.z     // Catch: java.io.IOException -> L81
            if (r0 == 0) goto L3d
            goto L47
        L3d:
            boolean r0 = r6.p     // Catch: java.io.IOException -> L81
            if (r0 == 0) goto L49
            long r4 = r7.g     // Catch: java.io.IOException -> L81
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L49
        L47:
            r0 = 1
            goto L4a
        L49:
            r0 = r1
        L4a:
            r6.A = r0     // Catch: java.io.IOException -> L81
            long r4 = r7.g     // Catch: java.io.IOException -> L81
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L77
            boolean r0 = r6.A     // Catch: java.io.IOException -> L81
            if (r0 == 0) goto L57
            goto L77
        L57:
            com.anythink.basead.exoplayer.j.a.a r0 = r6.i     // Catch: java.io.IOException -> L81
            java.lang.String r4 = r6.v     // Catch: java.io.IOException -> L81
            long r4 = r0.b(r4)     // Catch: java.io.IOException -> L81
            r6.x = r4     // Catch: java.io.IOException -> L81
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L7b
            long r2 = r7.f     // Catch: java.io.IOException -> L81
            long r4 = r4 - r2
            r6.x = r4     // Catch: java.io.IOException -> L81
            r2 = 0
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 <= 0) goto L71
            goto L7b
        L71:
            com.anythink.basead.exoplayer.j.i r7 = new com.anythink.basead.exoplayer.j.i     // Catch: java.io.IOException -> L81
            r7.<init>()     // Catch: java.io.IOException -> L81
            throw r7     // Catch: java.io.IOException -> L81
        L77:
            long r2 = r7.g     // Catch: java.io.IOException -> L81
            r6.x = r2     // Catch: java.io.IOException -> L81
        L7b:
            r6.a(r1)     // Catch: java.io.IOException -> L81
            long r0 = r6.x     // Catch: java.io.IOException -> L81
            return r0
        L81:
            r7 = move-exception
            r6.b(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.exoplayer.j.a.c.a(com.anythink.basead.exoplayer.j.k):long");
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.x == 0) {
            return -1;
        }
        try {
            if (this.w >= this.C) {
                a(true);
            }
            int a2 = this.f2623q.a(bArr, i, i2);
            if (a2 != -1) {
                if (f()) {
                    this.B += a2;
                }
                long j = a2;
                this.w += j;
                long j2 = this.x;
                if (j2 != -1) {
                    this.x = j2 - j;
                    return a2;
                }
            } else {
                if (this.r) {
                    c();
                    return a2;
                }
                long j3 = this.x;
                if (j3 <= 0) {
                    if (j3 == -1) {
                    }
                }
                h();
                a(false);
                return a(bArr, i, i2);
            }
            return a2;
        } catch (IOException e2) {
            if (this.r) {
                for (Throwable th = e2; th != null; th = th.getCause()) {
                    if ((th instanceof com.anythink.basead.exoplayer.j.i) && ((com.anythink.basead.exoplayer.j.i) th).b == 0) {
                        c();
                        return -1;
                    }
                }
            }
            b(e2);
            throw e2;
        }
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        return this.t;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final void b() {
        this.s = null;
        this.t = null;
        if (this.m != null && this.B > 0) {
            this.i.c();
            this.B = 0L;
        }
        try {
            h();
        } catch (IOException e2) {
            b(e2);
            throw e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(boolean r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.exoplayer.j.a.c.a(boolean):void");
    }

    private void c() {
        this.x = 0L;
        if (g()) {
            this.i.d(this.v, this.w);
        }
    }

    private static Uri a(com.anythink.basead.exoplayer.j.a.a aVar, String str, Uri uri) {
        String a2 = aVar.c(str).a(ContentMetadata.KEY_REDIRECTED_URI, (String) null);
        Uri parse = a2 != null ? Uri.parse(a2) : null;
        return parse == null ? uri : parse;
    }

    private static boolean a(IOException iOException) {
        for (IOException iOException2 = iOException; iOException2 != null; iOException2 = iOException2.getCause()) {
            if ((iOException2 instanceof com.anythink.basead.exoplayer.j.i) && ((com.anythink.basead.exoplayer.j.i) iOException2).b == 0) {
                return true;
            }
        }
        return false;
    }

    private boolean d() {
        return !f();
    }

    private boolean e() {
        return this.f2623q == this.l;
    }

    private boolean f() {
        return this.f2623q == this.j;
    }

    private boolean g() {
        return this.f2623q == this.k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void h() {
        com.anythink.basead.exoplayer.j.h hVar = this.f2623q;
        if (hVar == null) {
            return;
        }
        try {
            hVar.b();
        } finally {
            this.f2623q = null;
            this.r = false;
            e eVar = this.y;
            if (eVar != null) {
                this.i.a(eVar);
                this.y = null;
            }
        }
    }

    private void b(IOException iOException) {
        if (f() || (iOException instanceof a.C0150a)) {
            this.z = true;
        }
    }

    private int b(com.anythink.basead.exoplayer.j.k kVar) {
        if (this.o && this.z) {
            return 0;
        }
        return (this.p && kVar.g == -1) ? 1 : -1;
    }

    private void j() {
        if (this.m == null || this.B <= 0) {
            return;
        }
        this.i.c();
        this.B = 0L;
    }
}
