package com.amap.api.location;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.amap.api.col.p0003sl.g;
import com.autonavi.aps.amapapi.utils.CoreUtil;

/* loaded from: classes11.dex */
public class APSService extends Service {

    /* renamed from: a, reason: collision with root package name */
    g f2017a;
    int b = 0;
    boolean c = false;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        try {
            return this.f2017a.a(intent);
        } catch (Throwable th) {
            CoreUtil.reportError(th, "APSService", "onBind");
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        try {
            if (this.f2017a == null) {
                this.f2017a = new g(this);
            }
            this.f2017a.a();
        } catch (Throwable th) {
            CoreUtil.reportError(th, "APSService", "onCreate");
        }
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        try {
            this.f2017a.b();
            if (this.c) {
                stopForeground(true);
            }
        } catch (Throwable th) {
            CoreUtil.reportError(th, "APSService", "onDestroy");
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        if (intent != null) {
            try {
                int intExtra = intent.getIntExtra("g", 0);
                if (intExtra == 1) {
                    int intExtra2 = intent.getIntExtra("i", 0);
                    Notification notification = (Notification) intent.getParcelableExtra("h");
                    if (intExtra2 != 0 && notification != null) {
                        startForeground(intExtra2, notification);
                        this.c = true;
                        this.b++;
                    }
                } else if (intExtra == 2) {
                    if (intent.getBooleanExtra("j", true) && (i3 = this.b) > 0) {
                        this.b = i3 - 1;
                    }
                    if (this.b <= 0) {
                        stopForeground(true);
                        this.c = false;
                    } else {
                        stopForeground(false);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        try {
            return this.f2017a.c();
        } catch (Throwable th) {
            CoreUtil.reportError(th, "APSService", "onStartCommand");
            return super.onStartCommand(intent, i, i2);
        }
    }
}
