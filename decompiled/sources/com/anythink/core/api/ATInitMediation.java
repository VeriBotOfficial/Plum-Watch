package com.anythink.core.api;

import android.content.Context;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.t;
import com.anythink.core.common.u.e;
import com.anythink.core.common.v.q;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class ATInitMediation {
    public static final String KEY_LOCAL = "anythink_local";
    protected String devBundleName;

    public List getActivityStatus() {
        return null;
    }

    public List getMetaValutStatus() {
        return null;
    }

    public List getPermissionStatus() {
        return null;
    }

    public Map<String, Boolean> getPluginClassStatus() {
        return null;
    }

    public List getProviderStatus() {
        return null;
    }

    public List getResourceStatus() {
        return null;
    }

    public List getServiceStatus() {
        return null;
    }

    public abstract void initSDK(Context context, Map<String, Object> map, MediationInitCallback mediationInitCallback);

    public boolean needCheckAdapterVersion() {
        return true;
    }

    public boolean setUserDataConsent(Context context, boolean z, boolean z2) {
        return false;
    }

    public String getNetworkName() {
        return "";
    }

    public String getNetworkVersion() {
        return "";
    }

    public String getNetworkSDKClass() {
        return "";
    }

    public String getAdapterVersion() {
        return "";
    }

    protected final void runOnThreadPool(Runnable runnable) {
        t.b();
        t.c(runnable);
    }

    protected final void runOnMainThread(Runnable runnable) {
        t.b().b(runnable);
    }

    protected final void checkToSaveInitData(String str, Map<String, Object> map, String... strArr) {
        t.b().a(str, map, strArr);
    }

    public static String getStringFromMap(Map<String, Object> map, String str) {
        return getStringFromMap(map, str, "");
    }

    public static String getStringFromMap(Map<String, Object> map, String str, String str2) {
        return (String) q.a(map, str, str2);
    }

    public static int getIntFromMap(Map<String, Object> map, String str) {
        return getIntFromMap(map, str, 0);
    }

    public static int getIntFromMap(Map<String, Object> map, String str, int i) {
        return ((Integer) q.a(map, str, Integer.valueOf(i))).intValue();
    }

    public static long getLongFromMap(Map<String, Object> map, String str) {
        return getLongFromMap(map, str, 0L);
    }

    public static long getLongFromMap(Map<String, Object> map, String str, long j) {
        return ((Long) q.a(map, str, Long.valueOf(j))).longValue();
    }

    public static double getDoubleFromMap(Map<String, Object> map, String str) {
        return getDoubleFromMap(map, str, 0.0d);
    }

    public static double getDoubleFromMap(Map<String, Object> map, String str, double d) {
        return ((Double) q.a(map, str, Double.valueOf(d))).doubleValue();
    }

    public static boolean getBooleanFromMap(Map<String, Object> map, String str) {
        return getBooleanFromMap(map, str, false);
    }

    public static boolean getBooleanFromMap(Map<String, Object> map, String str, boolean z) {
        return ((Boolean) q.a(map, str, Boolean.valueOf(z))).booleanValue();
    }

    public String getBundleName() {
        return t.b().U();
    }

    public void setDevBundleName(String str) {
        this.devBundleName = str;
    }

    public String getDevBundleName() {
        return this.devBundleName;
    }

    public String getUserId() {
        Map<String, Object> m = t.b().m();
        if (m != null) {
            return getStringFromMap(m, "user_id");
        }
        return "";
    }

    protected final void sendNetworkEvent(final int i, final int i2, final Map<String, Object> map) {
        runOnThreadPool(new Runnable() { // from class: com.anythink.core.api.ATInitMediation.1
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                int i4 = i2;
                Map map2 = map;
                if (i3 == 2 && i4 == 10001 && map2 != null) {
                    try {
                        long b = q.b((Map<String, Object>) map2, "init_st");
                        long b2 = q.b((Map<String, Object>) map2, "init_et");
                        long b3 = q.b((Map<String, Object>) map2, "token_st");
                        long b4 = q.b((Map<String, Object>) map2, "token_et");
                        e.a(q.a((Map<String, Object>) map2, "ad_format", "-1"), q.a((Map<String, Object>) map2, "admob_init_adsource_id", ""), q.a((Map<String, Object>) map2, "admob_token_adsource_id", ""), q.a((Map<String, Object>) map2, j.w.G, 0), b, b2, b3, b4, (b <= 0 || b2 <= 0 || b3 <= 0 || b4 <= 0 || b <= b3) ? -1L : b2 - b3);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }
}
