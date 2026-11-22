package com.bytedance.sdk.component.adexpress.dynamic.kg;

import android.text.TextUtils;
import com.anythink.expressad.foundation.d.t;
import com.bytedance.sdk.component.adexpress.dynamic.hm.sg;

/* loaded from: classes13.dex */
public class fxn {
    public static int fxn(sg sgVar) {
        if (sgVar == null) {
            return 0;
        }
        String swx = sgVar.swx();
        String bx = sgVar.bx();
        if (TextUtils.isEmpty(bx) || TextUtils.isEmpty(swx) || !bx.equals(t.aD)) {
            return 0;
        }
        if (swx.equals("shake")) {
            return 2;
        }
        if (swx.equals("twist")) {
            return 3;
        }
        return swx.equals("slide") ? 1 : 0;
    }
}
