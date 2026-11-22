package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
final class gb0 extends Lambda implements Function1<Map.Entry<? extends String, ? extends Object>, CharSequence> {
    public static final gb0 b = new gb0();

    gb0() {
        super(1);
    }

    public static String a(Map.Entry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getKey() + "=" + it.getValue();
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends String, ? extends Object> entry) {
        return a(entry);
    }
}
