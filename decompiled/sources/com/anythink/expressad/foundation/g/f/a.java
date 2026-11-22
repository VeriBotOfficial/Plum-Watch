package com.anythink.expressad.foundation.g.f;

import android.net.TrafficStats;
import android.os.SystemClock;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static long f4853a;
    private static long b;
    private static long c;

    /* synthetic */ a(byte b2) {
        this();
    }

    private a() {
    }

    /* renamed from: com.anythink.expressad.foundation.g.f.a$a, reason: collision with other inner class name */
    private static class C0239a {

        /* renamed from: a, reason: collision with root package name */
        private static a f4855a = new a(0);

        private C0239a() {
        }
    }

    public static a a() {
        return C0239a.f4855a;
    }

    private synchronized void c() {
        if (f4853a == 0) {
            f4853a = SystemClock.elapsedRealtime();
            c = TrafficStats.getTotalRxBytes();
        }
    }

    private synchronized void d() {
        if (f4853a != 0 && c != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - f4853a;
            if (elapsedRealtime != 0) {
                try {
                    if (TrafficStats.getTotalRxBytes() != -1) {
                        long totalRxBytes = ((TrafficStats.getTotalRxBytes() - c) * 1000) / elapsedRealtime;
                        if (totalRxBytes == 0) {
                            b = 1L;
                        } else {
                            b = totalRxBytes;
                        }
                    } else {
                        b = 0L;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            e();
        }
    }

    private synchronized void e() {
        c = 0L;
        f4853a = 0L;
    }

    public static long b() {
        return b;
    }
}
