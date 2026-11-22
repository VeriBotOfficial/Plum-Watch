package com.yandex.mobile.ads.impl;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wb implements ch0 {

    /* renamed from: a, reason: collision with root package name */
    private final gf1 f17234a;
    private final List<zb> b;
    private xb c;

    public wb(gf1 optOutRepository) {
        Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
        this.f17234a = optOutRepository;
        this.b = a();
    }

    public final void a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            URI uri = new URI(url);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            for (zb zbVar : this.b) {
                if (zbVar.a(scheme, host)) {
                    zbVar.a();
                    return;
                }
            }
        } catch (URISyntaxException unused) {
            String str = "Invalid URL: " + url;
            sp0.f(new Object[0]);
        }
    }

    public final void a(xb adtuneOptOutWebViewListener) {
        Intrinsics.checkNotNullParameter(adtuneOptOutWebViewListener, "adtuneOptOutWebViewListener");
        this.c = adtuneOptOutWebViewListener;
    }

    private final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            wb.this.f17234a.b();
        }
    }

    private final List<zb> a() {
        return CollectionsKt.listOf(new fc("noInterestAd", new a()));
    }

    @Override // com.yandex.mobile.ads.impl.ch0
    public final void a(int i) {
        xb xbVar;
        if (!new dc().a(i) || (xbVar = this.c) == null) {
            return;
        }
        xbVar.a();
    }
}
