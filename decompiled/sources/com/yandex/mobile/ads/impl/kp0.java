package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class kp0 {
    public static jp0 a(na1 nativeValidator, List showNotices) {
        int i;
        Integer num;
        Intrinsics.checkNotNullParameter(nativeValidator, "nativeValidator");
        Intrinsics.checkNotNullParameter(showNotices, "showNotices");
        if (!showNotices.isEmpty()) {
            Iterator it = showNotices.iterator();
            if (it.hasNext()) {
                Integer valueOf = Integer.valueOf(((ey1) it.next()).d());
                while (it.hasNext()) {
                    Integer valueOf2 = Integer.valueOf(((ey1) it.next()).d());
                    if (valueOf.compareTo(valueOf2) < 0) {
                        valueOf = valueOf2;
                    }
                }
                num = valueOf;
            } else {
                num = null;
            }
            if (num != null) {
                i = num.intValue();
                return new jp0(nativeValidator, i);
            }
        }
        i = 50;
        return new jp0(nativeValidator, i);
    }
}
