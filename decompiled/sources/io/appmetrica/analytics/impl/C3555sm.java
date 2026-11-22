package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.sm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3555sm {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f18500a;

    public C3555sm() {
        HashMap hashMap = new HashMap();
        this.f18500a = hashMap;
        C3406mm c3406mm = new C3406mm();
        C3431nm c3431nm = new C3431nm();
        C3456om c3456om = new C3456om();
        C3481pm c3481pm = new C3481pm();
        C3506qm c3506qm = new C3506qm();
        hashMap.put(Ll.class, c3406mm);
        hashMap.put(X1.class, c3431nm);
        hashMap.put(Se.class, c3456om);
        hashMap.put(C3585u2.class, c3481pm);
        hashMap.put(M3.class, c3506qm);
    }

    public static AbstractC3580tm a(Class cls) {
        return (AbstractC3580tm) AbstractC3530rm.f18486a.f18500a.get(cls);
    }
}
