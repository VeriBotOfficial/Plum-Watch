package com.baidu.mapauto.auth.org.spongycastle.asn1;

/* JADX INFO: loaded from: classes15.dex */
public final class q extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Throwable f8286a;

    public q(String str) {
        super(str);
    }

    public q(String str, Exception exc) {
        super(str);
        this.f8286a = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f8286a;
    }
}
