package com.baidu.location.f;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import com.baidu.location.b.q;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public b f7662a = null;
    public Location b = null;
    public Location c = null;
    public long d = 0;
    public long e = 0;
    private Timer f = null;
    private TimerTask g = null;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static c f7664a = new c();
    }

    private class b implements q.c {
        private b() {
        }

        @Override // com.baidu.location.b.q.c
        public void a(Location location) {
            if (location == null) {
                return;
            }
            c.this.b = location;
            c.this.e = System.currentTimeMillis();
        }
    }

    public static c a() {
        return a.f7664a;
    }

    private synchronized void d() {
        TimerTask timerTask = this.g;
        if (timerTask != null) {
            timerTask.cancel();
            this.g = null;
        }
        Timer timer = this.f;
        if (timer != null) {
            timer.cancel();
            this.f.purge();
            this.f = null;
        }
    }

    public void a(Context context) {
        if (Build.VERSION.SDK_INT >= 31 && com.baidu.location.h.i.aG != 0) {
            if (!com.baidu.location.h.i.i(context)) {
                b();
                return;
            }
            d();
            if (this.f == null && this.g == null) {
                this.f = new Timer();
                TimerTask timerTask = new TimerTask() { // from class: com.baidu.location.f.c.1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        c.this.b();
                    }
                };
                this.g = timerTask;
                this.f.schedule(timerTask, 60000L);
            }
            if (this.f7662a == null) {
                this.f7662a = new b();
                q.a().a(this.f7662a, context, Looper.myLooper());
            }
        }
    }

    public void a(Location location) {
        this.c = location;
        this.d = System.currentTimeMillis();
    }

    public boolean a(Location location, Location location2) {
        float[] fArr;
        if (location2 == null) {
            return false;
        }
        if (location == null) {
            return true;
        }
        try {
            fArr = new float[2];
            Location.distanceBetween(location.getLatitude(), location.getLongitude(), location2.getLatitude(), location2.getLongitude(), fArr);
        } catch (Exception unused) {
        }
        return fArr[0] >= 100.0f;
    }

    public String b(Location location) {
        if (location != null) {
            return String.format(Locale.CHINA, "&ll=%.5f|%.5f&s=%.1f&d=%.1f&ll_n=%d&ll_t=%d&ll_r=%d", Double.valueOf(location.getLongitude()), Double.valueOf(location.getLatitude()), Float.valueOf((float) (location.getSpeed() * 3.6d)), Float.valueOf(location.getBearing()), 0, Long.valueOf(location.getTime() / 1000), Integer.valueOf((int) (location.hasAccuracy() ? location.getAccuracy() : -1.0f)));
        }
        return null;
    }

    public synchronized void b() {
        if (this.f7662a != null) {
            q.a().a(this.f7662a);
            this.f7662a = null;
        }
        d();
    }

    public void b(Context context) {
        if (Build.VERSION.SDK_INT >= 31 && com.baidu.location.b.a.a().f7519q != 0 && com.baidu.location.h.i.i(context)) {
            if (this.f7662a == null) {
                this.f7662a = new b();
            }
            q.a().a(this.f7662a, context, Looper.getMainLooper());
        }
    }

    public Location c() {
        return System.currentTimeMillis() - this.d < 30000 ? this.c : System.currentTimeMillis() - this.e < 30000 ? this.b : null;
    }
}
