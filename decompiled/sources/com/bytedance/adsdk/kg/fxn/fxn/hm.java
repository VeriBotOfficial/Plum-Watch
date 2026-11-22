package com.bytedance.adsdk.kg.fxn.fxn;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.kg.fxn.kg.fxn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class hm implements rb, rlu, fxn.InterfaceC0453fxn {
    private final String bh;
    private com.bytedance.adsdk.kg.fxn.kg.xdg dgx;
    private final Paint fxn;
    private final Matrix gff;
    private List<rlu> hie;
    private final Path hm;
    private final com.bytedance.adsdk.kg.jq jq;
    private final RectF kg;
    private final RectF rb;

    /* renamed from: sg, reason: collision with root package name */
    private final boolean f9234sg;
    private final List<gff> tw;

    private static List<gff> fxn(com.bytedance.adsdk.kg.jq jqVar, com.bytedance.adsdk.kg.sg sgVar, com.bytedance.adsdk.kg.gff.gff.fxn fxnVar, List<com.bytedance.adsdk.kg.gff.kg.gff> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            gff fxn = list.get(i).fxn(jqVar, sgVar, fxnVar);
            if (fxn != null) {
                arrayList.add(fxn);
            }
        }
        return arrayList;
    }

    static com.bytedance.adsdk.kg.gff.fxn.mvp fxn(List<com.bytedance.adsdk.kg.gff.kg.gff> list) {
        for (int i = 0; i < list.size(); i++) {
            com.bytedance.adsdk.kg.gff.kg.gff gffVar = list.get(i);
            if (gffVar instanceof com.bytedance.adsdk.kg.gff.fxn.mvp) {
                return (com.bytedance.adsdk.kg.gff.fxn.mvp) gffVar;
            }
        }
        return null;
    }

    public hm(com.bytedance.adsdk.kg.jq jqVar, com.bytedance.adsdk.kg.gff.gff.fxn fxnVar, com.bytedance.adsdk.kg.gff.kg.xdg xdgVar, com.bytedance.adsdk.kg.sg sgVar) {
        this(jqVar, fxnVar, xdgVar.fxn(), xdgVar.gff(), fxn(jqVar, sgVar, fxnVar, xdgVar.kg()), fxn(xdgVar.kg()));
    }

    hm(com.bytedance.adsdk.kg.jq jqVar, com.bytedance.adsdk.kg.gff.gff.fxn fxnVar, String str, boolean z, List<gff> list, com.bytedance.adsdk.kg.gff.fxn.mvp mvpVar) {
        this.fxn = new com.bytedance.adsdk.kg.fxn.fxn();
        this.kg = new RectF();
        this.gff = new Matrix();
        this.hm = new Path();
        this.rb = new RectF();
        this.bh = str;
        this.jq = jqVar;
        this.f9234sg = z;
        this.tw = list;
        if (mvpVar != null) {
            com.bytedance.adsdk.kg.fxn.kg.xdg hie = mvpVar.hie();
            this.dgx = hie;
            hie.fxn(fxnVar);
            this.dgx.fxn(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            gff gffVar = list.get(size);
            if (gffVar instanceof hie) {
                arrayList.add((hie) gffVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((hie) arrayList.get(size2)).fxn(list.listIterator(list.size()));
        }
    }

    @Override // com.bytedance.adsdk.kg.fxn.kg.fxn.InterfaceC0453fxn
    public void fxn() {
        this.jq.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.kg.fxn.fxn.gff
    public void fxn(List<gff> list, List<gff> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.tw.size());
        arrayList.addAll(list);
        for (int size = this.tw.size() - 1; size >= 0; size--) {
            gff gffVar = this.tw.get(size);
            gffVar.fxn(arrayList, this.tw.subList(0, size));
            arrayList.add(gffVar);
        }
    }

    List<rlu> kg() {
        if (this.hie == null) {
            this.hie = new ArrayList();
            for (int i = 0; i < this.tw.size(); i++) {
                gff gffVar = this.tw.get(i);
                if (gffVar instanceof rlu) {
                    this.hie.add((rlu) gffVar);
                }
            }
        }
        return this.hie;
    }

    Matrix gff() {
        com.bytedance.adsdk.kg.fxn.kg.xdg xdgVar = this.dgx;
        if (xdgVar != null) {
            return xdgVar.hm();
        }
        this.gff.reset();
        return this.gff;
    }

    @Override // com.bytedance.adsdk.kg.fxn.fxn.rlu
    public Path hm() {
        this.gff.reset();
        com.bytedance.adsdk.kg.fxn.kg.xdg xdgVar = this.dgx;
        if (xdgVar != null) {
            this.gff.set(xdgVar.hm());
        }
        this.hm.reset();
        if (this.f9234sg) {
            return this.hm;
        }
        for (int size = this.tw.size() - 1; size >= 0; size--) {
            gff gffVar = this.tw.get(size);
            if (gffVar instanceof rlu) {
                this.hm.addPath(((rlu) gffVar).hm(), this.gff);
            }
        }
        return this.hm;
    }

    @Override // com.bytedance.adsdk.kg.fxn.fxn.rb
    public void fxn(Canvas canvas, Matrix matrix, int i) {
        if (this.f9234sg) {
            return;
        }
        this.gff.set(matrix);
        com.bytedance.adsdk.kg.fxn.kg.xdg xdgVar = this.dgx;
        if (xdgVar != null) {
            this.gff.preConcat(xdgVar.hm());
            i = (int) (((((this.dgx.fxn() == null ? 100 : this.dgx.fxn().sg().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.jq.jq() && rb() && i != 255;
        if (z) {
            this.kg.set(0.0f, 0.0f, 0.0f, 0.0f);
            fxn(this.kg, this.gff, true);
            this.fxn.setAlpha(i);
            com.bytedance.adsdk.kg.bh.bh.fxn(canvas, this.kg, this.fxn);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.tw.size() - 1; size >= 0; size--) {
            gff gffVar = this.tw.get(size);
            if (gffVar instanceof rb) {
                ((rb) gffVar).fxn(canvas, this.gff, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    private boolean rb() {
        int i = 0;
        for (int i2 = 0; i2 < this.tw.size(); i2++) {
            if ((this.tw.get(i2) instanceof rb) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.kg.fxn.fxn.rb
    public void fxn(RectF rectF, Matrix matrix, boolean z) {
        this.gff.set(matrix);
        com.bytedance.adsdk.kg.fxn.kg.xdg xdgVar = this.dgx;
        if (xdgVar != null) {
            this.gff.preConcat(xdgVar.hm());
        }
        this.rb.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.tw.size() - 1; size >= 0; size--) {
            gff gffVar = this.tw.get(size);
            if (gffVar instanceof rb) {
                ((rb) gffVar).fxn(this.rb, this.gff, z);
                rectF.union(this.rb);
            }
        }
    }
}
