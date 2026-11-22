package com.anythink.core.common.m.d;

import com.anythink.core.common.m.d.d;

/* loaded from: classes12.dex */
public class e {
    private static e b;
    private static final Object c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final String f4013a = getClass().getSimpleName();
    private volatile com.anythink.core.common.m.d.a.c d;
    private volatile com.anythink.core.common.m.d.a.c e;

    private e() {
    }

    protected static e a() {
        if (b == null) {
            synchronized (e.class) {
                if (b == null) {
                    b = new e();
                }
            }
        }
        return b;
    }

    public final void a(d dVar, d.a aVar) {
        com.anythink.core.common.m.d.a.c cVar;
        int c2 = dVar.c();
        synchronized (c) {
            if (c2 == 6) {
                if (this.e == null) {
                    this.e = new com.anythink.core.common.m.d.a.b();
                }
                cVar = this.e;
            } else {
                if (this.d == null) {
                    this.d = new com.anythink.core.common.m.d.a.a();
                }
                cVar = this.d;
            }
        }
        if (cVar != null) {
            cVar.b(dVar, aVar);
        } else if (aVar != null) {
            aVar.a((Throwable) new Exception("socketUploadData is null."));
        }
    }
}
