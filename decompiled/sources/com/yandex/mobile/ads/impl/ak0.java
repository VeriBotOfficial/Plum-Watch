package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class ak0 implements ug<xj0> {

    /* renamed from: a, reason: collision with root package name */
    private final pj0 f15013a;

    @Override // com.yandex.mobile.ads.impl.ug
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final xj0 a(JSONObject jsonAsset) throws JSONException, t61 {
        Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
        if (!jsonAsset.has("value") || jsonAsset.isNull("value")) {
            sp0.b(new Object[0]);
            throw new t61("Native Ad json has not required attributes");
        }
        JSONObject jSONObject = jsonAsset.getJSONObject("value");
        pj0 pj0Var = this.f15013a;
        Intrinsics.checkNotNull(jSONObject);
        return pj0Var.b(jSONObject);
    }

    public /* synthetic */ ak0() {
        this(new pj0());
    }

    public ak0(pj0 imageParser) {
        Intrinsics.checkNotNullParameter(imageParser, "imageParser");
        this.f15013a = imageParser;
    }
}
