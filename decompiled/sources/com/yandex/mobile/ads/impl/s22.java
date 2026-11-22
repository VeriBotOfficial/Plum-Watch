package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class s22 implements tv {

    /* renamed from: a, reason: collision with root package name */
    private final tv f16827a;
    private long b;
    private Uri c = Uri.EMPTY;

    @Override // com.yandex.mobile.ads.impl.tv
    public final void a(d72 d72Var) {
        d72Var.getClass();
        this.f16827a.a(d72Var);
    }

    public s22(tv tvVar) {
        this.f16827a = (tv) hg.a(tvVar);
        Collections.emptyMap();
    }

    public final long e() {
        return this.b;
    }

    public final Uri f() {
        return this.c;
    }

    @Override // com.yandex.mobile.ads.impl.tv
    public final long a(xv xvVar) throws IOException {
        this.c = xvVar.f17370a;
        Collections.emptyMap();
        long a2 = this.f16827a.a(xvVar);
        Uri uri = this.f16827a.getUri();
        uri.getClass();
        this.c = uri;
        this.f16827a.getResponseHeaders();
        return a2;
    }

    @Override // com.yandex.mobile.ads.impl.qv
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f16827a.read(bArr, i, i2);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }

    @Override // com.yandex.mobile.ads.impl.tv
    public final Uri getUri() {
        return this.f16827a.getUri();
    }

    @Override // com.yandex.mobile.ads.impl.tv
    public final Map<String, List<String>> getResponseHeaders() {
        return this.f16827a.getResponseHeaders();
    }

    @Override // com.yandex.mobile.ads.impl.tv
    public final void close() throws IOException {
        this.f16827a.close();
    }
}
