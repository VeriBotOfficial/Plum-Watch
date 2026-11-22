package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.gh1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class zj<T> implements gh1.b, ro {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17529a;
    private final o8<T> b;
    private final gh1 c;

    @Override // com.yandex.mobile.ads.impl.ro
    public final synchronized boolean a() {
        return false;
    }

    public abstract void b();

    public /* synthetic */ zj(Context context, o8 o8Var) {
        this(context, o8Var, gh1.h.a(context));
    }

    protected zj(Context context, o8<T> adResponse, gh1 phoneStateTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(phoneStateTracker, "phoneStateTracker");
        this.f17529a = context;
        this.b = adResponse;
        this.c = phoneStateTracker;
    }

    public final Context e() {
        return this.f17529a;
    }

    public final o8<T> d() {
        return this.b;
    }

    protected final boolean f() {
        return !this.c.b();
    }

    public void c() {
        b();
        String str = "onDestroy(), clazz = " + getClass();
        sp0.d(new Object[0]);
    }

    public final void g() {
        String str = "registerPhoneStateTracker(), clazz = " + getClass();
        sp0.d(new Object[0]);
        this.c.a(this);
    }

    public final void h() {
        String str = "unregisterPhoneStateTracker(), clazz = " + getClass();
        sp0.d(new Object[0]);
        this.c.b(this);
    }
}
