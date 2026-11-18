package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public final class g extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Throwable f8267a;

    public g(String str) {
        super(str);
    }

    public g(String str, IllegalArgumentException illegalArgumentException) {
        super(str);
        this.f8267a = illegalArgumentException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f8267a;
    }
}
