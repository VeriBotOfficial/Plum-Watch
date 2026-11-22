package com.anythink.basead.exoplayer.i;

import com.anythink.basead.exoplayer.h.af;
import com.anythink.basead.exoplayer.z;

/* loaded from: classes11.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private a f2616a;

    public interface a {
        void c();
    }

    public abstract i a(z[] zVarArr, af afVar);

    public abstract void a(Object obj);

    public final void a(a aVar) {
        this.f2616a = aVar;
    }

    protected final void b() {
        a aVar = this.f2616a;
        if (aVar != null) {
            aVar.c();
        }
    }
}
