package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public abstract class rb extends FrameLayout implements IAnimation, ij, ils {
    private static final View.OnTouchListener iwp = new View.OnTouchListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rb.2
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };
    private static final View.OnClickListener jz = new View.OnClickListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rb.3
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    };
    protected float bh;
    protected View ckl;
    protected Context dgx;
    private float dx;
    private float fxn;
    protected float gff;
    protected int hie;
    protected float hm;
    com.bytedance.sdk.component.adexpress.dynamic.animation.view.gff je;
    protected int jq;
    private float kg;
    protected com.bytedance.sdk.component.adexpress.dynamic.hm.sg mvp;
    protected float rb;
    protected com.bytedance.sdk.component.adexpress.dynamic.hm.tw rlu;
    protected com.bytedance.sdk.component.adexpress.dynamic.animation.fxn.kg rmu;

    /* renamed from: sg, reason: collision with root package name */
    protected int f9321sg;
    protected int tw;
    private float ud;
    private com.bytedance.sdk.component.utils.bx ums;
    protected boolean xdg;
    protected DynamicRootView zu;

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.kg;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f) {
        this.kg = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.fxn;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f) {
        this.fxn = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.ud;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f) {
        this.ud = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.dx;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f) {
        this.dx = f;
        this.je.fxn(this, f);
    }

    public rb(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.hm.tw twVar) {
        super(context);
        this.dgx = context;
        this.zu = dynamicRootView;
        this.rlu = twVar;
        this.gff = twVar.bh();
        this.hm = twVar.sg();
        this.rb = twVar.tw();
        this.bh = twVar.jq();
        this.jq = (int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.dgx, this.gff);
        this.hie = (int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.dgx, this.hm);
        this.f9321sg = (int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.dgx, this.rb);
        this.tw = (int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.dgx, this.bh);
        com.bytedance.sdk.component.adexpress.dynamic.hm.sg sgVar = new com.bytedance.sdk.component.adexpress.dynamic.hm.sg(twVar.hie());
        this.mvp = sgVar;
        if (sgVar.je() > 0) {
            this.f9321sg += this.mvp.je() * 2;
            this.tw += this.mvp.je() * 2;
            this.jq -= this.mvp.je();
            this.hie -= this.mvp.je();
            List<com.bytedance.sdk.component.adexpress.dynamic.hm.tw> dgx = twVar.dgx();
            if (dgx != null) {
                for (com.bytedance.sdk.component.adexpress.dynamic.hm.tw twVar2 : dgx) {
                    twVar2.gff(twVar2.bh() + com.bytedance.sdk.component.adexpress.hm.sg.kg(this.dgx, this.mvp.je()));
                    twVar2.hm(twVar2.sg() + com.bytedance.sdk.component.adexpress.hm.sg.kg(this.dgx, this.mvp.je()));
                    twVar2.fxn(com.bytedance.sdk.component.adexpress.hm.sg.kg(this.dgx, this.mvp.je()));
                    twVar2.kg(com.bytedance.sdk.component.adexpress.hm.sg.kg(this.dgx, this.mvp.je()));
                }
            }
        }
        this.xdg = this.mvp.zu() > 0.0d;
        this.je = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.gff();
    }

    public void setShouldInvisible(boolean z) {
        this.xdg = z;
    }

    public boolean getBeginInvisibleAndShow() {
        return this.xdg;
    }

    public boolean gff() {
        jq();
        bh();
        hm();
        return true;
    }

    public void fxn(int i) {
        com.bytedance.sdk.component.adexpress.dynamic.hm.sg sgVar = this.mvp;
        if (sgVar != null && sgVar.fxn(i)) {
            jq();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt != null && (getChildAt(i2) instanceof rb)) {
                    ((rb) childAt).fxn(i);
                }
            }
        }
    }

    protected boolean hm() {
        View.OnTouchListener onTouchListener;
        View.OnClickListener onClickListener;
        View view = this.ckl;
        if (view == null) {
            view = this;
        }
        if (rb()) {
            onTouchListener = (View.OnTouchListener) getDynamicClickListener();
            onClickListener = (View.OnClickListener) getDynamicClickListener();
        } else {
            onTouchListener = iwp;
            onClickListener = jz;
        }
        if (onTouchListener != null && onClickListener != null) {
            view.setOnTouchListener(onTouchListener);
            view.setOnClickListener(onClickListener);
            int fxn = com.bytedance.sdk.component.adexpress.dynamic.kg.fxn.fxn(this.mvp);
            if (fxn == 2 || fxn == 3) {
                view.setOnClickListener(jz);
            } else {
                view.setOnClickListener(onClickListener);
            }
        }
        fxn(view);
        kg(view);
        return true;
    }

    protected void fxn(View view) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.rlu.tw());
            jSONObject.put("height", this.rlu.jq());
            if (com.bytedance.sdk.component.adexpress.hm.kg()) {
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.fxn.dx, this.mvp.swx());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.fxn.ums, this.rlu.hie().kg());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.fxn.iwp, this.rlu.gff());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.fxn.jz, jSONObject.toString());
                return;
            }
            view.setTag(2097610717, this.mvp.swx());
            view.setTag(2097610715, this.rlu.hie().kg());
            view.setTag(2097610714, this.rlu.gff());
            view.setTag(2097610713, jSONObject.toString());
            int fxn = com.bytedance.sdk.component.adexpress.dynamic.kg.fxn.fxn(this.mvp);
            if (fxn == 1) {
                view.setTag(2097610707, new Pair(this.mvp.uhw(), Long.valueOf(this.mvp.ke())));
                view.setTag(2097610708, Integer.valueOf(fxn));
            }
        } catch (JSONException unused) {
        }
    }

    protected void kg(View view) {
        com.bytedance.sdk.component.adexpress.dynamic.hm.bh rb;
        com.bytedance.sdk.component.adexpress.dynamic.hm.tw twVar = this.rlu;
        if (twVar == null || (rb = twVar.hie().rb()) == null) {
            return;
        }
        view.setTag(2097610716, Boolean.valueOf(rb.iqs()));
    }

    public boolean rb() {
        com.bytedance.sdk.component.adexpress.dynamic.hm.sg sgVar = this.mvp;
        return (sgVar == null || sgVar.mve() == 0) ? false : true;
    }

    public void bh() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f9321sg, this.tw);
        layoutParams.topMargin = this.hie;
        layoutParams.leftMargin = this.jq;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    public int getClickArea() {
        return this.mvp.mve();
    }

    public String getImageObjectFit() {
        return this.mvp.fqt();
    }

    public com.bytedance.sdk.component.adexpress.dynamic.bh.fxn getDynamicClickListener() {
        return this.zu.getDynamicClickListener();
    }

    protected Drawable getBackgroundDrawable() {
        return fxn(false, "");
    }

    protected Drawable fxn(boolean z, String str) {
        String[] split;
        int[] iArr;
        int zn;
        if (!TextUtils.isEmpty(this.mvp.yws())) {
            try {
                String yws = this.mvp.yws();
                String substring = yws.substring(yws.indexOf(Separators.LPAREN) + 1, yws.length() - 1);
                if (substring.contains("rgba") && substring.contains(Separators.PERCENT)) {
                    split = new String[]{substring.substring(0, substring.indexOf(",")).trim(), substring.substring(substring.indexOf(",") + 1, substring.indexOf(Separators.PERCENT) + 1).trim(), substring.substring(substring.indexOf(Separators.PERCENT) + 2).trim()};
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.hm.sg.fxn(split[1]), com.bytedance.sdk.component.adexpress.dynamic.hm.sg.fxn(split[2])};
                } else {
                    split = substring.split(", ");
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.hm.sg.fxn(split[1].substring(0, 7)), com.bytedance.sdk.component.adexpress.dynamic.hm.sg.fxn(split[2].substring(0, 7))};
                }
                try {
                    double parseDouble = Double.parseDouble(substring.substring(substring.indexOf("linear-gradient(") + 1, substring.indexOf("deg")));
                    if (parseDouble > 225.0d && parseDouble < 315.0d) {
                        int i = iArr[1];
                        iArr[1] = iArr[0];
                        iArr[0] = i;
                    }
                } catch (Exception unused) {
                }
                GradientDrawable fxn = fxn(fxn(split[0]), iArr);
                fxn.setShape(0);
                fxn.setCornerRadius(com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.dgx, this.mvp.ckl()));
                return fxn;
            } catch (Exception unused2) {
                Drawable mutilBackgroundDrawable = getMutilBackgroundDrawable();
                if (mutilBackgroundDrawable != null) {
                    return mutilBackgroundDrawable;
                }
            }
        }
        GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        float fxn2 = com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.dgx, this.mvp.ckl());
        drawable.setCornerRadius(fxn2);
        if (fxn2 < 1.0f) {
            float fxn3 = com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.dgx, this.mvp.ax());
            float fxn4 = com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.dgx, this.mvp.ci());
            float fxn5 = com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.dgx, this.mvp.rz());
            float fxn6 = com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.dgx, this.mvp.ils());
            float[] fArr = new float[8];
            if (fxn3 > 0.0f) {
                fArr[0] = fxn3;
                fArr[1] = fxn3;
            }
            if (fxn4 > 0.0f) {
                fArr[2] = fxn4;
                fArr[3] = fxn4;
            }
            if (fxn5 > 0.0f) {
                fArr[4] = fxn5;
                fArr[5] = fxn5;
            }
            if (fxn6 > 0.0f) {
                fArr[6] = fxn6;
                fArr[7] = fxn6;
            }
            drawable.setCornerRadii(fArr);
        }
        if (z) {
            zn = Color.parseColor(str);
        } else {
            zn = this.mvp.zn();
        }
        drawable.setColor(zn);
        if (this.mvp.rmu() > 0.0f) {
            drawable.setStroke((int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.dgx, this.mvp.rmu()), this.mvp.xdg());
        } else if (this.mvp.je() > 0) {
            drawable.setStroke(this.mvp.je(), this.mvp.xdg());
            drawable.setAlpha(50);
            if (TextUtils.equals(this.rlu.hie().kg(), "video-vd")) {
                setLayerType(1, null);
                return new ud((int) fxn2, this.mvp.je());
            }
        }
        return drawable;
    }

    protected kg fxn(Bitmap bitmap) {
        return new fxn(bitmap, null);
    }

    protected Drawable getMutilBackgroundDrawable() {
        try {
            return new LayerDrawable(fxn(kg(this.mvp.yws().replaceAll("/\\*.*\\*/", ""))));
        } catch (Exception unused) {
            return null;
        }
    }

    private Drawable[] fxn(List<String> list) {
        Drawable[] drawableArr = new Drawable[list.size()];
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.contains("linear-gradient")) {
                String[] split = str.substring(str.indexOf(Separators.LPAREN) + 1, str.length() - 1).split(", ");
                int length = split.length - 1;
                int[] iArr = new int[length];
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i2 + 1;
                    iArr[i2] = com.bytedance.sdk.component.adexpress.dynamic.hm.sg.fxn(split[i3].substring(0, 7));
                    i2 = i3;
                }
                GradientDrawable fxn = fxn(fxn(split[0]), iArr);
                fxn.setShape(0);
                fxn.setCornerRadius(com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.dgx, this.mvp.ckl()));
                drawableArr[(list.size() - 1) - i] = fxn;
            }
        }
        return drawableArr;
    }

    private List<String> kg(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (str.charAt(i3) == '(') {
                i++;
                z = true;
            } else if (str.charAt(i3) == ')' && i - 1 == 0 && z) {
                int i4 = i3 + 1;
                arrayList.add(str.substring(i2, i4));
                i2 = i4;
                z = false;
            }
        }
        return arrayList;
    }

    protected GradientDrawable getDrawable() {
        return new GradientDrawable();
    }

    protected GradientDrawable fxn(GradientDrawable.Orientation orientation, int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return new GradientDrawable();
        }
        if (iArr.length == 1) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(iArr[0]);
            return gradientDrawable;
        }
        return new GradientDrawable(orientation, iArr);
    }

    protected GradientDrawable.Orientation fxn(String str) {
        try {
            int parseFloat = (int) Float.parseFloat(str.substring(0, str.length() - 3));
            if (parseFloat <= 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (parseFloat <= 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (parseFloat <= 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.je.fxn(canvas, this, this);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.gff gffVar = this.je;
        View view = this.ckl;
        if (view == null) {
            view = this;
        }
        gffVar.fxn(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        sg();
        fxn();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        kg();
        super.onDetachedFromWindow();
    }

    public void sg() {
        if (tw()) {
            return;
        }
        View view = this.ckl;
        if (view == null) {
            view = this;
        }
        this.rmu = new com.bytedance.sdk.component.adexpress.dynamic.animation.fxn.kg(view, this.rlu.hie().rb().jt());
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rb.1
            @Override // java.lang.Runnable
            public void run() {
                if (rb.this.rmu != null) {
                    rb.this.rmu.fxn();
                }
            }
        });
    }

    public void kg() {
        com.bytedance.sdk.component.adexpress.dynamic.animation.fxn.kg kgVar = this.rmu;
        if (kgVar != null) {
            kgVar.kg();
        }
    }

    protected boolean tw() {
        com.bytedance.sdk.component.adexpress.dynamic.hm.tw twVar = this.rlu;
        return twVar == null || twVar.hie() == null || this.rlu.hie().rb() == null || this.rlu.hie().rb().jt() == null;
    }

    public int getDynamicWidth() {
        return this.f9321sg;
    }

    public int getDynamicHeight() {
        return this.tw;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.hm.bh getDynamicLayoutBrickValue() {
        com.bytedance.sdk.component.adexpress.dynamic.hm.rb hie;
        com.bytedance.sdk.component.adexpress.dynamic.hm.tw twVar = this.rlu;
        if (twVar == null || (hie = twVar.hie()) == null) {
            return null;
        }
        return hie.rb();
    }

    private void fxn() {
        if (isShown()) {
            int fxn = com.bytedance.sdk.component.adexpress.dynamic.kg.fxn.fxn(this.mvp);
            if (fxn == 2) {
                if (this.ums == null) {
                    this.ums = new com.bytedance.sdk.component.utils.bx(getContext().getApplicationContext(), 1);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rb.4
                };
                com.bytedance.sdk.component.adexpress.kg.rlu renderRequest = this.zu.getRenderRequest();
                if (renderRequest != null) {
                    renderRequest.ckl();
                    renderRequest.ums();
                    renderRequest.ud();
                    return;
                }
                return;
            }
            if (fxn == 3) {
                if (this.ums == null) {
                    this.ums = new com.bytedance.sdk.component.utils.bx(getContext().getApplicationContext(), 2);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rb.5
                };
                com.bytedance.sdk.component.adexpress.kg.rlu renderRequest2 = this.zu.getRenderRequest();
                if (renderRequest2 != null) {
                    renderRequest2.rmu();
                    renderRequest2.iwp();
                    renderRequest2.je();
                    renderRequest2.dx();
                }
            }
        }
    }
}
