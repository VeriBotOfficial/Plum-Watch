package com.bytedance.sdk.openadsdk.bx.kg;

import android.view.View;
import androidx.core.view.InputDeviceCompat;
import com.bytedance.sdk.openadsdk.bx.kg.rb;
import com.bytedance.sdk.openadsdk.core.model.jz;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes14.dex */
public abstract class kg {
    private final rb.fxn bh;
    protected WeakReference<View> fxn;
    protected final AtomicBoolean gff;
    private final AtomicLong hm;
    private volatile boolean jq = false;
    protected jz kg;
    private final AtomicBoolean rb;

    /* renamed from: sg, reason: collision with root package name */
    private final int f9425sg;
    private final Integer tw;

    public abstract int bh();

    protected abstract boolean gff();

    protected abstract void kg(int i);

    public static kg fxn(boolean z, Integer num, View view, jz jzVar, rb.fxn fxnVar) {
        return z ? new tw(num, view, jzVar, fxnVar) : new gff(num, view, jzVar, fxnVar);
    }

    public kg(Integer num, View view, jz jzVar, int i, rb.fxn fxnVar) {
        this.tw = num;
        this.f9425sg = i;
        this.kg = jzVar;
        this.bh = fxnVar;
        fxn(view);
        this.gff = new AtomicBoolean(false);
        this.hm = new AtomicLong(-1L);
        this.rb = new AtomicBoolean(false);
    }

    public void fxn() {
        if (this.gff.compareAndSet(false, true)) {
            sg.fxn(this);
        }
    }

    public int kg() {
        if (jq()) {
            return 1;
        }
        WeakReference<View> weakReference = this.fxn;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || this.jq) {
            return 3;
        }
        if (dgx().equals(view.getTag(InputDeviceCompat.SOURCE_HDMI))) {
            return (dgx().equals(view.getTag(InputDeviceCompat.SOURCE_HDMI)) && gff()) ? 1 : 2;
        }
        hie();
        rb.kg(dgx());
        return 3;
    }

    protected void hm() {
        if (this.rb.compareAndSet(false, true)) {
            hm.fxn(this.kg, rb(), this.bh);
        }
    }

    protected fxn rb() {
        WeakReference<View> weakReference = this.fxn;
        if (weakReference == null) {
            return new fxn(-1, -1, -1.0f);
        }
        View view = weakReference.get();
        if (view == null) {
            return new fxn(0, 0, 0.0f);
        }
        return new fxn(view.getWidth(), view.getHeight(), view.getAlpha());
    }

    public void sg() {
        if (jq()) {
            return;
        }
        if (!this.gff.get()) {
            tw();
        } else if (!this.hm.compareAndSet(-1L, System.currentTimeMillis()) && System.currentTimeMillis() - this.hm.get() >= this.f9425sg) {
            hm();
        }
    }

    public void tw() {
        this.hm.set(-1L);
    }

    public boolean jq() {
        return this.rb.get();
    }

    public void hie() {
        this.jq = true;
        sg.kg(this);
    }

    public void fxn(int i) {
        if (i == 4) {
            fxn();
            return;
        }
        if (i == 8) {
            rlu();
        } else if (i == 9) {
            hm();
        } else {
            kg(i);
        }
    }

    public Integer dgx() {
        return this.tw;
    }

    public boolean mvp() {
        return this.gff.get();
    }

    public void rlu() {
        this.gff.set(false);
        tw();
    }

    public void fxn(View view) {
        if (view != null) {
            view.setTag(InputDeviceCompat.SOURCE_HDMI, dgx());
        }
        this.fxn = new WeakReference<>(view);
    }
}
