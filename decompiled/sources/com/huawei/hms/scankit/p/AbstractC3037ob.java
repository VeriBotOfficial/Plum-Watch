package com.huawei.hms.scankit.p;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.SparseArray;
import com.huawei.hms.framework.common.SystemPropUtils;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.hms.mlsdk.common.MLApplicationSetting;
import java.util.LinkedHashMap;

/* compiled from: HaLog.java */
/* renamed from: com.huawei.hms.scankit.p.ob, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
abstract class AbstractC3037ob {

    /* renamed from: a, reason: collision with root package name */
    static String f10675a = "FORMAT_UNKNOWN";
    static String b = "OTHER";
    static SparseArray<String> c = new C2985bb();
    static SparseArray<String> d = new C2989cb();
    Context e;
    LinkedHashMap<String, String> f = new LinkedHashMap<>();
    volatile long g;

    AbstractC3037ob(Bundle bundle, Context context) {
        this.e = context;
        b(bundle);
    }

    private void b(Bundle bundle) {
        try {
            String packageName = this.e.getPackageName();
            this.f.put("package", packageName);
            if (bundle == null || !bundle.containsKey("appid")) {
                this.f.put("appid", packageName);
            } else {
                this.f.put("appid", bundle.getString("appid"));
            }
            PackageManager packageManager = this.e.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 128);
            this.f.put("appName", applicationInfo.loadLabel(packageManager).toString());
            this.f.put("version", a(applicationInfo.metaData));
            String d2 = d();
            this.f.put("hmscoreVersion", d2);
            this.f.put("isHMSCore", "unknown".equals(d2) ? "0" : "1");
        } catch (PackageManager.NameNotFoundException unused) {
            com.huawei.hms.scankit.util.a.b("HaLog", "PackageManager.NameNotFoundException");
        } catch (Exception unused2) {
            com.huawei.hms.scankit.util.a.b("HaLog", "initValue Exception");
        }
        try {
            this.f.put("sdkName", "scankit");
            this.f.put("algopt", b());
            this.f.put("isFullSdk", "FULLSDK");
            this.f.put(WiseOpenHianalyticsData.UNION_APP_VERSION, c());
            if (f()) {
                this.f.put("apkVersion", "unknown");
            } else {
                this.f.put("apkVersion", "1.0");
            }
            this.f.put("service", "com.huawei.hms.scankit");
            this.f.put("operator", C3052sb.b(this.e));
            this.f.put("networkType", C3052sb.a(this.e));
            this.f.put(MLApplicationSetting.BundleKeyConstants.AppInfo.countryCode, C3052sb.a(this.e, false));
            this.f.put("deviceType", C3052sb.c());
            this.f.put("emuiVersion", C3052sb.d());
            this.f.put("androidVersion", C3052sb.a());
            this.f.put("deviceCategory", C3052sb.b());
        } catch (RuntimeException unused3) {
            com.huawei.hms.scankit.util.a.b("HaLog", "initValue RuntimeException");
        } catch (Exception unused4) {
            com.huawei.hms.scankit.util.a.b("HaLog", "initValue Exception");
        }
    }

    private String c() {
        try {
            return this.e.getPackageManager().getPackageInfo(this.e.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return "unknown";
        }
    }

    private String d() {
        try {
            return this.e.getPackageManager().getPackageInfo("com.huawei.hwid", 0).versionName;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return "unknown";
        }
    }

    private boolean e() {
        try {
            String property = SystemPropUtils.getProperty("get", "ro.hw.country", "android.os.SystemProperties", "UNKNOWN");
            TelephonyManager telephonyManager = (TelephonyManager) this.e.getApplicationContext().getSystemService("phone");
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            String simCountryIso = telephonyManager.getSimCountryIso();
            if ("CN".equalsIgnoreCase(property) && "CN".equalsIgnoreCase(networkCountryIso)) {
                if ("CN".equalsIgnoreCase(simCountryIso)) {
                    return true;
                }
            }
        } catch (RuntimeException | Exception unused) {
        }
        return false;
    }

    private boolean f() {
        return true;
    }

    boolean a() {
        if (com.huawei.hms.scankit.util.b.b(this.e)) {
            Log.i("HaLog", "allowLog: forbidLog");
            return false;
        }
        try {
            if (!f() && !e()) {
                if (Settings.Secure.getInt(this.e.getContentResolver(), "hw_app_analytics_state", 0) != 1) {
                    return false;
                }
            }
            return true;
        } catch (RuntimeException | Exception unused) {
            return false;
        }
    }

    static String a(int i) {
        return c.get(i, f10675a);
    }

    private String a(Bundle bundle) {
        String[] strArr = {"huawei_module_scankit_sdk_version", "com.huawei.hms.client.service.name:scan", "com.huawei.hms.client.service.name:scanplus", "com.huawei.hms.client.service.name:scankit"};
        if (bundle == null) {
            return "scankit:1.0.2.300";
        }
        for (int i = 0; i < 4; i++) {
            String str = strArr[i];
            if (bundle.getString(str) != null) {
                return bundle.getString(str);
            }
        }
        return "scankit:1.0.2.300";
    }

    private String b() {
        int hashCode = "FULLSDK".hashCode();
        char c2 = (hashCode == 65020 || hashCode != 206759723) ? (char) 65535 : (char) 1;
        if (c2 == 0) {
            return "apk";
        }
        if (c2 == 1) {
            return com.anythink.expressad.f.a.b.ax;
        }
        if (c2 != 2) {
            return null;
        }
        return "lite";
    }

    static String b(int i) {
        return d.get(i, b);
    }
}
