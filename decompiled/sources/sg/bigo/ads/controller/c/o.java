package sg.bigo.ads.controller.c;

import org.json.JSONObject;
import sg.bigo.ads.api.core.c;

/* loaded from: classes9.dex */
public final class o implements c.e {

    /* renamed from: a, reason: collision with root package name */
    private final String f19865a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final int f;
    private final String g;
    private final String h;

    public o(JSONObject jSONObject) {
        this.f19865a = jSONObject.optString("imageurl");
        this.b = jSONObject.optString("clickurl");
        this.c = jSONObject.optString("longlegaltext");
        this.d = jSONObject.optString("ad_info");
        this.e = jSONObject.optString("ad_link");
        this.f = jSONObject.optInt("percent");
        this.g = jSONObject.optString("rec_rule");
        this.h = jSONObject.optString("user_privacy");
    }

    @Override // sg.bigo.ads.api.core.c.e
    public final String a() {
        return this.f19865a;
    }

    @Override // sg.bigo.ads.api.core.c.e
    public final String b() {
        return this.b;
    }

    @Override // sg.bigo.ads.api.core.c.e
    public final String c() {
        return this.c;
    }

    @Override // sg.bigo.ads.api.core.c.e
    public final String d() {
        return this.d;
    }

    @Override // sg.bigo.ads.api.core.c.e
    public final String e() {
        return this.e;
    }

    @Override // sg.bigo.ads.api.core.c.e
    public final int f() {
        return this.f;
    }

    @Override // sg.bigo.ads.api.core.c.e
    public final String g() {
        return this.g;
    }

    @Override // sg.bigo.ads.api.core.c.e
    public final String h() {
        return this.h;
    }
}
