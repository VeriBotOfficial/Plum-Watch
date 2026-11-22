package com.facebook.ads.redexgen.core;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;

/* renamed from: com.facebook.ads.redexgen.X.Nj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ServiceConnectionC1702Nj implements ServiceConnection {
    public final /* synthetic */ HandlerC1703Nk A00;

    public ServiceConnectionC1702Nj(HandlerC1703Nk handlerC1703Nk) {
        this.A00 = handlerC1703Nk;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Handler handler;
        AbstractRunnableC1915Vt abstractRunnableC1915Vt;
        C2202cu c2202cu;
        Messenger messenger;
        handler = this.A00.A04;
        abstractRunnableC1915Vt = this.A00.A08;
        handler.removeCallbacks(abstractRunnableC1915Vt);
        this.A00.A00 = new Messenger(iBinder);
        c2202cu = this.A00.A07;
        if (UA.A09(c2202cu)) {
            HandlerC1703Nk handlerC1703Nk = this.A00;
            messenger = this.A00.A00;
            handlerC1703Nk.A07(messenger);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.A00.A09();
    }
}
