package com.efs.sdk.memleaksdk.monitor.shark;

import android.os.Build;
import android.os.Debug;
import com.autonavi.aps.amapapi.config.Const;
import com.efs.sdk.memleaksdk.monitor.UMonitor;
import com.efs.sdk.memleaksdk.monitor.UMonitorJNI;

/* loaded from: classes14.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    private boolean f9912a;

    /* synthetic */ j(byte b) {
        this();
    }

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final j f9913a = new j(0);
    }

    private j() {
    }

    private void a() {
        if (!this.f9912a && UMonitorJNI.f9666a) {
            this.f9912a = true;
            UMonitorJNI.init();
        }
    }

    public synchronized boolean a(String str) {
        g.b("UMonitor.Dump", "dump " + str);
        if (UMonitor.isNotSupport()) {
            throw new UnsupportedOperationException("not supported! android sdk version: " + Build.VERSION.SDK_INT);
        }
        a();
        boolean z = false;
        if (!this.f9912a) {
            g.d("UMonitor.Dump", "failed, so not load.");
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            g.b("UMonitor.Dump", "before suspend.");
            int suspendVM = UMonitorJNI.suspendVM();
            if (suspendVM == 0) {
                Debug.dumpHprofData(str);
                UMonitorJNI.exit();
            } else if (suspendVM > 0) {
                z = UMonitorJNI.resumeVM(suspendVM);
                g.b("UMonitor.Dump", "dump hprof result: " + z + ", from pid:" + suspendVM + " cost:" + (System.currentTimeMillis() - currentTimeMillis) + Const.SP_KEY_GSM_UPLOAD_MXSIZE);
            }
        } catch (Throwable th) {
            g.b("UMonitor.Dump", "dump hprof failed.", th);
        }
        return z;
    }
}
