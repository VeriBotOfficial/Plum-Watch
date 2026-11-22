package com.iflytek.cloud.a.d.e.b;

import java.util.LinkedList;
import java.util.Map;

/* loaded from: classes17.dex */
public class c {
    private int c;
    private long d;
    private long e;
    private boolean i;
    private boolean j;
    private long k;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedList<a> f11127a = new LinkedList<>();
    private final LinkedList<a> b = new LinkedList<>();
    private long f = 0;
    private long g = 0;
    private long h = 0;
    private final Object l = new Object();

    public static class a extends b<byte[], Integer> {
        public a(byte[] bArr, Integer num) {
            super(bArr, num);
        }

        @Override // com.iflytek.cloud.a.d.e.b.c.b
        public /* bridge */ /* synthetic */ void a() {
            super.a();
        }

        @Override // com.iflytek.cloud.a.d.e.b.c.b, java.util.Map.Entry
        public /* bridge */ /* synthetic */ Object getKey() {
            return super.getKey();
        }

        @Override // com.iflytek.cloud.a.d.e.b.c.b, java.util.Map.Entry
        public /* bridge */ /* synthetic */ Object getValue() {
            return super.getValue();
        }

        @Override // com.iflytek.cloud.a.d.e.b.c.b, java.util.Map.Entry
        public /* bridge */ /* synthetic */ Object setValue(Object obj) {
            return super.setValue(obj);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [byte[], java.lang.Object] */
        @Override // com.iflytek.cloud.a.d.e.b.c.b
        public /* bridge */ /* synthetic */ byte[] a(byte[] bArr) {
            return super.a(bArr);
        }
    }

    private static class b<K, V> implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private K f11128a;
        private V b;

        public b(K k, V v) {
            this.f11128a = k;
            this.b = v;
        }

        public K a(K k) {
            this.f11128a = k;
            return k;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f11128a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.b;
            this.b = v;
            return v2;
        }

        public void a() {
            this.f11128a = null;
            this.b = null;
        }
    }

    public c(long j, int i, long j2, boolean z, boolean z2) {
        this.c = 512;
        this.d = 5120L;
        this.e = -1L;
        this.i = false;
        this.j = true;
        this.k = 0L;
        this.e = j;
        this.d = j2;
        this.c = i;
        this.i = z;
        this.j = z2;
        this.k = j + (i * 2);
        if (z) {
            return;
        }
        h();
    }

    private a d() throws OutOfMemoryError {
        int i;
        byte[] bArr = null;
        a remove = !this.b.isEmpty() ? this.b.remove() : null;
        if (remove != null) {
            return remove;
        }
        if (!this.i && j()) {
            throw new OutOfMemoryError("current buffer len=" + this.f + ", has match max len: " + this.e);
        }
        if (this.i) {
            i = 0;
        } else {
            i = this.c;
            bArr = new byte[i];
            this.f += i;
        }
        return new a(bArr, Integer.valueOf(i));
    }

    private void h() {
        long j = this.d;
        if (0 < j) {
            int i = (int) ((j / this.c) + 2);
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = this.c;
                this.b.add(new a(new byte[i3], Integer.valueOf(i3)));
                this.f += this.c;
            }
        }
    }

    private boolean j() {
        return -1 != this.e && this.k <= this.f;
    }

    private void l() throws OutOfMemoryError {
        if (this.f11127a.peek() != null) {
            long intValue = this.g + ((Integer) r0.getValue()).intValue();
            if (g() <= this.h - intValue) {
                a remove = this.f11127a.remove();
                if (this.i) {
                    remove.a();
                }
                this.b.add(remove);
                this.g = intValue;
            }
        }
    }

    public void a(long j) {
        synchronized (this.l) {
            long j2 = this.e + j;
            this.e = j2;
            this.k = j2 + (this.c * 2);
        }
    }

    public void b() {
        boolean z;
        synchronized (this.l) {
            z = false;
            while (this.d < this.f && !this.b.isEmpty()) {
                this.b.remove();
                this.f -= this.c;
                z = true;
            }
        }
        if (z) {
            System.gc();
        }
    }

    public long c() {
        long size;
        synchronized (this.l) {
            size = this.b.size() * this.c;
        }
        return size;
    }

    public long e() {
        long j;
        synchronized (this.l) {
            j = this.h - this.g;
        }
        return j;
    }

    public int f() {
        int size;
        synchronized (this.l) {
            size = this.f11127a.size();
        }
        return size;
    }

    public long g() {
        long j;
        synchronized (this.l) {
            j = this.e;
        }
        return j;
    }

    public boolean i() {
        boolean isEmpty;
        synchronized (this.l) {
            isEmpty = this.f11127a.isEmpty();
        }
        return isEmpty;
    }

    public a k() {
        a aVar;
        synchronized (this.l) {
            if (this.f11127a.isEmpty()) {
                aVar = null;
            } else {
                aVar = this.f11127a.pop();
                this.g += ((Integer) aVar.getValue()).intValue();
                if (!this.i && aVar.getKey() != null) {
                    this.f -= ((byte[]) aVar.getKey()).length;
                }
            }
        }
        return aVar;
    }

    public void a() {
        synchronized (this.l) {
            this.g = 0L;
            this.h = 0L;
            while (!this.f11127a.isEmpty()) {
                a pop = this.f11127a.pop();
                if (this.i) {
                    pop.a();
                }
                this.b.add(pop);
            }
        }
    }

    public void a(a aVar) {
        synchronized (this.l) {
            if (aVar != null) {
                if (this.i) {
                    aVar.a();
                    this.b.add(aVar);
                } else if (this.f < this.e && aVar.getKey() != null) {
                    this.b.add(aVar);
                    this.f += ((byte[]) aVar.getKey()).length;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009c A[Catch: all -> 0x00e7, TryCatch #0 {, blocks: (B:12:0x0014, B:15:0x001e, B:17:0x0022, B:20:0x002e, B:21:0x0064, B:23:0x0065, B:25:0x0069, B:28:0x0076, B:31:0x008a, B:34:0x009c, B:36:0x00a0, B:37:0x00ba, B:39:0x00d6, B:40:0x00db, B:43:0x00e0, B:46:0x00a5, B:48:0x0095, B:50:0x00e5), top: B:11:0x0014 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00e0 -> B:42:0x0099). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(byte[] r11, int r12, int r13) throws java.lang.IllegalArgumentException, java.lang.NullPointerException, java.lang.OutOfMemoryError {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iflytek.cloud.a.d.e.b.c.a(byte[], int, int):void");
    }
}
