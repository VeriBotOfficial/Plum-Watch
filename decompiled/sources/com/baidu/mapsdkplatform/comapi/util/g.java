package com.baidu.mapsdkplatform.comapi.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.baidu.lbsapi.auth.LBSAuthManager;
import com.baidu.mapapi.JNIInitializer;
import com.baidu.mapapi.VersionInfo;
import com.baidu.mapsdkplatform.comapi.Initializer;
import com.baidu.mapsdkplatform.comjni.util.AppMD5;
import com.baidu.mshield.MH;
import com.baidu.platform.comapi.util.JsonBuilder;
import com.qumeng.overseas.advlib.core.ADEvent;
import com.umeng.analytics.pro.ak;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SysOSAPI.java */
/* loaded from: classes13.dex */
public class g {
    private static String C;
    public static String F;
    private static String c;
    private static String d;
    private static String e;
    private static String f;
    private static String g;
    private static String h;
    private static int i;
    private static int j;
    private static int k;
    private static int l;
    private static int m;
    private static int n;
    private static String o;
    private static String t;
    private static String u;
    public static Context x;

    /* renamed from: a, reason: collision with root package name */
    private static com.baidu.mapsdkplatform.comjni.util.a f8408a = new com.baidu.mapsdkplatform.comjni.util.a();
    private static String b = "02";
    private static String p = ADEvent.BAIDU;

    /* renamed from: q, reason: collision with root package name */
    private static String f8409q = "";
    private static String r = "";
    private static String s = "";
    private static String v = "-1";
    private static String w = "-1";
    public static float y = 1.0f;
    private static String z = "";
    private static Map<String, String> A = new HashMap();
    private static String B = "";
    private static boolean D = false;
    private static boolean E = false;

    public static void a(boolean z2) {
        Context context = x;
        if (context == null) {
            return;
        }
        MH.setAppStatus(context, z2);
    }

    public static void b(boolean z2) {
        if (E == z2) {
            return;
        }
        E = z2;
        Context context = x;
        if (context == null) {
            return;
        }
        MH.setAgreePolicy(context, z2);
        if (!D && z2) {
            q();
            D = true;
        }
        w();
    }

