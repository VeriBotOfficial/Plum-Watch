package com.baidu.mshield.b.d;

import android.net.TrafficStats;

/* compiled from: TrafficStatsUtils.java */
/* loaded from: classes13.dex */
public class d {
    public static void a() {
        try {
            TrafficStats.clearThreadStatsTag();
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
        }
    }

    public static void b() {
        try {
            TrafficStats.setThreadStatsTag(155648);
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
        }
    }
}
