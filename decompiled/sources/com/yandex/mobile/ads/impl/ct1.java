package com.yandex.mobile.ads.impl;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ct1 {

    /* renamed from: a, reason: collision with root package name */
    private final X509TrustManager f15223a;

    public ct1(tw1 trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        this.f15223a = trustManager;
    }

    public final SSLContext a() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new X509TrustManager[]{this.f15223a}, null);
            Intrinsics.checkNotNull(sSLContext);
            return sSLContext;
        } catch (KeyManagementException e) {
            throw new IllegalStateException("Failed to initialize SSLContext", e);
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No system TLS", e2);
        }
    }
}
