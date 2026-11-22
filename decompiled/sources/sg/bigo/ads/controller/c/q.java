package sg.bigo.ads.controller.c;

import org.json.JSONObject;
import sg.bigo.ads.api.core.o;

/* loaded from: classes9.dex */
public final class q implements o.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f19867a;
    private final int b;
    private final String c;

    public q(JSONObject jSONObject) {
        this.f19867a = jSONObject.optInt("w");
        this.b = jSONObject.optInt("h");
        this.c = jSONObject.optString("data");
    }

    @Override // sg.bigo.ads.api.core.o.c
    public final int a() {
        return this.f19867a;
    }

    @Override // sg.bigo.ads.api.core.o.c
    public final int b() {
        return this.b;
    }

    @Override // sg.bigo.ads.api.core.o.c
    public final String c() {
        return this.c;
    }
}
