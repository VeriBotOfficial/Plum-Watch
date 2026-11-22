package com.anythink.core.common.w;

import com.anythink.core.common.h.ad;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.v.l;
import com.anythink.core.common.v.p;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private List<bv> f4493a;

    public i(List<bv> list) {
        ArrayList arrayList = new ArrayList();
        this.f4493a = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    public final synchronized List<bv> a() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.addAll(this.f4493a);
        return arrayList;
    }

    protected final synchronized void a(bv bvVar) {
        List<bv> list = this.f4493a;
        if (list != null) {
            if (list.size() == 0) {
                bvVar.H(0);
                this.f4493a.add(bvVar);
                a(bvVar, 0, null);
                return;
            }
            for (int i = 0; i < this.f4493a.size(); i++) {
                bv bvVar2 = this.f4493a.get(i);
                if (l.a(bvVar, bvVar2) < 0) {
                    bvVar.H(i);
                    this.f4493a.add(i, bvVar);
                    a(bvVar, i, bvVar2);
                    int i2 = i + 1;
                    List<bv> list2 = this.f4493a;
                    if (list2 != null && i2 < list2.size()) {
                        while (i2 < list2.size()) {
                            bv bvVar3 = list2.get(i2);
                            if (bvVar3 != null) {
                                bvVar3.H(i2);
                            }
                            i2++;
                        }
                    }
                    return;
                }
            }
            bvVar.H(this.f4493a.size());
            this.f4493a.add(bvVar);
            a(bvVar, this.f4493a.size() - 1, null);
        }
    }

    private static void a(int i, List<bv> list) {
        if (list != null && i < list.size()) {
            while (i < list.size()) {
                bv bvVar = list.get(i);
                if (bvVar != null) {
                    bvVar.H(i);
                }
                i++;
            }
        }
    }

    private void a(bv bvVar, int i, bv bvVar2) {
        ad R;
        ad R2;
        if (bvVar.o() && (R2 = bvVar.R()) != null) {
            if (bvVar2 != null) {
                R2.a(bvVar2, p.a(bvVar2));
            } else {
                R2.a(bvVar, b(bvVar));
            }
        }
        if (i > 0) {
            bv bvVar3 = this.f4493a.get(i - 1);
            if (!bvVar3.o() || (R = bvVar3.R()) == null) {
                return;
            }
            R.a(bvVar, p.a(bvVar));
        }
    }

    private static double b(bv bvVar) {
        if (bvVar.aZ() == 2) {
            return 0.0d;
        }
        return p.a(bvVar);
    }
}
