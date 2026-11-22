package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.g9;
import com.amap.api.col.p0003sl.lb;
import com.amap.api.col.p0003sl.ob;
import com.applovin.sdk.AppLovinEventTypes;
import com.autonavi.aps.amapapi.storage.SdCardDbCreator;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import java.net.InetAddress;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: AuthConfigManager.java */
/* loaded from: classes11.dex */
public class a9 {

    /* renamed from: a, reason: collision with root package name */
    public static int f1515a = -1;
    public static String b = "";
    public static Context c = null;
    private static volatile boolean d = true;
    private static volatile boolean z;
    private static Vector<f> e = new Vector<>();
    private static Map<String, Integer> f = new HashMap();
    private static String g = null;
    private static long h = 0;
    public static volatile boolean i = false;
    private static volatile ConcurrentHashMap<String, h> j = new ConcurrentHashMap<>(8);
    private static volatile ConcurrentHashMap<String, Long> k = new ConcurrentHashMap<>(8);
    private static volatile ConcurrentHashMap<String, e> l = new ConcurrentHashMap<>(8);
    private static boolean m = false;
    private static boolean n = false;
    public static int o = 5000;
    public static boolean p = true;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f1516q = false;
    private static int r = 3;
    public static boolean s = true;
    public static boolean t = false;
    private static int u = 3;
    public static boolean v = false;
    private static ConcurrentHashMap<String, Boolean> w = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, Boolean> x = new ConcurrentHashMap<>();
    private static ArrayList<lb.a> y = new ArrayList<>();
    private static Queue<lb.c> A = new LinkedList();

    /* compiled from: AuthConfigManager.java */
    static class a extends qc {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1517a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        a(String str, String str2, String str3, String str4) {
            this.f1517a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        @Override // com.amap.api.col.p0003sl.qc
        public final void runTask() {
            e eVar = (e) a9.l.get(this.f1517a);
            if (eVar == null) {
                return;
            }
            b bVar = eVar.c;
            c a2 = a9.a(a9.c, eVar.f1521a, eVar.b, null, false, "DEF_ID", this.b, this.c, this.d);
            if (bVar != null) {
                bVar.onReceiveAuthConfig(a2);
            }
        }
    }

    /* compiled from: AuthConfigManager.java */
    public interface b {
        void onReceiveAuthConfig(c cVar);
    }

    /* compiled from: AuthConfigManager.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public String f1518a;
        public long b = 0;
        public JSONObject c;
        public a d;

        /* compiled from: AuthConfigManager.java */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public boolean f1519a;
            public JSONObject b;
        }

