package com.tramini.plugin.a.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

/* loaded from: classes2.dex */
public class b {
    private static volatile b b;

    /* renamed from: a, reason: collision with root package name */
    Context f13700a;

    private b(Context context) {
        this.f13700a = context;
    }

    public static b a(Context context) {
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b(context.getApplicationContext());
                }
            }
        }
        return b;
    }

    public final void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            try {
                LocalBroadcastManager.getInstance(this.f13700a).registerReceiver(broadcastReceiver, intentFilter);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            LocalBroadcastManager.getInstance(this.f13700a).registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public final void a(BroadcastReceiver broadcastReceiver) {
        try {
            try {
                LocalBroadcastManager.getInstance(this.f13700a).unregisterReceiver(broadcastReceiver);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            LocalBroadcastManager.getInstance(this.f13700a).unregisterReceiver(broadcastReceiver);
        }
    }

    public final void a(Intent intent) {
        try {
            try {
                LocalBroadcastManager.getInstance(this.f13700a).sendBroadcast(intent);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            LocalBroadcastManager.getInstance(this.f13700a).sendBroadcast(intent);
        }
    }
}
