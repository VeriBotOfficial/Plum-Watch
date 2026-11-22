package com.yandex.mobile.ads.impl;

/* loaded from: classes5.dex */
public interface ex1 {

    public static class b implements ex1 {

        /* renamed from: a, reason: collision with root package name */
        private final long f15430a;
        private final a b;

        @Override // com.yandex.mobile.ads.impl.ex1
        public final boolean b() {
            return false;
        }

        public b() {
            this(-9223372036854775807L, 0L);
        }

        public b(long j, long j2) {
            this.f15430a = j;
            this.b = new a(j2 == 0 ? gx1.c : new gx1(0L, j2));
        }

        @Override // com.yandex.mobile.ads.impl.ex1
        public final long c() {
            return this.f15430a;
        }

        @Override // com.yandex.mobile.ads.impl.ex1
        public final a b(long j) {
            return this.b;
        }
    }

    a b(long j);

    boolean b();

    long c();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final gx1 f15429a;
        public final gx1 b;

        public a(gx1 gx1Var) {
            this(gx1Var, gx1Var);
        }

        public final String toString() {
            return "[" + this.f15429a + (this.f15429a.equals(this.b) ? "" : ", " + this.b) + "]";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f15429a.equals(aVar.f15429a) && this.b.equals(aVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f15429a.hashCode() * 31);
        }

        public a(gx1 gx1Var, gx1 gx1Var2) {
            this.f15429a = (gx1) hg.a(gx1Var);
            this.b = (gx1) hg.a(gx1Var2);
        }
    }
}
