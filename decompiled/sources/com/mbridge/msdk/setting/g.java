package com.mbridge.msdk.setting;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.o0;
import org.json.JSONObject;

/* compiled from: Setting.java */
/* loaded from: classes17.dex */
public class g extends b {
    public static g C(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return b.b(new JSONObject(str));
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("Setting", "parseSetting", e);
            }
            return null;
        }
    }

    public String L0() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.anythink.expressad.f.a.b.h, k());
            jSONObject.put(com.anythink.expressad.f.a.b.m, m());
            jSONObject.put(com.anythink.expressad.f.a.b.o, B0());
            jSONObject.put("plct", Z());
            jSONObject.put(com.anythink.expressad.f.a.b.B, i());
            jSONObject.put(com.anythink.expressad.f.a.b.C, I0());
            jSONObject.put(com.anythink.expressad.f.a.b.G, J0());
            jSONObject.put("plctb", a0());
            jSONObject.put(com.anythink.expressad.f.a.b.ac, o0());
            jSONObject.put(com.anythink.expressad.f.a.b.j, P());
            jSONObject.put(com.anythink.expressad.f.a.b.k, E());
            jSONObject.put(com.anythink.expressad.f.a.b.f4754ai, l0());
            jSONObject.put(com.anythink.expressad.f.a.b.aa, W());
            jSONObject.put(com.anythink.expressad.f.a.b.at, e());
            jSONObject.put(com.anythink.expressad.f.a.b.cP, h());
            jSONObject.put(com.anythink.expressad.f.a.b.cU, U());
            jSONObject.put(com.anythink.expressad.f.a.b.dj, N());
            jSONObject.put(com.anythink.expressad.f.a.b.dx, E0());
            jSONObject.put(com.anythink.expressad.f.a.b.du, f());
            jSONObject.put("ct", t());
            jSONObject.put("isDefault", D());
            jSONObject.put(com.anythink.expressad.f.a.b.ej, n0());
            jSONObject.put("vtag", v0());
            return jSONObject.toString();
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            o0.b("Setting", "toJSON", th);
            return null;
        }
    }
}
