package com.bytedance.sdk.component.adexpress.dynamic.gff;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.bh.ke;
import com.wakeup.common.utils.AdvConstance;

/* loaded from: classes13.dex */
public class jq extends FrameLayout implements tw {
    private String bh;
    private com.bytedance.sdk.component.adexpress.dynamic.hm.hie dgx;
    private Context fxn;
    private com.bytedance.sdk.component.adexpress.dynamic.hm.sg gff;
    private boolean hie;
    private View hm;
    private int jq;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rb kg;
    private com.bytedance.sdk.component.adexpress.kg.rlu mvp;
    private sg rb;

    /* renamed from: sg, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.bh.je f9330sg;
    private View.OnTouchListener tw;

    public jq(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rb rbVar, com.bytedance.sdk.component.adexpress.dynamic.hm.sg sgVar) {
        super(context);
        this.fxn = context;
        this.kg = rbVar;
        this.gff = sgVar;
        sg();
    }

    public jq(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rb rbVar, com.bytedance.sdk.component.adexpress.dynamic.hm.sg sgVar, com.bytedance.sdk.component.adexpress.dynamic.hm.hie hieVar, com.bytedance.sdk.component.adexpress.kg.rlu rluVar) {
        super(context);
        this.fxn = context;
        this.kg = rbVar;
        this.gff = sgVar;
        this.dgx = hieVar;
        this.mvp = rluVar;
        sg();
    }

    private void sg() {
        setBackgroundColor(0);
        setClipChildren(false);
        setClipToPadding(false);
        this.bh = this.gff.ei();
        this.jq = this.gff.deg();
        this.hie = this.gff.ln();
        sg fxn = hie.fxn(this.fxn, this.kg, this.gff, this.dgx, this.mvp);
        this.rb = fxn;
        if (fxn != null) {
            this.hm = fxn.gff();
            if (this.gff.kee()) {
                setBackgroundColor(Color.parseColor("#50000000"));
            }
            if (TextUtils.equals(this.bh, "6")) {
                if (this.gff.kwn() && !TextUtils.isEmpty(this.gff.hb())) {
                    this.f9330sg = new com.bytedance.sdk.component.adexpress.bh.je(this.fxn, com.bytedance.sdk.component.adexpress.dynamic.hm.sg.fxn(this.gff.hb()));
                } else {
                    this.f9330sg = new com.bytedance.sdk.component.adexpress.bh.je(this.fxn, Color.parseColor("#99000000"));
                }
                FrameLayout frameLayout = new FrameLayout(this.fxn);
                frameLayout.addView(this.f9330sg, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setClipChildren(true);
                addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.gff.jq.1
                    @Override // java.lang.Runnable
                    public void run() {
                        jq.this.f9330sg.kg();
                    }
                });
            }
            if (fxn(this.bh) && com.bytedance.sdk.component.adexpress.hm.kg()) {
                int parseColor = Color.parseColor("#99000000");
                if (this.gff.kwn() && !TextUtils.isEmpty(this.gff.hb())) {
                    try {
                        parseColor = com.bytedance.sdk.component.adexpress.dynamic.hm.sg.fxn(this.gff.hb());
                    } catch (Exception unused) {
                    }
                }
                View view = new View(this.fxn);
                view.setBackgroundColor(parseColor);
                addView(view, new FrameLayout.LayoutParams(-1, -1));
            }
            addView(this.rb.gff());
            fxn(this.rb.gff());
            setVisibility(0);
        }
    }

    private boolean fxn(String str) {
        return TextUtils.equals(str, "24") || TextUtils.equals(str, "23") || TextUtils.equals(str, "25") || TextUtils.equals(str, "22") || TextUtils.equals(str, "1");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.tw instanceof com.bytedance.sdk.component.adexpress.dynamic.gff.fxn.gff) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private void fxn(ViewGroup viewGroup) {
        if (this.hm == null) {
            return;
        }
        String str = this.bh;
        str.hashCode();
        switch (str) {
            case "0":
                this.tw = new com.bytedance.sdk.component.adexpress.dynamic.gff.fxn.rb(this, this.jq);
                setBackgroundColor(Color.parseColor("#80000000"));
                break;
            case "1":
            case "6":
                if (!this.gff.kwn() || TextUtils.isEmpty(this.gff.hb())) {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.tw = new com.bytedance.sdk.component.adexpress.dynamic.gff.fxn.bh(this);
                break;
            case "2":
            case "7":
                setBackgroundColor(Color.parseColor("#80000000"));
                this.tw = new com.bytedance.sdk.component.adexpress.dynamic.gff.fxn.kg(this, this);
                break;
            case "5":
                if (this.gff.kwn() && !TextUtils.isEmpty(this.gff.hb())) {
                    setBackgroundColor(com.bytedance.sdk.component.adexpress.dynamic.hm.sg.fxn(this.gff.hb()));
                } else {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.tw = new com.bytedance.sdk.component.adexpress.dynamic.gff.fxn.gff(this);
                this.hm.setTag(2);
                break;
            case "8":
            case "11":
                this.kg.setClipChildren(false);
                this.kg.setClipChildren(false);
                ViewGroup viewGroup2 = (ViewGroup) this.kg.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                this.tw = new com.bytedance.sdk.component.adexpress.dynamic.gff.fxn.bh(this);
                break;
            case "9":
            case "17":
                this.hm.setTag(2);
                break;
            case "10":
                this.tw = new com.bytedance.sdk.component.adexpress.dynamic.gff.fxn.hm(this, this.jq, this.hie);
                break;
            case "12":
                this.tw = new com.bytedance.sdk.component.adexpress.dynamic.gff.fxn.gff(this);
                this.hm.setTag(2);
                break;
            case "13":
            case "24":
                if (this.bh.equals("24") && com.bytedance.sdk.component.adexpress.hm.kg()) {
                    this.kg.setClipChildren(false);
                    this.tw = new com.bytedance.sdk.component.adexpress.dynamic.gff.fxn.bh(this);
                    break;
                } else {
                    this.tw = new com.bytedance.sdk.component.adexpress.dynamic.gff.fxn.rb(this, this.jq);
                    break;
                }
            case "14":
                this.tw = new com.bytedance.sdk.component.adexpress.dynamic.gff.fxn.kg(this, this);
                break;
            case "16":
                View view = this.hm;
                if (view != null && (view instanceof com.bytedance.sdk.component.adexpress.bh.ud) && ((com.bytedance.sdk.component.adexpress.bh.ud) view).getShakeLayout() != null) {
                    ((com.bytedance.sdk.component.adexpress.bh.ud) this.hm).getShakeLayout().setTag(2);
                }
                this.hm.setTag(2);
                break;
            case "18":
                View view2 = this.hm;
                if (view2 != null && (view2 instanceof ke) && ((ke) view2).getWriggleLayout() != null) {
                    ((ke) this.hm).getWriggleLayout().setTag(2);
                }
                this.hm.setTag(2);
                break;
            case "20":
                this.tw = new com.bytedance.sdk.component.adexpress.dynamic.gff.fxn.fxn(this, this.jq, viewGroup);
                break;
            case "22":
                if (com.bytedance.sdk.component.adexpress.hm.kg()) {
                    this.tw = new com.bytedance.sdk.component.adexpress.dynamic.gff.fxn.tw(this, this.hie);
                    break;
                } else {
                    this.tw = new com.bytedance.sdk.component.adexpress.dynamic.gff.fxn.sg(this, this.jq, viewGroup);
                    break;
                }
            case "23":
                if (com.bytedance.sdk.component.adexpress.hm.kg()) {
                    this.tw = new com.bytedance.sdk.component.adexpress.dynamic.gff.fxn.bh(this);
                    break;
                }
                break;
            case "25":
                if (com.bytedance.sdk.component.adexpress.hm.kg()) {
                    this.tw = new com.bytedance.sdk.component.adexpress.dynamic.gff.fxn.tw(this, this.hie);
                    break;
                }
                break;
            case "29":
                View view3 = this.hm;
                if (view3 != null && (view3 instanceof com.bytedance.sdk.component.adexpress.bh.bh) && ((com.bytedance.sdk.component.adexpress.bh.bh) view3).getShakeView() != null) {
                    ((com.bytedance.sdk.component.adexpress.bh.bh) this.hm).getShakeView().setTag(2);
                }
                this.tw = new com.bytedance.sdk.component.adexpress.dynamic.gff.fxn.rb(this, this.jq);
                break;
        }
        View.OnTouchListener onTouchListener = this.tw;
        if (onTouchListener != null) {
            setOnTouchListener(onTouchListener);
        }
        if (tw()) {
            this.hm.setTag(2);
            setOnClickListener((View.OnClickListener) this.kg.getDynamicClickListener());
        }
    }

    private boolean tw() {
        return (this.gff.ln() || TextUtils.equals("9", this.bh) || TextUtils.equals("16", this.bh) || TextUtils.equals("17", this.bh) || TextUtils.equals("18", this.bh) || TextUtils.equals(AdvConstance.MINE_PAGE, this.bh) || TextUtils.equals(AdvConstance.HEALTH_HOME, this.bh) || TextUtils.equals("10", this.bh)) ? false : true;
    }

    public void gff() {
        sg sgVar = this.rb;
        if (sgVar != null) {
            sgVar.fxn();
        }
    }

    public void hm() {
        sg sgVar = this.rb;
        if (sgVar != null) {
            sgVar.kg();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            sg sgVar = this.rb;
            if (sgVar != null) {
                sgVar.kg();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void rb() {
        if (this.hm != null && TextUtils.equals(this.bh, "2")) {
            View view = this.hm;
            if (view instanceof com.bytedance.sdk.component.adexpress.bh.gff) {
                ((com.bytedance.sdk.component.adexpress.bh.gff) view).gff();
            }
        }
    }

    public void bh() {
        if (this.hm != null && TextUtils.equals(this.bh, "2")) {
            View view = this.hm;
            if (view instanceof com.bytedance.sdk.component.adexpress.bh.gff) {
                ((com.bytedance.sdk.component.adexpress.bh.gff) view).hm();
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gff.tw
    public void fxn() {
        if (TextUtils.equals(this.bh, "6")) {
            com.bytedance.sdk.component.adexpress.bh.je jeVar = this.f9330sg;
            if (jeVar != null) {
                jeVar.gff();
                postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.gff.jq.2
                    @Override // java.lang.Runnable
                    public void run() {
                        jq.this.jq();
                    }
                }, 300L);
                return;
            }
            return;
        }
        if (TextUtils.equals(this.bh, AdvConstance.MINE_PAGE)) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.gff.jq.3
                @Override // java.lang.Runnable
                public void run() {
                    jq.this.jq();
                }
            }, 400L);
        } else {
            jq();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gff.tw
    public void kg() {
        if (tw()) {
            setOnClickListener((View.OnClickListener) this.kg.getDynamicClickListener());
            performClick();
            if (this.gff.mcr()) {
                return;
            }
            setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jq() {
        if (this.tw != null) {
            setOnClickListener((View.OnClickListener) this.kg.getDynamicClickListener());
            performClick();
            if (this.gff.mcr()) {
                return;
            }
            setVisibility(8);
        }
    }
}
