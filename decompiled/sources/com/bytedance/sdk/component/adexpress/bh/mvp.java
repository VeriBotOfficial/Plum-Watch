package com.bytedance.sdk.component.adexpress.bh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public class mvp extends View {
    private int bh;
    private final List<fxn> ckl;
    private Paint dgx;
    Rect fxn;
    private int gff;
    private Bitmap hie;
    private int hm;
    private int[] jq;
    Rect kg;
    private Xfermode mvp;
    private int rb;
    private PorterDuff.Mode rlu;

    /* renamed from: sg, reason: collision with root package name */
    private int f9316sg;
    private int tw;
    private LinearGradient zu;

    public mvp(Context context) {
        super(context);
        this.rlu = PorterDuff.Mode.DST_IN;
        this.ckl = new ArrayList();
        fxn();
    }

    private void fxn() {
        this.gff = com.bytedance.sdk.component.utils.jz.hm(getContext(), "tt_splash_unlock_image_arrow");
        this.hm = Color.parseColor("#00ffffff");
        this.rb = Color.parseColor("#ffffffff");
        int parseColor = Color.parseColor("#00ffffff");
        this.bh = parseColor;
        this.f9316sg = 10;
        this.tw = 40;
        this.jq = new int[]{this.hm, this.rb, parseColor};
        setLayerType(1, null);
        this.dgx = new Paint(1);
        this.hie = BitmapFactory.decodeResource(getResources(), this.gff);
        this.mvp = new PorterDuffXfermode(this.rlu);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.hie, this.fxn, this.kg, this.dgx);
        canvas.save();
        Iterator<fxn> it = this.ckl.iterator();
        while (it.hasNext()) {
            fxn next = it.next();
            this.zu = new LinearGradient(next.kg, 0.0f, next.kg + this.tw, this.f9316sg, this.jq, (float[]) null, Shader.TileMode.CLAMP);
            this.dgx.setColor(-1);
            this.dgx.setShader(this.zu);
            Canvas canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.dgx);
            this.dgx.setShader(null);
            next.fxn();
            if (next.kg > getWidth()) {
                it.remove();
            }
            canvas = canvas2;
        }
        Canvas canvas3 = canvas;
        this.dgx.setXfermode(this.mvp);
        canvas3.drawBitmap(this.hie, this.fxn, this.kg, this.dgx);
        this.dgx.setXfermode(null);
        canvas3.restore();
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.hie == null) {
            return;
        }
        this.fxn = new Rect(0, 0, this.hie.getWidth(), this.hie.getHeight());
        this.kg = new Rect(0, 0, getWidth(), getHeight());
    }

    public void fxn(int i) {
        this.ckl.add(new fxn(i));
        postInvalidate();
    }

    public static class fxn {
        private final int fxn;
        private int kg = 0;

        public fxn(int i) {
            this.fxn = i;
        }

        public void fxn() {
            this.kg += this.fxn;
        }
    }
}
