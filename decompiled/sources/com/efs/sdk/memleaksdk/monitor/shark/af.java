package com.efs.sdk.memleaksdk.monitor.shark;

import com.efs.sdk.memleaksdk.monitor.shark.ah;
import java.util.Locale;

/* loaded from: classes14.dex */
public class af extends ae {
    @Override // com.efs.sdk.memleaksdk.monitor.shark.ae
    public boolean b() {
        ah.b bVar = ah.g;
        float deviceMemoryThreshold = a().getDeviceMemoryThreshold();
        if (bVar.d < deviceMemoryThreshold) {
            g.c("UMonitor.PSS", String.format(Locale.US, "device memory threshold: %f, rate: %f", Float.valueOf(deviceMemoryThreshold), Float.valueOf(bVar.d)));
            return false;
        }
        if (bVar.d < 0.1f) {
            g.c("UMonitor.PSS", "mem info rate < 10%");
            return false;
        }
        if (bVar.d < 0.15f) {
            g.b("UMonitor.PSS", "mem info rate < 15%");
            return false;
        }
        if (bVar.d < 0.2f) {
            g.b("UMonitor.PSS", "mem info rate < 20%");
            return false;
        }
        if (bVar.d >= 0.3f) {
            return false;
        }
        g.b("UMonitor.PSS", "mem info rate < 30%");
        return false;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.shark.ae
    public String d() {
        return "reason_physical_memory";
    }
}
