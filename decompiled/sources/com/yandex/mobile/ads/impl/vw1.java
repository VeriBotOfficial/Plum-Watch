package com.yandex.mobile.ads.impl;

import java.security.cert.X509Certificate;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vw1 implements tw1 {

    /* renamed from: a, reason: collision with root package name */
    private final uw1 f17200a;

    public vw1(iu1 customCertificatesProvider) {
        Intrinsics.checkNotNullParameter(customCertificatesProvider, "customCertificatesProvider");
        this.f17200a = new uw1(customCertificatesProvider);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.f17200a.a(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.f17200a.b(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return this.f17200a.c();
    }
}
