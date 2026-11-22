package io.appmetrica.analytics;

import io.appmetrica.analytics.impl.C3099ae;
import io.appmetrica.analytics.impl.C3345kb;
import io.appmetrica.analytics.impl.Gc;
import io.appmetrica.analytics.impl.Q9;
import io.appmetrica.analytics.impl.Wd;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class ExternalAttributions {
    public static ExternalAttribution adjust(Object obj) {
        return obj == null ? new Wd(Q9.ADJUST) : new C3099ae(Q9.ADJUST, obj);
    }

    public static ExternalAttribution airbridge(Map<String, String> map) {
        return map == null ? new Wd(Q9.AIRBRIDGE) : new Gc(Q9.AIRBRIDGE, map);
    }

    public static ExternalAttribution appsflyer(Map<String, Object> map) {
        return map == null ? new Wd(Q9.APPSFLYER) : new Gc(Q9.APPSFLYER, map);
    }

    public static ExternalAttribution kochava(JSONObject jSONObject) {
        return jSONObject == null ? new Wd(Q9.KOCHAVA) : new C3345kb(Q9.KOCHAVA, jSONObject);
    }

    public static ExternalAttribution singular(Map<String, Object> map) {
        return map == null ? new Wd(Q9.SINGULAR) : new Gc(Q9.SINGULAR, map);
    }

    public static ExternalAttribution tenjin(Map<String, String> map) {
        return map == null ? new Wd(Q9.TENJIN) : new Gc(Q9.TENJIN, map);
    }
}
