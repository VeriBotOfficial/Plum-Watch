package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class hr {

    /* renamed from: a, reason: collision with root package name */
    private final rl0 f15718a;

    public final ib0 a(String conditionKey, JSONObject jsonNativeAd) throws JSONException, t61 {
        Intrinsics.checkNotNullParameter(jsonNativeAd, "jsonNativeAd");
        Intrinsics.checkNotNullParameter(conditionKey, "conditionKey");
        JSONObject jSONObject = jsonNativeAd.getJSONObject(conditionKey);
        rl0 rl0Var = this.f15718a;
        Intrinsics.checkNotNull(jSONObject);
        return new ib0(rl0Var.a(jSONObject));
    }

    public /* synthetic */ hr() {
        this(new rl0());
    }

    public hr(rl0 installedPackagesJsonParser) {
        Intrinsics.checkNotNullParameter(installedPackagesJsonParser, "installedPackagesJsonParser");
        this.f15718a = installedPackagesJsonParser;
    }
}
