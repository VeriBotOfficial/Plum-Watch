package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.sdk.component.utils.jz;
import com.bytedance.sdk.openadsdk.utils.wc;

/* loaded from: classes14.dex */
public class xdg extends View {
    private float bh;
    private final Path fxn;
    private int gff;
    private Drawable hm;
    private final boolean kg;
    private Drawable rb;

    public xdg(Context context) {
        this(context, false);
    }

    public xdg(Context context, boolean z) {
        super(context);
        this.fxn = new Path();
        this.kg = z;
        fxn();
    }

    private void fxn() {
        Context context = getContext();
        this.hm = jz.gff(context, this.kg ? "tt_star_thick_dark" : "tt_star_thick");
        this.rb = jz.gff(context, "tt_star");
    }

    public void fxn(double d, int i) {
        int fxn = (int) wc.fxn(getContext(), i, false);
        this.gff = fxn;
        this.hm.setBounds(0, 0, fxn, fxn);
        Drawable drawable = this.rb;
        int i2 = this.gff;
        drawable.setBounds(0, 0, i2, i2);
        this.bh = ((float) d) / 5.0f;
        kg();
        requestLayout();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        kg();
    }

    private void kg() {
        int width = getWidth();
        int height = getHeight();
        if (this.bh <= 0.0f || width <= 0 || height <= 0) {
            return;
        }
        this.fxn.reset();
        this.fxn.addRect(new RectF(0.0f, 0.0f, width * this.bh, height), Path.Direction.CCW);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.gff * 5, 1073741824), View.MeasureSpec.makeMeasureSpec(this.gff, 1073741824));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.gff <= 0) {
            return;
        }
        int save = canvas.save();
        for (int i = 0; i < 5; i++) {
            this.hm.draw(canvas);
            canvas.translate(this.gff, 0.0f);
        }
        canvas.restoreToCount(save);
        canvas.clipPath(this.fxn);
        for (int i2 = 0; i2 < 5; i2++) {
            this.rb.draw(canvas);
            canvas.translate(this.gff, 0.0f);
        }
    }
}
