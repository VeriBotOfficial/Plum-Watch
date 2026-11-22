package com.bytedance.adsdk.ugeno.bh.fxn;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.internal.view.SupportMenu;
import com.bytedance.adsdk.ugeno.bh.hm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public abstract class fxn extends LinearLayout {
    private int bh;
    private float dgx;
    protected Context fxn;
    protected int gff;
    private float hie;
    private List<View> hm;
    private int jq;
    protected int kg;
    private String mvp;
    private int rb;

    /* renamed from: sg, reason: collision with root package name */
    private int f9272sg;
    private boolean tw;

    public abstract Drawable kg(int i);

    public fxn(Context context) {
        super(context);
        this.rb = SupportMenu.CATEGORY_MASK;
        this.bh = -16776961;
        this.f9272sg = 5;
        this.kg = 40;
        this.gff = 20;
        this.mvp = "row";
        this.fxn = context;
        this.hm = new ArrayList();
        setOrientation(0);
    }

    public void setIndicatorX(float f) {
        this.hie = f;
    }

    public void setIndicatorY(float f) {
        this.dgx = f;
    }

    public void setIndicatorDirection(String str) {
        this.mvp = str;
        if (TextUtils.equals(str, "column")) {
            setOrientation(1);
        } else {
            setOrientation(0);
        }
    }

    public void setIndicatorWidth(int i) {
        this.kg = i;
    }

    public void setIndicatorHeight(int i) {
        this.gff = i;
    }

    public void fxn(int i, int i2) {
        Iterator<View> it = this.hm.iterator();
        while (it.hasNext()) {
            it.next().setBackground(kg(this.bh));
        }
        if (i < 0 || i >= this.hm.size()) {
            i = 0;
        }
        if (this.hm.size() > 0) {
            this.hm.get(i).setBackground(kg(this.rb));
            this.jq = i2;
        }
    }

    public int getSize() {
        return this.hm.size();
    }

    public void fxn() {
        post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.bh.fxn.fxn.1
            @Override // java.lang.Runnable
            public void run() {
                fxn.this.hm();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm() {
        FrameLayout frameLayout = (FrameLayout) getParent();
        if (frameLayout == null) {
            return;
        }
        float width = frameLayout.getWidth();
        float height = frameLayout.getHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        float width2 = getWidth();
        layoutParams.topMargin = (int) (((int) ((height * r5) / 100.0f)) - ((getHeight() * this.dgx) / 100.0f));
        layoutParams.leftMargin = (int) (((int) ((width * r0) / 100.0f)) - ((width2 * this.hie) / 100.0f));
        setLayoutParams(layoutParams);
    }

    public void setSelectedColor(int i) {
        this.rb = i;
    }

    public void setLoop(boolean z) {
        this.tw = z;
    }

    public void setUnSelectedColor(int i) {
        this.bh = i;
    }

    public void fxn(int i) {
        if (this instanceof kg) {
            this.gff = this.kg;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.kg, this.gff);
        if (getOrientation() == 1) {
            layoutParams.topMargin = this.f9272sg;
            layoutParams.bottomMargin = this.f9272sg;
        } else {
            layoutParams.leftMargin = this.f9272sg;
            layoutParams.rightMargin = this.f9272sg;
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.kg, this.gff);
        if (getOrientation() == 1) {
            layoutParams2.topMargin = this.f9272sg;
            layoutParams2.bottomMargin = this.f9272sg;
        } else {
            layoutParams2.leftMargin = this.f9272sg;
            layoutParams2.rightMargin = this.f9272sg;
        }
        int fxn = hm.fxn(this.tw, this.jq, this.hm.size());
        int fxn2 = hm.fxn(this.tw, i, this.hm.size());
        if (this.hm.size() == 0) {
            fxn2 = 0;
        }
        if (!this.hm.isEmpty() && hm.fxn(fxn, this.hm) && hm.fxn(fxn2, this.hm)) {
            this.hm.get(fxn).setBackground(kg(this.bh));
            this.hm.get(fxn).setLayoutParams(layoutParams2);
            this.hm.get(fxn2).setBackground(kg(this.rb));
            this.hm.get(fxn2).setLayoutParams(layoutParams);
            this.jq = i;
        }
    }

    public void kg() {
        View view = new View(getContext());
        view.setClickable(false);
        if (this instanceof kg) {
            this.gff = this.kg;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.kg, this.gff);
        if (getOrientation() == 1) {
            layoutParams.topMargin = this.f9272sg;
            layoutParams.bottomMargin = this.f9272sg;
        } else {
            layoutParams.leftMargin = this.f9272sg;
            layoutParams.rightMargin = this.f9272sg;
        }
        addView(view, layoutParams);
        view.setBackground(kg(this.bh));
        this.hm.add(view);
    }

    public void gff() {
        this.hm.clear();
        removeAllViews();
    }
}
