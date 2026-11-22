package com.baidu.platform.comapi.walknavi.g.i.i;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.baidu.ar.constants.ARConfigKey;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.platform.comapi.walknavi.g.i.j.d;
import com.baidu.platform.comapi.walknavi.g.i.k.b;
import com.baidu.platform.comapi.walknavi.g.i.k.e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: StatisticInfo.java */
/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f8740a;
    private d b;
    private com.baidu.platform.comapi.walknavi.g.i.e.a c;
    private String d;
    private Context e;

    private a() {
    }

    public static a b() {
        if (f8740a == null) {
            synchronized (a.class) {
                if (f8740a == null) {
                    f8740a = new a();
                }
            }
        }
        return f8740a;
    }

    public void a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("event_id", str);
        hashMap.put("request_id", this.d);
        com.baidu.platform.comapi.walknavi.g.i.e.a aVar = this.c;
        if (aVar != null) {
            hashMap.put("ar_type", String.valueOf(aVar.c()));
        }
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("params is : " + hashMap.toString());
        Context context = this.e;
        if (context != null) {
            a(context, hashMap);
        }
    }

    private void a(Context context, Map<String, String> map) {
        String str = com.baidu.platform.comapi.walknavi.g.i.k.d.f8744a + com.baidu.platform.comapi.walknavi.g.i.k.d.c + "/count_ar";
        String uuid = new e(context).a().toString();
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            com.baidu.platform.comapi.walknavi.g.i.e.a aVar = this.c;
            if (aVar != null) {
                if (!TextUtils.isEmpty(aVar.b())) {
                    jSONObject.put("ar_key", this.c.b());
                }
                jSONObject.put(ARConfigKey.AR_ID, this.c.a());
            }
            com.baidu.platform.comapi.walknavi.g.i.j.e.a(context, jSONObject);
            jSONObject.put("time", String.valueOf(Long.valueOf(System.currentTimeMillis())));
            jSONObject.put(HttpConstants.HTTP_OS_TYPE, "android");
            jSONObject.put("os_version", Build.MODEL);
            jSONObject.put("device_type", Build.BRAND);
            jSONObject.put("device_id", uuid);
            int i = Build.VERSION.SDK_INT;
            jSONObject.put("os_version", i);
            jSONObject.put("app_version", b.a());
            jSONObject.put(HttpConstants.HTTP_ENGINE_VERSION, b.a());
            if (!TextUtils.isEmpty(b.a(context))) {
                jSONObject.put("app_id", b.a(context));
            }
            jSONObject.put(HttpConstants.HTTP_SYSTEM_VERSION, i);
        } catch (Exception unused) {
        }
        d dVar = new d(str, null);
        this.b = dVar;
        dVar.execute(jSONObject.toString());
    }

    public void a() {
        d dVar = this.b;
        if (dVar != null && !dVar.isCancelled()) {
            this.b.cancel(true);
            this.b = null;
        }
        if (f8740a != null) {
            f8740a = null;
        }
        this.d = null;
    }
}
