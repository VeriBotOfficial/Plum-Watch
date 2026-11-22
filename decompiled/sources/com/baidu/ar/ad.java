package com.baidu.ar;

import java.lang.ref.WeakReference;

/* loaded from: classes12.dex */
public class ad extends d0 implements y6 {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<y6> f6769a;
    public z6 b;

    @Override // com.baidu.ar.d0
    public void a() {
        WeakReference<y6> weakReference = this.f6769a;
        if (weakReference != null) {
            weakReference.clear();
            this.f6769a = null;
        }
        this.b = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.baidu.ar.d0
    public void a(c0 c0Var) {
        if (c0Var instanceof y6) {
            y6 y6Var = (y6) c0Var;
            this.f6769a = new WeakReference<>(y6Var);
            z6 z6Var = this.b;
            if (z6Var != null) {
                y6Var.a(z6Var);
            }
        }
    }

    @Override // com.baidu.ar.y6
    public void a(z6 z6Var) {
        WeakReference<y6> weakReference;
        this.b = z6Var;
        if (z6Var == null || (weakReference = this.f6769a) == null || weakReference.get() == null) {
            return;
        }
        this.f6769a.get().a(this.b);
    }
}
