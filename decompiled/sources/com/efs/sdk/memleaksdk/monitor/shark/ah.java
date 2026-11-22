package com.efs.sdk.memleaksdk.monitor.shark;

import com.efs.sdk.memleaksdk.monitor.shark.e;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.File;
import java.util.Locale;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes14.dex */
public class ah {

    /* renamed from: a, reason: collision with root package name */
    static Pattern f9677a = Pattern.compile("Threads:\\s*(\\d+)\\s*");
    static Pattern b = Pattern.compile("MemTotal:\\s*(\\d+)\\s*kB");
    static Pattern c = Pattern.compile("MemFree:\\s*(\\d+)\\s*kB");
    static Pattern d = Pattern.compile("MemAvailable:\\s*(\\d+)\\s*kB");
    public static c e = new c();
    public static c f = new c();
    public static b g = new b();
    public static b h = new b();
    public static a i = new a();
    public static a j = new a();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f9678a;
        public long b;
        public long c;
        public long d;
        public float e;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f9679a;
        public int b;
        public int c;
        public float d;
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f9680a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.matches()) {
            return 0;
        }
        MatchResult matchResult = matcher.toMatchResult();
        if (matchResult.groupCount() > 0) {
            try {
                return Integer.parseInt(matchResult.group(1));
            } catch (NumberFormatException e2) {
                g.b("UMonitor.Java", "match value parse failed", e2);
            }
        }
        return 0;
    }

    public static void a() {
        j = i;
        h = g;
        f = e;
        i = new a();
        e = new c();
        g = new b();
        i.f9678a = Runtime.getRuntime().maxMemory();
        i.b = Runtime.getRuntime().totalMemory();
        i.c = Runtime.getRuntime().freeMemory();
        a aVar = i;
        aVar.d = aVar.b - i.c;
        i.e = (r0.d * 1.0f) / i.f9678a;
        e.a(new File(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO), new e.a() { // from class: com.efs.sdk.memleaksdk.monitor.internal.ah.1
            @Override // com.efs.sdk.memleaksdk.monitor.internal.e.a
            public boolean a(String str) {
                if (str.startsWith("MemTotal")) {
                    ah.g.f9679a = ah.b(str, ah.b);
                    return true;
                }
                if (str.startsWith("MemFree")) {
                    ah.g.b = ah.b(str, ah.c);
                    return true;
                }
                if (!str.startsWith("MemAvailable")) {
                    return true;
                }
                ah.g.c = ah.b(str, ah.d);
                return true;
            }
        });
        e.a(new File("/proc/self/status"), new e.a() { // from class: com.efs.sdk.memleaksdk.monitor.internal.ah.2
            @Override // com.efs.sdk.memleaksdk.monitor.internal.e.a
            public boolean a(String str) {
                if (ah.e.f9680a != 0) {
                    return false;
                }
                if (!str.startsWith("Threads")) {
                    return true;
                }
                ah.e.f9680a = ah.b(str, ah.f9677a);
                return true;
            }
        });
        g.d = (r0.c * 1.0f) / g.f9679a;
        g.b("UMonitor.Java", "---- Monitor Memory ----");
        g.b("UMonitor.Java", String.format(Locale.US, "java heap max:%d used ratio:%f%%", Long.valueOf(i.f9678a), Float.valueOf(i.e * 100.0f)));
        g.b("UMonitor.Java", String.format(Locale.US, "process threads:%d", Integer.valueOf(e.f9680a)));
        g.b("UMonitor.Java", String.format(Locale.US, "mem info total:%dkB free:%dkB available:%dkB, ratio: %.1f%%", Integer.valueOf(g.f9679a), Integer.valueOf(g.b), Integer.valueOf(g.c), Float.valueOf(g.d * 100.0f)));
    }
}
