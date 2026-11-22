package com.umeng.commonsdk.statistics.common;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.autonavi.aps.amapapi.config.Const;
import com.google.android.material.timepicker.TimeModel;
import com.hjq.permissions.Permission;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.w;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.idtracking.h;
import com.umeng.commonsdk.utils.UMUtils;
import com.wakeup.commponent.module.data.HealthData;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import javax.microedition.khronos.opengles.GL10;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes2.dex */
public class DeviceConfig {
    public static final int DEFAULT_TIMEZONE = 8;
    private static final String KEY_EMUI_VERSION_CODE = "ro.build.hw_emui_api_level";
    private static final String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";
    protected static final String LOG_TAG = "com.umeng.commonsdk.statistics.common.DeviceConfig";
    public static final String MOBILE_NETWORK = "2G/3G";
    public static final String UNKNOW = "";
    public static final String WIFI = "Wi-Fi";
    private static DeviceTypeEnum deviceTypeEnum = DeviceTypeEnum.DEFAULT;
    private static volatile String sWifiMac = "";
    private static volatile String sImei = "";
    private static volatile String sMeid = "";
    private static volatile String sImsi = "";
    private static volatile String sSerialNo = "";
    private static volatile String sAndroidID = "";
    private static volatile String sIDFA = "";
    private static volatile String sOAID = "";
    private static volatile String sSecondImei = "";
    private static volatile String sSimSerialNumber = "";
    private static volatile boolean sImeiOrMeidFlag = false;
    private static volatile boolean sSerialFlag = false;
    private static volatile boolean sSimSerialNumberFlag = false;
    private static volatile boolean sImsiFlag = false;
    private static volatile boolean sSecondImeiFlag = false;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0042, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 29) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0044, code lost:
    
        com.umeng.commonsdk.statistics.common.DeviceConfig.sImeiOrMeidFlag = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        com.umeng.commonsdk.statistics.common.DeviceConfig.sImei = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0053, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 29) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getImei(android.content.Context r5) {
        /*
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sImei
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.sImei
            return r5
        Lb:
            r0 = 0
            r1 = 1
            r2 = 29
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L47
            if (r3 < r2) goto L1e
            boolean r3 = com.umeng.commonsdk.statistics.common.DeviceConfig.sImeiOrMeidFlag     // Catch: java.lang.Throwable -> L47
            if (r3 == 0) goto L1e
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r2) goto L1d
            com.umeng.commonsdk.statistics.common.DeviceConfig.sImeiOrMeidFlag = r1
        L1d:
            return r0
        L1e:
            java.lang.String r3 = "header_device_id_imei"
            boolean r3 = com.umeng.commonsdk.config.FieldManager.allow(r3)     // Catch: java.lang.Throwable -> L47
            if (r3 == 0) goto L40
            if (r5 == 0) goto L40
            java.lang.String r3 = "phone"
            java.lang.Object r3 = r5.getSystemService(r3)     // Catch: java.lang.Throwable -> L47
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch: java.lang.Throwable -> L47
            if (r3 == 0) goto L40
            java.lang.String r4 = "android.permission.READ_PHONE_STATE"
            boolean r5 = checkPermission(r5, r4)     // Catch: java.lang.Throwable -> L47
            if (r5 == 0) goto L40
            java.lang.String r5 = r3.getDeviceId()     // Catch: java.lang.Throwable -> L47
            r0 = r5
        L40:
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r2) goto L56
        L44:
            com.umeng.commonsdk.statistics.common.DeviceConfig.sImeiOrMeidFlag = r1
            goto L56
        L47:
            r5 = move-exception
            boolean r3 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L51
            java.lang.String r3 = "No IMEI."
            com.umeng.commonsdk.statistics.common.MLog.w(r3, r5)     // Catch: java.lang.Throwable -> L59
        L51:
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r2) goto L56
            goto L44
        L56:
            com.umeng.commonsdk.statistics.common.DeviceConfig.sImei = r0
            return r0
        L59:
            r5 = move-exception
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L60
            com.umeng.commonsdk.statistics.common.DeviceConfig.sImeiOrMeidFlag = r1
        L60:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.getImei(android.content.Context):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 29) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        com.umeng.commonsdk.statistics.common.DeviceConfig.sImeiOrMeidFlag = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
    
        com.umeng.commonsdk.statistics.common.DeviceConfig.sImei = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0076, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0071, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 29) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getImeiNew(android.content.Context r7) {
        /*
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sImei
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r7 = com.umeng.commonsdk.statistics.common.DeviceConfig.sImei
            return r7
        Lb:
            r0 = 0
            r1 = 1
            r2 = 29
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L65
            if (r3 < r2) goto L1e
            boolean r3 = com.umeng.commonsdk.statistics.common.DeviceConfig.sImeiOrMeidFlag     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L1e
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r2) goto L1d
            com.umeng.commonsdk.statistics.common.DeviceConfig.sImeiOrMeidFlag = r1
        L1d:
            return r0
        L1e:
            java.lang.String r3 = "header_device_id_imei"
            boolean r3 = com.umeng.commonsdk.config.FieldManager.allow(r3)     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L5e
            if (r7 == 0) goto L5e
            java.lang.String r3 = "phone"
            java.lang.Object r3 = r7.getSystemService(r3)     // Catch: java.lang.Throwable -> L65
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L5e
            java.lang.String r4 = "android.permission.READ_PHONE_STATE"
            boolean r7 = checkPermission(r7, r4)     // Catch: java.lang.Throwable -> L65
            if (r7 == 0) goto L5e
            java.lang.Class r7 = r3.getClass()     // Catch: java.lang.Throwable -> L54
            java.lang.String r4 = "getImei"
            r5 = 0
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L54
            java.lang.reflect.Method r7 = r7.getMethod(r4, r6)     // Catch: java.lang.Throwable -> L54
            r7.setAccessible(r1)     // Catch: java.lang.Throwable -> L54
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L54
            java.lang.Object r7 = r7.invoke(r3, r4)     // Catch: java.lang.Throwable -> L54
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L54
            r0 = r7
        L54:
            boolean r7 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L65
            if (r7 == 0) goto L5e
            java.lang.String r0 = r3.getDeviceId()     // Catch: java.lang.Throwable -> L65
        L5e:
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r2) goto L74
        L62:
            com.umeng.commonsdk.statistics.common.DeviceConfig.sImeiOrMeidFlag = r1
            goto L74
        L65:
            r7 = move-exception
            boolean r3 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch: java.lang.Throwable -> L77
            if (r3 == 0) goto L6f
            java.lang.String r3 = "No IMEI."
            com.umeng.commonsdk.statistics.common.MLog.w(r3, r7)     // Catch: java.lang.Throwable -> L77
        L6f:
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r2) goto L74
            goto L62
        L74:
            com.umeng.commonsdk.statistics.common.DeviceConfig.sImei = r0
            return r0
        L77:
            r7 = move-exception
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L7e
            com.umeng.commonsdk.statistics.common.DeviceConfig.sImeiOrMeidFlag = r1
        L7e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.getImeiNew(android.content.Context):java.lang.String");
    }

    public static String getAndroidId(Context context) {
        if (!TextUtils.isEmpty(sAndroidID)) {
            return sAndroidID;
        }
        String str = null;
        if (FieldManager.allow(com.umeng.commonsdk.utils.b.i) && context != null) {
            try {
                str = Settings.Secure.getString(context.getContentResolver(), "android_id");
                sAndroidID = str;
                return str;
            } catch (Exception unused) {
                if (AnalyticsConstants.UM_DEBUG) {
                    MLog.w("can't read android id");
                }
            }
        }
        return str;
    }

    public static String getSerial() {
        return getSerialNo();
    }

    public static String getAppVersionCode(Context context) {
        return UMUtils.getAppVersionCode(context);
    }

    public static String getAppVersionName(Context context) {
        return UMUtils.getAppVersionName(context);
    }

    public static boolean checkPermission(Context context, String str) {
        if (context == null) {
            return false;
        }
        return ((Integer) Class.forName("android.content.Context").getMethod("checkSelfPermission", String.class).invoke(context, str)).intValue() == 0;
    }

    public static String[] getGPU(GL10 gl10) {
        try {
            return new String[]{gl10.glGetString(7936), gl10.glGetString(7937)};
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.e(LOG_TAG, "Could not read gpu infor:", th);
            }
            return new String[0];
        }
    }

    private static String getMacByJavaAPI() {
        try {
            if (!FieldManager.allow(com.umeng.commonsdk.utils.b.h)) {
                return null;
            }
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if ("wlan0".equals(nextElement.getName()) || "eth0".equals(nextElement.getName())) {
                    byte[] hardwareAddress = nextElement.getHardwareAddress();
                    if (hardwareAddress != null && hardwareAddress.length != 0) {
                        StringBuilder sb = new StringBuilder();
                        for (byte b : hardwareAddress) {
                            sb.append(String.format("%02X:", Byte.valueOf(b)));
                        }
                        if (sb.length() > 0) {
                            sb.deleteCharAt(sb.length() - 1);
                        }
                        return sb.toString().toLowerCase(Locale.getDefault());
                    }
                    return null;
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String getMacShell() {
        String reaMac;
        try {
            if (!FieldManager.allow(com.umeng.commonsdk.utils.b.h)) {
                return null;
            }
            String[] strArr = {"/sys/class/net/wlan0/address", "/sys/class/net/eth0/address", "/sys/devices/virtual/net/wlan0/address"};
            for (int i = 0; i < 3; i++) {
                try {
                    reaMac = reaMac(strArr[i]);
                } catch (Throwable th) {
                    if (AnalyticsConstants.UM_DEBUG) {
                        MLog.e(LOG_TAG, "open file  Failed", th);
                    }
                }
                if (reaMac != null) {
                    return reaMac;
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String reaMac(String str) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String str2 = null;
        try {
            fileReader = new FileReader(str);
        } catch (Throwable unused) {
        }
        try {
            bufferedReader = new BufferedReader(fileReader, 1024);
            try {
                str2 = bufferedReader.readLine();
                try {
                    fileReader.close();
                } catch (Throwable unused2) {
                }
                bufferedReader.close();
                return str2;
            } catch (Throwable th) {
                th = th;
                try {
                    fileReader.close();
                } catch (Throwable unused3) {
                }
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                        throw th;
                    } catch (Throwable unused4) {
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
    }

    public static String getCPU() {
        String str = null;
        try {
            FileReader fileReader = new FileReader("/proc/cpuinfo");
            try {
                BufferedReader bufferedReader = new BufferedReader(fileReader, 1024);
                str = bufferedReader.readLine();
                bufferedReader.close();
                fileReader.close();
            } catch (Throwable th) {
                MLog.e(LOG_TAG, "Could not read from file /proc/cpuinfo", th);
            }
        } catch (FileNotFoundException e) {
            MLog.e(LOG_TAG, "Could not open file /proc/cpuinfo", e);
        }
        if (str != null) {
            return str.substring(str.indexOf(58) + 1).trim();
        }
        return "";
    }

    public static String getDeviceId(Context context) {
        if (AnalyticsConstants.getDeviceType() == 2) {
            return getDeviceIdForBox(context);
        }
        return getDeviceIdForGeneral(context);
    }

    public static String getDeviceIdType() {
        return deviceTypeEnum.getDeviceIdType();
    }

    public static String getDeviceIdUmengMD5(Context context) {
        return HelperUtils.getUmengMD5(getDeviceId(context));
    }

    public static String getMCCMNC(Context context) {
        if (context == null) {
            return null;
        }
        if (getImsi(context) == null) {
            return null;
        }
        int i = context.getResources().getConfiguration().mcc;
        int i2 = context.getResources().getConfiguration().mnc;
        if (i != 0) {
            String valueOf = String.valueOf(i2);
            if (i2 < 10) {
                valueOf = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i2));
            }
            return new StringBuffer().append(String.valueOf(i)).append(valueOf).toString();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 29) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
    
        com.umeng.commonsdk.statistics.common.DeviceConfig.sImsiFlag = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 29) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getImsi(android.content.Context r5) {
        /*
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sImsi
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.sImsi
            return r5
        Lb:
            r0 = 0
            if (r5 != 0) goto Lf
            return r0
        Lf:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L1a
            boolean r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.sImsiFlag
            if (r1 == 0) goto L1a
            return r0
        L1a:
            java.lang.String r1 = "phone"
            java.lang.Object r1 = r5.getSystemService(r1)
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1
            java.lang.String r3 = "internal_imsi"
            boolean r3 = com.umeng.commonsdk.config.FieldManager.allow(r3)
            if (r3 == 0) goto L48
            r3 = 1
            java.lang.String r4 = "android.permission.READ_PHONE_STATE"
            boolean r5 = checkPermission(r5, r4)     // Catch: java.lang.Throwable -> L43
            if (r5 == 0) goto L3c
            if (r1 == 0) goto L3c
            java.lang.String r5 = r1.getSubscriberId()     // Catch: java.lang.Throwable -> L43
            r0 = r5
        L3c:
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r2) goto L48
        L40:
            com.umeng.commonsdk.statistics.common.DeviceConfig.sImsiFlag = r3
            goto L48
        L43:
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r2) goto L48
            goto L40
        L48:
            com.umeng.commonsdk.statistics.common.DeviceConfig.sImsi = r0
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.sImsi
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.getImsi(android.content.Context):java.lang.String");
    }

    public static String getMeid(Context context) {
        TelephonyManager telephonyManager;
        if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null || !FieldManager.allow(com.umeng.commonsdk.utils.b.aj)) {
            return null;
        }
        try {
            if (!checkPermission(context, Permission.READ_PHONE_STATE) || telephonyManager == null) {
                return null;
            }
            String meid = meid(context);
            return TextUtils.isEmpty(meid) ? getIMEI(context) : meid;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        com.umeng.commonsdk.statistics.common.DeviceConfig.sMeid = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        return com.umeng.commonsdk.statistics.common.DeviceConfig.sMeid;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 29) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String meid(android.content.Context r7) {
        /*
            java.lang.String r0 = "meid:"
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.sMeid
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto Le
            java.lang.String r7 = com.umeng.commonsdk.statistics.common.DeviceConfig.sMeid
            return r7
        Le:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            r3 = 0
            if (r1 < r2) goto L1a
            boolean r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.sImeiOrMeidFlag
            if (r1 == 0) goto L1a
            return r3
        L1a:
            if (r7 != 0) goto L1d
            return r3
        L1d:
            r7 = 1
            java.lang.String r1 = "android.telephony.TelephonyManager"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = "getMeid"
            r5 = 0
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L43
            java.lang.reflect.Method r1 = r1.getMethod(r4, r6)     // Catch: java.lang.Throwable -> L43
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L43
            java.lang.Object r1 = r1.invoke(r3, r4)     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L3c
            boolean r4 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L3c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L43
            r3 = r1
        L3c:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L5d
        L40:
            com.umeng.commonsdk.statistics.common.DeviceConfig.sImeiOrMeidFlag = r7
            goto L5d
        L43:
            r1 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = r1.getMessage()     // Catch: java.lang.Throwable -> L62
            java.lang.StringBuilder r0 = r4.append(r0)     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L62
            com.umeng.commonsdk.statistics.common.ULog.e(r0)     // Catch: java.lang.Throwable -> L62
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L5d
            goto L40
        L5d:
            com.umeng.commonsdk.statistics.common.DeviceConfig.sMeid = r3
            java.lang.String r7 = com.umeng.commonsdk.statistics.common.DeviceConfig.sMeid
            return r7
        L62:
            r0 = move-exception
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r2) goto L69
            com.umeng.commonsdk.statistics.common.DeviceConfig.sImeiOrMeidFlag = r7
        L69:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.meid(android.content.Context):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 29) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        com.umeng.commonsdk.statistics.common.DeviceConfig.sSimSerialNumberFlag = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 29) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getSimICCID(android.content.Context r4) {
        /*
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sSimSerialNumber
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.sSimSerialNumber
            return r4
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 29
            if (r0 < r2) goto L17
            boolean r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sSimSerialNumberFlag
            if (r0 == 0) goto L17
            return r1
        L17:
            java.lang.String r0 = "inner_iccid"
            boolean r0 = com.umeng.commonsdk.config.FieldManager.allow(r0)
            if (r0 == 0) goto L4f
            r0 = 1
            if (r4 == 0) goto L49
            java.lang.String r3 = "android.permission.READ_PHONE_STATE"
            boolean r3 = com.umeng.commonsdk.utils.UMUtils.checkPermission(r4, r3)     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L49
            java.lang.String r3 = "phone"
            java.lang.Object r4 = r4.getSystemService(r3)     // Catch: java.lang.Throwable -> L44
            android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4     // Catch: java.lang.Throwable -> L44
            if (r4 != 0) goto L3d
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r2) goto L3c
            com.umeng.commonsdk.statistics.common.DeviceConfig.sSimSerialNumberFlag = r0
        L3c:
            return r1
        L3d:
            java.lang.String r4 = r4.getSimSerialNumber()     // Catch: java.lang.Throwable -> L44
            com.umeng.commonsdk.statistics.common.DeviceConfig.sSimSerialNumber = r4     // Catch: java.lang.Throwable -> L44
            goto L49
        L44:
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r2) goto L4f
            goto L4d
        L49:
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r2) goto L4f
        L4d:
            com.umeng.commonsdk.statistics.common.DeviceConfig.sSimSerialNumberFlag = r0
        L4f:
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.sSimSerialNumber
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.getSimICCID(android.content.Context):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 29) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        com.umeng.commonsdk.statistics.common.DeviceConfig.sSecondImeiFlag = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 29) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getSecondSimIMEi(android.content.Context r8) {
        /*
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sSecondImei
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r8 = com.umeng.commonsdk.statistics.common.DeviceConfig.sSecondImei
            return r8
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 29
            if (r0 < r2) goto L17
            boolean r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sSecondImeiFlag
            if (r0 == 0) goto L17
            return r1
        L17:
            if (r8 == 0) goto L80
            java.lang.String r0 = "inner_imei2"
            boolean r0 = com.umeng.commonsdk.config.FieldManager.allow(r0)
            if (r0 == 0) goto L80
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.checkPermission(r8, r0)
            if (r0 == 0) goto L80
            r0 = 1
            java.lang.String r3 = "phone"
            java.lang.Object r8 = r8.getSystemService(r3)     // Catch: java.lang.Throwable -> L7a
            android.telephony.TelephonyManager r8 = (android.telephony.TelephonyManager) r8     // Catch: java.lang.Throwable -> L7a
            if (r8 != 0) goto L3d
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r2) goto L3c
            com.umeng.commonsdk.statistics.common.DeviceConfig.sSecondImeiFlag = r0
        L3c:
            return r1
        L3d:
            java.lang.Class r1 = r8.getClass()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = "getPhoneCount"
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L7a
            java.lang.reflect.Method r3 = r1.getMethod(r3, r5)     // Catch: java.lang.Throwable -> L7a
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r3 = r3.invoke(r8, r5)     // Catch: java.lang.Throwable -> L7a
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L7a
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L7a
            r5 = 2
            if (r3 != r5) goto L75
            java.lang.String r3 = "getDeviceId"
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L7a
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L7a
            r6[r4] = r7     // Catch: java.lang.Throwable -> L7a
            java.lang.reflect.Method r1 = r1.getMethod(r3, r6)     // Catch: java.lang.Throwable -> L7a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L7a
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r8 = r1.invoke(r8, r3)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L7a
            com.umeng.commonsdk.statistics.common.DeviceConfig.sSecondImei = r8     // Catch: java.lang.Throwable -> L7a
        L75:
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r2) goto L80
            goto L7e
        L7a:
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r2) goto L80
        L7e:
            com.umeng.commonsdk.statistics.common.DeviceConfig.sSecondImeiFlag = r0
        L80:
            java.lang.String r8 = com.umeng.commonsdk.statistics.common.DeviceConfig.sSecondImei
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.getSecondSimIMEi(android.content.Context):java.lang.String");
    }

    public static String getRegisteredOperator(Context context) {
        if (context == null) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (checkPermission(context, Permission.READ_PHONE_STATE) && telephonyManager != null) {
                return telephonyManager.getNetworkOperator();
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String getNetworkOperatorName(Context context) {
        if (context == null) {
            return "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (checkPermission(context, Permission.READ_PHONE_STATE) && telephonyManager != null) {
                return telephonyManager.getNetworkOperatorName();
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static String getDisplayResolution(Context context) {
        if (context == null) {
            return "";
        }
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            WindowManager windowManager2 = windowManager;
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                return String.valueOf(displayMetrics.heightPixels) + "*" + String.valueOf(displayMetrics.widthPixels);
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static String[] getNetworkAccessMode(Context context) {
        String[] strArr = {"", ""};
        if (context != null) {
            try {
                if (!checkPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    strArr[0] = "";
                    return strArr;
                }
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null) {
                    strArr[0] = "";
                    return strArr;
                }
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
                if (networkInfo != null && networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    strArr[0] = "Wi-Fi";
                    return strArr;
                }
                NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
                if (networkInfo2 != null && networkInfo2.getState() == NetworkInfo.State.CONNECTED) {
                    strArr[0] = "2G/3G";
                    strArr[1] = networkInfo2.getSubtypeName();
                }
            } catch (Throwable unused) {
            }
        }
        return strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getIPAddress(android.content.Context r7) {
        /*
            r7 = 0
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.net.SocketException -> L6a
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch: java.net.SocketException -> L6a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.net.SocketException -> L6a
            r1 = r7
        Le:
            boolean r2 = r0.hasNext()     // Catch: java.net.SocketException -> L69
            if (r2 == 0) goto L6e
            java.lang.Object r2 = r0.next()     // Catch: java.net.SocketException -> L69
            java.net.NetworkInterface r2 = (java.net.NetworkInterface) r2     // Catch: java.net.SocketException -> L69
            java.util.Enumeration r3 = r2.getInetAddresses()     // Catch: java.net.SocketException -> L69
            java.util.ArrayList r3 = java.util.Collections.list(r3)     // Catch: java.net.SocketException -> L69
            java.util.Iterator r3 = r3.iterator()     // Catch: java.net.SocketException -> L69
        L26:
            boolean r4 = r3.hasNext()     // Catch: java.net.SocketException -> L69
            if (r4 == 0) goto Le
            java.lang.Object r4 = r3.next()     // Catch: java.net.SocketException -> L69
            java.net.InetAddress r4 = (java.net.InetAddress) r4     // Catch: java.net.SocketException -> L69
            boolean r5 = r4.isLoopbackAddress()     // Catch: java.net.SocketException -> L69
            java.lang.String r6 = "dummy"
            if (r5 != 0) goto L4e
            boolean r5 = r4 instanceof java.net.Inet4Address     // Catch: java.net.SocketException -> L69
            if (r5 == 0) goto L4e
            java.lang.String r5 = r2.getDisplayName()     // Catch: java.net.SocketException -> L69
            boolean r5 = r5.contains(r6)     // Catch: java.net.SocketException -> L69
            if (r5 != 0) goto L4e
            if (r7 != 0) goto L4e
            java.lang.String r7 = r4.getHostAddress()     // Catch: java.net.SocketException -> L69
        L4e:
            boolean r5 = r4.isLoopbackAddress()     // Catch: java.net.SocketException -> L69
            if (r5 != 0) goto L26
            boolean r5 = r4 instanceof java.net.Inet6Address     // Catch: java.net.SocketException -> L69
            if (r5 == 0) goto L26
            java.lang.String r5 = r2.getDisplayName()     // Catch: java.net.SocketException -> L69
            boolean r5 = r5.contains(r6)     // Catch: java.net.SocketException -> L69
            if (r5 != 0) goto L26
            if (r1 != 0) goto L26
            java.lang.String r1 = r4.getHostAddress()     // Catch: java.net.SocketException -> L69
            goto L26
        L69:
            r7 = r1
        L6a:
            java.lang.String r0 = "SocketException"
            r1 = r7
            r7 = r0
        L6e:
            if (r7 == 0) goto L71
            return r7
        L71:
            if (r1 != 0) goto L76
            java.lang.String r1 = "null"
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.getIPAddress(android.content.Context):java.lang.String");
    }

    public static int getNetworkType(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (checkPermission(context, Permission.READ_PHONE_STATE)) {
                return telephonyManager.getNetworkType();
            }
            return 0;
        } catch (Exception unused) {
            return -100;
        }
    }

    public static boolean isWiFiAvailable(Context context) {
        if (context == null) {
            return false;
        }
        return "Wi-Fi".equals(getNetworkAccessMode(context)[0]);
    }

    public static boolean isOnline(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return false;
        }
        try {
            if (checkPermission(context, "android.permission.ACCESS_NETWORK_STATE") && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                return activeNetworkInfo.isConnectedOrConnecting();
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static int getTimeZone(Context context) {
        if (context == null) {
            return 8;
        }
        try {
            Calendar calendar = Calendar.getInstance(getLocale(context));
            if (calendar != null) {
                return calendar.getTimeZone().getRawOffset() / 3600000;
            }
        } catch (Throwable th) {
            MLog.i(LOG_TAG, "error in getTimeZone", th);
        }
        return 8;
    }

    public static boolean isChineseAera(Context context) {
        String imprintProperty;
        if (context == null) {
            return false;
        }
        try {
            imprintProperty = UMEnvelopeBuild.imprintProperty(context, "country", "");
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(imprintProperty)) {
            return imprintProperty.equals("cn");
        }
        if (getImsi(context) == null) {
            String str = getLocaleInfo(context)[0];
            if (!TextUtils.isEmpty(str) && str.equalsIgnoreCase("cn")) {
                return true;
            }
        } else {
            int i = context.getResources().getConfiguration().mcc;
            if (i != 460 && i != 461) {
                if (i == 0) {
                    String str2 = getLocaleInfo(context)[0];
                    if (TextUtils.isEmpty(str2) || !str2.equalsIgnoreCase("cn")) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static String[] getLocaleInfo(Context context) {
        String[] strArr = {"Unknown", "Unknown"};
        if (context != null) {
            try {
                Locale locale = getLocale(context);
                if (locale != null) {
                    strArr[0] = locale.getCountry();
                    strArr[1] = locale.getLanguage();
                }
                if (TextUtils.isEmpty(strArr[0])) {
                    strArr[0] = "Unknown";
                }
                if (TextUtils.isEmpty(strArr[1])) {
                    strArr[1] = "Unknown";
                }
            } catch (Throwable th) {
                MLog.e(LOG_TAG, "error in getLocaleInfo", th);
                return strArr;
            }
        }
        return strArr;
    }

    private static Locale getLocale(Context context) {
        Locale locale;
        if (context == null) {
            return Locale.getDefault();
        }
        try {
            Configuration configuration = new Configuration();
            configuration.setToDefaults();
            Settings.System.getConfiguration(context.getContentResolver(), configuration);
            locale = configuration.locale;
        } catch (Throwable unused) {
            MLog.e(LOG_TAG, "fail to read user config locale");
            locale = null;
        }
        return locale == null ? Locale.getDefault() : locale;
    }

    public static String getMac(Context context) {
        if (!TextUtils.isEmpty(sWifiMac)) {
            return sWifiMac;
        }
        String str = "";
        if (FieldManager.allow(com.umeng.commonsdk.utils.b.h)) {
            if (context == null) {
                return "";
            }
            str = getMacByJavaAPI();
            if (TextUtils.isEmpty(str)) {
                str = getMacBySystemInterface(context);
            }
        }
        sWifiMac = str;
        return sWifiMac;
    }

    private static String getMacBySystemInterface(Context context) {
        if (context == null) {
            return "";
        }
        try {
            if (FieldManager.allow(com.umeng.commonsdk.utils.b.h)) {
                WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                if (checkPermission(context, "android.permission.ACCESS_WIFI_STATE")) {
                    if (wifiManager == null) {
                        return "";
                    }
                    return wifiManager.getConnectionInfo().getMacAddress();
                }
                if (AnalyticsConstants.UM_DEBUG) {
                    MLog.w(LOG_TAG, "Could not get mac address.[no permission android.permission.ACCESS_WIFI_STATE");
                }
            }
            return "";
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.w(LOG_TAG, "Could not get mac address." + th.toString());
            }
            return "";
        }
    }

    public static int[] getResolutionArray(Context context) {
        Method method;
        if (context == null) {
            return null;
        }
        int[] iArr = new int[2];
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            try {
                Class<?> cls = Class.forName("android.view.Display");
                if (cls != null && (method = cls.getMethod("getRealMetrics", DisplayMetrics.class)) != null) {
                    method.invoke(defaultDisplay, displayMetrics);
                    int i = displayMetrics.widthPixels;
                    int i2 = displayMetrics.heightPixels;
                    if (i > i2) {
                        iArr[0] = i2;
                        iArr[1] = i;
                    } else {
                        iArr[0] = i;
                        iArr[1] = i2;
                    }
                    iArr[0] = displayMetrics.widthPixels;
                    iArr[1] = displayMetrics.heightPixels;
                    return iArr;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static int reflectMetrics(Object obj, String str) {
        try {
            Field declaredField = DisplayMetrics.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.getInt(obj);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static String getPackageName(Context context) {
        if (context == null) {
            return null;
        }
        return context.getPackageName();
    }

    public static String getAppSHA1Key(Context context) {
        try {
            return byte2HexFormatted(MessageDigest.getInstance("SHA1").digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(getPackageName(context), 64).signatures[0].toByteArray()))).getEncoded()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getAppHashKey(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(getPackageName(context), 64).signatures;
            if (signatureArr.length <= 0) {
                return null;
            }
            Signature signature = signatureArr[0];
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            messageDigest.update(signature.toByteArray());
            return Base64.encodeToString(messageDigest.digest(), 0).trim();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getAppMD5Signature(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return byte2HexFormatted(MessageDigest.getInstance("MD5").digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(getPackageName(context), 64).signatures[0].toByteArray()))).getEncoded()));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String byte2HexFormatted(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i]);
            int length = hexString.length();
            if (length == 1) {
                hexString = "0" + hexString;
            }
            if (length > 2) {
                hexString = hexString.substring(length - 2, length);
            }
            sb.append(hexString.toUpperCase(Locale.getDefault()));
            if (i < bArr.length - 1) {
                sb.append(AbstractJsonLexerKt.COLON);
            }
        }
        return sb.toString();
    }

    public static String getApplicationLable(Context context) {
        if (context == null) {
            return "";
        }
        return context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
    }

    public static String getAppName(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.loadLabel(context.getPackageManager()).toString();
        } catch (Throwable th) {
            if (!AnalyticsConstants.UM_DEBUG) {
                return null;
            }
            MLog.i(LOG_TAG, th);
            return null;
        }
    }

    public static String getDeviceIdForGeneral(Context context) {
        String str = "";
        if (context == null) {
            return "";
        }
        if (Build.VERSION.SDK_INT >= 29) {
            String oaid = getOaid(context);
            deviceTypeEnum = DeviceTypeEnum.OAID;
            if (!TextUtils.isEmpty(oaid)) {
                return oaid;
            }
            String idfa = getIdfa(context);
            deviceTypeEnum = DeviceTypeEnum.IDFA;
            if (!TextUtils.isEmpty(idfa)) {
                return idfa;
            }
            String androidId = getAndroidId(context);
            deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
            if (!TextUtils.isEmpty(androidId)) {
                return androidId;
            }
            String serialNo = getSerialNo();
            deviceTypeEnum = DeviceTypeEnum.SERIALNO;
            if (!TextUtils.isEmpty(serialNo)) {
                return serialNo;
            }
            String macByJavaAPI = getMacByJavaAPI();
            deviceTypeEnum = DeviceTypeEnum.MAC;
            if (!TextUtils.isEmpty(macByJavaAPI)) {
                return macByJavaAPI;
            }
            String macBySystemInterface = getMacBySystemInterface(context);
            deviceTypeEnum = DeviceTypeEnum.MAC;
            return macBySystemInterface;
        }
        str = getIMEI(context);
        deviceTypeEnum = DeviceTypeEnum.IMEI;
        if (TextUtils.isEmpty(str)) {
            str = getSerialNo();
            deviceTypeEnum = DeviceTypeEnum.SERIALNO;
            if (TextUtils.isEmpty(str)) {
                if (FieldManager.allow(com.umeng.commonsdk.utils.b.i)) {
                    str = getAndroidId(context);
                    deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                    if (AnalyticsConstants.UM_DEBUG) {
                        MLog.i(LOG_TAG, "getDeviceId, ANDROID_ID: " + str);
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    str = getMacByJavaAPI();
                    deviceTypeEnum = DeviceTypeEnum.MAC;
                    if (TextUtils.isEmpty(str)) {
                        str = getMacBySystemInterface(context);
                        deviceTypeEnum = DeviceTypeEnum.MAC;
                        if (AnalyticsConstants.UM_DEBUG) {
                            MLog.i(LOG_TAG, "getDeviceId, MAC: " + str);
                        }
                    }
                }
            }
        }
        return str;
    }

    public static String getDeviceIdForBox(Context context) {
        String str = "";
        if (context == null) {
            return "";
        }
        if (Build.VERSION.SDK_INT >= 29) {
            String oaid = getOaid(context);
            deviceTypeEnum = DeviceTypeEnum.OAID;
            if (!TextUtils.isEmpty(oaid)) {
                return oaid;
            }
            String idfa = getIdfa(context);
            deviceTypeEnum = DeviceTypeEnum.IDFA;
            if (!TextUtils.isEmpty(idfa)) {
                return idfa;
            }
            String androidId = getAndroidId(context);
            deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
            if (!TextUtils.isEmpty(androidId)) {
                return androidId;
            }
            String serialNo = getSerialNo();
            deviceTypeEnum = DeviceTypeEnum.SERIALNO;
            if (!TextUtils.isEmpty(serialNo)) {
                return serialNo;
            }
            String macByJavaAPI = getMacByJavaAPI();
            deviceTypeEnum = DeviceTypeEnum.MAC;
            if (!TextUtils.isEmpty(macByJavaAPI)) {
                return macByJavaAPI;
            }
            String macBySystemInterface = getMacBySystemInterface(context);
            deviceTypeEnum = DeviceTypeEnum.MAC;
            return macBySystemInterface;
        }
        if (FieldManager.allow(com.umeng.commonsdk.utils.b.i)) {
            str = getAndroidId(context);
            deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.i(LOG_TAG, "getDeviceId: ANDROID_ID: " + str);
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = getSerialNo();
            deviceTypeEnum = DeviceTypeEnum.SERIALNO;
            if (TextUtils.isEmpty(str)) {
                str = getIMEI(context);
                deviceTypeEnum = DeviceTypeEnum.IMEI;
                if (TextUtils.isEmpty(str)) {
                    str = getMacByJavaAPI();
                    deviceTypeEnum = DeviceTypeEnum.MAC;
                    if (TextUtils.isEmpty(str)) {
                        str = getMacBySystemInterface(context);
                        deviceTypeEnum = DeviceTypeEnum.MAC;
                        if (AnalyticsConstants.UM_DEBUG) {
                            MLog.i(LOG_TAG, "getDeviceId, MAC: " + str);
                        }
                    }
                }
            }
        }
        return str;
    }

    public static String getOaid(Context context) {
        if (!TextUtils.isEmpty(sOAID)) {
            return sOAID;
        }
        String str = "";
        if (!FieldManager.allow(com.umeng.commonsdk.utils.b.G)) {
            return "";
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(h.f13958a, 0);
            if (sharedPreferences == null) {
                return "";
            }
            str = sharedPreferences.getString(h.b, "");
            sOAID = str;
            return str;
        } catch (Throwable unused) {
            return str;
        }
    }

    public static String getIdfa(Context context) {
        if (!TextUtils.isEmpty(sIDFA)) {
            return sIDFA;
        }
        String str = "";
        try {
            if (!FieldManager.allow(com.umeng.commonsdk.utils.b.w)) {
                return "";
            }
            str = a.a(context);
            sIDFA = str;
            return str;
        } catch (Throwable unused) {
            return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 29) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String getIMEI(android.content.Context r6) {
        /*
            java.lang.String r0 = "getDeviceId, IMEI: "
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.sImei
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Ld
            java.lang.String r6 = com.umeng.commonsdk.statistics.common.DeviceConfig.sImei
            return r6
        Ld:
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = ""
            r3 = 29
            if (r1 < r3) goto L1a
            boolean r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.sImeiOrMeidFlag
            if (r1 == 0) goto L1a
            return r2
        L1a:
            java.lang.String r1 = "header_device_id_imei"
            boolean r1 = com.umeng.commonsdk.config.FieldManager.allow(r1)
            if (r1 == 0) goto L7c
            if (r6 != 0) goto L25
            return r2
        L25:
            java.lang.String r1 = "phone"
            java.lang.Object r1 = r6.getSystemService(r1)
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1
            if (r1 == 0) goto L7c
            r4 = 1
            java.lang.String r5 = "android.permission.READ_PHONE_STATE"
            boolean r6 = checkPermission(r6, r5)     // Catch: java.lang.Throwable -> L63
            if (r6 == 0) goto L5c
            java.lang.String r6 = r1.getDeviceId()     // Catch: java.lang.Throwable -> L63
            boolean r1 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L57
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.LOG_TAG     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r0 = r2.append(r6)     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L59
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L59
            com.umeng.commonsdk.statistics.common.MLog.i(r1, r0)     // Catch: java.lang.Throwable -> L59
        L57:
            r2 = r6
            goto L5c
        L59:
            r0 = move-exception
            r2 = r6
            goto L64
        L5c:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r3) goto L7c
        L60:
            com.umeng.commonsdk.statistics.common.DeviceConfig.sImeiOrMeidFlag = r4
            goto L7c
        L63:
            r0 = move-exception
        L64:
            boolean r6 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch: java.lang.Throwable -> L74
            if (r6 == 0) goto L6f
            java.lang.String r6 = com.umeng.commonsdk.statistics.common.DeviceConfig.LOG_TAG     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = "No IMEI."
            com.umeng.commonsdk.statistics.common.MLog.w(r6, r1, r0)     // Catch: java.lang.Throwable -> L74
        L6f:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r3) goto L7c
            goto L60
        L74:
            r6 = move-exception
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r3) goto L7b
            com.umeng.commonsdk.statistics.common.DeviceConfig.sImeiOrMeidFlag = r4
        L7b:
            throw r6
        L7c:
            com.umeng.commonsdk.statistics.common.DeviceConfig.sImei = r2
            java.lang.String r6 = com.umeng.commonsdk.statistics.common.DeviceConfig.sImei
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.getIMEI(android.content.Context):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 29) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        com.umeng.commonsdk.statistics.common.DeviceConfig.sSerialFlag = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0044, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 29) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String getSerialNo() {
        /*
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sSerialNo
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sSerialNo
            return r0
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = ""
            r2 = 29
            if (r0 < r2) goto L18
            boolean r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sSerialFlag
            if (r0 == 0) goto L18
            return r1
        L18:
            java.lang.String r0 = "header_device_id_serialNo"
            boolean r0 = com.umeng.commonsdk.config.FieldManager.allow(r0)
            if (r0 == 0) goto L47
            java.lang.String r0 = "android.os.Build"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "getSerial"
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L38
            java.lang.reflect.Method r3 = r0.getMethod(r3, r5)     // Catch: java.lang.Throwable -> L38
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r3.invoke(r0, r4)     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L38
            r1 = r0
        L38:
            r0 = 1
            com.umeng.commonsdk.statistics.common.DeviceConfig.sSerialNo = r1     // Catch: java.lang.Throwable -> L42
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r2) goto L47
        L3f:
            com.umeng.commonsdk.statistics.common.DeviceConfig.sSerialFlag = r0
            goto L47
        L42:
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r2) goto L47
            goto L3f
        L47:
            boolean r0 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r0 == 0) goto L63
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.LOG_TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getDeviceId, serial no: "
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            com.umeng.commonsdk.statistics.common.MLog.i(r0, r1)
        L63:
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sSerialNo
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.getSerialNo():java.lang.String");
    }

    public static String getSubOSName(Context context) {
        Properties buildProp = getBuildProp();
        try {
            String property = buildProp.getProperty(KEY_MIUI_VERSION_NAME);
            if (TextUtils.isEmpty(property)) {
                if (isFlyMe()) {
                    return "Flyme";
                }
                if (isEmui(buildProp)) {
                    return "Emui";
                }
                return !TextUtils.isEmpty(getYunOSVersion(buildProp)) ? "YunOS" : property;
            }
            return w.f12865a;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getSubOSVersion(Context context) {
        Properties buildProp = getBuildProp();
        try {
            String property = buildProp.getProperty(KEY_MIUI_VERSION_NAME);
            if (!TextUtils.isEmpty(property)) {
                return property;
            }
            try {
                if (isFlyMe()) {
                    property = getFlymeVersion(buildProp);
                } else if (isEmui(buildProp)) {
                    property = getEmuiVersion(buildProp);
                } else {
                    property = getYunOSVersion(buildProp);
                }
                return property;
            } catch (Throwable unused) {
                return property;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static String getYunOSVersion(Properties properties) {
        try {
            String property = properties.getProperty("ro.yunos.version");
            if (TextUtils.isEmpty(property)) {
                return null;
            }
            return property;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String getFlymeVersion(Properties properties) {
        try {
            String lowerCase = properties.getProperty("ro.build.display.id").toLowerCase(Locale.getDefault());
            if (lowerCase.contains("flyme os")) {
                return lowerCase.split(" ")[2];
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String getEmuiVersion(Properties properties) {
        try {
            return properties.getProperty(KEY_EMUI_VERSION_CODE, null);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Properties getBuildProp() {
        FileInputStream fileInputStream;
        Properties properties = new Properties();
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
            } catch (Throwable unused) {
                return properties;
            }
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                return properties;
            } catch (Throwable unused2) {
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                return properties;
            }
        } catch (Throwable unused3) {
        }
    }

    private static boolean isFlyMe() {
        try {
            Build.class.getMethod("hasSmartBar", new Class[0]);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean isEmui(Properties properties) {
        return properties.getProperty(KEY_EMUI_VERSION_CODE, null) != null;
    }

    public static String getDeviceType(Context context) {
        if (context != null) {
            try {
                if ((context.getResources().getConfiguration().screenLayout & 15) >= 3) {
                    return "Tablet";
                }
            } catch (Throwable unused) {
            }
        }
        return HealthData.TYPE_PHONE;
    }

    public static String getDBencryptID(Context context) {
        return UMUtils.genId();
    }

    public static Activity getGlobleActivity(Context context) {
        Activity activity = null;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            for (Object obj : ((Map) declaredField.get(invoke)).values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField(Const.STR_PROCESS_TAG);
                    declaredField3.setAccessible(true);
                    activity = (Activity) declaredField3.get(obj);
                }
            }
        } catch (Throwable unused) {
        }
        return activity;
    }

    public static boolean isHarmony(Context context) {
        try {
            return context.getString(Resources.getSystem().getIdentifier("config_os_brand", "string", "android")).equals("harmony");
        } catch (Throwable unused) {
            return false;
        }
    }
}
