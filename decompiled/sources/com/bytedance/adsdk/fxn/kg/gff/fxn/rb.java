package com.bytedance.adsdk.fxn.kg.gff.fxn;

import java.util.Deque;

/* loaded from: classes13.dex */
public class rb extends bh {
    @Override // com.bytedance.adsdk.fxn.kg.gff.fxn.bh
    public int fxn(String str, int i, Deque<com.bytedance.adsdk.fxn.kg.kg.fxn> deque, com.bytedance.adsdk.fxn.kg.gff.fxn fxnVar) {
        char fxn;
        int i2 = i;
        while (true) {
            fxn = fxn(i2, str);
            if (!com.bytedance.adsdk.fxn.kg.rb.fxn.kg(fxn) && !com.bytedance.adsdk.fxn.kg.rb.fxn.gff(fxn)) {
                break;
            }
            i2++;
        }
        if (fxn != '(') {
            return fxnVar.fxn(str, i, deque);
        }
        deque.push(new com.bytedance.adsdk.fxn.kg.kg.fxn.hie(str.substring(i, i2)));
        return i2 + 1;
    }
}
