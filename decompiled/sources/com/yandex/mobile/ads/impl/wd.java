package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.x00;
import com.yandex.mobile.ads.impl.xd;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class wd implements x00.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f17238a = "com.google.android.gms.org.conscrypt";

    wd() {
    }

    @Override // com.yandex.mobile.ads.impl.x00.a
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String name = sslSocket.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return StringsKt.startsWith$default(name, this.f17238a + ".", false, 2, (Object) null);
    }

    @Override // com.yandex.mobile.ads.impl.x00.a
    public final xd b(SSLSocket sslSocket) {
        xd b;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i = xd.g;
        b = xd.a.b(sslSocket.getClass());
        return b;
    }
}
