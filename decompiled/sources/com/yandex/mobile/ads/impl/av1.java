package com.yandex.mobile.ads.impl;

import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class av1 extends yz {
    private final SSLSocketFactory s;

    @Override // com.yandex.mobile.ads.impl.yz
    public final HttpURLConnection a(URL url) {
        Intrinsics.checkNotNullParameter(url, "url");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        SSLSocketFactory sSLSocketFactory = this.s;
        if (sSLSocketFactory != null && (httpURLConnection instanceof HttpsURLConnection)) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        Intrinsics.checkNotNull(httpURLConnection);
        return httpURLConnection;
    }

    public av1(String str, uh0 uh0Var, SSLSocketFactory sSLSocketFactory) {
        super(str, 8000, 8000, uh0Var);
        this.s = sSLSocketFactory;
    }
}
