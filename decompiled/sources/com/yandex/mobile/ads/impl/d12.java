package com.yandex.mobile.ads.impl;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class d12 implements b0<w02> {

    /* renamed from: a, reason: collision with root package name */
    private final xj f15238a;
    private final a12 b;

    public d12(sp1 reporter, xj base64EncodingParameters, a12 itemParser) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        Intrinsics.checkNotNullParameter(itemParser, "itemParser");
        this.f15238a = base64EncodingParameters;
        this.b = itemParser;
    }

    @Override // com.yandex.mobile.ads.impl.b0
    public final w02 a(JSONObject jsonObject) {
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
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            a12 a12Var = this.b;
            Intrinsics.checkNotNull(jSONObject);
            arrayList.add(a12Var.a(jSONObject, this.f15238a));
        }
        if (arrayList.isEmpty()) {
            throw new t61("Native Ad json has not required attributes");
        }
        return new w02(a2, arrayList);
    }
}
