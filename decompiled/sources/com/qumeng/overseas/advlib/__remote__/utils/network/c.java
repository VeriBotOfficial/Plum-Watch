package com.qumeng.overseas.advlib.__remote__.utils.network;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.autonavi.aps.amapapi.AMapLocationStaticsEntity;
import com.qumeng.overseas.advlib.__remote__.core.ICliFactory;
import com.qumeng.overseas.advlib.__remote__.core.proto.universe.MaterialImpl;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.a0;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.d;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.e;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.h;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.l;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.m;
import com.qumeng.overseas.advlib.__remote__.framework.imageloader.e;
import com.qumeng.overseas.advlib.__remote__.ui.incite.j;
import com.qumeng.overseas.advlib.__remote__.utils.n;
import com.umeng.analytics.pro.ak;
import io.livekit.android.room.util.MediaConstraintKeys;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes17.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f13239a = 1;
    public static final int b = 0;
    private static final int d = 10000;
    private static final int e = 10;
    private static final String f = "anti_fraud";
    public static final C0853c c = new C0853c();
    private static final AtomicBoolean g = new AtomicBoolean(false);
    private static BlockingQueue<com.qumeng.overseas.advlib.__remote__.utils.network.b> h = new LinkedBlockingQueue();
    public static final Runnable i = new a();
    private static Thread j = null;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    c.b((com.qumeng.overseas.advlib.__remote__.utils.network.b) c.h.take());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f13240a;
        final /* synthetic */ j b;
        final /* synthetic */ String c;

        b(Context context, j jVar, String str) {
            this.f13240a = context;
            this.b = jVar;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.b(this.f13240a, this.b, this.c);
        }
    }

    /* renamed from: com.qumeng.overseas.advlib.__remote__.utils.network.c$c, reason: collision with other inner class name */
    static class C0853c implements com.qumeng.overseas.advlib.__remote__.utils.network.a {
        C0853c() {
        }

        @Override // com.qumeng.overseas.advlib.__remote__.utils.network.a
        public boolean onPreRequest(com.qumeng.overseas.advlib.__remote__.utils.network.b bVar) {
            return false;
        }

        @Override // com.qumeng.overseas.advlib.__remote__.utils.network.a
        public void onResult(com.qumeng.overseas.advlib.__remote__.utils.network.b bVar, int i, String str) {
        }
    }

    public static void b(Context context, j jVar, String str, Map<String, String> map) {
        if (d.a((Map<? extends Object, ? extends Object>) map)) {
            return;
        }
        if (jVar == null) {
            jVar = new j();
        }
        if (TextUtils.isEmpty(str)) {
            str = "nsdk";
        }
        a(a0.c(a0.a(context, jVar, str, map, new String[0])), (Map<String, String>) new h.b().append("id_tkid", com.qumeng.overseas.advlib.__remote__.core.coreutils.a.K).getMap());
        a(context, jVar);
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "unknown";
        }
        try {
            return str.replaceAll("http[s]?://", "").replaceAll("/.*$", "");
        } catch (Exception unused) {
            return "unknown";
        }
    }

    public static void a(String str, Map<String, String> map, Map<String, String> map2) {
        if (j == null) {
            synchronized (c.class) {
                if (j == null) {
                    n.c("NetUtils", "perform thread start", new Object[0]);
                    Thread a2 = oqm.a.a(i, e.a("AsyncSimpleReport"));
                    j = a2;
                    a2.start();
                }
            }
        }
        com.qumeng.overseas.advlib.__remote__.utils.network.b bVar = new com.qumeng.overseas.advlib.__remote__.utils.network.b();
        bVar.f13238a = str;
        if (!d.a((Map<? extends Object, ? extends Object>) map)) {
            bVar.d = map;
        }
        if (map2 != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                bVar.a(entry.getKey(), entry.getValue());
            }
        }
        h.offer(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, j jVar, String str) {
        if (n.a()) {
            n.a("Anti", "start report anti fraud", new Object[0]);
        }
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        try {
            Map<String, String> b2 = com.qumeng.overseas.advlib.__remote__.utils.b.b(context);
            if (!d.a((Map<? extends Object, ? extends Object>) b2)) {
                for (Map.Entry<String, String> entry : b2.entrySet()) {
                    String key = entry.getKey();
                    if (!TextUtils.isEmpty(key)) {
                        hashMap.put("opt_" + key, entry.getValue());
                    }
                }
            }
        } catch (Throwable th) {
            hashMap.put("opt_error", String.valueOf(th.getMessage()));
        }
        hashMap.put("opt_trigger", str);
        hashMap.put("opt_cost_ms", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
        if (n.a()) {
            n.a("Anti", "before async report anti fraud, triggerType=" + str + ", totalCostMs=" + (System.currentTimeMillis() - currentTimeMillis) + ", reportDataSize=" + hashMap.size() + ", reportData=" + hashMap, new Object[0]);
        }
        a(context, jVar, hashMap);
    }

    public static void a(String str, e.b bVar) throws Exception {
        Throwable th;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            httpURLConnection = b(str, new h.b().append("Accept-Encoding", "none").getMap());
            try {
                inputStream = httpURLConnection.getInputStream();
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[1024];
                        int i2 = 0;
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read <= -1) {
                                break;
                            }
                            byteArrayOutputStream2.write(bArr, 0, read);
                            i2 += read;
                        }
                        byteArrayOutputStream2.flush();
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        if (bVar != null) {
                            bVar.onSuccess(httpURLConnection.getHeaderFields(), i2, byteArray);
                        }
                        try {
                            inputStream.close();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        try {
                            byteArrayOutputStream2.close();
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                        try {
                            m.a(httpURLConnection.getErrorStream());
                            httpURLConnection.disconnect();
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception e4) {
                                e4.printStackTrace();
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                        }
                        if (httpURLConnection != null) {
                            try {
                                m.a(httpURLConnection.getErrorStream());
                                httpURLConnection.disconnect();
                                throw th;
                            } catch (Throwable unused2) {
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
            inputStream = null;
        }
    }

    public static void b(com.qumeng.overseas.advlib.__remote__.utils.network.b bVar) throws IOException {
        URLConnection uRLConnection;
        if (bVar == null || TextUtils.isEmpty(bVar.f13238a)) {
            return;
        }
        if (bVar.f13238a.startsWith("http://") || bVar.f13238a.startsWith("https://")) {
            String str = (String) bVar.a(com.qumeng.overseas.advlib.__remote__.framework.report.c.f12988a);
            try {
                try {
                    if (!TextUtils.isEmpty(str) && str.equals(MediaConstraintKeys.TRUE)) {
                        URLConnection openConnection = b(bVar.f13238a).openConnection();
                        if (!d.a((Map<? extends Object, ? extends Object>) bVar.d)) {
                            for (Map.Entry<String, String> entry : bVar.d.entrySet()) {
                                String key = entry.getKey();
                                String value = entry.getValue();
                                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                                    openConnection.setRequestProperty(key, value);
                                }
                            }
                        }
                        openConnection.connect();
                        a(bVar, ((HttpURLConnection) openConnection).getResponseCode(), (HttpURLConnection) openConnection);
                        uRLConnection = openConnection;
                    } else {
                        HttpURLConnection b2 = b(bVar.f13238a, bVar.d);
                        int responseCode = b2 != null ? b2.getResponseCode() : -1;
                        uRLConnection = b2;
                        if (bVar.f13238a.contains("callback_url")) {
                            a(bVar, "sdk", responseCode, b2.getResponseMessage());
                            uRLConnection = b2;
                        }
                    }
                    try {
                        ((HttpURLConnection) uRLConnection).disconnect();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } catch (Throwable unused) {
                    ((HttpURLConnection) b(bVar.f13238a).openConnection()).disconnect();
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }

    public static void a(String str) {
        a(str, (Map<String, String>) Collections.emptyMap());
    }

    public static void a(Map<String, String> map, String... strArr) {
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        for (String str : strArr) {
            a(str, map);
        }
    }

    public static void a(String... strArr) {
        a((Map<String, String>) Collections.emptyMap(), strArr);
    }

    public static HttpURLConnection b(String str, Map<String, String> map) throws IOException, IllegalFormatException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(str, map, 0);
    }

    public static void a(List<String> list) {
        a((Map<String, String>) Collections.emptyMap(), list);
    }

    public static void a(Map<String, String> map, List<String> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        a(map, (String[]) list.toArray(new String[list.size()]));
    }

    public static void a(Context context, MaterialImpl materialImpl, Map<String, String> map) {
        a(context, materialImpl, map.get(ak.aH), map);
    }

    private static URL b(String str) throws IOException {
        return new URL(str);
    }

    public static void a(Context context, MaterialImpl materialImpl, String str, Map<String, String> map) {
        if (materialImpl == null || d.a((Map<? extends Object, ? extends Object>) map)) {
            return;
        }
        b(context, new j(materialImpl.getSearchID(), materialImpl.getIdeaId()), str, map);
    }

    private static void a(Context context, j jVar, Map<String, String> map) {
        if (d.a((Map<? extends Object, ? extends Object>) map)) {
            return;
        }
        if (jVar == null) {
            jVar = new j();
        }
        a(a0.b(a0.a(context, jVar, f, map, new String[0])), (Map<String, String>) new h.b().append("id_tkid", com.qumeng.overseas.advlib.__remote__.core.coreutils.a.K).getMap());
    }

    public static boolean a(Map<String, String> map) {
        return a0.f12850a.equals(map.get("opt_lyr")) || a0.b.equals(map.get("opt_lyr")) || a0.c.equals(map.get("opt_lyr")) || a0.d.equals(map.get("opt_lyr"));
    }

    public static void a(Context context, j jVar, String str, Map<String, String> map) {
        if (d.a((Map<? extends Object, ? extends Object>) map)) {
            return;
        }
        if (jVar == null) {
            jVar = new j();
        }
        if (TextUtils.isEmpty(str)) {
            str = "nsdk";
        }
        a(ICliFactory.urlReportBidsdk + l.a(a0.a(context, jVar, str, map, new String[0])), (Map<String, String>) new h.b().append("id_tkid", com.qumeng.overseas.advlib.__remote__.core.coreutils.a.K).getMap());
        a(context, jVar);
    }

    private static void a(Context context, j jVar) {
        String str;
        try {
            com.qumeng.overseas.advlib.__remote__.framework.config.a k = com.qumeng.overseas.advlib.__remote__.framework.config.a.k();
            if (k.A()) {
                if (g.compareAndSet(false, true)) {
                    str = AMapLocationStaticsEntity.FIRST_LOCATE;
                } else if (!k.C()) {
                    return;
                } else {
                    str = "sample";
                }
                if (context == null) {
                    context = com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a();
                }
                if (jVar == null) {
                    jVar = new j();
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    com.qumeng.overseas.advlib.__remote__.utils.j.b().post(new b(context, jVar, str));
                } else {
                    b(context, jVar, str);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static HttpURLConnection a(String str, Map<String, String> map, int i2) throws IOException, IllegalFormatException {
        if (i2 > 10) {
            return null;
        }
        URLConnection openConnection = b(str).openConnection();
        if (!d.a((Map<? extends Object, ? extends Object>) map)) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                openConnection.setRequestProperty(String.valueOf(entry.getKey()), entry.getValue());
            }
        }
        if (openConnection instanceof HttpURLConnection) {
            openConnection.setConnectTimeout(10000);
            openConnection.setReadTimeout(10000);
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode >= 200 && responseCode < 300) {
                return httpURLConnection;
            }
            if (responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                try {
                    ((HttpURLConnection) openConnection).disconnect();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } else {
                String headerField = openConnection.getHeaderField("Location");
                try {
                    ((HttpURLConnection) openConnection).disconnect();
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                if (!TextUtils.isEmpty(headerField)) {
                    n.c("StraightURLConnection", "Redirect ==> \"" + headerField + "\"", new Object[0]);
                    return a(headerField, map, i2 + 1);
                }
            }
            return null;
        }
        throw new IllegalArgumentException("Seems not a vaild HTTP url");
    }

    private static void a(String str, Map<String, String> map) {
        a(str, map, (Map<String, String>) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[Catch: all -> 0x0088, SYNTHETIC, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x0088, blocks: (B:3:0x0004, B:5:0x0012, B:14:0x005f, B:17:0x002a, B:55:0x0087), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(com.qumeng.overseas.advlib.__remote__.utils.network.b r3, int r4, java.net.HttpURLConnection r5) {
        /*
            if (r3 != 0) goto L4
            goto L8c
        L4:
            java.lang.String r0 = "CLICK_DSP_FLAG"
            java.lang.Object r0 = r3.a(r0)     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L88
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L88
            if (r1 != 0) goto L8c
            java.lang.String r1 = "true"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L8c
            java.lang.String r0 = ""
            r1 = 200(0xc8, float:2.8E-43)
            if (r4 == r1) goto L31
            r1 = 301(0x12d, float:4.22E-43)
            if (r4 == r1) goto L2a
            r1 = 302(0x12e, float:4.23E-43)
            if (r4 == r1) goto L2a
            goto L5f
        L2a:
            java.lang.String r4 = "Location"
            java.lang.String r0 = r5.getHeaderField(r4)     // Catch: java.lang.Throwable -> L88
            goto L5f
        L31:
            r4 = 0
            java.io.InputStream r5 = r5.getInputStream()     // Catch: java.lang.Throwable -> L75
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L73
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L73
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L6f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.StringBuffer r4 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L6d
            r4.<init>()     // Catch: java.lang.Throwable -> L6d
        L45:
            java.lang.String r2 = r1.readLine()     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L4f
            r4.append(r2)     // Catch: java.lang.Throwable -> L6d
            goto L45
        L4f:
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L6d
            r0.close()     // Catch: java.lang.Throwable -> L56
        L56:
            r1.close()     // Catch: java.lang.Throwable -> L59
        L59:
            if (r5 == 0) goto L5e
            r5.close()     // Catch: java.lang.Throwable -> L5e
        L5e:
            r0 = r4
        L5f:
            java.lang.String r4 = "iclicashsid"
            java.lang.Object r4 = r3.a(r4)     // Catch: java.lang.Throwable -> L88
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L88
            java.lang.String r3 = r3.f13238a     // Catch: java.lang.Throwable -> L88
            com.qumeng.overseas.advlib.__remote__.framework.report.c.a(r3, r0, r4)     // Catch: java.lang.Throwable -> L88
            goto L8c
        L6d:
            r3 = move-exception
            goto L71
        L6f:
            r3 = move-exception
            r1 = r4
        L71:
            r4 = r0
            goto L78
        L73:
            r3 = move-exception
            goto L77
        L75:
            r3 = move-exception
            r5 = r4
        L77:
            r1 = r4
        L78:
            if (r4 == 0) goto L7d
            r4.close()     // Catch: java.lang.Throwable -> L7d
        L7d:
            if (r1 == 0) goto L82
            r1.close()     // Catch: java.lang.Throwable -> L82
        L82:
            if (r5 == 0) goto L87
            r5.close()     // Catch: java.lang.Throwable -> L87
        L87:
            throw r3     // Catch: java.lang.Throwable -> L88
        L88:
            r3 = move-exception
            r3.printStackTrace()
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qumeng.overseas.advlib.__remote__.utils.network.c.a(com.qumeng.overseas.advlib.__remote__.utils.network.b, int, java.net.HttpURLConnection):void");
    }

    public static void a(com.qumeng.overseas.advlib.__remote__.utils.network.b bVar, String str, int i2, String str2) {
        Object a2;
        int intValue;
        if (bVar == null || bVar.f13238a.contains(ICliFactory.urlBugManReport) || bVar.f13238a.contains(ICliFactory.urlBugManReportHttps)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("op1", str);
        String str3 = "";
        hashMap.put("op2", bVar.f13238a + "");
        hashMap.put("op3", i2 + "");
        hashMap.put("opt_api_content", str2 + "");
        hashMap.put("opt_lyr", a0.d);
        int i3 = 0;
        try {
            str3 = bVar.a("iclicashsid") + "";
            a2 = bVar.a("idea_id");
        } catch (Throwable unused) {
        }
        if (a2 instanceof String) {
            intValue = Integer.valueOf((String) a2).intValue();
        } else {
            if (a2 instanceof Integer) {
                intValue = ((Integer) a2).intValue();
            }
            b(null, new j(str3, i3), "api_request", hashMap);
        }
        i3 = intValue;
        b(null, new j(str3, i3), "api_request", hashMap);
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x02e0: APUT (r0v4 ?? I:??[OBJECT, ARRAY][]), (r17v0 ?? I:??[int, short, byte, char]), (r11 I:??[OBJECT, ARRAY]), block:B:140:0x02dc */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x02e5: IF  (r14 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:149:?, block:B:141:0x02e5 */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x02be: ARITH (r7 I:long) = (r7v3 ?? I:long) - (r19 I:long), block:B:139:0x02b5 */
    /* JADX WARN: Not initialized variable reg: 21, insn: 0x0211: MOVE (r11 I:??[OBJECT, ARRAY]) = (r21 I:??[OBJECT, ARRAY]), block:B:107:0x0211 */
    /* JADX WARN: Not initialized variable reg: 21, insn: 0x0216: MOVE (r11 I:??[OBJECT, ARRAY]) = (r21 I:??[OBJECT, ARRAY]), block:B:103:0x0216 */
    public static java.lang.String a(com.qumeng.overseas.advlib.__remote__.utils.network.b r22) throws java.io.IOException, com.qumeng.overseas.advlib.__remote__.utils.network.NetAPIException {
        /*
            Method dump skipped, instructions count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qumeng.overseas.advlib.__remote__.utils.network.c.a(com.qumeng.overseas.advlib.__remote__.utils.network.b):java.lang.String");
    }
}
