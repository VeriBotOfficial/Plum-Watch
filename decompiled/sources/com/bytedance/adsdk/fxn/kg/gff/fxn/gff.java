package com.bytedance.adsdk.fxn.kg.gff.fxn;

import com.bytedance.adsdk.fxn.kg.kg.fxn.iwp;
import java.util.Deque;

/* loaded from: classes13.dex */
public class gff extends bh {
    @Override // com.bytedance.adsdk.fxn.kg.gff.fxn.bh
    public int fxn(String str, int i, Deque<com.bytedance.adsdk.fxn.kg.kg.fxn> deque, com.bytedance.adsdk.fxn.kg.gff.fxn fxnVar) {
        char fxn = fxn(i, str);
        if (!com.bytedance.adsdk.fxn.kg.rb.fxn.kg(fxn) && fxn != '$') {
            return fxnVar.fxn(str, i, deque);
        }
        return fxn(str, i, deque);
    }

    private int fxn(String str, int i, Deque<com.bytedance.adsdk.fxn.kg.kg.fxn> deque) {
        int i2;
        int i3 = 0;
        while (true) {
            i2 = i3 + i;
            char fxn = fxn(i2, str);
            if (!com.bytedance.adsdk.fxn.kg.rb.fxn.kg(fxn) && !com.bytedance.adsdk.fxn.kg.rb.fxn.gff(fxn) && '.' != fxn && '[' != fxn && ']' != fxn && '_' != fxn && '-' != fxn && '$' != fxn) {
                break;
            }
            i3++;
        }
        String substring = str.substring(i, i2);
        if (com.bytedance.adsdk.fxn.kg.hm.fxn.fxn(substring) != null) {
            deque.push(new com.bytedance.adsdk.fxn.kg.kg.fxn.sg(substring));
            return i2;
        }
        deque.push(new iwp(substring));
        return i2;
    }
}
