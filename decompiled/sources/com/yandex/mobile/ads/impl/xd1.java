package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class xd1 implements ug<String> {

    /* renamed from: a, reason: collision with root package name */
    private final rr1 f17329a;

    public xd1(rr1 reviewCountFormatter) {
        Intrinsics.checkNotNullParameter(reviewCountFormatter, "reviewCountFormatter");
        this.f17329a = reviewCountFormatter;
    }

    @Override // com.yandex.mobile.ads.impl.ug
    public final String a(JSONObject jsonAsset) {
        Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
        String a2 = j91.a(jsonAsset, "jsonAsset", "name", "jsonAttribute", "name");
        if (a2 == null || a2.length() == 0 || Intrinsics.areEqual(a2, AbstractJsonLexerKt.NULL)) {
            throw new t61("Native Ad json has not required attributes");
        }
        Intrinsics.checkNotNull(a2);
        Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
        Intrinsics.checkNotNullParameter("value", "jsonAttribute");
        String optString = jsonAsset.optString("value");
        if (optString == null || optString.length() == 0 || Intrinsics.areEqual(optString, AbstractJsonLexerKt.NULL)) {
            throw new t61("Native Ad json has not required attributes");
        }
        Intrinsics.checkNotNull(optString);
        return Intrinsics.areEqual("review_count", a2) ? this.f17329a.a(optString) : optString;
    }
}
