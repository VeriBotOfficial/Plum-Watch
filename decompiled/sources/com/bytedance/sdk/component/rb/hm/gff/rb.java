package com.bytedance.sdk.component.rb.hm.gff;

import android.content.Context;
import com.bytedance.sdk.component.rb.dx;
import com.bytedance.sdk.component.rb.je;
import com.bytedance.sdk.component.rb.mvp;
import com.bytedance.sdk.component.rb.rlu;
import com.bytedance.sdk.component.rb.rmu;
import com.bytedance.sdk.component.rb.ums;
import java.util.concurrent.ExecutorService;

/* loaded from: classes13.dex */
public class rb implements rlu {
    private com.bytedance.sdk.component.rb.gff bh;
    private mvp fxn;
    private com.bytedance.sdk.component.rb.hm gff;
    private boolean hie;
    private rmu hm;
    private ums jq;
    private ExecutorService kg;
    private je rb;

    /* renamed from: sg, reason: collision with root package name */
    private com.bytedance.sdk.component.rb.kg f9394sg;
    private dx tw;

    private rb(fxn fxnVar) {
        this.fxn = fxnVar.fxn;
        this.kg = fxnVar.kg;
        this.gff = fxnVar.gff;
        this.hm = fxnVar.hm;
        this.rb = fxnVar.rb;
        this.bh = fxnVar.bh;
        this.f9394sg = fxnVar.f9395sg;
        this.tw = fxnVar.tw;
        this.jq = fxnVar.jq;
        this.hie = fxnVar.hie;
    }

    @Override // com.bytedance.sdk.component.rb.rlu
    public mvp fxn() {
        return this.fxn;
    }

    @Override // com.bytedance.sdk.component.rb.rlu
    public ExecutorService kg() {
        return this.kg;
    }

    @Override // com.bytedance.sdk.component.rb.rlu
    public com.bytedance.sdk.component.rb.hm hm() {
        return this.gff;
    }

    @Override // com.bytedance.sdk.component.rb.rlu
    public rmu rb() {
        return this.hm;
    }

    @Override // com.bytedance.sdk.component.rb.rlu
    public je bh() {
        return this.rb;
    }

    @Override // com.bytedance.sdk.component.rb.rlu
    public com.bytedance.sdk.component.rb.gff sg() {
        return this.bh;
    }

    @Override // com.bytedance.sdk.component.rb.rlu
    public dx gff() {
        return this.tw;
    }

    @Override // com.bytedance.sdk.component.rb.rlu
    public com.bytedance.sdk.component.rb.kg tw() {
        return this.f9394sg;
    }

    @Override // com.bytedance.sdk.component.rb.rlu
    public ums jq() {
        return this.jq;
    }

    @Override // com.bytedance.sdk.component.rb.rlu
    public boolean hie() {
        return this.hie;
    }

    public static rb fxn(Context context) {
        return new fxn().fxn();
    }

    public static class fxn {
        private com.bytedance.sdk.component.rb.gff bh;
        private mvp fxn;
        private com.bytedance.sdk.component.rb.hm gff;
        private boolean hie;
        private rmu hm;
        private ums jq;
        private ExecutorService kg;
        private je rb;

        /* renamed from: sg, reason: collision with root package name */
        private com.bytedance.sdk.component.rb.kg f9395sg;
        private dx tw;

        public fxn fxn(com.bytedance.sdk.component.rb.kg kgVar) {
            this.f9395sg = kgVar;
            return this;
        }

        public fxn fxn(ums umsVar) {
            this.jq = umsVar;
            return this;
        }

        public fxn fxn(dx dxVar) {
            this.tw = dxVar;
            return this;
        }

        public fxn fxn(com.bytedance.sdk.component.rb.hm hmVar) {
            this.gff = hmVar;
            return this;
        }

        public fxn fxn(boolean z) {
            this.hie = z;
            return this;
        }

        public rb fxn() {
            return new rb(this);
        }
    }
}
