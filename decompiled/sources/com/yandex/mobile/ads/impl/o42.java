package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class o42 implements tv {

    /* renamed from: a, reason: collision with root package name */
    private final tv f16408a;
    private final sv b;
    private boolean c;
    private long d;

    public o42(tv tvVar, vm vmVar) {
        this.f16408a = (tv) hg.a(tvVar);
        this.b = (sv) hg.a(vmVar);
    }

    @Override // com.yandex.mobile.ads.impl.tv
    public final void a(d72 d72Var) {
        d72Var.getClass();
        this.f16408a.a(d72Var);
    }

    @Override // com.yandex.mobile.ads.impl.tv
    public final long a(xv xvVar) throws IOException {
        long a2 = this.f16408a.a(xvVar);
        this.d = a2;
        if (a2 == 0) {
            return 0L;
        }
        if (xvVar.g == -1 && a2 != -1) {
            xvVar = xvVar.a(a2);
        }
        this.c = true;
        this.b.a(xvVar);
        return this.d;
    }

    @Override // com.yandex.mobile.ads.impl.qv
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.d == 0) {
            return -1;
        }
        int read = this.f16408a.read(bArr, i, i2);
        if (read > 0) {
            this.b.write(bArr, i, read);
            long j = this.d;
            if (j != -1) {
                this.d = j - read;
            }
        }
        return read;
    }

    @Override // com.yandex.mobile.ads.impl.tv
    public final Uri getUri() {
        return this.f16408a.getUri();
    }

    @Override // com.yandex.mobile.ads.impl.tv
    public final Map<String, List<String>> getResponseHeaders() {
        return this.f16408a.getResponseHeaders();
    }

    @Override // com.yandex.mobile.ads.impl.tv
    public final void close() throws IOException {
        try {
            this.f16408a.close();
        } finally {
            if (this.c) {
                this.c = false;
                this.b.close();
            }
        }
    }
}
