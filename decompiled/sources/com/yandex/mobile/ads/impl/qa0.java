package com.yandex.mobile.ads.impl;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.mobile.ads.impl.oa0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class qa0 implements b0<oa0> {

    /* renamed from: a, reason: collision with root package name */
    private final q82 f16646a;

    public qa0(q82 urlJsonParser) {
        Intrinsics.checkNotNullParameter(urlJsonParser, "urlJsonParser");
        this.f16646a = urlJsonParser;
    }

    @Override // com.yandex.mobile.ads.impl.b0
    public final oa0 a(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String a2 = j91.a(jsonObject, "jsonAsset", "type", "jsonAttribute", "type");
        if (a2 == null || a2.length() == 0 || Intrinsics.areEqual(a2, AbstractJsonLexerKt.NULL)) {
            throw new t61("Native Ad json has not required attributes");
        }
        Intrinsics.checkNotNull(a2);
        JSONArray jSONArray = jsonObject.getJSONArray(FirebaseAnalytics.Param.ITEMS);
        Intrinsics.checkNotNull(jSONArray);
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jsonAsset = jSONArray.getJSONObject(i);
            Intrinsics.checkNotNull(jsonAsset);
            Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
            Intrinsics.checkNotNullParameter("title", "jsonAttribute");
            String optString = jsonAsset.optString("title");
            if (optString == null || optString.length() == 0 || Intrinsics.areEqual(optString, AbstractJsonLexerKt.NULL)) {
                throw new t61("Native Ad json has not required attributes");
            }
            Intrinsics.checkNotNull(optString);
            this.f16646a.getClass();
            arrayList.add(new oa0.a(optString, q82.a("url", jsonAsset)));
        }
        if (arrayList.isEmpty()) {
            throw new t61("Native Ad json has not required attributes");
        }
        return new oa0(a2, arrayList);
    }
}
