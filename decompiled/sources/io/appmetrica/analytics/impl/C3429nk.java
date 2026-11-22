package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Map;
import kotlin.collections.MapsKt;

/* renamed from: io.appmetrica.analytics.impl.nk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3429nk {

    /* renamed from: a, reason: collision with root package name */
    public final C3528rk f18420a;
    public final Map b;

    public C3429nk(Context context, C3215f5 c3215f5) {
        c3215f5.a();
        C3528rk c3528rk = new C3528rk(context, c3215f5);
        this.f18420a = c3528rk;
        this.b = MapsKt.toMutableMap(c3528rk.a());
    }
}
