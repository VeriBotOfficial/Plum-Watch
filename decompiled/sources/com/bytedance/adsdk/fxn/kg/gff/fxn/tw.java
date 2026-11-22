package com.bytedance.adsdk.fxn.kg.gff.fxn;

import com.bytedance.adsdk.fxn.kg.kg.fxn.xdg;
import java.util.Deque;

/* loaded from: classes13.dex */
public class tw extends bh {
    @Override // com.bytedance.adsdk.fxn.kg.gff.fxn.bh
    public int fxn(String str, int i, Deque<com.bytedance.adsdk.fxn.kg.kg.fxn> deque, com.bytedance.adsdk.fxn.kg.gff.fxn fxnVar) {
        if (!com.bytedance.adsdk.fxn.kg.rb.fxn.hm(fxn(i, str))) {
            return fxnVar.fxn(str, i, deque);
        }
        int i2 = i + 1;
        String str2 = new String(new char[]{fxn(i, str), fxn(i2, str)});
        if (com.bytedance.adsdk.fxn.kg.hm.gff.fxn(str2) != null) {
            deque.push(new xdg(com.bytedance.adsdk.fxn.kg.hm.gff.fxn(str2)));
            return i + 2;
        }
        String valueOf = String.valueOf(fxn(i, str));
        if (com.bytedance.adsdk.fxn.kg.hm.gff.fxn(valueOf) != null) {
            deque.push(new xdg(com.bytedance.adsdk.fxn.kg.hm.gff.fxn(valueOf)));
            return i2;
        }
        throw new IllegalArgumentException("Unrecognized:" + valueOf + "examine:" + str.substring(0, i));
    }
}
