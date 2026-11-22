package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonBuilder;

/* loaded from: classes5.dex */
final class ex extends Lambda implements Function1<JsonBuilder, Unit> {
    public static final ex b = new ex();

    ex() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JsonBuilder jsonBuilder) {
        JsonBuilder Json = jsonBuilder;
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }
}
