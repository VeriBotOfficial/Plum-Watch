package com.baidu.mshield.x6.f;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.nfc.NfcManager;
import android.text.TextUtils;
import android.util.Base64;
import com.baidu.mshield.MH;
import com.baidu.mshield.x6.EngineImpl;
import com.wakeup.common.utils.AdvConstance;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.UnknownHostException;
import java.util.Calendar;
import org.json.JSONObject;

/* compiled from: CommonUtil.java */
/* loaded from: classes13.dex */
public class f {
    public static String a() {
        String str = EngineImpl.sAppkey;
        return str != null ? str : "";
    }

    public static String b() {
        String str = EngineImpl.sSecKey;
        return str != null ? str : "";
    }

    public static String c() {
        try {
            Calendar calendar = Calendar.getInstance();
            return calendar.get(1) + "" + calendar.get(2) + "" + calendar.get(5);
        } catch (Throwable th) {
            b(th);
            return "";
        }
    }

    public static String d(Context context) {
        try {
            return a(context, false) ? new com.baidu.mshield.x6.b.b(context).g() : l.e;
        } catch (Throwable th) {
            b(th);
            return "";
        }
    }

    public static String e(Context context) {
        try {
            return MH.getVersion(context);
        } catch (Throwable th) {
            b(th);
            return "";
        }
    }

