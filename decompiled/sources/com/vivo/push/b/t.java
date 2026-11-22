package com.vivo.push.b;

/* compiled from: OnReceiveCommand.java */
/* loaded from: classes2.dex */
public class t extends com.vivo.push.v {

    /* renamed from: a, reason: collision with root package name */
    private String f14056a;
    private int b;

    public t(int i) {
        super(i);
        this.f14056a = null;
        this.b = 0;
    }

    public final String i() {
        return this.f14056a;
    }

    public final int j() {
        return this.b;
    }

    @Override // com.vivo.push.v
    protected void c(com.vivo.push.d dVar) {
        dVar.a("req_id", this.f14056a);
        dVar.a("status_msg_code", this.b);
    }

    @Override // com.vivo.push.v
    protected void d(com.vivo.push.d dVar) {
        this.f14056a = dVar.a("req_id");
        this.b = dVar.b("status_msg_code", this.b);
    }

    @Override // com.vivo.push.v
    public String toString() {
        return "OnReceiveCommand";
    }
}
