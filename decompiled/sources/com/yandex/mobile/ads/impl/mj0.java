package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.yandex.mobile.ads.impl.oj0;
import com.yandex.mobile.ads.impl.xq1;

/* loaded from: classes5.dex */
final class mj0 implements xq1.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f16251a;
    final /* synthetic */ oj0 b;

    mj0(oj0 oj0Var, String str) {
        this.b = oj0Var;
        this.f16251a = str;
    }

    @Override // com.yandex.mobile.ads.impl.xq1.a
    public final void a(si2 si2Var) {
        Runnable runnable;
        Handler handler;
        oj0 oj0Var = this.b;
        String str = this.f16251a;
        oj0.a aVar = (oj0.a) oj0Var.c.remove(str);
        if (aVar != null) {
            aVar.c = si2Var;
            oj0Var.d.put(str, aVar);
            runnable = oj0Var.f;
            if (runnable == null) {
                nj0 nj0Var = new nj0(oj0Var);
                oj0Var.f = nj0Var;
                handler = oj0Var.e;
                handler.postDelayed(nj0Var, 100);
            }
        }
    }
}
