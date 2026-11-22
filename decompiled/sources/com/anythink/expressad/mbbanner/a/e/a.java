package com.anythink.expressad.mbbanner.a.e;

import android.os.Handler;
import android.os.Looper;
import com.anythink.expressad.foundation.d.e;
import com.anythink.expressad.foundation.e.c;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4995a = "a";
    private final Handler b = new Handler(Looper.getMainLooper());
    private boolean c;

    private void a(boolean z) {
        this.c = z;
    }

    private boolean a() {
        return this.c;
    }

    private void a(final com.anythink.expressad.mbbanner.a.c.b bVar, final e eVar, final String str) {
        this.b.post(new Runnable() { // from class: com.anythink.expressad.mbbanner.a.e.a.1
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.expressad.mbbanner.a.c.b bVar2 = bVar;
                if (bVar2 != null) {
                    e eVar2 = eVar;
                    boolean unused = a.this.c;
                    bVar2.a(eVar2);
                }
            }
        });
    }

    public final void a(final com.anythink.expressad.mbbanner.a.c.b bVar, final c cVar) {
        this.b.post(new Runnable() { // from class: com.anythink.expressad.mbbanner.a.e.a.2
            @Override // java.lang.Runnable
            public final void run() {
                if (bVar != null) {
                    cVar.a(a.this.c);
                    bVar.a(cVar);
                }
            }
        });
    }

    public final void a(final com.anythink.expressad.mbbanner.a.c.b bVar, final String str) {
        this.b.post(new Runnable() { // from class: com.anythink.expressad.mbbanner.a.e.a.3
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.expressad.mbbanner.a.c.b bVar2 = bVar;
                if (bVar2 != null) {
                    boolean unused = a.this.c;
                    bVar2.a();
                }
            }
        });
    }

    public final void b(final com.anythink.expressad.mbbanner.a.c.b bVar, final c cVar) {
        new StringBuilder("postResourceFail reason=").append(cVar);
        this.b.post(new Runnable() { // from class: com.anythink.expressad.mbbanner.a.e.a.4
            @Override // java.lang.Runnable
            public final void run() {
                if (bVar != null) {
                    cVar.a(a.this.c);
                    bVar.b();
                }
            }
        });
    }
}
