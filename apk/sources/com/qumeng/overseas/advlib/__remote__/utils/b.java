package com.qumeng.overseas.advlib.__remote__.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.facebook.soloader.MinElf;
import com.umeng.analytics.pro.ak;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.nats.client.support.ApiConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b {
    public static String a() {
        return "Cores: " + Runtime.getRuntime().availableProcessors() + " | MaxMem: " + ((Runtime.getRuntime().maxMemory() / 1024) / 1024) + "MB";
    }

    public static float b() {
        return SystemClock.elapsedRealtime() / 60000.0f;
    }

    public static String c() {
        return TimeZone.getDefault().getID();
    }

    public static String d(Context context) {
        int intExtra = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
        if (intExtra == 1) {
            return "AC charging";
        }
        if (intExtra != 2) {
            return intExtra != 4 ? "Running on battery" : "Wireless charging";
        }
        return "USB charging";
    }

    public static String e(Context context) {
        String country = Locale.getDefault().getCountry();
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        return "Locale: " + country + " | SIM: " + (telephonyManager != null ? telephonyManager.getSimCountryIso() : "");
    }

    public static boolean f() {
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.startsWith("unknown")) {
            String str2 = Build.MODEL;
            if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Android SDK built for x86") && !Build.BOARD.equals("QC_Reference_Phone") && !Build.MANUFACTURER.contains("Genymotion") && !Build.HOST.startsWith("Build")) {
                return false;
            }
        }
        return true;
    }

    public static String g(Context context) {
        try {
            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            return installerPackageName == null ? "side-load" : installerPackageName;
        } catch (Exception unused) {
            return "unknown";
        }
    }

    public static boolean h() {
        for (String str : Build.SUPPORTED_ABIS) {
            if (str.contains(MinElf.ISA.X86)) {
                return true;
            }
        }
        String property = System.getProperty("os.arch");
        return property != null && property.toLowerCase().contains(MinElf.ISA.X86);
    }

    public static int i(Context context) {
        return ((SensorManager) context.getSystemService(ak.ac)).getSensorList(-1).size();
    }

    public static String j(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long blockCountLong = (statFs.getBlockCountLong() * blockSizeLong) / 1073741824;
        return "Total: " + blockCountLong + "GB | Used: " + (blockCountLong - ((statFs.getAvailableBlocksLong() * blockSizeLong) / 1073741824)) + "GB";
    }

    public static String k(Context context) {
        int r3;
        int streamVolume = ((AudioManager) context.getSystemService("audio")).getStreamVolume(3);
        try {
            r3 = Settings.System.getInt(context.getContentResolver(), "screen_brightness");
        } catch (Throwable unused) {
            r3 = 0;
        }
        return "Volume: " + streamVolume + " | Brightness: " + r3;
    }

    public static boolean l(Context context) {
        int r2;
        try {
            r2 = Settings.Secure.getInt(context.getContentResolver(), "accessibility_enabled");
        } catch (Settings.SettingNotFoundException unused) {
            r2 = 0;
        }
        return r2 == 1;
    }

    public static boolean m(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0) > 0;
    }

    public static boolean n(Context context) {
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "mock_location_app");
            return (string == null || string.isEmpty()) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean o(Context context) {
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "mock_location_app");
            return (string == null || string.isEmpty()) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void p(Context context) {
        JSONObject jSONObjectA = a(context);
        Log.i("AntiFraudHelper", "==================================================");
        Log.i("AntiFraudHelper", "          DEVICE RISK REPORT (防作弊检测报告)       ");
        Log.i("AntiFraudHelper", "==================================================");
        Iterator<String> itKeys = jSONObjectA.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = jSONObjectA.get(next);
                String str = " [ ] ";
                if ((next.equals(CommonUrlParts.ROOT_STATUS) || next.equals("is_emulator") || next.equals("has_hook")) && (obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                    str = " [!] RISK -> ";
                }
                Log.i("AntiFraudHelper", str + String.format("%-18s", next) + ": " + obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Log.i("AntiFraudHelper", "==================================================");
    }

    public static Map<String, String> b(Context context) {
        HashMap map = new HashMap();
        try {
            map.put("sensor_count", String.valueOf(i(context)));
            map.put("cpu_specs", a());
            map.put(ApiConstants.STORAGE, j(context));
            map.put("uptime_min", String.valueOf(b()));
            map.put("is_hw_consistent", a(e()));
            map.put(CommonUrlParts.ROOT_STATUS, a(g()));
            map.put("has_hook", a(d()));
            map.put("is_emulator", a(f()));
            map.put("is_x86", a(h()));
            map.put("is_adb_enabled", a(m(context)));
            map.put("is_accessibility_on", a(l(context)));
            map.put("is_mock_location_on", a(n(context)));
            map.put("installer", g(context));
            map.put("battery_detail", c(context));
            map.put("network_type", h(context));
            map.put("timezone", c());
            map.put("country_info", e(context));
            map.put("user_env", k(context));
        } catch (Exception e) {
            Log.e("AntiFraudHelper", "数据收集异常: " + e.getMessage());
        }
        return map;
    }

    public static String c(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return "Unknown";
        }
        return "Level: " + intentRegisterReceiver.getIntExtra("level", -1) + " | Temp: " + (intentRegisterReceiver.getIntExtra("temperature", -1) / 10.0f) + "°C | Voltage: " + intentRegisterReceiver.getIntExtra("voltage", -1) + "mV";
    }

    private static String a(boolean z) {
        return z ? "1" : "0";
    }

    public static JSONObject a(Context context) {
        return new JSONObject(b(context));
    }

    public static String h(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(1)) {
                return "WIFI";
            }
            if (networkCapabilities.hasTransport(0)) {
                return "CELLULAR(移动数据)";
            }
            if (networkCapabilities.hasTransport(3)) {
                return "ETHERNET(有线网-高危)";
            }
            return networkCapabilities.hasTransport(4) ? "VPN(代理中)" : "Unknown";
        }
        return "Unknown";
    }

    public static boolean e() {
        String str;
        String str2 = Build.HARDWARE;
        try {
            str = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, "ro.hardware");
        } catch (Throwable unused) {
            str = "";
        }
        return str2.equals(str);
    }

    public static float f(Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    public static boolean g() {
        Process processExec;
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return true;
        }
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int r3 = 0; r3 < 10; r3++) {
            if (new File(strArr[r3]).exists()) {
                return true;
            }
        }
        try {
            processExec = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"});
            try {
                if (new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null) {
                    processExec.destroy();
                    return true;
                }
                processExec.destroy();
                return false;
            } catch (Throwable unused) {
                if (processExec != null) {
                    processExec.destroy();
                }
                return false;
            }
        } catch (Throwable unused2) {
            processExec = null;
        }
    }

    public static boolean d() {
        try {
            throw new Exception("DUMMY");
        } catch (Exception e) {
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                if (stackTraceElement.getClassName().contains("de.robv.android.xposed.XposedBridge") || stackTraceElement.getClassName().contains("com.saurik.substrate.MS$2")) {
                    return true;
                }
            }
            return false;
        }
    }
}
