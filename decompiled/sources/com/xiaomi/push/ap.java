package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
class ap implements aj {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f14434a;

    /* renamed from: a, reason: collision with other field name */
    private Context f205a;

    /* renamed from: a, reason: collision with other field name */
    private ServiceConnection f206a;

    /* renamed from: a, reason: collision with other field name */
    private volatile int f204a = 0;

    /* renamed from: a, reason: collision with other field name */
    private volatile a f207a = null;

    /* renamed from: a, reason: collision with other field name */
    private final Object f208a = new Object();

    public ap(Context context) {
        this.f205a = context;
        a();
    }

    @Override // com.xiaomi.push.aj
    /* renamed from: a */
    public boolean mo11870a() {
        return f14434a;
    }

    @Override // com.xiaomi.push.aj
    /* renamed from: a */
    public String mo11869a() {
        a("getOAID");
        if (this.f207a == null) {
            return null;
        }
        return this.f207a.b;
    }

    private void a() {
        boolean z;
        this.f206a = new b();
        Intent intent = new Intent();
        intent.setClassName("com.heytap.openid", "com.heytap.openid.IdentifyService");
        intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
        try {
            z = this.f205a.bindService(intent, this.f206a, 1);
        } catch (Exception unused) {
            z = false;
        }
        this.f204a = z ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: collision with other method in class */
    public void m11876b() {
        ServiceConnection serviceConnection = this.f206a;
        if (serviceConnection != null) {
            try {
                this.f205a.unbindService(serviceConnection);
            } catch (Exception unused) {
            }
        }
    }

    private void a(String str) {
        if (this.f204a != 1 || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        synchronized (this.f208a) {
            try {
                com.xiaomi.channel.commonutils.logger.b.m11781a("oppo's " + str + " wait...");
                this.f208a.wait(3000L);
            } catch (Exception unused) {
            }
        }
    }

    private class b implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        private b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            if (ap.this.f207a != null) {
                return;
            }
            new Thread(new Runnable() { // from class: com.xiaomi.push.ap.b.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String packageName = ap.this.f205a.getPackageName();
                        String b = ap.this.b();
                        a aVar = new a();
                        aVar.b = c.a(iBinder, packageName, b, "OUID");
                        ap.this.f207a = aVar;
                        ap.this.m11876b();
                        ap.this.f204a = 2;
                        synchronized (ap.this.f208a) {
                            try {
                                ap.this.f208a.notifyAll();
                            } catch (Exception unused) {
                            }
                        }
                    } catch (Exception unused2) {
                        ap.this.m11876b();
                        ap.this.f204a = 2;
                        synchronized (ap.this.f208a) {
                            try {
                                ap.this.f208a.notifyAll();
                            } catch (Exception unused3) {
                            }
                        }
                    } catch (Throwable th) {
                        ap.this.m11876b();
                        ap.this.f204a = 2;
                        synchronized (ap.this.f208a) {
                            try {
                                ap.this.f208a.notifyAll();
                            } catch (Exception unused4) {
                            }
                            throw th;
                        }
                    }
                }
            }).start();
        }
    }

    private class a {

        /* renamed from: a, reason: collision with other field name */
        String f209a;
        String b;
        String c;
        String d;

        private a() {
            this.f209a = null;
            this.b = null;
            this.c = null;
            this.d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        try {
            Signature[] signatureArr = this.f205a.getPackageManager().getPackageInfo(this.f205a.getPackageName(), 64).signatures;
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            StringBuilder sb = new StringBuilder();
            for (byte b2 : messageDigest.digest(signatureArr[0].toByteArray())) {
                sb.append(Integer.toHexString((b2 & 255) | 256).substring(1, 3));
            }
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    private static class c {
        static String a(IBinder iBinder, String str, String str2, String str3) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                obtain.writeString(str);
                obtain.writeString(str2);
                obtain.writeString(str3);
                iBinder.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public static boolean a(Context context) {
        long j;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 128);
            if (packageInfo != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    j = packageInfo.getLongVersionCode();
                } else {
                    j = packageInfo.versionCode;
                }
                boolean z = (packageInfo.applicationInfo.flags & 1) != 0;
                f14434a = j >= 1;
                if (z) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
