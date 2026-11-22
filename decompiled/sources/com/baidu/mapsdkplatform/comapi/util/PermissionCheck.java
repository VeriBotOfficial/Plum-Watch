package com.baidu.mapsdkplatform.comapi.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.baidu.lbsapi.auth.LBSAuthManager;
import com.baidu.lbsapi.auth.LBSAuthManagerListener;
import com.baidu.mapapi.CommonInfo;
import com.baidu.mapapi.RequestAuthResultListener;
import com.baidu.mapsdkplatform.comapi.Initializer;
import com.baidu.platform.comapi.map.MapBundleKey;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class PermissionCheck {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8395a = "PermissionCheck";
    private static Context b;
    private static String c;
    private static Hashtable<String, String> d;
    private static LBSAuthManager e;
    private static LBSAuthManagerListener f;
    private static d g;
    private static final Set<RequestAuthResultListener> h = new HashSet();
    private static final Object i = new Object();
    private static int j = 601;
    public static int k = 200;
    public static int l = 202;
    public static int m = 252;
    public static int n = -11;
    public static int o = -10;

    private static class b implements LBSAuthManagerListener {
        private b() {
        }

        @Override // com.baidu.lbsapi.auth.LBSAuthManagerListener
        public void onAuthResult(int i, String str) {
            if (str == null) {
                Log.e(PermissionCheck.f8395a, "The result is null");
                Log.d(PermissionCheck.f8395a, "onAuthResult try permissionCheck result is: " + PermissionCheck.permissionCheck());
                synchronized (PermissionCheck.i) {
                    for (RequestAuthResultListener requestAuthResultListener : PermissionCheck.h) {
                        if (requestAuthResultListener != null) {
                            requestAuthResultListener.onAuthResult(2, RequestAuthResultListener.MESSAGE_AUTH_RESULT_NULL);
                        }
                    }
                }
                return;
            }
            c cVar = new c();
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("status")) {
                    cVar.f8396a = jSONObject.optInt("status");
                }
                if (jSONObject.has("appid")) {
                    cVar.c = jSONObject.optString("appid");
                }
                if (jSONObject.has("uid")) {
                    cVar.b = jSONObject.optString("uid");
                }
                if (jSONObject.has("message")) {
                    cVar.d = jSONObject.optString("message");
                }
                if (jSONObject.has("token")) {
                    cVar.e = jSONObject.optString("token");
                }
                if (jSONObject.has("ak_permission")) {
                    cVar.f = jSONObject.optInt("ak_permission");
                }
                if (jSONObject.has("user_permission")) {
                    cVar.g = jSONObject.optInt("user_permission");
                }
                if (jSONObject.has("ap")) {
                    cVar.h = jSONObject.optLong("ap");
                }
                if (jSONObject.has(MapBundleKey.OfflineMapKey.OFFLINE_UPDATE)) {
                    cVar.i = jSONObject.optLong(MapBundleKey.OfflineMapKey.OFFLINE_UPDATE);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            int unused = PermissionCheck.j = cVar.f8396a;
            if (PermissionCheck.g != null) {
                PermissionCheck.g.a(cVar);
            }
            synchronized (PermissionCheck.i) {
                for (RequestAuthResultListener requestAuthResultListener2 : PermissionCheck.h) {
                    if (requestAuthResultListener2 != null) {
                        requestAuthResultListener2.onAuthResult(cVar.f8396a, cVar.d);
                    }
                }
            }
        }
    }

    public interface d {
        void a(c cVar);
    }

    public static void addRequestAuthResultListener(RequestAuthResultListener requestAuthResultListener) {
        synchronized (i) {
            if (requestAuthResultListener != null) {
                h.add(requestAuthResultListener);
            }
        }
    }

    public static void destory() {
        g = null;
        b = null;
        f = null;
    }

    public static String getApiKey() {
        return c;
    }

    public static int getPermissionResult() {
        return j;
    }

    public static void init(Context context) {
        ApplicationInfo applicationInfo;
        String str;
        b = context;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(b.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            applicationInfo = null;
        }
        if (applicationInfo != null && TextUtils.isEmpty(c)) {
            c = applicationInfo.metaData.getString("com.baidu.lbsapi.API_KEY");
        }
        if (d == null) {
            d = new Hashtable<>();
        }
        if (e == null) {
            e = LBSAuthManager.getInstance(b);
        }
        if (f == null) {
            f = new b();
        }
        try {
            str = context.getPackageManager().getPackageInfo(b.getPackageName(), 0).applicationInfo.loadLabel(b.getPackageManager()).toString();
        } catch (Exception e3) {
            e3.printStackTrace();
            str = "";
        }
        try {
            JSONObject jSONObject = new JSONObject(g.s());
            d.put("mb", jSONObject.optString("mb"));
            d.put("os", jSONObject.optString("os"));
            d.put("sv", jSONObject.optString("sv"));
            d.put("imt", "1");
            d.put("net", jSONObject.optString("net"));
            d.put("cpu", jSONObject.optString("cpu"));
            d.put("glr", jSONObject.optString("glr"));
            d.put("glv", jSONObject.optString("glv"));
            d.put("resid", jSONObject.optString("resid"));
            d.put("appid", "-1");
            d.put("ver", "1");
            d.put("screen", String.format("(%d,%d)", Integer.valueOf(jSONObject.optInt("screen_x")), Integer.valueOf(jSONObject.optInt("screen_y"))));
            d.put("dpi", String.format("(%d,%d)", Integer.valueOf(jSONObject.optInt("dpi_x")), Integer.valueOf(jSONObject.optInt("dpi_y"))));
            d.put("pcn", jSONObject.optString("pcn"));
            d.put("cuid", jSONObject.optString("cuid"));
            d.put("name", str);
        } catch (Exception unused) {
        }
    }

    public static synchronized int permissionCheck() {
        synchronized (PermissionCheck.class) {
            LBSAuthManager lBSAuthManager = e;
            if (lBSAuthManager != null && f != null && b != null) {
                lBSAuthManager.setKey(c);
                CommonInfo commonInfo = Initializer.getCommonInfo();
                if (commonInfo != null) {
                    String androidID = commonInfo.getAndroidID();
                    if (!TextUtils.isEmpty(androidID)) {
                        e.setAndroidId(androidID);
                    }
                }
                int authenticate = e.authenticate(false, "lbs_androidsdk", d, f);
                if (authenticate != 0) {
                    Log.e(f8395a, "permission check result is: " + authenticate);
                }
                return authenticate;
            }
            Log.e(f8395a, "The authManager is: " + e + "; the authCallback is: " + f + "; the mContext is: " + b);
            return 0;
        }
    }

    public static void removeRequestAuthResultListener(RequestAuthResultListener requestAuthResultListener) {
        synchronized (i) {
            if (requestAuthResultListener != null) {
                h.remove(requestAuthResultListener);
            }
        }
    }

    public static void setApiKey(String str) {
        if (str == null || str.trim().length() <= 0) {
            return;
        }
        c = str;
    }

    public static void setPermissionCheckResultListener(d dVar) {
        g = dVar;
    }

    public static void setPrivacyMode(boolean z) {
        if (z) {
            permissionCheck();
        } else {
            g.u();
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f8396a = 0;
        public String b = "-1";
        public String c = "-1";
        public String d = "";
        public String e;
        public int f;
        public int g;
        public long h;
        public long i;

        public String toString() {
            return String.format("=============================================\n----------------- 鉴权错误信息 ------------\nsha1;package:%s\nkey:%s\nerrorcode: %d uid: %s appid %s msg: %s\n请仔细核查 SHA1、package与key申请信息是否对应，key是否删除，平台是否匹配\n=============================================\n", com.baidu.mapsdkplatform.comapi.util.a.a(PermissionCheck.b), PermissionCheck.c, Integer.valueOf(this.f8396a), this.b, this.c, this.d);
        }
    }
}
