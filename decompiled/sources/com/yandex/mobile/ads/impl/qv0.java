package com.yandex.mobile.ads.impl;

import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class qv0 {
    public static byte[] a(tv0 tv0Var, String str, int i, String str2) {
        tv0Var.getClass();
        byte[] decode = Base64.decode(str, i);
        Intrinsics.checkNotNullExpressionValue(decode, str2);
        return decode;
    }
}
