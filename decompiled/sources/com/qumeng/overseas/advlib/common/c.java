package com.qumeng.overseas.advlib.common;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Log;
import com.autonavi.aps.amapapi.AMapLocationStaticsEntity;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.a0;
import com.umeng.analytics.pro.ak;
import com.xiaomi.mipush.sdk.Constants;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* loaded from: classes17.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13259a = "https://logrcv.adseyeservice.com/trace";
    public static final String b = "https://logrcv.adseyeservice.com/trace";
    public static String d = "";
    private static long f = 0;
    public static int g = -1;
    private static long h = 0;
    public static long i = 0;
    private static int j = -1;
    private static String k = "";
    private static Handler m;
    private static StringBuilder e = new StringBuilder();
    public static String c = "";
    private static final HandlerThread l = new HandlerThread("cpc/sdk-remote-" + c);

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13260a;

        a(String str) {
            this.f13260a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                c.a(this.f13260a);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static Handler a() {
        if (m == null) {
            synchronized (c.class) {
                if (m == null) {
                    HandlerThread handlerThread = l;
                    handlerThread.start();
                    m = new Handler(handlerThread.getLooper());
                }
            }
        }
        return m;
    }

    public static void b(Context context, int i2) {
        g = i2;
        long currentTimeMillis = System.currentTimeMillis();
        i = currentTimeMillis;
        long j2 = h;
        long j3 = j2 > 0 ? currentTimeMillis - j2 : -1L;
        if (context == null || !b()) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("op1", "REPORT_TYPE");
        hashMap.put("opt_gap", j3 + "");
        hashMap.put("opt_loadId", h + "");
        hashMap.put("opt_isNormalStart", g + "");
        b(context, "LoadSdk", hashMap);
    }

    public static void c(Context context, String str, Map<String, String> map) {
        a(context, "https://logrcv.adseyeservice.com/trace", str, map);
    }

    public static void a(Runnable runnable) {
        Handler a2 = a();
        if (a2 != null) {
            a2.post(runnable);
        }
    }

    public static void a(Runnable runnable, long j2) {
        Handler a2 = a();
        if (a2 != null) {
            a2.postDelayed(runnable, j2);
        }
    }

    public static void a(Context context, String str, String str2, String str3, String str4) {
        if (context != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("op1", "CHECK_UPDATE");
            hashMap.put("opt_reqbody", str);
            hashMap.put("opt_respbody", str2);
            hashMap.put("opt_action", str3);
            hashMap.put("opt_md5", str4 + "");
            b(context, "LoadSdk", hashMap);
        }
    }

    public static void b(Context context, String str, Map<String, String> map) {
        a(context, "https://logrcv.adseyeservice.com/trace", str, map);
    }

    public static boolean b() {
        if (j == -1) {
            j = new Random().nextInt(10);
        }
        return j == 1;
    }

    public static void b(String str) {
        k = str;
    }

    public static void a(Context context, String str, String str2, long j2) {
        try {
            if (b()) {
                HashMap hashMap = new HashMap();
                hashMap.put("op1", str);
                hashMap.put("opt_download", "sdk");
                hashMap.put("opt_url", str2 + "");
                if (j2 > 0) {
                    hashMap.put("opt_block_time", j2 + "");
                }
                b(context, "Download", hashMap);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context) {
        if (context == null || !b()) {
            return;
        }
        h = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("op1", "START");
        hashMap.put("opt_loadId", h + "");
        hashMap.put("opt_isNormalStart", g + "");
        b(context, "LoadSdk", hashMap);
    }

    public static void a(Context context, String str) {
        if (context == null || !b()) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("op1", "LOAD_ERROR");
        hashMap.put("opt_error", str);
        try {
            hashMap.put("opt_process", e.c(context));
        } catch (Throwable unused) {
        }
        b(context, "LoadSdk", hashMap);
    }

    public static void a(Context context, boolean z, boolean z2, boolean z3, long j2, long j3, Map map) {
        if (context == null || !b()) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("op1", "SUCCESS");
        hashMap.put("opt_isRemote", (z ? 1 : 0) + "");
        hashMap.put("opt_unzip", (z2 ? 1 : 0) + "");
        hashMap.put("opt_checkonline", (z3 ? 1 : 0) + "");
        hashMap.put("opt_checkTime", j3 + "");
        hashMap.put("opt_loadId", h + "");
        hashMap.put("opt_loadTime", (System.currentTimeMillis() - j2) + "");
        hashMap.put("opt_gap", (i > 0 ? System.currentTimeMillis() - i : -1L) + "");
        hashMap.put("opt_isNormalStart", g + "");
        if (map != null && map.size() > 0) {
            hashMap.putAll(map);
        }
        b(context, "LoadSdk", hashMap);
    }

    public static void a(Context context, long j2) {
        HashMap hashMap = new HashMap();
        hashMap.put("op1", "SUCCESS");
        hashMap.put("opt_loadTime", String.valueOf(j2));
        b(context, com.qumeng.overseas.advlib.trdparty.unionset.utils.e.p, hashMap);
    }

    public static void a(Context context, long j2, Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("op1", AMapLocationStaticsEntity.FAIL_STATUS);
        hashMap.put("opt_loadTime", String.valueOf(j2));
        if (th != null) {
            hashMap.put("opt_err_msg", th.getMessage());
        }
        b(context, com.qumeng.overseas.advlib.trdparty.unionset.utils.e.p, hashMap);
    }

    public static void a(Context context, int i2) {
        if (context == null || !b()) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("op1", "Loading");
        hashMap.put("opt_loadId", h + "");
        hashMap.put("opt_step", i2 + "");
        e.append(i2 + Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        hashMap.put("opt_path", e.toString());
        long currentTimeMillis = f != 0 ? System.currentTimeMillis() - f : 0L;
        f = System.currentTimeMillis();
        hashMap.put("opt_loadTime", currentTimeMillis + "");
        b(context, "LoadSdk", hashMap);
        Log.i("reportLoadsdkLoading", "step = " + i2 + " , time = " + currentTimeMillis);
    }

    public static void a(Context context, boolean z, boolean z2, boolean z3, String str, long j2, Map map) {
        if (context != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("op1", AMapLocationStaticsEntity.FAIL_STATUS);
            hashMap.put("opt_isRemote", (z ? 1 : 0) + "");
            hashMap.put("opt_unzip", (z2 ? 1 : 0) + "");
            hashMap.put("opt_checkonline", (z3 ? 1 : 0) + "");
            hashMap.put("opt_checkTime", j2 + "");
            hashMap.put("opt_cause", str);
            hashMap.put("opt_loadId", h + "");
            hashMap.put("opt_gap", (i > 0 ? System.currentTimeMillis() - i : -1L) + "");
            hashMap.put("opt_isNormalStart", g + "");
            hashMap.put("opt_lyr", a0.d);
            if (map != null && map.size() > 0) {
                hashMap.putAll(map);
            }
            b(context, "LoadSdk", hashMap);
        }
    }

    private static void a(Context context, String str, String str2, Map<String, String> map) {
        a aVar = new a(a(str, (Map<String, String>) a(context, str2, map)));
        Handler a2 = a();
        if (a2 != null) {
            a2.post(aVar);
        }
    }

    private static String a(String str, Map<String, String> map) {
        return str + e.a(map);
    }

    private static Map a(Context context, String str, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("os", "Android");
        hashMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
        hashMap.put("opt_bootstrap_v", c);
        hashMap.put("opt_lib_v", d);
        hashMap.put(ak.aH, str + "");
        hashMap.put("opt_overseas", "1");
        if (context != null) {
            hashMap.put("opt_app_pkgid", context.getPackageName());
            hashMap.put("opt_app_vn", e.b(context));
            hashMap.put("opt_app_vc", e.a(context) + "");
        }
        hashMap.put("opt_os_version", Build.VERSION.RELEASE + "");
        if (!TextUtils.isEmpty(k)) {
            hashMap.put("opt_gaid", k);
        }
        if (map != null) {
            try {
                Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    String key = it.next().getKey();
                    hashMap.put(key, map.get(key));
                }
            } catch (Throwable unused) {
            }
        }
        try {
            String str2 = Build.BRAND;
            if (str2 != null) {
                hashMap.put("opt_brand", str2);
            }
            String str3 = Build.MODEL;
            if (str3 != null) {
                hashMap.put("opt_model", str3);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return hashMap;
    }

    public static void a(String str) throws Throwable {
        if (str == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            URLConnection openConnection = new URL(str).openConnection();
            try {
                openConnection.connect();
                int responseCode = ((HttpURLConnection) openConnection).getResponseCode();
                if (responseCode != 200) {
                    Log.e("NetUtils", "ERROR " + String.valueOf(responseCode) + " on url \"" + str + "\"");
                }
            } finally {
                try {
                    ((HttpURLConnection) openConnection).disconnect();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
