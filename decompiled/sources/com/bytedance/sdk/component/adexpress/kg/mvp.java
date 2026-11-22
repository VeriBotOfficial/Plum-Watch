package com.bytedance.sdk.component.adexpress.kg;

import com.bytedance.sdk.component.adexpress.kg.hie;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes13.dex */
public class mvp implements hie.fxn {
    ckl fxn;
    private jq gff;
    private AtomicBoolean hm = new AtomicBoolean(false);
    private List<hie> kg;

    public mvp(List<hie> list, jq jqVar) {
        this.kg = list;
        this.gff = jqVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.kg.hie.fxn
    public void fxn() {
        this.gff.hm();
        Iterator<hie> it = this.kg.iterator();
        while (it.hasNext() && !it.next().fxn(this)) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.kg.hie.fxn
    public void fxn(hie hieVar) {
        int indexOf = this.kg.indexOf(hieVar);
        if (indexOf < 0) {
            return;
        }
        do {
            indexOf++;
            if (indexOf >= this.kg.size()) {
                return;
            }
        } while (!this.kg.get(indexOf).fxn(this));
    }

    @Override // com.bytedance.sdk.component.adexpress.kg.hie.fxn
    public boolean kg(hie hieVar) {
        int indexOf = this.kg.indexOf(hieVar);
        return indexOf < this.kg.size() - 1 && indexOf >= 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.kg.hie.fxn
    public ckl kg() {
        return this.fxn;
    }

    @Override // com.bytedance.sdk.component.adexpress.kg.hie.fxn
    public void fxn(ckl cklVar) {
        this.fxn = cklVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.kg.hie.fxn
    public void fxn(boolean z) {
        this.hm.getAndSet(z);
    }

    @Override // com.bytedance.sdk.component.adexpress.kg.hie.fxn
    public boolean gff() {
        return this.hm.get();
    }
}
