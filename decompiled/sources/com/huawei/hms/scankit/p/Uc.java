package com.huawei.hms.scankit.p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ParticleAnimators.java */
/* loaded from: classes14.dex */
public class Uc implements Sc {

    /* renamed from: a, reason: collision with root package name */
    private List<Sc> f10606a = new ArrayList();

    @Override // com.huawei.hms.scankit.p.Sc
    public void a(Pc pc, long j) {
        Iterator<Sc> it = this.f10606a.iterator();
        while (it.hasNext()) {
            it.next().a(pc, j);
        }
    }

    public void a(Sc sc) {
        if (this.f10606a == null) {
            this.f10606a = new ArrayList();
        }
        this.f10606a.add(sc);
    }
}
