package com.bytedance.sdk.component.bh.fxn.fxn.fxn;

import android.content.Context;
import com.bytedance.sdk.component.bh.fxn.fxn.fxn.kg;

/* loaded from: classes13.dex */
public class fxn extends kg {
    private static volatile fxn fxn;

    @Override // com.bytedance.sdk.component.bh.fxn.fxn.fxn.kg
    public /* bridge */ /* synthetic */ kg.C0477kg fxn() {
        return super.fxn();
    }

    public static fxn fxn(Context context) {
        if (fxn == null) {
            synchronized (fxn.class) {
                if (fxn == null) {
                    fxn = new fxn(context);
                }
            }
        }
        return fxn;
    }

    private fxn(Context context) {
        super(context);
    }
}
