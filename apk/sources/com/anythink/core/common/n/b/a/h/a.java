package com.anythink.core.common.n.b.a.h;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class a extends ProxySelector {
    @Override // java.net.ProxySelector
    public final void connectFailed(URI r1, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public final List<Proxy> select(URI r2) {
        if (r2 == null) {
            throw new IllegalArgumentException("uri must not be null");
        }
        return Collections.singletonList(Proxy.NO_PROXY);
    }
}
