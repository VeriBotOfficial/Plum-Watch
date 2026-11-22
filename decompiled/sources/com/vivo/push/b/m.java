package com.vivo.push.b;

import java.util.ArrayList;

/* compiled from: OnListTagReceiveCommand.java */
/* loaded from: classes2.dex */
public final class m extends t {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<String> f14050a;

    public m() {
        super(8);
    }

    public final ArrayList<String> e() {
        return this.f14050a;
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    protected final void c(com.vivo.push.d dVar) {
        super.c(dVar);
        dVar.a("tags_list", this.f14050a);
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    protected final void d(com.vivo.push.d dVar) {
        super.d(dVar);
        this.f14050a = dVar.c("tags_list");
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    public final String toString() {
        return "OnListTagCommand";
    }
}
