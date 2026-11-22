package com.alipay.sdk.m.d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public class b implements com.alipay.sdk.m.c.b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1368a = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";
    public static final int b = 1;
    public static final int c = 2;

    /* renamed from: com.alipay.sdk.m.d.b$b, reason: collision with other inner class name */
    public static final class ServiceConnectionC0087b implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        public boolean f1369a;
        public final LinkedBlockingQueue<IBinder> b;

        public ServiceConnectionC0087b() {
            this.f1369a = false;
            this.b = new LinkedBlockingQueue<>();
        }

        public IBinder a() throws InterruptedException {
            if (this.f1369a) {
                throw new IllegalStateException();
            }
            this.f1369a = true;
            return this.b.poll(5L, TimeUnit.SECONDS);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static final class c implements IInterface {

        /* renamed from: a, reason: collision with root package name */
        public IBinder f1370a;

        public c(IBinder iBinder) {
            this.f1370a = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f1370a;
        }

        public String d() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(b.f1368a);
                this.f1370a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public boolean e() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(b.f1368a);
                this.f1370a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    @Override // com.alipay.sdk.m.c.b
    public String a(Context context) {
        ServiceConnectionC0087b serviceConnectionC0087b = new ServiceConnectionC0087b();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        if (context.bindService(intent, serviceConnectionC0087b, 1)) {
            try {
                return new c(serviceConnectionC0087b.a()).d();
            } catch (Exception unused) {
            } finally {
                context.unbindService(serviceConnectionC0087b);
            }
        }
        return null;
    }
}
