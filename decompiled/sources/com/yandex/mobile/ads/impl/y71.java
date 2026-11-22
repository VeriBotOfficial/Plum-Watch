package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes5.dex */
public final class y71 {
    public static Float a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(String.format("Could not parse rating value. Rating value is %s", Arrays.copyOf(new Object[]{str}, 1)), "format(...)");
            Object[] args = new Object[0];
            int i = sp0.b;
            Intrinsics.checkNotNullParameter(args, "args");
            return null;
        }
    }
}
