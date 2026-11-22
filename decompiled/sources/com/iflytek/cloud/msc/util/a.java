package com.iflytek.cloud.msc.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.webkit.WebView;
import com.iflytek.cloud.msc.util.log.DebugLog;
import com.umeng.analytics.pro.ak;
import java.lang.reflect.Field;

/* loaded from: classes17.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static String[][] f11183a = {new String[]{"=", ":"}, new String[]{",", "_"}};
    public static String[][] b = {new String[]{"os.manufact", Build.MANUFACTURER}, new String[]{"os.model", Build.MODEL}, new String[]{"os.product", Build.PRODUCT}, new String[]{"os.display", Build.DISPLAY}, new String[]{"os.host", Build.HOST}, new String[]{"os.id", Build.ID}, new String[]{"os.device", Build.DEVICE}, new String[]{"os.board", Build.BOARD}, new String[]{"os.brand", Build.BRAND}, new String[]{"os.user", Build.USER}, new String[]{"os.type", Build.TYPE}};
    private static String[][] c = {new String[]{"os.cpu", "CPU_ABI"}, new String[]{"os.cpu2", "CPU_ABI2"}, new String[]{"os.serial", "SERIAL"}, new String[]{"os.hardware", "HARDWARE"}, new String[]{"os.bootloader", "BOOTLOADER"}, new String[]{"os.radio", "RADIO"}};
    private static com.iflytek.cloud.b.a d = new com.iflytek.cloud.b.a();
    private static boolean e = false;
    private static String f = null;
    private static String g = null;

    /* renamed from: com.iflytek.cloud.msc.util.a$a, reason: collision with other inner class name */
    class C0655a implements Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f11184a;

        C0655a(Context context) {
            this.f11184a = context;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            String unused = a.f = new WebView(this.f11184a).getSettings().getUserAgentString();
            DebugLog.LogS("user agent: " + a.f);
            return false;
        }
    }

    public static synchronized com.iflytek.cloud.b.a b(Context context) {
        synchronized (a.class) {
            if (e) {
                return d;
            }
            g(context);
            return d;
        }
    }

    private static String c(String str) {
        try {
            Field field = Build.class.getField(str);
            if (field != null) {
                return field.get(new Build()).toString();
            }
        } catch (Exception unused) {
        }
        return "unknown";
    }

    public static String d(Context context) {
        try {
            String networkOperatorName = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
            return !TextUtils.isEmpty(networkOperatorName) ? networkOperatorName : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String e(Context context) {
        if (TextUtils.isEmpty(g)) {
            try {
                int i = context.getResources().getConfiguration().screenLayout & 15;
                if (i >= 3) {
                    g = "tablet";
                } else if (i >= 1) {
                    g = "handset";
                } else {
                    g = "unknow";
                }
            } catch (Throwable th) {
                DebugLog.LogE(th);
            }
        }
        DebugLog.LogS("get device type: " + g);
        return g;
    }

    public static com.iflytek.cloud.b.a f(Context context) {
        com.iflytek.cloud.b.a b2 = b(context);
        com.iflytek.cloud.b.a aVar = new com.iflytek.cloud.b.a();
        aVar.a(b2, "app.name");
        aVar.a(b2, "app.path");
        aVar.a(b2, "app.pkg");
        aVar.a(b2, "app.ver.name");
        aVar.a(b2, "app.ver.code");
        aVar.a(b2, "os.system");
        aVar.a(b2, "os.resolution");
        aVar.a(b2, "os.density");
        aVar.a(b2, "net.mac");
        aVar.a(b2, "os.imei");
        aVar.a(b2, "os.imsi");
        aVar.a(b2, "os.version");
        aVar.a(b2, "os.release");
        aVar.a(b2, "os.incremental");
        aVar.a(b2, "os.android_id");
        aVar.a(b2, ak.P);
        aVar.a(b2, b[0][0]);
        aVar.a(b2, b[1][0]);
        aVar.a(b2, b[2][0]);
        aVar.a(b2, b[3][0]);
        return aVar;
    }

    private static void g(Context context) {
        try {
            d.a();
            d.b("os.system", "Android");
            a(d, context);
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            d.b("os.resolution", displayMetrics.widthPixels + "*" + displayMetrics.heightPixels);
            d.b("os.density", "" + displayMetrics.density);
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            try {
                d.b("os.imei", telephonyManager.getDeviceId());
            } catch (SecurityException unused) {
                DebugLog.LogD("Failed to get did Info:SecurityException");
            } catch (Throwable unused2) {
                DebugLog.LogD("Failed to get did Info:other exception");
            }
            try {
                d.b("os.imsi", telephonyManager.getSubscriberId());
            } catch (SecurityException unused3) {
                DebugLog.LogD("Failed to get sbid Info:SecurityException");
            } catch (Throwable unused4) {
                DebugLog.LogD("Failed to get sbid Info:other exception");
            }
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (!TextUtils.isEmpty(string)) {
                d.b("os.android_id", string);
            }
            d.b("os.version", Build.VERSION.SDK);
            d.b("os.release", Build.VERSION.RELEASE);
            d.b("os.incremental", Build.VERSION.INCREMENTAL);
            int i = 0;
            while (true) {
                String[][] strArr = b;
                if (i >= strArr.length) {
                    break;
                }
                com.iflytek.cloud.b.a aVar = d;
                String[] strArr2 = strArr[i];
                aVar.b(strArr2[0], strArr2[1]);
                i++;
            }
            int i2 = 0;
            while (true) {
                String[][] strArr3 = c;
                if (i2 >= strArr3.length) {
                    d.b(ak.P, d(context));
                    d.d();
                    e = true;
                    return;
                }
                d.b(c[i2][0], c(strArr3[i2][1]));
                i2++;
            }
        } catch (Exception unused5) {
            DebugLog.LogD("Failed to get prop Info");
            e = false;
        } catch (Throwable unused6) {
            DebugLog.LogD("Failed to get property Info");
            e = false;
        }
    }

    public static void a(com.iflytek.cloud.b.a aVar, Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
            aVar.b("app.ver.name", packageInfo.versionName);
            aVar.b("app.ver.code", "" + packageInfo.versionCode);
            aVar.b("app.pkg", applicationInfo.packageName);
            aVar.b("app.path", applicationInfo.dataDir);
            aVar.b("app.name", applicationInfo.loadLabel(context.getPackageManager()).toString());
        } catch (Exception unused) {
        }
    }

    public static String c(Context context) {
        if (TextUtils.isEmpty(f)) {
            try {
                new Handler(context.getMainLooper(), new C0655a(context)).sendEmptyMessage(1);
            } catch (Throwable th) {
                DebugLog.LogE(th);
            }
        }
        DebugLog.LogS("get user agent: " + f);
        return f;
    }

    public static String b(String str) {
        DebugLog.LogS("check and replace src: " + str);
        if (str != null) {
            int i = 0;
            while (true) {
                String[][] strArr = f11183a;
                if (i >= strArr.length) {
                    break;
                }
                String[] strArr2 = strArr[i];
                str = str.replace(strArr2[0], strArr2[1]);
                i++;
            }
        } else {
            str = null;
        }
        DebugLog.LogS("check and replace result: " + str);
        return str;
    }

    public static String a(Context context) {
        try {
            context.getPackageManager().checkPermission("android.permission.GET_TASKS", context.getPackageName());
            return "";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }
}
