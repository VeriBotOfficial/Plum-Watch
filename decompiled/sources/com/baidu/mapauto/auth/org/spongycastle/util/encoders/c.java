package com.baidu.mapauto.auth.org.spongycastle.util.encoders;

/* loaded from: classes13.dex */
public final class c extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f8311a;

    public c(String str, Exception exc) {
        super(str);
        this.f8311a = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f8311a;
    }
}
