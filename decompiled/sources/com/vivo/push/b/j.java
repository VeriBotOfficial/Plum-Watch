package com.vivo.push.b;

/* compiled from: OnChangePushStatusReceiveCommand.java */
/* loaded from: classes2.dex */
public final class j extends t {

    /* renamed from: a, reason: collision with root package name */
    private int f14048a;
    private int b;

    public j() {
        super(12);
        this.f14048a = -1;
        this.b = -1;
    }

    public final int e() {
        return this.f14048a;
    }

    public final int f() {
        return this.b;
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    protected final void c(com.vivo.push.d dVar) {
        super.c(dVar);
        dVar.a("OnChangePushStatus.EXTRA_REQ_SERVICE_STATUS", this.f14048a);
        dVar.a("OnChangePushStatus.EXTRA_REQ_RECEIVER_STATUS", this.b);
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    protected final void d(com.vivo.push.d dVar) {
        super.d(dVar);
        this.f14048a = dVar.b("OnChangePushStatus.EXTRA_REQ_SERVICE_STATUS", this.f14048a);
        this.b = dVar.b("OnChangePushStatus.EXTRA_REQ_RECEIVER_STATUS", this.b);
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    public final String toString() {
        return "OnChangePushStatusCommand";
    }
}
