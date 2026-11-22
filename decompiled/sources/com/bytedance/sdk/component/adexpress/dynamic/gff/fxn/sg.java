package com.bytedance.sdk.component.adexpress.dynamic.gff.fxn;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.SoftReference;

/* loaded from: classes13.dex */
public class sg implements View.OnTouchListener {
    private static int gff = 10;
    private float fxn;
    private com.bytedance.sdk.component.adexpress.dynamic.gff.tw hm;
    private float kg;
    private int rb;
    private RectF bh = new RectF();

    /* renamed from: sg, reason: collision with root package name */
    private long f9328sg = 0;
    private final int tw = 200;
    private final int jq = 3;
    private SoftReference<View> hie = new SoftReference<>(null);

    public sg(com.bytedance.sdk.component.adexpress.dynamic.gff.tw twVar, int i, final ViewGroup viewGroup) {
        this.rb = gff;
        this.hm = twVar;
        if (i > 0) {
            this.rb = i;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.gff.fxn.sg.1
                @Override // java.lang.Runnable
                public void run() {
                    View findViewById = viewGroup.findViewById(2097610746);
                    sg.this.hie = new SoftReference(findViewById);
                }
            });
        }
    }

    private RectF fxn(View view) {
        if (view == null) {
            return new RectF();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], r2 + view.getWidth(), iArr[1] + view.getHeight());
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.gff.tw twVar;
        com.bytedance.sdk.component.adexpress.dynamic.gff.tw twVar2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.bh = fxn(this.hie.get());
            this.fxn = motionEvent.getRawX();
            this.kg = motionEvent.getRawY();
            this.f9328sg = System.currentTimeMillis();
        } else if (action == 1) {
            RectF rectF = this.bh;
            if (rectF != null && !rectF.contains(this.fxn, this.kg)) {
                return false;
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float abs = Math.abs(rawX - this.fxn);
            float abs2 = Math.abs(rawY - this.kg);
            int kg = com.bytedance.sdk.component.adexpress.hm.sg.kg(com.bytedance.sdk.component.adexpress.hm.fxn(), Math.abs(rawX - this.fxn));
            int i = gff;
            if (abs < i || abs2 < i) {
                if ((System.currentTimeMillis() - this.f9328sg < 200 || (abs < 3.0f && abs2 < 3.0f)) && (twVar = this.hm) != null) {
                    twVar.fxn();
                }
            } else if (rawX > this.fxn && kg > this.rb && (twVar2 = this.hm) != null) {
                twVar2.fxn();
            }
        }
        return true;
    }
}
