package com.vivo.push.h;

/* compiled from: OnBindAppReceiveTask.java */
/* loaded from: classes2.dex */
final class h extends ab {
    h(com.vivo.push.v vVar) {
        super(vVar);
    }

    @Override // com.vivo.push.s
    protected final void a(com.vivo.push.v vVar) {
        com.vivo.push.b.i iVar = (com.vivo.push.b.i) vVar;
        String f = iVar.f();
        com.vivo.push.util.t.d("OnBindTask", "doTask,订阅APP结果 = " + iVar.j() + " clientToken= " + f);
        com.vivo.push.m.a().a(iVar.i(), iVar.j(), f);
        com.vivo.push.t.a(new i(this, f, iVar));
    }
}
