package com.bytedance.sdk.component.kg.fxn;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes13.dex */
public abstract class dgx implements Cloneable {
    public long bh;
    public List<tw> fxn;
    public TimeUnit gff;
    public long hm;
    public long kg;
    public TimeUnit rb;

    /* renamed from: sg, reason: collision with root package name */
    public TimeUnit f9371sg;

    public abstract hm fxn();

    public abstract kg fxn(mvp mvpVar);

    public dgx(fxn fxnVar) {
        this.kg = fxnVar.kg;
        this.hm = fxnVar.hm;
        this.bh = fxnVar.bh;
        this.fxn = fxnVar.fxn;
        this.gff = fxnVar.gff;
        this.rb = fxnVar.rb;
        this.f9371sg = fxnVar.f9372sg;
        this.fxn = fxnVar.fxn;
    }

    public static final class fxn {
        public long bh;
        public final List<tw> fxn;
        public TimeUnit gff;
        public long hm;
        public long kg;
        public TimeUnit rb;

        /* renamed from: sg, reason: collision with root package name */
        public TimeUnit f9372sg;

        public fxn() {
            this.fxn = new ArrayList();
            this.kg = 10000L;
            this.gff = TimeUnit.MILLISECONDS;
            this.hm = 10000L;
            this.rb = TimeUnit.MILLISECONDS;
            this.bh = 10000L;
            this.f9372sg = TimeUnit.MILLISECONDS;
        }

        public fxn(String str) {
            this.fxn = new ArrayList();
            this.kg = 10000L;
            this.gff = TimeUnit.MILLISECONDS;
            this.hm = 10000L;
            this.rb = TimeUnit.MILLISECONDS;
            this.bh = 10000L;
            this.f9372sg = TimeUnit.MILLISECONDS;
        }

        public fxn(dgx dgxVar) {
            this.fxn = new ArrayList();
            this.kg = 10000L;
            this.gff = TimeUnit.MILLISECONDS;
            this.hm = 10000L;
            this.rb = TimeUnit.MILLISECONDS;
            this.bh = 10000L;
            this.f9372sg = TimeUnit.MILLISECONDS;
            this.kg = dgxVar.kg;
            this.gff = dgxVar.gff;
            this.hm = dgxVar.hm;
            this.rb = dgxVar.rb;
            this.bh = dgxVar.bh;
            this.f9372sg = dgxVar.f9371sg;
        }

        public fxn fxn(long j, TimeUnit timeUnit) {
            this.kg = j;
            this.gff = timeUnit;
            return this;
        }

        public fxn kg(long j, TimeUnit timeUnit) {
            this.hm = j;
            this.rb = timeUnit;
            return this;
        }

        public fxn gff(long j, TimeUnit timeUnit) {
            this.bh = j;
            this.f9372sg = timeUnit;
            return this;
        }

        public fxn fxn(tw twVar) {
            this.fxn.add(twVar);
            return this;
        }

        public dgx fxn() {
            return com.bytedance.sdk.component.kg.fxn.fxn.fxn.fxn(this);
        }
    }

    public fxn kg() {
        return new fxn(this);
    }
}
