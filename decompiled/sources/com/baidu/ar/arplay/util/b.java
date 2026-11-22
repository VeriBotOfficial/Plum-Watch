package com.baidu.ar.arplay.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.baidu.ar.arplay.util.c;
import com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f6786a = false;
    public static c.a b;
    public static ArrayList<a> c = new ArrayList<>();
    public static volatile BroadcastReceiver d;

    public static BroadcastReceiver a() {
        if (d == null) {
            synchronized (b.class) {
                if (d == null) {
                    d = new b();
                }
            }
        }
        return d;
    }

    public static void a(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.baidu.ar.baiduarsdk.CONNECTIVITY_CHANGE");
        intentFilter.addAction(BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION);
        context.getApplicationContext().registerReceiver(a(), intentFilter, 2);
    }

    public static void a(a aVar) {
        if (c == null) {
            c = new ArrayList<>();
        }
        c.add(aVar);
    }

    public static void b(a aVar) {
        ArrayList<a> arrayList = c;
        if (arrayList == null || !arrayList.contains(aVar)) {
            return;
        }
        c.remove(aVar);
    }

    public static boolean b() {
        return f6786a;
    }

    public final void c() {
        if (c.isEmpty()) {
            return;
        }
        int size = c.size();
        for (int i = 0; i < size; i++) {
            a aVar = c.get(i);
            if (aVar != null) {
                if (b()) {
                    aVar.a(b);
                } else {
                    aVar.a();
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        d = this;
        if (BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION.equalsIgnoreCase(intent.getAction()) || "com.baidu.ar.baiduarsdk.CONNECTIVITY_CHANGE".equalsIgnoreCase(intent.getAction())) {
            if (c.b(context)) {
                Log.e(b.class.getName(), "<--- network connected --->");
                f6786a = true;
                b = c.a(context);
            } else {
                Log.e(b.class.getName(), "<--- network disconnected --->");
                f6786a = false;
            }
            c();
        }
    }
}
