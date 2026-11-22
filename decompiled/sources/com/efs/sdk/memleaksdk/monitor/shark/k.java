package com.efs.sdk.memleaksdk.monitor.shark;

import android.os.Build;
import com.efs.sdk.memleaksdk.monitor.UMonitor;
import com.efs.sdk.memleaksdk.monitor.UMonitorJNI;
import com.efs.sdk.memleaksdk.monitor.shark.j;

/* loaded from: classes14.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private boolean f9914a;

    /* synthetic */ k(byte b) {
        this();
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final k f9915a = new k(0);
    }

    private k() {
    }

    private void a() {
        if (!this.f9914a && UMonitorJNI.f9666a) {
            this.f9914a = true;
            UMonitorJNI.initStrip();
        }
    }

    public synchronized boolean a(String str, String str2) {
        j jVar;
        g.b("UMonitor.Strip", "path: " + str + "\nstrip: " + str2);
        if (UMonitor.isNotSupport()) {
            throw new UnsupportedOperationException("not supported! android sdk version: " + Build.VERSION.SDK_INT);
        }
        a();
        boolean z = false;
        if (!this.f9914a) {
            g.d("UMonitor.Strip", "dump failed caused by so not loaded!");
            return false;
        }
        try {
            UMonitorJNI.initStripPath(str, str2);
            jVar = j.a.f9913a;
            z = jVar.a(str);
            g.b("UMonitor.Strip", "dump result " + z);
        } catch (Exception e) {
            g.b("UMonitor.Strip", "dump failed caused by ", e);
        }
        return z;
    }
}
