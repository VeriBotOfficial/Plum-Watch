package com.efs.sdk.memleaksdk.monitor.shark;

/* loaded from: classes14.dex */
public class ad extends ae {
    private String b;

    @Override // com.efs.sdk.memleaksdk.monitor.shark.ae
    public boolean b() {
        if (ah.i.e > a().getForceDumpJavaHeapMaxThreshold()) {
            this.b = "high watermark";
            g.d("UMonitor.HugeMem", "match: huge memory allocated detected, high memory watermark, force dump analysis!");
            return true;
        }
        if (ah.j.f9678a == 0 || r0.d - r1.d <= ai.b.a(a().getForceDumpJavaHeapDeltaThreshold())) {
            return false;
        }
        this.b = "delta";
        g.d("UMonitor.HugeMem", "match: huge memory allocated detected, over the delta threshold!");
        return true;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.shark.ae
    public String d() {
        return "reason_huge_memory_" + this.b;
    }
}
