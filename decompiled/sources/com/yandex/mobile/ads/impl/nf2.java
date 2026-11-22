package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.pw1;
import kotlin.ranges.RangesKt;

/* loaded from: classes5.dex */
public final class nf2 {
    public static int a() {
        int i = pw1.l;
        Integer e = pw1.a.a().e();
        if (e != null) {
            return RangesKt.coerceIn(e.intValue(), 1, 4);
        }
        return 4;
    }
}
