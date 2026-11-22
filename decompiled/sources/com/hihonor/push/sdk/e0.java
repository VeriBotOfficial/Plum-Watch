package com.hihonor.push.sdk;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.hihonor.push.sdk.b0;
import com.hihonor.push.sdk.c0;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes11.dex */
public class e0 implements c0, IBinder.DeathRecipient {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f10134a = new AtomicInteger(0);
    public c0.a b;
    public e c;
    public f0 d;

    public e0(c0.a aVar) {
        this.b = aVar;
    }

    public final void a(int i) {
        Log.i("PushConnectionClient", "notifyFailed result: " + i);
        a((e) null);
        this.f10134a.set(1);
        c0.a aVar = this.b;
        if (aVar != null) {
            ((b0.a) aVar).a(i);
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        Log.i("PushConnectionClient", "binder died.");
        a((e) null);
        a(8002002);
    }

    public final synchronized void a(e eVar) {
        e eVar2 = this.c;
        if (eVar2 != null) {
            eVar2.asBinder().unlinkToDeath(this, 0);
        }
        if (eVar != null) {
            try {
                eVar.asBinder().linkToDeath(this, 0);
            } catch (RemoteException unused) {
                Log.e("PushConnectionClient", "link to death fail.");
            }
        }
        this.c = eVar;
    }

    public void a() {
        Log.i("PushConnectionClient", "enter unbind");
        f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.getClass();
            try {
                Log.i("AIDLSrvConnection", "trying to unbind service.");
                s.c.a().unbindService(f0Var);
            } catch (Exception e) {
                Log.e("AIDLSrvConnection", "on unBind service exception:" + e.getMessage());
            }
            this.d = null;
        }
    }
}
