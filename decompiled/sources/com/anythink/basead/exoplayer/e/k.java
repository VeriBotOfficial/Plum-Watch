package com.anythink.basead.exoplayer.e;

/* loaded from: classes11.dex */
public interface k {
    a a(long j);

    boolean a();

    long b();

    public static final class b implements k {

        /* renamed from: a, reason: collision with root package name */
        private final long f2476a;
        private final a b;

        @Override // com.anythink.basead.exoplayer.e.k
        public final boolean a() {
            return false;
        }

        private b(long j) {
            this(j, 0L);
        }

        public b(long j, long j2) {
            this.f2476a = j;
            this.b = new a(j2 == 0 ? l.f2477a : new l(0L, j2));
        }

        @Override // com.anythink.basead.exoplayer.e.k
        public final long b() {
            return this.f2476a;
        }

        @Override // com.anythink.basead.exoplayer.e.k
        public final a a(long j) {
            return this.b;
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final l f2475a;
        public final l b;

        public a(l lVar) {
            this(lVar, lVar);
        }

        public a(l lVar, l lVar2) {
            this.f2475a = (l) com.anythink.basead.exoplayer.k.a.a(lVar);
            this.b = (l) com.anythink.basead.exoplayer.k.a.a(lVar2);
        }

        public final String toString() {
            return "[" + this.f2475a + (this.f2475a.equals(this.b) ? "" : ", " + this.b) + "]";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f2475a.equals(aVar.f2475a) && this.b.equals(aVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (this.f2475a.hashCode() * 31) + this.b.hashCode();
        }
    }
}
