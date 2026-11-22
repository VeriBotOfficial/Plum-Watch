package sg.bigo.ads.controller.c;

import org.json.JSONObject;
import sg.bigo.ads.api.core.i;

/* loaded from: classes9.dex */
public final class e implements i.a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f19855a;

    public e(JSONObject jSONObject) {
        this.f19855a = jSONObject.optInt("banner_pre_load", 0) == 1;
    }

    @Override // sg.bigo.ads.api.core.i.a
    public final boolean a() {
        return this.f19855a;
    }

    @Override // sg.bigo.ads.api.core.i.a
    public final String[] b() {
        return new String[0];
    }
}
