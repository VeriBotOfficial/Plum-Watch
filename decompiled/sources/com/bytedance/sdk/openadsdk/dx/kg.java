package com.bytedance.sdk.openadsdk.dx;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes14.dex */
public class kg {
    private ScheduledExecutorService fxn = null;
    private long gff = 0;
    private int hm;
    private tw kg;
    private fxn rb;

    public interface fxn {
    }

    public kg(tw twVar, int i) {
        this.kg = twVar;
        this.hm = i;
    }

    public void fxn(long j) {
        this.gff = j;
    }

    public void fxn(int i) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.fxn = newScheduledThreadPool;
        newScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dx.kg.1
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                long unused = kg.this.gff;
                if (System.currentTimeMillis() - kg.this.gff > kg.this.hm) {
                    kg.this.fxn.shutdown();
                    if (kg.this.kg != null) {
                        kg.this.kg.kg(0, "Automatic detection of stuck");
                    }
                    if (kg.this.rb != null) {
                        fxn unused2 = kg.this.rb;
                    }
                }
            }
        }, 0L, i, TimeUnit.MILLISECONDS);
    }

    public void fxn() {
        ScheduledExecutorService scheduledExecutorService = this.fxn;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }

    public boolean kg() {
        ScheduledExecutorService scheduledExecutorService = this.fxn;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService.isShutdown();
        }
        return true;
    }
}
