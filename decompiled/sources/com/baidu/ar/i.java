package com.baidu.ar;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import com.baidu.ar.arplay.core.engine.ARPScriptEnvironment;
import com.baidu.ar.bean.ARConfig;
import com.baidu.ar.constants.HttpConstants;
import com.umeng.analytics.pro.ak;
import java.util.HashMap;
import java.util.UUID;

/* loaded from: classes12.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public String f6974a;
    public String b;
    public String c;
    public String d;

    public i(Context context) {
        this.f6974a = "default";
        this.c = "0";
        this.d = "0";
        UUID a2 = new h3(context).a();
        if (a2 != null) {
            this.f6974a = a2.toString();
        }
        this.b = o.a(context);
        for (Sensor sensor : ((SensorManager) context.getSystemService(ak.ac)).getSensorList(-1)) {
            if (sensor.getType() == 4) {
                this.c = "1";
            }
            if (sensor.getType() == 11) {
                this.d = "1";
            }
        }
    }

    public void a() {
        c();
        b();
    }

    public void a(String str, Object obj) {
        ARPScriptEnvironment.getInstance().setDataPipKV(str, obj);
    }

    public final void b() {
        HashMap hashMap = new HashMap();
        hashMap.put("android.sensor.gyroscope", this.c);
        hashMap.put("android.sensor.rotation_vector", this.d);
        ARPScriptEnvironment.getInstance().setSharedEnvironmentKV("deviceinfo", hashMap);
    }

    public final void c() {
        HashMap hashMap = new HashMap();
        hashMap.put("app_version", String.valueOf(o.a()));
        hashMap.put("ar_key", ARConfig.getARKey());
        hashMap.put("ar_type", Integer.valueOf(ARConfig.getARType()));
        hashMap.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("device_id", this.f6974a);
        hashMap.put("extra_info", ARConfig.getARExtraInfo());
        hashMap.put(HttpConstants.HTTP_OS_TYPE, "android");
        hashMap.put("device_type", Build.BRAND);
        hashMap.put("channel", this.b);
        ARPScriptEnvironment.getInstance().setSharedEnvironmentKV("userinfo", hashMap);
    }
}
