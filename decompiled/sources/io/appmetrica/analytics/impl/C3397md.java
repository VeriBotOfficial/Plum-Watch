package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.md, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3397md extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3422nd f18400a;
    public final /* synthetic */ String b;
    public final /* synthetic */ byte[] c;

    public C3397md(C3422nd c3422nd, String str, byte[] bArr) {
        this.f18400a = c3422nd;
        this.b = str;
        this.c = bArr;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C3422nd.a(this.f18400a).setSessionExtra(this.b, this.c);
    }
}
