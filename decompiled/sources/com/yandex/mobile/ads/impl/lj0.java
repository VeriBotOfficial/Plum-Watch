package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.os.Handler;
import com.yandex.mobile.ads.impl.oj0;
import com.yandex.mobile.ads.impl.xq1;

/* loaded from: classes5.dex */
final class lj0 implements xq1.b<Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f16129a;
    final /* synthetic */ oj0 b;

    lj0(oj0 oj0Var, String str) {
        this.b = oj0Var;
        this.f16129a = str;
    }

    @Override // com.yandex.mobile.ads.impl.xq1.b
    public final void a(Object obj) {
        oj0.b bVar;
        Runnable runnable;
        Handler handler;
        Bitmap bitmap = (Bitmap) obj;
        oj0 oj0Var = this.b;
        String str = this.f16129a;
        bVar = oj0Var.b;
        bVar.a(str, bitmap);
        oj0.a aVar = (oj0.a) oj0Var.c.remove(str);
        if (aVar != null) {
            aVar.b = bitmap;
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
