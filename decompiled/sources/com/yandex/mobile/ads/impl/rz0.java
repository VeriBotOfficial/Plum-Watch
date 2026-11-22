package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.qz0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class rz0 {
    public static boolean a(qz0 network) {
        Intrinsics.checkNotNullParameter(network, "network");
        List<qz0.c> b = network.b();
        if ((b instanceof Collection) && b.isEmpty()) {
            return true;
        }
        Iterator<T> it = b.iterator();
        while (it.hasNext()) {
            if (!((qz0.c) it.next()).c()) {
                return false;
            }
        }
        return true;
    }
}
