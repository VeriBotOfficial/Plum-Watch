package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class bb0 implements ug<za0> {

    /* renamed from: a, reason: collision with root package name */
    private final ak0 f15089a;

    public bb0(ak0 imageValueParser) {
        Intrinsics.checkNotNullParameter(imageValueParser, "imageValueParser");
        this.f15089a = imageValueParser;
    }

    @Override // com.yandex.mobile.ads.impl.ug
    public final za0 a(JSONObject jsonAsset) {
        Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
        if (jsonAsset.has("value")) {
            return new za0(!jsonAsset.isNull("value") ? this.f15089a.a(jsonAsset) : null);
        }
        sp0.b(new Object[0]);
        throw new t61("Native Ad json has not required attributes");
    }
}
