package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import org.xmind.core.INotes;

/* loaded from: classes5.dex */
public final class ow0 {

    /* renamed from: a, reason: collision with root package name */
    private final o92 f16495a;

    public ow0(o92 valueReader) {
        Intrinsics.checkNotNullParameter(valueReader, "valueReader");
        this.f16495a = valueReader;
    }

    public final Object a(JSONObject jsonValue) {
        Intrinsics.checkNotNullParameter(jsonValue, "jsonValue");
        String a2 = this.f16495a.a(INotes.HTML, jsonValue);
        float f = (float) jsonValue.getDouble("aspectRatio");
        if (f == 0.0f) {
            f = 1.7777778f;
        }
        return new wu0(a2, f);
    }
}
