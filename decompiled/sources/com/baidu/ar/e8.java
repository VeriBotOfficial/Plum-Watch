package com.baidu.ar;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.SensorManager;
import android.os.Build;
import android.text.TextUtils;
import com.autonavi.aps.amapapi.config.Const;
import com.baidu.ar.bean.ARConfig;
import com.baidu.ar.bean.DuMixARConfig;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.ar.ihttp.HttpFactory;
import com.baidu.ar.ihttp.IHttpRequest;
import com.baidu.ar.ihttp.IHttpResponse;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class e8 implements h6 {
    public Map<String, Object> a(List<t3> list) {
        Object c;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        t3 t3Var = list.get(0);
        ArrayList<String> arrayList = new ArrayList();
        Iterator<String> e = t3Var.e();
        while (e.hasNext()) {
            String next = e.next();
            if (!"event_id".equals(next) && (c = t3Var.c(next)) != null) {
                hashMap.put(next, c);
                hashMap2.put(next, c);
                arrayList.add(next);
            }
        }
        int size = list.size();
        for (int i = 1; i < size; i++) {
            t3 t3Var2 = list.get(i);
            for (String str : arrayList) {
                if (hashMap2.containsKey(str) && !hashMap.get(str).equals(t3Var2.c(str))) {
                    hashMap2.remove(str);
                }
            }
        }
        return hashMap2;
    }

    public JSONObject a(JSONObject jSONObject, t3 t3Var) {
        String d = t3Var.d();
        if (d != null) {
            jSONObject.put("_uniq", d);
        }
        return jSONObject;
    }

    @Override // com.baidu.ar.h6
    public void a(Context context, t3 t3Var) {
        if (context == null) {
            throw new SecurityException("context is cleared");
        }
        try {
            JSONObject h = t3Var.h();
            a(h, t3Var);
            a(h, context);
            b(h);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // com.baidu.ar.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.content.Context r8, java.util.List<com.baidu.ar.t3> r9) {
        /*
            r7 = this;
            if (r8 == 0) goto L7e
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            r1 = 0
            java.util.Map r2 = r7.a(r9)     // Catch: org.json.JSONException -> L74
            if (r2 == 0) goto L13
            java.util.Set r3 = r2.keySet()     // Catch: org.json.JSONException -> L74
            goto L14
        L13:
            r3 = r1
        L14:
            java.util.Iterator r9 = r9.iterator()     // Catch: org.json.JSONException -> L74
        L18:
            boolean r4 = r9.hasNext()     // Catch: org.json.JSONException -> L74
            if (r4 == 0) goto L45
            java.lang.Object r4 = r9.next()     // Catch: org.json.JSONException -> L74
            com.baidu.ar.t3 r4 = (com.baidu.ar.t3) r4     // Catch: org.json.JSONException -> L74
            if (r1 != 0) goto L36
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L74
            r5.<init>()     // Catch: org.json.JSONException -> L74
            java.lang.String r1 = "event_id"
            java.lang.String r6 = "[multi]"
            r5.put(r1, r6)     // Catch: org.json.JSONException -> L34
            r1 = r5
            goto L36
        L34:
            r8 = move-exception
            goto L43
        L36:
            org.json.JSONObject r5 = r4.a(r3)     // Catch: org.json.JSONException -> L41
            r7.a(r5, r4)     // Catch: org.json.JSONException -> L41
            r0.put(r5)     // Catch: org.json.JSONException -> L41
            goto L18
        L41:
            r8 = move-exception
            r5 = r1
        L43:
            r1 = r5
            goto L75
        L45:
            if (r1 == 0) goto L78
            if (r2 == 0) goto L6b
            java.util.Set r9 = r2.entrySet()     // Catch: org.json.JSONException -> L74
            java.util.Iterator r9 = r9.iterator()     // Catch: org.json.JSONException -> L74
        L51:
            boolean r2 = r9.hasNext()     // Catch: org.json.JSONException -> L74
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r9.next()     // Catch: org.json.JSONException -> L74
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: org.json.JSONException -> L74
            java.lang.Object r3 = r2.getKey()     // Catch: org.json.JSONException -> L74
            java.lang.String r3 = (java.lang.String) r3     // Catch: org.json.JSONException -> L74
            java.lang.Object r2 = r2.getValue()     // Catch: org.json.JSONException -> L74
            r1.put(r3, r2)     // Catch: org.json.JSONException -> L74
            goto L51
        L6b:
            r7.a(r1, r8)     // Catch: org.json.JSONException -> L74
            java.lang.String r8 = "data"
            r1.put(r8, r0)     // Catch: org.json.JSONException -> L74
            goto L78
        L74:
            r8 = move-exception
        L75:
            r8.printStackTrace()
        L78:
            if (r1 == 0) goto L7d
            r7.b(r1)
        L7d:
            return
        L7e:
            java.lang.SecurityException r8 = new java.lang.SecurityException
            java.lang.String r9 = "context is cleared"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.ar.e8.a(android.content.Context, java.util.List):void");
    }

    public void a(Context context, JSONObject jSONObject) {
        if (context == null || jSONObject == null) {
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
    }

    public void a(JSONObject jSONObject) {
        jSONObject.put(HttpConstants.AIP_APP_ID, DuMixARConfig.getAipAppId());
        jSONObject.put(HttpConstants.IS_AIP, "3");
        Object[] signatureAndTime = ARConfig.getSignatureAndTime();
        jSONObject.put("sign", signatureAndTime[0]);
        jSONObject.put("timestamp", signatureAndTime[1]);
    }

    public void a(JSONObject jSONObject, Context context) {
        UUID a2 = new h3(context).a();
        String uuid = a2 != null ? a2.toString() : "";
        a(jSONObject);
        jSONObject.put(HttpConstants.AIP_APP_ID, DuMixARConfig.getAipAppId());
        jSONObject.put("cuid", ARConfig.getCUID());
        a(context, jSONObject);
        jSONObject.put(HttpConstants.HTTP_OS_TYPE, "android");
        jSONObject.put("os_version", Build.MODEL);
        jSONObject.put("device_type", Build.BRAND);
        jSONObject.put("user_id", uuid);
        jSONObject.put("device_id", uuid);
        int i = Build.VERSION.SDK_INT;
        jSONObject.put("os_version", i);
        jSONObject.put("app_version", o.a());
        jSONObject.put(HttpConstants.HTTP_ENGINE_VERSION, o.a());
        if (!TextUtils.isEmpty(o.a(context))) {
            jSONObject.put("app_id", o.a(context));
        }
        jSONObject.put(HttpConstants.HTTP_SYSTEM_VERSION, i);
        jSONObject.put(HttpConstants.HTTP_HARDWARE, Build.HARDWARE);
        jSONObject.put("manufacture", Build.MANUFACTURER);
        jSONObject.put(HttpConstants.HTTP_BOARD, Build.BOARD);
    }

    public void b(JSONObject jSONObject) {
        int i;
        String str;
        IHttpRequest newRequest = HttpFactory.newRequest();
        if (newRequest == null) {
            return;
        }
        newRequest.setUrl(id.j()).setMethod("POST").setBody(jSONObject);
        IHttpResponse execute = newRequest.execute();
        if (execute.isSuccess()) {
            i = execute.getCode();
            str = execute.getContent();
        } else {
            i = 0;
            str = "";
        }
        if (i != 200 || !str.equals("success")) {
            throw new IOException(String.format("stats response is error. code: %d response: %s", Integer.valueOf(i), str));
        }
    }
}
