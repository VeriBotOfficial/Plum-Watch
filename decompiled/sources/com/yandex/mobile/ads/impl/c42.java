package com.yandex.mobile.ads.impl;

import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c42 {
    public static Object a(Callable tryBlock, Object obj, String whileWhat, String whatIsNull) {
        Intrinsics.checkNotNullParameter(tryBlock, "tryBlock");
        Intrinsics.checkNotNullParameter(whileWhat, "whileWhat");
        Intrinsics.checkNotNullParameter(whatIsNull, "whatIsNull");
        if (obj == null) {
            String str = whatIsNull + " is null.";
            sp0.f(new Object[0]);
            return null;
        }
        try {
            return tryBlock.call();
        } catch (Throwable unused) {
            String str2 = "Exception while " + whileWhat;
            sp0.c(new Object[0]);
            return null;
        }
    }
}
