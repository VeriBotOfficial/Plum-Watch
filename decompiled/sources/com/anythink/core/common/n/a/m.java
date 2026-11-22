package com.anythink.core.common.n.a;

import java.net.InetAddress;

/* loaded from: classes12.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final InetAddress[] f4050a;
    private final i b;

    public m(InetAddress[] inetAddressArr, i iVar) {
        this.f4050a = inetAddressArr;
        this.b = iVar;
    }

    public final InetAddress[] a() {
        return this.f4050a;
    }

    private i c() {
        return this.b;
    }

    public final f b() {
        i iVar = this.b;
        if (iVar != null) {
            return iVar.a();
        }
        return null;
    }
}
