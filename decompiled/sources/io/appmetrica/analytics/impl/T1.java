package io.appmetrica.analytics.impl;

/* loaded from: classes6.dex */
public final class T1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Sd f18075a;
    public final /* synthetic */ G7 b;

    public T1(V1 v1, G7 g7) {
        this.f18075a = v1;
        this.b = g7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18075a.consume(this.b);
    }
}
