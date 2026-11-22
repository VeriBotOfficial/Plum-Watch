package com.mbridge.msdk.thrid.okhttp.internal.connection;

import java.io.IOException;

/* compiled from: RouteException.java */
/* loaded from: classes17.dex */
public final class e extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private IOException f12174a;
    private IOException b;

    public e(IOException iOException) {
        super(iOException);
        this.f12174a = iOException;
        this.b = iOException;
    }

    public IOException a() {
        return this.f12174a;
    }

    public IOException b() {
        return this.b;
    }

    public void a(IOException iOException) {
        com.mbridge.msdk.thrid.okhttp.internal.c.a((Throwable) this.f12174a, (Throwable) iOException);
        this.b = iOException;
    }
}
