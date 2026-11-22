package com.bytedance.sdk.openadsdk.core.widget;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.wc;

/* loaded from: classes14.dex */
public class ud {
    private int bh;
    private boolean dgx;
    private final fxn fxn;
    private float hm;
    private float rb;

    /* renamed from: sg, reason: collision with root package name */
    private int f9537sg;
    private final boolean kg = false;
    private boolean gff = false;
    private boolean tw = true;
    private boolean jq = false;
    private final View.OnTouchListener hie = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.ud.1
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (ud.this.fxn.jz()) {
                return !ud.this.gff;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                ud udVar = ud.this;
                udVar.dgx = udVar.fxn(motionEvent);
                ud.this.hm = x;
                ud.this.rb = y;
                ud.this.bh = (int) x;
                ud.this.f9537sg = (int) y;
                ud.this.tw = true;
                if (ud.this.fxn != null && ud.this.gff) {
                    ud.this.fxn.fxn(view, true);
                }
            } else if (action == 1) {
                if (Math.abs(x - ud.this.bh) > 20.0f || Math.abs(y - ud.this.f9537sg) > 20.0f) {
                    ud.this.tw = false;
                }
                ud.this.tw = true;
                ud.this.jq = false;
                ud.this.hm = 0.0f;
                ud.this.rb = 0.0f;
                ud.this.bh = 0;
                if (ud.this.fxn != null) {
                    ud.this.fxn.fxn(view, ud.this.tw);
                }
                ud.this.dgx = false;
            } else if (action == 3) {
                ud.this.dgx = false;
            }
            return !ud.this.gff;
        }
    };

    public interface fxn {
        void fxn(View view, boolean z);

        boolean jz();
    }

    public ud(fxn fxnVar) {
        this.fxn = fxnVar;
    }

    public void fxn(View view) {
        if (view != null) {
            view.setOnTouchListener(this.hie);
        }
    }

    public void fxn(boolean z) {
        this.gff = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean fxn(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        int gff = wc.gff(com.bytedance.sdk.openadsdk.core.rmu.fxn().getApplicationContext());
        int rb = wc.rb(com.bytedance.sdk.openadsdk.core.rmu.fxn().getApplicationContext());
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float f = gff;
        if (rawX <= f * 0.01f || rawX >= f * 0.99f) {
            return true;
        }
        float f2 = rb;
        return rawY <= 0.01f * f2 || rawY >= f2 * 0.99f;
    }
}
