package com.bytedance.sdk.component.kg.fxn.fxn.fxn;

import android.text.TextUtils;
import com.alipay.sdk.m.w.a;
import com.bytedance.sdk.component.kg.fxn.dgx;
import com.bytedance.sdk.component.kg.fxn.mvp;

/* loaded from: classes13.dex */
public class hm extends dgx {
    public fxn jq;
    public bh tw;

    public hm(dgx.fxn fxnVar) {
        super(fxnVar);
        this.tw = new bh();
        this.jq = new fxn(this.tw.kg());
    }

    @Override // com.bytedance.sdk.component.kg.fxn.dgx
    public com.bytedance.sdk.component.kg.fxn.hm fxn() {
        return this.tw;
    }

    @Override // com.bytedance.sdk.component.kg.fxn.dgx
    public com.bytedance.sdk.component.kg.fxn.kg fxn(mvp mvpVar) {
        mvpVar.fxn(this);
        if (mvpVar == null || mvpVar.kg() == null || mvpVar.kg().fxn() == null || TextUtils.isEmpty(mvpVar.kg().fxn().toString())) {
            return null;
        }
        if (fxn.fxn != null && fxn.fxn.kg() && this.jq.rb() && !a.x.equals(mvpVar.bh())) {
            kg kgVar = new kg(mvpVar, this.jq);
            this.jq.gff().add(kgVar);
            return kgVar;
        }
        kg kgVar2 = new kg(mvpVar, this.tw);
        this.tw.gff().add(kgVar2);
        return kgVar2;
    }
}
