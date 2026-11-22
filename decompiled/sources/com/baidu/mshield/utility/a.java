package com.baidu.mshield.utility;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.baidu.mshield.MyProvider;
import com.baidu.mshield.ac.F;
import com.baidu.mshield.rp.Report;
import com.wakeup.common.utils.AdvConstance;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CommonMethods.java */
/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static String f8436a = null;
    public static String b = null;
    public static String c = "";
    public static String d = "";
    public static int e = -1;

    public static void a(Throwable th) {
        com.baidu.mshield.b.c.a.a(th);
    }

    public static JSONObject b(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            String a2 = com.baidu.xclient.gdid.a.a(context);
            if (a2 == null) {
                a2 = "";
            }
            jSONObject.put("0", a2);
            String b2 = com.baidu.xclient.gdid.a.b(context);
            if (b2 == null) {
                b2 = "";
            }
            jSONObject.put("1", b2);
            String e2 = com.baidu.xclient.gdid.a.e(context);
            if (e2 == null) {
                e2 = "";
            }
            jSONObject.put("2", e2);
            String str = Build.HOST;
            if (str == null) {
                str = "";
            }
            jSONObject.put("3", str);
            String a3 = c.a();
            if (a3 == null) {
                a3 = "";
            }
            jSONObject.put("4", a3);
            String h = com.baidu.xclient.gdid.a.h(context);
            if (h == null) {
                h = "";
            }
            jSONObject.put("5", h);
            String str2 = Build.VERSION.CODENAME;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("6", str2);
            String str3 = Build.VERSION.INCREMENTAL;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("7", str3);
            jSONObject.put("8", c.b(context));
            String g = com.baidu.xclient.gdid.a.g(context);
            if (g == null) {
                g = "";
            }
            jSONObject.put("9", g);
            String a4 = com.baidu.mshield.core.a.a("mod");
            if (a4 == null) {
                a4 = "";
            }
            jSONObject.put("10", a4);
            jSONObject.put("11", c.g(context));
            String a5 = com.baidu.mshield.core.a.a("arv");
            jSONObject.put("12", a5 != null ? a5 : "");
            jSONObject.put("13", c.h(context));
            jSONObject.put(AdvConstance.MINE_PAGE, com.baidu.mshield.core.a.a("arl"));
            return jSONObject;
        } catch (Throwable th) {
            a(th);
            return jSONObject;
        }
    }

    public static String[] c(Context context) {
        if (!TextUtils.isEmpty(f8436a) && !TextUtils.isEmpty(b)) {
            return new String[]{f8436a, b};
        }
        String K = com.baidu.mshield.sharedpreferences.a.a(context).K();
        if (TextUtils.isEmpty(K)) {
            return new String[0];
        }
        String[] split = K.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        if (split == null || split.length != 2) {
            return new String[2];
        }
        f8436a = split[0];
        b = split[1];
        return split;
    }

    public static int d(Context context) {
        NetworkInfo networkInfo;
        try {
            networkInfo = com.baidu.mshield.b.e.b.a(context);
        } catch (Throwable th) {
            a(th);
            networkInfo = null;
        }
        if (networkInfo == null) {
            return 0;
        }
        if (1 == networkInfo.getType()) {
            return 2;
        }
        networkInfo.getType();
        return 1;
    }

    public static String e(Context context) {
        try {
        } catch (Throwable th) {
            a(th);
        }
        if (TextUtils.isEmpty(d) && e != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName()).append(".mshield.ac.provider");
            try {
                ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(sb.toString(), 0);
                if (resolveContentProvider != null && !resolveContentProvider.multiprocess) {
                    d = resolveContentProvider.processName;
                }
            } catch (Throwable th2) {
                a(th2);
            }
            e = 1;
            return d;
        }
        return d;
    }

    public static String f(Context context) {
        try {
            StringBuilder sb = new StringBuilder("host=");
            String str = f.f8440a;
            com.baidu.mshield.b.c.a.b(sb.append(str).toString());
            return new String(F.getInstance().ad(Base64.decode(str, 0), com.baidu.mshield.b.f.a.a(16)));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void g(Context context) {
        com.baidu.mshield.sharedpreferences.a a2 = com.baidu.mshield.sharedpreferences.a.a(context);
        if (System.currentTimeMillis() - a2.b() <= 86400000) {
            a2.a(a2.l() + 1);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("0", Integer.valueOf(a2.l() + 1));
        a2.a(0);
        a2.k();
        a(context, "1067119", hashMap);
    }

    public static int h(Context context) {
        int a2;
        try {
            if (MyProvider.a() || TextUtils.isEmpty(e(context)) || (a2 = a(context)) == 1) {
                return 1;
            }
            if (a2 == 2) {
                return 0;
            }
            return MyProvider.a() ? 1 : 0;
        } catch (Throwable th) {
            a(th);
            return -1;
        }
    }

    public static String[] i(Context context) {
        String str = f8436a;
        String str2 = b;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            com.baidu.mshield.b.c.a.b("get key key select by in memory!");
            return new String[]{str, str2};
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            String K = com.baidu.mshield.sharedpreferences.a.a(context).K();
            if (!TextUtils.isEmpty(K)) {
                String[] split = K.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                if (split.length == 2) {
                    com.baidu.mshield.b.c.a.b("get key key select by  from Info");
                    return split;
                }
            }
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            String a2 = com.baidu.mshield.sharedpreferences.a.a(context).a();
            if (!TextUtils.isEmpty(a2)) {
                String[] split2 = a2.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                if (split2.length == 2) {
                    com.baidu.mshield.b.c.a.b("get key key select by  in mark");
                    return split2;
                }
            }
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            com.baidu.mshield.b.c.a.b("get key key select by by default");
            str = "985050001";
            str2 = "83162820e470e3b72501f0683504560e";
        }
        return new String[]{str, str2};
    }

    public static void a(String str, String str2) {
        f8436a = str;
        b = str2;
    }

    public static void a(Context context, String str, Map<String, Object> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("0", System.currentTimeMillis());
            jSONObject2.put("1", "");
            jSONObject2.put("2", "");
            String[] i = i(context);
            jSONObject2.put("3", (i == null || i.length != 2 || TextUtils.isEmpty(i[0]) || TextUtils.isEmpty(i[1])) ? "985050001" : i[0]);
            jSONObject2.put("4", 0);
            jSONObject2.put("5", 0);
            jSONObject2.put("6", 1);
            jSONObject2.put("7", 0);
            jSONObject2.put("8", "mshield");
            jSONObject2.put("9", "4.2.9");
            jSONObject2.put("10", str);
            jSONObject.put("Common_section", jSONObject2);
            if (map != null && map.size() > 0) {
                jSONObject.put("Module_section", new JSONObject(map));
            } else {
                jSONObject.put("Module_section", new JSONObject());
            }
            Report report = Report.getInstance(context);
            String jSONObject3 = jSONObject.toString();
            com.baidu.mshield.b.c.a.b("sendEventUDC:" + jSONObject3);
            report.s(jSONObject3);
        } catch (Throwable th) {
            a(th);
        }
    }

    public static void a(Context context, byte[] bArr) {
        try {
            String[] i = i(context);
            if (i.length == 2) {
                if (TextUtils.isEmpty(i[0]) || TextUtils.isEmpty(i[1]) || !"200080".equals(i[0]) || !context.getPackageName().equals("com.baidu.BaiduMap") || bArr == null) {
                    return;
                }
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    bArr[i2] = (byte) (bArr[i2] ^ 246);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void b(Context context, String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("Common_section");
            long optLong = optJSONObject.optLong("0");
            String optString = optJSONObject.optString("10");
            int optInt = optJSONObject.optInt("5");
            int optInt2 = optJSONObject.optInt("6");
            int optInt3 = optJSONObject.optInt("7");
            int optInt4 = optJSONObject.optInt("11");
            String optString2 = optJSONObject.optString("12", "");
            if (optInt2 == 0) {
                optInt2 = 1;
            }
            com.baidu.mshield.rp.d.a aVar = new com.baidu.mshield.rp.d.a();
            aVar.d = str;
            aVar.b = optString;
            aVar.g = optInt;
            aVar.c = 3;
            aVar.e = optLong;
            aVar.f = optInt2;
            aVar.h = optInt3;
            aVar.i = optInt4;
            aVar.j = optString2;
            b.a(context).a(aVar);
        } catch (Throwable th) {
            a(th);
        }
    }

    public static JSONObject a(Context context, com.baidu.mshield.rp.b.a aVar, String str, boolean z) {
        return a(context, aVar.f8426a, aVar.c, z ? aVar.d : aVar.e, str);
    }

    public static void a(Context context, String str, String str2, String str3, String str4, String str5) {
        b.a(context).a(false);
        b.a(context).e();
        com.baidu.mshield.rp.b.a aVar = new com.baidu.mshield.rp.b.a();
        aVar.f8426a = str;
        aVar.b = str2;
        aVar.c = str3;
        aVar.d = str4;
        aVar.e = str5;
        if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5)) {
            return;
        }
        com.baidu.mshield.sharedpreferences.a a2 = com.baidu.mshield.sharedpreferences.a.a(context);
        List<com.baidu.mshield.rp.b.a> p = a2.p();
        if (p == null) {
            a2.a(aVar);
        } else if (!p.contains(aVar)) {
            a2.a(aVar);
        } else {
            a2.a(p, aVar);
            b.a(context).b();
            return;
        }
        if (!a2.e(aVar.e)) {
            b.a(context).a(aVar);
        }
        b.a(context).b();
        b.a(context).d();
    }

    public static void a(Context context, String str) {
        String str2 = "";
        com.baidu.mshield.sharedpreferences.a a2 = com.baidu.mshield.sharedpreferences.a.a(context);
        try {
            JSONObject jSONObject = new JSONObject(str);
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("0");
                if (optJSONObject != null) {
                    String str3 = "";
                    while (optJSONObject.keys().hasNext()) {
                        str3 = String.valueOf(optJSONObject.keys().next());
                        if (!TextUtils.isEmpty(str3)) {
                            break;
                        }
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        a2.a(str3, optJSONObject.optString(str3));
                    }
                }
            } catch (Throwable th) {
                a(th);
            }
            try {
                JSONObject optJSONObject2 = jSONObject.optJSONObject("1");
                if (optJSONObject2 != null) {
                    while (optJSONObject2.keys().hasNext()) {
                        str2 = String.valueOf(optJSONObject2.keys().next());
                        if (!TextUtils.isEmpty(str2)) {
                            break;
                        }
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        a2.b(str2, optJSONObject2.optString(str2));
                    }
                }
            } catch (Throwable th2) {
                a(th2);
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("2");
                if (optJSONArray != null) {
                    com.baidu.mshield.b.c.a.b("setAliveData rp= " + optJSONArray.toString());
                    a2.f(optJSONArray.toString());
                }
            } catch (Throwable th3) {
                a(th3);
            }
        } catch (Throwable th4) {
            a(th4);
        }
    }

    public static String a() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(1) + "" + calendar.get(2) + "" + calendar.get(5);
    }

    public static JSONObject a(Context context, String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("0", System.currentTimeMillis());
            jSONObject2.put("1", "0");
            jSONObject2.put("2", "0");
            String[] i = i(context);
            if (i.length == 2) {
                jSONObject2.put("3", i[0]);
            } else {
                jSONObject2.put("3", "985050001");
            }
            jSONObject2.put("4", 0);
            jSONObject2.put("5", 0);
            jSONObject2.put("6", 1);
            jSONObject2.put("7", 0);
            jSONObject2.put("8", str);
            jSONObject2.put("9", str2);
            jSONObject2.put("10", str3);
            JSONObject jSONObject3 = new JSONObject();
            if (!TextUtils.isEmpty(str4)) {
                try {
                    jSONObject3 = new JSONObject(str4);
                } catch (Throwable th) {
                    a(th);
                }
            }
            jSONObject.put("Common_section", jSONObject2);
            jSONObject.put("Module_section", jSONObject3);
        } catch (Throwable th2) {
            a(th2);
        }
        return jSONObject;
    }

    public static void a(Context context, long j) {
        try {
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            new Intent("com.b.r.p").setPackage(context.getPackageName());
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 101, new Intent("com.b.r.p"), 201326592);
            try {
                alarmManager.cancel(broadcast);
            } catch (Throwable th) {
                a(th);
            }
            try {
                alarmManager.set(0, System.currentTimeMillis() + j, broadcast);
            } catch (Throwable th2) {
                a(th2);
            }
        } catch (Throwable th3) {
            a(th3);
        }
    }

    public static String a(byte[] bArr) {
        String str = "";
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            str = str + hexString.toUpperCase();
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0154 A[Catch: all -> 0x0165, TRY_ENTER, TryCatch #2 {all -> 0x0165, blocks: (B:15:0x0083, B:17:0x008a, B:19:0x0098, B:21:0x00bd, B:23:0x00c6, B:25:0x00d5, B:27:0x00e0, B:29:0x00e9, B:31:0x00f2, B:33:0x0112, B:35:0x0119, B:37:0x0122, B:39:0x012b, B:41:0x0134, B:44:0x0154, B:51:0x0158, B:62:0x007e), top: B:61:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0158 A[Catch: all -> 0x0165, TRY_LEAVE, TryCatch #2 {all -> 0x0165, blocks: (B:15:0x0083, B:17:0x008a, B:19:0x0098, B:21:0x00bd, B:23:0x00c6, B:25:0x00d5, B:27:0x00e0, B:29:0x00e9, B:31:0x00f2, B:33:0x0112, B:35:0x0119, B:37:0x0122, B:39:0x012b, B:41:0x0134, B:44:0x0154, B:51:0x0158, B:62:0x007e), top: B:61:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject a(android.content.Context r18, org.json.JSONObject r19) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mshield.utility.a.a(android.content.Context, org.json.JSONObject):org.json.JSONObject");
    }

    public static int a(Context context) {
        try {
            String e2 = e(context);
            if (TextUtils.isEmpty(c)) {
                c = a(Process.myPid());
            }
            if (TextUtils.isEmpty(c)) {
                return 0;
            }
            return !TextUtils.isEmpty(e2) ? e2.equals(c) ? 1 : 2 : context.getPackageName().equals(c) ? 3 : 4;
        } catch (Throwable th) {
            a(th);
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.StringBuilder] */
    public static String a(int i) {
        String str;
        String str2;
        ?? r3 = 0;
        r3 = 0;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                str2 = Application.getProcessName();
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        com.baidu.mshield.b.c.a.b("getProcessName return by P+:" + str2);
                        return str2.trim();
                    }
                } catch (Throwable th) {
                    th = th;
                    r3 = str2;
                    a(th);
                    str = r3;
                    return str;
                }
            } else {
                str2 = null;
            }
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                r3 = invoke instanceof String;
                if (r3 != 0) {
                    str2 = (String) invoke;
                }
            } catch (Throwable th2) {
                a(th2);
            }
        } catch (Throwable th3) {
            th = th3;
            a(th);
            str = r3;
            return str;
        }
        if (!TextUtils.isEmpty(str2)) {
            com.baidu.mshield.b.c.a.b("getProcessName return by reflect:" + str2);
            return str2.trim();
        }
        r3 = a(String.format("/proc/%d/cmdline", Integer.valueOf(i)));
        boolean isEmpty = TextUtils.isEmpty(r3);
        str = r3;
        if (!isEmpty) {
            com.baidu.mshield.b.c.a.b("getProcessName return by cmdline:" + r3);
            return r3.trim();
        }
        return str;
    }

    public static String a(String str) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                String a2 = a(fileInputStream);
                try {
                    fileInputStream.close();
                    return a2;
                } catch (Throwable th) {
                    a(th);
                    return a2;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    a(th);
                    return null;
                } finally {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            a(th3);
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
        }
    }

    public static String a(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                if (z) {
                    z = false;
                } else {
                    sb.append('\n');
                }
                sb.append(readLine);
            } else {
                return sb.toString();
            }
        }
    }
}
