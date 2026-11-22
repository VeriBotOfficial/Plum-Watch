package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class lb implements b0<x> {

    /* renamed from: a, reason: collision with root package name */
    private final q82 f16094a;
    private final a72 b;

    public lb(q82 urlJsonParser, a72 trackingUrlsParser) {
        Intrinsics.checkNotNullParameter(urlJsonParser, "urlJsonParser");
        Intrinsics.checkNotNullParameter(trackingUrlsParser, "trackingUrlsParser");
        this.f16094a = urlJsonParser;
        this.b = trackingUrlsParser;
    }

    @Override // com.yandex.mobile.ads.impl.b0
    public final x a(JSONObject jsonObject) throws JSONException, t61 {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String a2 = j91.a(jsonObject, "jsonAsset", "type", "jsonAttribute", "type");
        if (a2 == null || a2.length() == 0 || Intrinsics.areEqual(a2, AbstractJsonLexerKt.NULL)) {
            throw new t61("Native Ad json has not required attributes");
        }
        Intrinsics.checkNotNull(a2);
        this.f16094a.getClass();
        String a3 = q82.a("url", jsonObject);
        String a4 = wq0.a("optOutUrl", jsonObject);
        if (a4 == null) {
            a4 = "";
        }
        this.b.getClass();
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        JSONArray jSONArray = jsonObject.getJSONArray("trackingUrls");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            Intrinsics.checkNotNull(string);
            arrayList.add(string);
        }
        return new jb(a2, a3, a4, arrayList);
    }
}
