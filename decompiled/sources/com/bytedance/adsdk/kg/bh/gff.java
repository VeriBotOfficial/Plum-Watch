package com.bytedance.adsdk.kg.bh;

import android.view.Choreographer;
import com.bytedance.adsdk.kg.sg;

/* loaded from: classes13.dex */
public class gff extends fxn implements Choreographer.FrameCallback {
    private sg hie;
    private float kg = 1.0f;
    private boolean gff = false;
    private long hm = 0;
    private float rb = 0.0f;
    private float bh = 0.0f;

    /* renamed from: sg, reason: collision with root package name */
    private int f9226sg = 0;
    private float tw = -2.1474836E9f;
    private float jq = 2.1474836E9f;
    protected boolean fxn = false;
    private boolean dgx = false;

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(bh());
    }

    public float bh() {
        sg sgVar = this.hie;
        if (sgVar == null) {
            return 0.0f;
        }
        return (this.bh - sgVar.bh()) / (this.hie.sg() - this.hie.bh());
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float ckl;
        float xdg;
        float ckl2;
        if (this.hie == null) {
            return 0.0f;
        }
        if (dx()) {
            ckl = xdg() - this.bh;
            xdg = xdg();
            ckl2 = ckl();
        } else {
            ckl = this.bh - ckl();
            xdg = xdg();
            ckl2 = ckl();
        }
        return ckl / (xdg - ckl2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        sg sgVar = this.hie;
        if (sgVar == null) {
            return 0L;
        }
        return (long) sgVar.rb();
    }

    public float sg() {
        return this.bh;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.fxn;
    }

    public void gff(boolean z) {
        this.dgx = z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        rmu();
        if (this.hie == null || !isRunning()) {
            return;
        }
        com.bytedance.adsdk.kg.rb.fxn("LottieValueAnimator#doFrame");
        float ud = (this.hm != 0 ? j - r1 : 0L) / ud();
        float f = this.rb;
        if (dx()) {
            ud = -ud;
        }
        float f2 = f + ud;
        boolean gff = rb.gff(f2, ckl(), xdg());
        float f3 = this.rb;
        float kg = rb.kg(f2, ckl(), xdg());
        this.rb = kg;
        if (this.dgx) {
            kg = (float) Math.floor(kg);
        }
        this.bh = kg;
        this.hm = j;
        if (!this.dgx || this.rb != f3) {
            gff();
        }
        if (!gff) {
            if (getRepeatCount() != -1 && this.f9226sg >= getRepeatCount()) {
                float ckl = this.kg < 0.0f ? ckl() : xdg();
                this.rb = ckl;
                this.bh = ckl;
                je();
                kg(dx());
            } else {
                fxn();
                this.f9226sg++;
                if (getRepeatMode() == 2) {
                    this.gff = !this.gff;
                    jq();
                } else {
                    float xdg = dx() ? xdg() : ckl();
                    this.rb = xdg;
                    this.bh = xdg;
                }
                this.hm = j;
            }
        }
        ums();
        com.bytedance.adsdk.kg.rb.kg("LottieValueAnimator#doFrame");
    }

    private float ud() {
        sg sgVar = this.hie;
        if (sgVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / sgVar.mvp()) / Math.abs(this.kg);
    }

    public void tw() {
        this.hie = null;
        this.tw = -2.1474836E9f;
        this.jq = 2.1474836E9f;
    }

    public void fxn(sg sgVar) {
        boolean z = this.hie == null;
        this.hie = sgVar;
        if (z) {
            fxn(Math.max(this.tw, sgVar.bh()), Math.min(this.jq, sgVar.sg()));
        } else {
            fxn((int) sgVar.bh(), (int) sgVar.sg());
        }
        float f = this.bh;
        this.bh = 0.0f;
        this.rb = 0.0f;
        fxn((int) f);
        gff();
    }

    public void fxn(float f) {
        if (this.rb == f) {
            return;
        }
        float kg = rb.kg(f, ckl(), xdg());
        this.rb = kg;
        if (this.dgx) {
            kg = (float) Math.floor(kg);
        }
        this.bh = kg;
        this.hm = 0L;
        gff();
    }

    public void fxn(int i) {
        fxn(i, (int) this.jq);
    }

    public void kg(float f) {
        fxn(this.tw, f);
    }

    public void fxn(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        sg sgVar = this.hie;
        float bh = sgVar == null ? -3.4028235E38f : sgVar.bh();
        sg sgVar2 = this.hie;
        float sg2 = sgVar2 == null ? Float.MAX_VALUE : sgVar2.sg();
        float kg = rb.kg(f, bh, sg2);
        float kg2 = rb.kg(f2, bh, sg2);
        if (kg == this.tw && kg2 == this.jq) {
            return;
        }
        this.tw = kg;
        this.jq = kg2;
        fxn((int) rb.kg(this.bh, kg, kg2));
    }

    public void jq() {
        gff(-hie());
    }

    public void gff(float f) {
        this.kg = f;
    }

    public float hie() {
        return this.kg;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.gff) {
            return;
        }
        this.gff = false;
        jq();
    }

    public void dgx() {
        this.fxn = true;
        fxn(dx());
        fxn((int) (dx() ? xdg() : ckl()));
        this.hm = 0L;
        this.f9226sg = 0;
        rmu();
    }

    public void mvp() {
        je();
        kg(dx());
    }

    public void rlu() {
        je();
        hm();
    }

    public void zu() {
        this.fxn = true;
        rmu();
        this.hm = 0L;
        if (dx() && sg() == ckl()) {
            fxn(xdg());
        } else if (!dx() && sg() == xdg()) {
            fxn(ckl());
        }
        rb();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        kg();
        je();
    }

    private boolean dx() {
        return hie() < 0.0f;
    }

    public float ckl() {
        sg sgVar = this.hie;
        if (sgVar == null) {
            return 0.0f;
        }
        float f = this.tw;
        return f == -2.1474836E9f ? sgVar.bh() : f;
    }

    public float xdg() {
        sg sgVar = this.hie;
        if (sgVar == null) {
            return 0.0f;
        }
        float f = this.jq;
        return f == 2.1474836E9f ? sgVar.sg() : f;
    }

    @Override // com.bytedance.adsdk.kg.bh.fxn
    void kg() {
        super.kg();
        kg(dx());
    }

    protected void rmu() {
        if (isRunning()) {
            hm(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    protected void je() {
        hm(true);
    }

    protected void hm(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.fxn = false;
        }
    }

    private void ums() {
        if (this.hie == null) {
            return;
        }
        float f = this.bh;
        if (f < this.tw || f > this.jq) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.tw), Float.valueOf(this.jq), Float.valueOf(this.bh)));
        }
    }
}
