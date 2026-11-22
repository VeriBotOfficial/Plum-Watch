package com.yandex.mobile.ads.impl;

import io.nats.client.support.ApiConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class a12 {

    /* renamed from: a, reason: collision with root package name */
    private final wr0 f14961a;
    private final c12 b;

    public final z02 a(JSONObject jsonObject, xj base64EncodingParameters) throws JSONException, t61 {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        String a2 = j91.a(jsonObject, "jsonAsset", "name", "jsonAttribute", "name");
        if (a2 == null || a2.length() == 0 || Intrinsics.areEqual(a2, AbstractJsonLexerKt.NULL)) {
            throw new t61("Native Ad json has not required attributes");
        }
        Intrinsics.checkNotNull(a2);
        JSONObject jSONObject = jsonObject.getJSONObject(ApiConstants.LINK);
        wr0 wr0Var = this.f14961a;
        Intrinsics.checkNotNull(jSONObject);
        vr0 a3 = wr0Var.a(jSONObject, base64EncodingParameters);
        JSONObject jSONObject2 = jsonObject.getJSONObject("value");
        c12 c12Var = this.b;
        Intrinsics.checkNotNull(jSONObject2);
        return new z02(a3, a2, c12Var.a(jSONObject2));
    }

    public /* synthetic */ a12(wr0 wr0Var) {
        this(wr0Var, new c12());
    }

    public a12(wr0 linkJsonParser, c12 valueParser) {
        Intrinsics.checkNotNullParameter(linkJsonParser, "linkJsonParser");
        Intrinsics.checkNotNullParameter(valueParser, "valueParser");
        this.f14961a = linkJsonParser;
        this.b = valueParser;
    }
}
