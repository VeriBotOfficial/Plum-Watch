package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class ph1 implements o92 {
    @Override // com.yandex.mobile.ads.impl.o92
    public final String a(String key, JSONObject jsonObject) throws JSONException, t61 {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(key, "key");
        String a2 = j91.a(jsonObject, "jsonAsset", key, "jsonAttribute", key);
        if (a2 == null || a2.length() == 0 || Intrinsics.areEqual(a2, AbstractJsonLexerKt.NULL)) {
            throw new t61("Native Ad json has not required attributes");
        }
        Intrinsics.checkNotNull(a2);
        return a2;
    }
}
