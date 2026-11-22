package com.yandex.mobile.ads.impl;

import android.os.Trace;

/* loaded from: classes5.dex */
public final class u52 {
    public static void a(String str) {
        if (f92.f15466a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void a() {
        if (f92.f15466a >= 18) {
            Trace.endSection();
        }
    }
}
