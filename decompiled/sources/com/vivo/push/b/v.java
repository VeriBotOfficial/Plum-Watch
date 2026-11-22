package com.vivo.push.b;

/* compiled from: OnUndoMsgReceiveCommand.java */
/* loaded from: classes2.dex */
public final class v extends w {

    /* renamed from: a, reason: collision with root package name */
    private long f14058a;
    private int b;

    public v() {
        super(20);
        this.f14058a = -1L;
    }

    public final long e() {
        return this.f14058a;
    }

    @Override // com.vivo.push.b.w, com.vivo.push.b.t, com.vivo.push.v
    protected final void c(com.vivo.push.d dVar) {
        super.c(dVar);
        dVar.a("undo_msg_v1", this.f14058a);
        dVar.a("undo_msg_type_v1", this.b);
    }

    @Override // com.vivo.push.b.w, com.vivo.push.b.t, com.vivo.push.v
    protected final void d(com.vivo.push.d dVar) {
        super.d(dVar);
        this.f14058a = dVar.b("undo_msg_v1", this.f14058a);
        this.b = dVar.b("undo_msg_type_v1", 0);
    }

    public final String f() {
        long j = this.f14058a;
        if (j != -1) {
            return String.valueOf(j);
        }
        return null;
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    public final String toString() {
        return "OnUndoMsgCommand";
    }
}
