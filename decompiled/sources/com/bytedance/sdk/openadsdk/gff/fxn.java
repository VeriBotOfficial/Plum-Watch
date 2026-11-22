package com.bytedance.sdk.openadsdk.gff;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.utils.wc;

/* loaded from: classes14.dex */
public class fxn extends com.bytedance.sdk.openadsdk.core.bh.tw {
    private Paint fxn;
    private boolean gff;
    private int hm;
    private float kg;

    public fxn(Context context) {
        super(context);
        fxn();
    }

    private void fxn() {
        this.kg = wc.fxn(getContext(), 8.0f);
        this.fxn = new Paint();
    }

    public void setMinTextSize(float f) {
        if (f <= 0.0f) {
            return;
        }
        this.kg = f;
    }

    private void fxn(String str, int i) {
        if (!this.gff && i > 0) {
            float textSize = getTextSize();
            this.fxn.set(getPaint());
            int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
            float fxn = fxn(textSize, str);
            while (fxn > paddingLeft) {
                textSize -= 1.0f;
                this.fxn.setTextSize(textSize);
                if (textSize <= this.kg) {
                    break;
                } else {
                    fxn = fxn(textSize, str);
                }
            }
            setTextSize(0, textSize);
            this.gff = true;
        }
    }

    private float fxn(float f, String str) {
        this.fxn.setTextSize(f);
        return this.fxn.measureText(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bh.tw, android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.hm = getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, this.hm);
        } else {
            layoutParams.height = this.hm;
        }
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bh.tw, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        int i = this.hm;
        if (i == 0 || layoutParams == null) {
            return;
        }
        layoutParams.height = i;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        fxn(getText().toString(), getWidth());
    }
}
