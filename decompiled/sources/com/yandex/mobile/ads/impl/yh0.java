package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class yh0 implements ct {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17423a;
    private final et1 b;

    public yh0(Context context, et1 sslSocketFactoryCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sslSocketFactoryCreator, "sslSocketFactoryCreator");
        this.f17423a = context;
        this.b = sslSocketFactoryCreator;
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final boolean a(String host) {
        HttpsURLConnection httpsURLConnection;
        Intrinsics.checkNotNullParameter(host, "host");
        boolean z = false;
        try {
            httpsURLConnection = b(host);
        } catch (Throwable unused) {
            httpsURLConnection = null;
        }
        try {
            int responseCode = httpsURLConnection.getResponseCode();
            if (200 <= responseCode && responseCode < 500) {
                z = true;
            }
            httpsURLConnection.disconnect();
            return z;
        } catch (Throwable unused2) {
            try {
                sp0.c(new Object[0]);
                return false;
            } finally {
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
            }
        }
    }

    private final HttpsURLConnection b(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 13);
        if (!StringsKt.startsWith$default(str, "https://", false, 2, (Object) null)) {
            sb.append("https://");
        }
        sb.append(str);
        if (!StringsKt.endsWith$default(str, "/ping", false, 2, (Object) null)) {
            sb.append("/ping");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        URLConnection openConnection = new URL(sb2).openConnection();
        Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
        httpsURLConnection.setSSLSocketFactory(this.b.a(this.f17423a));
        httpsURLConnection.setRequestMethod("HEAD");
        httpsURLConnection.setConnectTimeout(2000);
        httpsURLConnection.setReadTimeout(2000);
        return httpsURLConnection;
    }
}
