package io.appmetrica.analytics.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* loaded from: classes6.dex */
public final class D2 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final BiConsumer f17807a;
    public final ICommonExecutor b;

    public D2(Y2 y2, ICommonExecutor iCommonExecutor) {
        this.f17807a = y2;
        this.b = iCommonExecutor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.b.execute(new C2(this, context, intent));
    }
}
