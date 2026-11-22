package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class e {
    public static f a(Context context) {
        if (context == null) {
            return null;
        }
        String a2 = com.alipay.apmobilesecuritysdk.f.a.a(context, "device_feature_prefs_name", "device_feature_prefs_key");
        if (com.alipay.sdk.m.d0.a.a(a2)) {
            a2 = com.alipay.apmobilesecuritysdk.f.a.a("device_feature_file_name", "device_feature_file_key");
        }
        if (com.alipay.sdk.m.d0.a.a(a2)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(a2);
            f fVar = new f();
            fVar.a(jSONObject.getString(com.qumeng.overseas.advlib.__remote__.core.coreutils.a.o));
            fVar.b(jSONObject.getString("imsi"));
            fVar.c(jSONObject.getString("mac"));
            fVar.d(jSONObject.getString("bluetoothmac"));
            fVar.e(jSONObject.getString("gsi"));
            return fVar;
        } catch (Exception e) {
            com.alipay.apmobilesecuritysdk.c.a.a(e);
            return null;
        }
    }

    public static void a(Context context, f fVar) {
        if (fVar == null || context == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.qumeng.overseas.advlib.__remote__.core.coreutils.a.o, fVar.a());
            jSONObject.put("imsi", fVar.b());
            jSONObject.put("mac", fVar.c());
            jSONObject.put("bluetoothmac", fVar.d());
            jSONObject.put("gsi", fVar.e());
            String jSONObject2 = jSONObject.toString();
            com.alipay.apmobilesecuritysdk.f.a.a("device_feature_file_name", "device_feature_file_key", jSONObject2);
            com.alipay.apmobilesecuritysdk.f.a.a(context, "device_feature_prefs_name", "device_feature_prefs_key", jSONObject2);
        } catch (Exception e) {
            com.alipay.apmobilesecuritysdk.c.a.a(e);
        }
    }
}
