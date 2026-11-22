package com.xiaomi.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.anythink.basead.webtemplet.a.b;
import com.baidu.mapapi.http.HttpClient;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static String f14672a = null;

    /* renamed from: a, reason: collision with other field name */
    private static final Set<String> f917a;
    private static String b = null;
    private static String c = "";
    private static String d;
    private static String e;
    private static final String f = String.valueOf((char) 2);

    /* renamed from: a, reason: collision with other field name */
    private static final String[] f918a = {HttpClient.ENDFLAG, "a-", "u-", "v-", "o-", "g-", "d-"};

    private static double a(double d2) {
        int i = 1;
        while (true) {
            double d3 = i;
            if (d3 >= d2) {
                return d3;
            }
            i <<= 1;
        }
    }

    @Deprecated
    public static String b(Context context) {
        return null;
    }

    @Deprecated
    public static String c(Context context) {
        return null;
    }

    @Deprecated
    public static String d(Context context) {
        return null;
    }

    static {
        HashSet hashSet = new HashSet();
        f917a = hashSet;
        hashSet.add("com.xiaomi.xmsf");
        hashSet.add("com.xiaomi.finddevice");
        hashSet.add("com.miui.securitycenter");
    }

    /* renamed from: a, reason: collision with other method in class */
    private static String m12347a(int i) {
        if (i > 0) {
            String[] strArr = f918a;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        return f918a[0];
    }

    public static synchronized String a(Context context, boolean z) {
        String str;
        int i;
        synchronized (i.class) {
            if (d == null) {
                String mo11869a = ao.a(context).mo11869a();
                if (TextUtils.isEmpty(mo11869a) || mo11869a.startsWith("00000000-0000-0000-0000-000000000000")) {
                    mo11869a = a(context);
                    if (TextUtils.isEmpty(mo11869a)) {
                        mo11869a = g(context);
                        i = 6;
                    } else {
                        i = 5;
                    }
                } else {
                    i = 4;
                }
                com.xiaomi.channel.commonutils.logger.b.b("devid rule select:" + i);
                if (i == 3) {
                    d = mo11869a;
                } else {
                    d = m12347a(i) + bc.b(mo11869a);
                }
            }
            str = d;
        }
        return str;
    }

    public static String a(Context context) {
        if (!j.m12358a(context)) {
            return null;
        }
        String str = b;
        if (str != null) {
            return str;
        }
        try {
            b = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("failure to get androidId: " + th);
        }
        return b;
    }

    @Deprecated
    public static String e(Context context) {
        return "";
    }

    public static String f(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
    }

    public static int a() {
        Object a2 = ax.a("android.os.UserHandle", "myUserId", new Object[0]);
        if (a2 == null) {
            return -1;
        }
        return ((Integer) Integer.class.cast(a2)).intValue();
    }

    /* renamed from: a, reason: collision with other method in class */
    public static String m12346a() {
        return a(b()) + "GB";
    }

    public static int b() {
        BufferedReader bufferedReader;
        Throwable th;
        String[] split;
        int i = 0;
        if (new File(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO).exists()) {
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    bufferedReader = new BufferedReader(new FileReader(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO), 8192);
                } catch (IOException unused) {
                }
                try {
                    String readLine = bufferedReader.readLine();
                    if (!TextUtils.isEmpty(readLine) && (split = readLine.split("\\s+")) != null && split.length >= 2 && TextUtils.isDigitsOnly(split[1])) {
                        i = Integer.parseInt(split[1]);
                    }
                    bufferedReader.close();
                } catch (Exception unused2) {
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    return i;
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused4) {
            } catch (Throwable th3) {
                bufferedReader = null;
                th = th3;
            }
        }
        return i;
    }

    private static float a(int i) {
        float f2 = (((((i + 102400) / 524288) + 1) * 524288) / 1024.0f) / 1024.0f;
        double d2 = f2;
        return d2 > 0.5d ? (float) Math.ceil(d2) : f2;
    }

    /* renamed from: b, reason: collision with other method in class */
    public static String m12351b() {
        return a(((a(Environment.getDataDirectory()) / 1024.0d) / 1024.0d) / 1024.0d) + "GB";
    }

    private static long a(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
    }

    public static String c() {
        return b() + "KB";
    }

    public static String d() {
        return (a(Environment.getDataDirectory()) / 1024) + "KB";
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m12349a(Context context) {
        Intent a2 = m.a(context, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), (String) null, (Handler) null);
        if (a2 == null) {
            return false;
        }
        int intExtra = a2.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    /* renamed from: b, reason: collision with other method in class */
    public static boolean m12352b(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return powerManager == null || powerManager.isScreenOn();
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m12348a() {
        return a() <= 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m12350a(Context context, String str) {
        PackageInfo packageInfo = (PackageInfo) ax.a((Object) context.getPackageManager(), "getPackageInfoAsUser", str, 0, 999);
        return packageInfo == null || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 8388608) != 8388608;
    }

    private static String g(Context context) {
        String string = context.getSharedPreferences(b.c.d, 0).getString("default_id", null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String h = h(context);
        a(context, h);
        return h;
    }

    private static void a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(b.c.d, 0);
        if (TextUtils.isEmpty(sharedPreferences.getString("default_id", null))) {
            sharedPreferences.edit().putString("default_id", str).apply();
        } else {
            com.xiaomi.channel.commonutils.logger.b.m11781a("default_id exist,do not change it.");
        }
    }

    private static String h(Context context) {
        String str = Build.BRAND;
        String a2 = k.a();
        int i = Build.VERSION.SDK_INT;
        String str2 = Build.VERSION.RELEASE;
        String e2 = j.e();
        int a3 = a();
        String packageName = context.getPackageName();
        long currentTimeMillis = System.currentTimeMillis();
        String a4 = bc.a(16);
        StringBuilder sb = new StringBuilder();
        sb.append(str).append("_").append(a2).append("_").append(i).append("_").append(str2).append("_").append(e2).append("_").append(a3).append("_").append(packageName).append("_").append(currentTimeMillis).append("_").append(a4);
        return az.a(sb.toString());
    }
}
