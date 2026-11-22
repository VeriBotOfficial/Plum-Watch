package com.bytedance.adsdk.fxn.kg.gff.fxn;

import com.bytedance.adsdk.fxn.kg.kg.fxn.ums;
import java.util.Deque;

/* loaded from: classes13.dex */
public class hm extends bh {
    @Override // com.bytedance.adsdk.fxn.kg.gff.fxn.bh
    public int fxn(String str, int i, Deque<com.bytedance.adsdk.fxn.kg.kg.fxn> deque, com.bytedance.adsdk.fxn.kg.gff.fxn fxnVar) {
        if ('(' != fxn(i, str)) {
            return fxnVar.fxn(str, i, deque);
        }
        deque.push(new ums(com.bytedance.adsdk.fxn.kg.hm.hm.LEFT_PAREN));
        return i + 1;
    }
}
