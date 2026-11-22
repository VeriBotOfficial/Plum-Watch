package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class wy implements b0<uy> {

    /* renamed from: a, reason: collision with root package name */
    private final q82 f17291a;
    private final ck1 b;

    public wy(q82 urlJsonParser, ck1 preferredPackagesParser) {
        Intrinsics.checkNotNullParameter(urlJsonParser, "urlJsonParser");
        Intrinsics.checkNotNullParameter(preferredPackagesParser, "preferredPackagesParser");
        this.f17291a = urlJsonParser;
        this.b = preferredPackagesParser;
    }

    @Override // com.yandex.mobile.ads.impl.b0
    public final uy a(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String a2 = j91.a(jsonObject, "jsonAsset", "type", "jsonAttribute", "type");
        if (a2 == null || a2.length() == 0 || Intrinsics.areEqual(a2, AbstractJsonLexerKt.NULL)) {
            throw new t61("Native Ad json has not required attributes");
        }
        Intrinsics.checkNotNull(a2);
        this.f17291a.getClass();
        return new uy(a2, q82.a("fallbackUrl", jsonObject), this.b.a(jsonObject.optJSONArray("preferredPackages")));
    }
}
