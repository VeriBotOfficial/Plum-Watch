package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class np implements b0<x> {
    @Override // com.yandex.mobile.ads.impl.b0
    public final x a(JSONObject jsonObject) throws JSONException, t61 {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String a2 = j91.a(jsonObject, "jsonAsset", "type", "jsonAttribute", "type");
        if (a2 == null || a2.length() == 0 || Intrinsics.areEqual(a2, AbstractJsonLexerKt.NULL)) {
            throw new t61("Native Ad json has not required attributes");
        }
        Intrinsics.checkNotNull(a2);
        return new lp(a2);
    }
}
