package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* loaded from: classes5.dex */
final class kq0 extends k<Object> {
    final /* synthetic */ Iterator d;
    final /* synthetic */ wj1 e;

    kq0(Iterator it, wj1 wj1Var) {
        this.d = it;
        this.e = wj1Var;
    }

    @Override // com.yandex.mobile.ads.impl.k
    @CheckForNull
    protected final Object a() {
        while (this.d.hasNext()) {
            Object next = this.d.next();
            if (this.e.apply(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}
