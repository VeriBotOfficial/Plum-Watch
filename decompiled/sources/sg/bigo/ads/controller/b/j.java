package sg.bigo.ads.controller.b;

import org.json.JSONObject;
import sg.bigo.ads.api.a.m;

/* loaded from: classes9.dex */
public final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f19851a;

    public j(JSONObject jSONObject) {
        this.f19851a = jSONObject;
    }

    private Object d(String str) {
        String[] split = str.split("\\.");
        if (split.length == 0) {
            return null;
        }
        JSONObject jSONObject = this.f19851a;
        for (int i = 0; i < split.length - 1; i++) {
            jSONObject = jSONObject.optJSONObject(split[i]);
            if (jSONObject == null) {
                return null;
            }
        }
        return jSONObject.opt(split[split.length - 1]);
    }

    @Override // sg.bigo.ads.api.a.m
    public final int a(String str) {
        Integer a2 = sg.bigo.ads.common.utils.j.a(d(str));
        if (a2 != null) {
            return a2.intValue();
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.a.m
    public final int a(String str, int i) {
        Integer a2 = sg.bigo.ads.common.utils.j.a(d(str));
        return a2 != null ? a2.intValue() : i;
    }

    @Override // sg.bigo.ads.api.a.m
    public final float b(String str) {
        Float b = sg.bigo.ads.common.utils.j.b(d(str));
        if (b != null) {
            return b.floatValue();
        }
        return 0.0f;
    }

    @Override // sg.bigo.ads.api.a.m
    public final boolean c(String str) {
        return a(str) == 1;
    }

    public final String toString() {
        return this.f19851a.toString();
    }
}
