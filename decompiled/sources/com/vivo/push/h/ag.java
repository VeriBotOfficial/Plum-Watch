package com.vivo.push.h;

import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;

/* compiled from: OnUnBindAppReceiveTask.java */
/* loaded from: classes2.dex */
final class ag implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.vivo.push.b.i f14090a;
    final /* synthetic */ af b;

    ag(af afVar, com.vivo.push.b.i iVar) {
        this.b = afVar;
        this.f14090a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        PushMessageCallback pushMessageCallback = this.b.b;
        context = this.b.f14137a;
        pushMessageCallback.onUnBind(context, this.f14090a.j(), this.f14090a.e());
    }
}
