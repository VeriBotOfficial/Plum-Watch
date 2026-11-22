package com.yandex.mobile.ads.impl;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class eo {

    public static final class a {
        public static eo a(X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            return rh1.f16765a.a(trustManager);
        }
    }

    public abstract List a(String str, List list) throws SSLPeerUnverifiedException;
}
