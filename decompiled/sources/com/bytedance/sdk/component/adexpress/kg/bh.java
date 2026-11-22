package com.bytedance.sdk.component.adexpress.kg;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.kg.hie;

/* loaded from: classes13.dex */
public class bh implements hie {
    private Context fxn;
    private rlu gff;
    private fxn kg;

    @Override // com.bytedance.sdk.component.adexpress.kg.hie
    public void fxn() {
    }

    public bh(Context context, rlu rluVar, fxn fxnVar) {
        this.fxn = context;
        this.kg = fxnVar;
        this.gff = rluVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.kg.hie
    public boolean fxn(final hie.fxn fxnVar) {
        this.gff.rb().bh();
        this.kg.fxn(new sg() { // from class: com.bytedance.sdk.component.adexpress.kg.bh.1
            @Override // com.bytedance.sdk.component.adexpress.kg.sg
            public void fxn(View view, zu zuVar) {
                if (fxnVar.gff()) {
                    return;
                }
                ckl kg = fxnVar.kg();
                if (kg != null) {
                    kg.fxn(bh.this.kg, zuVar);
                }
                fxnVar.fxn(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.kg.sg
            public void fxn(int i, String str) {
                ckl kg = fxnVar.kg();
                if (kg != null) {
                    kg.a_(i);
                }
            }
        });
        return true;
    }

    public void fxn(gff gffVar) {
        this.kg.fxn(gffVar);
    }
}
