package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes6.dex */
public final class C2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f17789a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ D2 c;

    public C2(D2 d2, Context context, Intent intent) {
        this.c = d2;
        this.f17789a = context;
        this.b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.f17807a.consume(this.f17789a, this.b);
    }
}
