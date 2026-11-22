package com.anythink.basead.exoplayer.scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import com.anythink.basead.exoplayer.k.af;
import com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2729a = "RequirementsWatcher";
    private final Context b;
    private final c c;
    private final com.anythink.basead.exoplayer.scheduler.a d;
    private C0153b e;
    private boolean f;
    private a g;

    public interface c {
        void a();

        void b();
    }

    private static void f() {
    }

    private static /* synthetic */ void g() {
    }

    private b(Context context, c cVar, com.anythink.basead.exoplayer.scheduler.a aVar) {
        this.d = aVar;
        this.c = cVar;
        this.b = context.getApplicationContext();
        new StringBuilder().append(this);
    }

    private void a() {
        com.anythink.basead.exoplayer.k.a.a(Looper.myLooper());
        a(true);
        IntentFilter intentFilter = new IntentFilter();
        byte b = 0;
        if (this.d.a() != 0) {
            if (af.f2668a < 23) {
                intentFilter.addAction(BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION);
            } else {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.b.getSystemService("connectivity");
                NetworkRequest build = new NetworkRequest.Builder().addCapability(16).build();
                a aVar = new a(this, b);
                this.g = aVar;
                connectivityManager.registerNetworkCallback(build, aVar);
            }
        }
        if (this.d.b()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.d.c()) {
            if (af.f2668a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        C0153b c0153b = new C0153b(this, b);
        this.e = c0153b;
        this.b.registerReceiver(c0153b, intentFilter, null, new Handler());
        new StringBuilder().append(this);
    }

    private void b() {
        this.b.unregisterReceiver(this.e);
        this.e = null;
        if (this.g != null && af.f2668a >= 21) {
            ((ConnectivityManager) this.b.getSystemService("connectivity")).unregisterNetworkCallback(this.g);
            this.g = null;
        }
        new StringBuilder().append(this);
    }

    private com.anythink.basead.exoplayer.scheduler.a c() {
        return this.d;
    }

    public final String toString() {
        return super.toString();
    }

    private void d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.b.getSystemService("connectivity");
        NetworkRequest build = new NetworkRequest.Builder().addCapability(16).build();
        a aVar = new a(this, (byte) 0);
        this.g = aVar;
        connectivityManager.registerNetworkCallback(build, aVar);
    }

    private void e() {
        if (af.f2668a >= 21) {
            ((ConnectivityManager) this.b.getSystemService("connectivity")).unregisterNetworkCallback(this.g);
            this.g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        boolean a2 = this.d.a(this.b);
        if (z || a2 != this.f) {
            this.f = a2;
        }
    }

    /* renamed from: com.anythink.basead.exoplayer.scheduler.b$b, reason: collision with other inner class name */
    private class C0153b extends BroadcastReceiver {
        private C0153b() {
        }

        /* synthetic */ C0153b(b bVar, byte b) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            new StringBuilder().append(b.this);
            intent.getAction();
            b.this.a(false);
        }
    }

    private final class a extends ConnectivityManager.NetworkCallback {
        private a() {
        }

        /* synthetic */ a(b bVar, byte b) {
            this();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            super.onAvailable(network);
            new StringBuilder().append(b.this);
            b.this.a(false);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            super.onLost(network);
            new StringBuilder().append(b.this);
            b.this.a(false);
        }
    }
}
