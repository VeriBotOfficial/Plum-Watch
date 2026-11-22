package com.vivo.push.h;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.sdk.PushMessageCallback;

/* compiled from: OnBindAppReceiveTask.java */
/* loaded from: classes2.dex */
final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f14093a;
    final /* synthetic */ com.vivo.push.b.i b;
    final /* synthetic */ h c;

    i(h hVar, String str, com.vivo.push.b.i iVar) {
        this.c = hVar;
        this.f14093a = str;
        this.b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Context context2;
        if (!TextUtils.isEmpty(this.f14093a)) {
            PushMessageCallback pushMessageCallback = this.c.b;
            context2 = this.c.f14137a;
            pushMessageCallback.onReceiveRegId(context2, this.f14093a);
        }
        PushMessageCallback pushMessageCallback2 = this.c.b;
        context = this.c.f14137a;
        pushMessageCallback2.onBind(context, this.b.j(), this.b.e());
    }
}
