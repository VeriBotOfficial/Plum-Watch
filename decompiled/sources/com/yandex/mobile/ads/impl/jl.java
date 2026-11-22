package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ex1;
import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class jl {

    /* renamed from: a, reason: collision with root package name */
    protected final a f15921a;
    protected final f b;
    protected c c;
    private final int d;

    public static class a implements ex1 {

        /* renamed from: a, reason: collision with root package name */
        private final d f15922a;
        private final long b;
        private final long c = 0;
        private final long d;
        private final long e;
        private final long f;
        private final long g;

        @Override // com.yandex.mobile.ads.impl.ex1
        public final boolean b() {
            return true;
        }

        public a(d dVar, long j, long j2, long j3, long j4, long j5) {
            this.f15922a = dVar;
            this.b = j;
            this.d = j2;
            this.e = j3;
            this.f = j4;
            this.g = j5;
        }

        @Override // com.yandex.mobile.ads.impl.ex1
        public final ex1.a b(long j) {
            gx1 gx1Var = new gx1(j, c.a(this.f15922a.a(j), this.c, this.d, this.e, this.f, this.g));
            return new ex1.a(gx1Var, gx1Var);
        }

        @Override // com.yandex.mobile.ads.impl.ex1
        public final long c() {
            return this.b;
        }
    }

    public static final class b implements d {
        @Override // com.yandex.mobile.ads.impl.jl.d
        public final long a(long j) {
            return j;
        }
    }

    protected interface d {
        long a(long j);
    }

    public static final class e {
        public static final e d = new e(-3, -9223372036854775807L, -1);

        /* renamed from: a, reason: collision with root package name */
        private final int f15924a;
        private final long b;
        private final long c;

        public static e a(long j, long j2) {
            return new e(-1, j, j2);
        }

        public static e b(long j, long j2) {
            return new e(-2, j, j2);
        }

        public static e a(long j) {
            return new e(0, -9223372036854775807L, j);
        }

        private e(int i, long j, long j2) {
            this.f15924a = i;
            this.b = j;
            this.c = j2;
        }
    }

    protected interface f {
        e a(wz wzVar, long j) throws IOException;

        default void a() {
        }
    }

    protected jl(d dVar, f fVar, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = fVar;
        this.d = i;
        this.f15921a = new a(dVar, j, j2, j3, j4, j5);
    }

    public final a a() {
        return this.f15921a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0102, code lost:
    
        if (r8 != r19.a()) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0104, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0105, code lost:
    
        r20.f16573a = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0107, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.yandex.mobile.ads.impl.wz r19, com.yandex.mobile.ads.impl.pj1 r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.jl.a(com.yandex.mobile.ads.impl.wz, com.yandex.mobile.ads.impl.pj1):int");
    }

    public final boolean b() {
        return this.c != null;
    }

    public final void a(long j) {
        c cVar = this.c;
        if (cVar == null || cVar.f15923a != j) {
            long a2 = this.f15921a.f15922a.a(j);
            a aVar = this.f15921a;
            this.c = new c(j, a2, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g);
        }
    }

    protected static class c {

        /* renamed from: a, reason: collision with root package name */
        private final long f15923a;
        private final long b;
        private final long c;
        private long d;
        private long e;
        private long f;
        private long g;
        private long h;

        protected static long a(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
            long j8 = j7 / 20;
            int i = f92.f15466a;
            return Math.max(j4, Math.min(((j7 + j4) - j6) - j8, j5 - 1));
        }

        protected c(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f15923a = j;
            this.b = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.g = j6;
            this.c = j7;
            this.h = a(j2, j3, j4, j5, j6, j7);
        }
    }
}
