package com.bytedance.adsdk.fxn.kg.gff.fxn;

import com.bytedance.adsdk.fxn.kg.kg.fxn.dx;
import java.util.Deque;

/* loaded from: classes13.dex */
public class kg extends bh {
    @Override // com.bytedance.adsdk.fxn.kg.gff.fxn.bh
    public int fxn(String str, int i, Deque<com.bytedance.adsdk.fxn.kg.kg.fxn> deque, com.bytedance.adsdk.fxn.kg.gff.fxn fxnVar) {
        if ('\'' != fxn(i, str)) {
            return fxnVar.fxn(str, i, deque);
        }
        int i2 = i + 1;
        int length = str.length();
        int i3 = i2;
        while (i3 < length && fxn(i3, str) != '\'') {
            i3++;
        }
        if (fxn(i3, str) != '\'') {
            throw new com.bytedance.adsdk.fxn.fxn.fxn("String expression not surrounded by '", str.substring(i));
        }
        deque.push(new dx(str.substring(i2, i3)));
        return i3 + 1;
    }
}
