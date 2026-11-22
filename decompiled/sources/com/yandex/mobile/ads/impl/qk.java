package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.n2;
import com.yandex.mobile.ads.impl.ox1;
import com.yandex.mobile.ads.impl.xq1;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class qk<T> extends up1<T> {
    private static final int w = (int) TimeUnit.SECONDS.toMillis(10);
    private final Context s;
    private final a<T> t;
    private final eq1 u;
    private final mq1 v;

    public interface a<T> extends xq1.b<T>, xq1.a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk(Context context, int i, String url, a<T> listener, eq1 eq1Var) {
        super(i, url, listener);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.s = context;
        this.t = listener;
        this.u = eq1Var;
        q();
        a(new m00(1.0f, w, 0));
        this.v = mq1.b;
    }

    @Override // com.yandex.mobile.ads.impl.up1
    protected si2 b(si2 volleyError) {
        Intrinsics.checkNotNullParameter(volleyError, "volleyError");
        xc1 xc1Var = volleyError.b;
        a(xc1Var != null ? Integer.valueOf(xc1Var.f17325a) : null);
        Intrinsics.checkNotNullExpressionValue(volleyError, "parseNetworkError(...)");
        return volleyError;
    }

    protected mq1 w() {
        return this.v;
    }

    public /* synthetic */ qk(Context context, String str, a aVar) {
        this(context, 0, str, aVar, null);
    }

    public final void x() {
        eq1 eq1Var = this.u;
        if (eq1Var != null) {
            eq1Var.b();
        }
    }

    protected final void a(Integer num) {
        Context context = this.s;
        Intrinsics.checkNotNullParameter(context, "context");
        int i = n2.e;
        n2.a.a(context).a(w(), num);
    }

    @Override // com.yandex.mobile.ads.impl.up1
    protected final void a(T t) {
        this.t.a((a<T>) t);
    }

    protected final void a(Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        String a2 = nf0.a(headers, vh0.c0);
        if (a2 != null) {
            ox1.a aVar = ox1.f16500a;
            Context context = this.s;
            aVar.getClass();
            ox1.a.a(context).a(a2);
        }
    }
}
