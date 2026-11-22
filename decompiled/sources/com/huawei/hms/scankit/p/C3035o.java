package com.huawei.hms.scankit.p;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.huawei.hms.mlkit.common.ha.HianalyticsLog;
import com.huawei.hms.mlkit.common.ha.HianalyticsLogProvider;
import com.wakeup.howear.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: HiAnalyticsThread.java */
/* renamed from: com.huawei.hms.scankit.p.o, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3035o extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f10672a;
    Handler b;

    public C3035o(Context context) {
        this.f10672a = new WeakReference<>(context);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Looper.prepare();
        this.b = new a(this.f10672a);
        Looper.loop();
    }

    /* compiled from: HiAnalyticsThread.java */
    /* renamed from: com.huawei.hms.scankit.p.o$a */
    static class a extends Handler {
        private WeakReference<Context> b;

        /* renamed from: a, reason: collision with root package name */
        private boolean f10673a = true;
        private HashMap<String, HianalyticsLog> c = new HashMap<>();

        public a(WeakReference<Context> weakReference) {
            this.b = weakReference;
        }

        private HianalyticsLog a(String str) {
            if (HianalyticsLogProvider.getInstance().sdkForbiddenHiLog(this.b.get())) {
                return null;
            }
            return HianalyticsLogProvider.getInstance().logBegin(this.b.get(), new C3011i(this.b.get()).a()).setModuleName(str).setApiName(str).setApkVersion("1.0.2.300");
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.f10673a) {
                int i = message.what;
                if (i == R.integer.abc_config_activityShortDur) {
                    this.c.put("preview", a((String) message.obj));
                    return;
                }
                if (i == R.integer.animation_default_duration) {
                    a(this.c.get("preview"));
                    this.c.put("preview", null);
                    return;
                }
                if (i == R.integer.N_numberBackgroundAlphaColor) {
                    this.c.put("picture", a((String) message.obj));
                } else if (i == R.integer.abc_config_activityDefaultDur) {
                    a(this.c.get("picture"));
                    this.c.put("picture", null);
                } else if (i != R.integer.N_lastNextMothAlphaColor) {
                    Log.w("CameraManager", "HiAnalyticsThread::handleMessage unknown message");
                } else {
                    this.f10673a = false;
                    Looper.myLooper().quit();
                }
            }
        }

        private static void a(HianalyticsLog hianalyticsLog) {
            if (hianalyticsLog != null) {
                HianalyticsLogProvider.getInstance().logEnd(hianalyticsLog);
            }
        }
    }
}
