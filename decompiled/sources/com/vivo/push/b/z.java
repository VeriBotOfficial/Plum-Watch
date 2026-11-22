package com.vivo.push.b;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: TagCommand.java */
/* loaded from: classes2.dex */
public final class z extends c {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<String> f14062a;

    public z(boolean z, String str, ArrayList<String> arrayList) {
        super(z ? 2004 : 2005, str);
        this.f14062a = arrayList;
    }

    @Override // com.vivo.push.b.c, com.vivo.push.v
    protected final void c(com.vivo.push.d dVar) {
        super.c(dVar);
        dVar.a("tags", (Serializable) this.f14062a);
    }

    @Override // com.vivo.push.b.c, com.vivo.push.v
    protected final void d(com.vivo.push.d dVar) {
        super.d(dVar);
        this.f14062a = dVar.c("tags");
    }

    @Override // com.vivo.push.b.c, com.vivo.push.v
    public final String toString() {
        return "TagCommand";
    }
}
