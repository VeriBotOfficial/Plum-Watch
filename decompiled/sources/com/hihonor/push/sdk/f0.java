package com.hihonor.push.sdk;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.hihonor.push.sdk.b0;
import com.hihonor.push.sdk.c0;
import com.hihonor.push.sdk.e;

/* loaded from: classes11.dex */
public class f0 implements ServiceConnection {
    public final com.hihonor.push.sdk.a b;
    public b c;

    /* renamed from: a, reason: collision with root package name */
    public final Object f10135a = new Object();
    public Handler d = null;

    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message == null || message.what != 1001) {
                return false;
            }
            Log.e("AIDLSrvConnection", "bind core service time out");
            b bVar = f0.this.c;
            if (bVar == null) {
                return true;
            }
            ((d0) bVar).f10131a.a(8002003);
            return true;
        }
    }

    public interface b {
    }

    public f0(com.hihonor.push.sdk.a aVar) {
        this.b = aVar;
    }

    public final void a() {
        synchronized (this.f10135a) {
            Handler handler = this.d;
            if (handler != null) {
                handler.removeMessages(1001);
                this.d = null;
            }
        }
    }

    public final void a(int i) {
        b bVar = this.c;
        if (bVar != null) {
            ((d0) bVar).f10131a.a(i);
        }
    }

    public final void a(Looper looper) {
        synchronized (this.f10135a) {
            Handler handler = this.d;
            if (handler != null) {
                handler.removeMessages(1001, this.f10135a);
            } else {
                this.d = new Handler(looper, new a());
            }
            Message message = new Message();
            message.what = 1001;
            message.obj = this.f10135a;
            this.d.sendMessageDelayed(message, 5000L);
        }
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(ComponentName componentName) {
        Log.i("AIDLSrvConnection", "enter onBindingDied.");
        a(8002002);
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(ComponentName componentName) {
        Log.i("AIDLSrvConnection", "enter onNullBinding, than unBind.");
        a();
        a(8002005);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        e c0602a;
        Log.i("AIDLSrvConnection", "enter onServiceConnected.");
        a();
        b bVar = this.c;
        if (bVar != null) {
            d0 d0Var = (d0) bVar;
            d0Var.getClass();
            int i = e.a.f10132a;
            if (iBinder == null) {
                c0602a = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.hihonor.push.framework.aidl.IPushInvoke");
                c0602a = (queryLocalInterface == null || !(queryLocalInterface instanceof e)) ? new e.a.C0602a(iBinder) : (e) queryLocalInterface;
            }
            if (c0602a == null) {
                Log.e("PushConnectionClient", "failed to get service as interface, trying to unbind.");
                d0Var.f10131a.a(8002001);
                return;
            }
            d0Var.f10131a.a(c0602a);
            d0Var.f10131a.f10134a.set(3);
            c0.a aVar = d0Var.f10131a.b;
            if (aVar != null) {
                b0.a aVar2 = (b0.a) aVar;
                if (Looper.myLooper() == b0.this.f10126a.getLooper()) {
                    aVar2.a();
                } else {
                    b0.this.f10126a.post(new a0(aVar2));
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        Log.i("AIDLSrvConnection", "enter onServiceDisconnected.");
        a(8002002);
    }
}
