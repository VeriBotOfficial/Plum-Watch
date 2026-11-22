package com.vivo.push.b;

/* compiled from: OnNotifyGuideDialogResultCommand.java */
/* loaded from: classes2.dex */
public final class r extends t {

    /* renamed from: a, reason: collision with root package name */
    private static String f14055a = "notify_guide_dialog_result";
    private int b;

    public r() {
        super(2023);
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    protected final void c(com.vivo.push.d dVar) {
        super.c(dVar);
        dVar.a(f14055a, this.b);
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    protected final void d(com.vivo.push.d dVar) {
        super.d(dVar);
        this.b = dVar.b(f14055a, -1);
    }

    public final int e() {
        return this.b;
    }
}
