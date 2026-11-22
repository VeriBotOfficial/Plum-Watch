package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.networktasks.internal.DefaultResponseParser;

/* loaded from: classes6.dex */
public class DefaultNetworkResponseHandler implements NetworkResponseHandler<DefaultResponseParser.Response> {

    /* renamed from: a, reason: collision with root package name */
    private final DefaultResponseParser f18680a;

    public DefaultNetworkResponseHandler() {
        this(new DefaultResponseParser());
    }

    DefaultNetworkResponseHandler(DefaultResponseParser defaultResponseParser) {
        this.f18680a = defaultResponseParser;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler
    public DefaultResponseParser.Response handle(ResponseDataHolder responseDataHolder) {
        if (200 == responseDataHolder.getResponseCode()) {
            return this.f18680a.parse(responseDataHolder.getResponseData());
        }
        return null;
    }
}
