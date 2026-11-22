package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.d01;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c01 {
    @JvmStatic
    public static final void a(ArrayList report) {
        Intrinsics.checkNotNullParameter(report, "report");
        Iterator it = report.iterator();
        while (it.hasNext()) {
            d01.a aVar = (d01.a) it.next();
            int ordinal = aVar.b().ordinal();
            if (ordinal == 0) {
                hp0.b(aVar.a(), new Object[0]);
            } else if (ordinal == 1) {
                hp0.a(aVar.a(), new Object[0]);
            }
        }
    }
}
