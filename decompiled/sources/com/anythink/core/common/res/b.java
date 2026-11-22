package com.anythink.core.common.res;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.core.common.res.image.a;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public class b {
    private static final String b = "ImageLoader";
    private static volatile b c;

    /* renamed from: a, reason: collision with root package name */
    Context f4288a;
    private Map<String, Integer> d;
    private final Object f = new Object();
    private final ConcurrentHashMap<String, List<a>> g = new ConcurrentHashMap<>();
    private c<String, SoftReference<Bitmap>> e = new c<String, SoftReference<Bitmap>>(((int) Runtime.getRuntime().maxMemory()) / 5) { // from class: com.anythink.core.common.res.b.3
        @Override // com.anythink.core.common.res.c
        protected final /* synthetic */ int a(String str, SoftReference<Bitmap> softReference) {
            String str2 = str;
            SoftReference<Bitmap> softReference2 = softReference;
            Bitmap bitmap = softReference2 != null ? softReference2.get() : null;
            if (b.this.d == null) {
                b.this.d = new HashMap(8);
            }
            if (bitmap == null) {
                Integer num = (Integer) b.this.d.get(str2);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            }
            int rowBytes = bitmap.getRowBytes() * bitmap.getHeight();
            b.this.d.put(str2, Integer.valueOf(rowBytes));
            return rowBytes;
        }

        @Override // com.anythink.core.common.res.c
        protected final /* synthetic */ void a(boolean z, String str, SoftReference<Bitmap> softReference, SoftReference<Bitmap> softReference2) {
            Bitmap bitmap;
            String str2 = str;
            SoftReference<Bitmap> softReference3 = softReference;
            SoftReference<Bitmap> softReference4 = softReference2;
            super.a(z, (boolean) str2, softReference3, softReference4);
            if (softReference3 != null) {
                try {
                    bitmap = softReference3.get();
                } catch (Exception unused) {
                    return;
                }
            } else {
                bitmap = null;
            }
            if (b.this.d != null) {
                b.this.d.remove(str2);
            }
            if (softReference3 == null || softReference3.equals(softReference4) || bitmap == null || bitmap.isRecycled()) {
                return;
            }
            bitmap.recycle();
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        private int a2(String str, SoftReference<Bitmap> softReference) {
            Bitmap bitmap = softReference != null ? softReference.get() : null;
            if (b.this.d == null) {
                b.this.d = new HashMap(8);
            }
            if (bitmap == null) {
                Integer num = (Integer) b.this.d.get(str);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            }
            int rowBytes = bitmap.getRowBytes() * bitmap.getHeight();
            b.this.d.put(str, Integer.valueOf(rowBytes));
            return rowBytes;
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        private void a2(boolean z, String str, SoftReference<Bitmap> softReference, SoftReference<Bitmap> softReference2) {
            Bitmap bitmap;
            super.a(z, (boolean) str, softReference, softReference2);
            if (softReference != null) {
                try {
                    bitmap = softReference.get();
                } catch (Exception unused) {
                    return;
                }
            } else {
                bitmap = null;
            }
            if (b.this.d != null) {
                b.this.d.remove(str);
            }
            if (softReference == null || softReference.equals(softReference2) || bitmap == null || bitmap.isRecycled()) {
                return;
            }
            bitmap.recycle();
        }
    };

    public interface a {
        void onFail(String str, String str2);

        void onSuccess(String str, Bitmap bitmap);
    }

    private void b(String str, Bitmap bitmap) {
        synchronized (this.g) {
            try {
                LinkedList linkedList = (LinkedList) this.g.remove(str);
                if (linkedList != null) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        a aVar = (a) it.next();
                        if (aVar != null) {
                            t.b().b(new AnonymousClass1(bitmap, aVar, str));
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: com.anythink.core.common.res.b$1, reason: invalid class name */
    final class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bitmap f4289a;
        final /* synthetic */ a b;
        final /* synthetic */ String c;

        AnonymousClass1(Bitmap bitmap, a aVar, String str) {
            this.f4289a = bitmap;
            this.b = aVar;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Bitmap bitmap = this.f4289a;
            if (bitmap != null) {
                this.b.onSuccess(this.c, bitmap);
            } else {
                this.b.onFail(this.c, "Bitmap load fail");
            }
        }
    }

    private void a(String str, String str2) {
        synchronized (this.g) {
            try {
                LinkedList linkedList = (LinkedList) this.g.remove(str);
                if (linkedList != null) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        a aVar = (a) it.next();
                        if (aVar != null) {
                            t.b().b(new AnonymousClass2(aVar, str, str2));
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: com.anythink.core.common.res.b$2, reason: invalid class name */
    final class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a f4290a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        AnonymousClass2(a aVar, String str, String str2) {
            this.f4290a = aVar;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f4290a.onFail(this.b, this.c);
        }
    }

    public final void a(String str, Bitmap bitmap) {
        if (a(str) != null || bitmap == null) {
            return;
        }
        this.e.b(str, new SoftReference<>(bitmap));
    }

    private Bitmap a(String str) {
        SoftReference<Bitmap> a2 = this.e.a((c<String, SoftReference<Bitmap>>) str);
        if (a2 != null) {
            return a2.get();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r5 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        if (r5 != null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap a(com.anythink.core.common.res.e r5, int r6, int r7) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L57
            java.lang.String r1 = r5.h
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto Lc
            goto L57
        Lc:
            java.lang.String r1 = r5.h
            java.lang.String r1 = com.anythink.core.common.v.o.a(r1)
            if (r6 > 0) goto L20
            android.content.Context r2 = r4.f4288a     // Catch: java.lang.Throwable -> L2e
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> L2e
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()     // Catch: java.lang.Throwable -> L2e
            int r6 = r2.widthPixels     // Catch: java.lang.Throwable -> L2e
        L20:
            if (r7 > 0) goto L2e
            android.content.Context r2 = r4.f4288a     // Catch: java.lang.Throwable -> L2e
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> L2e
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()     // Catch: java.lang.Throwable -> L2e
            int r7 = r2.heightPixels     // Catch: java.lang.Throwable -> L2e
        L2e:
            java.lang.Object r2 = r4.f
            monitor-enter(r2)
            android.content.Context r3 = r4.f4288a     // Catch: java.lang.Throwable -> L54
            com.anythink.core.common.res.d r3 = com.anythink.core.common.res.d.a(r3)     // Catch: java.lang.Throwable -> L54
            int r5 = r5.g     // Catch: java.lang.Throwable -> L54
            java.io.FileInputStream r5 = r3.a(r5, r1)     // Catch: java.lang.Throwable -> L54
            if (r5 != 0) goto L41
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
            return r0
        L41:
            java.io.FileDescriptor r1 = r5.getFD()     // Catch: java.lang.Throwable -> L4f
            android.graphics.Bitmap r0 = com.anythink.core.common.v.h.a(r1, r6, r7)     // Catch: java.lang.Throwable -> L4f
            if (r5 == 0) goto L52
        L4b:
            r5.close()     // Catch: java.lang.Exception -> L52 java.lang.Throwable -> L54
            goto L52
        L4f:
            if (r5 == 0) goto L52
            goto L4b
        L52:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
            return r0
        L54:
            r5 = move-exception
            monitor-exit(r2)
            throw r5
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.res.b.a(com.anythink.core.common.res.e, int, int):android.graphics.Bitmap");
    }

    public final Bitmap b(e eVar, int i, int i2) {
        if (TextUtils.isEmpty(eVar.h)) {
            return null;
        }
        Bitmap a2 = a(eVar.h);
        if (a2 != null && !a2.isRecycled()) {
            return a2;
        }
        Bitmap a3 = a(eVar, i, i2);
        if (a3 == null || a3.isRecycled()) {
            return null;
        }
        a(eVar.h, a3);
        return a3;
    }

    private b(Context context) {
        this.f4288a = context.getApplicationContext();
    }

    public static b a(Context context) {
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    c = new b(context);
                }
            }
        }
        return c;
    }

    public final void a(e eVar, a aVar) {
        a(eVar, -1, -1, aVar);
    }

    public final void a(final e eVar, final int i, final int i2, final a aVar) {
        if (eVar == null || TextUtils.isEmpty(eVar.h)) {
            if (aVar != null) {
                aVar.onFail("", "No url info.");
                return;
            }
            return;
        }
        Bitmap a2 = a(eVar.h);
        if (a2 == null || a2.isRecycled() || (a2.getWidth() < i && a2.getHeight() < i2)) {
            com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.res.b.4
                @Override // java.lang.Runnable
                public final void run() {
                    Bitmap a3 = b.this.a(eVar, i, i2);
                    if (a3 != null && !a3.isRecycled()) {
                        String str = eVar.h;
                        b.this.a(eVar.h, a3);
                        if (aVar != null) {
                            LinkedList linkedList = new LinkedList();
                            linkedList.add(aVar);
                            b.this.g.put(eVar.h, linkedList);
                        }
                        b.a(b.this, eVar.h, a3);
                        return;
                    }
                    b.a(b.this, eVar, i, i2, aVar);
                }
            }, 2);
        } else if (aVar != null) {
            aVar.onSuccess(eVar.h, a2);
        }
    }

    private void b(e eVar, int i, int i2, a aVar) {
        synchronized (this.g) {
            if (!this.g.containsKey(eVar.h)) {
                if (aVar != null) {
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(aVar);
                    this.g.put(eVar.h, linkedList);
                }
                com.anythink.core.common.res.image.a aVar2 = new com.anythink.core.common.res.image.a(eVar);
                aVar2.a(new AnonymousClass5(i, i2, eVar));
                aVar2.d();
            } else {
                LinkedList linkedList2 = (LinkedList) this.g.get(eVar.h);
                if (linkedList2 != null && aVar != null && !linkedList2.contains(aVar)) {
                    linkedList2.add(aVar);
                }
            }
        }
    }

    /* renamed from: com.anythink.core.common.res.b$5, reason: invalid class name */
    final class AnonymousClass5 implements a.InterfaceC0212a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f4293a;
        final /* synthetic */ int b;
        final /* synthetic */ e c;

        AnonymousClass5(int i, int i2, e eVar) {
            this.f4293a = i;
            this.b = i2;
            this.c = eVar;
        }

        @Override // com.anythink.core.common.res.image.a.InterfaceC0212a
        public final void a(e eVar) {
            String str = eVar.h;
            Bitmap a2 = b.this.a(eVar, this.f4293a, this.b);
            if (a2 != null) {
                b.this.a(eVar.h, a2);
            }
            b.a(b.this, this.c.h, a2);
        }

        @Override // com.anythink.core.common.res.image.a.InterfaceC0212a
        public final void a(e eVar, String str) {
            b.a(b.this, eVar.h, str);
        }
    }

    private void a() {
        try {
            c<String, SoftReference<Bitmap>> cVar = this.e;
            if (cVar != null) {
                cVar.a();
            }
            ConcurrentHashMap<String, List<a>> concurrentHashMap = this.g;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
        } catch (Exception unused) {
        }
    }

    static /* synthetic */ void a(b bVar, String str, Bitmap bitmap) {
        synchronized (bVar.g) {
            try {
                LinkedList linkedList = (LinkedList) bVar.g.remove(str);
                if (linkedList != null) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        a aVar = (a) it.next();
                        if (aVar != null) {
                            t.b().b(bVar.new AnonymousClass1(bitmap, aVar, str));
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    static /* synthetic */ void a(b bVar, e eVar, int i, int i2, a aVar) {
        synchronized (bVar.g) {
            if (!bVar.g.containsKey(eVar.h)) {
                if (aVar != null) {
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(aVar);
                    bVar.g.put(eVar.h, linkedList);
                }
                com.anythink.core.common.res.image.a aVar2 = new com.anythink.core.common.res.image.a(eVar);
                aVar2.a(bVar.new AnonymousClass5(i, i2, eVar));
                aVar2.d();
            } else {
                LinkedList linkedList2 = (LinkedList) bVar.g.get(eVar.h);
                if (linkedList2 != null && aVar != null && !linkedList2.contains(aVar)) {
                    linkedList2.add(aVar);
                }
            }
        }
    }

    static /* synthetic */ void a(b bVar, String str, String str2) {
        synchronized (bVar.g) {
            try {
                LinkedList linkedList = (LinkedList) bVar.g.remove(str);
                if (linkedList != null) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        a aVar = (a) it.next();
                        if (aVar != null) {
                            t.b().b(bVar.new AnonymousClass2(aVar, str, str2));
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
