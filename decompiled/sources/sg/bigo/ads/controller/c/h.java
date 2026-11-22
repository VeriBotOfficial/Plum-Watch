package sg.bigo.ads.controller.c;

import org.json.JSONObject;
import sg.bigo.ads.api.core.i;

/* loaded from: classes9.dex */
public final class h implements i.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f19858a;
    private final int b;
    private final String c;

    public h(JSONObject jSONObject) {
        this.f19858a = jSONObject.optInt("w");
        this.b = jSONObject.optInt("h");
        this.c = jSONObject.optString("data");
    }

    @Override // sg.bigo.ads.api.core.i.b
    public final int a() {
        return this.f19858a;
    }

    @Override // sg.bigo.ads.api.core.i.b
    public final int b() {
        return this.b;
    }

    @Override // sg.bigo.ads.api.core.i.b
    public final String c() {
        return this.c;
    }
}
