package sg.bigo.ads.controller.c;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.api.core.c;

/* loaded from: classes9.dex */
public final class p implements c.f {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f19866a;
    private final int b;
    private final String c;
    private final String d;
    private final String e;
    private final int f;
    private final int g;
    private final String[] h;
    private final String[] i;

    public p(JSONObject jSONObject) {
        this.f19866a = jSONObject;
        this.b = jSONObject.optInt("type", 0);
        this.c = jSONObject.optString("value", "");
        this.d = jSONObject.optString("name", "");
        this.e = jSONObject.optString(CommonUrlParts.UUID, "");
        this.f = jSONObject.optInt("replace", 0);
        this.g = jSONObject.optInt("norepeat", 0);
        JSONArray optJSONArray = jSONObject.optJSONArray("reg");
        if (optJSONArray == null) {
            this.h = new String[0];
            this.i = new String[0];
            return;
        }
        this.h = new String[optJSONArray.length()];
        this.i = new String[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                this.h[i] = optJSONObject.optString("token", "");
                this.i[i] = optJSONObject.optString("value", "");
            }
        }
    }

    @Override // sg.bigo.ads.api.core.c.f
    public final JSONObject a() {
        return this.f19866a;
    }
}
