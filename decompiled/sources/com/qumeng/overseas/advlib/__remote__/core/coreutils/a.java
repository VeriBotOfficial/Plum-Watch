package com.qumeng.overseas.advlib.__remote__.core.coreutils;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import com.qumeng.overseas.advlib.__remote__.core.proto.response.ClickAdInfo;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.b0;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.f;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.z;
import com.qumeng.overseas.advlib.__remote__.framework.imageloader.q;
import com.qumeng.overseas.advlib.__remote__.utils.n;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes17.dex */
public class a {
    public static String I = null;
    public static String J = null;
    public static Boolean N = null;
    public static boolean R = false;
    public static volatile boolean S = false;
    public static final int T = 0;
    public static final int U = 1;
    public static final int V = 2;
    public static final int W = 3;
    public static final String g = "No more ADs from pool";
    public static final String h = "No AD Config";
    public static final String i = "Ad Show Limit";
    public static final String j = "Ad Show Error, Not meeting show conditions";
    public static final String k = "Ad Show Error, AdConvertor is null";
    public static final String l = "Ad render view error";
    public static final String m = "No more thread pool";
    public static AtomicInteger m0 = null;
    public static final String n = "Illegal path";
    public static Map<String, Integer> n0 = null;
    public static final String o = "imei";
    public static final String p = "meid";
    public static final int r = 1;
    public static final int s = 0;
    public static final int t = 2;
    public static final int u = 3;
    public static final int v = 4;
    public static final int w = 5;

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f12826a = n.g;
    public static final Map<String, String> b = new ConcurrentHashMap();
    public static final Map<String, String> c = new ConcurrentHashMap();
    public static final Map<String, String> d = new ConcurrentHashMap();
    public static final Map<String, String> f = new ConcurrentHashMap();

    /* renamed from: q, reason: collision with root package name */
    public static final String f12827q = C0785a.f12828a;
    public static volatile String x = null;
    public static String y = "";
    public static String z = "";
    public static int A = 0;
    public static String B = "";
    public static String C = "";
    public static String D = "";
    public static String E = "";
    public static String F = "";
    public static boolean G = false;
    public static boolean H = false;
    public static String K = "";
    public static String L = "";
    public static String M = "";
    public static volatile String O = "";
    public static String P = "";
    public static Boolean Q = Boolean.TRUE;
    public static volatile int X = 0;
    public static int Y = 0;
    public static int Z = 0;
    public static int a0 = 0;
    public static float b0 = 0.0f;
    public static int c0 = 0;
    public static int d0 = 0;
    public static boolean e0 = false;
    public static String f0 = "";
    public static Map<String, q> g0 = new ConcurrentHashMap();
    public static String h0 = "1";
    public static String i0 = "2";
    public static String j0 = "3";
    public static int k0 = 0;
    public static Map<String, Integer> l0 = new ConcurrentHashMap();
    public static final File o0 = Environment.getExternalStorageDirectory();
    public static Map<String, ClickAdInfo> e = new ConcurrentHashMap();

    /* renamed from: com.qumeng.overseas.advlib.__remote__.core.coreutils.a$a, reason: collision with other inner class name */
    public static class C0785a {

        /* renamed from: a, reason: collision with root package name */
        private static final String f12828a = String.valueOf(z.a(System.currentTimeMillis()) + z.c(24)).toLowerCase();
        public static volatile String b = "";
        private static final Object c = new Object();

