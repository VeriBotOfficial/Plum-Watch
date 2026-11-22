package sg.bigo.ads.ad.interstitial.e.a;

import sg.bigo.ads.common.utils.r;

/* loaded from: classes7.dex */
public abstract class b {
    protected final int b;
    protected final int c;
    protected final int d;
    protected final int e;
    protected final int f;
    protected final int g;
    protected final int h;
    protected final int i;
    protected final a j = new a(this, 0);

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f19208a;
        public int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final int k;
        public final int l;

        /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private a(sg.bigo.ads.ad.interstitial.e.a.b r9) {
            /*
                r8 = this;
                r8.<init>()
                int r0 = sg.bigo.ads.ad.interstitial.d.b
                int r1 = r9.e()
                r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                r3 = 3
                r4 = 2
                r5 = 1041865114(0x3e19999a, float:0.15)
                r6 = 0
                r7 = -1
                if (r1 == r4) goto L32
                if (r1 == r3) goto L25
                r8.f19208a = r6
                r8.b = r7
                int r1 = sg.bigo.ads.common.w.b.a(r0, r5)
                r8.c = r1
                r8.d = r0
                r8.f = r0
                goto L40
            L25:
                r1 = 1
                r8.f19208a = r1
                r1 = 1050253722(0x3e99999a, float:0.3)
                int r1 = sg.bigo.ads.common.w.b.a(r2, r1)
                r8.b = r1
                goto L36
            L32:
                r8.f19208a = r6
                r8.b = r2
            L36:
                int r1 = sg.bigo.ads.common.w.b.a(r7, r5)
                r8.c = r1
                r8.d = r7
                r8.f = r7
            L40:
                int r1 = r8.f
                r2 = 128(0x80, float:1.8E-43)
                int r1 = sg.bigo.ads.common.w.b.a(r1, r2)
                r8.e = r1
                int r1 = r9.c()
                if (r1 == r4) goto L5c
                r2 = 4
                if (r1 == r2) goto L5c
                int r1 = r8.b
                r8.g = r1
                int r1 = r8.c
                r8.h = r1
                goto L60
            L5c:
                r8.g = r6
                r8.h = r6
            L60:
                r8.i = r7
                int r0 = sg.bigo.ads.common.w.b.a(r0, r5)
                r8.j = r0
                int r9 = r9.d()
                if (r9 == r4) goto L80
                if (r9 == r3) goto L78
                r9 = -16736769(0xffffffffff009dff, float:-1.7096155E38)
                r8.k = r9
                r8.l = r6
                return
            L78:
                r9 = 872415231(0x33ffffff, float:1.1920928E-7)
                r8.k = r9
                r8.l = r7
                return
            L80:
                r9 = -14972829(0xffffffffff1b8863, float:-2.067385E38)
                r8.k = r9
                r8.l = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.e.a.b.a.<init>(sg.bigo.ads.ad.interstitial.e.a.b):void");
        }

        /* synthetic */ a(b bVar, byte b) {
            this(bVar);
        }
    }

    public b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
    }

    public static boolean a(b bVar) {
        return bVar == null || bVar.b() == 0;
    }

    public final a a() {
        return this.j;
    }

    public final int b() {
        int i = this.b;
        if (i == 0 || i == 1 || i == 2 || i == 3) {
            return i;
        }
        return 0;
    }

    public int c() {
        int i = this.c;
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return i;
        }
        return 1;
    }

    public final int d() {
        int i = this.d;
        if (i == 1 || i == 2 || i == 3) {
            return i;
        }
        return 1;
    }

    public final int e() {
        int i = this.e;
        if (i == 1 || i == 2 || i == 3) {
            return i;
        }
        return 1;
    }

    public final int f() {
        int i = this.f;
        if (i == 2 || i == 4 || i == 6 || i == 8 || i == 10 || i == 12 || i == 14 || i == 16 || i == 18 || i == 20) {
            return i;
        }
        return 20;
    }

    public final long g() {
        int i = this.g;
        if (i == 0 || i == 1 || i == 2 || i == 3) {
            return r.f19732a.a(this.g);
        }
        return 0L;
    }

    public final long h() {
        r rVar;
        int i;
        int i2 = this.h;
        if (i2 != 0 && i2 != 1) {
            i = 2;
            if (i2 != 2 && i2 != 3) {
                rVar = r.f19732a;
                return rVar.a(i);
            }
        }
        rVar = r.f19732a;
        i = this.h;
        return rVar.a(i);
    }

    public final int i() {
        int i = this.i;
        if (i == 1 || i == 2 || i == 3) {
            return i;
        }
        return 3;
    }
}
