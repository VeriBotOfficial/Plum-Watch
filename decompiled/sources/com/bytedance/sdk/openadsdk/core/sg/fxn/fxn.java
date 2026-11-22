package com.bytedance.sdk.openadsdk.core.sg.fxn;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.adexpress.kg.dgx;
import com.bytedance.sdk.openadsdk.core.gff.gff;
import com.bytedance.sdk.openadsdk.core.model.xdg;
import java.lang.ref.WeakReference;

/* loaded from: classes14.dex */
public class fxn extends gff implements com.bytedance.sdk.component.adexpress.dynamic.bh.fxn {
    protected WeakReference<View> fxn;
    private dgx kg;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bh.fxn
    public void fxn(dgx dgxVar) {
        this.kg = dgxVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bh.fxn
    public void fxn(View view) {
        this.fxn = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.openadsdk.core.gff.gff
    public void fxn(View view, float f, float f2, float f3, float f4, SparseArray<gff.fxn> sparseArray, boolean z) {
        fxn(view, ((Integer) view.getTag()).intValue(), f, f2, f3, f4, sparseArray);
    }

    private void fxn(View view, int i, float f, float f2, float f3, float f4, SparseArray<gff.fxn> sparseArray) {
        if (this.kg != null) {
            String str = "";
            try {
                if (view.getTag(com.bytedance.sdk.component.adexpress.dynamic.fxn.ums) != null) {
                    str = String.valueOf(view.getTag(com.bytedance.sdk.component.adexpress.dynamic.fxn.ums));
                }
            } catch (Exception unused) {
            }
            this.kg.fxn(view, i, new xdg.fxn().hm(f).gff(f2).kg(f3).fxn(f4).kg(this.bx).fxn(this.uhw).fxn(sparseArray).fxn(this.ax).fxn(str).fxn());
        }
    }
}
