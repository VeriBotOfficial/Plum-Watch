package com.bytedance.adsdk.kg.sg;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.adsdk.kg.sg;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes13.dex */
public class fxn<T> {
    public final float bh;
    private float ckl;
    private float dgx;
    public final T fxn;
    public final Interpolator gff;
    private final sg hie;
    public final Interpolator hm;
    public PointF jq;
    public T kg;
    private float mvp;
    public final Interpolator rb;
    private int rlu;

    /* renamed from: sg, reason: collision with root package name */
    public Float f9267sg;
    public PointF tw;
    private float xdg;
    private int zu;

    public fxn(sg sgVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.dgx = -3987645.8f;
        this.mvp = -3987645.8f;
        this.rlu = 784923401;
        this.zu = 784923401;
        this.ckl = Float.MIN_VALUE;
        this.xdg = Float.MIN_VALUE;
        this.tw = null;
        this.jq = null;
        this.hie = sgVar;
        this.fxn = t;
        this.kg = t2;
        this.gff = interpolator;
        this.hm = null;
        this.rb = null;
        this.bh = f;
        this.f9267sg = f2;
    }

    public fxn(sg sgVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, float f, Float f2) {
        this.dgx = -3987645.8f;
        this.mvp = -3987645.8f;
        this.rlu = 784923401;
        this.zu = 784923401;
        this.ckl = Float.MIN_VALUE;
        this.xdg = Float.MIN_VALUE;
        this.tw = null;
        this.jq = null;
        this.hie = sgVar;
        this.fxn = t;
        this.kg = t2;
        this.gff = null;
        this.hm = interpolator;
        this.rb = interpolator2;
        this.bh = f;
        this.f9267sg = f2;
    }

    protected fxn(sg sgVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.dgx = -3987645.8f;
        this.mvp = -3987645.8f;
        this.rlu = 784923401;
        this.zu = 784923401;
        this.ckl = Float.MIN_VALUE;
        this.xdg = Float.MIN_VALUE;
        this.tw = null;
        this.jq = null;
        this.hie = sgVar;
        this.fxn = t;
        this.kg = t2;
        this.gff = interpolator;
        this.hm = interpolator2;
        this.rb = interpolator3;
        this.bh = f;
        this.f9267sg = f2;
    }

    public fxn(T t) {
        this.dgx = -3987645.8f;
        this.mvp = -3987645.8f;
        this.rlu = 784923401;
        this.zu = 784923401;
        this.ckl = Float.MIN_VALUE;
        this.xdg = Float.MIN_VALUE;
        this.tw = null;
        this.jq = null;
        this.hie = null;
        this.fxn = t;
        this.kg = t;
        this.gff = null;
        this.hm = null;
        this.rb = null;
        this.bh = Float.MIN_VALUE;
        this.f9267sg = Float.valueOf(Float.MAX_VALUE);
    }

    private fxn(T t, T t2) {
        this.dgx = -3987645.8f;
        this.mvp = -3987645.8f;
        this.rlu = 784923401;
        this.zu = 784923401;
        this.ckl = Float.MIN_VALUE;
        this.xdg = Float.MIN_VALUE;
        this.tw = null;
        this.jq = null;
        this.hie = null;
        this.fxn = t;
        this.kg = t2;
        this.gff = null;
        this.hm = null;
        this.rb = null;
        this.bh = Float.MIN_VALUE;
        this.f9267sg = Float.valueOf(Float.MAX_VALUE);
    }

    public fxn<T> fxn(T t, T t2) {
        return new fxn<>(t, t2);
    }

    public float gff() {
        sg sgVar = this.hie;
        if (sgVar == null) {
            return 0.0f;
        }
        if (this.ckl == Float.MIN_VALUE) {
            this.ckl = (this.bh - sgVar.bh()) / this.hie.rmu();
        }
        return this.ckl;
    }

    public float hm() {
        if (this.hie == null) {
            return 1.0f;
        }
        if (this.xdg == Float.MIN_VALUE) {
            if (this.f9267sg == null) {
                this.xdg = 1.0f;
            } else {
                this.xdg = gff() + ((this.f9267sg.floatValue() - this.bh) / this.hie.rmu());
            }
        }
        return this.xdg;
    }

    public boolean rb() {
        return this.gff == null && this.hm == null && this.rb == null;
    }

    public boolean fxn(float f) {
        return f >= gff() && f < hm();
    }

    public float bh() {
        if (this.dgx == -3987645.8f) {
            this.dgx = ((Float) this.fxn).floatValue();
        }
        return this.dgx;
    }

    public float sg() {
        if (this.mvp == -3987645.8f) {
            this.mvp = ((Float) this.kg).floatValue();
        }
        return this.mvp;
    }

    public int tw() {
        if (this.rlu == 784923401) {
            this.rlu = ((Integer) this.fxn).intValue();
        }
        return this.rlu;
    }

    public int jq() {
        if (this.zu == 784923401) {
            this.zu = ((Integer) this.kg).intValue();
        }
        return this.zu;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.fxn + ", endValue=" + this.kg + ", startFrame=" + this.bh + ", endFrame=" + this.f9267sg + ", interpolator=" + this.gff + AbstractJsonLexerKt.END_OBJ;
    }
}
