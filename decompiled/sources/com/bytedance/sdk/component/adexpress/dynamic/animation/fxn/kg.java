package com.bytedance.sdk.component.adexpress.dynamic.animation.fxn;

import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ij;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public class kg implements ij {
    List<hm> fxn = new ArrayList();

    public kg(View view, List<com.bytedance.sdk.component.adexpress.dynamic.hm.fxn> list) {
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.hm.fxn> it = list.iterator();
        while (it.hasNext()) {
            hm fxn = gff.fxn().fxn(view, it.next());
            if (fxn != null) {
                this.fxn.add(fxn);
            }
        }
    }

    public void fxn() {
        Iterator<hm> it = this.fxn.iterator();
        while (it.hasNext()) {
            try {
                it.next().gff();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ij
    public void kg() {
        Iterator<hm> it = this.fxn.iterator();
        while (it.hasNext()) {
            try {
                it.next().kg();
            } catch (Exception unused) {
            }
        }
    }
}
