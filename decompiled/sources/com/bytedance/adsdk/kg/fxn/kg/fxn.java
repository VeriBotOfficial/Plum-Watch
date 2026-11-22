package com.bytedance.adsdk.kg.fxn.kg;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public abstract class fxn<K, A> {
    protected com.bytedance.adsdk.kg.sg.kg<A> gff;
    private final gff<K> rb;
    final List<InterfaceC0453fxn> fxn = new ArrayList(1);
    private boolean hm = false;
    protected float kg = 0.0f;
    private A bh = null;

    /* renamed from: sg, reason: collision with root package name */
    private float f9242sg = -1.0f;
    private float tw = -1.0f;

    /* renamed from: com.bytedance.adsdk.kg.fxn.kg.fxn$fxn, reason: collision with other inner class name */
    public interface InterfaceC0453fxn {
        void fxn();
    }

    private interface gff<T> {
        boolean fxn();

        boolean fxn(float f);

        float gff();

        float hm();

        com.bytedance.adsdk.kg.sg.fxn<T> kg();

        boolean kg(float f);
    }

    abstract A fxn(com.bytedance.adsdk.kg.sg.fxn<K> fxnVar, float f);

    fxn(List<? extends com.bytedance.adsdk.kg.sg.fxn<K>> list) {
        this.rb = fxn(list);
    }

    public void fxn() {
        this.hm = true;
    }

    public void fxn(InterfaceC0453fxn interfaceC0453fxn) {
        this.fxn.add(interfaceC0453fxn);
    }

    public void fxn(float f) {
        if (this.rb.fxn()) {
            return;
        }
        if (f < jq()) {
            f = jq();
        } else if (f > bh()) {
            f = bh();
        }
        if (f == this.kg) {
            return;
        }
        this.kg = f;
        if (this.rb.fxn(f)) {
            kg();
        }
    }

    public void kg() {
        for (int i = 0; i < this.fxn.size(); i++) {
            this.fxn.get(i).fxn();
        }
    }

    protected com.bytedance.adsdk.kg.sg.fxn<K> gff() {
        com.bytedance.adsdk.kg.rb.fxn("BaseKeyframeAnimation#getCurrentKeyframe");
        com.bytedance.adsdk.kg.sg.fxn<K> kg2 = this.rb.kg();
        com.bytedance.adsdk.kg.rb.kg("BaseKeyframeAnimation#getCurrentKeyframe");
        return kg2;
    }

    float hm() {
        if (this.hm) {
            return 0.0f;
        }
        com.bytedance.adsdk.kg.sg.fxn<K> gff2 = gff();
        if (gff2.rb()) {
            return 0.0f;
        }
        return (this.kg - gff2.gff()) / (gff2.hm() - gff2.gff());
    }

    protected float rb() {
        com.bytedance.adsdk.kg.sg.fxn<K> gff2 = gff();
        if (gff2 == null || gff2.rb()) {
            return 0.0f;
        }
        return gff2.gff.getInterpolation(hm());
    }

    private float jq() {
        if (this.f9242sg == -1.0f) {
            this.f9242sg = this.rb.gff();
        }
        return this.f9242sg;
    }

    float bh() {
        if (this.tw == -1.0f) {
            this.tw = this.rb.hm();
        }
        return this.tw;
    }

    public A sg() {
        A fxn;
        float hm2 = hm();
        if (this.gff == null && this.rb.kg(hm2)) {
            return this.bh;
        }
        com.bytedance.adsdk.kg.sg.fxn<K> gff2 = gff();
        if (gff2.hm != null && gff2.rb != null) {
            fxn = fxn(gff2, hm2, gff2.hm.getInterpolation(hm2), gff2.rb.getInterpolation(hm2));
        } else {
            fxn = fxn(gff2, rb());
        }
        this.bh = fxn;
        return fxn;
    }

    public float tw() {
        return this.kg;
    }

    protected A fxn(com.bytedance.adsdk.kg.sg.fxn<K> fxnVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    private static <T> gff<T> fxn(List<? extends com.bytedance.adsdk.kg.sg.fxn<T>> list) {
        if (list.isEmpty()) {
            return new kg();
        }
        if (list.size() == 1) {
            return new rb(list);
        }
        return new hm(list);
    }

    private static final class kg<T> implements gff<T> {
        @Override // com.bytedance.adsdk.kg.fxn.kg.fxn.gff
        public boolean fxn() {
            return true;
        }

        @Override // com.bytedance.adsdk.kg.fxn.kg.fxn.gff
        public boolean fxn(float f) {
            return false;
        }

        @Override // com.bytedance.adsdk.kg.fxn.kg.fxn.gff
        public float gff() {
            return 0.0f;
        }

        @Override // com.bytedance.adsdk.kg.fxn.kg.fxn.gff
        public float hm() {
            return 1.0f;
        }

        private kg() {
        }

        @Override // com.bytedance.adsdk.kg.fxn.kg.fxn.gff
        public com.bytedance.adsdk.kg.sg.fxn<T> kg() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.kg.fxn.kg.fxn.gff
        public boolean kg(float f) {
            throw new IllegalStateException("not implemented");
        }
    }

    private static final class rb<T> implements gff<T> {
        private final com.bytedance.adsdk.kg.sg.fxn<T> fxn;
        private float kg = -1.0f;

        @Override // com.bytedance.adsdk.kg.fxn.kg.fxn.gff
        public boolean fxn() {
            return false;
        }

        rb(List<? extends com.bytedance.adsdk.kg.sg.fxn<T>> list) {
            this.fxn = list.get(0);
        }

        @Override // com.bytedance.adsdk.kg.fxn.kg.fxn.gff
        public boolean fxn(float f) {
            return !this.fxn.rb();
        }

        @Override // com.bytedance.adsdk.kg.fxn.kg.fxn.gff
        public com.bytedance.adsdk.kg.sg.fxn<T> kg() {
            return this.fxn;
        }

        @Override // com.bytedance.adsdk.kg.fxn.kg.fxn.gff
        public float gff() {
            return this.fxn.gff();
        }

        @Override // com.bytedance.adsdk.kg.fxn.kg.fxn.gff
        public float hm() {
            return this.fxn.hm();
        }

        @Override // com.bytedance.adsdk.kg.fxn.kg.fxn.gff
        public boolean kg(float f) {
            if (this.kg == f) {
                return true;
            }
            this.kg = f;
            return false;
        }
    }

    private static final class hm<T> implements gff<T> {
        private final List<? extends com.bytedance.adsdk.kg.sg.fxn<T>> fxn;
        private com.bytedance.adsdk.kg.sg.fxn<T> gff = null;
        private float hm = -1.0f;
        private com.bytedance.adsdk.kg.sg.fxn<T> kg = gff(0.0f);

        @Override // com.bytedance.adsdk.kg.fxn.kg.fxn.gff
        public boolean fxn() {
            return false;
        }

        hm(List<? extends com.bytedance.adsdk.kg.sg.fxn<T>> list) {
            this.fxn = list;
        }

        @Override // com.bytedance.adsdk.kg.fxn.kg.fxn.gff
        public boolean fxn(float f) {
            if (this.kg.fxn(f)) {
                return !this.kg.rb();
            }
            this.kg = gff(f);
            return true;
        }

        private com.bytedance.adsdk.kg.sg.fxn<T> gff(float f) {
            com.bytedance.adsdk.kg.sg.fxn<T> fxnVar = this.fxn.get(r0.size() - 1);
            if (f >= fxnVar.gff()) {
                return fxnVar;
            }
            for (int size = this.fxn.size() - 2; size > 0; size--) {
                com.bytedance.adsdk.kg.sg.fxn<T> fxnVar2 = this.fxn.get(size);
                if (this.kg != fxnVar2 && fxnVar2.fxn(f)) {
                    return fxnVar2;
                }
            }
            return this.fxn.get(0);
        }

        @Override // com.bytedance.adsdk.kg.fxn.kg.fxn.gff
        public com.bytedance.adsdk.kg.sg.fxn<T> kg() {
            return this.kg;
        }

        @Override // com.bytedance.adsdk.kg.fxn.kg.fxn.gff
        public float gff() {
            return this.fxn.get(0).gff();
        }

        @Override // com.bytedance.adsdk.kg.fxn.kg.fxn.gff
        public float hm() {
            return this.fxn.get(r0.size() - 1).hm();
        }

        @Override // com.bytedance.adsdk.kg.fxn.kg.fxn.gff
        public boolean kg(float f) {
            com.bytedance.adsdk.kg.sg.fxn<T> fxnVar = this.gff;
            com.bytedance.adsdk.kg.sg.fxn<T> fxnVar2 = this.kg;
            if (fxnVar == fxnVar2 && this.hm == f) {
                return true;
            }
            this.gff = fxnVar2;
            this.hm = f;
            return false;
        }
    }
}
