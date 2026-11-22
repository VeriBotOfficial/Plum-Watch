package com.bytedance.adsdk.fxn.kg.gff.fxn;

import com.bytedance.adsdk.fxn.kg.kg.fxn.ckl;
import java.util.Deque;

/* loaded from: classes13.dex */
public class sg extends bh {
    private boolean fxn(String str, int i, Deque<com.bytedance.adsdk.fxn.kg.kg.fxn> deque) {
        if ('-' == fxn(i, str)) {
            if (deque.peek() != null && !com.bytedance.adsdk.fxn.kg.hm.gff.fxn(deque.peek().fxn())) {
                return false;
            }
            if (com.bytedance.adsdk.fxn.kg.rb.fxn.gff(fxn(i + 1, str))) {
                return true;
            }
            throw new IllegalArgumentException("Unrecognized - symbol, not a negative number or operator, problem range:" + str.substring(0, i));
        }
        return com.bytedance.adsdk.fxn.kg.rb.fxn.gff(fxn(i, str));
    }

    @Override // com.bytedance.adsdk.fxn.kg.gff.fxn.bh
    public int fxn(String str, int i, Deque<com.bytedance.adsdk.fxn.kg.kg.fxn> deque, com.bytedance.adsdk.fxn.kg.gff.fxn fxnVar) {
        char fxn;
        if (!fxn(str, i, deque)) {
            return fxnVar.fxn(str, i, deque);
        }
        int i2 = fxn(i, str) == '-' ? i + 1 : i;
        boolean z = false;
        while (true) {
            fxn = fxn(i2, str);
            if (com.bytedance.adsdk.fxn.kg.rb.fxn.gff(fxn) || (!z && fxn == '.')) {
                i2++;
                if (fxn == '.') {
                    z = true;
                }
            }
        }
        if (fxn == '.') {
            throw new IllegalArgumentException("Illegal negative number format, problem interval:" + str.substring(i, i2));
        }
        deque.push(new ckl(str.substring(i, i2)));
        return i2;
    }
}
