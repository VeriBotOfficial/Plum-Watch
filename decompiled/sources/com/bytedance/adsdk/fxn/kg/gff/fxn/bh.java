package com.bytedance.adsdk.fxn.kg.gff.fxn;

import com.alibaba.fastjson.parser.JSONLexer;
import java.util.Deque;

/* loaded from: classes13.dex */
public abstract class bh {
    public abstract int fxn(String str, int i, Deque<com.bytedance.adsdk.fxn.kg.kg.fxn> deque, com.bytedance.adsdk.fxn.kg.gff.fxn fxnVar);

    protected char fxn(int i, String str) {
        return i >= str.length() ? JSONLexer.EOI : str.charAt(i);
    }

    protected int kg(int i, String str) {
        while (com.bytedance.adsdk.fxn.kg.rb.fxn.fxn(fxn(i, str))) {
            i++;
        }
        return i;
    }
}
