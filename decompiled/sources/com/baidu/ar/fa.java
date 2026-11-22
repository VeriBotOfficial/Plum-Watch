package com.baidu.ar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public class fa implements r6 {

    /* renamed from: a, reason: collision with root package name */
    public List<e0<?, ?>> f6923a = new ArrayList();

    public fa(e0 e0Var) {
        a(e0Var);
    }

    public static <InT, OutT> r6 a(e0<InT, OutT> e0Var, InT r1) {
        e0Var.a(r1);
        return new fa(e0Var);
    }

    @Override // com.baidu.ar.r6
    public r6 a(e0<?, ?> e0Var) {
        if (!this.f6923a.isEmpty()) {
            this.f6923a.get(r0.size() - 1).d(e0Var);
        }
        this.f6923a.add(e0Var);
        return this;
    }

    @Override // com.baidu.ar.callback.ICancellable
    public void cancel() {
        Iterator<e0<?, ?>> it = this.f6923a.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }
}
