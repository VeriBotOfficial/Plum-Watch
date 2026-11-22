package com.yandex.mobile.ads.impl;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
final class p30 implements q30 {
    @Override // com.yandex.mobile.ads.impl.q30
    public final List<InetAddress> a(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(hostname);
            Intrinsics.checkNotNullExpressionValue(allByName, "getAllByName(...)");
            return ArraysKt.toList(allByName);
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + hostname);
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }
}
