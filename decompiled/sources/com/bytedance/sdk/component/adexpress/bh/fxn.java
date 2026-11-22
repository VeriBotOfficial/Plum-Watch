package com.bytedance.sdk.component.adexpress.bh;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.bytedance.sdk.component.utils.mve;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class fxn extends TextSwitcher implements ViewSwitcher.ViewFactory, mve.fxn {
    private TextView bh;
    private int dgx;
    Animation.AnimationListener fxn;
    private int gff;
    private int hie;
    private final int hm;
    private float jq;
    private List<String> kg;
    private int mvp;
    private Context rb;
    private int rlu;

    /* renamed from: sg, reason: collision with root package name */
    private int f9309sg;
    private int tw;
    private Handler zu;

    public fxn(Context context, int i, float f, int i2, int i3) {
        super(context);
        this.kg = new ArrayList();
        this.gff = 0;
        this.hm = 1;
        this.zu = new mve(Looper.getMainLooper(), this);
        this.fxn = new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.bh.fxn.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (fxn.this.bh != null) {
                    fxn.this.bh.setText("");
                }
            }
        };
        this.rb = context;
        this.tw = i;
        this.jq = f;
        this.hie = i2;
        this.rlu = i3;
        gff();
    }

    private void gff() {
        setFactory(this);
    }

    public void setAnimationType(int i) {
        this.mvp = i;
    }

    public void setAnimationDuration(int i) {
        this.f9309sg = i;
    }

    public void fxn() {
        int i = this.mvp;
        if (i == 1) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.jz.jq(this.rb, "tt_text_animation_y_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.jz.jq(this.rb, "tt_text_animation_y_out"));
        } else if (i == 0) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.jz.jq(this.rb, "tt_text_animation_x_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.jz.jq(this.rb, "tt_text_animation_x_in"));
            getInAnimation().setInterpolator(new LinearInterpolator());
            getOutAnimation().setInterpolator(new LinearInterpolator());
            getInAnimation().setAnimationListener(this.fxn);
            getOutAnimation().setAnimationListener(this.fxn);
        }
        this.zu.sendEmptyMessage(1);
    }

    public void setAnimationText(List<String> list) {
        this.kg = list;
    }

    public void kg() {
        List<String> list = this.kg;
        if (list == null || list.size() <= 0) {
            return;
        }
        int i = this.gff;
        this.gff = i + 1;
        this.dgx = i;
        setText(this.kg.get(i));
        if (this.gff > this.kg.size() - 1) {
            this.gff = 0;
        }
    }

    public void setTextColor(int i) {
        this.tw = i;
    }

    public void setTextSize(float f) {
        this.jq = f;
    }

    public void setMaxLines(int i) {
        this.hie = i;
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(getContext());
        this.bh = textView;
        textView.setTextColor(this.tw);
        this.bh.setTextSize(this.jq);
        this.bh.setMaxLines(this.hie);
        this.bh.setTextAlignment(this.rlu);
        return this.bh;
    }

    @Override // com.bytedance.sdk.component.utils.mve.fxn
    public void fxn(Message message) {
        if (message.what != 1) {
            return;
        }
        kg();
        this.zu.sendEmptyMessageDelayed(1, this.f9309sg);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(com.bytedance.sdk.component.adexpress.dynamic.rb.dgx.kg(this.kg.get(this.dgx), this.jq, false)[0], 1073741824), i);
        } catch (Exception unused) {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.zu.removeMessages(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.zu.sendEmptyMessageDelayed(1, this.f9309sg);
    }
}
