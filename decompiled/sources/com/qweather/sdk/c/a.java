package com.qweather.sdk.c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.autonavi.aps.amapapi.config.Const;
import com.hjq.permissions.Permission;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: DeviceUtil.java */
/* loaded from: classes17.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static String f13520a;
    private static String b;
    private static String c;

    public static String a(Context context) {
        if (f13520a == null) {
            synchronized (a.class) {
                if (f13520a == null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        f13520a = "";
                        return "";
                    }
                    if (context == null) {
                        f13520a = "";
                        return "";
                    }
                    if (context.checkSelfPermission(Permission.READ_PHONE_STATE) != 0) {
                        f13520a = "";
                        return "";
                    }
                    f13520a = d(context);
                }
            }
        }
        return f13520a;
    }

    public static String a() {
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Build.BOARD.length() % 10);
                    sb.append(Arrays.deepToString(Build.SUPPORTED_ABIS).length() % 10);
                    sb.append(Build.DEVICE.length() % 10);
                    sb.append(Build.DISPLAY.length() % 10);
                    sb.append(Build.HOST.length() % 10);
                    sb.append(Build.ID.length() % 10);
                    sb.append(Build.MANUFACTURER.length() % 10);
                    sb.append(Build.BRAND.length() % 10);
                    sb.append(Build.MODEL.length() % 10);
                    sb.append(Build.PRODUCT.length() % 10);
                    sb.append(Build.BOOTLOADER.length() % 10);
                    sb.append(Build.HARDWARE.length() % 10);
                    sb.append(Build.TAGS.length() % 10);
                    sb.append(Build.TYPE.length() % 10);
                    sb.append(Build.USER.length() % 10);
                    b = sb.toString();
                }
            }
        }
        return b;
    }

    private static String d(Context context) {
        if (context == null) {
            return "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            String imei = telephonyManager.getImei();
            return TextUtils.isEmpty(imei) ? telephonyManager.getMeid() : imei;
        } catch (Error | Exception unused) {
            return "";
        }
    }

    public static String b(Context context) {
        if (c == null) {
            synchronized (a.class) {
                if (c == null) {
                    String e = e(context);
                    if (TextUtils.isEmpty(e)) {
                        e = f(context);
                    }
                    if (TextUtils.isEmpty(e)) {
                        e = h(context);
                    }
                    if (TextUtils.isEmpty(e)) {
                        e = UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
                        c(context, e);
                        a(context, e);
                        b(context, e);
                    }
                    c = e;
                }
            }
        }
        return c;
    }

    private static String e(Context context) {
        if (context == null) {
            return "";
        }
        return Settings.System.getString(context.getContentResolver(), "QW_GUID_uuid");
    }

    private static void a(Context context, String str) {
        if (context != null && Settings.System.canWrite(context)) {
            try {
                Settings.System.putString(context.getContentResolver(), "QW_GUID_uuid", str);
            } catch (Exception unused) {
            }
        }
    }

    private static String f(Context context) {
        String str = "";
        if (context == null) {
            return "";
        }
        File g = g(context);
        if (g != null) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(g));
                try {
                    str = bufferedReader.readLine();
                    bufferedReader.close();
                    return str;
                } finally {
                }
            } catch (Exception unused) {
            }
        }
        return str;
    }

    private static void b(Context context, String str) {
        File g;
        if (context == null || (g = g(context)) == null) {
            return;
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(g));
            try {
                if (!g.exists()) {
                    g.createNewFile();
                }
                bufferedWriter.write(str);
                bufferedWriter.flush();
                bufferedWriter.close();
            } finally {
            }
        } catch (Exception unused) {
        }
    }

    private static File g(Context context) {
        if (Build.VERSION.SDK_INT < 30 && context != null && context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0 && "mounted".equals(Environment.getExternalStorageState())) {
            return new File(Environment.getExternalStorageDirectory(), "Android/.QW_GUID_uuid");
        }
        return null;
    }

    private static void c(Context context, String str) {
        if (context == null) {
            return;
        }
        d.a(context, "qweather-uuid", str);
    }

    private static String h(Context context) {
        if (context == null) {
            return "";
        }
        return d.a(context, "qweather-uuid");
    }

    public static String c(Context context) {
        DisplayMetrics displayMetrics;
        StringBuilder sb = new StringBuilder();
        sb.append(Const.STR_MART_JSON_BEGIN);
        try {
            sb.append("\"pid\":\"").append(a()).append("\"").append(",");
            sb.append("\"uid\":\"").append(a(context)).append("\"").append(",");
            sb.append("\"gid\":\"").append(b(context)).append("\"").append(",");
            sb.append("\"kvn\":\"").append("4.18").append("\"").append(",");
            sb.append("\"kvc\":\"").append(39).append("\"").append(",");
            sb.append("\"sid\":\"").append(a(Build.ID)).append("\"").append(",");
            sb.append("\"sdv\":\"").append(a(Build.DEVICE)).append("\"").append(",");
            sb.append("\"sbr\":\"").append(a(Build.BRAND)).append("\"").append(",");
            sb.append("\"smo\":\"").append(a(Build.MODEL)).append("\"").append(",");
            sb.append("\"spd\":\"").append(a(Build.PRODUCT)).append("\"").append(",");
            sb.append("\"smf\":\"").append(a(Build.MANUFACTURER)).append("\"").append(",");
            sb.append("\"shw\":\"").append(a(Build.HARDWARE)).append("\"").append(",");
            sb.append("\"sfp\":\"").append(a(Build.FINGERPRINT)).append("\"").append(",");
            sb.append("\"stp\":\"").append(a(Build.TYPE)).append("\"").append(",");
            sb.append("\"shs\":\"").append(a(Build.HOST)).append("\"").append(",");
            sb.append("\"sbd\":\"").append(a(Build.BOARD)).append("\"").append(",");
            sb.append("\"stm\":\"").append(a(Long.valueOf(Build.TIME))).append("\"").append(",");
            sb.append("\"sca\":\"").append(a(Build.CPU_ABI)).append("\"").append(",");
            sb.append("\"sbl\":\"").append(a(Build.BOOTLOADER)).append("\"").append(",");
            sb.append("\"sdp\":\"").append(a(Build.DISPLAY)).append("\"").append(",");
            sb.append("\"stg\":\"").append(a(Build.TAGS)).append("\"").append(",");
            sb.append("\"svr\":\"").append(a(Build.VERSION.RELEASE)).append("\"").append(",");
            sb.append("\"svs\":\"").append(a(Integer.valueOf(Build.VERSION.SDK_INT))).append("\"").append(",");
            sb.append("\"svb\":\"").append(a(Build.VERSION.BASE_OS)).append("\"").append(",");
            sb.append("\"svc\":\"").append(a(Build.VERSION.CODENAME)).append("\"").append(",");
            sb.append("\"svi\":\"").append(a(Build.VERSION.INCREMENTAL)).append("\"").append(",");
            sb.append("\"svs\":\"").append(a(Build.VERSION.SECURITY_PATCH)).append("\"").append(",");
            if (context != null) {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                sb.append("\"avc\":\"").append(context.getPackageName()).append("\"").append(",");
                sb.append("\"avn\":\"").append(i(context)).append("\"").append(",");
                sb.append("\"aan\":\"").append(j(context)).append("\"").append(",");
                if (telephonyManager != null) {
                    if (d(context, Permission.READ_PHONE_STATE) == 0) {
                        String simSerialNumber = telephonyManager.getSimSerialNumber();
                        if (!TextUtils.isEmpty(simSerialNumber)) {
                            sb.append("\"psn\":\"").append(a(simSerialNumber)).append("\"").append(",");
                        }
                        String subscriberId = telephonyManager.getSubscriberId();
                        if (!TextUtils.isEmpty(subscriberId)) {
                            sb.append("\"psi\":\"").append(a(subscriberId)).append("\"").append(",");
                        }
                    }
                    sb.append("\"ppt\":\"").append(a(Integer.valueOf(telephonyManager.getPhoneType()))).append("\"").append(",");
                    String simCountryIso = telephonyManager.getSimCountryIso();
                    if (!TextUtils.isEmpty(simCountryIso)) {
                        sb.append("\"psc\":\"").append(a(simCountryIso)).append("\"").append(",");
                    }
                    String simOperator = telephonyManager.getSimOperator();
                    if (!TextUtils.isEmpty(simOperator)) {
                        sb.append("\"pso\":\"").append(a(simOperator)).append("\"").append(",");
                    }
                    String simOperatorName = telephonyManager.getSimOperatorName();
                    if (!TextUtils.isEmpty(simOperatorName)) {
                        sb.append("\"psn\":\"").append(a(simOperatorName)).append("\"").append(",");
                    }
                }
                if (context.getResources() != null && (displayMetrics = context.getResources().getDisplayMetrics()) != null) {
                    sb.append("\"dmd\":\"").append(a(Float.valueOf(displayMetrics.density))).append("\"").append(",");
                    sb.append("\"ddp\":\"").append(a(Integer.valueOf(displayMetrics.densityDpi))).append("\"").append(",");
                    sb.append("\"dmx\":\"").append(a(Float.valueOf(displayMetrics.xdpi))).append("\"").append(",");
                    sb.append("\"dmy\":\"").append(a(Float.valueOf(displayMetrics.ydpi))).append("\"").append(",");
                    sb.append("\"dsd\":\"").append(a(Float.valueOf(displayMetrics.scaledDensity))).append("\"").append(",");
                }
            }
            sb = sb.deleteCharAt(sb.length() - 1);
        } catch (Exception unused) {
        }
        sb.append("}");
        return sb.toString();
    }

    private static String a(Object obj) {
        return a(obj, "");
    }

    private static String a(Object obj, String str) {
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (!TextUtils.isEmpty(str2)) {
                return str2.trim();
            }
        } else if (obj != null) {
            return obj.toString();
        }
        return str;
    }

    private static String i(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    private static synchronized String j(Context context) {
        String string;
        synchronized (a.class) {
            try {
                string = context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return string;
    }

    private static int d(Context context, String str) {
        if (str == null) {
            throw new IllegalArgumentException("permission is null");
        }
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }
}
