package com.bytedance.sdk.component.rb.kg;

import com.bytedance.sdk.component.rb.bh;
import com.bytedance.sdk.component.rb.sg;
import java.util.Map;

/* loaded from: classes13.dex */
public class gff<T> implements bh {
    Map<String, String> fxn;
    private T gff;
    private String hm;
    private int kg;
    private sg rb;

    public gff(int i, T t, String str) {
        this.kg = i;
        this.gff = t;
        this.hm = str;
    }

    public gff(int i, T t, String str, Map<String, String> map) {
        this(i, t, str);
        this.fxn = map;
    }

    @Override // com.bytedance.sdk.component.rb.bh
    public sg fxn() {
        return this.rb;
    }

    public void fxn(sg sgVar) {
        this.rb = sgVar;
    }

    @Override // com.bytedance.sdk.component.rb.bh
    public int kg() {
        return this.kg;
    }

    @Override // com.bytedance.sdk.component.rb.bh
    public T gff() {
        return this.gff;
    }

    @Override // com.bytedance.sdk.component.rb.bh
    public String hm() {
        return this.hm;
    }

    @Override // com.bytedance.sdk.component.rb.bh
    public Map<String, String> rb() {
        return this.fxn;
    }
}
