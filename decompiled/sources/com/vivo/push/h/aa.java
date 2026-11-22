package com.vivo.push.h;

import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;

/* compiled from: OnPublishReceiveTask.java */
/* loaded from: classes2.dex */
final class aa implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.vivo.push.b.s f14087a;
    final /* synthetic */ z b;

    aa(z zVar, com.vivo.push.b.s sVar) {
        this.b = zVar;
        this.f14087a = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        PushMessageCallback pushMessageCallback = this.b.b;
        context = this.b.f14137a;
        pushMessageCallback.onPublish(context, this.f14087a.j(), this.f14087a.i());
    }
}
