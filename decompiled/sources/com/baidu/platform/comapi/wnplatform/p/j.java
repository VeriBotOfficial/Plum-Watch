package com.baidu.platform.comapi.wnplatform.p;

import android.os.Vibrator;

/* compiled from: VibrateUtils.java */
/* loaded from: classes13.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private Vibrator f8952a;

    /* compiled from: VibrateUtils.java */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        static j f8953a = new j();
    }

    public static j b() {
        return b.f8953a;
    }

    public void c() {
        Vibrator vibrator;
        try {
            this.f8952a = (Vibrator) com.baidu.platform.comapi.wnplatform.p.q.a.a().getSystemService("vibrator");
            if (a() && (vibrator = this.f8952a) != null) {
                vibrator.vibrate(500L);
            }
        } catch (Exception unused) {
        }
    }

    private j() {
    }

    private boolean a() {
        Vibrator vibrator = this.f8952a;
        return vibrator != null && vibrator.hasVibrator();
    }
}
