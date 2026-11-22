package com.huawei.hms.scankit.p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ParticleProperties.java */
/* loaded from: classes14.dex */
public class Wc implements Vc {

    /* renamed from: a, reason: collision with root package name */
    private List<Vc> f10612a = new ArrayList();

    @Override // com.huawei.hms.scankit.p.Vc
    public void a(Pc pc) {
        Iterator<Vc> it = this.f10612a.iterator();
        while (it.hasNext()) {
            it.next().a(pc);
        }
    }

    public void a(Vc vc) {
        if (this.f10612a == null) {
            this.f10612a = new ArrayList();
        }
        this.f10612a.add(vc);
    }
}
