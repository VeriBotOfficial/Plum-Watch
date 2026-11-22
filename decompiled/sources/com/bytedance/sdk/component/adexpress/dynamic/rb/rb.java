package com.bytedance.sdk.component.adexpress.dynamic.rb;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.rb.kg;
import com.bytedance.sdk.component.adexpress.kg.rlu;
import java.util.Iterator;
import java.util.List;
import org.xmind.core.ITopic;

/* loaded from: classes13.dex */
public class rb {
    public com.bytedance.sdk.component.adexpress.dynamic.hm.kg fxn;
    private com.bytedance.sdk.component.adexpress.dynamic.hm.tw gff;
    private fxn hm;
    protected kg kg;

    static class fxn {
        float fxn;
        float gff;
        float kg;

        fxn() {
        }
    }

    public rb(double d, int i, double d2, String str, rlu rluVar) {
        this.kg = new kg(d, i, d2, str, rluVar);
    }

    public void fxn(fxn fxnVar) {
        this.hm = fxnVar;
    }

    public void fxn() {
        this.kg.fxn();
    }

    public void fxn(com.bytedance.sdk.component.adexpress.dynamic.hm.tw twVar, float f, float f2) {
        if (twVar != null) {
            this.gff = twVar;
        }
        com.bytedance.sdk.component.adexpress.dynamic.hm.tw twVar2 = this.gff;
        float tw = twVar2.tw();
        float jq = twVar2.jq();
        float f3 = TextUtils.equals(twVar2.hie().rb().mve(), "fixed") ? jq : 65536.0f;
        this.kg.fxn();
        this.kg.gff(twVar2, tw, f3);
        kg.gff fxn2 = this.kg.fxn(twVar2);
        com.bytedance.sdk.component.adexpress.dynamic.hm.kg kgVar = new com.bytedance.sdk.component.adexpress.dynamic.hm.kg();
        kgVar.fxn = f;
        kgVar.kg = f2;
        if (fxn2 != null) {
            tw = fxn2.fxn;
        }
        kgVar.gff = tw;
        if (fxn2 != null) {
            jq = fxn2.kg;
        }
        kgVar.hm = jq;
        kgVar.rb = ITopic.ROOT;
        kgVar.jq = 1280.0f;
        kgVar.bh = twVar2;
        kgVar.bh.gff(kgVar.fxn);
        kgVar.bh.hm(kgVar.kg);
        kgVar.bh.rb(kgVar.gff);
        kgVar.bh.bh(kgVar.hm);
        com.bytedance.sdk.component.adexpress.dynamic.hm.kg fxn3 = fxn(kgVar, 0.0f);
        this.fxn = fxn3;
        fxn(fxn3);
    }

    public void fxn(com.bytedance.sdk.component.adexpress.dynamic.hm.kg kgVar) {
        if (kgVar == null) {
            return;
        }
        kgVar.bh.hie().kg();
        float f = kgVar.gff;
        float f2 = kgVar.hm;
        float f3 = kgVar.fxn;
        float f4 = kgVar.kg;
        List<List<com.bytedance.sdk.component.adexpress.dynamic.hm.kg>> list = kgVar.f9334sg;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (List<com.bytedance.sdk.component.adexpress.dynamic.hm.kg> list2 : list) {
            if (list2 != null && list2.size() > 0) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.hm.kg> it = list2.iterator();
                while (it.hasNext()) {
                    fxn(it.next());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x027b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.sdk.component.adexpress.dynamic.hm.kg fxn(com.bytedance.sdk.component.adexpress.dynamic.hm.kg r37, float r38) {
        /*
            Method dump skipped, instructions count: 1012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.rb.rb.fxn(com.bytedance.sdk.component.adexpress.dynamic.hm.kg, float):com.bytedance.sdk.component.adexpress.dynamic.hm.kg");
    }

    private com.bytedance.sdk.component.adexpress.dynamic.hm.jq fxn(com.bytedance.sdk.component.adexpress.dynamic.hm.bh bhVar, kg.gff gffVar, kg.gff gffVar2) {
        float ig = bhVar.ig();
        float gs = bhVar.gs();
        float mcr = bhVar.mcr();
        float fa = bhVar.fa();
        boolean zz = bhVar.zz();
        boolean uws = bhVar.uws();
        boolean qn = bhVar.qn();
        boolean gaw = bhVar.gaw();
        if (!zz) {
            if (uws) {
                ig = ((this.hm.fxn != 0.0f ? Math.min(this.hm.fxn, gffVar.fxn) : gffVar.fxn) - mcr) - gffVar2.fxn;
            } else {
                ig = 0.0f;
            }
        }
        if (!qn) {
            if (gaw) {
                gs = ((this.hm.kg != 0.0f ? this.hm.kg : gffVar.kg) - fa) - gffVar2.kg;
            } else {
                gs = 0.0f;
            }
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.hm.jq(ig, gs);
    }

    private com.bytedance.sdk.component.adexpress.dynamic.hm.jq fxn(com.bytedance.sdk.component.adexpress.dynamic.hm.kg kgVar, com.bytedance.sdk.component.adexpress.dynamic.hm.bh bhVar, float f, float f2) {
        float f3;
        float f4;
        float f5 = kgVar.fxn;
        float f6 = kgVar.kg;
        float ig = bhVar.ig();
        float gs = bhVar.gs();
        float mcr = bhVar.mcr();
        float fa = bhVar.fa();
        boolean zz = bhVar.zz();
        boolean uws = bhVar.uws();
        boolean qn = bhVar.qn();
        boolean gaw = bhVar.gaw();
        String hb = bhVar.hb();
        float f7 = kgVar.gff;
        float f8 = kgVar.hm;
        if (TextUtils.equals(hb, "0")) {
            if (zz) {
                f5 = kgVar.fxn + ig;
            } else if (uws) {
                f5 = ((kgVar.fxn + f7) - mcr) - f;
            }
            if (qn) {
                f4 = kgVar.kg;
                f6 = f4 + gs;
            } else if (gaw) {
                f3 = kgVar.kg;
                f6 = ((f3 + f8) - fa) - f2;
            }
        } else if (TextUtils.equals(hb, "1")) {
            f5 = kgVar.fxn + ((f7 - f) / 2.0f);
            if (qn) {
                f4 = kgVar.kg;
                f6 = f4 + gs;
            } else if (gaw) {
                f3 = kgVar.kg;
                f6 = ((f3 + f8) - fa) - f2;
            }
        } else if (TextUtils.equals(hb, "2")) {
            f6 = kgVar.kg + ((f8 - f2) / 2.0f);
            if (zz) {
                f5 = kgVar.fxn + ig;
            } else if (uws) {
                f5 = ((kgVar.fxn + f7) - mcr) - f;
            }
        } else if (TextUtils.equals(hb, "3")) {
            f5 = kgVar.fxn + ((f7 - f) / 2.0f);
            f6 = kgVar.kg + ((f8 - f2) / 2.0f);
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.hm.jq(f5, f6);
    }
}
