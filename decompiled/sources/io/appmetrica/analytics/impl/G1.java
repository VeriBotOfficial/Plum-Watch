package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* loaded from: classes6.dex */
public final class G1 implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I1 f17861a;

    public G1(I1 i1) {
        this.f17861a = i1;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        this.f17861a.a((File) obj);
    }
}
