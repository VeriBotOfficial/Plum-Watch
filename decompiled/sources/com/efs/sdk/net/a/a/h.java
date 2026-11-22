package com.efs.sdk.net.a.a;

import java.io.ByteArrayOutputStream;

/* loaded from: classes14.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final f f9952a;
    public ByteArrayOutputStream b;
    public a c;
    private final String d;

    public h(f fVar, String str) {
        this.f9952a = fVar;
        this.d = str;
    }

    public final boolean a() {
        return this.b != null;
    }

    public final void b() {
        if (!a()) {
            throw new IllegalStateException("No body found; has createBodySink been called?");
        }
    }
}
