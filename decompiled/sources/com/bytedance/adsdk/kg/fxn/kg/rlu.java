package com.bytedance.adsdk.kg.fxn.kg;

import android.graphics.Path;
import com.bytedance.adsdk.kg.fxn.fxn.ud;
import java.util.List;

/* loaded from: classes13.dex */
public class rlu extends fxn<com.bytedance.adsdk.kg.gff.kg.zu, Path> {
    private List<ud> bh;
    private final com.bytedance.adsdk.kg.gff.kg.zu hm;
    private final Path rb;

    public rlu(List<com.bytedance.adsdk.kg.sg.fxn<com.bytedance.adsdk.kg.gff.kg.zu>> list) {
        super(list);
        this.hm = new com.bytedance.adsdk.kg.gff.kg.zu();
        this.rb = new Path();
    }

    @Override // com.bytedance.adsdk.kg.fxn.kg.fxn
    /* renamed from: kg, reason: merged with bridge method [inline-methods] */
    public Path fxn(com.bytedance.adsdk.kg.sg.fxn<com.bytedance.adsdk.kg.gff.kg.zu> fxnVar, float f) {
        this.hm.fxn(fxnVar.fxn, fxnVar.kg, f);
        com.bytedance.adsdk.kg.gff.kg.zu zuVar = this.hm;
        List<ud> list = this.bh;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                zuVar = this.bh.get(size).fxn(zuVar);
            }
        }
        com.bytedance.adsdk.kg.bh.rb.fxn(zuVar, this.rb);
        return this.rb;
    }

    public void fxn(List<ud> list) {
        this.bh = list;
    }
}
