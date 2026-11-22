package com.bytedance.sdk.component.kg.fxn.fxn.fxn;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes13.dex */
public class fxn extends com.bytedance.sdk.component.kg.fxn.hm {
    public static volatile hie fxn;
    private ExecutorService hm;
    private List<com.bytedance.sdk.component.kg.fxn.kg> kg = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.kg.fxn.kg> gff = new CopyOnWriteArrayList();

    @Override // com.bytedance.sdk.component.kg.fxn.hm
    public int fxn() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.kg.fxn.hm
    public void fxn(int i) {
    }

    public fxn(ExecutorService executorService) {
        this.hm = executorService;
    }

    public static void fxn(hie hieVar) {
        fxn = hieVar;
    }

    @Override // com.bytedance.sdk.component.kg.fxn.hm
    public ExecutorService kg() {
        ExecutorService fxn2 = fxn != null ? fxn.fxn() : null;
        return fxn2 != null ? fxn2 : this.hm;
    }

    public boolean rb() {
        return (fxn == null || fxn.fxn() == null) ? false : true;
    }

    @Override // com.bytedance.sdk.component.kg.fxn.hm
    public List<com.bytedance.sdk.component.kg.fxn.kg> gff() {
        return this.kg;
    }

    @Override // com.bytedance.sdk.component.kg.fxn.hm
    public List<com.bytedance.sdk.component.kg.fxn.kg> hm() {
        return this.gff;
    }
}
