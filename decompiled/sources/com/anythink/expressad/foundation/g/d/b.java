package com.anythink.expressad.foundation.g.d;

import android.content.Context;
import android.graphics.Bitmap;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.g.d.d;
import com.anythink.expressad.foundation.h.u;
import com.anythink.expressad.foundation.h.v;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4843a = "ImageLoader";
    private static final int b = 1;
    private static final int c = 2;
    private static final String d = "message_key";
    private static final String e = "message_bitmap";
    private static final String f = "message_message";
    private static b g;
    private com.anythink.expressad.foundation.g.h.c h;
    private final LinkedHashMap<String, List<c>> j = new LinkedHashMap<>();
    private com.anythink.expressad.foundation.g.a.e<String, Bitmap> i = new com.anythink.expressad.foundation.g.a.c(((int) Runtime.getRuntime().maxMemory()) / 5);

    public final void a(String str, Bitmap bitmap) {
        if (a(str) != null || bitmap == null) {
            return;
        }
        this.i.a(str, bitmap);
    }

    public final Bitmap a(String str) {
        return this.i.b(str);
    }

    private b(Context context) {
        this.h = new com.anythink.expressad.foundation.g.h.c(context);
    }

    public static b a(Context context) {
        if (g == null) {
            g = new b(context);
        }
        return g;
    }

    private void b() {
        this.i.b();
        LinkedHashMap<String, List<c>> linkedHashMap = this.j;
        if (linkedHashMap != null) {
            linkedHashMap.clear();
        }
    }

    public static void a() {
        com.anythink.expressad.foundation.g.a.e<String, Bitmap> eVar = g.i;
        if (eVar != null) {
            eVar.b();
        }
    }

    public final void a(String str, c cVar) {
        String a2 = u.a(str);
        if (v.a(str) || v.a(str) || v.a(a2)) {
            return;
        }
        com.anythink.core.common.v.b.b.a().a(new AnonymousClass1(a2, str, str, cVar));
    }

    private Bitmap d(String str) {
        Bitmap a2;
        if (v.a(str)) {
            return null;
        }
        String a3 = u.a(str);
        File file = new File(a3);
        if (a(str) != null) {
            return a(str);
        }
        if (!file.exists() || (a2 = a.a(a3)) == null) {
            return null;
        }
        a(str, a2);
        return a2;
    }

    public final boolean b(String str) {
        if (v.a(str)) {
            return false;
        }
        return a(str) != null || new File(u.a(str)).exists();
    }

    private void a(String str, String str2, String str3, c cVar) {
        if (v.a(str) || v.a(str2) || v.a(str3)) {
            return;
        }
        com.anythink.core.common.v.b.b.a().a(new AnonymousClass1(str3, str2, str, cVar));
    }

    /* renamed from: com.anythink.expressad.foundation.g.d.b$1, reason: invalid class name */
    final class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4844a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ c d;
        final /* synthetic */ boolean e = false;

        AnonymousClass1(String str, String str2, String str3, c cVar) {
            this.f4844a = str;
            this.b = str2;
            this.c = str3;
            this.d = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            File file = new File(this.f4844a);
            Bitmap a2 = b.this.a(this.b);
            if (a2 != null && !a2.isRecycled()) {
                b.a(b.this, this.c, a2, this.d);
                return;
            }
            if (file.length() > 0) {
                Bitmap a3 = a.a(this.f4844a);
                if (a3 != null && !a3.isRecycled()) {
                    b.this.a(this.b, a3);
                    b.a(b.this, this.c, a3, this.d);
                    return;
                } else {
                    b.a(b.this, this.c, this.b, this.f4844a, true, this.d);
                    return;
                }
            }
            b.a(b.this, this.c, this.b, this.f4844a, false, this.d);
        }
    }

    private void a(String str, String str2, String str3, boolean z, c cVar) {
        synchronized (this.j) {
            if (this.j.containsKey(str2)) {
                LinkedList linkedList = (LinkedList) this.j.get(str2);
                if (linkedList != null && cVar != null && !linkedList.contains(cVar)) {
                    linkedList.add(cVar);
                }
            } else {
                if (cVar != null) {
                    LinkedList linkedList2 = new LinkedList();
                    linkedList2.add(cVar);
                    this.j.put(str2, linkedList2);
                }
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(str);
                d dVar = new d(str, str2, str3);
                dVar.a(z);
                dVar.a(anonymousClass2);
                this.h.a(dVar);
            }
        }
    }

    /* renamed from: com.anythink.expressad.foundation.g.d.b$2, reason: invalid class name */
    final class AnonymousClass2 implements d.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4845a;

        AnonymousClass2(String str) {
            this.f4845a = str;
        }

        @Override // com.anythink.expressad.foundation.g.d.d.a
        public final void a(final String str, final String str2) {
            com.anythink.core.common.v.b.b.a().a(new com.anythink.core.common.v.b.d() { // from class: com.anythink.expressad.foundation.g.d.b.2.1
                @Override // com.anythink.core.common.v.b.d
                public final void a() {
                    synchronized (b.this.j) {
                        Bitmap a2 = a.a(str2);
                        b.this.a(str, a2);
                        LinkedList linkedList = (LinkedList) b.this.j.remove(str);
                        if (linkedList != null) {
                            Iterator it = linkedList.iterator();
                            while (it.hasNext()) {
                                b.a(b.this, AnonymousClass2.this.f4845a, a2, (c) it.next());
                            }
                        }
                    }
                }
            });
        }

        @Override // com.anythink.expressad.foundation.g.d.d.a
        public final void b(final String str, final String str2) {
            com.anythink.core.common.v.b.b.a().a(new com.anythink.core.common.v.b.d() { // from class: com.anythink.expressad.foundation.g.d.b.2.2
                @Override // com.anythink.core.common.v.b.d
                public final void a() {
                    synchronized (b.this.j) {
                        LinkedList linkedList = (LinkedList) b.this.j.remove(str);
                        if (linkedList != null) {
                            Iterator it = linkedList.iterator();
                            while (it.hasNext()) {
                                c cVar = (c) it.next();
                                b bVar = b.this;
                                String str3 = AnonymousClass2.this.f4845a;
                                t.b().b(bVar.new AnonymousClass4(cVar, str2, str3));
                            }
                        }
                    }
                }
            });
        }
    }

    private d a(String str, String str2, String str3, boolean z) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(str);
        d dVar = new d(str, str2, str3);
        dVar.a(z);
        dVar.a(anonymousClass2);
        return dVar;
    }

    public final void c(String str) {
        try {
            com.anythink.expressad.foundation.g.a.e<String, Bitmap> eVar = this.i;
            if (eVar == null || !eVar.a().contains(str)) {
                return;
            }
            this.i.a(str);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* renamed from: com.anythink.expressad.foundation.g.d.b$3, reason: invalid class name */
    final class AnonymousClass3 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f4848a;
        final /* synthetic */ Bitmap b;
        final /* synthetic */ String c;

        AnonymousClass3(c cVar, Bitmap bitmap, String str) {
            this.f4848a = cVar;
            this.b = bitmap;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f4848a != null) {
                Bitmap bitmap = this.b;
                if (bitmap != null && !bitmap.isRecycled()) {
                    this.f4848a.a(this.b, this.c);
                } else {
                    this.f4848a.a("bitmap no available", this.c);
                }
            }
        }
    }

    private void a(String str, Bitmap bitmap, c cVar) {
        t.b().b(new AnonymousClass3(cVar, bitmap, str));
    }

    /* renamed from: com.anythink.expressad.foundation.g.d.b$4, reason: invalid class name */
    final class AnonymousClass4 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f4849a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        AnonymousClass4(c cVar, String str, String str2) {
            this.f4849a = cVar;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar = this.f4849a;
            if (cVar != null) {
                cVar.a(this.b, this.c);
            }
        }
    }

    private void a(String str, String str2, c cVar) {
        t.b().b(new AnonymousClass4(cVar, str2, str));
    }

    private void c() {
        com.anythink.expressad.foundation.g.a.e<String, Bitmap> eVar = this.i;
        if (eVar != null) {
            eVar.b();
        }
    }

    static /* synthetic */ void a(b bVar, String str, Bitmap bitmap, c cVar) {
        t.b().b(bVar.new AnonymousClass3(cVar, bitmap, str));
    }

    static /* synthetic */ void a(b bVar, String str, String str2, String str3, boolean z, c cVar) {
        synchronized (bVar.j) {
            if (bVar.j.containsKey(str2)) {
                LinkedList linkedList = (LinkedList) bVar.j.get(str2);
                if (linkedList != null && cVar != null && !linkedList.contains(cVar)) {
                    linkedList.add(cVar);
                }
            } else {
                if (cVar != null) {
                    LinkedList linkedList2 = new LinkedList();
                    linkedList2.add(cVar);
                    bVar.j.put(str2, linkedList2);
                }
                AnonymousClass2 anonymousClass2 = bVar.new AnonymousClass2(str);
                d dVar = new d(str, str2, str3);
                dVar.a(z);
                dVar.a(anonymousClass2);
                bVar.h.a(dVar);
            }
        }
    }
}
