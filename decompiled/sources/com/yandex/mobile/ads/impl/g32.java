package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class g32 implements ug<String> {
    @Override // com.yandex.mobile.ads.impl.ug
    public final String a(JSONObject jsonAsset) {
        Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
        String a2 = j91.a(jsonAsset, "jsonAsset", "value", "jsonAttribute", "value");
        if (a2 == null || a2.length() == 0 || Intrinsics.areEqual(a2, AbstractJsonLexerKt.NULL)) {
            throw new t61("Native Ad json has not required attributes");
        }
        Intrinsics.checkNotNull(a2);
        return a2;
    }
}
