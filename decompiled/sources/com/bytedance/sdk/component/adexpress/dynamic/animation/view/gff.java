package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dgx;

/* loaded from: classes13.dex */
public class gff {
    private int bh;
    Paint fxn;
    private int hm;
    private int rb;
    Path kg = new Path();
    Path gff = new Path();

    public gff() {
        Paint paint = new Paint();
        this.fxn = paint;
        paint.setAntiAlias(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void fxn(android.graphics.Canvas r21, com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation r22, android.view.View r23) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.animation.view.gff.fxn(android.graphics.Canvas, com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation, android.view.View):void");
    }

    public void fxn(View view, float f) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) (this.bh * f);
        view.setTranslationX((this.bh - layoutParams.width) / 2);
        if (view instanceof dgx) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    break;
                }
                viewGroup.getChildAt(i).setTranslationX((-(this.bh - layoutParams.width)) / 2);
                i++;
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public void fxn(View view, int i, int i2) {
        String str;
        this.hm = i / 2;
        this.rb = i2 / 2;
        if (this.bh == 0 && view.getLayoutParams().width > 0) {
            this.bh = view.getLayoutParams().width;
        }
        try {
            str = (String) view.getTag(2097610710);
            try {
                this.gff.addRoundRect(new RectF(0.0f, 0.0f, i, i2), i2 / 2, i2 / 2, Path.Direction.CW);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = "";
        }
        if ("right".equals(str)) {
            view.setPivotX(this.hm * 2);
            view.setPivotY(this.rb);
        } else if ("left".equals(str)) {
            view.setPivotX(0.0f);
            view.setPivotY(this.rb);
        } else {
            view.setPivotX(this.hm);
            view.setPivotY(this.rb);
        }
    }
}
