package com.baidu.mshield.x0.d;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.gov.nist.core.Separators;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Base64;
import com.baidu.mshield.rp.Report;
import com.baidu.mshield.x0.EngineImpl;
import com.baidu.mshield.x6.f.k;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CommonUtil.java */
/* loaded from: classes13.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static String f8451a = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String[] b = {"L3N5c3RlbS94YmluL3N1", "L3N5c3RlbS9iaW4vc3U", "L3N5c3RlbS94YmluLy5zdQ==", "L3N5c3RlbS9iaW4vLnN1", "L3N5c3RlbS9iaW4vLnN1dg==", "L3N5c3RlbS94YmluLy5zdXY=", "L3N5c3RlbS94YmluL2Jkc3U=", "L3N5c3RlbS9iaW4vYmRzdQ==", "L3N5c3RlbS94YmluL2F1", "L3N5c3RlbS9iaW4vYXU=", "L3N5c3RlbS94YmluL2t1LnN1ZA==", "L3N5c3RlbS9iaW4va3Uuc3Vk", "L3N5c3RlbS9iaW4vLnJncw==", "L3N5c3RlbS94YmluLy5yZ3M=", "L3NiaW4vc3U="};
    public static boolean c = false;

    /* compiled from: CommonUtil.java */
    public static class a extends com.baidu.mshield.x0.d.h.b {
        public final /* synthetic */ Context b;

        public a(Context context) {
            this.b = context;
        }

        @Override // com.baidu.mshield.x0.d.h.b
        public void a() {
            boolean unused = d.c = true;
            d.p(this.b);
            boolean unused2 = d.c = false;
        }
    }

    /* compiled from: CommonUtil.java */
    public static class b implements com.baidu.mshield.x0.e.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f8452a;

        public b(Context context) {
            this.f8452a = context;
        }

        @Override // com.baidu.mshield.x0.e.b
        public void a(String str) {
            try {
                if (str.contains("mshield")) {
                    JSONArray jSONArray = new JSONArray();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("0", "mshield");
                    jSONObject.put("1", str.replaceAll(Separators.HT, ";").replaceAll("\n", ";"));
                    jSONArray.put(jSONObject);
                    d.a(this.f8452a, new c(), jSONArray, "1003138");
                }
            } catch (Throwable th) {
                d.a(th);
            }
        }

        @Override // com.baidu.mshield.x0.e.b
        public boolean a() {
            return true;
        }
    }

    public static void b(Context context, JSONArray jSONArray, String str) {
        try {
            c cVar = new c();
            String str2 = EngineImpl.sAppkey;
            cVar.c = 0;
            String str3 = com.baidu.mshield.x0.a.d;
            String str4 = EngineImpl.sLoadVersion;
            if (jSONArray == null || jSONArray.length() == 0) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("0", Long.toString(System.currentTimeMillis()));
                jSONObject2.put("1", cVar.f8450a);
                jSONObject2.put("2", cVar.b);
                jSONObject2.put("3", String.valueOf(c(context)));
                jSONObject2.put("4", cVar.c);
                jSONObject2.put("5", cVar.d);
                jSONObject2.put("6", cVar.e);
                jSONObject2.put("7", cVar.f);
                jSONObject2.put("8", com.baidu.mshield.x0.a.d);
                jSONObject2.put("9", EngineImpl.sLoadVersion);
                jSONObject2.put("10", str);
                jSONObject.put("Common_section", jSONObject2);
                jSONObject.put("Module_section", jSONArray);
                b(context, jSONObject.toString());
            } catch (Throwable th) {
                a(th);
            }
        } catch (Throwable th2) {
            a(th2);
        }
    }

    public static String c(Context context) {
        try {
            String str = EngineImpl.sAppkey;
            return str != null ? str : "";
        } catch (Throwable th) {
            a(th);
            return "";
        }
    }

    public static byte[] d() {
        char[] cArr = new char[16];
        try {
            char[] charArray = f8451a.toCharArray();
            for (int i = 0; i < 16; i++) {
                int nextInt = new Random().nextInt(62);
                if (nextInt >= 0 && nextInt < charArray.length) {
                    cArr[i] = charArray[nextInt];
                }
            }
        } catch (Throwable th) {
            a(th);
        }
        return new String(cArr).getBytes();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0056 -> B:13:0x0059). Please report as a decompilation issue!!! */
    public static String e() {
        LineNumberReader lineNumberReader;
        String str = "";
        InputStreamReader inputStreamReader = null;
        try {
            try {
                InputStreamReader inputStreamReader2 = new InputStreamReader(Runtime.getRuntime().exec("getprop ro.build.version.security_patch").getInputStream());
                try {
                    LineNumberReader lineNumberReader2 = new LineNumberReader(inputStreamReader2);
                    String str2 = "";
                    while (str2 != null) {
                        try {
                            str2 = lineNumberReader2.readLine();
                            if (str2 != null) {
                                str = str2.trim();
                                break;
                            }
                        } catch (Throwable th) {
                            th = th;
                            inputStreamReader = inputStreamReader2;
                            lineNumberReader = lineNumberReader2;
                            try {
                                a(th);
                                if (inputStreamReader != null) {
                                    try {
                                        inputStreamReader.close();
                                    } catch (Throwable th2) {
                                        a(th2);
                                    }
                                }
                                if (lineNumberReader != null) {
                                    lineNumberReader.close();
                                }
                                return str;
                            } finally {
                            }
                        }
                    }
                    try {
                        inputStreamReader2.close();
                    } catch (Throwable th3) {
                        a(th3);
                    }
                    lineNumberReader2.close();
                } catch (Throwable th4) {
                    th = th4;
                    lineNumberReader = null;
                    inputStreamReader = inputStreamReader2;
                }
            } catch (Throwable th5) {
                th = th5;
                lineNumberReader = null;
            }
        } catch (IOException e) {
            a(e);
        }
        return str;
    }

    public static int f(Context context) {
        try {
            return com.baidu.mshield.b.e.c.a(context, context.getPackageName(), 0).versionCode;
        } catch (Throwable th) {
            a(th);
            return 0;
        }
    }

    public static JSONObject g(Context context) {
        int i;
        int i2;
        File file;
        JSONObject jSONObject = new JSONObject();
        try {
            i2 = 0;
            for (String str : b) {
                if (new File(new String(Base64.decode(str, 0))).exists()) {
                    jSONObject.put(Integer.toString(i2), "1");
                } else {
                    jSONObject.put(Integer.toString(i2), "0");
                }
                i2++;
            }
            try {
                file = new File(new String(Base64.decode("L3NiaW5fb3JpZw==", 0)));
            } catch (Throwable th) {
                a(th);
            }
        } catch (Throwable th2) {
            a(th2);
        }
        if (!file.exists() || !file.isDirectory()) {
            jSONObject.put(Integer.toString(i2), "0");
            return jSONObject;
        }
        jSONObject.put(Integer.toString(i2), "0");
        for (String str2 : file.list()) {
            com.baidu.mshield.b.c.a.b(str2 + " exits!!");
            if (str2.startsWith("su")) {
                jSONObject.put(Integer.toString(i2), "1");
                return jSONObject;
            }
        }
        return jSONObject;
    }

    public static String h(Context context) {
        try {
            File file = new File(context.getFilesDir(), com.baidu.mshield.x0.a.f8443a);
            if (!file.exists()) {
                file.mkdirs();
            }
            return file.getAbsolutePath();
        } catch (Throwable th) {
            a(th);
            return "";
        }
    }

    public static String i(Context context) {
        try {
            return com.baidu.xclient.gdid.a.c(context);
        } catch (Throwable th) {
            a(th);
            return "";
        }
    }

    public static String j(Context context) {
        try {
            return Long.toString(com.baidu.mshield.b.e.c.a(context, context.getPackageName(), 0).firstInstallTime);
        } catch (Throwable th) {
            a(th);
            return "";
        }
    }

    public static String k(Context context) {
        return "4.2.9";
    }

    public static String l(Context context) {
        try {
            return new String(com.baidu.mshield.b.f.d.a(Base64.decode(com.baidu.mshield.x0.a.b, 0), com.baidu.mshield.b.f.a.a(16)));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void m(Context context) {
        com.baidu.mshield.x0.e.a.a().a(new b(context));
    }

    public static boolean n(Context context) {
        try {
            if (!k.a(context, new String[]{"android.permission.ACCESS_NETWORK_STATE"})) {
                return true;
            }
            NetworkInfo a2 = com.baidu.mshield.b.e.b.a(context);
            if (a2 == null) {
                return false;
            }
            return a2.isConnected();
        } catch (Throwable th) {
            a(th);
            return false;
        }
    }

    public static boolean o(Context context) {
        try {
            return com.baidu.mshield.b.e.a.b(context, "adb_enabled") > 0;
        } catch (Throwable th) {
            a(th);
            return false;
        }
    }

    public static void p(Context context) {
        try {
            com.baidu.mshield.x0.l.a aVar = new com.baidu.mshield.x0.l.a(context);
            List<com.baidu.mshield.x0.l.b> e = aVar.e();
            if (e == null) {
                return;
            }
            com.baidu.mshield.b.c.a.b("re_con==" + e.size());
            for (com.baidu.mshield.x0.l.b bVar : e) {
                if (a(context, aVar.a(), bVar.b)) {
                    a(context, bVar);
                }
            }
        } catch (Throwable th) {
            a(th);
        }
    }

    public static void q(Context context) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        String str = "";
        com.baidu.mshield.b.c.a.b("setAliveDate begin");
        try {
            PackageInfo a2 = com.baidu.mshield.b.e.c.a(context, context.getPackageName(), 16384);
            int i = a2.applicationInfo.flags;
            r6 = ((i & 1) == 1 || (i & 128) == 128) ? 1 : 0;
            try {
                str = com.baidu.mshield.b.f.e.a(new File(a2.applicationInfo.sourceDir));
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            a(th);
        }
        try {
            jSONObject2.put("0", "0");
            jSONObject2.put("15", Integer.toString(r6));
            jSONObject2.put("14", j(context));
            jSONObject2.put("16", e());
            jSONObject2.put("17", str);
            jSONObject2.put("18", e(context));
            jSONObject2.put("19", f(context));
            jSONObject2.put("990", com.baidu.xclient.gdid.a.d(context));
            jSONObject2.put("989", k(context));
            jSONObject2.put("993", e.a(context));
            jSONObject2.put("995", g.b(context));
            if (a(context, "plc31", true)) {
                jSONObject2.put("997", i(context));
            }
            jSONObject2.put("998", e.b(context));
            jSONObject2.put("999", TextUtils.isEmpty(com.baidu.mshield.utility.c.j(context)) ? com.baidu.mshield.utility.c.i(context) : com.baidu.mshield.utility.c.j(context));
            jSONObject2.put("981", new com.baidu.mshield.x0.l.c(context).a());
            jSONObject.put("0", new JSONObject().put("1001003", jSONObject2));
            com.baidu.mshield.b.c.a.b("setAliveDate begin to report" + jSONObject.toString());
            c(context, jSONObject.toString());
        } catch (Throwable th2) {
            a(th2);
        }
    }

    public static String a(long j, String str) {
        if (j >= 0) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return new SimpleDateFormat(str).format(new Date(j));
                }
            } catch (Throwable th) {
                a(th);
            }
        }
        return "";
    }

    public static String f() {
        try {
            return new String(com.baidu.mshield.b.f.d.a(Base64.decode(f.b, 2), com.baidu.mshield.b.f.a.a(16)));
        } catch (Throwable th) {
            a(th);
            return "";
        }
    }

    public static void c(Context context, String str) {
        try {
            Report.getInstance(context).w(str);
        } catch (Throwable th) {
            a(th);
        }
    }

    public static String c() {
        try {
            return UUID.randomUUID().toString();
        } catch (Throwable th) {
            a(th);
            return "";
        }
    }

    public static void a(Throwable th) {
        com.baidu.mshield.b.c.a.a(th);
    }

    public static void a(Context context, String str, String str2, String str3, String str4, String str5) {
        try {
            Report.getInstance(context).i(str, str2, str3, str4, str5);
        } catch (Throwable th) {
            a(th);
        }
    }

    public static String d(Context context) {
        try {
            String str = EngineImpl.sSecKey;
            return str != null ? str : "";
        } catch (Throwable th) {
            a(th);
            return "";
        }
    }

    public static String a(String str, String str2, long j) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str).append(j).append(str2);
            return com.baidu.mshield.b.f.e.a(sb.toString());
        } catch (Throwable th) {
            a(th);
            return null;
        }
    }

    public static boolean a(Context context, String str, boolean z) {
        try {
            String c2 = new com.baidu.mshield.x0.l.a(context).c(str);
            if (!TextUtils.isEmpty(c2)) {
                return new JSONObject(c2).optInt("1") == 1;
            }
        } catch (Throwable th) {
            a(th);
        }
        return z;
    }

    public static boolean a(Context context, String str, boolean z, com.baidu.mshield.x0.l.a aVar) {
        if (aVar == null) {
            try {
                aVar = new com.baidu.mshield.x0.l.a(context);
            } catch (Throwable th) {
                a(th);
            }
        }
        String c2 = aVar.c(str);
        if (!TextUtils.isEmpty(c2)) {
            return new JSONObject(c2).optInt("1") == 1;
        }
        return z;
    }

    public static void b(Context context, String str) {
        try {
            Report.getInstance(context).sr(str);
        } catch (Throwable th) {
            a(th);
        }
    }

    public static void b(Context context) {
        try {
            synchronized (d.class) {
                if (c) {
                    return;
                }
                com.baidu.mshield.x0.d.h.d.b().a(new a(context));
            }
        } catch (Throwable th) {
            a(th);
        }
    }

    public static void a(Context context, String str, c cVar, com.baidu.mshield.x0.l.a aVar) {
        if (cVar == null) {
            return;
        }
        if (aVar == null) {
            try {
                aVar = new com.baidu.mshield.x0.l.a(context);
            } catch (Throwable th) {
                a(th);
                return;
            }
        }
        String c2 = aVar.c(str);
        if (TextUtils.isEmpty(c2)) {
            return;
        }
        JSONObject jSONObject = new JSONObject(c2);
        cVar.e = jSONObject.optInt("2");
        cVar.d = jSONObject.optInt("3");
        cVar.f = jSONObject.optInt("4");
    }

    public static String b() {
        try {
            Calendar calendar = Calendar.getInstance();
            return calendar.get(1) + "" + calendar.get(2) + "" + calendar.get(5);
        } catch (Throwable th) {
            a(th);
            return "";
        }
    }

    public static void a(Context context, JSONArray jSONArray, String str) {
        try {
            c cVar = new c();
            String str2 = EngineImpl.sAppkey;
            cVar.c = 0;
            String str3 = com.baidu.mshield.x0.a.d;
            String str4 = EngineImpl.sLoadVersion;
            a(context, cVar, jSONArray, str, true);
        } catch (Throwable th) {
            a(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject b(android.content.Context r11, com.baidu.mshield.x0.l.b r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mshield.x0.d.d.b(android.content.Context, com.baidu.mshield.x0.l.b, java.lang.String):org.json.JSONObject");
    }

    public static void a(Context context, c cVar, JSONArray jSONArray, String str) {
        a(context, cVar, jSONArray, str, true);
    }

    public static void a(Context context, c cVar, JSONArray jSONArray, String str, boolean z) {
        if (jSONArray == null || jSONArray.length() == 0 || cVar == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                jSONObject3.put("991", i(context));
                jSONObject3.put("995", g.b(context));
                jSONObject3.put("998", e.b(context));
                jSONObject3.put("989", k(context));
            }
            jSONObject2.put("0", Long.toString(System.currentTimeMillis()));
            jSONObject2.put("1", cVar.f8450a);
            jSONObject2.put("2", cVar.b);
            jSONObject2.put("3", String.valueOf(c(context)));
            jSONObject2.put("4", cVar.c);
            jSONObject2.put("5", cVar.d);
            jSONObject2.put("6", cVar.e);
            jSONObject2.put("7", cVar.f);
            jSONObject2.put("8", com.baidu.mshield.x0.a.d);
            jSONObject2.put("9", EngineImpl.sLoadVersion);
            jSONObject2.put("10", str);
            jSONObject.put("Common_section", jSONObject2);
            jSONObject.put("Module_section", jSONArray);
            a(context, jSONObject.toString());
        } catch (Throwable th) {
            a(th);
        }
    }

    public static String e(Context context) {
        return com.baidu.mshield.b.a.d.a(context);
    }

    public static int a(Context context, String str) {
        try {
            Report.getInstance(context).s(str);
            return 0;
        } catch (Throwable th) {
            a(th);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject a(android.content.Context r12, java.lang.String r13, org.json.JSONArray r14) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = " "
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r5 = c(r12)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r6 = com.baidu.mshield.x0.a.d     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r7 = com.baidu.mshield.x0.EngineImpl.sLoadVersion     // Catch: java.lang.Throwable -> Lb6
            r8 = 0
            java.lang.String r9 = r12.getPackageName()     // Catch: java.lang.Throwable -> L33
            android.content.pm.PackageInfo r9 = com.baidu.mshield.b.e.c.a(r12, r9, r8)     // Catch: java.lang.Throwable -> L33
            java.lang.String r9 = r9.versionName     // Catch: java.lang.Throwable -> L33
            android.content.pm.ApplicationInfo r10 = r12.getApplicationInfo()     // Catch: java.lang.Throwable -> L31
            android.content.pm.PackageManager r11 = r12.getPackageManager()     // Catch: java.lang.Throwable -> L31
            java.lang.CharSequence r10 = r10.loadLabel(r11)     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r10.toString()     // Catch: java.lang.Throwable -> L31
            goto L38
        L31:
            r10 = move-exception
            goto L35
        L33:
            r10 = move-exception
            r9 = r0
        L35:
            a(r10)     // Catch: java.lang.Throwable -> Lb6
        L38:
            java.lang.String r10 = "1"
            r2.put(r10, r0)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = "2"
            com.baidu.mshield.x0.EngineImpl r10 = com.baidu.mshield.x0.EngineImpl.getInstance(r12)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r11 = "p"
            java.lang.String r10 = r10.getPropertyByType(r11)     // Catch: java.lang.Throwable -> Lb6
            r2.put(r0, r10)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = "3"
            r2.put(r0, r9)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = "4"
            java.lang.String r9 = com.baidu.mshield.utility.c.b(r12)     // Catch: java.lang.Throwable -> Lb6
            r2.put(r0, r9)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = "5"
            r2.put(r0, r13)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r13 = "6"
            r2.put(r13, r3)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r13 = "7"
            r2.put(r13, r1)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r13 = "8"
            r2.put(r13, r5)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r13 = "9"
            r2.put(r13, r6)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r13 = "10"
            r2.put(r13, r7)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r13 = "11"
            r2.put(r13, r1)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r13 = "12"
            r2.put(r13, r1)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r13 = "13"
            r2.put(r13, r1)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r13 = "14"
            com.baidu.mshield.x0.EngineImpl r0 = com.baidu.mshield.x0.EngineImpl.getInstance(r12)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r1 = "ws"
            java.lang.String r0 = r0.getPropertyByType(r1)     // Catch: java.lang.Throwable -> Lb6
            r2.put(r13, r0)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r13 = "plc31"
            boolean r13 = a(r12, r13, r8)     // Catch: java.lang.Throwable -> Lb6
            if (r13 == 0) goto La7
            java.lang.String r13 = "997"
            java.lang.String r0 = i(r12)     // Catch: java.lang.Throwable -> Lb6
            r2.put(r13, r0)     // Catch: java.lang.Throwable -> Lb6
        La7:
            java.lang.String r13 = "989"
            java.lang.String r12 = k(r12)     // Catch: java.lang.Throwable -> Lb6
            r2.put(r13, r12)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r12 = "module_section"
            r2.put(r12, r14)     // Catch: java.lang.Throwable -> Lb6
            goto Lba
        Lb6:
            r12 = move-exception
            a(r12)
        Lba:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mshield.x0.d.d.a(android.content.Context, java.lang.String, org.json.JSONArray):org.json.JSONObject");
    }

    public static String b(String str) {
        try {
            return TextUtils.isEmpty(str) ? "" : Base64.encodeToString(com.baidu.mshield.b.f.d.b(str.getBytes(), com.baidu.mshield.b.f.a.a(16)), 0);
        } catch (Throwable th) {
            a(th);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0105 A[Catch: all -> 0x01c2, TryCatch #2 {all -> 0x01c2, blocks: (B:13:0x004f, B:15:0x0056, B:17:0x006a, B:19:0x0073, B:21:0x0086, B:23:0x008f, B:25:0x0096, B:27:0x00a2, B:29:0x00ab, B:31:0x00c7, B:33:0x00d0, B:35:0x00d9, B:37:0x00e2, B:39:0x00eb, B:41:0x00f4, B:43:0x00fd, B:45:0x0105, B:46:0x010c, B:48:0x01a4, B:51:0x01ac, B:55:0x01b5, B:83:0x01a1, B:88:0x004c, B:57:0x0117, B:59:0x0124, B:61:0x0132, B:62:0x0148, B:65:0x0152, B:67:0x015b, B:69:0x016c, B:70:0x0175, B:72:0x017c, B:74:0x0185, B:76:0x018e, B:78:0x0197, B:81:0x0171), top: B:87:0x004c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ac A[Catch: all -> 0x01c2, TRY_ENTER, TryCatch #2 {all -> 0x01c2, blocks: (B:13:0x004f, B:15:0x0056, B:17:0x006a, B:19:0x0073, B:21:0x0086, B:23:0x008f, B:25:0x0096, B:27:0x00a2, B:29:0x00ab, B:31:0x00c7, B:33:0x00d0, B:35:0x00d9, B:37:0x00e2, B:39:0x00eb, B:41:0x00f4, B:43:0x00fd, B:45:0x0105, B:46:0x010c, B:48:0x01a4, B:51:0x01ac, B:55:0x01b5, B:83:0x01a1, B:88:0x004c, B:57:0x0117, B:59:0x0124, B:61:0x0132, B:62:0x0148, B:65:0x0152, B:67:0x015b, B:69:0x016c, B:70:0x0175, B:72:0x017c, B:74:0x0185, B:76:0x018e, B:78:0x0197, B:81:0x0171), top: B:87:0x004c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b5 A[Catch: all -> 0x01c2, TRY_LEAVE, TryCatch #2 {all -> 0x01c2, blocks: (B:13:0x004f, B:15:0x0056, B:17:0x006a, B:19:0x0073, B:21:0x0086, B:23:0x008f, B:25:0x0096, B:27:0x00a2, B:29:0x00ab, B:31:0x00c7, B:33:0x00d0, B:35:0x00d9, B:37:0x00e2, B:39:0x00eb, B:41:0x00f4, B:43:0x00fd, B:45:0x0105, B:46:0x010c, B:48:0x01a4, B:51:0x01ac, B:55:0x01b5, B:83:0x01a1, B:88:0x004c, B:57:0x0117, B:59:0x0124, B:61:0x0132, B:62:0x0148, B:65:0x0152, B:67:0x015b, B:69:0x016c, B:70:0x0175, B:72:0x017c, B:74:0x0185, B:76:0x018e, B:78:0x0197, B:81:0x0171), top: B:87:0x004c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONArray a(android.content.Context r12, com.baidu.mshield.x0.l.b r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mshield.x0.d.d.a(android.content.Context, com.baidu.mshield.x0.l.b, java.lang.String):org.json.JSONArray");
    }

    public static boolean a(Context context, String str, String str2) {
        try {
        } catch (Throwable th) {
            a(th);
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        if (str2.equals(context.getPackageName()) || str2.equals(com.baidu.mshield.x0.a.f8443a)) {
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (str2.equals(jSONArray.get(i))) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static void a(Context context, com.baidu.mshield.x0.l.b bVar) {
        try {
            com.baidu.mshield.x0.l.a aVar = new com.baidu.mshield.x0.l.a(context);
            String d = aVar.d(bVar.d);
            String b2 = b();
            if (d.equals(b2)) {
                return;
            }
            String a2 = aVar.a(bVar.d);
            if (!new com.baidu.mshield.x0.i.c(context, null).a(a(context, bVar, a2).toString())) {
                b(context, bVar, a2);
            }
            aVar.c(bVar.d, b2);
        } catch (Throwable th) {
            a(th);
        }
    }

    public static String a(String str) {
        try {
            return TextUtils.isEmpty(str) ? "" : new String(com.baidu.mshield.b.f.d.a(Base64.decode(str, 0), com.baidu.mshield.b.f.a.a(16)));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String a(Context context, com.baidu.mshield.x0.l.a aVar, String str, String str2) {
        if (aVar == null) {
            try {
                aVar = new com.baidu.mshield.x0.l.a(context);
            } catch (Throwable th) {
                a(th);
            }
        }
        String c2 = aVar.c(str);
        if (!TextUtils.isEmpty(c2)) {
            JSONObject jSONObject = new JSONObject(c2).getJSONObject("5");
            if (jSONObject.has(str2)) {
                return jSONObject.optString(str2, "");
            }
        }
        return "";
    }

    public static String a() {
        String property = System.getProperty("http.proxyHost");
        return TextUtils.isEmpty(property) ? "" : property;
    }

    public static JSONArray a(JSONArray jSONArray, int i) {
        JSONArray jSONArray2 = new JSONArray();
        try {
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (i2 != i) {
                    jSONArray2.put(jSONArray.get(i2));
                }
            }
        } catch (Throwable th) {
            a(th);
        }
        return jSONArray2;
    }
}
