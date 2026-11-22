package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public final class c32 implements wg<String> {
    @Override // com.yandex.mobile.ads.impl.wg
    public final boolean a(String str) {
        String value = str;
        Intrinsics.checkNotNullParameter(value, "value");
        return value.length() > 0 && !Intrinsics.areEqual(AbstractJsonLexerKt.NULL, value);
    }
}
