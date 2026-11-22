package com.anythink.expressad.foundation.g.a;

import android.graphics.Bitmap;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* loaded from: classes12.dex */
public final class c implements e<String, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<String, Bitmap> f4831a;
    private final int b;
    private int c;

    @Override // com.anythink.expressad.foundation.g.a.e
    public final /* synthetic */ void a(String str) {
        String str2 = str;
        if (str2 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            Bitmap remove = this.f4831a.remove(str2);
            if (remove != null) {
                this.c -= a(remove);
            }
        }
    }

    public c(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.b = i;
        this.f4831a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.anythink.expressad.foundation.g.a.e
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Bitmap b(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            Bitmap bitmap = this.f4831a.get(str);
            if (bitmap == null || bitmap.isRecycled()) {
                return null;
            }
            return bitmap;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.anythink.expressad.foundation.g.a.e
    public boolean a(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.c += a(bitmap);
            Bitmap put = this.f4831a.put(str, bitmap);
            if (put != null) {
                this.c -= a(put);
            }
        }
        a(this.b);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0076, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.c     // Catch: java.lang.Throwable -> L77
            if (r0 < 0) goto L56
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f4831a     // Catch: java.lang.Throwable -> L77
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L77
            if (r0 == 0) goto L11
            int r0 = r3.c     // Catch: java.lang.Throwable -> L77
            if (r0 != 0) goto L56
        L11:
            int r0 = r3.c     // Catch: java.lang.Throwable -> L77
            if (r0 <= r4) goto L54
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f4831a     // Catch: java.lang.Throwable -> L77
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L77
            if (r0 == 0) goto L1e
            goto L54
        L1e:
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f4831a     // Catch: java.lang.Throwable -> L77
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L77
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L77
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L77
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L77
            if (r0 != 0) goto L32
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L77
            goto L55
        L32:
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L77
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L77
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L77
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> L77
            int r0 = a(r0)     // Catch: java.lang.Throwable -> L52
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r2 = r3.f4831a     // Catch: java.lang.Throwable -> L52
            java.lang.Object r1 = r2.remove(r1)     // Catch: java.lang.Throwable -> L52
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch: java.lang.Throwable -> L52
            r1.recycle()     // Catch: java.lang.Throwable -> L52
            int r1 = r3.c     // Catch: java.lang.Throwable -> L52
            int r1 = r1 - r0
            r3.c = r1     // Catch: java.lang.Throwable -> L52
        L52:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L77
            goto L0
        L54:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L77
        L55:
            return
        L56:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L77
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77
            r0.<init>()     // Catch: java.lang.Throwable -> L77
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L77
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L77
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L77
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L77
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L77
            throw r4     // Catch: java.lang.Throwable -> L77
        L77:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.g.a.c.a(int):void");
    }

    /* renamed from: b, reason: avoid collision after fix types in other method */
    private void b2(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            Bitmap remove = this.f4831a.remove(str);
            if (remove != null) {
                this.c -= a(remove);
            }
        }
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final Collection<String> a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f4831a.keySet());
        }
        return hashSet;
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final void b() {
        a(-1);
    }

    private static int a(Bitmap bitmap) {
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.b));
    }
}
