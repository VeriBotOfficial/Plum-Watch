package com.vivo.push.d;

import com.vivo.push.util.t;

/* compiled from: NotifyGuideDialogManager.java */
/* loaded from: classes2.dex */
final class f implements com.vivo.push.restructure.request.c<i> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f14071a;

    f(e eVar) {
        this.f14071a = eVar;
    }

    @Override // com.vivo.push.restructure.request.c
    public final /* synthetic */ void a(i iVar) {
        i iVar2 = iVar;
        if (iVar2 == null) {
            this.f14071a.b.onStateChanged(10000);
        } else {
            t.d("NotifyGuideDialogManage", "onReceiveAck:" + iVar2.a());
            this.f14071a.b.onStateChanged(iVar2.a());
        }
    }

    @Override // com.vivo.push.restructure.request.c
    public final void a(int i) {
        t.d("NotifyGuideDialogManage", "onError:".concat(String.valueOf(i)));
        this.f14071a.b.onStateChanged(i);
    }
}
