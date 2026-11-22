package com.vivo.push.h;

import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;

/* compiled from: OnLogReceiveTask.java */
/* loaded from: classes2.dex */
final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.vivo.push.b.n f14097a;
    final /* synthetic */ r b;

    s(r rVar, com.vivo.push.b.n nVar) {
        this.b = rVar;
        this.f14097a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        PushMessageCallback pushMessageCallback = this.b.b;
        context = this.b.f14137a;
        pushMessageCallback.onLog(context, this.f14097a.e(), this.f14097a.f(), this.f14097a.g());
    }
}
