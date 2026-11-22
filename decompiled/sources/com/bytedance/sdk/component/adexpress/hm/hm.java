package com.bytedance.sdk.component.adexpress.hm;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes13.dex */
public class hm {
    public static void fxn(com.bytedance.sdk.component.tw.tw twVar, int i) {
        if (twVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.fxn.fxn.gff gff = com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().gff();
        ExecutorService zu = gff != null ? gff.zu() : null;
        if (zu != null) {
            twVar.setPriority(i);
            zu.execute(twVar);
        } else {
            com.bytedance.sdk.component.tw.bh.fxn(twVar, i);
        }
    }

    public static void kg(com.bytedance.sdk.component.tw.tw twVar, int i) {
        if (twVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.fxn.fxn.gff gff = com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().gff();
        ExecutorService rlu = gff != null ? gff.rlu() : null;
        if (rlu != null) {
            twVar.setPriority(i);
            rlu.execute(twVar);
        } else {
            com.bytedance.sdk.component.tw.bh.fxn(twVar);
        }
    }

    public static ScheduledFuture fxn(Runnable runnable, long j, TimeUnit timeUnit) {
        return com.bytedance.sdk.component.tw.bh.bh().schedule(runnable, j, timeUnit);
    }
}
