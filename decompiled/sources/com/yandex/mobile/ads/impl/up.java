package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tp;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class up implements ug<tp> {
    @Override // com.yandex.mobile.ads.impl.ug
    public final tp a(JSONObject jsonAsset) {
        Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
        if (jsonAsset.has("value") && jsonAsset.isNull("value")) {
            return new tp(tp.a.c, null);
        }
        tp.a aVar = tp.a.b;
        String a2 = j91.a(jsonAsset, "jsonAsset", "value", "jsonAttribute", "value");
        if (a2 == null || a2.length() == 0 || Intrinsics.areEqual(a2, AbstractJsonLexerKt.NULL)) {
            throw new t61("Native Ad json has not required attributes");
        }
        Intrinsics.checkNotNull(a2);
        return new tp(aVar, a2);
    }
}
