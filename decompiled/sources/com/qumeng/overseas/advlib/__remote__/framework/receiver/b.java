package com.qumeng.overseas.advlib.__remote__.framework.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.e;
import com.qumeng.overseas.advlib.__remote__.utils.d;
import com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes17.dex */
public class b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f12984a;
    private static b b;
    private static List<a> c;
    private static Object d = new Object();

    public interface a {
        boolean onWifiChanged(boolean z);
    }

    public static boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) e.a().getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        try {
            Network[] allNetworks = connectivityManager.getAllNetworks();
            if (allNetworks != null) {
                for (Network network : allNetworks) {
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
                    if (networkInfo != null && networkInfo.getState().equals(NetworkInfo.State.CONNECTED)) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void b() {
        if (f12984a) {
            return;
        }
        f12984a = true;
        b = new b();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION);
        d.a(e.a(), b, intentFilter, 2);
    }

    public static void c() {
        try {
            e.a().unregisterReceiver(b);
        } catch (Throwable unused) {
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        boolean a2 = a();
        if (c != null) {
            synchronized (d) {
                Iterator<a> it = c.iterator();
                while (it.hasNext()) {
                    if (it.next().onWifiChanged(a2)) {
                        it.remove();
                    }
                }
            }
        }
    }

    public static void b(a aVar) {
        if (c != null) {
            synchronized (d) {
                Iterator<a> it = c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (aVar == it.next()) {
                        it.remove();
                        break;
                    }
                }
            }
        }
    }

    public static void a(a aVar) {
        synchronized (d) {
            if (c == null) {
                c = new ArrayList();
            }
            c.add(aVar);
        }
    }
}
