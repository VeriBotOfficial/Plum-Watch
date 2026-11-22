package com.bytedance.sdk.component.jq;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes13.dex */
public abstract class gff implements View.OnTouchListener {
    private ViewConfiguration fxn;
    private int kg = -1;

    abstract void fxn(View.OnTouchListener onTouchListener);

    boolean fxn(float f, float f2, float f3, float f4, Context context) {
        if (this.fxn == null) {
            this.fxn = ViewConfiguration.get(context);
        }
        if (this.kg == -1) {
            this.kg = this.fxn.getScaledTouchSlop();
        }
        new Object[]{"mTouchSlop is: ", Integer.valueOf(this.kg)};
        if (Math.abs(f - f3) <= this.kg && Math.abs(f2 - f4) <= this.kg) {
            new Object[]{"isClick", "upX: ", Float.valueOf(f), " ,downX: ", Float.valueOf(f3), " ,upY: ", Float.valueOf(f2), "downY: ", Float.valueOf(f4)};
            return true;
        }
        new Object[]{"notClick", "upX: ", Float.valueOf(f), " ,downX: ", Float.valueOf(f3), " ,upY: ", Float.valueOf(f2), "downY: ", Float.valueOf(f4)};
        return false;
    }
}
