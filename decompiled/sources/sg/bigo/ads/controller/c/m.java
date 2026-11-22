package sg.bigo.ads.controller.c;

import org.json.JSONObject;
import sg.bigo.ads.api.core.c;

/* loaded from: classes9.dex */
public final class m implements c.InterfaceC1067c {

    /* renamed from: a, reason: collision with root package name */
    private final String f19863a;
    private final String b;
    private final String c;

    public m(JSONObject jSONObject) {
        this.f19863a = jSONObject.optString("vendor_url");
        this.b = jSONObject.optString("vendor_key");
        this.c = jSONObject.optString("params");
    }

    @Override // sg.bigo.ads.api.core.c.InterfaceC1067c
    public final String a() {
        return this.f19863a;
    }

    @Override // sg.bigo.ads.api.core.c.InterfaceC1067c
    public final String b() {
        return this.b;
    }

    @Override // sg.bigo.ads.api.core.c.InterfaceC1067c
    public final String c() {
        return this.c;
    }
}
