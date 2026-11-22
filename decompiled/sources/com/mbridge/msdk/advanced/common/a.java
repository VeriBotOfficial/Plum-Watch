package com.mbridge.msdk.advanced.common;

import android.content.Context;
import com.baidu.ar.constants.HttpConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.tools.f;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.phancy.mini.core.app.meta.MiniAppJson;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BaseDeviceInfo.java */
/* loaded from: classes17.dex */
public class a {
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public int p;

    /* renamed from: q, reason: collision with root package name */
    public int f11256q;
    public String c = "android";

    /* renamed from: a, reason: collision with root package name */
    public String f11255a = k0.t();
    public String b = k0.q();
    public String d = f.d();

    public a(Context context) {
        int s = k0.s(context);
        this.e = String.valueOf(s);
        this.f = k0.a(context, s);
        this.g = k0.l(context);
        this.h = com.mbridge.msdk.foundation.controller.c.m().c();
        this.i = com.mbridge.msdk.foundation.controller.c.m().b();
        this.j = String.valueOf(t0.g(context));
        this.k = String.valueOf(t0.f(context));
        this.m = String.valueOf(t0.d(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.l = MiniAppJson.LANDSCAPE;
        } else {
            this.l = MiniAppJson.PORTRAIT;
        }
        this.n = k0.u();
        this.o = f.e();
        this.p = f.a();
        this.f11256q = com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? 1 : 0;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("device", this.f11255a);
                jSONObject.put(HttpConstants.HTTP_SYSTEM_VERSION, this.b);
                jSONObject.put("network_type", this.e);
                jSONObject.put("network_type_str", this.f);
                jSONObject.put("device_ua", this.g);
                jSONObject.put("has_wx", k0.D(com.mbridge.msdk.foundation.controller.c.m().d()));
                jSONObject.put("integrated_wx", k0.D());
                jSONObject.put("opensdk_ver", k0.B() + "");
                jSONObject.put("wx_api_ver", k0.e(com.mbridge.msdk.foundation.controller.c.m().i()) + "");
                jSONObject.put("mnc", k0.r(com.mbridge.msdk.foundation.controller.c.m().d()));
                jSONObject.put("mcc", k0.q(com.mbridge.msdk.foundation.controller.c.m().d()));
                jSONObject.put("adid_limit", this.p);
                jSONObject.put("adid_limit_dev", this.f11256q);
            }
            jSONObject.put("plantform", this.c);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.d);
                jSONObject.put("az_aid_info", this.o);
            }
            jSONObject.put("appkey", this.h);
            jSONObject.put("appId", this.i);
            jSONObject.put(CommonUrlParts.SCREEN_WIDTH, this.j);
            jSONObject.put(CommonUrlParts.SCREEN_HEIGHT, this.k);
            jSONObject.put("orientation", this.l);
            jSONObject.put("scale", this.m);
            if (k0.y() != 0) {
                jSONObject.put("tun", k0.y());
            }
            jSONObject.put("f", this.n);
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
                return jSONObject;
            }
        } catch (JSONException e) {
            o0.b("BaseDeviceInfo", e.getMessage());
        }
        return jSONObject;
    }
}
