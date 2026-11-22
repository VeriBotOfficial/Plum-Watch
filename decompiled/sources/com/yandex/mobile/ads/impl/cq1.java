package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class cq1 {
    public static String a(gi0 url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String c = url.c();
        String e = url.e();
        return e != null ? c + Separators.QUESTION + e : c;
    }
}
