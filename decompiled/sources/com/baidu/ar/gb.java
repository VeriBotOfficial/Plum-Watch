package com.baidu.ar;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.SensorManager;
import android.os.Build;
import android.text.TextUtils;
import com.autonavi.aps.amapapi.config.Const;
import com.baidu.ar.bean.ARConfig;
import com.baidu.ar.bean.DuMixARConfig;
import com.baidu.ar.constants.ARConfigKey;
import com.baidu.ar.constants.HttpConstants;
import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class gb {

    /* renamed from: a, reason: collision with root package name */
    public static String f6948a;

    public static String a(Context context) {
        if (f6948a == null && context != null) {
            UUID a2 = new h3(context).a();
            f6948a = a2 != null ? a2.toString() : "";
        }
        return f6948a;
    }

    public static void a(Context context, Map<String, Object> map) {
        if (map == null) {
            return;
        }
        String aipAppId = DuMixARConfig.getAipAppId();
        map.put(HttpConstants.AIP_APP_ID, Integer.valueOf(TextUtils.isEmpty(aipAppId) ? 0 : Integer.parseInt(aipAppId)));
        map.put(HttpConstants.IS_AIP, "3");
        Object[] signatureAndTime = ARConfig.getSignatureAndTime();
        map.put("sign", signatureAndTime[0]);
        map.put("timestamp", signatureAndTime[1]);
        map.put("user_id", a(context));
        map.put("cuid", ARConfig.getCUID());
    }

    public static void a(Context context, JSONObject jSONObject) {
        if (context == null || jSONObject == null) {
            h.b("bdar: addSystemInfo context/httpParams is null!!!");
            return;
        }
        jSONObject.put(HttpConstants.HTTP_OS_TYPE_OLD, "android");
        jSONObject.put(HttpConstants.HTTP_OS_TYPE, "android");
        jSONObject.put(HttpConstants.HTTP_ENGINE_VERSION, o.a());
        jSONObject.put("app_id", o.a(context));
        String str = Build.MODEL;
        jSONObject.put("device_id", str);
        int i = Build.VERSION.SDK_INT;
        jSONObject.put(HttpConstants.HTTP_SYSTEM_VERSION, i);
        jSONObject.put(HttpConstants.OS_BRAND, Build.BRAND.toLowerCase());
        jSONObject.put(HttpConstants.OS_MODEL, str.toLowerCase());
        jSONObject.put(HttpConstants.OS_VERSION_SDK, i);
        jSONObject.put(HttpConstants.OS_VERSION_RELESE, Build.VERSION.RELEASE);
        jSONObject.put(HttpConstants.OS_WIDTH_PIXELS, context.getResources().getDisplayMetrics().widthPixels);
        jSONObject.put(HttpConstants.OS_HEIGHT_PIXELS, context.getResources().getDisplayMetrics().heightPixels);
        jSONObject.put(HttpConstants.OS_SCALE_PDI, context.getResources().getDisplayMetrics().densityDpi);
        long[] f = nc.f();
        jSONObject.put(HttpConstants.OS_ROM_MEMORY, f[0]);
        jSONObject.put(HttpConstants.OS_ROM_AVAIL_MEMORY, f[1]);
        jSONObject.put(HttpConstants.OS_SDCARD_MEMORY, nc.h());
        jSONObject.put(HttpConstants.OS_ROM_SDCARD_AVAIL_MEMORY, nc.g());
        jSONObject.put(HttpConstants.OS_RAM_MEMEORY, nc.b(context));
        jSONObject.put(HttpConstants.OS_RAM_AVAIL_MEMORY, nc.a(context));
        if (nc.c(context)) {
            jSONObject.put(HttpConstants.OS_HAS_GYROSCOPE, 1);
        } else {
            jSONObject.put(HttpConstants.OS_HAS_GYROSCOPE, 0);
        }
        jSONObject.put(HttpConstants.OS_CPU_NAME, nc.a());
        jSONObject.put(HttpConstants.OS_CPU_NUM_CORES, nc.e());
        jSONObject.put(HttpConstants.OS_CPU_MIN_FREQ, nc.d());
        jSONObject.put(HttpConstants.OS_CPU_MAX_FREQ, nc.c());
        jSONObject.put(HttpConstants.OS_CPU_ABI, Build.CPU_ABI);
        jSONObject.put(HttpConstants.OS_CPU_CUR_FREQ, nc.b());
        jSONObject.put(HttpConstants.OS_NATIVE_HEAPSIZE, (int) (Runtime.getRuntime().maxMemory() / 1048576));
        jSONObject.put(HttpConstants.OS_NATIVE_SENSOR, ((SensorManager) context.getSystemService(ak.ac)).getDefaultSensor(4) != null);
        jSONObject.put("network_type", m9.c(context));
        jSONObject.put(HttpConstants.OS_CPU_SUPPORTED_ABIS, Arrays.asList(Build.SUPPORTED_ABIS));
        try {
            jSONObject.put(HttpConstants.HTTP_GLES_VERSION, ((ActivityManager) context.getSystemService(Const.STR_PROCESS_TAG)).getDeviceConfigurationInfo().reqGlEsVersion >> 16);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        jSONObject.put(HttpConstants.HTTP_BOARD, Build.BOARD);
        jSONObject.put(HttpConstants.HTTP_HARDWARE, Build.HARDWARE);
        jSONObject.put("manufacturer", Build.MANUFACTURER);
    }

    public static void a(Context context, JSONObject jSONObject, String str, String str2) {
        if (context == null || jSONObject == null) {
            return;
        }
        String arValue = ARConfig.getArValue();
        jSONObject.put(HttpConstants.HTTP_AR_VALUE, (arValue != null ? new JSONObject(arValue) : new JSONObject()).toString());
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("ar_key", str);
        }
        if (TextUtils.isEmpty(str2)) {
            jSONObject.put(ARConfigKey.AR_ID, "");
        } else {
            jSONObject.put(ARConfigKey.AR_ID, str2);
        }
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String aipAppId = DuMixARConfig.getAipAppId();
        a(jSONObject, TextUtils.isEmpty(aipAppId) ? 0 : Integer.parseInt(aipAppId), ARConfig.getSignatureAndTime());
    }

    public static void a(JSONObject jSONObject, int i, Object[] objArr) {
        jSONObject.put(HttpConstants.AIP_APP_ID, i);
        jSONObject.put(HttpConstants.IS_AIP, "3");
        jSONObject.put("sign", objArr[0]);
        jSONObject.put("timestamp", objArr[1]);
    }

    public static void a(JSONObject jSONObject, String str, String str2) {
        if (jSONObject == null) {
            return;
        }
        a(jSONObject, TextUtils.isEmpty(str) ? 0 : Integer.parseInt(str), ARConfig.getSignatureAndTime(str, str2));
    }

    public static void b(Context context, JSONObject jSONObject) {
        if (context == null || jSONObject == null) {
            return;
        }
        jSONObject.put("user_id", a(context));
        jSONObject.put("cuid", ARConfig.getCUID());
    }
}
