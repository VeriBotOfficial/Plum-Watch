package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class c12 implements ug<b12> {

    /* renamed from: a, reason: collision with root package name */
    private final pj0 f15152a;

    @Override // com.yandex.mobile.ads.impl.ug
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final b12 a(JSONObject jsonAsset) throws JSONException, t61 {
        Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
        String a2 = j91.a(jsonAsset, "jsonAsset", "title", "jsonAttribute", "title");
        if (a2 == null || a2.length() == 0 || Intrinsics.areEqual(a2, AbstractJsonLexerKt.NULL)) {
            throw new t61("Native Ad json has not required attributes");
        }
        Intrinsics.checkNotNull(a2);
        JSONObject jSONObject = jsonAsset.getJSONObject("image");
        pj0 pj0Var = this.f15152a;
        Intrinsics.checkNotNull(jSONObject);
        return new b12(pj0Var.b(jSONObject), a2);
    }

    public /* synthetic */ c12() {
        this(new pj0());
    }

    public c12(pj0 imageParser) {
        Intrinsics.checkNotNullParameter(imageParser, "imageParser");
        this.f15152a = imageParser;
    }
}
