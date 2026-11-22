package com.vivo.push.b;

/* compiled from: PushModeCommand.java */
/* loaded from: classes2.dex */
public final class x extends com.vivo.push.v {

    /* renamed from: a, reason: collision with root package name */
    private int f14060a;

    @Override // com.vivo.push.v
    public final boolean d() {
        return true;
    }

    public x() {
        super(2011);
        this.f14060a = 0;
    }

    public final int e() {
        return this.f14060a;
    }

    @Override // com.vivo.push.v
    protected final void c(com.vivo.push.d dVar) {
        dVar.a("com.bbk.push.ikey.MODE_TYPE", this.f14060a);
    }

    @Override // com.vivo.push.v
    protected final void d(com.vivo.push.d dVar) {
        this.f14060a = dVar.b("com.bbk.push.ikey.MODE_TYPE", 0);
    }

    @Override // com.vivo.push.v
    public final String toString() {
        return "PushModeCommand";
    }
}
