package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class uh2 {
    public static String a(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        String obj = StringsKt.trim((CharSequence) string).toString();
        return obj.length() > 0 ? "yma_" + obj : "";
    }
}
