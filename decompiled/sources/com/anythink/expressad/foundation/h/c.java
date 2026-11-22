package com.anythink.expressad.foundation.h;

import android.content.Context;
import com.anythink.core.common.h.by;
import com.baidu.ar.constants.HttpConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class c {
    private static final String A = "landscape";
    private static final String z = "portrait";
    public String d;
    public String e;
    public String g;
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
    public String f4918q;
    public String r;
    public String s;
    public String t;
    public String u;
    public int v;
    public String w;
    public String x;
    public JSONObject y;
    public String c = "android";

    /* renamed from: a, reason: collision with root package name */
    public String f4917a = n.c();
    public String b = n.d();
    public String f = com.anythink.core.common.v.m.f();

    public c(Context context) {
        String str;
        this.d = com.anythink.core.common.v.m.d(context);
        int b = n.b();
        this.g = String.valueOf(b);
        this.h = n.a(context, b);
        this.i = com.anythink.core.common.v.m.h();
        this.j = com.anythink.expressad.foundation.b.a.c().g();
        this.k = com.anythink.expressad.foundation.b.a.c().f();
        this.l = String.valueOf(v.f(context));
        this.m = String.valueOf(v.e(context));
        this.r = String.valueOf(v.c(context));
        this.s = com.anythink.expressad.foundation.b.a.c().j().toString();
        this.u = com.anythink.core.common.v.m.b();
        this.v = com.anythink.core.common.o.a().c();
        if (context.getResources().getConfiguration().orientation == 2) {
            this.n = "landscape";
        } else {
            this.n = "portrait";
        }
        com.anythink.core.common.d.s c = com.anythink.core.common.d.t.b().c();
        if (c != null) {
            str = c.fillCDataParam("at_device1|||at_device2|||at_device3");
        } else {
            str = "|||";
        }
        String[] split = str.split("\\|\\|\\|");
        if (split != null) {
            this.e = split.length > 0 ? split[0] : "";
            this.w = split.length > 1 ? split[1] : "";
            this.f4918q = split.length > 2 ? split[2] : "";
        }
        this.o = com.anythink.expressad.foundation.g.a.cs;
        this.p = com.anythink.expressad.foundation.g.a.ct;
        this.t = n.f();
        this.x = n.a();
        this.y = b();
    }

    private JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cid", new StringBuilder().append(n.j()).toString());
            jSONObject.put("dmt", new StringBuilder().append(n.g()).toString());
            jSONObject.put("dmf", n.h());
            jSONObject.put("ct", n.i());
            jSONObject.put(com.anythink.core.common.v.k.b("aW1laQ=="), this.e);
            jSONObject.put(com.anythink.core.common.v.k.b("bWFj"), this.w);
            jSONObject.put("oaid", this.f4918q);
            jSONObject.put("android_id", this.d);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", this.f4917a);
            jSONObject.put(HttpConstants.HTTP_SYSTEM_VERSION, this.b);
            jSONObject.put("network_type", this.g);
            jSONObject.put("network_type_str", this.h);
            jSONObject.put("device_ua", this.i);
            by R = com.anythink.core.common.d.t.b().R();
            if (R != null) {
                jSONObject.put("has_wx", R.a());
                jSONObject.put("integrated_wx", R.b());
                jSONObject.put("opensdk_ver", new StringBuilder().append(R.c()).toString());
                jSONObject.put("wx_api_ver", new StringBuilder().append(R.d()).toString());
            }
            jSONObject.put("brand", this.u);
            jSONObject.put("mnc", com.anythink.core.common.v.m.c(com.anythink.core.common.d.t.b().g()));
            jSONObject.put("mcc", com.anythink.core.common.v.m.b(com.anythink.core.common.d.t.b().g()));
            jSONObject.put("plantform", this.c);
            jSONObject.put(com.anythink.core.common.v.k.b("ZGV2aWNlX2ltZWk="), this.e);
            jSONObject.put("android_id", this.d);
            jSONObject.put("google_ad_id", this.f);
            jSONObject.put("oaid", this.f4918q);
            jSONObject.put("az_aid_info", this.x);
            jSONObject.put("appkey", this.j);
            jSONObject.put("appId", this.k);
            jSONObject.put(CommonUrlParts.SCREEN_WIDTH, this.l);
            jSONObject.put(CommonUrlParts.SCREEN_HEIGHT, this.m);
            jSONObject.put("orientation", this.n);
            jSONObject.put("scale", this.r);
            jSONObject.put("b", this.o);
            jSONObject.put("c", this.p);
            jSONObject.put("web_env", this.s);
            jSONObject.put("f", this.t);
            jSONObject.put("misk_spt", this.v);
            if (n.k() != 0) {
                jSONObject.put("tun", new StringBuilder().append(n.k()).toString());
            }
            jSONObject.put("dvi", com.anythink.core.express.a.a.a(this.y.toString()));
            boolean b = com.anythink.core.common.v.p.b();
            jSONObject.put(com.anythink.expressad.foundation.g.f.h.b.d, (com.anythink.core.d.d.a(com.anythink.core.common.d.t.b().g()).b(com.anythink.core.common.d.t.b().p()).C() == 2 && b) ? "1" : "0");
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}
