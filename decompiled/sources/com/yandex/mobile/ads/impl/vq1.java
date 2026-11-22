package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.qf0;
import java.io.Closeable;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vq1 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final vp1 f17188a;
    private final mm1 b;
    private final String c;
    private final int d;
    private final if0 e;
    private final qf0 f;
    private final zq1 g;
    private final vq1 h;
    private final vq1 i;
    private final vq1 j;
    private final long k;
    private final long l;
    private final b60 m;

    public vq1(vp1 request, mm1 protocol, String message, int i, if0 if0Var, qf0 headers, zq1 zq1Var, vq1 vq1Var, vq1 vq1Var2, vq1 vq1Var3, long j, long j2, b60 b60Var) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f17188a = request;
        this.b = protocol;
        this.c = message;
        this.d = i;
        this.e = if0Var;
        this.f = headers;
        this.g = zq1Var;
        this.h = vq1Var;
        this.i = vq1Var2;
        this.j = vq1Var3;
        this.k = j;
        this.l = j2;
        this.m = b60Var;
    }

    public final a k() {
        return new a(this);
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private vp1 f17189a;
        private mm1 b;
        private int c;
        private String d;
        private if0 e;
        private qf0.a f;
        private zq1 g;
        private vq1 h;
        private vq1 i;
        private vq1 j;
        private long k;
        private long l;
        private b60 m;

        public final a c() {
            Intrinsics.checkNotNullParameter("Proxy-Authenticate", "name");
            Intrinsics.checkNotNullParameter("OkHttp-Preemptive", "value");
            qf0.a aVar = this.f;
            aVar.getClass();
            Intrinsics.checkNotNullParameter("Proxy-Authenticate", "name");
            Intrinsics.checkNotNullParameter("OkHttp-Preemptive", "value");
            qf0.b.b("Proxy-Authenticate");
            qf0.b.b("OkHttp-Preemptive", "Proxy-Authenticate");
            aVar.a("Proxy-Authenticate");
            aVar.a("Proxy-Authenticate", "OkHttp-Preemptive");
            return this;
        }

        public final a c(vq1 vq1Var) {
            if (vq1Var.a() == null) {
                this.j = vq1Var;
                return this;
            }
            throw new IllegalArgumentException("priorResponse.body != null".toString());
        }

        public final int b() {
            return this.c;
        }

        public a() {
            this.c = -1;
            this.f = new qf0.a();
        }

        public a(vq1 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.c = -1;
            this.f17189a = response.o();
            this.b = response.m();
            this.c = response.d();
            this.d = response.i();
            this.e = response.f();
            this.f = response.g().b();
            this.g = response.a();
            this.h = response.j();
            this.i = response.b();
            this.j = response.l();
            this.k = response.p();
            this.l = response.n();
            this.m = response.e();
        }

        public final a a(zq1 zq1Var) {
            this.g = zq1Var;
            return this;
        }

        public final a b(vq1 vq1Var) {
            a(vq1Var, "networkResponse");
            this.h = vq1Var;
            return this;
        }

        public final vq1 a() {
            int i = this.c;
            if (i >= 0) {
                vp1 vp1Var = this.f17189a;
                if (vp1Var != null) {
                    mm1 mm1Var = this.b;
                    if (mm1Var != null) {
                        String str = this.d;
                        if (str != null) {
                            return new vq1(vp1Var, mm1Var, str, i, this.e, this.f.a(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            throw new IllegalStateException(("code < 0: " + i).toString());
        }

        public final a b(long j) {
            this.k = j;
            return this;
        }

        public final a a(vq1 vq1Var) {
            a(vq1Var, "cacheResponse");
            this.i = vq1Var;
            return this;
        }

        private static void a(vq1 vq1Var, String str) {
            if (vq1Var != null) {
                if (vq1Var.a() == null) {
                    if (vq1Var.j() == null) {
                        if (vq1Var.b() == null) {
                            if (vq1Var.l() != null) {
                                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException((str + ".body != null").toString());
            }
        }

        public final a a(int i) {
            this.c = i;
            return this;
        }

        public final a a(if0 if0Var) {
            this.e = if0Var;
            return this;
        }

        public final a a(qf0 headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f = headers.b();
            return this;
        }

        public final void a(b60 deferredTrailers) {
            Intrinsics.checkNotNullParameter(deferredTrailers, "deferredTrailers");
            this.m = deferredTrailers;
        }

        public final a a(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.d = message;
            return this;
        }

        public final a a(mm1 protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            this.b = protocol;
            return this;
        }

        public final a a(long j) {
            this.l = j;
            return this;
        }

        public final a a(vp1 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f17189a = request;
            return this;
        }
    }

    public final vp1 o() {
        return this.f17188a;
    }

    public final mm1 m() {
        return this.b;
    }

    public final String i() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final if0 f() {
        return this.e;
    }

    public final qf0 g() {
        return this.f;
    }

    public final zq1 a() {
        return this.g;
    }

    public static String a(vq1 vq1Var, String name) {
        vq1Var.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        String a2 = vq1Var.f.a(name);
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    public final vq1 j() {
        return this.h;
    }

    public final vq1 b() {
        return this.i;
    }

    public final vq1 l() {
        return this.j;
    }

    public final long p() {
        return this.k;
    }

    public final long n() {
        return this.l;
    }

    public final b60 e() {
        return this.m;
    }

    public final boolean h() {
        int i = this.d;
        return 200 <= i && i < 300;
    }

    public final List<go> c() {
        String str;
        qf0 qf0Var = this.f;
        int i = this.d;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i != 407) {
                return CollectionsKt.emptyList();
            }
            str = "Proxy-Authenticate";
        }
        return xh0.a(qf0Var, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        zq1 zq1Var = this.g;
        if (zq1Var != null) {
            g92.a((Closeable) zq1Var.c());
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.d + ", message=" + this.c + ", url=" + this.f17188a.g() + "}";
    }
}
