package com.yandex.mobile.ads.impl;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* loaded from: classes5.dex */
final class mo1<K, V> extends lk0<K, V> {
    static final lk0<Object, Object> h = new mo1(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    @CheckForNull
    private final transient Object e;
    final transient Object[] f;
    private final transient int g;

    static class a<K, V> extends mk0<Map.Entry<K, V>> {
        private final transient lk0<K, V> d;
        private final transient Object[] e;
        private final transient int f = 0;
        private final transient int g;

        /* renamed from: com.yandex.mobile.ads.impl.mo1$a$a, reason: collision with other inner class name */
        final class C0977a extends kk0<Map.Entry<K, V>> {
            @Override // com.yandex.mobile.ads.impl.ik0
            public final boolean f() {
                return true;
            }

            @Override // java.util.List
            public final Object get(int i) {
                vj1.a(i, a.this.g);
                a aVar = a.this;
                int i2 = i * 2;
                Object requireNonNull = Objects.requireNonNull(aVar.e[aVar.f + i2]);
                a aVar2 = a.this;
                return new AbstractMap.SimpleImmutableEntry(requireNonNull, Objects.requireNonNull(aVar2.e[i2 + (aVar2.f ^ 1)]));
            }

            C0977a() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return a.this.g;
            }
        }

        @Override // com.yandex.mobile.ads.impl.ik0
        final boolean f() {
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.mk0
        final kk0<Map.Entry<K, V>> g() {
            return new C0977a();
        }

        a(lk0 lk0Var, Object[] objArr, int i) {
            this.d = lk0Var;
            this.e = objArr;
            this.g = i;
        }

        @Override // com.yandex.mobile.ads.impl.ik0
        final int a(int i, Object[] objArr) {
            return b().a(i, objArr);
        }

        @Override // com.yandex.mobile.ads.impl.mk0, com.yandex.mobile.ads.impl.ik0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final i82<Map.Entry<K, V>> iterator() {
            return b().listIterator(0);
        }

        @Override // com.yandex.mobile.ads.impl.ik0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@CheckForNull Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.d.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.g;
        }
    }

    static final class b<K> extends mk0<K> {
        private final transient lk0<K, ?> d;
        private final transient kk0<K> e;

        @Override // com.yandex.mobile.ads.impl.ik0
        final boolean f() {
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.ik0
        final int a(int i, Object[] objArr) {
            return this.e.a(i, objArr);
        }

        @Override // com.yandex.mobile.ads.impl.mk0, com.yandex.mobile.ads.impl.ik0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final i82<K> iterator() {
            return this.e.listIterator(0);
        }

        b(lk0<K, ?> lk0Var, kk0<K> kk0Var) {
            this.d = lk0Var;
            this.e = kk0Var;
        }

        @Override // com.yandex.mobile.ads.impl.mk0, com.yandex.mobile.ads.impl.ik0
        public final kk0<K> b() {
            return this.e;
        }

        @Override // com.yandex.mobile.ads.impl.ik0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@CheckForNull Object obj) {
            return this.d.get(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.d.size();
        }
    }

    @Override // com.yandex.mobile.ads.impl.lk0
    final mk0<Map.Entry<K, V>> b() {
        return new a(this, this.f, this.g);
    }

    @Override // com.yandex.mobile.ads.impl.lk0
    final mk0<K> c() {
        return new b(this, new c(this.f, 0, this.g));
    }

    @Override // com.yandex.mobile.ads.impl.lk0
    final ik0<V> d() {
        return new c(this.f, 1, this.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        r2[r6] = (byte) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a7, code lost:
    
        r2[r6] = (short) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e1, code lost:
    
        r2[r7] = r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <K, V> com.yandex.mobile.ads.impl.mo1<K, V> a(int r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.mo1.a(int, java.lang.Object[]):com.yandex.mobile.ads.impl.mo1");
    }

    private static IllegalArgumentException a(Object obj, Object obj2, Object[] objArr, int i) {
        return new IllegalArgumentException("Multiple entries with same key: " + obj + "=" + obj2 + " and " + objArr[i] + "=" + objArr[i ^ 1]);
    }

    private mo1(@CheckForNull Object obj, Object[] objArr, int i) {
        this.e = obj;
        this.f = objArr;
        this.g = i;
    }

    @Override // java.util.Map
    public final int size() {
        return this.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009f A[RETURN] */
    @Override // com.yandex.mobile.ads.impl.lk0, java.util.Map
    @javax.annotation.CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V get(@javax.annotation.CheckForNull java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.e
            java.lang.Object[] r1 = r8.f
            int r2 = r8.g
            r3 = 0
            if (r9 != 0) goto Lb
            goto L8f
        Lb:
            r4 = 1
            if (r2 != r4) goto L23
            r0 = 0
            r0 = r1[r0]
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L8f
            r9 = r1[r4]
            java.lang.Object r9 = java.util.Objects.requireNonNull(r9)
            goto L9d
        L23:
            if (r0 != 0) goto L26
            goto L8f
        L26:
            boolean r2 = r0 instanceof byte[]
            if (r2 == 0) goto L51
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r5 = r0 + (-1)
            int r0 = r9.hashCode()
            int r0 = com.yandex.mobile.ads.impl.jf0.a(r0)
        L38:
            r0 = r0 & r5
            r6 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L41
            goto L8f
        L41:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4e
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9d
        L4e:
            int r0 = r0 + 1
            goto L38
        L51:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L7d
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r5 = r0 + (-1)
            int r0 = r9.hashCode()
            int r0 = com.yandex.mobile.ads.impl.jf0.a(r0)
        L63:
            r0 = r0 & r5
            short r6 = r2[r0]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L6d
            goto L8f
        L6d:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L7a
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9d
        L7a:
            int r0 = r0 + 1
            goto L63
        L7d:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 - r4
            int r5 = r9.hashCode()
            int r5 = com.yandex.mobile.ads.impl.jf0.a(r5)
        L89:
            r5 = r5 & r2
            r6 = r0[r5]
            r7 = -1
            if (r6 != r7) goto L91
        L8f:
            r9 = r3
            goto L9d
        L91:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto La1
            r9 = r6 ^ 1
            r9 = r1[r9]
        L9d:
            if (r9 != 0) goto La0
            return r3
        La0:
            return r9
        La1:
            int r5 = r5 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.mo1.get(java.lang.Object):java.lang.Object");
    }

    static final class c extends kk0<Object> {
        private final transient Object[] e;
        private final transient int f;
        private final transient int g;

        @Override // com.yandex.mobile.ads.impl.ik0
        final boolean f() {
            return true;
        }

        c(Object[] objArr, int i, int i2) {
            this.e = objArr;
            this.f = i;
            this.g = i2;
        }

        @Override // java.util.List
        public final Object get(int i) {
            vj1.a(i, this.g);
            return Objects.requireNonNull(this.e[(i * 2) + this.f]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.g;
        }
    }
}
