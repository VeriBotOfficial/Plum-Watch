package com.xiaomi.push;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import com.xiaomi.push.ea;

/* loaded from: classes4.dex */
class eb implements ea.a {

    /* renamed from: a, reason: collision with other field name */
    protected Context f437a;

    /* renamed from: a, reason: collision with other field name */
    private PendingIntent f436a = null;

    /* renamed from: a, reason: collision with root package name */
    private volatile long f14549a = 0;

    public eb(Context context) {
        this.f437a = null;
        this.f437a = context;
    }

    public void a(Intent intent, long j) {
        AlarmManager alarmManager = (AlarmManager) this.f437a.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (Build.VERSION.SDK_INT >= 31) {
            this.f436a = PendingIntent.getBroadcast(this.f437a, 0, intent, 33554432);
        } else {
            this.f436a = PendingIntent.getBroadcast(this.f437a, 0, intent, 0);
        }
        if (Build.VERSION.SDK_INT >= 31 && !j.m12358a(this.f437a)) {
            alarmManager.set(2, j, this.f436a);
        } else {
            ax.a((Object) alarmManager, "setExactAndAllowWhileIdle", 2, Long.valueOf(j), this.f436a);
        }
        com.xiaomi.channel.commonutils.logger.b.c("[Alarm] register timer " + j);
    }

    private void a(AlarmManager alarmManager, long j, PendingIntent pendingIntent) {
        try {
            AlarmManager.class.getMethod("setExact", Integer.TYPE, Long.TYPE, PendingIntent.class).invoke(alarmManager, 2, Long.valueOf(j), pendingIntent);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.d("[Alarm] invoke setExact method meet error. " + e);
        }
    }

    @Override // com.xiaomi.push.ea.a
    public void a(boolean z) {
        long m12457a = com.xiaomi.push.service.m.a(this.f437a).m12457a();
        if (z || this.f14549a != 0) {
            if (z) {
                a();
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (z || this.f14549a == 0) {
                this.f14549a = elapsedRealtime + (m12457a - (elapsedRealtime % m12457a));
            } else if (this.f14549a <= elapsedRealtime) {
                this.f14549a += m12457a;
                if (this.f14549a < elapsedRealtime) {
                    this.f14549a = elapsedRealtime + m12457a;
                }
            }
            Intent intent = new Intent(com.xiaomi.push.service.an.r);
            intent.setPackage(this.f437a.getPackageName());
            a(intent, this.f14549a);
        }
    }

    @Override // com.xiaomi.push.ea.a
    public void a() {
        if (this.f436a != null) {
            try {
                ((AlarmManager) this.f437a.getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(this.f436a);
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.f436a = null;
                com.xiaomi.channel.commonutils.logger.b.c("[Alarm] unregister timer");
                this.f14549a = 0L;
                throw th;
            }
            this.f436a = null;
            com.xiaomi.channel.commonutils.logger.b.c("[Alarm] unregister timer");
            this.f14549a = 0L;
        }
        this.f14549a = 0L;
    }

    @Override // com.xiaomi.push.ea.a
    /* renamed from: a */
    public boolean mo12107a() {
        return this.f14549a != 0;
    }
}
