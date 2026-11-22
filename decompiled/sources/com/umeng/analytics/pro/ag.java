package com.umeng.analytics.pro;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.umeng.analytics.pro.b;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: SamsungDeviceIdSupplier.java */
/* loaded from: classes2.dex */
public class ag implements z {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13781a = "DeviceIdService";
    private static final String b = "com.samsung.android.deviceidservice";
    private static final String c = "com.samsung.android.deviceidservice.DeviceIdService";
    private CountDownLatch e;
    private String d = "";
    private final ServiceConnection f = new ServiceConnection() { // from class: com.umeng.analytics.pro.ag.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                ag.this.d = b.a.a(iBinder).a();
                Log.d(ag.f13781a, "onServiceConnected");
            } catch (RemoteException | NullPointerException e) {
                Log.e(ag.f13781a, "onServiceConnected failed e=" + e.getMessage());
            }
            ag.this.e.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d(ag.f13781a, "onServiceDisconnected");
        }
    };

    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
        this.e = new CountDownLatch(1);
        try {
            try {
                b(context);
                if (!this.e.await(500L, TimeUnit.MILLISECONDS)) {
                    Log.e(f13781a, "getOAID time-out");
                }
                return this.d;
            } catch (InterruptedException e) {
                Log.e(f13781a, "getOAID interrupted. e=" + e.getMessage());
                c(context);
                return null;
            }
        } finally {
            c(context);
        }
    }

    private void b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setClassName(b, c);
            if (context.bindService(intent, this.f, 1)) {
            } else {
                throw new UnsupportedOperationException("not supported service");
            }
        } catch (Error | Exception e) {
            Log.e(f13781a, "bindService failed. e=" + e.getMessage());
            this.e.countDown();
        }
    }

    private void c(Context context) {
        try {
            context.unbindService(this.f);
        } catch (Error | Exception e) {
            Log.e(f13781a, "unbindService failed. e=" + e.getMessage());
        }
    }
}