    private static void c(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            String apiVersion = VersionInfo.getApiVersion();
            h = apiVersion;
            if (apiVersion != null && !apiVersion.equals("")) {
                h = h.replace('_', '.');
            }
            i = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            h = "1.0.0";
            i = 1;
        }
    }

    private static void d(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
        if (defaultDisplay != null) {
            j = defaultDisplay.getWidth();
            k = defaultDisplay.getHeight();
            defaultDisplay.getMetrics(displayMetrics);
        }
        y = displayMetrics.density;
        l = (int) displayMetrics.xdpi;
        m = (int) displayMetrics.ydpi;
        int i2 = displayMetrics.densityDpi;
        n = i2;
        if (i2 == 0) {
            n = 160;
        }
    }

    public static void e(Context context) {
        x = context;
    }

    public static String f() {
        return o;
    }

    public static String g() {
        return c;
    }

    public static String h() {
        if (A == null) {
            return null;
        }
        if (TextUtils.isEmpty(z)) {
            A.put("cuid", AppMD5.encodeUrlParamsValue(c()));
        }
        A.put(ak.al, p());
        long time = new Date().getTime() + (r0.getSeconds() * 1000);
        A.put("ctm", AppMD5.encodeUrlParamsValue(String.format("%f", Double.valueOf((time / 1000) + ((time % 1000) / 1000.0d)))));
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : A.entrySet()) {
            sb.append("&").append(entry.getKey()).append("=").append(entry.getValue());
        }
        return sb.toString();
    }

    public static String i() {
        return B;
    }

    public static Map<String, String> j() {
        if (TextUtils.isEmpty(z)) {
            c();
        }
        return A;
    }

    public static String k() {
        return e;
    }

    public static String l() {
        return d;
    }

    public static int m() {
        return j;
    }

    public static int n() {
        return k;
    }

    public static String o() {
        return h;
    }

    private static String p() {
        String gzfi;
        Context context = x;
        if (context == null || (gzfi = MH.gzfi(context, null, 3041, null, null)) == null || gzfi.length() <= 0) {
            return "";
        }
        if (!gzfi.equals(C)) {
            C = gzfi;
            SysUpdateObservable.getInstance().updateZid(C);
        }
        return gzfi;
    }

    private static boolean q() {
        if (x == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        JsonBuilder jsonBuilder = new JsonBuilder();
        jsonBuilder.arrayValue();
        byte[] a2 = a(x);
        if (a2 != null) {
            for (byte b2 : a2) {
                jsonBuilder.value((int) b2);
            }
        }
        jsonBuilder.endArrayValue();
        hashMap.put("cuid", z);
        hashMap.put("p", x.getPackageName());
        hashMap.put("s", jsonBuilder.getJson());
        hashMap.put("arv", f);
        hashMap.put("arl", g);
        hashMap.put("mod", d);
        hashMap.put("ws", o);
        if (Initializer.getCommonInfo() != null) {
            hashMap.put("oid", Initializer.getCommonInfo().getOAID());
        }
        MH.init(x, hashMap);
        return true;
    }

    private static void r() {
        o = "0";
    }

    public static String s() {
        JsonBuilder jsonBuilder = new JsonBuilder();
        jsonBuilder.object();
        jsonBuilder.putStringValue("cpu", f8409q);
        jsonBuilder.putStringValue("resid", b);
        jsonBuilder.putStringValue("channel", p);
        jsonBuilder.putStringValue("glr", r);
        jsonBuilder.putStringValue("glv", s);
        jsonBuilder.putStringValue("mb", l());
        jsonBuilder.putStringValue("sv", o());
        jsonBuilder.putStringValue("os", k());
        jsonBuilder.key("dpi_x").value(d());
        jsonBuilder.key("dpi_y").value(d());
        jsonBuilder.putStringValue("net", o);
        jsonBuilder.putStringValue("cuid", z);
        jsonBuilder.putStringValue(ak.al, p());
        if (x == null) {
            x = JNIInitializer.getCachedContext();
        }
        Context context = x;
        if (context != null) {
            jsonBuilder.putStringValue("pcn", context.getPackageName());
        }
        jsonBuilder.key("screen_x").value(m());
        jsonBuilder.key("screen_y").value(n());
        jsonBuilder.endObject();
        String json = jsonBuilder.getJson();
        B = json;
        return json;
    }

    public static void t() {
        com.baidu.mapsdkplatform.comjni.util.a aVar = f8408a;
        if (aVar != null) {
            aVar.b();
        }
    }

    public static void u() {
        F = null;
    }

    public static void v() {
        t();
    }

    public static void w() {
        A.put("net", AppMD5.encodeUrlParamsValue(f()));
        A.put("appid", AppMD5.encodeUrlParamsValue(v));
        A.put("bduid", "");
        JsonBuilder jsonBuilder = new JsonBuilder();
        jsonBuilder.object();
        if (Initializer.isAgreePrivacyMode()) {
            e = "Android" + Build.VERSION.SDK;
            f = Build.VERSION.RELEASE;
            d = Build.MODEL;
            g = String.valueOf(Build.VERSION.SDK_INT);
        } else {
            e = "Android";
            f = "";
            d = "";
            g = "";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("arv", f);
        hashMap.put("arl", g);
        hashMap.put("mod", d);
        hashMap.put("ws", o);
        if (D) {
            a((HashMap<String, String>) hashMap);
        }
        jsonBuilder.putStringValue("cpu", f8409q);
        jsonBuilder.putStringValue("resid", b);
        jsonBuilder.putStringValue("channel", p);
        jsonBuilder.putStringValue("glr", r);
        jsonBuilder.putStringValue("glv", s);
        jsonBuilder.putStringValue("mb", l());
        jsonBuilder.putStringValue("sv", o());
        jsonBuilder.putStringValue("os", k());
        jsonBuilder.key("dpi_x").value(d());
        jsonBuilder.key("dpi_y").value(d());
        jsonBuilder.putStringValue("net", o);
        jsonBuilder.putStringValue("cuid", z);
        Context context = x;
        if (context != null) {
            jsonBuilder.putStringValue("pcn", context.getPackageName());
        }
        jsonBuilder.key("screen_x").value(m());
        jsonBuilder.key("screen_y").value(n());
        jsonBuilder.putStringValue("appid", v);
        jsonBuilder.putStringValue("duid", w);
        jsonBuilder.putStringValue(ak.al, p());
        if (!TextUtils.isEmpty(F)) {
            jsonBuilder.putStringValue("token", F);
        }
        jsonBuilder.endObject();
        SysUpdateObservable.getInstance().updatePhoneInfo(jsonBuilder.getJson());
    }

    public static String e() {
        return t;
    }

    public static String a() {
        return F;
    }

    public static byte[] a(Context context) {
        Signature[] signatureArr;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                SigningInfo signingInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 134217728).signingInfo;
                if (signingInfo == null) {
                    return null;
                }
                if (signingInfo.hasMultipleSigners()) {
                    signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 134217728).signingInfo.getApkContentsSigners();
                } else {
                    signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 134217728).signingInfo.getSigningCertificateHistory();
                }
            } else {
                signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                return signatureArr[0].toByteArray();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return null;
    }

    public static synchronized String c() {
        String str;
        synchronized (g.class) {
            try {
                str = LBSAuthManager.getInstance(x).getCUID();
                if (!TextUtils.isEmpty(str) && !str.equals(z)) {
                    z = str;
                    if (A != null) {
                        String c2 = c();
                        A.put("cuid", AppMD5.encodeUrlParamsValue(c2));
                    }
                    SysUpdateObservable.getInstance().updateCuid(z);
                    HashMap hashMap = new HashMap();
                    hashMap.put("cuid", z);
                    MH.ud(x, hashMap);
                }
            } catch (Exception unused) {
                str = "";
            }
            if (str == null) {
                str = "";
            }
        }
        return str;
    }

    public static void b(Context context) {
        x = context;
        if (context.getFilesDir() != null) {
            t = context.getFilesDir().getAbsolutePath();
        }
        if (context.getCacheDir() != null) {
            u = context.getCacheDir().getAbsolutePath();
        }
        MH.setAgreePolicy(x, E);
        if (Initializer.isAgreePrivacyMode()) {
            e = "Android" + Build.VERSION.SDK;
            f = Build.VERSION.RELEASE;
            d = Build.MODEL;
            g = String.valueOf(Build.VERSION.SDK_INT);
            if (!D) {
                q();
                D = true;
            }
        } else {
            e = "Android";
            f = "";
            d = "";
            g = "";
        }
        c = context.getPackageName();
        c(context);
        d(context);
        r();
        A.put(ak.al, p());
        A.put("resid", AppMD5.encodeUrlParamsValue(b));
        A.put("channel", AppMD5.encodeUrlParamsValue(b()));
        A.put("mb", AppMD5.encodeUrlParamsValue(l()));
        A.put("sv", AppMD5.encodeUrlParamsValue(o()));
        A.put("os", AppMD5.encodeUrlParamsValue(k()));
        A.put("dpi", AppMD5.encodeUrlParamsValue(String.format("%d,%d", Integer.valueOf(d()), Integer.valueOf(d()))));
        if (!TextUtils.isEmpty(z)) {
            A.put("cuid", AppMD5.encodeUrlParamsValue(z));
        }
        Context context2 = x;
        if (context2 != null) {
            A.put("pcn", AppMD5.encodeUrlParamsValue(context2.getPackageName()));
        }
        A.put("screen", AppMD5.encodeUrlParamsValue(String.format("%d,%d", Integer.valueOf(m()), Integer.valueOf(n()))));
        com.baidu.mapsdkplatform.comjni.util.a aVar = f8408a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public static int d() {
        return n;
    }

    private static boolean a(HashMap<String, String> hashMap) {
        Context context = x;
        if (context == null) {
            return false;
        }
        MH.ud(context, hashMap);
        return true;
    }

    public static void a(String str) {
        o = str;
        w();
    }

    public static void a(String str, String str2) {
        v = str2;
        w = str;
        w();
    }

    public static String b() {
        return p;
    }
}
