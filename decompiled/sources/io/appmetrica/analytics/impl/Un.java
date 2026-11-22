package io.appmetrica.analytics.impl;

import com.tencent.connect.common.Constants;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Un {

    /* renamed from: a, reason: collision with root package name */
    public final Vn f18102a;

    public Un(Le le, Yn yn, String str) {
        this.f18102a = new Vn(le, yn, new Wn() { // from class: io.appmetrica.analytics.impl.Un$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.impl.Wn
            public final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
                return Un.a(jSONObject, jSONObject2);
            }
        });
    }

    public static final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        Boolean bool = Boolean.FALSE;
        jSONObject3.put("first_event_done", JsonUtils.optBooleanOrNullable(jSONObject2, "first_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "first_event_done", bool)));
        jSONObject3.put("init_event_done", JsonUtils.optBooleanOrNullable(jSONObject2, "init_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "init_event_done", bool)));
        jSONObject3.put("report_request_id", AbstractC3395mb.a(jSONObject2, "report_request_id", AbstractC3395mb.a(jSONObject, "report_request_id", -1)));
        jSONObject3.put("global_number", JsonUtils.optLongOrDefault(jSONObject2, "global_number", JsonUtils.optLongOrDefault(jSONObject, "global_number", 0L)));
        jSONObject3.put("session_id", JsonUtils.optLongOrDefault(jSONObject2, "session_id", JsonUtils.optLongOrDefault(jSONObject, "session_id", -1L)));
        jSONObject3.put("referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_handled", bool)));
        jSONObject3.put("numbers_of_type", JsonUtils.optJsonObjectOrNullable(jSONObject2, "numbers_of_type", JsonUtils.optJsonObjectOrNull(jSONObject, "numbers_of_type")));
        jSONObject3.put(Constants.JumpUrlConstants.URL_KEY_OPENID, AbstractC3395mb.a(jSONObject2, Constants.JumpUrlConstants.URL_KEY_OPENID, AbstractC3395mb.a(jSONObject, Constants.JumpUrlConstants.URL_KEY_OPENID, 1)));
        jSONObject3.put("attribution_id", AbstractC3395mb.a(jSONObject2, "attribution_id", AbstractC3395mb.a(jSONObject, "attribution_id", 1)));
        jSONObject3.put("last_migration_api_level", AbstractC3395mb.a(jSONObject2, "last_migration_api_level", AbstractC3395mb.a(jSONObject, "last_migration_api_level", 0)));
        jSONObject3.put("external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject2, "external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject, "external_attribution_window_start", -1L)));
        return jSONObject3;
    }

    public final synchronized void b(long j) {
        Vn vn = this.f18102a;
        vn.a(vn.a().put("global_number", j));
    }

    public final synchronized boolean c() {
        return this.f18102a.a().optBoolean("first_event_done", false);
    }

    public final synchronized boolean d() {
        return this.f18102a.a().optBoolean("init_event_done", false);
    }

    public final synchronized int b() {
        return this.f18102a.a().optInt(Constants.JumpUrlConstants.URL_KEY_OPENID, 1);
    }

    public final synchronized void c(long j) {
        Vn vn = this.f18102a;
        vn.a(vn.a().put("session_id", j));
    }

    public final synchronized void b(int i) {
        Vn vn = this.f18102a;
        vn.a(vn.a().put("last_migration_api_level", i));
    }

    public final synchronized void c(int i) {
        Vn vn = this.f18102a;
        vn.a(vn.a().put(Constants.JumpUrlConstants.URL_KEY_OPENID, i));
    }

    public final synchronized void a(JSONObject jSONObject) {
        Vn vn = this.f18102a;
        vn.a(vn.a().put("numbers_of_type", jSONObject));
    }

    public final synchronized int a() {
        return this.f18102a.a().optInt("attribution_id", 1);
    }

    public final synchronized void a(int i) {
        Vn vn = this.f18102a;
        vn.a(vn.a().put("attribution_id", i));
    }

    public final synchronized void a(long j) {
        Vn vn = this.f18102a;
        vn.a(vn.a().put("external_attribution_window_start", j));
    }
}
