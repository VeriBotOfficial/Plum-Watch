package com.yandex.mobile.ads.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver;
import com.yandex.mobile.ads.impl.sq1;

/* loaded from: classes5.dex */
public final class sq1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16884a;
    private final b b;
    private final rq1 c;
    private final Handler d;
    private int e;
    private c f;

    public interface b {
        void a(sq1 sq1Var, int i);
    }

    public sq1(Context context, b bVar) {
        rq1 rq1Var = y30.h;
        this.f16884a = context.getApplicationContext();
        this.b = bVar;
        this.c = rq1Var;
        this.d = f92.b();
    }

    public final int a() {
        this.e = this.c.a(this.f16884a);
        IntentFilter intentFilter = new IntentFilter();
        if (this.c.e()) {
            if (f92.f15466a >= 24) {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f16884a.getSystemService("connectivity");
                connectivityManager.getClass();
                c cVar = new c();
                this.f = cVar;
                connectivityManager.registerDefaultNetworkCallback(cVar);
            } else {
                intentFilter.addAction(BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION);
            }
        }
        if (this.c.c()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.c.d()) {
            if (f92.f15466a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if (this.c.f()) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        this.f16884a.registerReceiver(new a(), intentFilter, null, this.d);
        return this.e;
    }

    private class a extends BroadcastReceiver {
        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            sq1 sq1Var = sq1.this;
            int a2 = sq1Var.c.a(sq1Var.f16884a);
            if (sq1Var.e != a2) {
                sq1Var.e = a2;
                sq1Var.b.a(sq1Var, a2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        private boolean f16886a;
        private boolean b;

        private c() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            c();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            c();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onBlockedStatusChanged(Network network, boolean z) {
            if (z) {
                return;
            }
            d();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean hasCapability = networkCapabilities.hasCapability(16);
            if (this.f16886a && this.b == hasCapability) {
                if (hasCapability) {
                    d();
                }
            } else {
                this.f16886a = true;
                this.b = hasCapability;
                c();
            }
        }

        private void c() {
            sq1.this.d.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.sq1$c$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    sq1.c.this.a();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            int a2;
            sq1 sq1Var = sq1.this;
            if (sq1Var.f == null || sq1Var.e == (a2 = sq1Var.c.a(sq1Var.f16884a))) {
                return;
            }
            sq1Var.e = a2;
            sq1Var.b.a(sq1Var, a2);
        }

        private void d() {
            sq1.this.d.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.sq1$c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    sq1.c.this.b();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            int a2;
            sq1 sq1Var = sq1.this;
            if (sq1Var.f == null || (sq1Var.e & 3) == 0 || sq1Var.e == (a2 = sq1Var.c.a(sq1Var.f16884a))) {
                return;
            }
            sq1Var.e = a2;
            sq1Var.b.a(sq1Var, a2);
        }
    }
}
