package com.vivo.push;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: IPCManager.java */
/* loaded from: classes2.dex */
final class j implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f14103a;

    j(i iVar) {
        this.f14103a = iVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        AtomicInteger atomicInteger;
        AtomicInteger atomicInteger2;
        if (message == null) {
            com.vivo.push.util.t.a("AidlManager", "handleMessage error : msg is null");
            return false;
        }
        int i = message.what;
        if (i == 1) {
            com.vivo.push.util.t.a("AidlManager", "In connect, bind core service time out");
            atomicInteger = this.f14103a.f;
            if (atomicInteger.get() == 2) {
                this.f14103a.a(1);
            }
        } else if (i == 2) {
            atomicInteger2 = this.f14103a.f;
            if (atomicInteger2.get() == 4) {
                this.f14103a.f();
            }
            this.f14103a.a(1);
        } else {
            com.vivo.push.util.t.b("AidlManager", "unknow msg what [" + message.what + "]");
        }
        return true;
    }
}
