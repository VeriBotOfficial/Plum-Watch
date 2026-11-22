package com.vivo.push.b;

import java.util.ArrayList;
import java.util.List;

/* compiled from: OnTagsReceiveCommand.java */
/* loaded from: classes2.dex */
public final class u extends t {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<String> f14057a;
    private ArrayList<String> b;

    public u(int i) {
        super(i);
        this.f14057a = null;
        this.b = null;
    }

    public final ArrayList<String> e() {
        return this.f14057a;
    }

    public final List<String> f() {
        return this.b;
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    protected final void c(com.vivo.push.d dVar) {
        super.c(dVar);
        dVar.a("content", this.f14057a);
        dVar.a("error_msg", this.b);
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    protected final void d(com.vivo.push.d dVar) {
        super.d(dVar);
        this.f14057a = dVar.c("content");
        this.b = dVar.c("error_msg");
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    public final String toString() {
        return "OnSetTagsCommand";
    }
}
