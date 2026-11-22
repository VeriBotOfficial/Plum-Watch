package com.bytedance.adsdk.ugeno.hm.fxn;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes13.dex */
public class kg implements gff {
    private List<hm> fxn = new CopyOnWriteArrayList();

    @Override // com.bytedance.adsdk.ugeno.hm.fxn.gff
    public void fxn(hm hmVar) {
        this.fxn.add(hmVar);
    }

    @Override // com.bytedance.adsdk.ugeno.hm.fxn.gff
    public void fxn(String str) {
        if (this.fxn.isEmpty()) {
            return;
        }
        Iterator<hm> it = this.fxn.iterator();
        while (it.hasNext()) {
            it.next().fxn(str);
        }
    }
}
