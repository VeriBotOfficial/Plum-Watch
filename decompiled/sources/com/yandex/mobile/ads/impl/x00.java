package com.yandex.mobile.ads.impl;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x00 implements l12 {

    /* renamed from: a, reason: collision with root package name */
    private final a f17297a;
    private l12 b;

    public interface a {
        boolean a(SSLSocket sSLSocket);

        xd b(SSLSocket sSLSocket);
    }

    public x00(wd socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.f17297a = socketAdapterFactory;
    }

    @Override // com.yandex.mobile.ads.impl.l12
    public final void a(SSLSocket sslSocket, String str, List<? extends mm1> protocols) {
        l12 l12Var;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        synchronized (this) {
            if (this.b == null && this.f17297a.a(sslSocket)) {
                this.b = this.f17297a.b(sslSocket);
            }
            l12Var = this.b;
        }
        if (l12Var != null) {
            l12Var.a(sslSocket, str, protocols);
        }
    }

    @Override // com.yandex.mobile.ads.impl.l12
    public final boolean a() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.l12
    public final String b(SSLSocket sslSocket) {
        l12 l12Var;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        synchronized (this) {
            if (this.b == null && this.f17297a.a(sslSocket)) {
                this.b = this.f17297a.b(sslSocket);
            }
            l12Var = this.b;
        }
        if (l12Var != null) {
            return l12Var.b(sslSocket);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.l12
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f17297a.a(sslSocket);
    }
}
