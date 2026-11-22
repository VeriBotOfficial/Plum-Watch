package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.o0;
import org.json.JSONObject;

/* compiled from: EventLibraryCommon.java */
/* loaded from: classes17.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11608a = "c";

    /* compiled from: EventLibraryCommon.java */
    class a implements com.mbridge.msdk.tracker.h {
        a() {
        }

        @Override // com.mbridge.msdk.tracker.h
        public JSONObject a(com.mbridge.msdk.tracker.e eVar) {
            if (eVar == null) {
                return null;
            }
            JSONObject d = eVar.d();
            if (d == null) {
                d = new JSONObject();
            }
            try {
                d.put("key", eVar.b());
                Context d2 = com.mbridge.msdk.foundation.controller.c.m().d();
                int s = k0.s(d2);
                if (!d.has("network_type")) {
                    d.put("network_type", s);
                    d.put("network_str", k0.a(d2, s));
                }
                if (!d.has("st")) {
                    d.put("st", System.currentTimeMillis());
                }
                String optString = d.optString("unit_id", "");
                if (!TextUtils.isEmpty(optString)) {
                    String str = com.mbridge.msdk.foundation.controller.a.r.get(optString);
                    d.put("u_stid", str != null ? str : "");
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && !d.has("b")) {
                    d.put("b", com.mbridge.msdk.foundation.same.a.V);
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g) && !d.has("c")) {
                    d.put("c", com.mbridge.msdk.foundation.same.a.g);
                    return d;
                }
            } catch (Exception e) {
                o0.b(c.f11608a, e.getMessage());
            }
            return d;
        }
    }

    public static JSONObject b() {
        return com.mbridge.msdk.foundation.same.report.a.a();
    }

    public static com.mbridge.msdk.tracker.f c() {
        return new com.mbridge.msdk.tracker.n();
    }

    public static com.mbridge.msdk.tracker.h d() {
        return new a();
    }

    public static boolean a(String str) {
        com.mbridge.msdk.setting.g d = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.m().b());
        if (d == null) {
            return true;
        }
        return b.a(d, str);
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            jSONObject.remove("model");
            jSONObject.remove("brand");
            jSONObject.remove(com.anythink.expressad.foundation.g.a.bu);
            jSONObject.remove("sub_ip");
            jSONObject.remove("network_type");
            jSONObject.remove("useragent");
            jSONObject.remove("ua");
            jSONObject.remove("language");
            jSONObject.remove("network_str");
            jSONObject.remove("mnc");
            jSONObject.remove("mcc");
            jSONObject.remove("os_version");
            jSONObject.remove(com.anythink.expressad.foundation.g.a.bt);
            jSONObject.remove("country_code");
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
            jSONObject.remove(com.mbridge.msdk.foundation.same.net.wrapper.e.d);
            jSONObject.remove(com.mbridge.msdk.foundation.same.net.wrapper.e.e);
            jSONObject.remove("power_rate");
            jSONObject.remove("charging");
            jSONObject.remove("timezone");
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return;
        }
        jSONObject.remove("gaid");
        jSONObject.remove("gaid2");
        jSONObject.remove("oaid");
        jSONObject.remove("az_aid_info");
    }
}
