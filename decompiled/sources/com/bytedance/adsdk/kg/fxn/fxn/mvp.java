package com.bytedance.adsdk.kg.fxn.fxn;

import android.graphics.Path;
import com.bytedance.adsdk.kg.gff.kg.jq;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes13.dex */
public class mvp implements hie, rlu {
    private final com.bytedance.adsdk.kg.gff.kg.jq bh;
    private final String hm;
    private final Path fxn = new Path();
    private final Path kg = new Path();
    private final Path gff = new Path();
    private final List<rlu> rb = new ArrayList();

    public mvp(com.bytedance.adsdk.kg.gff.kg.jq jqVar) {
        this.hm = jqVar.fxn();
        this.bh = jqVar;
    }

    @Override // com.bytedance.adsdk.kg.fxn.fxn.hie
    public void fxn(ListIterator<gff> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            gff previous = listIterator.previous();
            if (previous instanceof rlu) {
                this.rb.add((rlu) previous);
                listIterator.remove();
            }
        }
    }

    @Override // com.bytedance.adsdk.kg.fxn.fxn.gff
    public void fxn(List<gff> list, List<gff> list2) {
        for (int i = 0; i < this.rb.size(); i++) {
            this.rb.get(i).fxn(list, list2);
        }
    }

    @Override // com.bytedance.adsdk.kg.fxn.fxn.rlu
    public Path hm() {
        this.gff.reset();
        if (this.bh.gff()) {
            return this.gff;
        }
        int i = AnonymousClass1.fxn[this.bh.kg().ordinal()];
        if (i == 1) {
            fxn();
        } else if (i == 2) {
            fxn(Path.Op.UNION);
        } else if (i == 3) {
            fxn(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            fxn(Path.Op.INTERSECT);
        } else if (i == 5) {
            fxn(Path.Op.XOR);
        }
        return this.gff;
    }

    /* renamed from: com.bytedance.adsdk.kg.fxn.fxn.mvp$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] fxn;

        static {
            int[] iArr = new int[jq.fxn.values().length];
            fxn = iArr;
            try {
                iArr[jq.fxn.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                fxn[jq.fxn.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                fxn[jq.fxn.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                fxn[jq.fxn.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                fxn[jq.fxn.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private void fxn() {
        for (int i = 0; i < this.rb.size(); i++) {
            this.gff.addPath(this.rb.get(i).hm());
        }
    }

    private void fxn(Path.Op op) {
        this.kg.reset();
        this.fxn.reset();
        for (int size = this.rb.size() - 1; size > 0; size--) {
            rlu rluVar = this.rb.get(size);
            if (rluVar instanceof hm) {
                hm hmVar = (hm) rluVar;
                List<rlu> kg = hmVar.kg();
                for (int size2 = kg.size() - 1; size2 >= 0; size2--) {
                    Path hm = kg.get(size2).hm();
                    hm.transform(hmVar.gff());
                    this.kg.addPath(hm);
                }
            } else {
                this.kg.addPath(rluVar.hm());
            }
        }
        rlu rluVar2 = this.rb.get(0);
        if (rluVar2 instanceof hm) {
            hm hmVar2 = (hm) rluVar2;
            List<rlu> kg2 = hmVar2.kg();
            for (int i = 0; i < kg2.size(); i++) {
                Path hm2 = kg2.get(i).hm();
                hm2.transform(hmVar2.gff());
                this.fxn.addPath(hm2);
            }
        } else {
            this.fxn.set(rluVar2.hm());
        }
        this.gff.op(this.fxn, this.kg, op);
    }
}
