package com.bytedance.sdk.openadsdk.core.gff;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.gff.gff;
import com.bytedance.sdk.openadsdk.utils.xdg;

/* loaded from: classes14.dex */
public abstract class sg extends gff {
    private final String fxn;
    private gff gff;
    private final com.bytedance.sdk.openadsdk.core.mvp.fxn kg;

    public sg(String str, com.bytedance.sdk.openadsdk.core.mvp.fxn fxnVar) {
        this(str, fxnVar, null);
    }

    public sg(String str, com.bytedance.sdk.openadsdk.core.mvp.fxn fxnVar, gff gffVar) {
        this.fxn = str;
        this.kg = fxnVar;
        this.gff = gffVar;
    }

    public void fxn(gff gffVar) {
        this.gff = gffVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.gff.gff
    protected void fxn(View view, float f, float f2, float f3, float f4, SparseArray<gff.fxn> sparseArray, boolean z) {
        com.bytedance.sdk.openadsdk.core.mvp.fxn fxnVar = this.kg;
        if (fxnVar != null) {
            fxnVar.rb(this.fxn);
        }
        if (view != null) {
            if (view.getId() == xdg.gff) {
                view.setTag(570425345, "VAST_TITLE");
            } else if (view.getId() == xdg.f9576sg) {
                view.setTag(570425345, "VAST_DESCRIPTION");
            } else {
                view.setTag(570425345, this.fxn);
            }
        }
        gff gffVar = this.gff;
        if (gffVar != null) {
            gffVar.bx = this.bx;
            this.gff.uhw = this.uhw;
            this.gff.ke = this.ke;
            this.gff.mve = this.ke;
            this.gff.zn = this.ke;
            this.gff.fxn(view, f, f2, f3, f4, sparseArray, z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.gff.gff, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return super.onTouch(view, motionEvent);
    }
}
