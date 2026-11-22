package com.anythink.expressad.advanced.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATSDK;
import com.anythink.core.common.d.s;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.by;
import com.anythink.core.common.v.k;
import com.anythink.core.common.v.m;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.v;
import com.baidu.ar.constants.HttpConstants;
import com.phancy.mini.core.app.meta.MiniAppJson;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f4594a = "BaseDeviceInfo";
    public String e;
    public String f;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;

    /* renamed from: q, reason: collision with root package name */
    public String f4595q;
    public String r;
    public String s;
    public int t;
    public int u;
    public String d = "android";
    public String b = n.c();
    public String c = n.d();
    public String g = m.f();

    public b(Context context) {
        String str;
        this.f = m.d(context);
        int b = n.b();
        this.i = String.valueOf(b);
        this.j = n.a(context, b);
        this.k = m.h();
        this.l = com.anythink.expressad.foundation.b.a.c().g();
        this.m = com.anythink.expressad.foundation.b.a.c().f();
        this.n = String.valueOf(v.f(context));
        this.o = String.valueOf(v.e(context));
        this.f4595q = String.valueOf(v.c(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.p = MiniAppJson.LANDSCAPE;
        } else {
            this.p = MiniAppJson.PORTRAIT;
        }
        s c = t.b().c();
        if (c == null) {
            str = "";
        } else {
            str = c.fillCDataParam("at_device1|||at_device2|||at_device3");
        }
        if (TextUtils.isEmpty(str)) {
            this.e = "";
            this.h = "";
        } else {
            String[] split = str.split("\\|\\|\\|");
            try {
                this.e = split[0];
            } catch (Throwable unused) {
            }
            try {
                this.h = split[2];
            } catch (Throwable unused2) {
            }
        }
        this.r = n.f();
        this.s = n.a();
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", this.b);
            jSONObject.put(HttpConstants.HTTP_SYSTEM_VERSION, this.c);
            jSONObject.put("network_type", this.i);
            jSONObject.put("network_type_str", this.j);
            jSONObject.put("device_ua", this.k);
            by R = t.b().R();
            if (R != null) {
                jSONObject.put("has_wx", R.a());
                jSONObject.put("integrated_wx", R.b());
                jSONObject.put("opensdk_ver", new StringBuilder().append(R.c()).toString());
                jSONObject.put("wx_api_ver", new StringBuilder().append(R.d()).toString());
            }
            jSONObject.put("mnc", m.c(t.b().g()));
            jSONObject.put("mcc", m.b(t.b().g()));
            jSONObject.put("plantform", this.d);
            jSONObject.put(k.b("ZGV2aWNlX2ltZWk="), this.e);
            jSONObject.put("android_id", this.f);
            jSONObject.put("google_ad_id", this.g);
            jSONObject.put("oaid", this.h);
            jSONObject.put("appkey", this.l);
            jSONObject.put("appId", this.m);
            jSONObject.put(CommonUrlParts.SCREEN_WIDTH, this.n);
            jSONObject.put(CommonUrlParts.SCREEN_HEIGHT, this.o);
            jSONObject.put("orientation", this.p);
            jSONObject.put("scale", this.f4595q);
            if (n.k() != 0) {
                jSONObject.put("tun", n.k());
            }
            jSONObject.put("f", this.r);
            if (!ATSDK.isCnSDK()) {
                jSONObject.put("re_domain", "1");
                return jSONObject;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return jSONObject;
    }
}
