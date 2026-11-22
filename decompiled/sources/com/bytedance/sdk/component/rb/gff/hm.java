package com.bytedance.sdk.component.rb.gff;

import com.bytedance.sdk.component.rb.dgx;
import java.util.Map;

/* loaded from: classes13.dex */
public class hm<T> implements dgx {
    private int bh;
    private int dgx;
    private String fxn;
    private T gff;
    private com.bytedance.sdk.component.rb.sg hie;
    private T hm;
    private boolean jq;
    private String kg;
    private int rb;

    /* renamed from: sg, reason: collision with root package name */
    private Map<String, String> f9384sg;
    private boolean tw;

    public hm fxn(gff gffVar, T t) {
        this.gff = t;
        this.fxn = gffVar.hie();
        this.kg = gffVar.fxn();
        this.rb = gffVar.kg();
        this.bh = gffVar.gff();
        this.jq = gffVar.ckl();
        this.hie = gffVar.xdg();
        this.dgx = gffVar.rmu();
        return this;
    }

    public hm fxn(gff gffVar, T t, Map<String, String> map, boolean z) {
        this.f9384sg = map;
        this.tw = z;
        return fxn(gffVar, t);
    }

    @Override // com.bytedance.sdk.component.rb.dgx
    public String fxn() {
        return this.kg;
    }

    @Override // com.bytedance.sdk.component.rb.dgx
    public T kg() {
        return this.gff;
    }

    @Override // com.bytedance.sdk.component.rb.dgx
    public T gff() {
        return this.hm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.rb.dgx
    public void fxn(Object obj) {
        this.hm = this.gff;
        this.gff = obj;
    }

    @Override // com.bytedance.sdk.component.rb.dgx
    public Map<String, String> hm() {
        return this.f9384sg;
    }

    @Override // com.bytedance.sdk.component.rb.dgx
    public boolean rb() {
        return this.tw;
    }

    @Override // com.bytedance.sdk.component.rb.dgx
    public boolean bh() {
        return this.jq;
    }

    @Override // com.bytedance.sdk.component.rb.dgx
    public int sg() {
        return this.dgx;
    }
}
