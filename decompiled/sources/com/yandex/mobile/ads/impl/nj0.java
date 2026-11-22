package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.oj0;
import java.util.Iterator;

/* loaded from: classes5.dex */
final class nj0 implements Runnable {
    final /* synthetic */ oj0 b;

    nj0(oj0 oj0Var) {
        this.b = oj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oj0.d dVar;
        si2 si2Var;
        Bitmap bitmap;
        for (oj0.a aVar : this.b.d.values()) {
            Iterator it = aVar.d.iterator();
            while (it.hasNext()) {
                oj0.c cVar = (oj0.c) it.next();
                dVar = cVar.b;
                if (dVar != null) {
                    si2Var = aVar.c;
                    if (si2Var == null) {
                        bitmap = aVar.b;
                        cVar.f16458a = bitmap;
                        dVar.a(cVar, false);
                    } else {
                        dVar.a(si2Var);
                    }
                }
            }
        }
        this.b.d.clear();
        this.b.f = null;
    }
}
