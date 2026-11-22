package com.anythink.core.common.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

/* loaded from: classes12.dex */
public class n {
    private static volatile n b;

    /* renamed from: a, reason: collision with root package name */
    Context f3713a;

    private n(Context context) {
        this.f3713a = context;
    }

    public static n a(Context context) {
        if (b == null) {
            synchronized (n.class) {
                if (b == null) {
                    b = new n(context.getApplicationContext());
                }
            }
        }
        return b;
    }

    public final void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            try {
                LocalBroadcastManager.getInstance(this.f3713a).registerReceiver(broadcastReceiver, intentFilter);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            LocalBroadcastManager.getInstance(this.f3713a).registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public final void a(BroadcastReceiver broadcastReceiver) {
        try {
            try {
                LocalBroadcastManager.getInstance(this.f3713a).unregisterReceiver(broadcastReceiver);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            LocalBroadcastManager.getInstance(this.f3713a).unregisterReceiver(broadcastReceiver);
        }
    }

    public final void a(Intent intent) {
        try {
            try {
                LocalBroadcastManager.getInstance(this.f3713a).sendBroadcast(intent);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            LocalBroadcastManager.getInstance(this.f3713a).sendBroadcast(intent);
        }
    }
}
