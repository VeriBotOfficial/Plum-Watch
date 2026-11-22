package com.anythink.core.common.n.b;

import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f4180a;
    public static final d b;
    String c;
    private final boolean d;
    private final boolean e;
    private final int f;
    private final int g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final int k;
    private final int l;
    private final boolean m;
    private final boolean n;
    private final boolean o;

    static {
        a aVar = new a();
        aVar.f4181a = true;
        f4180a = aVar.a();
        a aVar2 = new a();
        aVar2.f = true;
        long seconds = TimeUnit.SECONDS.toSeconds(2147483647L);
        aVar2.d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
        b = aVar2.a();
    }

    private d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.d = z;
        this.e = z2;
        this.f = i;
        this.g = i2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = i3;
        this.l = i4;
        this.m = z6;
        this.n = z7;
        this.o = z8;
        this.c = str;
    }

    d(a aVar) {
        this.d = aVar.f4181a;
        this.e = aVar.b;
        this.f = aVar.c;
        this.g = -1;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = aVar.d;
        this.l = aVar.e;
        this.m = aVar.f;
        this.n = aVar.g;
        this.o = aVar.h;
    }

    public final boolean a() {
        return this.d;
    }

    public final boolean b() {
        return this.e;
    }

    public final int c() {
        return this.f;
    }

    private int j() {
        return this.g;
    }

    public final boolean d() {
        return this.h;
    }

    public final boolean e() {
        return this.i;
    }

    public final boolean f() {
        return this.j;
    }

    public final int g() {
        return this.k;
    }

    public final int h() {
        return this.l;
    }

    public final boolean i() {
        return this.m;
    }

    private boolean k() {
        return this.n;
    }

    private boolean l() {
        return this.o;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.anythink.core.common.n.b.d a(com.anythink.core.common.n.b.u r23) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.n.b.d.a(com.anythink.core.common.n.b.u):com.anythink.core.common.n.b.d");
    }

    public final String toString() {
        String sb;
        String str = this.c;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.d) {
            sb2.append("no-cache, ");
        }
        if (this.e) {
            sb2.append("no-store, ");
        }
        if (this.f != -1) {
            sb2.append("max-age=").append(this.f).append(", ");
        }
        if (this.g != -1) {
            sb2.append("s-maxage=").append(this.g).append(", ");
        }
        if (this.h) {
            sb2.append("private, ");
        }
        if (this.i) {
            sb2.append("public, ");
        }
        if (this.j) {
            sb2.append("must-revalidate, ");
        }
        if (this.k != -1) {
            sb2.append("max-stale=").append(this.k).append(", ");
        }
        if (this.l != -1) {
            sb2.append("min-fresh=").append(this.l).append(", ");
        }
        if (this.m) {
            sb2.append("only-if-cached, ");
        }
        if (this.n) {
            sb2.append("no-transform, ");
        }
        if (this.o) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            sb = "";
        } else {
            sb2.delete(sb2.length() - 2, sb2.length());
            sb = sb2.toString();
        }
        this.c = sb;
        return sb;
    }

    private String m() {
        StringBuilder sb = new StringBuilder();
        if (this.d) {
            sb.append("no-cache, ");
        }
        if (this.e) {
            sb.append("no-store, ");
        }
        if (this.f != -1) {
            sb.append("max-age=").append(this.f).append(", ");
        }
        if (this.g != -1) {
            sb.append("s-maxage=").append(this.g).append(", ");
        }
        if (this.h) {
            sb.append("private, ");
        }
        if (this.i) {
            sb.append("public, ");
        }
        if (this.j) {
            sb.append("must-revalidate, ");
        }
        if (this.k != -1) {
            sb.append("max-stale=").append(this.k).append(", ");
        }
        if (this.l != -1) {
            sb.append("min-fresh=").append(this.l).append(", ");
        }
        if (this.m) {
            sb.append("only-if-cached, ");
        }
        if (this.n) {
            sb.append("no-transform, ");
        }
        if (this.o) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f4181a;
        boolean b;
        int c = -1;
        int d = -1;
        int e = -1;
        boolean f;
        boolean g;
        boolean h;

        private a b() {
            this.f4181a = true;
            return this;
        }

        private a c() {
            this.b = true;
            return this;
        }

        private a a(int i, TimeUnit timeUnit) {
            if (i < 0) {
                throw new IllegalArgumentException("maxAge < 0: ".concat(String.valueOf(i)));
            }
            long seconds = timeUnit.toSeconds(i);
            this.c = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }

        private a a(TimeUnit timeUnit) {
            long seconds = timeUnit.toSeconds(2147483647L);
            this.d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }

        private a b(int i, TimeUnit timeUnit) {
            if (i < 0) {
                throw new IllegalArgumentException("minFresh < 0: ".concat(String.valueOf(i)));
            }
            long seconds = timeUnit.toSeconds(i);
            this.e = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }

        private a d() {
            this.f = true;
            return this;
        }

        private a e() {
            this.g = true;
            return this;
        }

        private a f() {
            this.h = true;
            return this;
        }

        public final d a() {
            return new d(this);
        }
    }
}
