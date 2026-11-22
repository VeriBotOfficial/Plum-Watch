package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class f1 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f6237a;

    public f1(JSONObject jSONObject) {
        this.f6237a = jSONObject;
    }

    protected Integer a() {
        return JsonUtils.getInteger(this.f6237a, "dark_mode_toolbar_color", null);
    }

    protected String b() {
        return JsonUtils.getString(this.f6237a, "digital_asset_link_url", null);
    }

    protected Boolean c() {
        return JsonUtils.getBoolean(this.f6237a, "instant_apps_enabled", null);
    }

    protected String d() {
        return JsonUtils.getString(this.f6237a, "referrer", null);
    }

    protected Integer e() {
        return JsonUtils.getInteger(this.f6237a, "session_url_relation", null);
    }

    protected Integer f() {
        return JsonUtils.getInteger(this.f6237a, "share_state", null);
    }

    protected Boolean g() {
        return JsonUtils.getBoolean(this.f6237a, "should_show_title", null);
    }

    protected Integer h() {
        return JsonUtils.getInteger(this.f6237a, "toolbar_color", null);
    }

    protected Boolean i() {
        return JsonUtils.getBoolean(this.f6237a, "url_bar_hiding_enabled", null);
    }
}
