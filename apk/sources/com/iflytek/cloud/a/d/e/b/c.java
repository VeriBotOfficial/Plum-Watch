package com.iflytek.cloud.a.d.e.b;

import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class c {
    private int c;
    private long d;
    private long e;
    private boolean i;
    private boolean j;
    private long k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
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

        /* JADX INFO: renamed from: a, reason: collision with root package name */
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

    public c(long j, int r6, long j2, boolean z, boolean z2) {
        this.c = 512;
        this.d = 5120L;
        this.e = -1L;
        this.i = false;
        this.j = true;
        this.k = 0L;
        this.e = j;
        this.d = j2;
        this.c = r6;
        this.i = z;
        this.j = z2;
        this.k = j + ((long) (r6 * 2));
        if (z) {
            return;
        }
        h();
    }

    private a d() throws OutOfMemoryError {
        int r0;
        byte[] bArr = null;
        a aVarRemove = !this.b.isEmpty() ? this.b.remove() : null;
        if (aVarRemove != null) {
            return aVarRemove;
        }
        if (!this.i && j()) {
            throw new OutOfMemoryError("current buffer len=" + this.f + ", has match max len: " + this.e);
        }
        if (this.i) {
            r0 = 0;
        } else {
            r0 = this.c;
            bArr = new byte[r0];
            this.f += (long) r0;
        }
        return new a(bArr, Integer.valueOf(r0));
    }

    private void h() {
        long j = this.d;
        if (0 < j) {
            int r0 = (int) ((j / ((long) this.c)) + 2);
            for (int r1 = 0; r1 < r0; r1++) {
                int r2 = this.c;
                this.b.add(new a(new byte[r2], Integer.valueOf(r2)));
                this.f += (long) this.c;
            }
        }
    }

    private boolean j() {
        return -1 != this.e && this.k <= this.f;
    }

    private void l() throws OutOfMemoryError {
        a aVarPeek = this.f11127a.peek();
        if (aVarPeek != null) {
            long jIntValue = this.g + ((long) ((Integer) aVarPeek.getValue()).intValue());
            if (g() <= this.h - jIntValue) {
                a aVarRemove = this.f11127a.remove();
                if (this.i) {
                    aVarRemove.a();
                }
                this.b.add(aVarRemove);
                this.g = jIntValue;
            }
        }
    }

    public void a(long j) {
        synchronized (this.l) {
            long j2 = this.e + j;
            this.e = j2;
            this.k = j2 + ((long) (this.c * 2));
        }
    }

    public void b() {
        boolean z;
        synchronized (this.l) {
            z = false;
            while (this.d < this.f && !this.b.isEmpty()) {
                this.b.remove();
                this.f -= (long) this.c;
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
        boolean zIsEmpty;
        synchronized (this.l) {
            zIsEmpty = this.f11127a.isEmpty();
        }
        return zIsEmpty;
    }

    public a k() {
        a aVarPop;
        synchronized (this.l) {
            if (this.f11127a.isEmpty()) {
                aVarPop = null;
            } else {
                aVarPop = this.f11127a.pop();
                this.g += (long) ((Integer) aVarPop.getValue()).intValue();
                if (!this.i && aVarPop.getKey() != null) {
                    this.f -= (long) ((byte[]) aVarPop.getKey()).length;
                }
            }
        }
        return aVarPop;
    }

    public void a() {
        synchronized (this.l) {
            this.g = 0L;
            this.h = 0L;
            while (!this.f11127a.isEmpty()) {
                a aVarPop = this.f11127a.pop();
                if (this.i) {
                    aVarPop.a();
                }
                this.b.add(aVarPop);
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
                    this.f += (long) ((byte[]) aVar.getKey()).length;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009c A[Catch: all -> 0x00e7, TryCatch #0 {, blocks: (B:12:0x0014, B:15:0x001e, B:17:0x0022, B:20:0x002e, B:21:0x0064, B:22:0x0065, B:24:0x0069, B:28:0x0076, B:31:0x008a, B:35:0x009c, B:37:0x00a0, B:39:0x00ba, B:41:0x00d6, B:42:0x00db, B:44:0x00e0, B:38:0x00a5, B:32:0x0095, B:45:0x00e5), top: B:52:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0 A[Catch: all -> 0x00e7, TryCatch #0 {, blocks: (B:12:0x0014, B:15:0x001e, B:17:0x0022, B:20:0x002e, B:21:0x0064, B:22:0x0065, B:24:0x0069, B:28:0x0076, B:31:0x008a, B:35:0x009c, B:37:0x00a0, B:39:0x00ba, B:41:0x00d6, B:42:0x00db, B:44:0x00e0, B:38:0x00a5, B:32:0x0095, B:45:0x00e5), top: B:52:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5 A[Catch: all -> 0x00e7, TryCatch #0 {, blocks: (B:12:0x0014, B:15:0x001e, B:17:0x0022, B:20:0x002e, B:21:0x0064, B:22:0x0065, B:24:0x0069, B:28:0x0076, B:31:0x008a, B:35:0x009c, B:37:0x00a0, B:39:0x00ba, B:41:0x00d6, B:42:0x00db, B:44:0x00e0, B:38:0x00a5, B:32:0x0095, B:45:0x00e5), top: B:52:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d6 A[Catch: all -> 0x00e7, TryCatch #0 {, blocks: (B:12:0x0014, B:15:0x001e, B:17:0x0022, B:20:0x002e, B:21:0x0064, B:22:0x0065, B:24:0x0069, B:28:0x0076, B:31:0x008a, B:35:0x009c, B:37:0x00a0, B:39:0x00ba, B:41:0x00d6, B:42:0x00db, B:44:0x00e0, B:38:0x00a5, B:32:0x0095, B:45:0x00e5), top: B:52:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00e0 -> B:33:0x0099). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:35:0x009c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public void a(byte[] r11, int r12, int r13) throws java.lang.IllegalArgumentException, java.lang.NullPointerException, java.lang.OutOfMemoryError {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iflytek.cloud.a.d.e.b.c.a(byte[], int, int):void");
    }
}
