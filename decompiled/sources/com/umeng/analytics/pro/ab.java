package com.umeng.analytics.pro;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.umeng.analytics.pro.a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: CoolpadDeviceIdSupplier.java */
/* loaded from: classes2.dex */
public class ab implements z {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13775a = "Coolpad";
    private static final String b = "com.coolpad.deviceidsupport";
    private static final String c = "com.coolpad.deviceidsupport.DeviceIdService";
    private static a d;
    private CountDownLatch f;
    private Context g;
    private String e = "";
    private final ServiceConnection h = new ServiceConnection() { // from class: com.umeng.analytics.pro.ab.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                a unused = ab.d = a.AbstractBinderC0909a.a(iBinder);
                ab.this.e = ab.d.b(ab.this.g.getPackageName());
                Log.d(ab.f13775a, "onServiceConnected: oaid = " + ab.this.e);
            } catch (RemoteException | NullPointerException e) {
                Log.e(ab.f13775a, "onServiceConnected failed e=" + e.getMessage());
            }
            ab.this.f.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d(ab.f13775a, "onServiceDisconnected");
            a unused = ab.d = null;
        }
    };

    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        this.g = context.getApplicationContext();
        this.f = new CountDownLatch(1);
        try {
            b(context);
            if (!this.f.await(500L, TimeUnit.MILLISECONDS)) {
                Log.e(f13775a, "getOAID time-out");
            }
            return this.e;
        } catch (InterruptedException e) {
            Log.e(f13775a, "getOAID interrupted. e=" + e.getMessage());
            return null;
        } finally {
            c(context);
        }
    }

    private void b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(b, c));
            if (context.bindService(intent, this.h, 1)) {
                return;
            }
            Log.e(f13775a, "bindService return false");
        } catch (Throwable th) {
            Log.e(f13775a, "bindService failed. e=" + th.getMessage());
            this.f.countDown();
        }
    }

    private void c(Context context) {
        try {
            Log.d(f13775a, "call unbindService.");
            context.unbindService(this.h);
        } catch (Throwable th) {
            Log.e(f13775a, "unbindService failed. e=" + th.getMessage());
        }
    }
}
