package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;

/* loaded from: classes4.dex */
class ai implements aj {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f14425a;

    /* renamed from: a, reason: collision with other field name */
    private Context f182a;

    /* renamed from: a, reason: collision with other field name */
    private ServiceConnection f183a;

    /* renamed from: a, reason: collision with other field name */
    private volatile int f181a = 0;

    /* renamed from: a, reason: collision with other field name */
    private volatile String f185a = null;

    /* renamed from: b, reason: collision with other field name */
    private volatile boolean f186b = false;
    private volatile String b = null;

    /* renamed from: a, reason: collision with other field name */
    private final Object f184a = new Object();

    public ai(Context context) {
        this.f182a = context;
        a();
    }

    @Override // com.xiaomi.push.aj
    /* renamed from: a, reason: collision with other method in class */
    public boolean mo11870a() {
        return f14425a;
    }

    @Override // com.xiaomi.push.aj
    /* renamed from: a, reason: collision with other method in class */
    public String mo11869a() {
        a("getOAID");
        return this.f185a;
    }

    private void a() {
        boolean z;
        this.f183a = new a();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        try {
            z = this.f182a.bindService(intent, this.f183a, 1);
        } catch (Exception unused) {
            z = false;
        }
        this.f181a = z ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        ServiceConnection serviceConnection = this.f183a;
        if (serviceConnection != null) {
            try {
                this.f182a.unbindService(serviceConnection);
            } catch (Exception unused) {
            }
        }
    }

    private void a(String str) {
        if (this.f181a != 1 || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        synchronized (this.f184a) {
            try {
                com.xiaomi.channel.commonutils.logger.b.m11781a("huawei's " + str + " wait...");
                this.f184a.wait(3000L);
            } catch (Exception unused) {
            }
        }
    }

    private class a implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        private a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            new Thread(new Runnable() { // from class: com.xiaomi.push.ai.a.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ai.this.f185a = b.a(iBinder);
                        ai.this.f186b = b.m11871a(iBinder);
                        ai.this.b();
                        ai.this.f181a = 2;
                        synchronized (ai.this.f184a) {
                            try {
                                ai.this.f184a.notifyAll();
                            } catch (Exception unused) {
                            }
                        }
                    } catch (Exception unused2) {
                        ai.this.b();
                        ai.this.f181a = 2;
                        synchronized (ai.this.f184a) {
                            try {
                                ai.this.f184a.notifyAll();
                            } catch (Exception unused3) {
                            }
                        }
                    } catch (Throwable th) {
                        ai.this.b();
                        ai.this.f181a = 2;
                        synchronized (ai.this.f184a) {
                            try {
                                ai.this.f184a.notifyAll();
                            } catch (Exception unused4) {
                            }
                            throw th;
                        }
                    }
                }
            }).start();
        }
    }

    private static class b {
        static String a(IBinder iBinder) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(com.alipay.sdk.m.d.b.f1368a);
                iBinder.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: a, reason: collision with other method in class */
        static boolean m11871a(IBinder iBinder) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(com.alipay.sdk.m.d.b.f1368a);
                iBinder.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public static boolean a(Context context) {
        boolean z;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.huawei.hwid", 128);
            z = (packageInfo.applicationInfo.flags & 1) != 0;
            f14425a = packageInfo.versionCode >= 20602000;
        } catch (Exception unused) {
        }
        return z;
    }
}
