package com.yandex.mobile.ads.impl;

import android.content.Context;
import io.nats.client.Options;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ft1 implements et1 {

    /* renamed from: a, reason: collision with root package name */
    private final pw1 f15527a;

    public ft1(pw1 sdkSettings) {
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        this.f15527a = sdkSettings;
    }

    @Override // com.yandex.mobile.ads.impl.et1
    public final SSLSocketFactory a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ju1 a2 = this.f15527a.a(context);
        Intrinsics.checkNotNullParameter(context, "context");
        iu1 customCertificatesProvider = new iu1(context);
        if (a2 != null && a2.l0()) {
            Intrinsics.checkNotNullParameter(customCertificatesProvider, "customCertificatesProvider");
            tw1 trustManager = pr0.a(customCertificatesProvider);
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            SSLSocketFactory socketFactory = new ct1(trustManager).a().getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getSocketFactory(...)");
            return socketFactory;
        }
        if (!pa.a(21)) {
            return null;
        }
        int i = yj1.b;
        try {
            SSLContext sSLContext = SSLContext.getInstance(Options.DEFAULT_SSL_PROTOCOL);
            try {
                sSLContext.init(null, null, null);
            } catch (KeyManagementException e) {
                sp0.b(e.getMessage());
            }
            SSLSocketFactory socketFactory2 = sSLContext.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory2, "getSocketFactory(...)");
            return new yj1(socketFactory2);
        } catch (NoSuchAlgorithmException e2) {
            sp0.b(Options.DEFAULT_SSL_PROTOCOL, e2.getMessage());
            return null;
        }
    }
}
