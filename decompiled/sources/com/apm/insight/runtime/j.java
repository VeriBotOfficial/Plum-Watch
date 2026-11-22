package com.apm.insight.runtime;

import com.apm.insight.MonitorCrash;

/* compiled from: MonitorCrashInner.java */
/* loaded from: classes12.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static MonitorCrash f6112a = null;
    private static int b = -1;
    private static int c;

    public static MonitorCrash a() {
        if (f6112a == null) {
            MonitorCrash initSDK = MonitorCrash.initSDK(com.apm.insight.e.g(), "239017", 20089L, "2008-20250701130429", "com.apm.insight");
            f6112a = initSDK;
            initSDK.config().setChannel("release");
        }
        return f6112a;
    }

    public static void a(Throwable th, String str) {
        if (com.apm.insight.e.g() == null) {
            return;
        }
        if (b == -1) {
            b = 5;
        }
        int i = c;
        if (i < b) {
            c = i + 1;
            a().reportCustomErr(str, "INNER", th);
        }
    }
}
