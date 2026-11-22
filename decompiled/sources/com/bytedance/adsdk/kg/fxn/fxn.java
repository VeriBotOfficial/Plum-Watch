package com.bytedance.adsdk.kg.fxn;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import com.bytedance.adsdk.kg.bh.rb;

/* loaded from: classes13.dex */
public class fxn extends Paint {
    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public fxn() {
    }

    public fxn(int i) {
        super(i);
    }

    public fxn(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public fxn(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT < 29) {
            setColor((rb.fxn(i, 0, 255) << 24) | (getColor() & 16777215));
        } else {
            super.setAlpha(rb.fxn(i, 0, 255));
        }
    }
}
