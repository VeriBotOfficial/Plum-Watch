package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class tj implements o92 {

    /* renamed from: a, reason: collision with root package name */
    private final sj f16975a;

    public tj(sj base64Decoder) {
        Intrinsics.checkNotNullParameter(base64Decoder, "base64Decoder");
        this.f16975a = base64Decoder;
    }

    @Override // com.yandex.mobile.ads.impl.o92
    public final String a(String key, JSONObject jsonObject) throws JSONException, t61 {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(key, "key");
        String a2 = j91.a(jsonObject, "jsonAsset", key, "jsonAttribute", key);
        if (a2 == null || a2.length() == 0 || Intrinsics.areEqual(a2, AbstractJsonLexerKt.NULL)) {
            throw new t61("Native Ad json has not required attributes");
        }
        Intrinsics.checkNotNull(a2);
        this.f16975a.getClass();
        String b = sj.b(a2);
        if (b == null || b.length() == 0) {
            throw new t61("Native Ad json has attribute with broken base64 encoding");
        }
        return b;
    }
}
