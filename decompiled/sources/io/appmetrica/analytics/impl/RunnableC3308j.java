package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC3308j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f18333a;
    public final /* synthetic */ C3358l b;

    public RunnableC3308j(C3358l c3358l, Activity activity) {
        this.b = c3358l;
        this.f18333a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(this.f18333a);
    }
}
