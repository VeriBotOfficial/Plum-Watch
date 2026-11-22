package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.rk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3528rk {

    /* renamed from: a, reason: collision with root package name */
    public final String f18485a;
    public final C3404mk b;
    public final C3504qk c;
    public final IBinaryDataHelper d;

    public C3528rk(Context context, C3215f5 c3215f5) {
        c3215f5.a();
        this.f18485a = "session_extras";
        this.b = new C3404mk();
        this.c = new C3504qk();
        this.d = C3242g7.a(context).a(c3215f5);
    }

    public final Map a() {
        try {
            byte[] bArr = this.d.get(this.f18485a);
            if (bArr != null) {
                if (!(bArr.length == 0)) {
                    return this.b.toModel(this.c.toState(bArr));
                }
            }
        } catch (Throwable unused) {
        }
        C3404mk c3404mk = this.b;
        this.c.getClass();
        return c3404mk.toModel(new C3454ok());
    }
}
