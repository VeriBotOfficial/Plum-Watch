package com.vivo.push.h;

import android.content.Context;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.sdk.PushMessageCallback;

/* compiled from: NotifyOpenClientClickTask.java */
/* loaded from: classes2.dex */
final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ UPSNotificationMessage f14092a;
    final /* synthetic */ e b;

    g(e eVar, UPSNotificationMessage uPSNotificationMessage) {
        this.b = eVar;
        this.f14092a = uPSNotificationMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        PushMessageCallback pushMessageCallback = this.b.b;
        context = this.b.f14137a;
        pushMessageCallback.onNotificationMessageClicked(context, this.f14092a);
    }
}
