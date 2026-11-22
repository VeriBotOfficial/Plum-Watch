package com.baidu.xclient.gdid.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.baidu.xclient.gdid.d;
import com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver;

/* loaded from: classes13.dex */
public class b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static String f9056a = "action_tir_mshield";
    public boolean b = true;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Intent f9057a;
        public final /* synthetic */ Context b;

        public a(Intent intent, Context context) {
            this.f9057a = intent;
            this.b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Intent intent = this.f9057a;
                if (intent == null) {
                    return;
                }
                String action = intent.getAction();
                if (b.f9056a.equals(action)) {
                    d.a().a(false, true);
                    return;
                }
                if (BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION.equals(action)) {
                    if (b.this.b) {
                        b.this.b = false;
                    } else if (com.baidu.xclient.gdid.j.d.a(this.b)) {
                        d.a().a(false, false);
                    }
                }
            } catch (Throwable th) {
                com.baidu.xclient.gdid.j.d.a(th);
            }
        }
    }

    public final void a(Context context, Intent intent) {
        com.baidu.xclient.gdid.j.b.a().a(new a(intent, context));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            a(context, intent);
        } catch (Throwable th) {
            com.baidu.xclient.gdid.j.d.a(th);
        }
    }
}
