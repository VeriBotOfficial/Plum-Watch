package com.bytedance.sdk.component.kg.fxn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public abstract class mvp {
    public dgx fxn;
    public com.bytedance.sdk.component.gff.fxn.fxn kg = new com.bytedance.sdk.component.gff.fxn.fxn();

    public abstract String bh();

    public abstract Object fxn();

    public abstract String gff();

    public abstract Map<String, List<String>> hm();

    public abstract sg kg();

    public abstract com.bytedance.sdk.component.kg.fxn.fxn rb();

    public abstract int sg();

    public rlu tw() {
        return null;
    }

    public void fxn(dgx dgxVar) {
        this.fxn = dgxVar;
    }

    public fxn jq() {
        return new fxn(this);
    }

    public static class fxn {
        rlu bh;
        com.bytedance.sdk.component.kg.fxn.fxn fxn;
        sg gff;
        String hm;
        Map<String, List<String>> kg;
        Object rb;

        /* renamed from: sg, reason: collision with root package name */
        int f9376sg;
        String tw;

        public fxn() {
            this.kg = new HashMap();
        }

        public fxn fxn(com.bytedance.sdk.component.kg.fxn.fxn fxnVar) {
            this.fxn = fxnVar;
            return this;
        }

        public fxn fxn(String str) {
            this.tw = str;
            return this;
        }

        public fxn fxn(int i) {
            this.f9376sg = i;
            return this;
        }

        fxn(mvp mvpVar) {
            this.gff = mvpVar.kg();
            this.hm = mvpVar.gff();
            this.kg = mvpVar.hm();
            this.rb = mvpVar.fxn();
            this.bh = mvpVar.tw();
            this.fxn = mvpVar.rb();
            this.f9376sg = mvpVar.sg();
            this.tw = mvpVar.bh();
        }

        public fxn fxn(Object obj) {
            this.rb = obj;
            return this;
        }

        public fxn kg(String str) {
            return fxn(sg.gff(str));
        }

        public fxn fxn(sg sgVar) {
            this.gff = sgVar;
            return this;
        }

        public fxn fxn(String str, String str2) {
            return kg(str, str2);
        }

        public fxn kg(String str, String str2) {
            if (!this.kg.containsKey(str)) {
                this.kg.put(str, new ArrayList());
            }
            this.kg.get(str).add(str2);
            return this;
        }

        public fxn fxn() {
            return fxn("GET", (rlu) null);
        }

        private fxn fxn(String str, rlu rluVar) {
            this.hm = str;
            this.bh = rluVar;
            return this;
        }

        public fxn fxn(rlu rluVar) {
            return fxn("POST", rluVar);
        }

        public mvp kg() {
            return new mvp() { // from class: com.bytedance.sdk.component.kg.fxn.mvp.fxn.1
                @Override // com.bytedance.sdk.component.kg.fxn.mvp
                public Object fxn() {
                    return fxn.this.rb;
                }

                @Override // com.bytedance.sdk.component.kg.fxn.mvp
                public sg kg() {
                    return fxn.this.gff;
                }

                @Override // com.bytedance.sdk.component.kg.fxn.mvp
                public String gff() {
                    return fxn.this.hm;
                }

                @Override // com.bytedance.sdk.component.kg.fxn.mvp
                public Map hm() {
                    return fxn.this.kg;
                }

                @Override // com.bytedance.sdk.component.kg.fxn.mvp
                public com.bytedance.sdk.component.kg.fxn.fxn rb() {
                    return fxn.this.fxn;
                }

                @Override // com.bytedance.sdk.component.kg.fxn.mvp
                public String bh() {
                    return fxn.this.tw;
                }

                @Override // com.bytedance.sdk.component.kg.fxn.mvp
                public int sg() {
                    return fxn.this.f9376sg;
                }

                public String toString() {
                    return "";
                }

                @Override // com.bytedance.sdk.component.kg.fxn.mvp
                public rlu tw() {
                    return fxn.this.bh;
                }
            };
        }
    }
}
