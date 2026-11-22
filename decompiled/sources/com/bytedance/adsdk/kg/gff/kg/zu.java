package com.bytedance.adsdk.kg.gff.kg;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes13.dex */
public class zu {
    private final List<com.bytedance.adsdk.kg.gff.fxn> fxn;
    private boolean gff;
    private PointF kg;

    public zu(PointF pointF, boolean z, List<com.bytedance.adsdk.kg.gff.fxn> list) {
        this.kg = pointF;
        this.gff = z;
        this.fxn = new ArrayList(list);
    }

    public zu() {
        this.fxn = new ArrayList();
    }

    public void fxn(float f, float f2) {
        if (this.kg == null) {
            this.kg = new PointF();
        }
        this.kg.set(f, f2);
    }

    public PointF fxn() {
        return this.kg;
    }

    public void fxn(boolean z) {
        this.gff = z;
    }

    public boolean kg() {
        return this.gff;
    }

    public List<com.bytedance.adsdk.kg.gff.fxn> gff() {
        return this.fxn;
    }

    public void fxn(zu zuVar, zu zuVar2, float f) {
        if (this.kg == null) {
            this.kg = new PointF();
        }
        this.gff = zuVar.kg() || zuVar2.kg();
        if (zuVar.gff().size() != zuVar2.gff().size()) {
            zuVar.gff().size();
            zuVar2.gff().size();
        }
        int min = Math.min(zuVar.gff().size(), zuVar2.gff().size());
        if (this.fxn.size() < min) {
            for (int size = this.fxn.size(); size < min; size++) {
                this.fxn.add(new com.bytedance.adsdk.kg.gff.fxn());
            }
        } else if (this.fxn.size() > min) {
            for (int size2 = this.fxn.size() - 1; size2 >= min; size2--) {
                List<com.bytedance.adsdk.kg.gff.fxn> list = this.fxn;
                list.remove(list.size() - 1);
            }
        }
        PointF fxn = zuVar.fxn();
        PointF fxn2 = zuVar2.fxn();
        fxn(com.bytedance.adsdk.kg.bh.rb.fxn(fxn.x, fxn2.x, f), com.bytedance.adsdk.kg.bh.rb.fxn(fxn.y, fxn2.y, f));
        for (int size3 = this.fxn.size() - 1; size3 >= 0; size3--) {
            com.bytedance.adsdk.kg.gff.fxn fxnVar = zuVar.gff().get(size3);
            com.bytedance.adsdk.kg.gff.fxn fxnVar2 = zuVar2.gff().get(size3);
            PointF fxn3 = fxnVar.fxn();
            PointF kg = fxnVar.kg();
            PointF gff = fxnVar.gff();
            PointF fxn4 = fxnVar2.fxn();
            PointF kg2 = fxnVar2.kg();
            PointF gff2 = fxnVar2.gff();
            this.fxn.get(size3).fxn(com.bytedance.adsdk.kg.bh.rb.fxn(fxn3.x, fxn4.x, f), com.bytedance.adsdk.kg.bh.rb.fxn(fxn3.y, fxn4.y, f));
            this.fxn.get(size3).kg(com.bytedance.adsdk.kg.bh.rb.fxn(kg.x, kg2.x, f), com.bytedance.adsdk.kg.bh.rb.fxn(kg.y, kg2.y, f));
            this.fxn.get(size3).gff(com.bytedance.adsdk.kg.bh.rb.fxn(gff.x, gff2.x, f), com.bytedance.adsdk.kg.bh.rb.fxn(gff.y, gff2.y, f));
        }
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.fxn.size() + "closed=" + this.gff + AbstractJsonLexerKt.END_OBJ;
    }
}
