package sg.bigo.ads.controller.c;

import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.api.core.c;

/* loaded from: classes9.dex */
public final class k implements c.b {

    /* renamed from: a, reason: collision with root package name */
    private String f19861a;
    private final String b;
    private final int c;
    private final JSONArray d;
    private final String e;
    private final int f;
    private final String g;
    private final int h;
    private final String i;
    private final Map<String, String> j = new LinkedHashMap();
    private final String k;
    private final int l;

    public k(JSONObject jSONObject) {
        this.f19861a = jSONObject.optString("land_url", "");
        this.b = jSONObject.optString("deeplink_url", "");
        this.c = jSONObject.optInt("web_ad_model", 0);
        this.e = jSONObject.optString("return_tracker_url", "");
        this.f = jSONObject.optInt("land_preload_type", 0);
        this.g = jSONObject.optString("click_open_pkg", "");
        this.h = jSONObject.optInt("probe_interval", 0);
        JSONObject optJSONObject = jSONObject.optJSONObject("pixel");
        if (optJSONObject != null) {
            this.i = optJSONObject.optString("host", "");
            String optString = optJSONObject.optString("value", "");
            if (!sg.bigo.ads.common.utils.q.a((CharSequence) optString)) {
                b(optString);
            }
        } else {
            this.i = "";
        }
        this.k = jSONObject.optString("pre_landing_url", "");
        this.l = jSONObject.optInt("pre_landing_scene", 0);
        this.d = jSONObject.optJSONArray("webview_bundle");
    }

    private void b(String str) {
        this.j.clear();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (String str2 : str.split("&")) {
            if (str2.indexOf("=") >= 0) {
                String substring = str2.substring(0, str2.indexOf("="));
                if (!TextUtils.isEmpty(substring)) {
                    String str3 = this.j.get(substring);
                    if (sg.bigo.ads.common.utils.q.b((CharSequence) str3)) {
                        str2 = str3 + "&" + str2;
                    }
                    this.j.put(substring, str2);
                }
            }
        }
    }

    @Override // sg.bigo.ads.api.core.c.b
    public final String a() {
        return this.f19861a;
    }

    @Override // sg.bigo.ads.api.core.c.b
    public final void a(String str) {
        this.f19861a = str;
    }

    @Override // sg.bigo.ads.api.core.c.b
    public final String b() {
        return this.b;
    }

    @Override // sg.bigo.ads.api.core.c.b
    public final int c() {
        return this.c;
    }

    @Override // sg.bigo.ads.api.core.c.b
    public final JSONArray d() {
        return this.d;
    }

    @Override // sg.bigo.ads.api.core.c.b
    public final String e() {
        return this.e;
    }

    @Override // sg.bigo.ads.api.core.c.b
    public final int f() {
        return this.f;
    }

    @Override // sg.bigo.ads.api.core.c.b
    public final String g() {
        return this.g;
    }

    @Override // sg.bigo.ads.api.core.c.b
    public final String h() {
        return this.i;
    }

    @Override // sg.bigo.ads.api.core.c.b
    public final Map<String, String> i() {
        return this.j;
    }

    @Override // sg.bigo.ads.api.core.c.b
    public final String j() {
        return this.k;
    }

    @Override // sg.bigo.ads.api.core.c.b
    public final int k() {
        return this.l;
    }
}