    public static String f(Context context) {
        try {
            return new String(h.a(Base64.decode(g.b, 0), com.baidu.mshield.b.f.a.a(16)));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String g(Context context) {
        String str = "";
        try {
            com.baidu.mshield.x6.b.c cVar = new com.baidu.mshield.x6.b.c(context);
            str = cVar.b();
            if (TextUtils.isEmpty(str)) {
                com.baidu.mshield.b.c.a.a("cloud token is empty");
                str = cVar.e();
            }
            com.baidu.mshield.b.c.a.a("getUserHoldToken : " + str);
            return str;
        } catch (Throwable th) {
            b(th);
            return str;
        }
    }

    public static void h(Context context) {
        try {
            b.c(context);
            com.baidu.mshield.x6.b.b bVar = new com.baidu.mshield.x6.b.b(context);
            long currentTimeMillis = System.currentTimeMillis();
            long o = bVar.o() * 60000;
            long K = bVar.K();
            if (!bVar.n() || currentTimeMillis - K > o) {
                com.baidu.mshield.x6.e.h.a(context).a(3);
            }
            if (!bVar.f()) {
                j(context);
                bVar.d(true);
            }
            com.baidu.mshield.x6.e.h.a(context).a(1, false);
            if (bVar.a()) {
                return;
            }
            com.baidu.mshield.x6.e.h.a(context).a();
        } catch (Throwable th) {
            b(th);
        }
    }

    public static void i(Context context) {
        try {
            String a2 = l.a(context);
            com.baidu.mshield.x6.b.b bVar = new com.baidu.mshield.x6.b.b(context);
            if (TextUtils.isEmpty(a2)) {
                bVar.a(System.currentTimeMillis(), false);
                return;
            }
            JSONObject jSONObject = new JSONObject(a2);
            try {
                String optString = jSONObject.optString("sig");
                if (TextUtils.isEmpty(optString)) {
                    com.baidu.mshield.b.c.a.a("sig sdata is empty ");
                } else {
                    String a3 = com.baidu.mshield.b.f.e.a(optString);
                    l.c = a3;
                    bVar.h(a3);
                    String str = new String(com.baidu.mshield.b.a.c.b(Base64.decode(optString.getBytes(), 0)), "utf-8");
                    com.baidu.mshield.b.c.a.a("requestSigPolicy ungzSig : ".concat(str));
                    l.f8486a = str;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("sgs");
                if (optJSONObject != null) {
                    String optString2 = optJSONObject.optString("3", "");
                    l.b = optString2;
                    com.baidu.mshield.b.c.a.a("requestSgsPolicy : " + optString2);
                }
            } catch (Throwable th) {
                b(th);
            }
            try {
                JSONObject optJSONObject2 = jSONObject.optJSONObject("drf");
                if (optJSONObject2 != null) {
                    l.d = optJSONObject2.toString();
                    com.baidu.mshield.b.c.a.a("requestSigPolicy ungzDrf : ".concat(new String(com.baidu.mshield.b.a.c.b(Base64.decode(optJSONObject2.optString("1").getBytes(), 0)), "utf-8")));
                    bVar.g(optJSONObject2.optString("2"));
                } else {
                    l.d = "";
                }
            } catch (Throwable th2) {
                b(th2);
            }
            bVar.a(System.currentTimeMillis(), true);
            try {
                JSONObject optJSONObject3 = jSONObject.optJSONObject("rmf");
                if (optJSONObject3 == null) {
                    l.e = "";
                    return;
                }
                if (a(context, false)) {
                    bVar.v(optJSONObject3.toString());
                    l.e = "";
                } else {
                    l.e = optJSONObject3.toString();
                    bVar.p();
                }
                com.baidu.mshield.b.c.a.a("requestSigPolicy ungzRmf : ".concat(new String(com.baidu.mshield.b.a.c.b(Base64.decode(optJSONObject3.optString("1").getBytes(), 0)), "utf-8")));
            } catch (Throwable th3) {
                b(th3);
            }
        } catch (Throwable th4) {
            b(th4);
        }
    }

    public static void j(Context context) {
        try {
            String a2 = com.baidu.mshield.x6.c.a.a(context);
            String b = com.baidu.mshield.x6.c.a.b(context);
            com.baidu.mshield.x6.b.b bVar = new com.baidu.mshield.x6.b.b(context);
            if (!TextUtils.isEmpty(a2)) {
                bVar.o(com.baidu.mshield.b.f.e.a(a2));
            }
            if (TextUtils.isEmpty(b)) {
                return;
            }
            bVar.n(com.baidu.mshield.b.f.e.a(b));
        } catch (Throwable th) {
            b(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0078 A[Catch: all -> 0x00de, TRY_ENTER, TryCatch #2 {all -> 0x00de, blocks: (B:6:0x002f, B:8:0x0036, B:10:0x004a, B:12:0x0062, B:15:0x0078, B:16:0x00a6, B:18:0x00b7, B:21:0x00c8, B:23:0x00d1, B:29:0x007f, B:31:0x0089, B:32:0x0094, B:34:0x0097, B:35:0x00a0, B:39:0x002b), top: B:38:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f A[Catch: all -> 0x00de, TryCatch #2 {all -> 0x00de, blocks: (B:6:0x002f, B:8:0x0036, B:10:0x004a, B:12:0x0062, B:15:0x0078, B:16:0x00a6, B:18:0x00b7, B:21:0x00c8, B:23:0x00d1, B:29:0x007f, B:31:0x0089, B:32:0x0094, B:34:0x0097, B:35:0x00a0, B:39:0x002b), top: B:38:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject a(android.content.Context r8, org.json.JSONObject r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = ""
            r3 = 0
            java.lang.String r4 = r8.getPackageName()     // Catch: java.lang.Throwable -> L29
            android.content.pm.PackageInfo r4 = com.baidu.mshield.b.e.c.a(r8, r4, r3)     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = r4.versionName     // Catch: java.lang.Throwable -> L29
            android.content.pm.ApplicationInfo r5 = r8.getApplicationInfo()     // Catch: java.lang.Throwable -> L27
            android.content.pm.PackageManager r6 = r8.getPackageManager()     // Catch: java.lang.Throwable -> L27
            java.lang.CharSequence r5 = r5.loadLabel(r6)     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L27
            goto L2f
        L27:
            r5 = move-exception
            goto L2b
        L29:
            r5 = move-exception
            r4 = r2
        L2b:
            b(r5)     // Catch: java.lang.Throwable -> Lde
            r5 = r2
        L2f:
            java.lang.String r6 = "1"
            r12.put(r6, r5)     // Catch: java.lang.Throwable -> Lde
            java.lang.String r5 = "2"
            com.baidu.mshield.x6.EngineImpl r6 = com.baidu.mshield.x6.EngineImpl.getInstance(r8)     // Catch: java.lang.Throwable -> Lde
            java.lang.String r7 = "p"
            java.lang.String r6 = r6.getPropertyByType(r7)     // Catch: java.lang.Throwable -> Lde
            r12.put(r5, r6)     // Catch: java.lang.Throwable -> Lde
            java.lang.String r5 = "3"
            r12.put(r5, r4)     // Catch: java.lang.Throwable -> Lde
            java.lang.String r4 = "4"
            java.lang.String r5 = com.baidu.mshield.utility.c.b(r8)     // Catch: java.lang.Throwable -> Lde
            r12.put(r4, r5)     // Catch: java.lang.Throwable -> Lde
            java.lang.String r4 = "5"
            r12.put(r4, r10)     // Catch: java.lang.Throwable -> Lde
            java.lang.String r10 = "6"
            r12.put(r10, r0)     // Catch: java.lang.Throwable -> Lde
            java.lang.String r10 = "7"
            r12.put(r10, r2)     // Catch: java.lang.Throwable -> Lde
            java.lang.String r10 = "8"
            java.lang.String r0 = a()     // Catch: java.lang.Throwable -> Lde
            r12.put(r10, r0)     // Catch: java.lang.Throwable -> Lde
            java.lang.String r10 = com.baidu.mshield.x6.EngineImpl.sLoadVersion     // Catch: java.lang.Throwable -> Lde
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> Lde
            java.lang.String r1 = "0"
            r4 = 1
            java.lang.String r5 = "10"
            java.lang.String r6 = "9"
            if (r0 == 0) goto L7f
            r12.put(r6, r11)     // Catch: java.lang.Throwable -> Lde
            r12.put(r5, r1)     // Catch: java.lang.Throwable -> Lde
            goto La6
        L7f:
            java.lang.String r0 = "/"
            java.lang.String[] r10 = r10.split(r0)     // Catch: java.lang.Throwable -> Lde
            int r0 = r10.length     // Catch: java.lang.Throwable -> Lde
            r7 = 2
            if (r0 != r7) goto L94
            r11 = r10[r3]     // Catch: java.lang.Throwable -> Lde
            r12.put(r6, r11)     // Catch: java.lang.Throwable -> Lde
            r10 = r10[r4]     // Catch: java.lang.Throwable -> Lde
            r12.put(r5, r10)     // Catch: java.lang.Throwable -> Lde
            goto La6
        L94:
            int r0 = r10.length     // Catch: java.lang.Throwable -> Lde
            if (r0 != r4) goto La0
            r12.put(r6, r11)     // Catch: java.lang.Throwable -> Lde
            r10 = r10[r3]     // Catch: java.lang.Throwable -> Lde
            r12.put(r5, r10)     // Catch: java.lang.Throwable -> Lde
            goto La6
        La0:
            r12.put(r6, r11)     // Catch: java.lang.Throwable -> Lde
            r12.put(r5, r1)     // Catch: java.lang.Throwable -> Lde
        La6:
            java.lang.String r10 = "11"
            r12.put(r10, r2)     // Catch: java.lang.Throwable -> Lde
            java.lang.String r10 = "12"
            r12.put(r10, r2)     // Catch: java.lang.Throwable -> Lde
            java.lang.String r10 = "13"
            r12.put(r10, r4)     // Catch: java.lang.Throwable -> Lde
            java.lang.String r10 = "14"
            com.baidu.mshield.x6.EngineImpl r11 = com.baidu.mshield.x6.EngineImpl.getInstance(r8)     // Catch: java.lang.Throwable -> Lde
            java.lang.String r0 = "ws"
            java.lang.String r11 = r11.getPropertyByType(r0)     // Catch: java.lang.Throwable -> Lde
            r12.put(r10, r11)     // Catch: java.lang.Throwable -> Lde
            if (r9 == 0) goto Le2
            java.lang.String r10 = "989"
            java.lang.String r8 = e(r8)     // Catch: java.lang.Throwable -> Lde
            r9.put(r10, r8)     // Catch: java.lang.Throwable -> Lde
            java.lang.String r8 = "module_section"
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Lde
            r10.<init>()     // Catch: java.lang.Throwable -> Lde
            org.json.JSONArray r9 = r10.put(r9)     // Catch: java.lang.Throwable -> Lde
            r12.put(r8, r9)     // Catch: java.lang.Throwable -> Lde
            goto Le2
        Lde:
            r8 = move-exception
            b(r8)
        Le2:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mshield.x6.f.f.a(android.content.Context, org.json.JSONObject, java.lang.String, java.lang.String, boolean):org.json.JSONObject");
    }

    public static void b(Throwable th) {
        com.baidu.mshield.b.c.a.a(th);
    }

    public static String b(Context context) {
        if (!TextUtils.isEmpty(l.d)) {
            return l.d;
        }
        i(context);
        return l.d;
    }

    public static String e() {
        return l.b;
    }

    public static String b(String str) {
        try {
            return TextUtils.isEmpty(str) ? "" : Base64.encodeToString(com.baidu.mshield.b.f.a.b(str.getBytes(), com.baidu.mshield.b.f.a.a()), 0);
        } catch (Throwable th) {
            b(th);
            return "";
        }
    }

    public static int c(String str) {
        int i = -1;
        if (str != null && str != "") {
            try {
                char[] charArray = str.trim().toCharArray();
                int i2 = 0;
                while (i2 < charArray.length - 1) {
                    if (i2 == 0) {
                        i = Character.getNumericValue(charArray[i2]);
                    } else {
                        char c = charArray[i2];
                        i2++;
                        int numericValue = Character.getNumericValue(charArray[i2]);
                        if (c == '%') {
                            i %= numericValue;
                        } else if (c != '&') {
                            if (c != '*') {
                                if (c == '+') {
                                    i += numericValue;
                                } else if (c == '-') {
                                    i -= numericValue;
                                } else if (c == '/') {
                                    i /= numericValue;
                                } else if (c == '^') {
                                    i ^= numericValue;
                                } else if (c != 'x') {
                                    i = c != '|' ? numericValue : i | numericValue;
                                }
                            }
                            i *= numericValue;
                        } else {
                            i &= numericValue;
                        }
                    }
                    i2++;
                }
                com.baidu.mshield.b.c.a.a("illegalArithmetic expr：" + str + "，res：" + i);
                return i;
            } catch (Throwable th) {
                b(th);
                return i;
            }
        }
        com.baidu.mshield.b.c.a.a("illegalArithmetic expr is empty : " + str);
        return -1;
    }

    public static String d() {
        return l.c;
    }

    public static String c(Context context) {
        try {
        } catch (Throwable th) {
            b(th);
        }
        if (!TextUtils.isEmpty(l.f8486a)) {
            return l.f8486a;
        }
        i(context);
        return l.f8486a;
    }

    public static JSONObject a(Context context, JSONObject jSONObject, String str, boolean z) {
        return a(context, jSONObject, str, "mshield_x6", z);
    }

    public static String a(String str, String str2, long j) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        sb.append(str).append(j).append(str2);
        return com.baidu.mshield.b.f.e.a(sb.toString());
    }

    public static boolean a(Context context, String str, boolean z) {
        try {
            String a2 = new com.baidu.mshield.x6.b.a(context).a(str);
            if (!TextUtils.isEmpty(a2)) {
                return new JSONObject(a2).optInt("1") == 1;
            }
        } catch (Throwable th) {
            b(th);
        }
        return z;
    }

    public static String a(Throwable th) {
        if (th == null) {
            return "";
        }
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            try {
                if (th2 instanceof UnknownHostException) {
                    return "";
                }
            } catch (Throwable th3) {
                b(th3);
                return "";
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        String stringWriter2 = stringWriter.toString();
        printWriter.close();
        return stringWriter2.replaceAll(Separators.HT, ";").replaceAll("\n", ";");
    }

    public static boolean a(Context context) {
        try {
            return ((NfcManager) context.getSystemService("nfc")).getDefaultAdapter() != null;
        } catch (Throwable th) {
            b(th);
            return false;
        }
    }

    public static boolean a(Context context, boolean z) {
        try {
            String a2 = a(context, "plc104");
            if (!TextUtils.isEmpty(a2)) {
                JSONObject jSONObject = new JSONObject(a2).getJSONObject("5");
                if (jSONObject.has(AdvConstance.COURSE_BACK)) {
                    return jSONObject.optInt(AdvConstance.COURSE_BACK) == 1;
                }
            }
        } catch (Throwable th) {
            b(th);
        }
        return z;
    }

    public static String a(Context context, String str) {
        try {
            return new com.baidu.mshield.x6.b.a(context).a(str);
        } catch (Throwable th) {
            b(th);
            return "";
        }
    }

    public static String a(String str) {
        try {
            return TextUtils.isEmpty(str) ? "" : new String(com.baidu.mshield.b.f.a.a(Base64.decode(str, 0), com.baidu.mshield.b.f.a.a()));
        } catch (Throwable th) {
            b(th);
            return "";
        }
    }
}
