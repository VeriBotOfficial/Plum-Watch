package com.yandex.mobile.ads.impl;

import android.util.Base64;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public final class uj {
    public static String a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        byte[] bytes = value.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return a(bytes);
    }

    public static String a(byte[] data) {
        Object m14057constructorimpl;
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            Result.Companion companion = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(Base64.encodeToString(data, 2));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m14060exceptionOrNullimpl(m14057constructorimpl) != null) {
            sp0.c(new Object[0]);
        }
        if (Result.m14063isFailureimpl(m14057constructorimpl)) {
            m14057constructorimpl = null;
        }
        return (String) m14057constructorimpl;
    }
}
