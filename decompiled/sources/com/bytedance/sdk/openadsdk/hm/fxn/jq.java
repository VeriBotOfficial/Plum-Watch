package com.bytedance.sdk.openadsdk.hm.fxn;

/* loaded from: classes14.dex */
class jq implements com.bytedance.sdk.component.bh.fxn.rb.hm {
    private final com.bytedance.sdk.component.sg.kg fxn;

    public jq(com.bytedance.sdk.component.sg.kg kgVar) {
        this.fxn = kgVar;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.rb.hm
    public boolean fxn() {
        com.bytedance.sdk.component.sg.kg kgVar = this.fxn;
        if (kgVar != null) {
            return kgVar.bh();
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.rb.hm
    public int kg() {
        com.bytedance.sdk.component.sg.kg kgVar = this.fxn;
        if (kgVar != null) {
            return kgVar.fxn();
        }
        return -1;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.rb.hm
    public String gff() {
        com.bytedance.sdk.component.sg.kg kgVar = this.fxn;
        if (kgVar != null) {
            return kgVar.kg();
        }
        return "";
    }
}
