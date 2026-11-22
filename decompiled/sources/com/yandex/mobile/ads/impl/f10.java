package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class f10 {

    /* renamed from: a, reason: collision with root package name */
    private final dk0 f15444a;

    public final a10 a(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String optString = jsonObject.optString("type");
        String optString2 = jsonObject.optString("target");
        String optString3 = jsonObject.optString("layout");
        if (optString == null || optString.length() == 0 || optString2 == null || optString2.length() == 0 || optString3 == null || optString3.length() == 0) {
            return null;
        }
        JSONArray optJSONArray = jsonObject.optJSONArray("images");
        ArrayList a2 = optJSONArray != null ? this.f15444a.a(optJSONArray) : null;
        Intrinsics.checkNotNull(optString);
        Intrinsics.checkNotNull(optString2);
        Intrinsics.checkNotNull(optString3);
        return new a10(optString, optString2, optString3, a2);
    }

    public /* synthetic */ f10() {
        this(new dk0());
    }

    public f10(dk0 imageValuesParser) {
        Intrinsics.checkNotNullParameter(imageValuesParser, "imageValuesParser");
        this.f15444a = imageValuesParser;
    }
}
