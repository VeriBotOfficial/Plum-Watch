package io.agora.utils2.internal;

import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public class DeviceUtils {
    private static final List<String> CPU_TEMP_FILE_PATHS = Arrays.asList("/sys/devices/system/cpu/cpu0/cpufreq/cpu_temp", "/sys/devices/system/cpu/cpu0/cpufreq/FakeShmoo_cpu_temp", "/sys/class/thermal/thermal_zone0/temp", "/sys/class/i2c-adapter/i2c-4/4-004c/temperature", "/sys/devices/platform/tegra-i2c.3/i2c-4/4-004c/temperature", "/sys/devices/platform/omap/omap_temp_sensor.0/temperature", "/sys/devices/platform/tegra_tmon/temp1_input", "/sys/kernel/debug/tegra_thermal/temp_tj", "/sys/devices/platform/s5p-tmu/temperature", "/sys/class/thermal/thermal_zone1/temp", "/sys/class/hwmon/hwmon0/device/temp1_input", "/sys/devices/virtual/thermal/thermal_zone1/temp", "/sys/devices/virtual/thermal/thermal_zone0/temp", "/sys/class/thermal/thermal_zone3/temp", "/sys/class/thermal/thermal_zone4/temp", "/sys/class/hwmon/hwmonX/temp1_input", "/sys/devices/platform/s5p-tmu/curr_temp");
    private static double INVALIED_TMPERATURE = -100000.0d;
    private static final String TAG = "DeviceUtils";
    private static double TMPERATURE_HIGH_THR = 250.0d;
    private static double TMPERATURE_LOW_THR = -30.0d;

    static int getCpuTemperature() {
        return getCpuTemperature(CPU_TEMP_FILE_PATHS);
    }

    static int getCpuTemperature(List<String> fileList) {
        double d = 0.0d;
        for (String str : fileList) {
            try {
                d = getValidateTemperature(readDoubleValueFromFileFirstLine(str, INVALIED_TMPERATURE));
                Logging.d(TAG, "getCpuTemperature from file: " + str);
                break;
            } catch (IllegalArgumentException unused) {
                Logging.d(TAG, "can't getCpuTemperature from file: " + str);
            }
        }
        return (int) (d * 1000.0d);
    }

    public static String getDeviceId() {
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str)) {
            str = str.replace('/', '_');
        }
        String str2 = Build.MODEL;
        if (!TextUtils.isEmpty(str2)) {
            str2 = str2.replace('/', '_');
        }
        String str3 = Build.PRODUCT;
        if (!TextUtils.isEmpty(str3)) {
            str3 = str3.replace('/', '_');
        }
        String str4 = Build.HARDWARE;
        if (!TextUtils.isEmpty(str4)) {
            str4 = str4.replace('/', '_');
        }
        String lowerCase = (str + "/" + str2 + "/" + str3 + "/" + Build.VERSION.SDK_INT + "/" + str4).toLowerCase();
        Matcher matcher = Pattern.compile(".*[A-Z][A-M][0-9]$").matcher(Build.ID);
        if (Build.BRAND.toLowerCase().equals("samsung") && Build.DEVICE.toLowerCase().startsWith("cs02")) {
            matcher.find();
        }
        return lowerCase;
    }

    public static String getDeviceInfo() {
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str)) {
            str = str.replace('/', '_');
        }
        String str2 = Build.MODEL;
        if (!TextUtils.isEmpty(str2)) {
            str2 = str2.replace('/', '_');
        }
        return (str + "/" + str2).toLowerCase();
    }

    public static String getManufacturer() {
        return Build.MANUFACTURER.toLowerCase();
    }

    public static String getSystemInfo() {
        return "Android/" + Build.VERSION.RELEASE;
    }

    static double getValidateTemperature(double temp) throws IllegalArgumentException {
        if (Math.abs(temp) > 1000.0d) {
            double d = temp / 1000.0d;
            if (isTemperatureValid(d)) {
                return d;
            }
        } else if (isTemperatureValid(temp)) {
            return temp;
        }
        throw new IllegalArgumentException("not a validate temperature value");
    }

    static boolean isTemperatureValid(double temp) {
        return temp >= TMPERATURE_LOW_THR && temp <= TMPERATURE_HIGH_THR;
    }

    static double parseDouble(String s, double defaultValue) {
        try {
            return Double.parseDouble(s);
        } catch (Exception e) {
            Logging.d(TAG, "failed to conver string to double " + e.toString());
            return defaultValue;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static double readDoubleValueFromFileFirstLine(java.lang.String r5, double r6) {
        /*
            java.lang.String r0 = "DeviceUtils"
            java.lang.String r1 = "failed to read from file "
            java.io.File r2 = new java.io.File
            r2.<init>(r5)
            boolean r5 = r2.exists()
            if (r5 != 0) goto L10
            goto L63
        L10:
            r5 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L34 java.io.FileNotFoundException -> L51
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L34 java.io.FileNotFoundException -> L51
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L34 java.io.FileNotFoundException -> L51
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L34 java.io.FileNotFoundException -> L51
            java.lang.String r5 = r3.readLine()     // Catch: java.io.IOException -> L2c java.io.FileNotFoundException -> L2e java.lang.Throwable -> L64
            double r5 = parseDouble(r5, r6)     // Catch: java.io.IOException -> L2c java.io.FileNotFoundException -> L2e java.lang.Throwable -> L64
            r3.close()     // Catch: java.io.IOException -> L27
            return r5
        L27:
            r7 = move-exception
            r7.printStackTrace()
            return r5
        L2c:
            r5 = move-exception
            goto L37
        L2e:
            r5 = move-exception
            goto L54
        L30:
            r6 = move-exception
            r3 = r5
            r5 = r6
            goto L65
        L34:
            r2 = move-exception
            r3 = r5
            r5 = r2
        L37:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L64
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L64
            java.lang.StringBuilder r5 = r2.append(r5)     // Catch: java.lang.Throwable -> L64
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L64
            io.agora.utils2.internal.Logging.d(r0, r5)     // Catch: java.lang.Throwable -> L64
            if (r3 == 0) goto L63
            r3.close()     // Catch: java.io.IOException -> L5f
            goto L63
        L51:
            r1 = move-exception
            r3 = r5
            r5 = r1
        L54:
            java.lang.String r1 = "failed to read from file"
            io.agora.utils2.internal.Logging.d(r0, r1, r5)     // Catch: java.lang.Throwable -> L64
            if (r3 == 0) goto L63
            r3.close()     // Catch: java.io.IOException -> L5f
            goto L63
        L5f:
            r5 = move-exception
            r5.printStackTrace()
        L63:
            return r6
        L64:
            r5 = move-exception
        L65:
            if (r3 == 0) goto L6f
            r3.close()     // Catch: java.io.IOException -> L6b
            goto L6f
        L6b:
            r6 = move-exception
            r6.printStackTrace()
        L6f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.utils2.internal.DeviceUtils.readDoubleValueFromFileFirstLine(java.lang.String, double):double");
    }
}
