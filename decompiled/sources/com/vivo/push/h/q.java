package com.vivo.push.h;

import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;

/* compiled from: OnListTagReceiveTask.java */
/* loaded from: classes2.dex */
final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.vivo.push.b.m f14096a;
    final /* synthetic */ p b;

    q(p pVar, com.vivo.push.b.m mVar) {
        this.b = pVar;
        this.f14096a = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        PushMessageCallback pushMessageCallback = this.b.b;
        context = this.b.f14137a;
        pushMessageCallback.onListTags(context, this.f14096a.j(), this.f14096a.e(), this.f14096a.i());
    }
}
