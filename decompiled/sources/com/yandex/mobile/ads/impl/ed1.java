package com.yandex.mobile.ads.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public final class ed1 {
    private static ed1 e;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f15375a = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList<WeakReference<b>> b = new CopyOnWriteArrayList<>();
    private final Object c = new Object();
    private int d = 0;

    public interface b {
        void a(int i);
    }

    private ed1(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION);
        context.registerReceiver(new c(), intentFilter);
    }

    public final int a() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return 1;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    return 2;
                }
                if (type == 9) {
                    return 7;
                }
                if (type != 4 && type != 5) {
                    return type != 6 ? 8 : 5;
                }
            }
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
                    return 3;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 14:
                case 15:
                case 17:
                    return 4;
                case 13:
                    return 5;
                case 16:
                case 19:
                default:
                    return 6;
                case 18:
                    return 2;
                case 20:
                    return f92.f15466a >= 29 ? 9 : 0;
            }
        } catch (SecurityException unused) {
            return 0;
        }
    }

    public final void b(final b bVar) {
        Iterator<WeakReference<b>> it = this.b.iterator();
        while (it.hasNext()) {
            WeakReference<b> next = it.next();
            if (next.get() == null) {
                this.b.remove(next);
            }
        }
        this.b.add(new WeakReference<>(bVar));
        this.f15375a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.ed1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ed1.this.a(bVar);
            }
        });
    }

    private final class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int b = ed1.b(context);
            if (f92.f15466a >= 31 && b == 5) {
                a.a(context, ed1.this);
            } else {
                ed1.this.a(b);
            }
        }
    }

    private static final class a {
        public static void a(Context context, ed1 ed1Var) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                telephonyManager.getClass();
                C0967a c0967a = new C0967a(ed1Var);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), c0967a);
                telephonyManager.unregisterTelephonyCallback(c0967a);
            } catch (RuntimeException unused) {
                ed1Var.a(5);
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.ed1$a$a, reason: collision with other inner class name */
        private static final class C0967a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* renamed from: a, reason: collision with root package name */
            private final ed1 f15376a;

            public C0967a(ed1 ed1Var) {
                this.f15376a = ed1Var;
            }

            @Override // android.telephony.TelephonyCallback.DisplayInfoListener
            public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f15376a.a(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        bVar.a(a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        synchronized (this.c) {
            if (this.d == i) {
                return;
            }
            this.d = i;
            Iterator<WeakReference<b>> it = this.b.iterator();
            while (it.hasNext()) {
                WeakReference<b> next = it.next();
                b bVar = next.get();
                if (bVar != null) {
                    bVar.a(i);
                } else {
                    this.b.remove(next);
                }
            }
        }
    }

    public static synchronized ed1 a(Context context) {
        ed1 ed1Var;
        synchronized (ed1.class) {
            if (e == null) {
                e = new ed1(context);
            }
            ed1Var = e;
        }
        return ed1Var;
    }
}
