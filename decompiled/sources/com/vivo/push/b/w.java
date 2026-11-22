package com.vivo.push.b;

/* compiled from: OnVerifyReceiveCommand.java */
/* loaded from: classes2.dex */
public abstract class w extends t {

    /* renamed from: a, reason: collision with root package name */
    private String f14059a;
    private long b;

    public w(int i) {
        super(i);
    }

    public final long h() {
        return this.b;
    }

    public final String k() {
        return this.f14059a;
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    protected void c(com.vivo.push.d dVar) {
        super.c(dVar);
        dVar.a("OnVerifyCallBackCommand.EXTRA_SECURITY_CONTENT", this.f14059a);
        dVar.a("notify_id", this.b);
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    protected void d(com.vivo.push.d dVar) {
        super.d(dVar);
        this.f14059a = dVar.a("OnVerifyCallBackCommand.EXTRA_SECURITY_CONTENT");
        this.b = dVar.b("notify_id", -1L);
    }
}