        private static String b() {
            if (!TextUtils.isEmpty(b)) {
                return b;
            }
            synchronized (c) {
                if (!TextUtils.isEmpty(b)) {
                    return b;
                }
                try {
                    String b2 = oqme.a.b("aisdkId", "");
                    if (TextUtils.isEmpty(b2)) {
                        b2 = UUID.randomUUID().toString();
                        oqme.a.c("aisdkId", b2);
                    }
                    b = b2;
                } catch (Exception e) {
                    n.b("DevIdGenerator", "生成ID异常", e);
                }
                return b == null ? "" : b;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x005f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x005e A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.String directGetAgVersionCode(android.content.Context r3) {
            /*
                java.lang.String r0 = ""
                boolean r1 = com.qumeng.overseas.advlib.__remote__.core.proto.utils.r.a()     // Catch: java.lang.Throwable -> L60
                if (r1 == 0) goto Lf
                java.lang.String r1 = "com.huawei.appmarket"
                java.lang.String r3 = getVersionCode(r3, r1)     // Catch: java.lang.Throwable -> L60
                goto L59
            Lf:
                boolean r1 = com.qumeng.overseas.advlib.__remote__.core.proto.utils.r.c()     // Catch: java.lang.Throwable -> L60
                if (r1 == 0) goto L26
                java.lang.String r1 = "com.heytap.market"
                java.lang.String r1 = getVersionCode(r3, r1)     // Catch: java.lang.Throwable -> L60
                if (r1 != 0) goto L5c
                java.lang.String r2 = "com.oppo.market"
                java.lang.String r3 = getVersionCode(r3, r2)     // Catch: java.lang.Throwable -> L24
                goto L59
            L24:
                r0 = r1
                goto L60
            L26:
                boolean r1 = com.qumeng.overseas.advlib.__remote__.core.proto.utils.r.e()     // Catch: java.lang.Throwable -> L60
                if (r1 == 0) goto L33
                java.lang.String r1 = "com.bbk.appstore"
                java.lang.String r3 = getVersionCode(r3, r1)     // Catch: java.lang.Throwable -> L60
                goto L59
            L33:
                boolean r1 = com.qumeng.overseas.advlib.__remote__.core.proto.utils.r.f()     // Catch: java.lang.Throwable -> L60
                if (r1 == 0) goto L40
                java.lang.String r1 = "com.xiaomi.market"
                java.lang.String r3 = getVersionCode(r3, r1)     // Catch: java.lang.Throwable -> L60
                goto L59
            L40:
                boolean r1 = com.qumeng.overseas.advlib.__remote__.core.proto.utils.r.d()     // Catch: java.lang.Throwable -> L60
                if (r1 == 0) goto L4d
                java.lang.String r1 = "com.sec.android.app.samsungapps"
                java.lang.String r3 = getVersionCode(r3, r1)     // Catch: java.lang.Throwable -> L60
                goto L59
            L4d:
                boolean r1 = com.qumeng.overseas.advlib.__remote__.core.proto.utils.r.b()     // Catch: java.lang.Throwable -> L60
                if (r1 == 0) goto L5b
                java.lang.String r1 = "com.meizu.mstore"
                java.lang.String r3 = getVersionCode(r3, r1)     // Catch: java.lang.Throwable -> L60
            L59:
                r1 = r3
                goto L5c
            L5b:
                r1 = r0
            L5c:
                if (r1 != 0) goto L5f
                return r0
            L5f:
                return r1
            L60:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qumeng.overseas.advlib.__remote__.core.coreutils.a.C0785a.directGetAgVersionCode(android.content.Context):java.lang.String");
        }

        public static String directGetHmsVersionCode(Context context) {
            try {
                String versionCode = getVersionCode(context, "com.huawei.hwid");
                return versionCode == null ? "" : versionCode;
            } catch (Throwable unused) {
                return "";
            }
        }

        public static String getDevId(Context context) {
            return !TextUtils.isEmpty(b) ? b : context == null ? "" : b();
        }

        public static String getVersionCode(Context context, String str) {
            return null;
        }
    }

    static {
        Object d2 = oqme.a.d(oqme.a.c0);
        if (d2 instanceof Map) {
            Map<? extends String, ? extends ClickAdInfo> map = (Map) d2;
            if (!map.isEmpty()) {
                Iterator<? extends ClickAdInfo> it = map.values().iterator();
                while (it.hasNext()) {
                    ClickAdInfo next = it.next();
                    if (System.currentTimeMillis() - next.getPresentTimer() >= com.heytap.mcssdk.constant.a.g) {
                        n.c(ClickAdInfo.TAG, "上报：超过12小时 删除 planid=：" + next.getPlanId(), new Object[0]);
                        it.remove();
                    }
                }
                if (!map.isEmpty()) {
                    e.putAll(map);
                    n.c(ClickAdInfo.TAG, "上报：初始化 值=" + e.toString(), new Object[0]);
                }
            }
        }
        m0 = new AtomicInteger(0);
        n0 = new ConcurrentHashMap();
        m0.set(oqme.a.b(oqme.a.D));
        Object d3 = oqme.a.d(oqme.a.E);
        if (d3 instanceof Map) {
            Map<? extends String, ? extends Integer> map2 = (Map) d3;
            if (map2.isEmpty()) {
                return;
            }
            n0.putAll(map2);
            n.c(ClickAdInfo.TAG, "请求：初始化获取值：reqTotalCounterByDay = %s  reqAdslotCounterByDay =%s", Integer.valueOf(m0.get()), n0.toString());
        }
    }

    private static int a(int i2) {
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return i2;
        }
        return 0;
    }

    public static synchronized void b(int i2) {
        synchronized (a.class) {
            X = a(i2);
        }
    }

    public static boolean c() {
        return X == 2;
    }

    public static boolean d() {
        return X == 3;
    }

    public static boolean e() {
        return X == 1 || X == 2;
    }

    public static void a() {
        try {
            if (f.a("a")) {
                return;
            }
            k0 += oqme.a.b(oqme.a.B);
            Object d2 = oqme.a.d(oqme.a.C);
            if (d2 instanceof Map) {
                l0 = (Map) d2;
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean b() {
        return X == 1;
    }

    public static Pair<Integer, Integer> a(String str) {
        Pair<Integer, Integer> pair;
        if (f.a("reqCounterByDay")) {
            m0.set(0);
            n0.clear();
            oqme.a.a(oqme.a.D, 1);
            Map<String, Integer> map = n0;
            if (map != null) {
                oqme.a.a(oqme.a.E, map);
            }
            pair = new Pair<>(0, 0);
        } else {
            int a2 = b0.a(n0.get(str));
            Pair<Integer, Integer> pair2 = new Pair<>(Integer.valueOf(m0.get()), Integer.valueOf(a2));
            n.c(ClickAdInfo.TAG, " 请求：reqTotalCounterByDay=%s,%s次数=%s", Integer.valueOf(m0.get()), str, Integer.valueOf(a2));
            pair = pair2;
        }
        n0.put(str, Integer.valueOf(b0.a(n0.get(str)) + 1));
        m0.incrementAndGet();
        return pair;
    }
}
