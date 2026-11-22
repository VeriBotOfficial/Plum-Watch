package com.anythink.core.common.v;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.BatteryManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.c.h;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.u;
import com.hjq.permissions.Permission;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class m {
    private static String K = null;
    private static String L = null;
    private static String M = null;
    private static String N = null;
    private static String O = null;
    private static String P = null;
    private static String Q = null;
    private static String R = null;
    private static String S = null;
    private static String T = null;
    private static String U = null;
    private static String V = null;
    private static String W = null;
    private static String X = null;
    private static String Y = null;
    private static String Z = null;

    /* renamed from: a, reason: collision with root package name */
    public static String f4416a = null;
    private static String aa = null;
    private static String ab = null;
    private static String ac = null;
    private static String ad = null;
    private static String af = null;
    private static String ag = null;
    private static PackageInfo ah = null;
    private static BatteryManager al = null;
    public static String b = null;
    static String d = null;
    public static final String e = "unknown";
    private static final String f = "m";
    private static String g;
    private static String h;
    private static String k;
    private static boolean l;
    private static int m;
    private static boolean n;
    private static String o;
    private static PackageInfo p;
    private static final JSONObject i = new JSONObject();
    private static String j = null;
    public static String c = "";

    /* renamed from: q, reason: collision with root package name */
    private static volatile String f4418q = null;
    private static final Object r = new Object();
    private static volatile String s = null;
    private static final Object t = new Object();
    private static volatile String u = null;
    private static String v = "";
    private static String w = "";
    private static String x = "";
    private static String y = "";
    private static int z = 0;
    private static String A = "";
    private static String B = "";
    private static String C = null;
    private static Object D = new Object();
    private static String E = "";
    private static String F = "";
    private static int G = -1;
    private static int H = -1;
    private static int I = -1;
    private static int J = -1;
    private static String ae = "";

    /* renamed from: ai, reason: collision with root package name */
    private static int f4417ai = -999;
    private static int aj = -1;
    private static double ak = 0.0d;
    private static int am = -1;
    private static volatile String an = null;
    private static volatile String ao = null;
    private static final Object ap = new Object();
    private static final Object aq = new Object();

    private static void O() {
    }

    private static void P() {
    }

    private static int a(int i2) {
        if (i2 == 20) {
            return 16;
        }
        switch (i2) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 1;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 3;
            case 13:
                return 13;
            default:
                return -1;
        }
    }

    private m() {
    }

    public static void a(Context context) {
        try {
            d();
            m(context);
            i(context);
            h(context);
            f(context);
            a();
            b();
            d(context);
            f();
            e(context);
            c();
            I(context);
            C(context);
            D(context);
            E(context);
            F(context);
            if (q.a(Permission.READ_PHONE_STATE, context)) {
                String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                if (q.b(simOperator) && simOperator.length() > 3) {
                    E = simOperator.substring(0, 3);
                    F = simOperator.substring(3, simOperator.length());
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new com.anythink.core.common.c.a(j.t.f3700a, "hw_ver"));
            arrayList.add(new com.anythink.core.common.c.a(j.t.b, "hw_hms_ver"));
            arrayList.add(new com.anythink.core.common.c.a(j.t.h, "mi_global_ver"));
            com.anythink.core.common.c.b.a().a(arrayList);
            q();
            r();
            x(context);
            y(context);
            s();
            t();
            u();
            v();
            w();
            x();
            y();
            z();
            A();
            B();
            C();
            D();
            E();
            F();
        } catch (Exception unused) {
        }
    }

    public static String b(Context context) {
        if (com.anythink.core.common.d.t.b().c("mcc")) {
            return "";
        }
        if (context == null) {
            com.anythink.core.common.d.t.b().g();
        }
        try {
            return !com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b() ? "" : E;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String c(Context context) {
        if (com.anythink.core.common.d.t.b().c("mnc")) {
            return "";
        }
        if (context == null) {
            com.anythink.core.common.d.t.b().g();
        }
        try {
            return !com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b() ? "" : F;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String d(Context context) {
        if (com.anythink.core.common.d.t.b().c("android_id") || !com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b()) {
            return "";
        }
        if (f4418q != null) {
            return f4418q;
        }
        com.anythink.core.common.d.s c2 = com.anythink.core.common.d.t.b().c();
        if (c2 != null) {
            if (context == null) {
                context = com.anythink.core.common.d.t.b().g();
            }
            synchronized (r) {
                if (f4418q != null) {
                    return f4418q;
                }
                String c3 = af.c(context, u.b.f3741a, u.a.f, "");
                f4418q = c3;
                if (TextUtils.isEmpty(c3)) {
                    f4418q = c2.getAid(context);
                    new Object[]{f4418q};
                    if (!TextUtils.isEmpty(f4418q)) {
                        af.b(context, u.b.f3741a, u.a.f, f4418q);
                    }
                }
                if (f4418q == null) {
                    f4418q = "";
                }
            }
        }
        return f4418q;
    }

    private static String G(Context context) {
        String d2;
        if (context == null) {
            return "";
        }
        try {
            d2 = d(context);
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(d2)) {
            return "";
        }
        if (TextUtils.isEmpty(d)) {
            d = o.b(d2);
        }
        return d;
    }

    public static String a() {
        if (com.anythink.core.common.d.t.b().c("model")) {
            return "";
        }
        try {
            return !com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b() ? "" : Build.MODEL;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String b() {
        if (com.anythink.core.common.d.t.b().c("brand")) {
            return "";
        }
        try {
            return !com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b() ? "" : Build.BRAND;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String e(Context context) {
        if (com.anythink.core.common.d.t.b().c("language")) {
            return "";
        }
        if (context == null) {
            context = com.anythink.core.common.d.t.b().g();
        }
        try {
            if (!com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b()) {
                return "";
            }
            if (TextUtils.isEmpty(A)) {
                String language = context.getResources().getConfiguration().locale.getLanguage();
                A = language;
                return language;
            }
            return A;
        } catch (Exception unused) {
            return "";
        }
    }

    public static int f(Context context) {
        if (com.anythink.core.common.d.t.b().c("orient")) {
            return 0;
        }
        if (context == null) {
            context = com.anythink.core.common.d.t.b().g();
        }
        return context.getResources().getConfiguration().orientation == 2 ? 2 : 1;
    }

    public static boolean g(Context context) {
        return f(context) == 2;
    }

    public static String h(Context context) {
        if (com.anythink.core.common.d.t.b().c("app_vc")) {
            return "";
        }
        if (context == null) {
            context = com.anythink.core.common.d.t.b().g();
        }
        if (z == 0) {
            try {
                z = B(context).versionCode;
                return new StringBuilder().append(z).toString();
            } catch (Throwable unused) {
                return "";
            }
        }
        return new StringBuilder().append(z).toString();
    }

    public static String i(Context context) {
        if (com.anythink.core.common.d.t.b().c("app_vn")) {
            return "";
        }
        if (context == null) {
            context = com.anythink.core.common.d.t.b().g();
        }
        try {
            if (TextUtils.isEmpty(y)) {
                String str = B(context).versionName;
                y = str;
                return str;
            }
            return y;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int j(Context context) {
        if (context == null) {
            context = com.anythink.core.common.d.t.b().g();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int k(Context context) {
        if (context == null) {
            context = com.anythink.core.common.d.t.b().g();
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static String l(Context context) {
        if (com.anythink.core.common.d.t.b().c("screen")) {
            return "";
        }
        if (context == null) {
            context = com.anythink.core.common.d.t.b().g();
        }
        try {
            return !com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b() ? "" : j(context) + "*" + k(context);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String m(Context context) {
        if (com.anythink.core.common.d.t.b().c("package_name")) {
            return "";
        }
        if (context == null) {
            context = com.anythink.core.common.d.t.b().g();
        }
        try {
            if (TextUtils.isEmpty(x)) {
                String str = B(context).packageName;
                x = str;
                return str;
            }
            return x;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String n(Context context) {
        if (com.anythink.core.common.d.t.b().c("it_src")) {
            return "";
        }
        if (context == null) {
            context = com.anythink.core.common.d.t.b().g();
        }
        try {
            if (TextUtils.isEmpty(f4416a)) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(m(context));
                f4416a = installerPackageName;
                return installerPackageName;
            }
            return f4416a;
        } catch (Throwable unused) {
            return "";
        }
    }

    private static int H(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return -1;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || !q.a("android.permission.ACCESS_NETWORK_STATE", context) || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return -1;
            }
            if (activeNetworkInfo.getType() == 1) {
                return -2;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return -1;
            }
            return telephonyManager.getNetworkType();
        } catch (Throwable unused) {
        }
        return -1;
    }

    public static String o(Context context) {
        if (com.anythink.core.common.d.t.b().c("network_type")) {
            return "";
        }
        try {
            if (!com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b()) {
                return "";
            }
            if (context == null) {
                return "-1";
            }
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null) {
                    return "-1";
                }
                if (q.a("android.permission.ACCESS_NETWORK_STATE", context)) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null) {
                        return "-1";
                    }
                    int i2 = 1;
                    if (activeNetworkInfo.getType() == 1) {
                        return "-2";
                    }
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        if (telephonyManager == null) {
                            return "-3";
                        }
                        int networkType = telephonyManager.getNetworkType();
                        StringBuilder sb = new StringBuilder();
                        if (networkType != 20) {
                            switch (networkType) {
                                case 1:
                                case 2:
                                case 4:
                                case 7:
                                case 11:
                                    break;
                                case 3:
                                case 5:
                                case 6:
                                case 8:
                                case 9:
                                case 10:
                                case 12:
                                case 14:
                                case 15:
                                    i2 = 3;
                                    break;
                                case 13:
                                    i2 = 13;
                                    break;
                                default:
                                    i2 = -1;
                                    break;
                            }
                        } else {
                            i2 = 16;
                        }
                        return sb.append(i2).toString();
                    } catch (Throwable unused) {
                    }
                }
                return "-3";
            } catch (Throwable unused2) {
                return "-1";
            }
        } catch (Exception unused3) {
            return "";
        }
    }

    public static String c() {
        if (com.anythink.core.common.d.t.b().c("timezone")) {
            return "";
        }
        try {
            if (!com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b()) {
                return "";
            }
            try {
                if (TextUtils.isEmpty(B)) {
                    String displayName = TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
                    B = displayName;
                    return displayName;
                }
            } catch (Throwable unused) {
            }
            return B;
        } catch (Exception unused2) {
            return "";
        }
    }

    public static String d() {
        if (com.anythink.core.common.d.t.b().c("os_vc")) {
            return "";
        }
        try {
            if (!com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b()) {
                return "";
            }
            if (TextUtils.isEmpty(w)) {
                w = String.valueOf(Build.VERSION.SDK_INT);
            }
            return w;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String e() {
        if (com.anythink.core.common.d.t.b().c("os_vn")) {
            return "";
        }
        if (TextUtils.isEmpty(v)) {
            v = Build.VERSION.RELEASE;
        }
        return v;
    }

    private static int L() {
        return Build.VERSION.SDK_INT;
    }

    public static void a(String str) {
        h = str;
        af.b(com.anythink.core.common.d.t.b().g(), u.b.f3741a, u.a.d, h);
    }

    public static String f() {
        try {
            if (!com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b()) {
                return "";
            }
            if (h == null) {
                h = af.c(com.anythink.core.common.d.t.b().g(), u.b.f3741a, u.a.d, "");
            }
            return h;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String p(Context context) {
        synchronized (D) {
            String str = C;
            if (str == null) {
                com.anythink.core.common.d.t.b();
                try {
                    String str2 = context.getPackageManager().getPackageInfo("com.android.vending", 0).versionName;
                    C = str2;
                    if (str2 == null) {
                        C = "";
                    }
                    return C;
                } catch (Exception unused) {
                    C = "";
                    return "";
                }
            }
            if (str == null) {
                C = "";
            }
            return C;
        }
    }

    private static void I(Context context) {
        com.anythink.core.common.d.t.b();
        synchronized (D) {
            try {
                if (C == null) {
                    String str = context.getPackageManager().getPackageInfo("com.android.vending", 0).versionName;
                    C = str;
                    if (str == null) {
                        C = "";
                    }
                }
            } catch (Throwable unused) {
                C = "";
            }
        }
    }

    /* renamed from: com.anythink.core.common.v.m$1, reason: invalid class name */
    final class AnonymousClass1 implements h.a {
        AnonymousClass1() {
        }

        @Override // com.anythink.core.common.c.h.a
        public final void a(PackageInfo packageInfo) {
            synchronized (m.D) {
                if (packageInfo != null) {
                    String unused = m.C = packageInfo.versionName;
                }
            }
        }
    }

    public static String q(Context context) {
        if (TextUtils.isEmpty(b)) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            b = String.valueOf(displayMetrics.density);
        }
        return b;
    }

    public static JSONObject g() {
        try {
            return new JSONObject(j);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static void a(final int i2, final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.v.m.2
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (m.i) {
                    if (m.i.has(String.valueOf(i2))) {
                        return;
                    }
                    try {
                        m.i.put(String.valueOf(i2), str);
                        String unused = m.j = m.i.toString();
                    } catch (Throwable unused2) {
                    }
                }
            }
        }, 13);
    }

    public static String b(String str) {
        try {
            return i.getString(str);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static synchronized String h() {
        synchronized (m.class) {
            if (com.anythink.core.common.d.t.b().c("ua")) {
                return "";
            }
            try {
                if (!com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b()) {
                    return "";
                }
                String i2 = i();
                if (!TextUtils.isEmpty(i2)) {
                    return i2;
                }
                String str = Build.VERSION.RELEASE;
                String a2 = a();
                String str2 = Build.ID;
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(a2) && !TextUtils.isEmpty(str2)) {
                    return "Mozilla/5.0 (Linux; Android " + str + "; " + a2 + " Build/" + str2 + ") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
                }
                return "";
            } catch (Exception unused) {
                return "";
            }
        }
    }

    public static synchronized String i() {
        synchronized (m.class) {
            if (!TextUtils.isEmpty(s)) {
                return s;
            }
            if (s == null) {
                String c2 = af.c(com.anythink.core.common.d.t.b().g(), u.b.f3741a, u.a.f3740q, "");
                s = c2;
                if (!TextUtils.isEmpty(c2)) {
                    return s;
                }
            }
            return null;
        }
    }

    public static String j() {
        if (u != null) {
            return u;
        }
        if (com.anythink.core.common.d.t.b().c(com.anythink.core.common.m.e.bw)) {
            return "";
        }
        if (u == null) {
            synchronized (t) {
                if (u == null) {
                    try {
                        u = System.getProperty("http.agent");
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (u == null) {
            u = "";
        }
        return u;
    }

    public static void r(Context context) {
        try {
            s = WebSettings.getDefaultUserAgent(context);
            af.b(context, u.b.f3741a, u.a.f3740q, s);
            af.b(context, u.b.f3741a, u.a.r, Build.VERSION.RELEASE);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: com.anythink.core.common.v.m$3, reason: invalid class name */
    final class AnonymousClass3 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f4420a;

        AnonymousClass3(Context context) {
            this.f4420a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            WebView webView = new WebView(this.f4420a);
            p.a(webView);
            String unused = m.s = webView.getSettings().getUserAgentString();
        }
    }

    public static synchronized void s(Context context) {
        synchronized (m.class) {
            if (TextUtils.isEmpty(com.anythink.core.common.d.t.b().B())) {
                String str = "";
                com.anythink.core.common.d.s c2 = com.anythink.core.common.d.t.b().c();
                if (c2 != null) {
                    str = c2.getUniqueId(context);
                }
                if (TextUtils.isEmpty(str)) {
                    str = t(context);
                }
                if (TextUtils.isEmpty(str) || Pattern.matches("^[0-]+$", str)) {
                    str = o();
                }
                if (TextUtils.isEmpty(str)) {
                    str = d(context);
                }
                if (TextUtils.isEmpty(str)) {
                    str = UUID.randomUUID().toString();
                }
                com.anythink.core.common.d.t.b().l(o.a(str));
                com.anythink.core.common.u.e.a("", "3", "", String.valueOf(System.currentTimeMillis()));
            }
        }
    }

    public static synchronized String t(final Context context) {
        synchronized (m.class) {
            if (com.anythink.core.common.d.t.b().c("gaid")) {
                return "";
            }
            String f2 = f();
            if (!TextUtils.isEmpty(f2)) {
                return f2;
            }
            final ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
            final String[] strArr = new String[1];
            newFixedThreadPool.submit(new Runnable() { // from class: com.anythink.core.common.v.m.4
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        try {
                            Class<?> cls = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
                            Class<?> cls2 = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
                            strArr[0] = (String) cls2.getMethod("getId", new Class[0]).invoke(cls.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context), new Object[0]);
                        } catch (Exception unused) {
                        }
                    } catch (Throwable unused2) {
                        strArr[0] = new com.anythink.core.common.d.e().a(context).a();
                    }
                    if (!TextUtils.isEmpty(strArr[0]) && !m.i(strArr[0])) {
                        m.a(strArr[0]);
                    }
                    try {
                        synchronized (newFixedThreadPool) {
                            newFixedThreadPool.notifyAll();
                        }
                    } catch (Throwable unused3) {
                    }
                }
            });
            try {
                synchronized (newFixedThreadPool) {
                    newFixedThreadPool.wait(2000L);
                }
                newFixedThreadPool.shutdown();
                String str = strArr[0];
                return str != null ? str : "";
            } catch (Exception unused) {
                return "";
            }
        }
    }

    private static boolean j(String str) {
        return Pattern.matches("^[0-]+$", str);
    }

    public static String k() {
        if (!TextUtils.isEmpty(c)) {
            return c;
        }
        String O2 = com.anythink.core.common.d.t.b().O();
        if (!TextUtils.isEmpty(O2)) {
            c = O2;
            return O2;
        }
        String O3 = com.anythink.core.common.d.t.b().O();
        if (TextUtils.isEmpty(O3)) {
            try {
                Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
                O3 = "2";
            } catch (Throwable unused) {
                O3 = "1";
            }
            try {
                Class.forName("org.cocos2dx.lib.Cocos2dxActivity");
                Class.forName("org.cocos2dx.lib.Cocos2dxJavascriptJavaBridge");
                O3 = "4";
            } catch (Throwable unused2) {
            }
            try {
                Class.forName("com.facebook.react.ReactActivity");
                O3 = "5";
            } catch (Throwable unused3) {
            }
            try {
                Class.forName("io.flutter.embedding.android.FlutterActivity");
                O3 = "6";
            } catch (Throwable unused4) {
            }
        }
        c = O3;
        return O3;
    }

    public static int u(Context context) {
        if (G == -1) {
            G = q.a(context, "com.tencent.mm") ? 1 : 0;
        }
        return G;
    }

    public static int l() {
        if (H == -1) {
            try {
                Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory");
                Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram");
                H = 1;
            } catch (Throwable unused) {
                H = 0;
            }
        }
        return H;
    }

    public static String m() {
        Object obj;
        String d2 = com.anythink.core.common.d.t.b().d();
        if (!TextUtils.isEmpty(d2)) {
            return d2;
        }
        try {
            Map<String, Object> m2 = com.anythink.core.common.d.t.b().m();
            if (m2 != null && (obj = m2.get(ATAdConst.KEY.WECHAT_APPID)) != null) {
                return obj.toString();
            }
        } catch (Throwable unused) {
        }
        com.anythink.core.d.b b2 = com.anythink.core.d.d.a(com.anythink.core.common.d.t.b().g()).b(com.anythink.core.common.d.t.b().p());
        if (b2 != null) {
            return b2.aX();
        }
        return null;
    }

    public static int n() {
        int i2 = I;
        if (i2 != -1) {
            return i2;
        }
        I = 0;
        try {
            I = ((Integer) Class.forName("com.tencent.mm.opensdk.constants.Build").getField("SDK_INT").get(null)).intValue();
        } catch (Throwable unused) {
        }
        return I;
    }

    public static int c(String str) {
        int i2 = J;
        if (i2 != -1) {
            return i2;
        }
        J = 0;
        try {
            J = ((Integer) Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("getWXAppSupportAPI", new Class[0]).invoke(d(str), new Object[0])).intValue();
        } catch (Throwable unused) {
        }
        return J;
    }

    public static Object d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory").getMethod("createWXAPI", Context.class, String.class).invoke(null, com.anythink.core.common.d.t.b().g(), str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void M() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.anythink.core.common.c.a(j.t.f3700a, "hw_ver"));
        arrayList.add(new com.anythink.core.common.c.a(j.t.b, "hw_hms_ver"));
        arrayList.add(new com.anythink.core.common.c.a(j.t.h, "mi_global_ver"));
        com.anythink.core.common.c.b.a().a(arrayList);
    }

    public static String a(Context context, String str) {
        if (context == null) {
            context = com.anythink.core.common.d.t.b().g();
        }
        if (context != null) {
            try {
                return new StringBuilder().append(context.getPackageManager().getPackageInfo(str, 0).versionCode).toString();
            } catch (Throwable unused) {
                return "";
            }
        }
        return "";
    }

    public static PackageInfo b(Context context, String str) {
        if (context == null) {
            context = com.anythink.core.common.d.t.b().g();
        }
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String o() {
        if (com.anythink.core.common.d.t.b().c("amazon_id") || !com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b()) {
            return "";
        }
        if (k == null) {
            k = af.c(com.anythink.core.common.d.t.b().g(), u.b.f3741a, u.a.e, "");
        }
        if (TextUtils.isEmpty(k) && !l) {
            try {
                l = true;
                String string = Settings.Secure.getString(com.anythink.core.common.d.t.b().g().getContentResolver(), "advertising_id");
                k = string;
                if (!TextUtils.isEmpty(string)) {
                    af.b(com.anythink.core.common.d.t.b().g(), u.b.f3741a, u.a.e, k);
                } else {
                    k = "";
                }
            } catch (Throwable unused) {
            }
        }
        return k;
    }

    public static int p() {
        if (!com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b()) {
            return -1;
        }
        if (m <= 0 && !n) {
            int i2 = 1;
            try {
                n = true;
                if (Settings.Secure.getInt(com.anythink.core.common.d.t.b().g().getContentResolver(), CommonUrlParts.LIMIT_AD_TRACKING) != 0) {
                    i2 = 2;
                }
                m = i2;
            } catch (Throwable unused) {
                m = -1;
            }
        }
        return m;
    }

    public static String q() {
        if (k("cpu")) {
            return "";
        }
        if (K == null) {
            synchronized (v.class) {
                if (K == null) {
                    K = v.b();
                }
            }
        }
        return K;
    }

    public static String r() {
        if (k("isroot")) {
            return "";
        }
        if (L == null) {
            synchronized (v.class) {
                if (L == null) {
                    L = v.a();
                }
            }
        }
        return L;
    }

    public static String v(Context context) {
        if (k("isagent")) {
            return "";
        }
        return v.a(context);
    }

    public static String w(Context context) {
        if (J(context)) {
            return "";
        }
        return v.c(context);
    }

    public static String x(Context context) {
        if (M == null) {
            synchronized (v.class) {
                if (M == null) {
                    M = v.d(context);
                }
            }
        }
        return M;
    }

    public static String y(Context context) {
        if (N == null) {
            synchronized (v.class) {
                if (N == null) {
                    N = v.e(context);
                }
            }
        }
        return N;
    }

    public static String z(Context context) {
        return v.b(context);
    }

    public static String A(Context context) {
        if (k("battery")) {
            return "";
        }
        return v.f(context);
    }

    public static String s() {
        if (k(com.anythink.core.common.m.e.aO)) {
            return "";
        }
        if (O == null) {
            O = q.a() ? "1" : "0";
        }
        return O;
    }

    public static String t() {
        if (N()) {
            return "";
        }
        if (P == null) {
            try {
                P = Build.TYPE;
            } catch (Throwable unused) {
            }
        }
        String str = P;
        if (str == null) {
            P = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return P;
    }

    public static String u() {
        if (N()) {
            return "";
        }
        if (TextUtils.isEmpty(Q)) {
            try {
                Q = Build.TAGS;
            } catch (Throwable unused) {
            }
        }
        String str = Q;
        if (str == null) {
            Q = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return Q;
    }

    public static String v() {
        if (N()) {
            return "";
        }
        if (R == null) {
            try {
                R = Build.USER;
            } catch (Throwable unused) {
                R = "";
            }
        }
        String str = R;
        if (str == null) {
            R = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return R;
    }

    public static String w() {
        if (N()) {
            return "";
        }
        if (S == null) {
            try {
                S = Build.RADIO;
            } catch (Throwable unused) {
                S = "";
            }
        }
        String str = S;
        if (str == null) {
            S = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return S;
    }

    public static String x() {
        if (N()) {
            return "";
        }
        if (T == null) {
            try {
                T = Build.BOOTLOADER;
            } catch (Throwable unused) {
                T = "";
            }
        }
        String str = T;
        if (str == null) {
            T = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return T;
    }

    public static String y() {
        if (N()) {
            return "";
        }
        if (U == null) {
            try {
                U = Build.HARDWARE;
            } catch (Throwable unused) {
                U = "";
            }
        }
        String str = U;
        if (str == null) {
            U = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return U;
    }

    public static String z() {
        if (N()) {
            return "";
        }
        if (V == null) {
            try {
                V = Build.HOST;
            } catch (Throwable unused) {
                V = "";
            }
        }
        String str = V;
        if (str == null) {
            V = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return V;
    }

    public static String A() {
        if (N()) {
            return "";
        }
        if (W == null) {
            try {
                W = Build.VERSION.CODENAME;
            } catch (Throwable unused) {
                W = "";
            }
        }
        String str = W;
        if (str == null) {
            W = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return W;
    }

    public static String B() {
        if (N()) {
            return "";
        }
        if (X == null) {
            try {
                X = Build.VERSION.INCREMENTAL;
            } catch (Throwable unused) {
                X = "";
            }
        }
        String str = X;
        if (str == null) {
            X = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return X;
    }

    public static String C() {
        if (N()) {
            return "";
        }
        if (Y == null) {
            try {
                Y = Build.SERIAL;
            } catch (Throwable unused) {
                Y = "";
            }
        }
        String str = Y;
        if (str == null) {
            Y = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return Y;
    }

    public static String D() {
        if (N()) {
            return "";
        }
        if (Z == null) {
            try {
                Z = Build.DISPLAY;
            } catch (Throwable unused) {
                Z = "";
            }
        }
        String str = Z;
        if (str == null) {
            Z = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return Z;
    }

    public static String E() {
        if (N()) {
            return "";
        }
        if (aa == null) {
            try {
                aa = "1";
            } catch (Throwable unused) {
                aa = "";
            }
        }
        return aa;
    }

    public static String F() {
        if (N()) {
            return "";
        }
        if (ab == null) {
            try {
                ab = Build.BOARD;
            } catch (Throwable unused) {
                ab = "";
            }
        }
        String str = ab;
        if (str == null) {
            ab = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return ab;
    }

    private static boolean k(String str) {
        return com.anythink.core.common.d.t.b().c(str) || !com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b();
    }

    private static boolean N() {
        Context g2 = com.anythink.core.common.d.t.b().g();
        return !com.anythink.core.common.d.v.a(g2).b() || J(g2) || com.anythink.core.common.d.t.b().c("device_minor_data_deny");
    }

    private static boolean J(Context context) {
        return !com.anythink.core.d.d.a(context).b(com.anythink.core.common.d.t.b().p()).aB();
    }

    public static String G() {
        return o;
    }

    public static void e(String str) {
        o = str;
    }

    public static PackageInfo B(Context context) {
        if (p == null) {
            try {
                p = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (Throwable unused) {
            }
        }
        return p;
    }

    private static PackageInfo K(Context context) {
        if (ah == null) {
            try {
                ah = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            } catch (Throwable unused) {
            }
        }
        return ah;
    }

    public static String c(Context context, String str) {
        Signature signature;
        if (com.anythink.core.common.d.t.b().c(str)) {
            return "";
        }
        if (!TextUtils.isEmpty(af)) {
            return af;
        }
        try {
            PackageInfo K2 = K(context);
            if (K2 != null && K2.signatures != null && K2.signatures.length > 0 && (signature = K2.signatures[0]) != null) {
                byte[] digest = MessageDigest.getInstance(k.b("U0hBMQ==")).digest(signature.toByteArray());
                StringBuilder sb = new StringBuilder();
                for (byte b2 : digest) {
                    sb.append(Integer.toHexString((b2 & 255) | 256).substring(1, 3).toUpperCase());
                    sb.append(":");
                }
                String substring = sb.substring(0, sb.length() - 1);
                af = substring;
                return substring;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return "";
    }

    public static String d(Context context, String str) {
        Signature signature;
        if (com.anythink.core.common.d.t.b().c(str)) {
            return "";
        }
        if (!TextUtils.isEmpty(ag)) {
            return ag;
        }
        try {
            PackageInfo K2 = K(context);
            if (K2 != null && K2.signatures != null && K2.signatures.length > 0 && (signature = K2.signatures[0]) != null) {
                byte[] digest = MessageDigest.getInstance(k.b("TUQ1")).digest(signature.toByteArray());
                StringBuilder sb = new StringBuilder();
                for (byte b2 : digest) {
                    sb.append(Integer.toHexString((b2 & 255) | 256).substring(1, 3).toUpperCase());
                    sb.append(":");
                }
                String substring = sb.substring(0, sb.length() - 1);
                ag = substring;
                return substring;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return "";
    }

    public static int C(Context context) {
        try {
        } catch (Throwable unused) {
            f4417ai = -1;
        }
        if (!k("s_c") && !J(context)) {
            int i2 = f4417ai;
            if (i2 != -999) {
                return i2;
            }
            if (q.a(Permission.READ_PHONE_STATE, context)) {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    if (telephonyManager.getSimState() == 5) {
                        f4417ai = 2;
                    } else if (telephonyManager.getSimState() == 1) {
                        f4417ai = 1;
                    } else {
                        f4417ai = -1;
                    }
                } else {
                    f4417ai = -1;
                }
            } else {
                f4417ai = -1;
            }
            return f4417ai;
        }
        return -1;
    }

    public static int D(Context context) {
        if (com.anythink.core.common.d.t.b().c("u_a")) {
            return -1;
        }
        int i2 = f4417ai;
        if (i2 != -1) {
            return i2;
        }
        if (Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0) == 1) {
            aj = 2;
        } else {
            aj = 1;
        }
        return aj;
    }

    public static double E(Context context) {
        if (k("battery")) {
            return 0.0d;
        }
        double d2 = ak;
        if (d2 != 0.0d) {
            return d2;
        }
        if (al == null) {
            al = (BatteryManager) context.getSystemService("batterymanager");
        }
        if (al != null) {
            double intProperty = r5.getIntProperty(4) / 100.0d;
            ak = intProperty;
            return intProperty;
        }
        return ak;
    }

    public static int F(Context context) {
        if (com.anythink.core.common.d.t.b().c("d_s")) {
            return -1;
        }
        int i2 = am;
        if (i2 != -1) {
            return i2;
        }
        if (Settings.Secure.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
            am = 2;
        } else {
            am = 1;
        }
        return am;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00aa, code lost:
    
        if (com.anythink.core.common.v.m.an == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ba, code lost:
    
        return com.anythink.core.common.v.m.an;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b4, code lost:
    
        com.anythink.core.common.v.m.an = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (com.anythink.core.common.v.m.an == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b2, code lost:
    
        if (com.anythink.core.common.v.m.an != null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String H() {
        /*
            com.anythink.core.common.d.t r0 = com.anythink.core.common.d.t.b()     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = "ip_v4"
            boolean r0 = r0.c(r1)     // Catch: java.lang.Throwable -> Lb0
            if (r0 == 0) goto L17
            java.lang.String r0 = ""
            java.lang.String r1 = com.anythink.core.common.v.m.an
            if (r1 != 0) goto L16
        L12:
            java.lang.String r1 = ""
            com.anythink.core.common.v.m.an = r1
        L16:
            return r0
        L17:
            java.lang.String r0 = com.anythink.core.common.v.m.an     // Catch: java.lang.Throwable -> Lb0
            if (r0 == 0) goto L23
            java.lang.String r0 = com.anythink.core.common.v.m.an     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = com.anythink.core.common.v.m.an
            if (r1 != 0) goto L22
            goto L12
        L22:
            return r0
        L23:
            boolean r0 = com.anythink.core.api.ATSDKGlobalSetting.enableGetDeviceInfoInBg     // Catch: java.lang.Throwable -> Lb0
            if (r0 != 0) goto L40
            com.anythink.core.common.d.t.b()     // Catch: java.lang.Throwable -> Lb0
            com.anythink.core.common.d.t r0 = com.anythink.core.common.d.t.b()     // Catch: java.lang.Throwable -> Lb0
            android.content.Context r0 = r0.g()     // Catch: java.lang.Throwable -> Lb0
            boolean r0 = com.anythink.core.common.d.t.c(r0)     // Catch: java.lang.Throwable -> Lb0
            if (r0 != 0) goto L40
            java.lang.String r0 = com.anythink.core.common.v.m.an     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = com.anythink.core.common.v.m.an
            if (r1 != 0) goto L3f
            goto L12
        L3f:
            return r0
        L40:
            java.lang.Object r0 = com.anythink.core.common.v.m.ap     // Catch: java.lang.Throwable -> Lb0
            monitor-enter(r0)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = com.anythink.core.common.v.m.an     // Catch: java.lang.Throwable -> Lad
            if (r1 == 0) goto L53
            java.lang.String r1 = com.anythink.core.common.v.m.an     // Catch: java.lang.Throwable -> Lad
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = com.anythink.core.common.v.m.an
            if (r0 != 0) goto L52
            java.lang.String r0 = ""
            com.anythink.core.common.v.m.an = r0
        L52:
            return r1
        L53:
            java.util.Enumeration r1 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.lang.Throwable -> Lad
            java.util.ArrayList r1 = java.util.Collections.list(r1)     // Catch: java.lang.Throwable -> Lad
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lad
        L5f:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Lad
            if (r2 == 0) goto L9a
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Lad
            java.net.NetworkInterface r2 = (java.net.NetworkInterface) r2     // Catch: java.lang.Throwable -> Lad
            java.util.Enumeration r2 = r2.getInetAddresses()     // Catch: java.lang.Throwable -> Lad
            java.util.ArrayList r2 = java.util.Collections.list(r2)     // Catch: java.lang.Throwable -> Lad
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lad
        L77:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Lad
            if (r3 == 0) goto L5f
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Lad
            java.net.InetAddress r3 = (java.net.InetAddress) r3     // Catch: java.lang.Throwable -> Lad
            boolean r4 = r3.isLoopbackAddress()     // Catch: java.lang.Throwable -> Lad
            if (r4 != 0) goto L77
            boolean r4 = r3 instanceof java.net.Inet4Address     // Catch: java.lang.Throwable -> Lad
            if (r4 == 0) goto L77
            java.lang.String r3 = r3.getHostAddress()     // Catch: java.lang.Throwable -> Lad
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> Lad
            if (r4 != 0) goto L77
            com.anythink.core.common.v.m.an = r3     // Catch: java.lang.Throwable -> Lad
            goto L77
        L9a:
            java.lang.String r1 = com.anythink.core.common.v.m.an     // Catch: java.lang.Throwable -> Lad
            new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> Lad
            java.lang.String r1 = com.anythink.core.common.v.m.an     // Catch: java.lang.Throwable -> Lad
            if (r1 != 0) goto La7
            java.lang.String r1 = ""
            com.anythink.core.common.v.m.an = r1     // Catch: java.lang.Throwable -> Lad
        La7:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = com.anythink.core.common.v.m.an
            if (r0 != 0) goto Lb8
            goto Lb4
        Lad:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb0
            throw r1     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            java.lang.String r0 = com.anythink.core.common.v.m.an
            if (r0 != 0) goto Lb8
        Lb4:
            java.lang.String r0 = ""
            com.anythink.core.common.v.m.an = r0
        Lb8:
            java.lang.String r0 = com.anythink.core.common.v.m.an
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.v.m.H():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00aa, code lost:
    
        if (com.anythink.core.common.v.m.ao == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ba, code lost:
    
        return com.anythink.core.common.v.m.ao;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b4, code lost:
    
        com.anythink.core.common.v.m.ao = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (com.anythink.core.common.v.m.ao == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b2, code lost:
    
        if (com.anythink.core.common.v.m.ao != null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String I() {
        /*
            com.anythink.core.common.d.t r0 = com.anythink.core.common.d.t.b()     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = "ip_v6"
            boolean r0 = r0.c(r1)     // Catch: java.lang.Throwable -> Lb0
            if (r0 == 0) goto L17
            java.lang.String r0 = ""
            java.lang.String r1 = com.anythink.core.common.v.m.ao
            if (r1 != 0) goto L16
        L12:
            java.lang.String r1 = ""
            com.anythink.core.common.v.m.ao = r1
        L16:
            return r0
        L17:
            java.lang.String r0 = com.anythink.core.common.v.m.ao     // Catch: java.lang.Throwable -> Lb0
            if (r0 == 0) goto L23
            java.lang.String r0 = com.anythink.core.common.v.m.ao     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = com.anythink.core.common.v.m.ao
            if (r1 != 0) goto L22
            goto L12
        L22:
            return r0
        L23:
            boolean r0 = com.anythink.core.api.ATSDKGlobalSetting.enableGetDeviceInfoInBg     // Catch: java.lang.Throwable -> Lb0
            if (r0 != 0) goto L40
            com.anythink.core.common.d.t.b()     // Catch: java.lang.Throwable -> Lb0
            com.anythink.core.common.d.t r0 = com.anythink.core.common.d.t.b()     // Catch: java.lang.Throwable -> Lb0
            android.content.Context r0 = r0.g()     // Catch: java.lang.Throwable -> Lb0
            boolean r0 = com.anythink.core.common.d.t.c(r0)     // Catch: java.lang.Throwable -> Lb0
            if (r0 != 0) goto L40
            java.lang.String r0 = com.anythink.core.common.v.m.ao     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = com.anythink.core.common.v.m.ao
            if (r1 != 0) goto L3f
            goto L12
        L3f:
            return r0
        L40:
            java.lang.Object r0 = com.anythink.core.common.v.m.aq     // Catch: java.lang.Throwable -> Lb0
            monitor-enter(r0)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = com.anythink.core.common.v.m.ao     // Catch: java.lang.Throwable -> Lad
            if (r1 == 0) goto L53
            java.lang.String r1 = com.anythink.core.common.v.m.ao     // Catch: java.lang.Throwable -> Lad
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = com.anythink.core.common.v.m.ao
            if (r0 != 0) goto L52
            java.lang.String r0 = ""
            com.anythink.core.common.v.m.ao = r0
        L52:
            return r1
        L53:
            java.util.Enumeration r1 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.lang.Throwable -> Lad
            java.util.ArrayList r1 = java.util.Collections.list(r1)     // Catch: java.lang.Throwable -> Lad
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lad
        L5f:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Lad
            if (r2 == 0) goto L9a
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Lad
            java.net.NetworkInterface r2 = (java.net.NetworkInterface) r2     // Catch: java.lang.Throwable -> Lad
            java.util.Enumeration r2 = r2.getInetAddresses()     // Catch: java.lang.Throwable -> Lad
            java.util.ArrayList r2 = java.util.Collections.list(r2)     // Catch: java.lang.Throwable -> Lad
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lad
        L77:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Lad
            if (r3 == 0) goto L5f
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Lad
            java.net.InetAddress r3 = (java.net.InetAddress) r3     // Catch: java.lang.Throwable -> Lad
            boolean r4 = r3.isLoopbackAddress()     // Catch: java.lang.Throwable -> Lad
            if (r4 != 0) goto L77
            boolean r4 = r3 instanceof java.net.Inet6Address     // Catch: java.lang.Throwable -> Lad
            if (r4 == 0) goto L77
            java.lang.String r3 = r3.getHostAddress()     // Catch: java.lang.Throwable -> Lad
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> Lad
            if (r4 != 0) goto L77
            com.anythink.core.common.v.m.ao = r3     // Catch: java.lang.Throwable -> Lad
            goto L77
        L9a:
            java.lang.String r1 = com.anythink.core.common.v.m.ao     // Catch: java.lang.Throwable -> Lad
            new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> Lad
            java.lang.String r1 = com.anythink.core.common.v.m.ao     // Catch: java.lang.Throwable -> Lad
            if (r1 != 0) goto La7
            java.lang.String r1 = ""
            com.anythink.core.common.v.m.ao = r1     // Catch: java.lang.Throwable -> Lad
        La7:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = com.anythink.core.common.v.m.ao
            if (r0 != 0) goto Lb8
            goto Lb4
        Lad:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb0
            throw r1     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            java.lang.String r0 = com.anythink.core.common.v.m.ao
            if (r0 != 0) goto Lb8
        Lb4:
            java.lang.String r0 = ""
            com.anythink.core.common.v.m.ao = r0
        Lb8:
            java.lang.String r0 = com.anythink.core.common.v.m.ao
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.v.m.I():java.lang.String");
    }

    static /* synthetic */ boolean i(String str) {
        return Pattern.matches("^[0-]+$", str);
    }
}
