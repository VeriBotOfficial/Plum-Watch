package com.anythink.core.common.n.b.a.b;

import java.io.IOException;

/* loaded from: classes12.dex */
public final class h extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private IOException f4078a;
    private IOException b;

    h(IOException iOException) {
        super(iOException);
        this.f4078a = iOException;
        this.b = iOException;
    }

    public final IOException a() {
        return this.f4078a;
    }

    public final IOException b() {
        return this.b;
    }

    final void a(IOException iOException) {
        com.anythink.core.common.n.b.a.c.a(this.f4078a, iOException);
        this.b = iOException;
    }
}
