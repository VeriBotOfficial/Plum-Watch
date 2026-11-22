package sg.bigo.ads.core.d.b;

import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.g;
import sg.bigo.ads.common.utils.q;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f19980a;
    private final long b = System.currentTimeMillis();
    private Map<String, String> c;

    public a(String str, Map<String, String> map) {
        this.f19980a = str;
        this.c = map;
    }

    private JSONObject a(g gVar) {
        String str;
        Object B;
        JSONObject jSONObject = new JSONObject();
        if (gVar != null) {
            try {
                jSONObject.putOpt("app_key", gVar.a());
                jSONObject.putOpt("pkg_name", gVar.b());
                jSONObject.putOpt("pkg_ver", gVar.c());
                jSONObject.putOpt("pkg_vc", Integer.valueOf(gVar.d()));
                jSONObject.putOpt("pkg_ch", gVar.e());
                jSONObject.putOpt("os", gVar.i());
                jSONObject.putOpt("os_ver", gVar.j());
                jSONObject.putOpt("os_lang", gVar.k());
                jSONObject.putOpt("vendor", gVar.l());
                jSONObject.putOpt("model", gVar.m());
                jSONObject.putOpt("isp", gVar.n());
                jSONObject.putOpt("resolution", gVar.o());
                jSONObject.putOpt("dpi", Integer.valueOf(gVar.p()));
                jSONObject.putOpt("dpi_f", gVar.q());
                jSONObject.putOpt("net", gVar.r());
                jSONObject.putOpt(com.anythink.expressad.foundation.g.a.Z, gVar.s());
                jSONObject.putOpt("country", gVar.u());
                jSONObject.putOpt("state", gVar.w());
                jSONObject.putOpt("city", gVar.x());
                jSONObject.putOpt("sdk_ver", gVar.y());
                jSONObject.putOpt("sdk_vc", 50300);
                if (sg.bigo.ads.common.x.a.p()) {
                    str = "consent_status";
                    B = Integer.valueOf(sg.bigo.ads.core.d.b.b());
                } else {
                    jSONObject.putOpt("gaid", gVar.A());
                    jSONObject.putOpt("hw_id", gVar.G());
                    jSONObject.putOpt("fire_id", gVar.ae());
                    str = "af_id";
                    B = gVar.B();
                }
                jSONObject.putOpt(str, B);
                jSONObject.putOpt("uid", gVar.C());
                jSONObject.putOpt("ts", Integer.valueOf(gVar.D()));
                jSONObject.putOpt("abflags", gVar.E());
                jSONObject.putOpt("gg_service_ver", gVar.H());
                jSONObject.putOpt("webkit_ver", gVar.I());
                jSONObject.putOpt("time", Long.valueOf(this.b));
                jSONObject.putOpt("event_id", this.f19980a);
                jSONObject.putOpt("sdk_channel", gVar.aa());
                Map<String, String> map = this.c;
                boolean z = false;
                if (map != null) {
                    if (q.a((CharSequence) map.get("session_id"))) {
                        this.c.put("session_id", UUID.randomUUID().toString());
                    } else {
                        z = true;
                    }
                    for (Map.Entry<String, String> entry : this.c.entrySet()) {
                        jSONObject.putOpt(entry.getKey(), entry.getValue());
                    }
                }
                if (!z) {
                    jSONObject.putOpt("gps_country", gVar.Q());
                    jSONObject.putOpt("sim_country", gVar.R());
                    jSONObject.putOpt("system_country", gVar.S());
                }
                jSONObject.putOpt("ts_cold", Long.valueOf(gVar.V()));
                jSONObject.putOpt("ts_hot", Long.valueOf(gVar.W()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public final sg.bigo.ads.common.g.b.b a(g gVar, long j) {
        return new sg.bigo.ads.common.g.b.b(this.f19980a, a(gVar).toString(), j);
    }
}
