package com.yandex.mobile.ads.impl;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vs1 {

    /* renamed from: a, reason: collision with root package name */
    private final ab f17192a;
    private final Proxy b;
    private final InetSocketAddress c;

    public vs1(ab address, Proxy proxy, InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.f17192a = address;
        this.b = proxy;
        this.c = socketAddress;
    }

    public final ab a() {
        return this.f17192a;
    }

    public final Proxy b() {
        return this.b;
    }

    public final InetSocketAddress d() {
        return this.c;
    }

    public final boolean c() {
        return this.f17192a.j() != null && this.b.type() == Proxy.Type.HTTP;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vs1)) {
            return false;
        }
        vs1 vs1Var = (vs1) obj;
        return Intrinsics.areEqual(vs1Var.f17192a, this.f17192a) && Intrinsics.areEqual(vs1Var.b, this.b) && Intrinsics.areEqual(vs1Var.c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.f17192a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.c + "}";
    }
}
