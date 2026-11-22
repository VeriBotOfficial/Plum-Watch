package com.anythink.core.common.res.b;

import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.core.common.res.d;
import com.anythink.core.common.v.o;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public class a extends com.anythink.core.common.res.image.b {

    /* renamed from: a, reason: collision with root package name */
    final String f4294a;
    public com.anythink.core.common.res.b.b b;
    public List<b> c;
    public c k;
    int l;
    private final int m;
    private final int n;
    private int o;
    private int p;

    /* renamed from: q, reason: collision with root package name */
    private long f4295q;
    private String r;
    private boolean s;
    private final long t;
    private long u;
    private MediaMetadataRetriever v;
    private Object w;

    public static abstract class b {
        public abstract void a(C0211a c0211a);

        public abstract void a(String str, String str2);

        public abstract boolean a(int i, long j, long j2);
    }

    public static abstract class c {
        public abstract void a();

        public abstract void a(String str, String str2);
    }

    @Override // com.anythink.core.common.res.image.b
    protected final Map<String, String> a() {
        return null;
    }

    @Override // com.anythink.core.common.res.image.b
    protected final void b() {
    }

    public a(String str) {
        super(str);
        this.f4294a = "a";
        this.m = 0;
        this.n = 1;
        this.t = 512000L;
        this.w = new Object();
        this.l = -1;
        this.c = new ArrayList();
        this.b = new com.anythink.core.common.res.b.b();
        this.p = 0;
        this.f4295q = 0L;
        this.s = false;
        this.u = 0L;
        this.o = 0;
    }

    public final void a(com.anythink.core.common.res.b.b bVar) {
        synchronized (this.w) {
            String str = this.d;
            int i = bVar.f4297a;
            int i2 = bVar.c;
            long j = bVar.d;
            if (this.b.f4297a < bVar.f4297a) {
                this.b.f4297a = bVar.f4297a;
            }
            if (bVar.d > this.u) {
                this.u = bVar.d;
            }
            if (this.b.c != 1) {
                this.b.c = bVar.c;
            }
        }
    }

    public final synchronized void a(b bVar) {
        if (!this.c.contains(bVar)) {
            this.c.add(bVar);
        }
    }

    private void a(c cVar) {
        this.k = cVar;
    }

    private void a(int i) {
        this.o = i;
    }

    private int h() {
        return this.o;
    }

    public final void e() {
        String str = this.d;
        j();
        if (j()) {
            i();
            this.o = 1;
            d();
        }
    }

    public final void f() {
        String str = this.d;
        j();
        this.s = true;
        if (j()) {
            i();
            this.o = 1;
            d();
        }
    }

    public final void g() {
        String str = this.d;
        this.s = false;
        this.o = 0;
    }

    private void i() {
        String a2 = d.a(t.b().g()).a(4);
        if (TextUtils.isEmpty(a2)) {
            b("", "without saveDirectory");
            return;
        }
        File file = new File(a2);
        if (!file.exists()) {
            file.mkdirs();
        }
        this.r = d.a(t.b().g()).c(4, o.a(this.d));
        File file2 = new File(this.r);
        if (file2.exists()) {
            this.f4295q = file2.length();
        }
    }

    private boolean j() {
        int i = this.p;
        if (i != 100) {
            return this.o == 0 && i < 100;
        }
        a(i, this.f4295q);
        b(this.p, this.f4295q);
        return false;
    }

    private boolean b(int i) {
        synchronized (this.w) {
            if (this.s) {
                return true;
            }
            if (this.j < 512000) {
                return true;
            }
            if (this.b.c == 2 && i >= this.b.f4297a) {
                return false;
            }
            if (this.b.c == 1) {
                return true;
            }
            List<b> list = this.c;
            return list == null || list.size() != 0;
        }
    }

    private synchronized void a(int i, long j) {
        if (this.l != i) {
            String str = this.d;
            this.l = i;
        }
        com.anythink.core.common.a.o.a().a(this.d, this.r, this.j, j, i, false);
        Iterator<b> it = this.c.iterator();
        boolean z = false;
        if (this.j > 512000 || i == 100) {
            boolean z2 = false;
            while (it.hasNext()) {
                if (it.next().a(i, j, this.j)) {
                    z2 = i != 100;
                    it.remove();
                }
            }
            z = z2;
        }
        if (z) {
            com.anythink.core.common.a.o.a().a(this.d, this.r, this.j, j, i);
        }
    }

    private void b(int i, long j) {
        String str = this.d;
        if (i == 100) {
            com.anythink.core.common.a.o.a().a(this.d, this.r, this.j, j, i, true);
            c cVar = this.k;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    /* renamed from: com.anythink.core.common.res.b.a$a, reason: collision with other inner class name */
    public class C0211a {

        /* renamed from: a, reason: collision with root package name */
        long f4296a;
        long b;
        long c;
        int d;

        public C0211a(long j, long j2, long j3, int i) {
            this.f4296a = j;
            this.b = j2;
            this.c = j3;
            this.d = i;
        }

        public final long a() {
            return this.f4296a;
        }

        public final long b() {
            return this.b;
        }

        public final long c() {
            return this.c;
        }

        public final int d() {
            return this.d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0152 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.anythink.core.common.res.image.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean a(java.io.InputStream r23) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.res.b.a.a(java.io.InputStream):boolean");
    }

    @Override // com.anythink.core.common.res.image.b
    protected final void a(com.anythink.core.common.v.b.d dVar) {
        com.anythink.core.common.v.b.b.a().a(dVar, 4);
    }

    @Override // com.anythink.core.common.res.image.b
    protected final void a(String str, String str2) {
        b(str, str2);
    }

    private synchronized void b(String str, String str2) {
        String str3 = this.d;
        this.o = 0;
        Iterator<b> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().a(str, str2);
        }
        k();
        c cVar = this.k;
        if (cVar != null) {
            cVar.a(str, str2);
        }
    }

    private synchronized void a(C0211a c0211a) {
        String str = this.d;
        long j = c0211a.b;
        int i = c0211a.d;
        Iterator<b> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().a(c0211a);
        }
    }

    private synchronized void k() {
        this.c.clear();
    }

    private void l() {
        long j;
        MediaMetadataRetriever mediaMetadataRetriever;
        if (this.u > 0 && this.v == null) {
            long currentTimeMillis = System.currentTimeMillis();
            this.v = new MediaMetadataRetriever();
            int i = this.b.f4297a;
            try {
                try {
                    this.v.setDataSource(this.r);
                    j = Long.parseLong(this.v.extractMetadata(9));
                    if (j > 0) {
                        try {
                            i = (int) (((this.u + 500) * 100) / j);
                            if (i > 100) {
                                i = 100;
                            }
                            if (this.b.f4297a < i) {
                                this.b.f4297a = i;
                            }
                        } catch (Throwable unused) {
                            mediaMetadataRetriever = this.v;
                            mediaMetadataRetriever.release();
                            a(new C0211a(this.u, j, System.currentTimeMillis() - currentTimeMillis, i));
                            String str = this.d;
                            int i2 = this.b.f4297a;
                        }
                    }
                    mediaMetadataRetriever = this.v;
                } catch (Throwable unused2) {
                    j = -1;
                }
                mediaMetadataRetriever.release();
            } catch (Throwable unused3) {
            }
            a(new C0211a(this.u, j, System.currentTimeMillis() - currentTimeMillis, i));
            String str2 = this.d;
            int i22 = this.b.f4297a;
        }
    }

    @Override // com.anythink.core.common.res.image.b
    protected final void c() {
        this.o = 0;
    }
}
