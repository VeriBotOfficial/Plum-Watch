package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public final class gj0 implements wg<xj0> {

    /* renamed from: a, reason: collision with root package name */
    private final c32 f15598a;

    @Override // com.yandex.mobile.ads.impl.wg
    public final boolean a(xj0 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        String value2 = value.f();
        if (value2 == null) {
            return false;
        }
        this.f15598a.getClass();
        Intrinsics.checkNotNullParameter(value2, "value");
        return value2.length() > 0 && !Intrinsics.areEqual(AbstractJsonLexerKt.NULL, value2);
    }

    public /* synthetic */ gj0() {
        this(new c32());
    }

    public gj0(c32 stringAssetValueValidator) {
        Intrinsics.checkNotNullParameter(stringAssetValueValidator, "stringAssetValueValidator");
        this.f15598a = stringAssetValueValidator;
    }
}