        static /* synthetic */ boolean a(c cVar, boolean z) {
            return z;
        }
    }

    /* compiled from: AuthConfigManager.java */
    static class d extends ib {
        private String o;
        private Map<String, String> p;

        /* renamed from: q, reason: collision with root package name */
        private String f1520q;
        private String r;
        private String s;

        d(Context context, l9 l9Var, String str, Map<String, String> map, String str2, String str3, String str4) {
            super(context, l9Var);
            this.o = str;
            this.p = map;
            this.f1520q = str2;
            this.r = str3;
            this.s = str4;
            setHttpProtocol(ob.c.HTTPS);
            setDegradeAbility(ob.a.FIX);
        }

        @Override // com.amap.api.col.p0003sl.ob
        protected final String getIPDNSName() {
            return !TextUtils.isEmpty(this.s) ? this.s : super.getIPDNSName();
        }

        @Override // com.amap.api.col.p0003sl.h9, com.amap.api.col.p0003sl.ob
        public final String getIPV6URL() {
            String str = this.r;
            try {
                return !TextUtils.isEmpty(str) ? Uri.parse("https://dualstack-arestapi.amap.com/v3/iasdkauth").buildUpon().encodedAuthority(str).build().toString() : "https://dualstack-arestapi.amap.com/v3/iasdkauth";
            } catch (Throwable unused) {
                return "https://dualstack-arestapi.amap.com/v3/iasdkauth";
            }
        }

        @Override // com.amap.api.col.p0003sl.ib
        protected final String getLogVersion() {
            return "3.0";
        }

        @Override // com.amap.api.col.p0003sl.ib
        public final byte[] getRawDatas() {
            return null;
        }

        @Override // com.amap.api.col.p0003sl.ib, com.amap.api.col.p0003sl.ob
        public final Map<String, String> getRequestHead() {
            if (TextUtils.isEmpty(this.s)) {
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("host", this.s);
            return hashMap;
        }

        @Override // com.amap.api.col.p0003sl.ib
        public final byte[] getRsaAesRawDatas() {
            String stringBuffer;
            String p = d9.p(this.mContext);
            if (!TextUtils.isEmpty(p)) {
                p = i9.c(new StringBuilder(p).reverse().toString());
            }
            HashMap hashMap = new HashMap();
            hashMap.put("authkey", TextUtils.isEmpty(this.o) ? "" : this.o);
            hashMap.put("plattype", "android");
            hashMap.put("ccver", "1");
            hashMap.put(AppLovinEventTypes.USER_VIEWED_PRODUCT, this.mSDKInfo.d());
            hashMap.put("version", this.mSDKInfo.e());
            hashMap.put("output", BodyData.TYPE_JSON);
            hashMap.put("androidversion", new StringBuilder().append(Build.VERSION.SDK_INT).toString());
            hashMap.put("deviceId", p);
            hashMap.put("manufacture", Build.MANUFACTURER);
            Map<String, String> map = this.p;
            if (map != null && !map.isEmpty()) {
                hashMap.putAll(this.p);
            }
            hashMap.put("abitype", m9.a(this.mContext));
            hashMap.put("ext", this.mSDKInfo.a());
            if (hashMap.size() == 0) {
                stringBuffer = null;
            } else {
                StringBuffer stringBuffer2 = new StringBuffer();
                try {
                    boolean z = true;
                    for (Map.Entry entry : hashMap.entrySet()) {
                        if (z) {
                            stringBuffer2.append((String) entry.getKey()).append("=").append((String) entry.getValue());
                            z = false;
                        } else {
                            stringBuffer2.append("&").append((String) entry.getKey()).append("=").append((String) entry.getValue());
                        }
                    }
                } catch (Throwable th) {
                    fa.a(th, "ut", "abP");
                }
                stringBuffer = stringBuffer2.toString();
            }
            return m9.e(stringBuffer);
        }

        @Override // com.amap.api.col.p0003sl.ib, com.amap.api.col.p0003sl.ob
        public final String getURL() {
            String str = this.f1520q;
            try {
                return !TextUtils.isEmpty(str) ? Uri.parse("https://restsdk.amap.com/v3/iasdkauth").buildUpon().encodedAuthority(str).build().toString() : "https://restsdk.amap.com/v3/iasdkauth";
            } catch (Throwable unused) {
                return "https://restsdk.amap.com/v3/iasdkauth";
            }
        }
    }

    /* compiled from: AuthConfigManager.java */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        l9 f1521a;
        String b;
        b c;

        private e() {
        }

        /* synthetic */ e(byte b) {
            this();
        }
    }

    /* compiled from: AuthConfigManager.java */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        private String f1522a;
        private String b;
        private AtomicInteger c;

        public f(String str, String str2, int i) {
            this.f1522a = str;
            this.b = str2;
            this.c = new AtomicInteger(i);
        }

        public final void a(String str) {
            this.b = str;
        }

        public final String b() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("a", this.f1522a);
                jSONObject.put("f", this.b);
                jSONObject.put("h", this.c.get());
                return jSONObject.toString();
            } catch (Throwable unused) {
                return "";
            }
        }

        public final int a() {
            AtomicInteger atomicInteger = this.c;
            if (atomicInteger == null) {
                return 0;
            }
            return atomicInteger.get();
        }
    }

    /* compiled from: AuthConfigManager.java */
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public static boolean f1523a = true;
        public static boolean b = false;
        public static boolean c = true;
        public static int d = 0;
        public static boolean e = false;
        public static int f;
    }

    /* compiled from: AuthConfigManager.java */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public long f1524a;
        public String b;

        h(Long l, String str) {
            this.f1524a = 0L;
            this.b = "";
            this.f1524a = l.longValue();
            this.b = str;
        }
    }

    public static synchronized h b(String str) {
        synchronized (a9.class) {
            try {
                if (j == null) {
                    j = new ConcurrentHashMap<>(8);
                }
                if (j.containsKey(str)) {
                    return j.get(str);
                }
            } finally {
                return new h(0L, "");
            }
            return new h(0L, "");
        }
    }

    public static boolean c() {
        Integer num;
        Context context = c;
        if (context == null) {
            return false;
        }
        String h2 = d9.h(context);
        return (TextUtils.isEmpty(h2) || (num = f.get(h2.toUpperCase())) == null || num.intValue() < 2) ? false : true;
    }

    public static void d(Context context) {
        p = wa.a(context, "open_common", "a13", true);
        s = wa.a(context, "open_common", "a6", true);
        f1516q = wa.a(context, "open_common", "a7", false);
        o = wa.a(context, "open_common", "a8", 5000);
        r = wa.a(context, "open_common", "a9", 3);
        t = wa.a(context, "open_common", "a10", false);
        u = wa.a(context, "open_common", "a11", 3);
        v = wa.a(context, "open_common", "a12", false);
    }

    public static boolean e(String str) {
        f a2;
        try {
            if (!TextUtils.isEmpty(str) && t && x.get(str) == null) {
                Context context = c;
                if (context == null || (a2 = a(context, b(str, "a15"), "open_common")) == null) {
                    return true;
                }
                if (a2.a() < u) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean f() {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.a9.f():boolean");
    }

    public static boolean g() {
        Integer num;
        Context context = c;
        if (context == null) {
            return false;
        }
        String h2 = d9.h(context);
        return (TextUtils.isEmpty(h2) || (num = f.get(h2.toUpperCase())) == null || num.intValue() != 2) ? false : true;
    }

    public static void h() {
        if (i) {
            return;
        }
        try {
            Context context = c;
            if (context == null) {
                return;
            }
            i = true;
            g9.a.f1667a.a(context);
            d = wa.a(context, "open_common", SdCardDbCreator.FIELD_LASTLOC_INFO, true);
            d(context);
            g.f1523a = wa.a(context, "open_common", "ucf", g.f1523a);
            g.b = wa.a(context, "open_common", "fsv2", g.b);
            g.c = wa.a(context, "open_common", "usc", g.c);
            g.d = wa.a(context, "open_common", "umv", g.d);
            g.e = wa.a(context, "open_common", "ust", g.e);
            g.f = wa.a(context, "open_common", "ustv", g.f);
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context, String str) {
        z8.a(context, str);
    }

    public static boolean a(String str, boolean z2) {
        if (TextUtils.isEmpty(str)) {
            return z2;
        }
        String[] split = URLDecoder.decode(str).split("/");
        return split[split.length - 1].charAt(4) % 2 == 1;
    }

    public static synchronized void d(String str) {
        synchronized (a9.class) {
            if (k == null) {
                return;
            }
            if (k.containsKey(str)) {
                k.remove(str);
            }
        }
    }

    private static void b(Context context) {
        try {
            if (n) {
                return;
            }
            a(wa.b(context, "open_common", "a16", ""), true);
            try {
                context.getSharedPreferences("open_common", 0).getLong("a17", 86400000L);
            } catch (Throwable th) {
                ja.a(th, "csp", "glv");
            }
            n = true;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(1:3)|4|(2:5|6)|(6:(1:8)|(3:135|136|(12:138|139|140|141|142|11|12|13|14|15|(9:19|20|21|22|(5:26|(3:105|106|(1:108))|28|29|(2:32|(6:34|35|36|37|38|(7:40|(1:42)|43|(1:45)|46|47|(9:49|(1:51)(1:(8:(1:74)(1:86)|75|(1:77)|78|(1:80)(1:85)|81|82|(1:84)))|52|53|54|(1:56)|58|59|(5:61|62|63|(1:65)(1:68)|66))))))|112|37|38|(0))|17))|14|15|(0)|17)|10|11|12|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00e6, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01b6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01b7, code lost:
    
        r27 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x019b, code lost:
    
        r27 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x025e  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.amap.api.col.3sl.a9$c] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r8v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r9v10, types: [com.amap.api.col.3sl.a9$c] */
    /* JADX WARN: Type inference failed for: r9v11, types: [com.amap.api.col.3sl.a9$c] */
    /* JADX WARN: Type inference failed for: r9v12, types: [com.amap.api.col.3sl.a9$c] */
    /* JADX WARN: Type inference failed for: r9v17, types: [com.amap.api.col.3sl.a9$c] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.amap.api.col.3sl.a9.c a(android.content.Context r25, com.amap.api.col.p0003sl.l9 r26, java.lang.String r27, java.util.Map<java.lang.String, java.lang.String> r28, boolean r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.a9.a(android.content.Context, com.amap.api.col.3sl.l9, java.lang.String, java.util.Map, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.amap.api.col.3sl.a9$c");
    }

    public static lb.c d() {
        synchronized (A) {
            lb.c poll = A.poll();
            if (poll != null) {
                return poll;
            }
            return null;
        }
    }

    public static void c(Context context) {
        if (context == null) {
            return;
        }
        d = wa.a(context, "open_common", SdCardDbCreator.FIELD_LASTLOC_INFO, true);
    }

    public static boolean g(String str) {
        f a2;
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            if (p && w.get(str) == null) {
                Context context = c;
                if (context == null || (a2 = a(context, b(str, "a14"), "open_common")) == null) {
                    return true;
                }
                if (a2.a() < r) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    public static l9 c(String str) {
        e eVar = l.get(str);
        if (eVar != null) {
            return eVar.f1521a;
        }
        return null;
    }

    private static String b(String str, String str2) {
        return str2 + "_" + i9.a(str.getBytes());
    }

    public static lb.a e() {
        if (z) {
            return null;
        }
        synchronized (y) {
            if (z) {
                return null;
            }
            Collections.sort(y);
            if (y.size() <= 0) {
                return null;
            }
            lb.a a2 = y.get(0).a();
            z = true;
            return a2;
        }
    }

    public static void b(lb.c cVar) {
        if (cVar != null && v) {
            synchronized (A) {
                A.offer(cVar);
                lb.a("----新增一个 耗时 缓存----");
            }
        }
    }

    public static void b() {
        try {
            f a2 = a(c, "IPV6_CONFIG_NAME", "open_common");
            String a3 = m9.a(System.currentTimeMillis(), "yyyyMMdd");
            if (!a3.equals(a2.b)) {
                a2.a(a3);
                a2.c.set(0);
            }
            a2.c.incrementAndGet();
            a(c, "IPV6_CONFIG_NAME", "open_common", a2);
        } catch (Throwable unused) {
        }
    }

    public static synchronized boolean f(String str) {
        synchronized (a9.class) {
            try {
            } finally {
                return false;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (l == null) {
                return false;
            }
            if (k == null) {
                k = new ConcurrentHashMap<>(8);
            }
            if (l.containsKey(str) && !k.containsKey(str)) {
                k.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
                return true;
            }
            return false;
        }
    }

    public static long a(List<String> list) {
        if (list == null) {
            return 0L;
        }
        try {
            if (list.size() <= 0) {
                return 0L;
            }
            String str = list.get(0);
            if (TextUtils.isEmpty(str)) {
                return 0L;
            }
            return Long.valueOf(str).longValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x032f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0239 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(android.content.Context r18, com.amap.api.col.p0003sl.l9 r19, java.lang.String r20, com.amap.api.col.3sl.a9.c r21, org.json.JSONObject r22) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 863
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.a9.a(android.content.Context, com.amap.api.col.3sl.l9, java.lang.String, com.amap.api.col.3sl.a9$c, org.json.JSONObject):void");
    }

    public static void a(String str, boolean z2, boolean z3, boolean z4) {
        if (TextUtils.isEmpty(str) || c == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("downLevel", String.valueOf(z2));
        hashMap.put("ant", d9.g(c) == 0 ? "0" : "1");
        if (z4) {
            hashMap.put("type", z2 ? "9" : "8");
        } else {
            hashMap.put("type", z2 ? "6" : "4");
        }
        hashMap.put("status", z3 ? "0" : "1");
        String jSONObject = new JSONObject(hashMap).toString();
        if (TextUtils.isEmpty(jSONObject)) {
            return;
        }
        try {
            yb ybVar = new yb(c, "core", "2.0", "O002");
            ybVar.a(jSONObject);
            zb.a(ybVar, c);
        } catch (y8 unused) {
        }
    }

    private static void a(Context context, l9 l9Var, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("amap_sdk_auth_fail", "1");
        hashMap.put("amap_sdk_auth_fail_type", str);
        hashMap.put("amap_sdk_name", l9Var.d());
        hashMap.put("amap_sdk_version", l9Var.b());
        String jSONObject = new JSONObject(hashMap).toString();
        if (TextUtils.isEmpty(jSONObject)) {
            return;
        }
        try {
            yb ybVar = new yb(context, "core", "2.0", "O001");
            ybVar.a(jSONObject);
            zb.a(ybVar, context);
        } catch (y8 unused) {
        }
    }

    private static boolean a(InetAddress inetAddress) {
        return inetAddress.isLoopbackAddress() || inetAddress.isLinkLocalAddress() || inetAddress.isAnyLocalAddress();
    }

    private static void a(Context context, String str, String str2, f fVar) {
        if (fVar == null || TextUtils.isEmpty(fVar.f1522a)) {
            return;
        }
        String b2 = fVar.b();
        if (TextUtils.isEmpty(b2) || context == null) {
            return;
        }
        SharedPreferences.Editor a2 = wa.a(context, str2);
        a2.putString(str, b2);
        wa.a(a2);
    }

    public static String a(String str) {
        e eVar;
        if (!l.containsKey(str) || (eVar = l.get(str)) == null) {
            return null;
        }
        return eVar.b;
    }

    public static synchronized void a(Context context, l9 l9Var, String str, b bVar) {
        synchronized (a9.class) {
            if (context == null || l9Var == null) {
                return;
            }
            try {
                if (c == null) {
                    c = context.getApplicationContext();
                }
                String d2 = l9Var.d();
                if (TextUtils.isEmpty(d2)) {
                    return;
                }
                a(l9Var);
                if (l == null) {
                    l = new ConcurrentHashMap<>(8);
                }
                if (k == null) {
                    k = new ConcurrentHashMap<>(8);
                }
                if (j == null) {
                    j = new ConcurrentHashMap<>(8);
                }
                if (!l.containsKey(d2)) {
                    e eVar = new e((byte) 0);
                    eVar.f1521a = l9Var;
                    eVar.b = str;
                    eVar.c = bVar;
                    l.put(d2, eVar);
                    long j2 = 0;
                    try {
                        j2 = c.getSharedPreferences("open_common", 0).getLong(d2, 0L);
                    } catch (Throwable th) {
                        ja.a(th, "csp", "glv");
                    }
                    j.put(d2, new h(Long.valueOf(j2), wa.b(c, "open_common", d2 + "lct-info", "")));
                    a(c);
                    b(c);
                }
            } catch (Throwable th2) {
                fa.a(th2, com.anythink.expressad.f.a.b.cZ, "rglc");
            }
        }
    }

    public static synchronized boolean a(String str, long j2) {
        synchronized (a9.class) {
            boolean z2 = false;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            h b2 = b(str);
            long j3 = 0;
            if (j2 != (b2 != null ? b2.f1524a : 0L)) {
                if (k != null && k.containsKey(str)) {
                    j3 = k.get(str).longValue();
                }
                if (SystemClock.elapsedRealtime() - j3 > 30000) {
                    z2 = true;
                }
            }
            return z2;
        }
    }

    public static synchronized void a(String str, boolean z2, String str2, String str3, String str4) {
        synchronized (a9.class) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (k == null) {
                    k = new ConcurrentHashMap<>(8);
                }
                k.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
                if (l == null) {
                    return;
                }
                if (l.containsKey(str)) {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (z2) {
                        kb.a(true, str);
                    }
                    pc.d().b(new a(str, str2, str3, str4));
                }
            } catch (Throwable th) {
                fa.a(th, com.anythink.expressad.f.a.b.cZ, "lca");
            }
        }
    }

    private static synchronized void a(String str, long j2, String str2) {
        synchronized (a9.class) {
            try {
                if (l != null && l.containsKey(str)) {
                    if (j == null) {
                        j = new ConcurrentHashMap<>(8);
                    }
                    j.put(str, new h(Long.valueOf(j2), str2));
                    Context context = c;
                    if (context != null) {
                        SharedPreferences.Editor a2 = wa.a(context, "open_common");
                        wa.a(a2, str, j2);
                        wa.a(a2, str + "lct-info", str2);
                        wa.a(a2);
                    }
                }
            } catch (Throwable th) {
                fa.a(th, com.anythink.expressad.f.a.b.cZ, "ucut");
            }
        }
    }

    private static void a(l9 l9Var) {
        if (l9Var != null) {
            try {
                if (TextUtils.isEmpty(l9Var.d())) {
                    return;
                }
                String b2 = l9Var.b();
                if (TextUtils.isEmpty(b2)) {
                    b2 = l9Var.e();
                }
                if (TextUtils.isEmpty(b2)) {
                    return;
                }
                ba.a(l9Var.d(), b2);
            } catch (Throwable unused) {
            }
        }
    }

    private static void a(Context context) {
        try {
            if (m) {
                return;
            }
            ba.b = wa.a(context, "open_common", SdCardDbCreator.FIELD_LASTLOC_NB, true);
            ba.c = wa.a(context, "open_common", "a5", true);
            m = true;
        } catch (Throwable unused) {
        }
    }

    public static void a(boolean z2, String str) {
        try {
            lb.a("--markHostNameFailed---hostname=".concat(String.valueOf(str)));
            if (p || z2) {
                if ((t || !z2) && !TextUtils.isEmpty(str)) {
                    if (!z2) {
                        if (w.get(str) != null) {
                            return;
                        }
                        w.put(str, Boolean.TRUE);
                        a(b(str, "a14"), "open_common");
                        return;
                    }
                    if (x.get(str) != null) {
                        return;
                    }
                    x.put(str, Boolean.TRUE);
                    a(b(str, "a15"), "open_common");
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static void a(String str, String str2) {
        f a2 = a(c, str, str2);
        String a3 = m9.a(System.currentTimeMillis(), "yyyyMMdd");
        if (!a3.equals(a2.b)) {
            a2.a(a3);
            a2.c.set(0);
        }
        a2.c.incrementAndGet();
        a(c, str, str2, a2);
    }

    public static void a(lb.c cVar) {
        synchronized (y) {
            boolean z2 = false;
            for (int i2 = 0; i2 < y.size(); i2++) {
                lb.a aVar = y.get(i2);
                if (cVar.c.equals(aVar.f1754a) && cVar.d.equals(aVar.d)) {
                    int i3 = cVar.m;
                    int i4 = aVar.e;
                    if (i3 == i4) {
                        z2 = true;
                        if (i4 == 1) {
                            aVar.h = ((aVar.i.get() * aVar.h) + cVar.f) / (aVar.i.get() + 1);
                        }
                        aVar.i.getAndIncrement();
                    }
                }
            }
            if (!z2) {
                y.add(new lb.a(cVar));
            }
            lb.a("----新增一个 异常 缓存---");
        }
    }

    public static void a(boolean z2, lb.a aVar) {
        if (!z || aVar == null) {
            return;
        }
        synchronized (y) {
            if (z2) {
                Iterator<lb.a> it = y.iterator();
                while (it.hasNext()) {
                    lb.a next = it.next();
                    if (next.f1754a.equals(aVar.f1754a) && next.d.equals(aVar.d) && next.e == aVar.e) {
                        if (next.i == aVar.i) {
                            it.remove();
                            lb.a("----错误上传成功，删除-----");
                        } else {
                            next.i.set(next.i.get() - aVar.i.get());
                            lb.a("----错误上传成功，减小错误次数-----");
                        }
                    }
                }
            }
            z = false;
            Iterator<lb.a> it2 = y.iterator();
            lb.a("-----缓存池中已有错误数据-----");
            while (it2.hasNext()) {
                lb.a next2 = it2.next();
                lb.a("----path=" + next2.d + "-counts=" + next2.i + "-code=" + next2.e + "----");
            }
            lb.a("---------------------------------");
        }
    }

    private static synchronized f a(Context context, String str, String str2) {
        f fVar;
        synchronized (a9.class) {
            f fVar2 = null;
            if (!TextUtils.isEmpty(str)) {
                for (int i2 = 0; i2 < e.size(); i2++) {
                    fVar = e.get(i2);
                    if (fVar != null && str.equals(fVar.f1522a)) {
                        break;
                    }
                }
            }
            fVar = null;
            if (fVar != null) {
                return fVar;
            }
            if (context == null) {
                return null;
            }
            String b2 = wa.b(context, str2, str, "");
            if (!TextUtils.isEmpty(b2)) {
                try {
                    JSONObject jSONObject = new JSONObject(b2);
                    fVar2 = new f(jSONObject.optString("a"), jSONObject.optString("f"), jSONObject.optInt("h"));
                } catch (Throwable unused) {
                }
            }
            String a2 = m9.a(System.currentTimeMillis(), "yyyyMMdd");
            if (fVar2 == null) {
                fVar2 = new f(str, a2, 0);
            }
            if (!a2.equals(fVar2.b)) {
                fVar2.a(a2);
                fVar2.c.set(0);
            }
            e.add(fVar2);
            return fVar2;
        }
    }
}
