package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class pj0 {

    /* renamed from: a, reason: collision with root package name */
    private final q82 f16572a;
    private final s02 b;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final xj0 b(JSONObject imageObject) throws JSONException, t61 {
        r02 r02Var;
        Intrinsics.checkNotNullParameter(imageObject, "imageObject");
        int i = imageObject.getInt("w");
        int i2 = imageObject.getInt("h");
        this.f16572a.getClass();
        String a2 = q82.a("url", imageObject);
        if (imageObject.has("smartCenterSettings")) {
            s02 s02Var = this.b;
            JSONObject jSONObject = imageObject.getJSONObject("smartCenterSettings");
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            r02Var = s02Var.a(jSONObject);
        } else {
            r02Var = null;
        }
        String optString = imageObject.optString("sizeType");
        Intrinsics.checkNotNull(optString);
        if (optString.length() <= 0) {
            optString = null;
        }
        boolean optBoolean = imageObject.optBoolean("preload", true);
        String optString2 = imageObject.optString("preview");
        Intrinsics.checkNotNull(optString2);
        return new xj0(i, i2, a2, optString, r02Var, optBoolean, optString2.length() > 0 ? optString2 : null);
    }

    public /* synthetic */ pj0() {
        this(new q82(), new s02());
    }

    public pj0(q82 urlJsonParser, s02 smartCenterSettingsParser) {
        Intrinsics.checkNotNullParameter(urlJsonParser, "urlJsonParser");
        Intrinsics.checkNotNullParameter(smartCenterSettingsParser, "smartCenterSettingsParser");
        this.f16572a = urlJsonParser;
        this.b = smartCenterSettingsParser;
    }
}
